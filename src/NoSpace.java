import static java.lang.Thread.sleep;

class noSpace implements OnState{

    DownloadRegion downloadRegion;


    @Override
    public void movieOff() {

    }

  //  public void do() {
       // sleep(4000);
    //    downloadRegion.setCurDownloadState(downloadRegion.getDownloadIdle());
   // }


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
    public void setCurrentState(OnState onState) {

    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }
}
