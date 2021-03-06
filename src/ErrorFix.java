public class ErrorFix implements State, DownloadState {

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
        downloadRegion.setFileReq(false);
        downloadRegion.setDownSize(0);
        downloadRegion.setFileSize(0);
        downloadRegion.status = 0;
        downloadRegion.context_on.resetTimers();
        downloadRegion.context_on.getDiskRegiState().freeSpace(downloadRegion.getFileSize());
        downloadRegion.setCurDownloadState(downloadRegion.getDownloadIdle());

    }

    @Override
    public void turnOff() {
    }

    @Override
    public void errorNotFixed() {
        downloadAborted();
    }

    @Override
    public String toString() {
        return "errorFix";
    }


    @Override
    public void turnOn() {

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
    public double checkSpeed() {
        return 0.0;
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
    public void cancelReq() {

    }
}
