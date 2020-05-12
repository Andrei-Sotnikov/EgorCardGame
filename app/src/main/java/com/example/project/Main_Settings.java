package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.project.R;

public class Main_Settings extends AppCompatActivity {

    ImageView background_image1 , background_image2 , background_image3;
    Button bt_accept_image , accept_name_of_player;
    int background_number;
    String name_of_player;
    EditText et_name_of_player;
  //  DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__settings);
       // dbHelper = new DBHelper(this);

        background_image1 = (ImageView) findViewById(R.id.background_image1);
        background_image2 = (ImageView) findViewById(R.id.background_image2);
        background_image3 = (ImageView) findViewById(R.id.background_image3);
        bt_accept_image = (Button) findViewById(R.id.bt_accept_image);
        et_name_of_player = (EditText) findViewById(R.id.et_name_of_player);
        accept_name_of_player = (Button) findViewById(R.id.accept_name_of_player);

        accept_name_of_player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!et_name_of_player.getText().toString().equals("") ){
                    name_of_player = et_name_of_player.getText().toString();
                }else{
                    Toast.makeText(Main_Settings.this, "Поле с именем должно быть заполнено" , Toast.LENGTH_SHORT).show();
                }
            }
        });



        background_image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                background_number = 1;

            }
        });
        background_image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                background_number = 2;

            }
        });
        background_image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                background_number = 3;

            }
        });
        bt_accept_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Main_Settings.this, MainActivity.class);
                intent.putExtra("number_background" , background_number);
                startActivity(intent);
            }
        });


    }
}
