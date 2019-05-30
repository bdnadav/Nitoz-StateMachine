public class NetworkRegion implements OnState, Runnable {

    public  OnState curNetState;

    public  OnState Connected;
    public  OnState offline;


    public NetworkRegion(){
        Connected= new Connected(this);
        offline= new Offline(this);

        curNetState= offline;
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
        curNetState.internetOn();
    }

    @Override
    public void internetOff() {
        curNetState.internetOff();
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
    public void run() {

    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    public OnState getCurNetState() {
        return curNetState;
    }

    public void setCurNetState(OnState curNetState) {
        this.curNetState = curNetState;
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
