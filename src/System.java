public class System implements State {
    State currentState;
    State onState;
    State offState;

    public System(int diskSize) {
        offState = new Off(this);
        onState = new On(this);
        this.currentState = offState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State state) {
        this.currentState = state;
    }

    @Override
    public void turnOn() {
        currentState.turnOn();
    }

    @Override
    public void turnOff() {
        currentState.turnOff();
    }

    public State getOnState() {
        return onState;
    }

    public State getOffState() {
        return offState;
    }
}
