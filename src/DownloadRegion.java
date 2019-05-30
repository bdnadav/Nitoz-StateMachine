public class DownloadRegion implements OnState, Runnable {

    protected static int downSize;
    protected Thread download_region_thread;
    protected boolean download_thread_running = true;

    protected DownloadIdle downloadIdleState;
    protected Downloading downloadingState;
    protected ErrorFix errorFixState;
    protected WaitingToConnect waitingToConnectState;
    protected NoSpace noSpaceState;



    protected On onState;
    protected DownloadRegion currentState;

    public DownloadRegion() {
    }

    public DownloadRegion(DownloadRegion regionState, On onState) {
        this.downloadIdleState = new DownloadIdle(this);
        this.downloadingState = new Downloading(this);
        this.errorFixState = new ErrorFix();
        this.waitingToConnectState = new WaitingToConnect();
        this.noSpaceState = new NoSpace();

        this.currentState = downloadingState;
        this.onState = onState;
        download_region_thread = new Thread(new DownloadIdle(this)) ;
        download_region_thread.start();
    }

    public DownloadRegion(DownloadRegion downloadRegion) {
        this.do = onState;
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

    }

    @Override
    public void addFile() {

    }

    @Override
    public void download() {
        currentState.download();
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
        while(){
            currentState.update();
        }

    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    protected void moveState() {
        download_thread_running = true;
        download_region_thread.start();
    }
}
