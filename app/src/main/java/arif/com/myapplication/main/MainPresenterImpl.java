package arif.com.myapplication.main;

import android.util.Log;
import android.widget.Toast;

public class MainPresenterImpl implements MainPresenter,MainInteractor.MainAfterClicedPerformed{
    private MainView mainView;
    private MainInteractor mainInteractor;
    public MainPresenterImpl(MainView mainView) {

        this.mainView = mainView;
        this.mainInteractor = new MainInteractorImpl();

    }
    @Override
    public void ButtonClick(int ButtonType) {
        Log.e("presenter",""+ButtonType);
        mainInteractor.MainAfterCliced(ButtonType,this);

    }
    @Override
    public void onDestroy() {
        mainView = null;
    }

    @Override
    public void ButtonClicked(int ClickType) {
        Toast.makeText(mainView.getActivity(),"",Toast.LENGTH_SHORT).show();
        if(MainActivity.RQCODE==ClickType)
        { mainView.navigateToQRCodeActivity();}
        else if(MainActivity.RecylerViewDissmiss==ClickType)
        {
            mainView.rxJavaMethod();
        }
        else if(MainActivity.EVemtBusCode==ClickType)
        {
            mainView.GetEventBus();
        }
        else if(MainActivity.RXJavaDetailsCode==ClickType)
        {
            mainView.rxJavaDetails();
        }
        //Dragger2Code
        else if(MainActivity.draggerrxmvpCode==ClickType)
        {
            mainView.rxmvpdragger();
        }
        else if(MainActivity.Dragger2Code==ClickType)
        {
            mainView.Dragger2Injection();
        }
    }
}
