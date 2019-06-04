public class DiskSensor implements State {

    private DiskRegion diskRegion;


    public DiskSensor(int diskSize) {
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

    }

    @Override
    public void turnOff() {

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
