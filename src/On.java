public class On implements OnState {
    private System system;

    private WatchRegion watchRegion;
    private DiskRegion diskRegion;
    private UserRegion userRegion;
    private NetworkRegion networkRegion;
    private DownloadRegion downloadRegion;


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
}
