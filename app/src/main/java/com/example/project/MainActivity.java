package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
Button bt_start_game , bt_settings , bt_past_results;
DBHelper dbHelper;
DBHelper dbHelper2;


    SQLiteDatabase database;
    SQLiteDatabase database2;
    int db_background;
    int number_name;
    int test;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        dbHelper = new DBHelper(this);
//        dbHelper2 = new DBHelper(this);
        Bundle arguments = getIntent().getExtras();

        if(arguments!=null){

            /*db_background = arguments.getInt("number_background");
            database = dbHelper.getWritableDatabase();
            database.delete(DBHelper.TABLE_CONTACTS, null, null);
            ContentValues contentValues = new ContentValues();

            contentValues.put(DBHelper.KEY_NAME, db_background);
            database.insert(DBHelper.TABLE_CONTACTS, null, contentValues);*/
        }



        bt_start_game = (Button) findViewById(R.id.bt_start_game);
        bt_start_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor cursor = database.query(DBHelper.TABLE_CONTACTS, null, null, null, null, null, null);

                if (cursor.moveToFirst()) {
                    int idIndex = cursor.getColumnIndex(DBHelper.KEY_ID);
                    number_name = cursor.getColumnIndex(DBHelper.KEY_NAME);
                    test = Integer.parseInt(cursor.getString(number_name));

                    do {
                        Log.d("mLog", "ID = " + cursor.getInt(idIndex) +
                                ", name = " + cursor.getString(number_name));
                    } while (cursor.moveToNext());
                } else
                    Log.d("mLog","0 rows");

                cursor.close();


                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("second_number" , test);
                startActivity(intent);
            }
        });
        database = dbHelper.getWritableDatabase();
       // Cursor cursor2 = database.query(DBHelper_second.TABLE_CONTACTS, null, null, null, null, null, null);
        ContentValues contentValues = new ContentValues();

        bt_settings = (Button) findViewById(R.id.bt_settings);
        bt_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main_Settings.class);
                startActivity(intent);
            }
        });
        bt_past_results = (Button) findViewById(R.id.bt_past_results);
        bt_past_results.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainResults.class);
                startActivity(intent);
            }
        });


    }
}