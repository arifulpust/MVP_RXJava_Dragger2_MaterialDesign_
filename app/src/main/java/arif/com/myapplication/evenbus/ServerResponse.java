package arif.com.myapplication.evenbus;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Dream71 on 31/10/2017.
 */

public class ServerResponse {
    @SerializedName("status")
    boolean statusString; //variable name is statusString but it'll map with "status"
    @SerializedName("message")
    String messageString; //variable name is messageString but it'll map with "message"

    public boolean isSuccess(){
        return statusString;
    }

    public String getMessage() {
        return messageString;
    }
}
