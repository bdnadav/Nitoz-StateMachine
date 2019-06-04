public class Watch implements State {

    WatchRegion context;
    boolean play;

    public Watch(WatchRegion watchRegion) {
        context = watchRegion;
        play=false;
    }

    @Override
    public void movieOff() {
        context.setCurrentState(context.getIdle_state());
    }

    @Override
    public void downloadAborted() {
        context.setCurrentState(context.getIdle_state());
    }

    @Override
    public void holdMovie() {
        context.setCurrentState(context.getPause_state());
    }

    @Override
    public void restartMovie() {
        context.time = 0;
    }

    @Override
    public void internetOff() {
        context.setCurrentState(context.getPause_state());
    }

    @Override
    public void downloadError() {
        context.setCurrentState(context.getPause_state());
    }

    public void playMovie(){
        play=true;
        context.time++;
    }

    @Override
    public void movieOn() {
        playMovie();
    }


    @Override
    public double checkSpeed() {
        if(play)
            context.time++;
        return  0 ;
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
    public void finished() {

    }


    @Override
    public void errorFixed() {

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

    @Override
    public String toString() {
        return " Watch ";
    }
}
