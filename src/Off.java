public class Off implements State {

    System context;

    public Off(System system) {
        this.context = system;
    }

    @Override
    public void turnOn() {
        context.setCurrentState(context.getOnState());
    }

    @Override
    public void turnOff() {
        // Do nothing.
    }
}
