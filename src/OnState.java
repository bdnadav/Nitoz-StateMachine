public interface OnState extends State {
    void movieOff();
    void downloadAborted();
    void movieOn();
    void holdMovie();
    void checkSpeed();
    void upRank();
    void resume();
    void downRank();
    void internetOn();
    void internetOff();
    void finished();
    void hold();
    void errorFixed();
    void downloadError();
    void fileRequest();
    void addFile();
    void download();
    OnState getState();
    void restartMovie();
    void setCurrentState(OnState onState);



}
