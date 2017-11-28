package arif.com.myapplication.materialdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import arif.com.myapplication.R;

public class MaterialMainActivity extends AppCompatActivity {
Button toasty,Supertooltips;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_main);
        toasty=(Button)findViewById(R.id.toasty);
        toasty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MaterialMainActivity.this,ToastyActivity.class);
                startActivity(intent);
            }
        });
        Supertooltips=(Button)findViewById(R.id.Supertooltips);
        Supertooltips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MaterialMainActivity.this,SupertooltipsActivity.class);
                startActivity(intent);
            }
        });
        //Supertooltips
    }




}
