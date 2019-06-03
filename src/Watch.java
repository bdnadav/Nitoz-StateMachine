public class Watch implements OnState {
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
    public void checkSpeed() {
        if(play)
            context.time++;
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
    public void hold() {

    }

    @Override
    public void errorFixed() {

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
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }
}
