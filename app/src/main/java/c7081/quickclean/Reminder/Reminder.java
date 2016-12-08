package c7081.quickclean.Reminder;

/**
 * Created by Liz on 08/11/2016.
 */
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

import c7081.quickclean.Home;
import c7081.quickclean.R;

public class Reminder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reminder);
        goHome();

    } // end onCreate

    public void goHome() {
        Button save = (Button) findViewById(R.id.saveBtn);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Reminder.this, Home.class));

            }
        });
    }// end of goHome

}
