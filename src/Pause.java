public class Pause implements WatchState {

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
        context.pauseChoosed = false;
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
        context.setCurrentState(context.getIdle_state());
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
        if (!context.pauseChoosed)
            resume();
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
    public int getDownloadStatus() {
        return 0;
    }

    @Override
    public void turnOn() {
        //no imple.
    }

    @Override
    public void turnOff() {
        //
    }

    @Override
    public String toString() {
        return "Pause";
    }

    @Override
    public void watch() {

    }
}
