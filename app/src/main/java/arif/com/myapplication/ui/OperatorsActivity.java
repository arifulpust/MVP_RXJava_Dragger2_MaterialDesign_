package arif.com.myapplication.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import arif.com.myapplication.R;
import arif.com.myapplication.ui.operators.AsyncSubjectExampleActivity;
import arif.com.myapplication.ui.operators.BehaviorSubjectExampleActivity;
import arif.com.myapplication.ui.operators.BufferExampleActivity;
import arif.com.myapplication.ui.operators.CompletableObserverExampleActivity;
import arif.com.myapplication.ui.operators.ConcatExampleActivity;
import arif.com.myapplication.ui.operators.DebounceExampleActivity;
import arif.com.myapplication.ui.operators.DeferExampleActivity;
import arif.com.myapplication.ui.operators.DelayExampleActivity;
import arif.com.myapplication.ui.operators.DisposableExampleActivity;
import arif.com.myapplication.ui.operators.DistinctExampleActivity;
import arif.com.myapplication.ui.operators.FilterExampleActivity;
import arif.com.myapplication.ui.operators.FlowableExampleActivity;
import arif.com.myapplication.ui.operators.IntervalExampleActivity;
import arif.com.myapplication.ui.operators.LastOperatorExampleActivity;
import arif.com.myapplication.ui.operators.MapExampleActivity;
import arif.com.myapplication.ui.operators.MergeExampleActivity;
import arif.com.myapplication.ui.operators.PublishSubjectExampleActivity;
import arif.com.myapplication.ui.operators.ReduceExampleActivity;
import arif.com.myapplication.ui.operators.ReplayExampleActivity;
import arif.com.myapplication.ui.operators.ReplaySubjectExampleActivity;
import arif.com.myapplication.ui.operators.ScanExampleActivity;
import arif.com.myapplication.ui.operators.SimpleExampleActivity;
import arif.com.myapplication.ui.operators.SingleObserverExampleActivity;
import arif.com.myapplication.ui.operators.SkipExampleActivity;
import arif.com.myapplication.ui.operators.TakeExampleActivity;
import arif.com.myapplication.ui.operators.ThrottleFirstExampleActivity;
import arif.com.myapplication.ui.operators.ThrottleLastExampleActivity;
import arif.com.myapplication.ui.operators.TimerExampleActivity;
import arif.com.myapplication.ui.operators.WindowExampleActivity;
import arif.com.myapplication.ui.operators.ZipExampleActivity;


public class OperatorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operators);
    }

    public void startSimpleActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, SimpleExampleActivity.class));
    }

    public void startMapActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, MapExampleActivity.class));
    }

    public void startZipActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, ZipExampleActivity.class));
    }

    public void startDisposableActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, DisposableExampleActivity.class));
    }

    public void startTakeActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, TakeExampleActivity.class));
    }

    public void startTimerActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, TimerExampleActivity.class));
    }

    public void startIntervalActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, IntervalExampleActivity.class));
    }

    public void startSingleObserverActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, SingleObserverExampleActivity.class));
    }

    public void startCompletableObserverActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, CompletableObserverExampleActivity.class));
    }

    public void startFlowableActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, FlowableExampleActivity.class));
    }

    public void startReduceActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, ReduceExampleActivity.class));
    }

    public void startBufferActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, BufferExampleActivity.class));
    }

    public void startFilterActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, FilterExampleActivity.class));
    }

    public void startSkipActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, SkipExampleActivity.class));
    }

    public void startScanActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, ScanExampleActivity.class));
    }

    public void startReplayActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, ReplayExampleActivity.class));
    }

    public void startConcatActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, ConcatExampleActivity.class));
    }

    public void startMergeActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, MergeExampleActivity.class));
    }

    public void startDeferActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, DeferExampleActivity.class));
    }

    public void startDistinctActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, DistinctExampleActivity.class));
    }

    public void startLastOperatorActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, LastOperatorExampleActivity.class));
    }

    public void startReplaySubjectActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, ReplaySubjectExampleActivity.class));
    }

    public void startPublishSubjectActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, PublishSubjectExampleActivity.class));
    }

    public void startBehaviorSubjectActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, BehaviorSubjectExampleActivity.class));
    }

    public void startAsyncSubjectActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, AsyncSubjectExampleActivity.class));
    }

    public void startThrottleFirstActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this,ThrottleFirstExampleActivity.class));
    }

    public void startThrottleLastActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, ThrottleLastExampleActivity.class));
    }

    public void startDebounceActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, DebounceExampleActivity.class));
    }

    public void startWindowActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this,WindowExampleActivity.class));
    }

    public void startDelayActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this,DelayExampleActivity.class));
    }

}
