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
    public void addFile() {

    }

    @Override
    public void download() {

    }

    @Override
    public State getState() {
        return currentState;
    }

    @Override
    public void restartMovie() {

    }

    @Override
    public void setCurrentState(State state) {
        this.currentState= state;
    }


    @Override
    public void turnOn() {
        // no implementation
    }

    @Override
    public void turnOff() {
        context_on.turnOff();
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
