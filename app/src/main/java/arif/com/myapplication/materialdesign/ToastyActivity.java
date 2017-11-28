package arif.com.myapplication.materialdesign;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import arif.com.myapplication.R;
import es.dmoral.toasty.Toasty;

public class ToastyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toasty);

        findViewById(R.id.button_error_toast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasty.error(ToastyActivity.this, "This is an error toast.", Toast.LENGTH_SHORT, true).show();
            }
        });
        findViewById(R.id.button_success_toast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasty.success(ToastyActivity.this, "Success!", Toast.LENGTH_SHORT, true).show();
            }
        });
        findViewById(R.id.button_info_toast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasty.info(ToastyActivity.this, "Here is some info for you.", Toast.LENGTH_SHORT, true).show();
            }
        });
        findViewById(R.id.button_warning_toast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasty.warning(ToastyActivity.this, "Beware of the dog.", Toast.LENGTH_SHORT, true).show();
            }
        });
        findViewById(R.id.button_normal_toast_wo_icon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasty.normal(ToastyActivity.this, "Normal toast w/o icon").show();
            }
        });
        findViewById(R.id.button_normal_toast_w_icon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable icon = getResources().getDrawable(R.drawable.app_icon);
                Toasty.normal(ToastyActivity.this, "Normal toast w/ icon", icon).show();
            }
        });
        findViewById(R.id.button_info_toast_with_formatting).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toasty.info(ToastyActivity.this, getFormattedMessage()).show();
            }
        });
//        findViewById(R.id.button_custom_config).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toasty.Config.getInstance()
//                        .setTextColor(Color.GREEN)
//                        .setToastTypeface(Typeface.createFromAsset(getAssets(), "PCap Terminal.otf"))
//                        .apply();
//                Toasty.custom(ToastyActivity.this, "sudo kill -9 everyone", getResources().getDrawable(R.drawable.laptop512),
//                        Color.BLACK, Toast.LENGTH_SHORT, true, true).show();
//                Toasty.Config.reset(); // Use this if you want to use the configuration above only once
//            }
//        });

    }
}
