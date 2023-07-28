import java.util.List;

public class Controller {
    private StreamService streamService = new StreamService();

    public StreamService getStreamService() {
        return streamService;
    }

    public void setStreamService(StreamService streamService) {
        this.streamService = streamService;
    }
    public List<Stream> getSortedStreamList(){
        return streamService.sorting();
    }
}
