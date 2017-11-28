package arif.com.myapplication;

import android.app.Application;

import java.util.concurrent.TimeUnit;

import arif.com.myapplication.model.Events;
import arif.com.myapplication.mvpdraggerrx.login.LoginModule;
import arif.com.myapplication.mvpdraggerrx.root.ApplicationComponent;
import arif.com.myapplication.mvpdraggerrx.root.ApplicationModule;
import arif.com.myapplication.ui.rxbus.RxBus;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

/**
 * Created by Dream71 on 31/10/2017.
 */

public class MyApp extends Application {
    private ApplicationComponent component;
    public static final String TAG = "MyApplication";
    private RxBus bus;

    @Override
    public void onCreate() {
        super.onCreate();
        bus = new RxBus();
//        component = DaggerApplicationComponent.builder()
//                .applicationModule(new ApplicationModule(this))
//                .loginModule(new LoginModule())
//                .build();
    }

    public RxBus bus() {
        return bus;
    }

    public void sendAutoEvent() {
        Observable.timer(2, TimeUnit.SECONDS)
                .subscribe(new Consumer<Long>() {
                    @Override
                    public void accept(Long aLong) throws Exception {
                        bus.send(new Events.AutoEvent());
                    }
                });
    }
    public ApplicationComponent getComponent() {
        return component;
    }
}
