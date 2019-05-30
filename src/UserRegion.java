public class UserRegion implements OnState, Runnable {



    protected OnState beginner;
    protected OnState progressive;
    protected OnState pro;

    protected OnState onState;
    protected UserRegion currentState;

    public UserRegion(On onState, UserRegion currentState) {
        this.onState = onState;
        this.currentState = currentState;
        beginner = new Beginner(this);
        progressive = new Progressive(this);
        pro = new Pro(this);
    }

    public UserRegion() {
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

    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }
}
