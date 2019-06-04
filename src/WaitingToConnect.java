import com.sun.corba.se.spi.orbutil.fsm.FSM;

public class WaitingToConnect implements DownloadState {

    DownloadRegion downloadRegion;

    public WaitingToConnect(DownloadRegion downloadRegion){
        this.downloadRegion= downloadRegion;
    }

    @Override
    public void internetOn() {
        downloadRegion.setCurDownloadState(downloadRegion.getDownloading());
    }

    @Override
    public void movieOff() {
        System.out.println("Exit from " + this.toString() + " state");
    }

    @Override
    public String toString() {
        return "DownloadIdle";
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
    public void internetOff() {

    }

    @Override
    public void finished() {

    }


    @Override
    public void errorFixed() {

    }

    @Override
    public void downloadError() {

    }

    @Override
    public void fileRequest(double fileSize) {

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

    }

    @Override
    public void turnOff() {

    }



    @Override
    public void updateDownload(double speed) {

    }

    @Override
    public void errorNotFixed() {

    }

    @Override
    public void cancelReq() {

    }
}
