import static java.lang.Thread.sleep;

public class Downloading extends DownloadRegion {
    public Downloading(OnState on) {
        super(on);
    }

    public void update() {
    }


        public void run () {
            while (DownloadRegion.super_thread_exit) {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                DownloadRegion.downSize += On.speed;
            }
        }
    }



