
public class Downloading implements DownloadState {

    private DownloadRegion downloadRegion;

    public Downloading(DownloadRegion downloadRegion) {
        this.downloadRegion = downloadRegion;
    }

    public void downloadAborted(){
        downloadRegion.context_on.points -= 1;
        downloadRegion.context_on.getDiskRegiState().freeSpace(downloadRegion.getFileSize());
        downloadRegion.setCurDownloadState(downloadRegion.getDownloadIdle());
    }

    public void finished(){
        if (DownloadRegion.downSize == downloadRegion.getFileSize()){
            downloadRegion.setFileReq(false);
            downloadRegion.setFileSize(0);
            downloadRegion.setCurDownloadState(downloadRegion.downloadIdle);
        }

    }

    public void downloadError(){
        downloadRegion.setCurDownloadState(downloadRegion.getErrorFix());
    }

    public void internetOff(){

        downloadRegion.setCurDownloadState(downloadRegion.getWaitingToConnect());
    }

    @Override
    public void errorFixed() {
        downloadRegion.setCurDownloadState(downloadRegion.errorFix);
    }




    public void update() {
        downloadRegion.download();
    }

    public void idle () {

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

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void movieOff() {

    }

    @Override
    public void updateDownload(double speed) {

        downloadRegion.updateDownload(speed);
    }

    @Override
    public void errorNotFixed() {

    }

    @Override
    public void cancelReq() {

    }
}



