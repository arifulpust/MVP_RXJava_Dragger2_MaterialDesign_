package arif.com.myapplication.main;

import android.app.Activity;
import android.content.Context;

/**
 * Created by Dream71 on 30/10/2017.
 */

public interface MainView {
    void navigateToQRCodeActivity();
    void rxJavaMethod();
    void rxJavaDetails();
    void rxmvpdragger();
    void GetEventBus();
    void Dragger2Injection();
    Context getAppContext();
    Context getActivityContext();
    Activity getActivity();
}
