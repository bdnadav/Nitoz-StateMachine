public class Pro implements State {

    private UserRegion userRegion;
    private double speed;

    public Pro(UserRegion userRegion) {
        this.speed= 1.5;
        this.userRegion = userRegion;
        System.out.println("Enter Professional state");

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
        // no implementation
    }

    @Override
    public void downRank() {
        if(userRegion.getPoints()<7){
            userRegion.setCurrentState(userRegion.getProgressive());
            System.out.println("enter Progressive state");
            System.out.println("exit Professional state");
        }
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
    public void resume() {

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
        return this;
    }

    @Override
    public void restartMovie() {

    }

    @Override
    public void setCurrentState(State state) {

    }
}
