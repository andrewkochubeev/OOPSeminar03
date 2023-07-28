import java.util.Iterator;
import java.util.List;

/**
 * Stream
 */
public class Stream implements Iterable<StudentGroup> {
    private List<StudentGroup> studentGroupList;
    private int streamId;

    public int getStreamId() {
        return streamId;
    }

    public void setStreamId(int streamId) {
        this.streamId = streamId;
    }

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }

    public void setStudentGroupList(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
       
    }
    
}