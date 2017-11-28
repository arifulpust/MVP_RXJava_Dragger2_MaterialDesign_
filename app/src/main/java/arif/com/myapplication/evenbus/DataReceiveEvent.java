package arif.com.myapplication.evenbus;

/**
 * Created by Dream71 on 31/10/2017.
 */

public class DataReceiveEvent {
    private String eventTag;
    private DataModel responseMessage;
    public DataReceiveEvent(String eventTag, DataModel responseMessage) {
        this.eventTag = eventTag;
        this.responseMessage = responseMessage;
    }

    public boolean isTagMatchWith(String tag){
        return eventTag.equals(tag);
    }

    public DataModel getResponseMessage() {
        return responseMessage;
    }
}
