import java.io.PrintWriter;

public class DownloadSystem implements State,Runnable {
    State currentState;
    State onState;
    State offState;
    PrintWriter _writer ;

    public DownloadSystem(int diskSize, PrintWriter writer) {
        _writer = writer ;
        offState = new Off(this);
        onState = new On(this);
        this.currentState = offState;
    }

    public State getCurrentState() {
        return currentState;
    }
     public synchronized void  writeToLog(String event){

        _writer.println(event);

    }

    public void setCurrentState(State state) {
        this.currentState = state;
    }


    public State getOffState() {
        return offState;
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
    public double checkSpeed() {
        return currentState.checkSpeed();
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
    public void fileRequest(double fileSize) {
        currentState.fileRequest(fileSize);
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
    public State getOnState() {
        return onState;
    }

    public void setOnState(State onState) {
        this.onState = onState;
    }

    public void setOffState(State offState) {
        this.offState = offState;
    }

    @Override
    public void run() {
        turnOn();
    }

//End of main
}
