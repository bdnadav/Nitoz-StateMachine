public class Pause implements State {

    WatchRegion context;

    public Pause(WatchRegion watchRegion) {
        context = watchRegion;
    }

    @Override
    public void finished() {
        context.setCurrentState(context.getIdle_state());
    }

    @Override
    public void resume() {
        context.setCurrentState(context.getWatchState());
    }
    @Override
    public void downloadAborted() {
        context.setCurrentState(context.getIdle_state());
    }


    // From here should not be implemented
    @Override
    public void movieOn() {

    }

    @Override
    public void movieOff() {

    }


    @Override
    public void holdMovie() {

    }

    @Override
    public double checkSpeed() {return 0.0;

    }

    @Override
    public void upRank() {

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
    public void setCurrentState(State State) {

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
