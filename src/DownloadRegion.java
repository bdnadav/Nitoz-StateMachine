public class DownloadRegion implements State {

    protected static double downSize;
    protected int status ;
    private double fileSize = 0 ;
    private boolean fileReq ; // tells if there is a file reqested in the system

    public boolean isFileReq() {
        return fileReq;
    }

    public void setFileReq(boolean fileReq) {
        this.fileReq = fileReq;
    }

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
        curDownloadState = downloadIdle;


    }
    public void cancelReq() {
        //delete file and retrun to Idle
        //reset all
        downSize = 0 ;
        fileReq = false ;
        fileSize = 0 ;
        status = 0 ;
        setCurDownloadState(downloadIdle);
    }

    @Override
    public void internetOn() {
        curDownloadState.internetOn();// cur= down

    }

    public void setCurDownloadState(DownloadState curDownloadState) {
        if (curDownloadState != this.curDownloadState) {
            System.out.println("exit " + this.curDownloadState.toString() + " state");
            System.out.println("enter " + curDownloadState.toString() + " state");
            context_on.getContext().writeToLog("exit " + this.curDownloadState.toString() + " state");
            context_on.getContext().writeToLog("enter " + curDownloadState.toString() + " state");
        }
        this.curDownloadState= (DownloadState) curDownloadState;
    }

    @Override
    public void setCurrentState(State state) {
        if (state != this.curDownloadState) {
            System.out.println("exit " + this.curDownloadState.toString() + " state");
            System.out.println("enter " + curDownloadState.toString() + " state");
            context_on.getContext().writeToLog("exit " + this.curDownloadState.toString() + " state");
            context_on.getContext().writeToLog("enter " + curDownloadState.toString() + " state");
        }
        this.curDownloadState= (DownloadState) state;
    }

    @Override
    public int getDownloadStatus() {
        return status;
    }


    @Override
    public void downloadAborted() {
        curDownloadState.downloadAborted();
    }


    @Override
    public void fileRequest(double fileSize) {
        curDownloadState.fileRequest(fileSize);// cur= noSpace

    }

    @Override
    public String toString() {
        return "DownloadRegion";
    }

    @Override
    public void internetOff() {
        curDownloadState.internetOff();
    }

    @Override
    public void finished() {
        curDownloadState.finished();
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
    public void errorFixed() {
        curDownloadState.errorFixed();
    }

    @Override
    public void downloadError() {
        curDownloadState.downloadError();

    }



    @Override
    public void download() {
        curDownloadState.download();
    }

    public void addFile(double size) {
        fileReq = true;
        fileSize = size;
    }


    public void updateDownload(double size) {
        downSize+=size;
        status = (int)((downSize / fileSize) * 100);
        if (downSize != downSize+ size && status <=100)
        System.out.println("File Downloaded :" + status + " %");


        //curDownloadState.download();
    }



    @Override
    public void restartMovie() {

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
        curDownloadState.turnOn();
        System.out.println("enter "+ curDownloadState.toString() +" state");
        context_on.getContext().writeToLog("enter "+ curDownloadState.toString() +" state");
    }

    @Override
    public void turnOff() {
        System.out.println("Exit from " + this.toString() + " state");
        context_on.getContext().writeToLog("Exit from " + this.toString() + " state");    }

    public State getCurDownloadState() {
        return curDownloadState;
    }





    public static double getDownSize() {
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


    public double getFileSize() {
        return fileSize;
    }

    public DownloadState getNoSpace() {
        return noSpace;
    }

    public DownloadState getWaitingToConnect() {
        return  waitingToConnect ;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public void resetDownSize() {
        downSize = 0;
    }
}
