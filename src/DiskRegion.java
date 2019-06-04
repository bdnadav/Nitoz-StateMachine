public class DiskRegion implements State {
    public double diskSize;
    public double freeSpace;
    protected On context_on;
    private State currentState;
    private State diskSensor;



    public DiskRegion(On on, double diskSize) {
        context_on = on;
        this.diskSize = diskSize;
        freeSpace = diskSize;
        diskSensor = new DiskSensor(this);
        currentState = diskSensor;
        System.out.println("enter"+ currentState.toString() +"state");

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
    public void setCurrentState(State state) {

    }

    @Override
    public void checkSpace() {

    }

    @Override
    public void freeSpace(double fileSize) {
        freeSpace += fileSize;
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
        System.out.println("exit"+ currentState.toString() +"state");

    }
}
