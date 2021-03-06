public class WatchIdle implements WatchState{
    WatchRegion context_watch_region;

    public WatchIdle(WatchRegion watchRegion) {
        this.context_watch_region = watchRegion;
    }

    @Override
    public void movieOn() {
        if (context_watch_region.context_on.downloadRegion.getDownloadStatus() > 20 && context_watch_region.context_on.getNetworkRegiState() instanceof Connected){
            context_watch_region.restartMovie();
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
        context_watch_region.restartMovie();
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

    }

    @Override
    public void turnOff() {

    }

    @Override
    public String toString() {
        return "WatchIdle";
    }

    @Override
    public void watch() {

    }
}
