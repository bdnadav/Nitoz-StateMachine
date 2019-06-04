public class Progressive implements State{

    private UserRegion userRegion;
    private double speed;

    public Progressive(UserRegion userRegion) {
        this.speed= 1.2;
        this.userRegion = userRegion;
        System.out.println("Enter Progressive state");
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
        if(userRegion.getPoints()>=7){
            userRegion.setCurrentState(userRegion.getPro());
            System.out.println("enter Professional state");
            System.out.println("exit Progressive state");
        }
    }

    @Override
    public void downRank() {
        if(userRegion.getPoints()<7){
            userRegion.setCurrentState(userRegion.getBeginner());
            System.out.println("enter Beginner state");
            System.out.println("exit Progressive state");
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
    public void hold() {

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
        return this;
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
}

