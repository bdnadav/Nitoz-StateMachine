public class NetworkRegion implements OnState, Runnable {

    private On context_on;
    private  OnState currentState;

    private  OnState Connected;
    private OnState offline;

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
    public OnState getState() {
        return null;
    }

    @Override
    public void setCurrentState(OnState onState) {

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

    public OnState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(OnState currentState) {
        this.currentState = currentState;
    }

    public OnState getConnected() {
        return Connected;
    }

    public void setConnected(OnState connected) {
        Connected = connected;
    }

    public OnState getOffline() {
        return offline;
    }

    public void setOffline(OnState offline) {
        this.offline = offline;
    }

}
