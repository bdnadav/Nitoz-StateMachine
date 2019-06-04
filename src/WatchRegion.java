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

    public State getPause_state() {
        return pause_state;
    }

    public int getTime() {
        return time;
    }

    public WatchRegion(On on) {
        context_on = on;
        idle_state = new WatchIdle(this);
        watch_state = new Watch(this);
        pause_state = new Pause(this);
        this.currentState = idle_state;
        System.out.println("enter"+ currentState.toString() +"state");
    }

    @Override
    public void movieOff() {
        currentState.movieOff();
    }

    @Override
    public void downloadAborted() {
        currentState.downloadAborted();
    }

    @Override
    public void movieOn() {
        currentState.movieOn();
    }


    @Override
    public void holdMovie() {
        currentState.holdMovie();
    }

    @Override
    public double checkSpeed() {return 0.0;

    }

    @Override
    public void upRank() {

    }

    @Override
    public void resume() {
        currentState.resume();

    }

    @Override
    public void downRank() {

    }

    @Override
    public void internetOn() {

    }

    @Override
    public void internetOff() {
        currentState.internetOff();
    }

    @Override
    public void finished() {
        currentState.movieOn();
    }


    @Override
    public void errorFixed() {
        currentState.errorFixed();
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
    public DownloadState getState() {
        return null;
    }

    @Override
    public void addFile(double size) {

    }

    @Override
    public void restartMovie() {
        currentState.restartMovie();
    }

    @Override
    public void setCurrentState(State state) {
        if (state != this.currentState) {
            System.out.println("enter" + currentState.toString() + "state");
            System.out.println("exit" + state.toString() + "state");
            context_on.getContext().writeToLog("enter" + currentState.toString() + "state");
            context_on.getContext().writeToLog("exit" + state.toString() + "state");
        }
        this.currentState= state;
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
        System.out.println("exit"+ currentState.toString() +"state");
        context_on.getContext().writeToLog("exit"+ currentState.toString() +"state");
    }

    public State getWatchState() {
        return watch_state;
    }
}
