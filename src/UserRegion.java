public class UserRegion implements State, Runnable {



    protected State beginner;
    protected State progressive;
    protected State pro;

    protected State currentState;

    On context_on;


    public UserRegion(On on) {
        context_on = on;
        beginner = new Beginner(this);
        progressive = new Progressive(this);
        pro = new Pro(this);
        this.currentState = beginner;
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
    public void run() {

    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }
}
