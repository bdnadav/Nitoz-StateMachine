public class WatchRegion implements WatchState {
    private WatchState currentState;
    private WatchState idle_state;
    private WatchState watch_state;
    private WatchState pause_state;
    boolean pauseChoosed = false;


    On context_on;
    int time;

    public WatchState getCurrentState() {
        return currentState;
    }

    public WatchState getIdle_state() {
        return idle_state;
    }

    public WatchState getPause_state() {
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
        currentState.internetOn();

    }

    @Override
    public void internetOff() {
        currentState.internetOff();
    }

    @Override
    public void finished() {
        setCurrentState(idle_state);
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
    public WatchState getState() {
        return this.currentState;
    }

    @Override
    public void addFile(double size) {

    }

    @Override
    public void restartMovie() {
        time = 0;
    }

    @Override
    public void setCurrentState(State state) {
        if (state != this.currentState) {
            System.out.println("exit " + currentState.toString() + " state");
            System.out.println("enter " + state.toString() + " state");
            context_on.getContext().writeToLog("exit " + currentState.toString() + " state");
            context_on.getContext().writeToLog("enter " + state.toString() + " state");
        }
        this.currentState= (WatchState)state;
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
    public void watch() {
        time += 1 ;
        System.out.println("Playing Movie time (sec): " + time );
    }


    @Override
    public void turnOn() {

        idle_state = new WatchIdle(this);
        watch_state = new Watch(this);
        pause_state = new Pause(this);
        this.currentState = idle_state;
        System.out.println("enter "+ currentState.toString() +" state");
        context_on.getContext().writeToLog("enter "+ currentState.toString() +" state");
    }

    @Override
    public void turnOff() {
        context_on.getContext().writeToLog("exit"+ currentState.toString() +"state");
        System.out.println("exit "+ currentState.toString() +" state");
    }

    public WatchState getWatchState() {
        return watch_state;
    }
}
