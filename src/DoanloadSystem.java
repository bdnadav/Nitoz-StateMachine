import java.util.Scanner;

public class DownloadSystem implements State {
    State currentState;
    State onState;
    State offState;

    public DownloadSystem(int diskSize) {
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

    public static void main(String[] args) {
        while(true) {
            System.out.println("Tell the system what to do :");
            Scanner userInput = new Scanner(System.in);

            while(!userInput.hasNext());

            String input = "";
            if (userInput.hasNext()) input = userInput.nextLine();

            System.out.println("input is '" + input + "'");

            if (!input.equals("")) {
                //main code
            }
            userInput.close();
            ..Thread.sleep(1000);
        }

    } //End of main
}
