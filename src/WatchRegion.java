public class WatchRegion implements State {
    private State currentState;
    private State idle_state;
    private State watch_state;
    private State pause_state;

    On context_on;
    int time;

    public State getCurrentState() {
        return currentState;
    }

    public State getIdle_state() {
        return idle_state;
    }

    public State getWatch_state() {
        return watch_state;
    }

    public State getPause_state() {
        return pause_state;
    }

    public On getContext_on() {
        return context_on;
    }

    public int getTime() {
        return time;
    }

    public WatchRegion(On on) {
        context_on = on;
        idle_state = new WatchIdle(this);
        watch_state= new Watch(this);
        pause_state= new Pause(this);
        this.currentState = idle_state;
    }


    @Override
    public void movieOff() {

    }

    @Override
    public void downloadAborted() {

    }

    @Override
    public void movieOn() {
        currentState.movieOn();
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
    public void fileRequest(double fileSize) {

    }

    @Override
    public void addFile() {

    }

    @Override
    public void download() {

    }

    @Override
    public DownloadState getState() {
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

    public State getWatchState() {
        return watch_state;
    }
}
