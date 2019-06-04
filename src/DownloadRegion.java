public class DownloadRegion implements State {

    protected static int downSize;
    protected int status ;
    private double fileSize = 0 ;
    private boolean fileReq ; // tells if there is a file reqested in the system

    protected DownloadState curDownloadState;
    protected DownloadState downloadIdle;
    protected DownloadState downloading;
    protected DownloadState errorFix;
    protected DownloadState waitingToConnect;
    protected DownloadState noSpace;
    protected On context_on;
    protected On State;

    public DownloadRegion(On on) {
        fileReq = false ;
        downSize = 0 ;
        fileSize = 0 ;
        status = 0 ;
        waitingToConnect= new WaitingToConnect(this);
        downloading= new Downloading(this);
        downloadIdle= new DownloadIdle(this);
        errorFix= new ErrorFix(this);
        noSpace= new NoSpace(this);
        context_on = on;
        curDownloadState = waitingToConnect;
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
    public void downloadAborted() {

    }

    @Override
    public void errorFixed() {

    }

    @Override
    public void downloadError() {

    }

    @Override
    public void fileRequest(double fileSize) {
        curDownloadState.fileRequest(fileSize);// cur= noSpace

    }

    @Override
    public void addFile() {

    }

    @Override
    public void download() {

    }

    public void addFile(double size) {
        fileReq = true;
        fileSize = size;
    }


    public void updateDownload(double size) {
        downSize+=size ;
        status = (int)((downSize / fileSize) * 100) ;

        //curDownloadState.download();
    }



    @Override
    public void restartMovie() {

    }

    @Override
    public void setCurrentState(State State) {

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


    public void setCurDownloadState(DownloadState curDownloadState) {
        this.curDownloadState = curDownloadState;
    }


    public static int getDownSize() {
        return downSize;
    }

    public static void setDownSize(int downSize) {
        DownloadRegion.downSize = downSize;
    }

    public DownloadState getDownloadIdle() {
        return downloadIdle;
    }



    public DownloadState getDownloading() {
        return downloading;
    }


    public DownloadState getErrorFix() {
        return errorFix;
    }

    public DownloadState getState() {
        return curDownloadState;
    }

    public void setState(On State) {
        this.context_on = State;
    }


    protected void moveState() {
    }

    public void cancelReq() {
        //delete file and retrun to Idle
        //reset all
        downSize = 0 ;
        fileReq = false ;
        fileSize = 0 ;
        status = 0 ;
        curDownloadState = downloadIdle ;
    }

    public double getFileSize() {
        return fileSize;
    }

    public DownloadState getNoSpace() {
        return noSpace;
    }

    public DownloadState getWaitingToConnect() {
        return  waitingToConnect ;
    }
}
