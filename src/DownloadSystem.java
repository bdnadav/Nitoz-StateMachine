import java.util.Scanner;

public class DownloadSystem implements State, Runnable {
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


    public State getOffState() {
        return offState;
    }

    @Override
    public void run() {
        turnOn();
    }

    @Override
    public void turnOn() {
        currentState.turnOn();
    }

    @Override
    public void turnOff() {
        currentState.turnOff();
    }

    @Override
    public void movieOff() {
        currentState.movieOff();
    }

    @Override
    public void downloadAborted() {
        currentState.downloadAborted();
    }

    @Override
    public void movieOn() {
        currentState.movieOn();
    }

    @Override
    public void holdMovie() {
        currentState.holdMovie();
    }

    @Override
    public void checkSpeed() {
        currentState.checkSpeed();
    }

    @Override
    public void upRank() {
        currentState.upRank();
    }

    @Override
    public void resume() {
        currentState.resume();
    }

    @Override
    public void downRank() {
        currentState.downRank();
    }

    @Override
    public void internetOn() {
        currentState.internetOn();
    }

    @Override
    public void internetOff() {
        currentState.internetOff();
    }

    @Override
    public void finished() {
        currentState.finished();
    }

    @Override
    public void hold() {
        currentState.hold();
    }

    @Override
    public void errorFixed() {
        currentState.errorFixed();
    }

    @Override
    public void downloadError() {
        currentState.downloadError();
    }

    @Override
    public void fileRequest() {
        currentState.fileRequest();
    }

    @Override
    public void addFile() {
        currentState.addFile();
    }

    @Override
    public void download() {
        currentState.download();
    }

    @Override
    public State getState() {
        return currentState;
    }

    @Override
    public void restartMovie() {
        currentState.restartMovie();
    }


//End of main
}
