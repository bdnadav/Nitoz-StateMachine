public class System implements State {
    State currentState;

    State onState;
    State offState;
    public System(int diskSize) {
        onState= new On();
        offState= new Off();
        this.currentState = offState;


    }




    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
