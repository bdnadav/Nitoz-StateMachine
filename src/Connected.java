public class Connected implements State{

    NetworkRegion networkRegion;

    public Connected(NetworkRegion networkRegion){
        this.networkRegion = networkRegion;
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
        return 0;
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
        networkRegion.setCurrentState(networkRegion.getOffline());


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
    public void restartMovie() {

    }

    @Override
    public void setCurrentState(State state) {

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
    public void turnOn() {

    }

    @Override
    public void turnOff() {
    }
}
