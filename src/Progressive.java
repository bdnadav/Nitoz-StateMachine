public class Progressive implements State{

    private UserRegion userRegion;
    private double speed;

    public Progressive(UserRegion userRegion) {
        this.speed= 1.2;
        this.userRegion = userRegion;
    }

    @Override
    public void turnOn() {
        // no implementation
    }

    @Override
    public void turnOff() {
        userRegion.turnOff();
    }


    @Override
    public double checkSpeed() {
        return speed;
    }

    public void upRank(){
        if(userRegion.getContext_on().points>=7){
            userRegion.setCurrentState(userRegion.getPro());
        }
    }

    @Override
    public void downRank() {
        if(userRegion.getContext_on().points<7){
            userRegion.setCurrentState(userRegion.getBeginner());
        }
    }


    @Override
    public void resume() {

    }


    @Override
    public void movieOff() {

    }

    @Override
    public void downloadAborted() {
        if (userRegion.getContext_on().points < 4){
            userRegion.getContext_on().downRank();
        }

    }

    @Override
    public void movieOn() {

    }

    @Override
    public void holdMovie() {

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
    public void errorFixed() {

    }

    @Override
    public void downloadError() {

    }

    @Override
    public void fileRequest(double fileSize) {

    }


    @Override
    public void download() {
        if (userRegion.getContext_on().points >= 7){
            userRegion.getContext_on().upRank();
        }
    }

    @Override
    public State getState() {
        return this;
    }

    @Override
    public void addFile(double size) {

    }

    @Override
    public void restartMovie() {

    }

    @Override
    public void setCurrentState(State state) {

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
    public int getDownloadStatus() {
        return 0;
    }

    @Override
    public String toString() {
        return "Progressive";
    }
}

