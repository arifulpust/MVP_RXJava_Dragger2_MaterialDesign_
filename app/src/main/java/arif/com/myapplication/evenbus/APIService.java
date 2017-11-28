package arif.com.myapplication.evenbus;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by Dream71 on 31/10/2017.
 */

public interface APIService {
    @Headers({
            "Accept: application/json"
    })
    @GET("/hasancse91/EventBus-Android-Tutorial/master/Data/data.json")
    Flowable<DataModel> getData();
}
