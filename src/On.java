public class On implements State {
    public int freeSpace;
    public int points;
    public int speed;
    public int status;


    private DownloadSystem context;

    public WatchRegion watchRegion;
    public DiskRegion diskRegion;
    public UserRegion userRegion;
    public NetworkRegion networkRegion;
    public DownloadRegion downloadRegion;
    public FilesQueueRegion filesQueueRegion;


    public On(DownloadSystem context) {
        this.context = context;
        watchRegion = new WatchRegion(this);
        diskRegion = new DiskRegion(100);
        userRegion = new UserRegion(this);
        networkRegion = new NetworkRegion(this);
        downloadRegion = new DownloadRegion(this);
        startRegions();
    }

    private void startRegions() {
        Thread watchThread = new Thread(watchRegion);
        Thread diskThread = new Thread(diskRegion);
        Thread userThread = new Thread(userRegion);
        Thread networkThread = new Thread(networkRegion);
        Thread downloadThread = new Thread(downloadRegion);
        watchThread.start();
        diskThread.start();
        userThread.start();
        networkThread.start();
        downloadThread.start();
    }

    public State getDownloadRegiState(){
        return downloadRegion.getState();
    }
    public State getNetworkRegiState(){
        return networkRegion.getState();
    }
    public State getUserRegiState(){
        return userRegion.getState();
    }
    public State getDiskRegiState(){
        return diskRegion.getState();
    }
    public State getWatchRegiState(){
        return watchRegion.getState();
    }


    @Override
    public void turnOn() {
        //not implement.
    }


    @Override
    public void turnOff() {
        context.setCurrentState(context.getOffState());
    }

    @Override
    public void movieOff() {
        downloadRegion.movieOff();
        diskRegion.movieOff();
    }

    @Override
    public void downloadAborted() {

    }

    @Override
    public void movieOn() {
        watchRegion.movieOn();

//        while(){
//            watchRegion.movieOn();
//
//
//
//
//        }

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

    }

    @Override
    public void hold() {

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
}
