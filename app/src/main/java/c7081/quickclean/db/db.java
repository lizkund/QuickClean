package c7081.quickclean.db;

import android.content.Intent;

import com.orm.SugarRecord;

import java.sql.Time;

/**
 * Created by Liz on 10/11/2016.
 */
public class db extends SugarRecord {

    String schedName;
    String room;
    String itemName;
    Integer freq;
    Time time;
    String dayofWeek;
    String email;

    public db(String schedName, String room){
        this.schedName = schedName;
        this.room = room;
    }

}
