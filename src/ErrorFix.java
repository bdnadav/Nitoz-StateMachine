public class ErrorFix implements State {

    private DownloadRegion downloadRegion;

    public ErrorFix(DownloadRegion downloadRegion) {
        super();
        this.downloadRegion = downloadRegion;
    }

    @Override
    public void errorFixed() {
        downloadRegion.setCurDownloadState(downloadRegion.getDownloading());
    }

    @Override
    public void downloadAborted() {
        downloadRegion.context_on.points -= 1;
        downloadRegion.context_on.freeSpace += downloadRegion.getFileSize();

    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void movieOff() {

    }



    @Override
    public void movieOn() {

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
    public void downloadError() {

    }

    @Override
    public void fileRequest(int fileSize) {

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
    public void setCurrentState(State state) {

    }
}
