public class DownloadIdle extends DownloadRegion {

    private DownloadRegion downloadRegion;

    public DownloadIdle(DownloadRegion downloadRegion) {
        super();
        this.downloadRegion = downloadRegion;
    }

    @Override
    public void download() {
        if (downloadRegion.State.getNetworkRegiState() instanceof Connected && downloadRegion.State.filesQueueRegion.getNumOfFiles() > 0) {
            downloadRegion.download_thread_running = false;
            downloadRegion.download_region_thread = new Thread(downloadRegion.downloadingState);
            downloadRegion.State.freeSpace -= downloadRegion.State.filesQueueRegion.popFile();
            downloadRegion.moveState();
        }
    }


    public void run() {
        while (!downloadRegion.download_thread_running) {
        }
    }
}

