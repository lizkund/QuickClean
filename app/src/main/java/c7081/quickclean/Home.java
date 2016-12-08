package c7081.quickclean;

import android.app.AlertDialog;
import android.content.ContentUris;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Calendar;
import java.util.List;

import c7081.quickclean.CreateSchedule.NewSched;
import c7081.quickclean.EditSchedule.EditSched;
import c7081.quickclean.ExportSched.ExportSched;
import c7081.quickclean.Reminder.Reminder;

public class Home extends AppCompatActivity {
    public static EditText scheduleName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent intent = getIntent();
        final String scheduleName = intent.getStringExtra(NewSched.MSG);
        final TextView name = (TextView) findViewById(R.id.newTV);
        name.setText(scheduleName);

        Button newB = (Button) findViewById(R.id.newBtn);
        newB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, NewSched.class));
            }
        });
        Button editB = (Button) findViewById(R.id.editBtn);
        editB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, EditSched.class));
            }
        });
        Button exportB = (Button) findViewById(R.id.exportBtn);
        assert exportB != null;
        exportB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, ExportSched.class));
            }
        });
        Button cueB = (Button) findViewById(R.id.remindBtn);
        cueB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(Home.this, Reminder.class));
                goToCal();
            }
        });
        Button delB = (Button) findViewById(R.id.deleteBtn);
        delB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setText(null);
            }
        });
    }

    public void goToCal(){
        // Build the intent
        Uri.Builder builder = CalendarContract.CONTENT_URI.buildUpon();
        builder.appendPath("time");
        //ContentUris.appendId(builder, Calendar.);
        Intent intent = new Intent(Intent.ACTION_VIEW)
                .setData(builder.build());
        //startActivity(intent);

        // Verify it resolves
        PackageManager packageManager = getPackageManager();
        List<ResolveInfo> activities = packageManager.queryIntentActivities(intent, 0);
        boolean isIntentSafe = activities.size() > 0;

        // Start an activity if it's safe
        if(isIntentSafe)
        {
            startActivity(intent);
        }
    }
}

//    // Get ListView object from xml
//    TextView textView = (TextView) findViewById(R.id.springTV);
//textView.setOnLongClickListener(new View.OnLongClickListener() {
//@Override
//public boolean onLongClick(View v) {
//        AlertDialog.Builder builder = new AlertDialog.Builder(Home.this);
//        builder.setItems(R.array.menu1, new DialogInterface.OnClickListener() {
//@Override
//public void onClick(DialogInterface dialog, int which) {
//        switch (which) {
//        case 0:
//        // edit intent
//        startActivity(new Intent(Home.this, EditSched.class));
//        break;
//        case 1:
//        //delete function
//        break;
//        case 2:
//        //export
//        startActivity(new Intent(Home.this, ExportSched.class));
//        break;
//        case 3:
//        //remind
//        startActivity(new Intent(Home.this, Reminder.class));
//        break;
//default:
//        break;
//        }
//        }
//        });
//        return false;
//        }
//        });