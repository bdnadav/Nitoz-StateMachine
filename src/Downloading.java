
public class Downloading implements DownloadState {
    private DownloadRegion downloadRegion;

    public Downloading(DownloadRegion downloadRegion) {
        this.downloadRegion = downloadRegion;
    }

    public void downloadAborted(){
        downloadRegion.context_on.points--;
        downloadRegion.setFileReq(false);
        DownloadRegion.setDownSize(0);
        downloadRegion.setFileSize(0);
        downloadRegion.status = 0;
        downloadRegion.context_on.resetTimers();
        downloadRegion.context_on.getDiskRegiState().freeSpace(downloadRegion.getFileSize());
        downloadRegion.setCurDownloadState(downloadRegion.getDownloadIdle());
    }

    public void finished(){
        if (DownloadRegion.downSize >= downloadRegion.getFileSize()){
            downloadRegion.context_on.points++;
            downloadRegion.setFileReq(false);
            downloadRegion.setFileSize(0);
            downloadRegion.resetDownSize();
            downloadRegion.status = 0;
            downloadRegion.context_on.resetTimers();
            downloadRegion.setCurDownloadState(downloadRegion.downloadIdle);
            DownloadRegion.setDownSize(0);

        }
    }

    @Override
    public void updateDownload(double speed) {
        if (downloadRegion.getDownloadStatus() >= 100){
            downloadRegion.context_on.finished();
        }

        downloadRegion.updateDownload(speed);
    }

    @Override
    public void turnOff() {
    }


    public void downloadError(){
        downloadRegion.setCurDownloadState(downloadRegion.getErrorFix());
    }

    public void internetOff(){
        downloadRegion.setCurDownloadState(downloadRegion.getWaitingToConnect());
    }

    @Override
    public void errorFixed() {

//        downloadRegion.setCurDownloadState(downloadRegion.errorFix);
    }


    public void update() {
        downloadRegion.download();
    }

    public void idle () {

    }

    @Override
    public String toString() {
        return "Downloading";
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
    public void turnOn() {
        downloadRegion.setCurrentState(downloadRegion.waitingToConnect);
    }

    @Override
    public void movieOff() {

    }

    @Override
    public void errorNotFixed() {

    }

    @Override
    public void cancelReq() {

    }


}



