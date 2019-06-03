public class Off implements State {

    DownloadSystem context;

    public Off(DownloadSystem system) {
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
