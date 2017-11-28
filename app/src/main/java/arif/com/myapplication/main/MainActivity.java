package arif.com.myapplication.main;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import arif.com.myapplication.QRCodeScan.QRCodeScannerActivity;
import arif.com.myapplication.R;
import arif.com.myapplication.RXJava.RxJavaMain;
import arif.com.myapplication.dragger.Dragger2Activity;
import arif.com.myapplication.evenbus.EventBusActivity;
import arif.com.myapplication.materialdesign.MaterialMainActivity;
import arif.com.myapplication.mvpdraggerrx.login.LoginActivity;
import arif.com.myapplication.recyclearviewswipetodismis.RecyclerViewDragDropSwipeDismissActivity;
import arif.com.myapplication.ui.SelectionActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity  implements MainView,View.OnClickListener{
    MainPresenter mainPresenter;
   public static int RQCODE=1;
    public static   int RecylerViewDissmiss=2;
    public static   int RXJavaDetailsCode=3;
    public static   int draggerrxmvpCode=4;
    public static   int EVemtBusCode=5;
    public static   int Dragger2Code=6;
    @BindView(R.id.QRCode)
    Button QRCode;
    @BindView(R.id.rxJava)
    Button rxJava;
    //eventBus
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        QRCode.setOnClickListener(this);
        rxJava.setOnClickListener(this);
        mainPresenter=new MainPresenterImpl(this);
    }

    //materialDesign
    @OnClick(R.id.materialDesign)
    public void materialDesign()
    {

        Intent intent=new Intent(this,MaterialMainActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.dragger2)
    public void Draggertwo()
    {

        mainPresenter.ButtonClick(Dragger2Code);
    }
    @OnClick(R.id.eventBus)
    public void EventBus()
    {
        mainPresenter.ButtonClick(EVemtBusCode);
    }

    @OnClick(R.id.rxJavaDetails)
    public void rxJavaDetailsMethod()
    {
        mainPresenter.ButtonClick(RXJavaDetailsCode);
    }
    @OnClick(R.id.draggerrxmvp)
    public void draggerrxmvpMethod()
    {
        mainPresenter.ButtonClick(draggerrxmvpCode);
    }
    @Override
    public void onClick(View v) {
        Log.e("1","wqe");
        switch (v.getId())
        {
            case R.id.QRCode:
                Log.e("2","wqe");
                mainPresenter.ButtonClick(RQCODE);
                break;
            case R.id.rxJava:
                Log.e("3","wqe");
                mainPresenter.ButtonClick(RecylerViewDissmiss);
                break;
        }
    }
    @Override
    public void navigateToQRCodeActivity() {
        Intent intent=new Intent(this,QRCodeScannerActivity.class);
        startActivity(intent);
    }

//draggerrxmvp
    @Override
    public void rxJavaMethod() {
        Intent intent=new Intent(this,RxJavaMain.class);
        startActivity(intent);
    }

    @Override
    public void GetEventBus() {
        Intent intent=new Intent(this,EventBusActivity.class);
        startActivity(intent);
    }

    @Override
    public void Dragger2Injection() {
        Intent intent=new Intent(this,Dragger2Activity.class);
        startActivity(intent);
    }

    @Override
    public void rxJavaDetails() {
        Intent intent=new Intent(this,SelectionActivity.class);
        startActivity(intent);
    }

    @Override
    public void rxmvpdragger() {
        Intent intent=new Intent(this,LoginActivity.class);
        startActivity(intent);
    }

    @Override
    public Context getAppContext() {
        return getApplicationContext();
    }

    @Override
    public Context getActivityContext() {
        return this;
    }

    @Override
    public Activity getActivity() {
        return this;
    }
}
