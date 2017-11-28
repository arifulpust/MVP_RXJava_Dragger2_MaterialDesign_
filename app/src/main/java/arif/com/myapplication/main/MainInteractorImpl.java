package arif.com.myapplication.main;

/**
 * Created by Dream71 on 30/10/2017.
 */

public class MainInteractorImpl implements  MainInteractor{
    @Override
    public void MainAfterCliced(int Type, MainAfterClicedPerformed mainAfterClicedPerformed) {

            mainAfterClicedPerformed.ButtonClicked(Type);

    }
}
