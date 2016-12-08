package c7081.quickclean.CreateSchedule;

/**
 * Created by Liz on 08/11/2016.
 */
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import c7081.quickclean.EditSchedule.EditSched;
import c7081.quickclean.Home;
import c7081.quickclean.R;

public class NewSched extends AppCompatActivity {

    public final static String MSG = "a.QuickClean.MSG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add);
        goHome();
    } //end onCreate

    public void goHome() {
        Button save = (Button) findViewById(R.id.saveBtn);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(NewSched.this, Home.class);
                EditText nameT = (EditText) findViewById(R.id.sName);
                String scheduleName = nameT.getText().toString();
                intent.putExtra(MSG, scheduleName);
                startActivity(intent);
            }
        });

    }// end of goHome

}//end of public class










//        Spinner spinner = (Spinner) findViewById(R.id.spinner);
//// Create an ArrayAdapter using the string array and a default spinner layout
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
//                R.array.houses, android.R.layout.simple_spinner_item);
//// Specify the layout to use when the list of choices appears
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//// Apply the adapter to the spinner
//        spinner.setAdapter(adapter);
