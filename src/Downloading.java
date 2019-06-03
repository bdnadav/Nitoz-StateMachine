
public class Downloading implements DownloadState {

    private DownloadRegion downloadRegion;

    public Downloading(DownloadRegion downloadRegion) {
        super();
        this.downloadRegion = downloadRegion;
    }

    public void downloadAborted(){
        downloadRegion.context_on.points -= 1;
        downloadRegion.context_on.freeSpace += downloadRegion.getFileSize();
        downloadRegion.setCurDownloadState(downloadRegion.getDownloadIdle());
    }

    public void finished(){

    }

    public void downloadError(){
        downloadRegion.setCurDownloadState(downloadRegion.getErrorFix());
    }

    public void internetOff(){
        downloadRegion.setCurDownloadState(downloadRegion.getWaitingToConnect());
    }



    public void update() {
        downloadRegion.download();
    }

    public void idle () {

    }




    @Override
    public void fileRequest(int fileSize) {

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


    @Override
    public void movieOn() {

    }

    @Override
    public void holdMovie() {

    }

    @Override
    public double checkSpeed() {return 0.0;

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

    @Override
    public void updateDownload(double speed) {
        downloadRegion.updateDownload(speed);
    }

    @Override
    public void errorNotFixed() {

    }
}



