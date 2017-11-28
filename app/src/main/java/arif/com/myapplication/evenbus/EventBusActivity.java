package arif.com.myapplication.evenbus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import arif.com.myapplication.R;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class EventBusActivity extends AppCompatActivity {
    public static String BASE_URL="http://raw.githubusercontent.com";
@BindView(R.id.data)
    TextView data;
Unbinder unbinder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_bus);
        unbinder=  ButterKnife.bind(this);

NetworkCall.getData();
    }
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(DataReceiveEvent event) throws ClassNotFoundException {
        Log.e("On data_received", "call--- "+new Gson().toJson(event));
        if (event.isTagMatchWith("data_received")) {
            data.setText(event.getResponseMessage().getArticles().get(0).getText());
        }
    }
    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
