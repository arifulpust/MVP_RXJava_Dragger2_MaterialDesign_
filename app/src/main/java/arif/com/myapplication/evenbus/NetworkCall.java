package arif.com.myapplication.evenbus;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;

import com.google.gson.Gson;
import com.orhanobut.logger.Logger;

import org.greenrobot.eventbus.EventBus;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DisposableSubscriber;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Dream71 on 31/10/2017.
 */

public class NetworkCall {
    public static void getData(){
        APIService mAPIService = ApiUtils.getAPIService();
        DisposableSubscriber<DataModel> d = new DisposableSubscriber<DataModel>() {
            @Override
            public void onNext(DataModel jsonObject) {
            Log.e("DataModel",""+new Gson().toJson(jsonObject));
                EventBus.getDefault().post(new DataReceiveEvent("data_received", jsonObject));
            }

            @Override
            public void onError(Throwable e) {

                Log.e("On Error", "error--- "+e);
                e.printStackTrace();
            }

            @Override
            public void onComplete() {

                Log.e("Model", "onCompleted");
            }
        };

        // RxJava
        mAPIService.getData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(d);
    }



}
