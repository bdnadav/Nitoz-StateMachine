public class DownloadRegion implements State, Runnable {

    protected static int downSize;
    //protected Thread download_region_thread;
    //protected boolean download_thread_running = true;


    protected State curDownloadState;
    protected State downloadIdle;
    protected State downloading;
    protected State errorFix;
    protected State waitingToConnect;
    protected State noSpace;
    protected On context_on;
    protected On State;
    protected boolean download_thread_running;
    protected Thread download_region_thread;
    protected Runnable downloadingState;


    public DownloadRegion(On on) {
        waitingToConnect= new WaitingToConnect(this);
        downloading= new Downloading(this);
        downloadIdle= new DownloadIdle(this);
        errorFix= new ErrorFix();
        noSpace= new NoSpace();
        context_on = on;
        curDownloadState = waitingToConnect;
    }

    public DownloadRegion() {

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
        curDownloadState.fileRequest();// cur= NoSpace

    }

    @Override
    public void addFile() {

    }

    @Override
    public void download() {
        curDownloadState.download();
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

    public State getCurDownloadState() {
        return curDownloadState;
    }

    public void setCurDownloadState(State curDownloadState) {
        this.curDownloadState = curDownloadState;
    }

    public static int getDownSize() {
        return downSize;
    }

    public static void setDownSize(int downSize) {
        DownloadRegion.downSize = downSize;
    }

    public State getDownloadIdle() {
        return downloadIdle;
    }

    public void setDownloadIdle(State downloadIdle) {
        this.downloadIdle = downloadIdle;
    }

    public State getDownloading() {
        return downloading;
    }

    public void setDownloading(State downloading) {
        this.downloading = downloading;
    }

    public State getErrorFix() {
        return errorFix;
    }

    public void setErrorFix(State errorFix) {
        this.errorFix = errorFix;
    }

    public State getWaitingToConnect() {
        return waitingToConnect;
    }

    public void setWaitingToConnect(State waitingToConnect) {
        this.waitingToConnect = waitingToConnect;
    }

    public State getNoSpace() {
        return noSpace;
    }

    public void setNoSpace(State noSpace) {
        this.noSpace = noSpace;
    }

    public On getState() {
        return context_on;
    }

    public void setState(On State) {
        this.context_on = State;
    }


    protected void moveState() {
    }
}
