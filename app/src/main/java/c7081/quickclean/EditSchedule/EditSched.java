package c7081.quickclean.EditSchedule;

/**
 * Created by Liz on 08/11/2016.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import c7081.quickclean.Home;
import c7081.quickclean.R;

public class EditSched extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit);
        goHome();
    } // end of onCreate

    public void goHome(){
        Button save = (Button) findViewById(R.id.saveBtn);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EditSched.this, Home.class));

            }
        });
    }// end of goHome
}
