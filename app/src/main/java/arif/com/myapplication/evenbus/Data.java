package arif.com.myapplication.evenbus;

import java.io.Serializable;

/**
 * Created by Dream71 on 31/10/2017.
 */

public class Data implements Serializable {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
