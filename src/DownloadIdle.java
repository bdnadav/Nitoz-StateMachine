public class DownloadIdle implements DownloadState {

    private DownloadRegion downloadRegion;

    public DownloadIdle(DownloadRegion downloadRegion) {
        super();
        this.downloadRegion = downloadRegion;
    }

    @Override
    public void download() {
        if (downloadRegion.context_on.getNetworkRegiState() instanceof Connected && downloadRegion.isFileReq()) {
            downloadRegion.context_on.getDiskRegiState().reduceFreeSpace(downloadRegion.getFileSize());
            downloadRegion.setCurDownloadState(downloadRegion.getDownloading());
            downloadRegion.context_on.points++;
        }
    }

    @Override
    public void fileRequest(double fileSize) {
        //downloadRegion.context_on.getNetworkRegiState() instanceof Connected
        if (downloadRegion.context_on.getNetworkRegiState() instanceof Connected && fileSize > downloadRegion.context_on.diskRegion.getFreeSpace()){ // --> noSpace
            downloadRegion.setCurDownloadState(downloadRegion.getNoSpace());
        }
        else if (downloadRegion.isFileReq()){ // there is already a file on system
        }
        else{ // legal file size && connected
            downloadRegion.setFileReq(true);
            downloadRegion.setFileSize(fileSize);
//            downloadRegion.setCurDownloadState(downloadRegion.downloading); // ??
            downloadRegion.context_on.download();
//            downloadRegion.setFileSize(fileSize);
//            downloadRegion.setCurDownloadState(downloadRegion.downloading); // ??
        }
    }

    @Override
    public void turnOff() {
    }

    @Override
    public String toString() {
        return "DownloadIdle";
    }




    @Override
    public void turnOn() {

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
    public void errorFixed() {

    }

    @Override
    public void downloadError() {

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

    }

    @Override
    public void setCurrentState(State state) {

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
    public void updateDownload(double speed) {

    }

    @Override
    public void errorNotFixed() {

    }

    @Override
    public void cancelReq() {

    }


}

