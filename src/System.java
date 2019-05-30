public class System {
    State currentState;

    public System(int diskSize) {
        this.currentState = new Off(this);

    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
