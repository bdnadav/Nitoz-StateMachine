public interface State {

    void turnOn();
    void turnOff();

    void movieOff();
    void downloadAborted();
    void movieOn();
    void holdMovie();
    double checkSpeed();
    void upRank();
    void resume();
    void downRank();
    void internetOn();
    void internetOff();
    void finished();
    void hold();
    void errorFixed();
    void downloadError();
    void fileRequest(double fileSize);
    void addFile();
    void download();
    State getState();
    void restartMovie();
    void setCurrentState(State state);


}
