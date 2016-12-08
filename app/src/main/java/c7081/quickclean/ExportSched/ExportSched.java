package c7081.quickclean.ExportSched;

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

import static c7081.quickclean.R.drawable.v;

public class ExportSched extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.export);
        change();
    }// end onCreate

    public void change(){
        Button saveb = (Button) findViewById(R.id.exportBtn);
        saveb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ExportSched.this, Home.class));
            }
        });
    } //end of change

}
