public class On implements State {
    public int points;

    private DownloadSystem context;

    public WatchRegion watchRegion;
    public DiskRegion diskRegion;
    public UserRegion userRegion;
    public NetworkRegion networkRegion;
    public DownloadRegion downloadRegion;
    private long lastTimeDownload; //last time download updated
    private long lastTimeError; //
    private long lastTimeSpace; //


    public On(DownloadSystem context, double diskSize) {
        this.context = context;
        watchRegion = new WatchRegion(this);
        diskRegion = new DiskRegion(this, diskSize);
        userRegion = new UserRegion(this);
        networkRegion = new NetworkRegion(this);
        downloadRegion = new DownloadRegion(this);
    }

    public void resetTimers(){
         lastTimeDownload = 0; //last time download updated
         lastTimeError = 0;
         lastTimeSpace = 0;
    }


    public State getDownloadRegiState(){
        return downloadRegion.getCurDownloadState();
    }
    public State getNetworkRegiState(){
        return networkRegion.getCurrentState();
    }
    public State getUserRegiState(){
        return userRegion.getCurrentState();
    }
    public State getDiskRegiState(){
        return diskRegion.getCurrentState();
    }
    public State getWatchRegiState(){
        return watchRegion.getState();
    }


    @Override
    public void turnOn() {
           watchRegion.turnOn();
            userRegion.turnOn();
         networkRegion.turnOn();
            diskRegion.turnOn();
        downloadRegion.turnOn();
        while(!(context.getCurrentState() instanceof Off)){ // Add playMove() (time++) operation?
                long currTime = System.currentTimeMillis();
            if ( currTime - lastTimeDownload >= 1000){
                downloadRegion.getState().updateDownload(userRegion.getSpeed());
                lastTimeDownload = currTime ;
            }
            if ( currTime - lastTimeError >= 3000){
                        downloadRegion.getState().errorNotFixed() ;
                        lastTimeError = currTime ;
            }
            if ( currTime - lastTimeSpace >= 4000){
                    downloadRegion.getState().cancelReq() ;
                    lastTimeSpace = currTime ;
            }

        }
        //handle status change if needed !!!
    }


    @Override
    public void turnOff() {
        context.setCurrentState(context.getOffState());
        watchRegion.turnOff();
        diskRegion.turnOff();
        userRegion.turnOff();
        networkRegion.turnOff();
        downloadRegion.turnOff();

    }

    @Override
    public void movieOff() {
        watchRegion.movieOff();
        diskRegion.movieOff();
        userRegion.movieOff();
        networkRegion.movieOff();
        downloadRegion.movieOff();

    }

    @Override
    public void downloadAborted() {
        watchRegion.downloadAborted();
        diskRegion.downloadAborted();
        userRegion.downloadAborted();
        networkRegion.downloadAborted();
        downloadRegion.downloadAborted();
    }

    @Override
    public void movieOn() {
        watchRegion.movieOn();

    }

    public DownloadSystem getContext() {
        return context;
    }

    public void setContext(DownloadSystem context) {
        this.context = context;
    }
    @Override
    public void holdMovie() {
        watchRegion.holdMovie();

    }

    @Override
    public double checkSpeed() {
        return userRegion.checkSpeed();
    }

    @Override
    public void upRank() {
        userRegion.upRank();
    }

    @Override
    public void resume() {
        watchRegion.resume();
    }

    @Override
    public void downRank() {
        userRegion.downRank();
    }

    @Override
    public void internetOn() {
         watchRegion.internetOn();
         diskRegion.internetOn();
         userRegion.internetOn();
         networkRegion.internetOn();
         downloadRegion.internetOn();
    }

    @Override
    public void internetOff() {
        watchRegion.internetOff();
        diskRegion.internetOff();
        userRegion.internetOff();
        networkRegion.internetOff();
        downloadRegion.internetOff();
    }

    @Override
    public void finished() {
        watchRegion.finished();
        downloadRegion.internetOn();
    }

    @Override
    public void errorFixed() {
        watchRegion.errorFixed();
        downloadRegion.errorFixed();
    }

    @Override
    public void downloadError() {
        downloadRegion.downloadError();
    }

    @Override
    public void fileRequest(double fileSize) {
        downloadRegion.fileRequest(fileSize);
    }


    @Override
    public void download() {
        downloadRegion.download();
        userRegion.download();
    }

    @Override
    public State getState() {
        return null;
    }

    @Override
    public void addFile(double size) {
        downloadRegion.addFile(size);

    }

    @Override
    public void restartMovie() {
        watchRegion.restartMovie();
    }

    @Override
    public void setCurrentState(State State) {

    }

    @Override
    public void checkSpace() {
        diskRegion.checkSpace();
        downloadRegion.checkSpace();
    }

    @Override
    public void freeSpace(double fileSize) {
        diskRegion.freeSpace(fileSize);
        downloadRegion.freeSpace(fileSize);
    }

    @Override
    public void reduceFreeSpace(double fileSize) {
        diskRegion.reduceFreeSpace(fileSize);
        downloadRegion.reduceFreeSpace(fileSize);
    }

    @Override
    public double getFreeSpace() {
        return diskRegion.getFreeSpace();
    }

    @Override
    public int getDownloadStatus() {
        return downloadRegion.getDownloadStatus();
    }

    @Override
    public String toString() {
        return "On";
    }
}
