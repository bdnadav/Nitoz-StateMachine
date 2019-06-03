import static java.lang.Thread.sleep;

public class Downloading extends DownloadRegion {

    private DownloadRegion downloadRegion;

    public Downloading(DownloadRegion downloadRegion) {
        super();
        this.downloadRegion = downloadRegion;
    }

    public void update() {

    }

    public void idle () {

    }

    public void internetOff(){

    }

    public void downloadError(){

    }

    public void downloadAborted(){

    }

    public void finished(){

    }



        public void run () {
//            while (downloadRegion.download_thread_running) {
//                try {
//                    sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                DownloadRegion.downSize += downloadRegion.onState.speed;
//            }
        }
    }



