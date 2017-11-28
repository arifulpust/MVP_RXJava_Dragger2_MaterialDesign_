package arif.com.myapplication.evenbus;

/**
 * Created by Dream71 on 31/10/2017.
 */

public class ApiUtils {

    private ApiUtils() {}

    public static APIService getAPIService() {

        return RetrofitApiClient.getClient(EventBusActivity.BASE_URL).create(APIService.class);
    }

}
