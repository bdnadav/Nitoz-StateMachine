public class DownloadRegion implements OnState, Runnable {

    protected static int downSize;
    //protected Thread download_region_thread;
    //protected boolean download_thread_running = true;


    protected OnState curDownloadState;
    protected OnState downloadIdle;
    protected OnState downloading;
    protected OnState errorFix;
    protected OnState waitingToConnect;
    protected OnState noSpace;
    protected On onState;


    public DownloadRegion() {
        waitingToConnect= new WaitingToConnect(this);
        downloading= new Downloading(this);
        downloadIdle= new DownloadIdle(this);
        errorFix= new ErrorFix();
        noSpace= new noSpace();
        curDownloadState= waitingToConnect;
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
        curDownloadState.internetOn();// cur= down

        while(curDownloadState instanceof Downloading){
           // curDownloadState.do();
        }

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
    public void downloadAborted() {

    }

    @Override
    public void errorFixed() {

    }

    @Override
    public void downloadError() {

    }

    @Override
    public void fileRequest() {
        curDownloadState.fileRequest();// cur= noSpace

    }

    @Override
    public void addFile() {

    }

    @Override
    public void download() {
        curDownloadState.download();
    }

    @Override
    public OnState getState() {
        return null;
    }

    @Override
    public void setState(OnState onState) {



    }

    @Override
    public void run() {

    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

/*    protected void moveState() {
        download_thread_running = true;
        download_region_thread.start();
    }*/

    public OnState getCurDownloadState() {
        return curDownloadState;
    }

    public void setCurDownloadState(OnState curDownloadState) {
        this.curDownloadState = curDownloadState;
    }

    public static int getDownSize() {
        return downSize;
    }

    public static void setDownSize(int downSize) {
        DownloadRegion.downSize = downSize;
    }

    public OnState getDownloadIdle() {
        return downloadIdle;
    }

    public void setDownloadIdle(OnState downloadIdle) {
        this.downloadIdle = downloadIdle;
    }

    public OnState getDownloading() {
        return downloading;
    }

    public void setDownloading(OnState downloading) {
        this.downloading = downloading;
    }

    public OnState getErrorFix() {
        return errorFix;
    }

    public void setErrorFix(OnState errorFix) {
        this.errorFix = errorFix;
    }

    public OnState getWaitingToConnect() {
        return waitingToConnect;
    }

    public void setWaitingToConnect(OnState waitingToConnect) {
        this.waitingToConnect = waitingToConnect;
    }

    public OnState getNoSpace() {
        return noSpace;
    }

    public void setNoSpace(OnState noSpace) {
        this.noSpace = noSpace;
    }

    public On getOnState() {
        return onState;
    }

    public void setOnState(On onState) {
        this.onState = onState;
    }


}
