public class NetworkRegion implements State {

    protected NetworkRegion networkRegion;

    private State currentState;
    private On context_on;

    private State Connected;
    private State offline;

    public NetworkRegion(On on) {
        this.context_on = on;
        Connected = new Connected(this);
        offline = new Offline(this);
        currentState = offline;
        //System.out.println("enter "+ currentState.toString() +" state");

    }

    @Override
    public void internetOn() {
        currentState.internetOn();
    }

    @Override
    public void internetOff() {
        currentState.internetOff();
    }


    @Override
    public void movieOff() {

    }

    @Override
    public void downloadAborted() {

    }

    @Override
    public void movieOn() {

    }

    @Override
    public void holdMovie() {

    }

    @Override
    public double checkSpeed() {
        return 0.0;
    }

    @Override
    public void upRank() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void downRank() {

    }


    @Override
    public void finished() {

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

    }

    @Override
    public State getState() {
        return null;
    }

    @Override
    public void addFile(double size) {

    }

    @Override
    public void restartMovie() {

    }

    @Override
    public void turnOn() {
//        Connected = new Connected(this);
////        offline = new Offline(this);
////        currentState = offline;
        System.out.println("enter "+ currentState.toString() +" state");
        context_on.getContext().writeToLog("enter "+ currentState.toString() +" state");
        //no implementation
    }

    @Override
    public void turnOff() {
        System.out.println("exit "+ currentState.toString() +" state");
    }

    public State getCurrentState() {
        return currentState;
    }

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

    public State getConnected() {
        return Connected;
    }

    public void setConnected(State connected) {
        Connected = connected;
    }

    public State getOffline() {
        return offline;
    }

    public void setOffline(State offline) {
        this.offline = offline;
    }

}
