package arif.com.myapplication.RXJava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import arif.com.myapplication.R;
import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public class RXJavaSearch extends AppCompatActivity {
    @BindView(R.id.svKey)
    SearchView svKey;
    @BindView(R.id.rvStudentList)
    RecyclerView rvStudentList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_rxjava_search);
        ButterKnife.bind(this);
        StudentAdapter adapter = new StudentAdapter();
        rvStudentList.setLayoutManager(new LinearLayoutManager(this));
        rvStudentList.setAdapter(adapter);
        initSearchFeature(adapter);
    }

    private void initSearchFeature(StudentAdapter adapter) {
        RxSearchObservable.fromSearchView(svKey)
                .debounce(500, TimeUnit.MILLISECONDS)
                .filter(text -> !text.isEmpty())
                .distinctUntilChanged()
                .switchMap(new Function<String, ObservableSource<ArrayList<String>>>() {
                    @Override
                    public ObservableSource<ArrayList<String>> apply(@NonNull String key) throws Exception {
                        return DataSource.getSearchData(key);
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(names -> {
                    adapter.removeAllNames();
                    adapter.addStudentNames(names);
                });
    }
}
