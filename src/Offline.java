public class Offline implements OnState {

    NetworkRegion networkRegion;

    public Offline(NetworkRegion networkRegion){
        networkRegion= networkRegion;
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
        networkRegion.setCurNetState(networkRegion.getConnected());
    }

    @Override
    public void internetOff() {
        // empty method
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
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }
}

