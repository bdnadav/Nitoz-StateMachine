import static java.lang.Thread.sleep;

public class Downloading implements State {

    private DownloadRegion downloadRegion;

    public Downloading(DownloadRegion downloadRegion) {
        super();
        this.downloadRegion = downloadRegion;
    }

    public void update() {
        downloadRegion.download();
    }

    public void idle () {

    }

    public void internetOff(){

    }

    public void downloadError(){

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
    public void setCurrentState(State state) {

    }

    public void downloadAborted(){

    }

    @Override
    public void movieOn() {

    }

    @Override
    public void holdMovie() {

    }

    @Override
    public double checkSpeed() {
        return 0;
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

    public void finished(){

    }

    @Override
    public void hold() {

    }

    @Override
    public void errorFixed() {

    }


    public void run () {
//            while (downloadRegion.download_thread_running) {
//                try {
//                    sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                DownloadRegion.downSize += downloadRegion.State.speed;
//            }
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
}



