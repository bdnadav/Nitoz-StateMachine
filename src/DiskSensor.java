public class DiskSensor implements State{
    private DiskRegion DiskRegion;
    private int diskSize;

    public DiskSensor(int diskSize,DiskRegion DiskRegion ) {
        this.DiskRegion= DiskRegion;
        this.diskSize= diskSize;
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
    public void internetOn() {
    }

    @Override
    public void internetOff() {
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
    public void setCurrentState(State state) {

    }


    @Override
    public void turnOn() {
        //no implementation
    }

    @Override
    public void turnOff() {
        DiskRegion.turnOff();
    }


}
