package arif.com.myapplication.RXJava;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import arif.com.myapplication.R;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnTextChanged;
import io.reactivex.disposables.Disposable;
import io.reactivex.processors.PublishProcessor;

public class RxJavaDataBinding extends AppCompatActivity {
    @BindView(R.id.etNumber1)
    EditText etNumber1;

    @BindView(R.id.etNumber2)
    EditText etNumber2;

    @BindView(R.id.tvSum)
    TextView tvSum;

    private PublishProcessor<Float> resultPublisher;
    private Disposable subscriber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rx_java_data_binding);
        ButterKnife.bind(this);
        resultPublisher = PublishProcessor.create();
        subscriber = resultPublisher.subscribe(aFloat -> {
            tvSum.setText("Sum = " + aFloat);
        });

        onNumberChanged();
    }

    @OnTextChanged({R.id.etNumber1, R.id.etNumber2})
    public void onNumberChanged() {
        float number1 = NumberUtil.getFloat(etNumber1.getText().toString().trim());
        float number2 = NumberUtil.getFloat(etNumber2.getText().toString().trim());

        Log.e("sum=",""+(number1 + number2));
        resultPublisher.onNext(number1 + number2);
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (!subscriber.isDisposed()) {
            subscriber.dispose();
        }
    }
}
