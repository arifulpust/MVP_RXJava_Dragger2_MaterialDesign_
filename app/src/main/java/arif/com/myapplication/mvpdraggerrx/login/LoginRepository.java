package arif.com.myapplication.mvpdraggerrx.login;

/**
 * Created by Shuza on 08-May-17.
 */

public interface LoginRepository {

    User getUser();

    void saveUser(User user);
}
