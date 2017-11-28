package arif.com.myapplication.evenbus;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Dream71 on 31/10/2017.
 */

public class DataModel  implements Serializable{
    public List<Data>articles;

    public List<Data> getArticles() {
        return articles;
    }

    public void setArticles(List<Data> articles) {
        this.articles = articles;
    }
}
