public class DownloadIdle implements State {

    private DownloadRegion downloadRegion;

    public DownloadIdle(DownloadRegion downloadRegion) {
        super();
        this.downloadRegion = downloadRegion;
    }

    @Override
    public void download() {
        if (downloadRegion.context_on.getNetworkRegiState() instanceof Connected && downloadRegion.State.filesQueueRegion.getNumOfFiles() > 0) {
            downloadRegion.context_on.freeSpace -= downloadRegion.getFileSize();
            downloadRegion.setCurDownloadState(downloadRegion.getDownloading());
        }
    }

    @Override
    public void fileRequest(int fileSize) {
        if (fileSize > downloadRegion.context_on.freeSpace){
            downloadRegion.setCurDownloadState(downloadRegion.getNoSpace());
        }
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
    public void downloadAborted() {

    }

    @Override
    public void movieOn() {

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
    public void addFile() {

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


    public void run() {
        while (!downloadRegion.download_thread_running) {
        }
    }
}

