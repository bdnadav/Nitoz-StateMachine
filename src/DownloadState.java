

public interface DownloadState extends State {


    void updateDownload(double speed);

    void errorNotFixed();

    void cancelReq();
}
