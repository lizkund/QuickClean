package c7081.quickclean.CreateSchedule;

/**
 * Created by Liz on 08/11/2016.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import c7081.quickclean.Home;
import c7081.quickclean.R;

public class ViewS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view);

        Button newB = (Button) findViewById(R.id.homeBtn);
        newB.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                startActivity(new Intent(ViewS.this, Home.class));
            }
        });
    }
}
