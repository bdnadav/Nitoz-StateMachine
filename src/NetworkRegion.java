public class NetworkRegion implements State, Runnable {

    private On context_on;
    private  State currentState;

    private  State Connected;
    private State offline;

    public NetworkRegion(On on) {
        context_on = on;
        Connected= new Connected(this);
        offline= new Offline(this);
        currentState = offline;
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
    public void checkSpeed() {

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
    public void internetOn() {
        currentState.internetOn();
    }

    @Override
    public void internetOff() {
        currentState.internetOff();
    }

    @Override
    public void finished() {

    }

    @Override
    public void hold() {

    }

    @Override
    public void errorFixed() {

    }

    @Override
    public void downloadError() {

    }

    @Override
    public void fileRequest() {

    }

    @Override
    public void addFile() {

    }

    @Override
    public void download() {

    }

    @Override
    public State getState() {
        return null;
    }

    @Override
    public void restartMovie() {

    }




    @Override
    public void run() {

    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
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
