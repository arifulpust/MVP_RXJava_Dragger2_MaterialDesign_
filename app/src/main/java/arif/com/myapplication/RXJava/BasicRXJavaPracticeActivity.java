package arif.com.myapplication.RXJava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

import arif.com.myapplication.R;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.schedulers.Schedulers;

public class BasicRXJavaPracticeActivity extends AppCompatActivity {
    Unbinder unbinder;
    @BindView(R.id.text)
    TextView text;
String TAG="BasicRXJavaPractice";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_rxjava_practice);
        unbinder= ButterKnife.bind(this);


    }
    @OnClick(R.id.Completable)
    public void Completable()
    {
        Completable completable = Completable.timer(1000, TimeUnit.MILLISECONDS);

        completable
                .subscribeOn(Schedulers.io())
                // Be notified on the main thread
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(getCompletableObserver());
    }

    private CompletableObserver getCompletableObserver() {
        return new CompletableObserver() {
            @Override
            public void onSubscribe(Disposable d) {
                Log.d(TAG, " onSubscribe : " + d.isDisposed());
            }

            @Override
            public void onComplete() {
                text.append(" onComplete : value : call"  );
                Log.d(TAG, " onComplete");
            }

            @Override
            public void onError(Throwable e) {
                text.append(" onSuccess : value : " + e.getMessage());
            }
        };
    }
@OnClick(R.id.Observable)
public void Observable()
{
    doSomeWorkWithObservable();
}
    @OnClick(R.id.Flowable)
    public void Flowable()
    {
        Flowable<Integer> observable = Flowable.just(1, 2, 3, 4);

        observable.reduce(50, new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer t1, Integer t2) {
                return t1 + t2;
            }
        }).subscribe(getfollowable());
    }
    private SingleObserver<Integer> getfollowable() {

        return new SingleObserver<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
                Log.e(TAG, " onSubscribe : " + d.isDisposed());
            }

            @Override
            public void onSuccess(Integer value) {
                text.append(" onSuccess : value : " + value);

                Log.e(TAG, " onSuccess : value : " + value);
            }

            @Override
            public void onError(Throwable e) {
                text.append(" onError : " + e.getMessage());
                Log.d(TAG, " onError : " + e.getMessage());
            }
        };
    }
    @OnClick(R.id.Single)
    public void Single()
    {
        Single.just("Amit")
                .subscribe(getSingleObserver());
    }
    @OnClick(R.id.Maybe)
    public void Maybe()
    {
        getObservable()
                // Run on a background thread
                .subscribeOn(Schedulers.io())
                // Be notified on the main thread
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(getObserver());
    }

    private void doSomeWorkWithObservable() {
        getObservable()
                // Run on a background thread
                .subscribeOn(Schedulers.io())
                // Be notified on the main thread
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(getObserver());
    }


    private Observer<String> getObserver() {
        return new Observer<String>() {

            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(String value) {
                System.out.println(value);
                text.setText(""+text.getText().toString()+"\n"+value);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {
                System.out.println("onComplete");
            }
        };
    }
    private Observable<String> getObservable() {
        return Observable.just("Cricket", "Football");
    }
    private Observable<String> getFollowable() {
        return Observable.just("Cricket", "Football");
    }
    private SingleObserver<String> getSingleObserver() {

        return new SingleObserver<String>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onSuccess(String value) {
                text.append(" onError : " + value);
                Log.d(TAG, " onError : " + value);
            }

            @Override
            public void onError(Throwable e) {

            }
        };
    }

    private MaybeObserver<Integer> getMaybeObserver() {
        return new MaybeObserver<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onSuccess(Integer value) {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
