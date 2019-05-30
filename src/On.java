public class On implements OnState {
    public int freeSpace;
    public int points;
    public int speed;
    public int status;

    private System system;

    public WatchRegion watchRegion;
    public DiskRegion diskRegion;
    public UserRegion userRegion;
    public NetworkRegion networkRegion;
    public DownloadRegion downloadRegion;
    public FilesQueueRegion filesQueueRegion;


    public On(System system) {
        this.system = system;
        watchRegion = new WatchRegion();
        diskRegion = new DiskRegion();
        userRegion = new UserRegion();
        networkRegion = new NetworkRegion();
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

    public OnState getDownloadRegionState(){
        return downloadRegion.getState();
    }
    public OnState getNetworkRegionState(){
        return networkRegion.getState();
    }
    public OnState getUserRegionState(){
        return userRegion.getState();
    }
    public OnState getDiskRegionState(){
        return diskRegion.getState();
    }
    public OnState getWatchRegionState(){
        return watchRegion.getState();
    }


    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

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
    public OnState getState() {
        return null;
    }

    @Override
    public void setState(OnState onState) {

    }
}
