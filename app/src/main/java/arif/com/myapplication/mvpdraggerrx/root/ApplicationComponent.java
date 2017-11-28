package arif.com.myapplication.mvpdraggerrx.root;



import javax.inject.Singleton;

import arif.com.myapplication.mvpdraggerrx.login.LoginActivity;
import arif.com.myapplication.mvpdraggerrx.login.LoginModule;
import dagger.Component;

/**
 * Created by Shuza on 08-May-17.
 */
@Singleton
@Component(modules = {ApplicationModule.class, LoginModule.class})
public interface ApplicationComponent {

    void inject(LoginActivity target);

}
