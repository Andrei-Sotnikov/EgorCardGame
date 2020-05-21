package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainResults extends AppCompatActivity {

    DBsecond dbHelper;


    SQLiteDatabase database;
    int number_name;
    ArrayList<String> test;
    String[] test1;
    int i;

    ListView list_results;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_results);
        dbHelper = new DBsecond(this);
        database = dbHelper.getWritableDatabase();
        test1 = new String[20];
        test = new ArrayList<>();


        Cursor cursor = database.query(DBsecond.TABLE_CONTACTS, null, null, null, null, null, null);
        i = 0;
        if (cursor.moveToFirst()) {
            int idIndex = cursor.getColumnIndex(DBsecond.KEY_ID);
            number_name = cursor.getColumnIndex(DBsecond.KEY_NAME);

            //test1[i] = cursor.getString(number_name);
            //i++;
            do {
                Log.e("gLog", "ID = " + cursor.getInt(idIndex) +
                        ", name = " + cursor.getString(number_name));
                test.add(cursor.getString(number_name));
               // Toast.makeText(this , "lol" , Toast.LENGTH_LONG).show();
            } while (cursor.moveToNext());
        } else{
            Log.e("gLog","0 rows");
           // Toast.makeText(this , "lol" , Toast.LENGTH_LONG).show();
        }

        cursor.close();


        list_results = (ListView) findViewById(R.id.list_results);
        final String[] catNames = new String[] {
                "Рыжик", "Барсик", "Мурзик", "Мурка", "Васька",
                "Томасина", "Кристина", "Пушок", "Дымка", "Кузя",
                "Китти", "Масяня", "Симба" , "Кристина", "Пушок", "Дымка", "Кузя"
        };
     /*  for (int i = 0; i < test1.length; i++) {
            if (test.get(i) != null){
            test1[i] = test.get(i);}
        }*/


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1 , test);
      //  Toast.makeText(this , "lol" , Toast.LENGTH_LONG).show();
        list_results.setAdapter(adapter);
    }
}
