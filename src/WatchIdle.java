public class WatchIdle implements OnState{
    WatchRegion context_watch_region;

    public WatchIdle(WatchRegion watchRegion) {
        this.context_watch_region = watchRegion;
    }

    @Override
    public void movieOn() {
        if (context_watch_region.context_on.status > 20){
            context_watch_region.setCurrentState(context_watch_region.getWatchState());
            context_watch_region.getCurrentState().movieOn();
        }

    }


    // No need to implement all the next methods.
    @Override
    public void movieOff() {

    }

    @Override
    public void downloadAborted() {

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
    public void restartMovie() {

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