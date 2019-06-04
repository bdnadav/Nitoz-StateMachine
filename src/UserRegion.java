public class UserRegion implements State {

    private On context_on;

    private State beginner;
    private State progressive;
    private State pro;
    private State currentState;

    public int points;

    public UserRegion(On on) {
        context_on = on;
        beginner = new Beginner(this);
        progressive = new Progressive(this);
        pro = new Pro(this);
        this.currentState = beginner;
        //System.out.println("enter "+ currentState.toString() +" state");

    }


    @Override
    public void upRank() {
        currentState.upRank();
    }


    @Override
    public void downRank() {
        currentState.downRank();
    }

    @Override
    public double checkSpeed() {
        return currentState.checkSpeed();
    }

    public On getContext_on() {
        return context_on;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public void movieOff() {

    }

    @Override
    public void movieOn() {

    }

    @Override
    public void holdMovie() {

    }

    @Override
    public void resume() {

    }



    @Override
    public void internetOn() {

    }

    @Override
    public void internetOff() {

    }

    @Override
    public void finished() {

    }


    @Override
    public void downloadAborted() {

    }

    @Override
    public void errorFixed() {

    }

    @Override
    public void downloadError() {

    }

    @Override
    public void fileRequest(double fileSize) {

    }


    @Override
    public void download() {
        currentState.download();
    }

    @Override
    public State getState() {
        return currentState;
    }

    @Override
    public void addFile(double size) {

    }

    @Override
    public void restartMovie() {

    }

    @Override
    public void setCurrentState(State state) {
        if (state != this.currentState) {
            System.out.println("exit " + currentState.toString() + " state");
            System.out.println("enter " + state.toString() + " state");
            context_on.getContext().writeToLog("exit " + currentState.toString() + " state");
            context_on.getContext().writeToLog("enter " + state.toString() + " state");
        }
        this.currentState= state;
    }

    @Override
    public void checkSpace() {

    }

    @Override
    public void freeSpace(double fileSize) {

    }

    @Override
    public void reduceFreeSpace(double fileSize) {

    }

    @Override
    public double getFreeSpace() {
        return 0;
    }

    @Override
    public int getDownloadStatus() {
        return 0;
    }


    @Override
    public void turnOn() {
        beginner = new Beginner(this);
        progressive = new Progressive(this);
        pro = new Pro(this);
        this.currentState = beginner;
        System.out.println("enter "+ currentState.toString() +" state");
        context_on.getContext().writeToLog("enter "+ currentState.toString() +" state");
        // no implementation
    }

    @Override
    public void turnOff() {
        System.out.println("exit "+ currentState.toString() +" state");
    }

    public State getBeginner() {
        return beginner;
    }

    public void setBeginner(State beginner) {
        this.beginner = beginner;
    }

    public State getProgressive() {
        return progressive;
    }

    public void setProgressive(State progressive) {
        this.progressive = progressive;
    }

    public State getPro() {
        return pro;
    }

    public void setPro(State pro) {
        this.pro = pro;
    }

    public State getCurrentState() {
        return currentState;
    }

    public double getSpeed() {
        return currentState.getState().checkSpeed();
    }
}
