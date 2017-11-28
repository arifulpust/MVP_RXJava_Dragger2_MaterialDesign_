package arif.com.myapplication.RXJava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import arif.com.myapplication.R;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.AsyncSubject;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.ReplaySubject;

public class RXJavaSubject extends AppCompatActivity {
Unbinder unbinder;
String TAG="RXJavaSubject";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rxjava_subject);
        unbinder=ButterKnife.bind(this);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
    @OnClick(R.id.PublisherSubject)
    public void PublisherSubject()
    {
        PublishSubject<String> publishSubject = PublishSubject.create();

        publishSubject.onNext("Bangla");
        publishSubject.onNext("English");
        publishSubject.subscribe(getObserver());

        publishSubject.onNext("Algorithm");
        publishSubject.onNext("Lab");
        publishSubject.onComplete();
    }
    @OnClick(R.id.ReplySubject)
    public void ReplySubject()
    {
        ReplaySubject<String> replaySubject = ReplaySubject.create();

        replaySubject.onNext("Bangla");
        replaySubject.onNext("English");
        replaySubject.onNext("Algorithm");
        replaySubject.onNext("Lab");
        replaySubject.onComplete();

        replaySubject.subscribe(getObserver());
    }
    @OnClick(R.id.BehaviorSubject)
    public void BehaviorSubject()
    {
        BehaviorSubject<String> behaviorSubject = BehaviorSubject.create();

        behaviorSubject.onNext("Bangla");
        behaviorSubject.onNext("English");
        behaviorSubject.onNext("Algorithm");

        behaviorSubject.subscribe(getObserver());
        behaviorSubject.onNext("Lab");
        behaviorSubject.onComplete();

    }
    @OnClick(R.id.AsyncSubject)
    public void AsyncSubject()
    {
        AsyncSubject<String> asyncSubject = AsyncSubject.create();

        asyncSubject.onNext("Bangla");

        asyncSubject.subscribe(getObserver());

        asyncSubject.onNext("English");
        asyncSubject.onNext("Algorithm");
        asyncSubject.onNext("Lab");
        asyncSubject.onComplete();

    }

    private Observer<String> getObserver() {
        return new Observer<String>() {

            @Override
            public void onSubscribe(Disposable d) {

                Log.d(TAG, " Second onSubscribe : " + d.isDisposed());

            }

            @Override
            public void onNext(String value) {

                Log.d(TAG, " Second onNext value : " + value);
            }

            @Override
            public void onError(Throwable e) {

                Log.d(TAG, " Second onError : " + e.getMessage());
            }
            @Override
            public void onComplete() {

                Log.d(TAG, " Second onComplete");
            }
        };
    }
}
