public class Connected implements OnState{

    NetworkRegion networkRegion;

    public Connected(NetworkRegion networkRegion){
        this.networkRegion= networkRegion;
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
        // empty method
    }

    @Override
    public void internetOff() {
        networkRegion.setCurNetState(networkRegion.getOffline());

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
    public void setState(OnState onState) {

    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {
    }
}
