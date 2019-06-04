public class Beginner implements State {

    private UserRegion userRegion;
    private double speed;

    public Beginner(UserRegion userRegion) {
        this.speed = 1;
        this.userRegion = userRegion;
    }

    @Override
    public void turnOn() {
        // no implementation
    }

    @Override
    public void download() {
        if (userRegion.getContext_on().points >= 4){
            userRegion.getContext_on().upRank();
        }
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
        if(userRegion.getContext_on().points >= 4){
            userRegion.setCurrentState(userRegion.getProgressive());
        }
    }

    @Override
    public void downRank() {
        // no implementation
    }

    @Override
    public void movieOff() {

    }

    @Override
    public void resume() {

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

    public String toString() {
        return "Beginner";
    }

}
