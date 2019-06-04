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
    void errorFixed();
    void downloadError();
    void fileRequest(double fileSize);
    void download();
    State getState();
    void addFile(double size);
    void restartMovie();
    void setCurrentState(State state);
    void checkSpace();
    void freeSpace(double fileSize);
    void reduceFreeSpace(double fileSize);
    String toString() ;
    double getFreeSpace();
    int getDownloadStatus();


}
