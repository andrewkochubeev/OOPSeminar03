import java.util.ArrayList;
import java.util.List;

public class StreamService {
    private List<Stream> streamList;

    public List<Stream> getStreamList() {
        return streamList;
    }

    public void setStreamList(List<Stream> streamList) {
        this.streamList = streamList;
    }

    public List<Stream> sorting(){
        List<Stream> streamList = new ArrayList<>(this.getStreamList());
        streamList.sort(new StreamComparator());
        return streamList;
    }
}
