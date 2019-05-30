public class DownloadIdle extends DownloadRegion {

    public DownloadIdle(On on) {
        super(on);
    }

    @Override
    public void download() {
        if (super.networkRegion.getState() instanceof Connected && super.filesQueueRegion.getNumOfFiles() > 0){
            super.setState(super.downloadingState);
        }
    }
}
