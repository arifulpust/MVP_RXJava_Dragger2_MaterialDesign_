package arif.com.myapplication.RXJava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import arif.com.myapplication.R;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;


public class RxJavaMain extends AppCompatActivity {
Unbinder unbinder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        unbinder= ButterKnife.bind(this);


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

@OnClick(R.id.BasicRXJava)
public void BasicRXJavaPractice()
{
    Intent intent=new Intent(this,BasicRXJavaPracticeActivity.class);
    startActivity(intent);
}
    public void RXJavaSearch(View v)
    {
        Intent intent=new Intent(this,RXJavaSearch.class);
        startActivity(intent);
    }
    public void FormValidation(View v)
    {
        Intent intent=new Intent(this,FormValidation.class);
        startActivity(intent);
    }
    public void RxJavaDataBinding(View v)
    {
        Intent intent=new Intent(this,RxJavaDataBinding.class);
        startActivity(intent);
    }
    public void rxTimer(View v)
    {
        Intent intent=new Intent(this,RXTimerDemo.class);
        startActivity(intent);

    }
    public void RXJavaSubject(View v)
    {
        Intent intent=new Intent(this,RXJavaSubject.class);
        startActivity(intent);

    }
}
