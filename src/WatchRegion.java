public class WatchRegion implements OnState, Runnable {
    private OnState currentState;
    private OnState idle_state;
    private OnState watch_state;
    private OnState pause_state;

    On context_on;
    int time;

    public OnState getCurrentState() {
        return currentState;
    }

    public OnState getIdle_state() {
        return idle_state;
    }

    public OnState getWatch_state() {
        return watch_state;
    }

    public OnState getPause_state() {
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

    public OnState getWatchState() {
        return watch_state;
    }
}
