import static java.lang.Thread.sleep;

class NoSpace implements DownloadState{

    DownloadRegion downloadRegion;

    public NoSpace(DownloadRegion downloadRegion) {
        this.downloadRegion = downloadRegion;
    }

    @Override
    public void turnOff() {
    }


    @Override
    public void movieOff() {

    }

    //  public void do() {
    // sleep(4000);
    //    downloadRegion.setCurDownloadState(downloadRegion.getDownloadIdle());
    // }

    @Override
    public String toString() {
        return "NoSpace";
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
    public void errorFixed() {

    }

    @Override
    public void downloadError() {

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
    public void updateDownload(double speed) {

    }

    @Override
    public void errorNotFixed() {

    }

    @Override
    public void cancelReq() {
            downloadRegion.cancelReq() ;
    }


}
