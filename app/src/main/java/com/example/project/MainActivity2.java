package com.example.project;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {


    ImageView player1FirstCardImage;
    ImageView player1SecondCardImage;
    ImageView player1ThirdCardImage;
    ImageView player1FourthCardImage;

    ImageView player2FirstCardImage;
    ImageView player2SecondCardImage;
    ImageView player2ThirdCardImage;
    ImageView player2FourthCardImage;
    int second_number;
    ImageView imageView;
    Animation sunRiseAnimation;
    Animation sunRiseAnimation2;
    TextView tv_winner;

    Button stand , bt_count , hit;

    int main_count_of_player;
    String main_count;

    int bot_count , bot_cards;

    int proverka_dostupa;

    int probeg;

    ImageView demonstration , demonstration2 , demonstration3;



    ImageView chip_one , chip_five , chip_thwenty , chip_fiftin , chip_sto;

    Button Redial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        demonstration = (ImageView) findViewById(R.id.demonstration);
        demonstration2 = (ImageView) findViewById(R.id.demonstration2);
        demonstration3 = (ImageView) findViewById(R.id.demonstration3);
        demonstration.setX(9999);
        demonstration.setY(9999);
        main_count_of_player = 0;
        bt_count = (Button) findViewById(R.id.bt_count);
       // proverka_dostupa = 0;
        hit = (Button) findViewById(R.id.Hit);

        tv_winner = (TextView) findViewById(R.id.tv_winner);

        bot_count = 0;
        bot_cards = 2;

        probeg = 0;

        player2FirstCardImage = (ImageView) findViewById(R.id.player2FirstCard);
        player2SecondCardImage = (ImageView) findViewById(R.id.player2SecondCard);
        player1FirstCardImage = (ImageView) findViewById(R.id.player1FirstCard);
        player1SecondCardImage = (ImageView) findViewById(R.id.player1SecondCard);
        player2ThirdCardImage = (ImageView) findViewById(R.id.player2ThirdCard);
        player2FourthCardImage = (ImageView) findViewById(R.id.player2FourthCard);
        player1ThirdCardImage = (ImageView) findViewById(R.id.player1ThirdCard);
        player1FourthCardImage = (ImageView) findViewById(R.id.player1FourthCard);



        stand = (Button) findViewById(R.id.Stand);


        // Bundle arguments = getIntent().getExtras();

        Bundle arguments = getIntent().getExtras();

        if (arguments != null) {

            second_number = arguments.getInt("second_number");
        }
        imageView = (ImageView) findViewById(R.id.imageView);
        if (second_number == 1) {
            imageView.setImageResource(R.drawable.background1);
        } else if (second_number == 2) {
            imageView.setImageResource(R.drawable.background2);
        } else if (second_number == 3) {
            imageView.setImageResource(R.drawable.background3);
        }

        Redial = (Button) findViewById(R.id.Redial);

        Redial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                finish();
                startActivity(intent);
            }
        });







        for (int i = 0; i < 2; i++) {


            int vibor_masti = (int) (Math.random() * 100);
            if (vibor_masti >= 0 && vibor_masti <= 25) {
                int choose_force = (int) (Math.random() * 100);
                if (choose_force >= 0 && choose_force <= 10) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.two_of_spades);
                        main_count_of_player+=2;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.two_of_spades);
                        main_count_of_player+=2;
                    }

                } else if (choose_force > 10 && choose_force <= 20) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.three_of_spades);
                        main_count_of_player+=3;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.three_of_spades);
                        main_count_of_player+=3;
                    }
                } else if (choose_force > 20 && choose_force <= 30) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.four_of_spades);
                        main_count_of_player+=4;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.four_of_spades);
                        main_count_of_player+=4;
                    }

                } else if (choose_force > 30 && choose_force <= 40) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.five_of_spades);
                        main_count_of_player+=5;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.five_of_spades);
                        main_count_of_player+=5;
                    }

                } else if (choose_force > 40 && choose_force <= 50) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.six_of_spades);
                        main_count_of_player+=6;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.six_of_spades);
                        main_count_of_player+=6;
                    }

                } else if (choose_force > 50 && choose_force <= 60) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.seven_of_spades);
                        main_count_of_player+=7;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.seven_of_spades);
                        main_count_of_player+=7;
                    }

                } else if (choose_force > 60 && choose_force <= 70) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.eight_of_spades);
                        main_count_of_player+=8;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.eight_of_spades);
                        main_count_of_player+=8;
                    }

                } else if (choose_force > 70 && choose_force <= 80) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.nine_of_spades);
                        main_count_of_player+=9;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.nine_of_spades);
                        main_count_of_player+=9;
                    }
                } else if (choose_force > 80 && choose_force <= 100) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.ten_of_spades);
                        main_count_of_player+=10;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.ten_of_spades);
                        main_count_of_player+=10;
                    }

                } /*else if (choose_force > 90 && choose_force <= 95) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.king_of_spades);
                        main_count_of_player+=11;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.king_of_spades);
                        main_count_of_player+=11;
                    }

                } else if (choose_force > 95 && choose_force <= 100) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.ace_of_spades);
                        main_count_of_player+=12;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.ace_of_spades);
                        main_count_of_player+=12;
                    }
                }*/
            } else if (vibor_masti > 25 && vibor_masti <= 50) {
                int choose_force = (int) (Math.random() * 100);
                if (choose_force >= 0 && choose_force <= 10) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.two_of_hearts);
                        main_count_of_player+=2;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.two_of_hearts);
                        main_count_of_player+=2;
                    }
                } else if (choose_force > 10 && choose_force <= 20) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.three_of_hearts);
                        main_count_of_player+=3;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.three_of_hearts);
                        main_count_of_player+=3;
                    }

                } else if (choose_force > 20 && choose_force <= 30) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.four_of_hearts);
                        main_count_of_player+=4;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.four_of_hearts);
                        main_count_of_player+=4;
                    }

                } else if (choose_force > 30 && choose_force <= 40) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.five_of_hearts);
                        main_count_of_player+=5;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.five_of_hearts);
                        main_count_of_player+=5;
                    }

                } else if (choose_force > 40 && choose_force <= 50) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.six_of_hearts);
                        main_count_of_player+=6;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.six_of_hearts);
                        main_count_of_player+=6;
                    }

                } else if (choose_force > 50 && choose_force <= 60) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.seven_of_hearts);
                        main_count_of_player+=7;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.seven_of_hearts);
                        main_count_of_player+=7;
                    }

                } else if (choose_force > 60 && choose_force <= 70) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.eight_of_hearts);
                        main_count_of_player+=8;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.eight_of_hearts);
                        main_count_of_player+=8;
                    }

                } else if (choose_force > 70 && choose_force <= 80) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.nine_of_hearts);
                        main_count_of_player+=9;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.nine_of_hearts);
                        main_count_of_player+=9;
                    }

                } else if (choose_force > 80 && choose_force <= 100) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.ten_of_hearts);
                        main_count_of_player+=10;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.ten_of_hearts);
                        main_count_of_player+=10;
                    }

                } /*else if (choose_force > 90 && choose_force <= 95) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.king_of_hearts);
                        main_count_of_player+=11;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.king_of_hearts);
                        main_count_of_player+=11;
                    }

                } else if (choose_force > 95 && choose_force <= 100) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.ace_of_hearts);
                        main_count_of_player+=12;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.ace_of_hearts);
                        main_count_of_player+=12;
                    }

                }*/

            } else if (vibor_masti > 50 && vibor_masti <= 75) {
                int choose_force = (int) (Math.random() * 100);
                if (choose_force >= 0 && choose_force <= 10) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.two_of_diamonds);
                        main_count_of_player+=2;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.two_of_diamonds);
                        main_count_of_player+=2;
                    }

                } else if (choose_force > 10 && choose_force <= 20) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.three_of_diamonds);
                        main_count_of_player+=3;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.three_of_diamonds);
                        main_count_of_player+=3;
                    }

                } else if (choose_force > 20 && choose_force <= 30) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.four_of_diamonds);
                        main_count_of_player+=4;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.four_of_diamonds);
                        main_count_of_player+=4;
                    }

                } else if (choose_force > 30 && choose_force <= 40) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.five_of_diamonds);
                        main_count_of_player+=5;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.five_of_diamonds);
                        main_count_of_player+=5;
                    }

                } else if (choose_force > 40 && choose_force <= 50) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.six_of_diamonds);
                        main_count_of_player+=6;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.six_of_diamonds);
                        main_count_of_player+=6;
                    }

                } else if (choose_force > 50 && choose_force <= 60) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.seven_of_diamonds);
                        main_count_of_player+=7;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.seven_of_diamonds);
                        main_count_of_player+=7;
                    }

                } else if (choose_force > 60 && choose_force <= 70) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.eight_of_diamonds);
                        main_count_of_player+=8;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.eight_of_diamonds);
                        main_count_of_player+=8;
                    }

                } else if (choose_force > 70 && choose_force <= 80) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.nine_of_diamonds);
                        main_count_of_player+=9;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.nine_of_diamonds);
                        main_count_of_player+=9;
                    }

                } else if (choose_force > 80 && choose_force <= 100) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.ten_of_diamonds);
                        main_count_of_player+=10;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.ten_of_diamonds);
                        main_count_of_player+=10;
                    }

                } /*else if (choose_force > 90 && choose_force <= 95) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.king_of_diamonds);
                        main_count_of_player+=11;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.king_of_diamonds);
                        main_count_of_player+=11;
                    }

                } else if (choose_force > 95 && choose_force <= 100) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.ace_of_diamonds);
                        main_count_of_player+=12;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.ace_of_diamonds);
                        main_count_of_player+=12;
                    }

                }*/

            } else if (vibor_masti > 75 && vibor_masti <= 100) {
                int choose_force = (int) (Math.random() * 100);
                if (choose_force >= 0 && choose_force <= 10) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.two_of_clubs);
                        main_count_of_player+=2;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.two_of_clubs);
                        main_count_of_player+=2;
                    }

                } else if (choose_force > 10 && choose_force <= 20) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.three_of_clubs);
                        main_count_of_player+=3;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.three_of_clubs);
                        main_count_of_player+=3;
                    }

                } else if (choose_force > 20 && choose_force <= 30) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.four_of_clubs);
                        main_count_of_player+=4;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.four_of_clubs);
                        main_count_of_player+=4;
                    }

                } else if (choose_force > 30 && choose_force <= 40) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.five_of_clubs);
                        main_count_of_player+=5;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.five_of_clubs);
                        main_count_of_player+=5;
                    }

                } else if (choose_force > 40 && choose_force <= 50) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.six_of_clubs);
                        main_count_of_player+=6;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.six_of_clubs);
                        main_count_of_player+=6;
                    }

                } else if (choose_force > 50 && choose_force <= 60) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.seven_of_clubs);
                        main_count_of_player+=7;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.seven_of_clubs);
                        main_count_of_player+=7;
                    }

                } else if (choose_force > 60 && choose_force <= 70) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.eight_of_clubs);
                        main_count_of_player+=8;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.eight_of_clubs);
                        main_count_of_player+=8;
                    }

                } else if (choose_force > 70 && choose_force <= 80) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.nine_of_clubs);
                        main_count_of_player+=9;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.nine_of_clubs);
                        main_count_of_player+=9;
                    }
                } else if (choose_force > 80 && choose_force <= 100) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.ten_of_clubs);
                        main_count_of_player+=10;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.ten_of_clubs);
                        main_count_of_player+=10;
                    }

                } /*else if (choose_force > 90 && choose_force <= 95) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.king_of_clubs);
                        main_count_of_player+=11;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.king_of_clubs);
                        main_count_of_player+=11;
                    }

                } else if (choose_force > 95 && choose_force <= 100) {
                    if (probeg == 0){
                        player2FirstCardImage.setImageResource(R.drawable.ace_of_clubs);
                        main_count_of_player+=12;
                        probeg++;}else{
                        player2SecondCardImage.setImageResource(R.drawable.ace_of_clubs);
                        main_count_of_player+=12;
                    }
                }*/

            }
        }


        main_count = ""+main_count_of_player;

        bt_count.setText(main_count);

        probeg = 0;







        for (int i = 0; i < 2; i++) {


            int vibor_masti = (int) (Math.random() * 100);
            if (vibor_masti >= 0 && vibor_masti <= 25) {
                int choose_force = (int) (Math.random() * 100);
                if (choose_force >= 0 && choose_force <= 10) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.two_of_spades);
                       bot_count+=2;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.two_of_spades);
                        bot_count+=2;
                    }

                } else if (choose_force > 10 && choose_force <= 20) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.three_of_spades);
                     bot_count+=3;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.three_of_spades);
                       bot_count+=3;
                    }
                } else if (choose_force > 20 && choose_force <= 30) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.four_of_spades);
                     bot_count+=4;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.four_of_spades);
                        bot_count+=4;
                    }

                } else if (choose_force > 30 && choose_force <= 40) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.five_of_spades);
                     bot_count+=5;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.five_of_spades);
                       bot_count+=5;
                    }

                } else if (choose_force > 40 && choose_force <= 50) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.six_of_spades);
                     bot_count+=6;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.six_of_spades);
                       bot_count+=6;
                    }

                } else if (choose_force > 50 && choose_force <= 60) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.seven_of_spades);
                      bot_count+=7;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.seven_of_spades);
                        bot_count+=7;
                    }

                } else if (choose_force > 60 && choose_force <= 70) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.eight_of_spades);
                    bot_count+=8;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.eight_of_spades);
                       bot_count+=8;
                    }

                } else if (choose_force > 70 && choose_force <= 80) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.nine_of_spades);
                    bot_count+=9;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.nine_of_spades);
                      bot_count+=9;
                    }
                } else if (choose_force > 80 && choose_force <= 100) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.ten_of_spades);
                    bot_count+=10;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.ten_of_spades);
                       bot_count+=10;
                    }

                } /*else if (choose_force > 90 && choose_force <= 95) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.king_of_spades);
                   //     main_count_of_player+=11;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.king_of_spades);
                       // main_count_of_player+=11;
                    }

                } else if (choose_force > 95 && choose_force <= 100) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.ace_of_spades);
                   //     main_count_of_player+=12;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.ace_of_spades);
                      //  main_count_of_player+=12;
                    }
                }*/
            } else if (vibor_masti > 25 && vibor_masti <= 50) {
                int choose_force = (int) (Math.random() * 100);
                if (choose_force >= 0 && choose_force <= 10) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.two_of_hearts);
                    bot_count+=2;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.two_of_hearts);
                      bot_count+=2;
                    }
                } else if (choose_force > 10 && choose_force <= 20) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.three_of_hearts);
                    bot_count+=3;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.three_of_hearts);
                      bot_count+=3;
                    }

                } else if (choose_force > 20 && choose_force <= 30) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.four_of_hearts);
                     bot_count+=4;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.four_of_hearts);
                      bot_count+=4;
                    }

                } else if (choose_force > 30 && choose_force <= 40) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.five_of_hearts);
                    bot_count+=5;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.five_of_hearts);
                      bot_count+=5;
                    }

                } else if (choose_force > 40 && choose_force <= 50) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.six_of_hearts);
                    bot_count+=6;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.six_of_hearts);
                     bot_count+=6;
                    }

                } else if (choose_force > 50 && choose_force <= 60) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.seven_of_hearts);
                     bot_count+=7;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.seven_of_hearts);
                      bot_count+=7;
                    }

                } else if (choose_force > 60 && choose_force <= 70) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.eight_of_hearts);
                     bot_count+=8;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.eight_of_hearts);
                        bot_count+=8;
                    }

                } else if (choose_force > 70 && choose_force <= 80) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.nine_of_hearts);
                    bot_count+=9;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.nine_of_hearts);
                       bot_count+=9;
                    }

                } else if (choose_force > 80 && choose_force <= 100) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.ten_of_hearts);
                     bot_count+=10;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.ten_of_hearts);
                       bot_count+=10;
                    }

                } /*else if (choose_force > 90 && choose_force <= 95) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.king_of_hearts);
                     //   main_count_of_player+=11;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.king_of_hearts);
                      //  main_count_of_player+=11;
                    }

                } else if (choose_force > 95 && choose_force <= 100) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.ace_of_hearts);
                     //   main_count_of_player+=12;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.ace_of_hearts);
                      //  main_count_of_player+=12;
                    }

                }*/

            } else if (vibor_masti > 50 && vibor_masti <= 75) {
                int choose_force = (int) (Math.random() * 100);
                if (choose_force >= 0 && choose_force <= 10) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.two_of_diamonds);
                      bot_count+=2;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.two_of_diamonds);
                       bot_count+=2;
                    }

                } else if (choose_force > 10 && choose_force <= 20) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.three_of_diamonds);
                     bot_count+=3;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.three_of_diamonds);
                       bot_count+=3;
                    }

                } else if (choose_force > 20 && choose_force <= 30) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.four_of_diamonds);
                     bot_count+=4;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.four_of_diamonds);
                       bot_count+=4;
                    }

                } else if (choose_force > 30 && choose_force <= 40) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.five_of_diamonds);
                       bot_count+=5;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.five_of_diamonds);
                      bot_count+=5;
                    }

                } else if (choose_force > 40 && choose_force <= 50) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.six_of_diamonds);
                       bot_count+=6;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.six_of_diamonds);
                      bot_count+=6;
                    }

                } else if (choose_force > 50 && choose_force <= 60) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.seven_of_diamonds);
                       bot_count+=7;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.seven_of_diamonds);
                       bot_count+=7;
                    }

                } else if (choose_force > 60 && choose_force <= 70) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.eight_of_diamonds);
                        bot_count+=8;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.eight_of_diamonds);
                      bot_count+=8;
                    }

                } else if (choose_force > 70 && choose_force <= 80) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.nine_of_diamonds);
                        bot_count+=9;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.nine_of_diamonds);
                       bot_count+=9;
                    }

                } else if (choose_force > 80 && choose_force <= 100) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.ten_of_diamonds);
                        bot_count+=10;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.ten_of_diamonds);
                      bot_count+=10;
                    }

                } /*else if (choose_force > 90 && choose_force <= 95) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.king_of_diamonds);
                       // main_count_of_player+=11;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.king_of_diamonds);
                       // main_count_of_player+=11;
                    }

                } else if (choose_force > 95 && choose_force <= 100) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.ace_of_diamonds);
                     //   main_count_of_player+=12;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.ace_of_diamonds);
                      //  main_count_of_player+=12;
                    }

                }*/

            } else if (vibor_masti > 75 && vibor_masti <= 100) {
                int choose_force = (int) (Math.random() * 100);
                if (choose_force >= 0 && choose_force <= 10) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.two_of_clubs);
                        bot_count+=2;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.two_of_clubs);
                      bot_count+=2;
                    }

                } else if (choose_force > 10 && choose_force <= 20) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.three_of_clubs);
                        bot_count+=3;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.three_of_clubs);
                       bot_count+=3;
                    }

                } else if (choose_force > 20 && choose_force <= 30) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.four_of_clubs);
                        bot_count+=4;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.four_of_clubs);
                       bot_count+=4;
                    }

                } else if (choose_force > 30 && choose_force <= 40) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.five_of_clubs);
                        bot_count+=5;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.five_of_clubs);
                       bot_count+=5;
                    }

                } else if (choose_force > 40 && choose_force <= 50) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.six_of_clubs);
                      bot_count+=6;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.six_of_clubs);
                       bot_count+=6;
                    }

                } else if (choose_force > 50 && choose_force <= 60) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.seven_of_clubs);
                      bot_count+=7;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.seven_of_clubs);
                      bot_count+=7;
                    }

                } else if (choose_force > 60 && choose_force <= 70) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.eight_of_clubs);
                      bot_count+=8;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.eight_of_clubs);
                      bot_count+=8;
                    }

                } else if (choose_force > 70 && choose_force <= 80) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.nine_of_clubs);
                      bot_count+=9;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.nine_of_clubs);
                      bot_count+=9;
                    }
                } else if (choose_force > 80 && choose_force <= 100) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.ten_of_clubs);
                      bot_count+=10;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.ten_of_clubs);
                       bot_count+=10;
                    }

                }/* else if (choose_force > 90 && choose_force <= 95) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.king_of_clubs);
                      //  main_count_of_player+=11;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.king_of_clubs);
                      //  main_count_of_player+=11;
                    }

                } else if (choose_force > 95 && choose_force <= 100) {
                    if (probeg == 0){
                        player1FirstCardImage.setImageResource(R.drawable.ace_of_clubs);
                     //   main_count_of_player+=12;
                        probeg++;}else{
                        player1SecondCardImage.setImageResource(R.drawable.ace_of_clubs);
                      //  main_count_of_player+=12;
                    }
                }*/

            }
        }

        float x = player1SecondCardImage.getX();
        float y = player1SecondCardImage.getY();
        demonstration.setX(x);
        demonstration.setY(y);


















        stand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                if (bot_count<10){
                    int vremenno = (int) (Math.random() * 100);
                    if (vremenno>=0 && vremenno<=85){
                        if (bot_cards==3){
                            int vibor_masti = (int) (Math.random() * 100);
                            if (vibor_masti >= 0 && vibor_masti <= 25) {
                                int choose_force = (int) (Math.random() * 100);
                                if (choose_force >= 0 && choose_force <= 10) {

                                    player1FourthCardImage.setImageResource(R.drawable.two_of_spades);
                                    bot_count+=2;


                                } else if (choose_force > 10 && choose_force <= 20) {

                                    player1FourthCardImage.setImageResource(R.drawable.three_of_spades);
                                    bot_count+=3;

                                } else if (choose_force > 20 && choose_force <= 30) {

                                    player1FourthCardImage.setImageResource(R.drawable.four_of_spades);
                                    bot_count+=4;


                                } else if (choose_force > 30 && choose_force <= 40) {

                                    player1FourthCardImage.setImageResource(R.drawable.five_of_spades);
                                    bot_count+=5;


                                } else if (choose_force > 40 && choose_force <= 50) {

                                    player1FourthCardImage.setImageResource(R.drawable.six_of_spades);
                                    bot_count+=6;


                                } else if (choose_force > 50 && choose_force <= 60) {

                                    player1FourthCardImage.setImageResource(R.drawable.seven_of_spades);
                                    bot_count+=7;


                                } else if (choose_force > 60 && choose_force <= 70) {

                                    player1FourthCardImage.setImageResource(R.drawable.eight_of_spades);
                                    bot_count+=8;


                                } else if (choose_force > 70 && choose_force <= 80) {

                                    player1FourthCardImage.setImageResource(R.drawable.nine_of_spades);
                                    bot_count+=9;

                                } else if (choose_force > 80 && choose_force <= 90) {

                                    player1FourthCardImage.setImageResource(R.drawable.ten_of_spades);
                                    bot_count+=10;


                                } else if (choose_force > 90 && choose_force <= 95) {

                                    player1FourthCardImage.setImageResource(R.drawable.king_of_spades);
                                    bot_count+=11;


                                } else if (choose_force > 95 && choose_force <= 100) {

                                    player1FourthCardImage.setImageResource(R.drawable.ace_of_spades);
                                    bot_count+=12;

                                }
                            } else if (vibor_masti > 25 && vibor_masti <= 50) {
                                int choose_force = (int) (Math.random() * 100);
                                if (choose_force >= 0 && choose_force <= 10) {

                                    player1FourthCardImage.setImageResource(R.drawable.two_of_hearts);
                                    bot_count+=2;

                                } else if (choose_force > 10 && choose_force <= 20) {

                                    player1FourthCardImage.setImageResource(R.drawable.three_of_hearts);
                                    bot_count+=3;


                                } else if (choose_force > 20 && choose_force <= 30) {

                                    player1FourthCardImage.setImageResource(R.drawable.four_of_hearts);
                                    bot_count+=4;


                                } else if (choose_force > 30 && choose_force <= 40) {

                                    player1FourthCardImage.setImageResource(R.drawable.five_of_hearts);
                                    bot_count+=5;


                                } else if (choose_force > 40 && choose_force <= 50) {

                                    player1FourthCardImage.setImageResource(R.drawable.six_of_hearts);
                                    bot_count+=6;


                                } else if (choose_force > 50 && choose_force <= 60) {

                                    player1FourthCardImage.setImageResource(R.drawable.seven_of_hearts);
                                    bot_count+=7;


                                } else if (choose_force > 60 && choose_force <= 70) {

                                    player1FourthCardImage.setImageResource(R.drawable.eight_of_hearts);
                                    bot_count+=8;


                                } else if (choose_force > 70 && choose_force <= 80) {

                                    player1FourthCardImage.setImageResource(R.drawable.nine_of_hearts);
                                    bot_count+=9;


                                } else if (choose_force > 80 && choose_force <= 90) {

                                    player1FourthCardImage.setImageResource(R.drawable.ten_of_hearts);
                                    bot_count+=10;


                                } else if (choose_force > 90 && choose_force <= 95) {

                                    player1FourthCardImage.setImageResource(R.drawable.king_of_hearts);
                                    bot_count+=11;


                                } else if (choose_force > 95 && choose_force <= 100) {

                                    player1FourthCardImage.setImageResource(R.drawable.ace_of_hearts);
                                    bot_count+=12;


                                }

                            } else if (vibor_masti > 50 && vibor_masti <= 75) {
                                int choose_force = (int) (Math.random() * 100);
                                if (choose_force >= 0 && choose_force <= 10) {

                                    player1FourthCardImage.setImageResource(R.drawable.two_of_diamonds);
                                    bot_count+=2;


                                } else if (choose_force > 10 && choose_force <= 20) {

                                    player1FourthCardImage.setImageResource(R.drawable.three_of_diamonds);
                                    bot_count+=3;


                                } else if (choose_force > 20 && choose_force <= 30) {

                                    player1FourthCardImage.setImageResource(R.drawable.four_of_diamonds);
                                    bot_count+=4;


                                } else if (choose_force > 30 && choose_force <= 40) {

                                    player1FourthCardImage.setImageResource(R.drawable.five_of_diamonds);
                                    bot_count+=5;


                                } else if (choose_force > 40 && choose_force <= 50) {

                                    player1FourthCardImage.setImageResource(R.drawable.six_of_diamonds);
                                    bot_count+=6;


                                } else if (choose_force > 50 && choose_force <= 60) {

                                    player1FourthCardImage.setImageResource(R.drawable.seven_of_diamonds);
                                    bot_count+=7;


                                } else if (choose_force > 60 && choose_force <= 70) {

                                    player1FourthCardImage.setImageResource(R.drawable.eight_of_diamonds);
                                    bot_count+=8;


                                } else if (choose_force > 70 && choose_force <= 80) {

                                    player1FourthCardImage.setImageResource(R.drawable.nine_of_diamonds);
                                    bot_count+=9;


                                } else if (choose_force > 80 && choose_force <= 90) {

                                    player1FourthCardImage.setImageResource(R.drawable.ten_of_diamonds);
                                    bot_count+=10;


                                } else if (choose_force > 90 && choose_force <= 95) {

                                    player1FourthCardImage.setImageResource(R.drawable.king_of_diamonds);
                                    bot_count+=11;


                                } else if (choose_force > 95 && choose_force <= 100) {

                                    player1FourthCardImage.setImageResource(R.drawable.ace_of_diamonds);
                                    bot_count+=12;


                                }

                            } else if (vibor_masti > 75 && vibor_masti <= 100) {
                                int choose_force = (int) (Math.random() * 100);
                                if (choose_force >= 0 && choose_force <= 10) {

                                    player1FourthCardImage.setImageResource(R.drawable.two_of_clubs);
                                    bot_count+=2;


                                } else if (choose_force > 10 && choose_force <= 20) {

                                    player1FourthCardImage.setImageResource(R.drawable.three_of_clubs);
                                    bot_count+=3;


                                } else if (choose_force > 20 && choose_force <= 30) {

                                    player1FourthCardImage.setImageResource(R.drawable.four_of_clubs);
                                    bot_count+=4;

                                } else if (choose_force > 30 && choose_force <= 40) {

                                    player1FourthCardImage.setImageResource(R.drawable.five_of_clubs);
                                    bot_count+=5;


                                } else if (choose_force > 40 && choose_force <= 50) {

                                    player1FourthCardImage.setImageResource(R.drawable.six_of_clubs);
                                    bot_count+=6;


                                } else if (choose_force > 50 && choose_force <= 60) {

                                    player1FourthCardImage.setImageResource(R.drawable.seven_of_clubs);
                                    bot_count+=7;


                                } else if (choose_force > 60 && choose_force <= 70) {

                                    player1FourthCardImage.setImageResource(R.drawable.eight_of_clubs);
                                    bot_count+=8;


                                } else if (choose_force > 70 && choose_force <= 80) {

                                    player1FourthCardImage.setImageResource(R.drawable.nine_of_clubs);
                                    bot_count+=9;

                                } else if (choose_force > 80 && choose_force <= 90) {

                                    player1FourthCardImage.setImageResource(R.drawable.ten_of_clubs);
                                    bot_count+=10;


                                } else if (choose_force > 90 && choose_force <= 95) {

                                    player1FourthCardImage.setImageResource(R.drawable.king_of_clubs);
                                    bot_count+=11;


                                } else if (choose_force > 95 && choose_force <= 100) {
                                    if (probeg == 0){
                                        player1FourthCardImage.setImageResource(R.drawable.ace_of_clubs);
                                        bot_count+=12;
                                    }
                                }

                            }
                        }
                    }
                }




                if (bot_count<10){
                    int vremenno = (int) (Math.random() * 100);
                    if (vremenno>=0 && vremenno<=85){
                        if (bot_cards==2){
                            int vibor_masti = (int) (Math.random() * 100);
                            if (vibor_masti >= 0 && vibor_masti <= 25) {
                                int choose_force = (int) (Math.random() * 100);
                                if (choose_force >= 0 && choose_force <= 10) {

                                        player1ThirdCardImage.setImageResource(R.drawable.two_of_spades);
                                        bot_count+=2;


                                } else if (choose_force > 10 && choose_force <= 20) {

                                        player1ThirdCardImage.setImageResource(R.drawable.three_of_spades);
                                        bot_count+=3;

                                } else if (choose_force > 20 && choose_force <= 30) {

                                        player1ThirdCardImage.setImageResource(R.drawable.four_of_spades);
                                        bot_count+=4;


                                } else if (choose_force > 30 && choose_force <= 40) {

                                        player1ThirdCardImage.setImageResource(R.drawable.five_of_spades);
                                        bot_count+=5;


                                } else if (choose_force > 40 && choose_force <= 50) {

                                        player1ThirdCardImage.setImageResource(R.drawable.six_of_spades);
                                        bot_count+=6;


                                } else if (choose_force > 50 && choose_force <= 60) {

                                        player1ThirdCardImage.setImageResource(R.drawable.seven_of_spades);
                                        bot_count+=7;


                                } else if (choose_force > 60 && choose_force <= 70) {

                                        player1ThirdCardImage.setImageResource(R.drawable.eight_of_spades);
                                        bot_count+=8;


                                } else if (choose_force > 70 && choose_force <= 80) {

                                        player1ThirdCardImage.setImageResource(R.drawable.nine_of_spades);
                                        bot_count+=9;

                                } else if (choose_force > 80 && choose_force <= 90) {

                                        player1ThirdCardImage.setImageResource(R.drawable.ten_of_spades);
                                        bot_count+=10;


                                } else if (choose_force > 90 && choose_force <= 95) {

                        player1FirstCardImage.setImageResource(R.drawable.king_of_spades);
                   bot_count+=11;


                } else if (choose_force > 95 && choose_force <= 100) {

                        player1ThirdCardImage.setImageResource(R.drawable.ace_of_spades);
                   bot_count+=12;

                }
                            } else if (vibor_masti > 25 && vibor_masti <= 50) {
                                int choose_force = (int) (Math.random() * 100);
                                if (choose_force >= 0 && choose_force <= 10) {

                                        player1ThirdCardImage.setImageResource(R.drawable.two_of_hearts);
                                        bot_count+=2;

                                } else if (choose_force > 10 && choose_force <= 20) {

                                        player1ThirdCardImage.setImageResource(R.drawable.three_of_hearts);
                                        bot_count+=3;


                                } else if (choose_force > 20 && choose_force <= 30) {

                                        player1ThirdCardImage.setImageResource(R.drawable.four_of_hearts);
                                        bot_count+=4;


                                } else if (choose_force > 30 && choose_force <= 40) {

                                        player1ThirdCardImage.setImageResource(R.drawable.five_of_hearts);
                                        bot_count+=5;


                                } else if (choose_force > 40 && choose_force <= 50) {

                                        player1ThirdCardImage.setImageResource(R.drawable.six_of_hearts);
                                        bot_count+=6;


                                } else if (choose_force > 50 && choose_force <= 60) {

                                        player1ThirdCardImage.setImageResource(R.drawable.seven_of_hearts);
                                        bot_count+=7;


                                } else if (choose_force > 60 && choose_force <= 70) {

                                        player1ThirdCardImage.setImageResource(R.drawable.eight_of_hearts);
                                        bot_count+=8;


                                } else if (choose_force > 70 && choose_force <= 80) {

                                        player1ThirdCardImage.setImageResource(R.drawable.nine_of_hearts);
                                        bot_count+=9;


                                } else if (choose_force > 80 && choose_force <= 90) {

                                        player1ThirdCardImage.setImageResource(R.drawable.ten_of_hearts);
                                        bot_count+=10;


                                } else if (choose_force > 90 && choose_force <= 95) {

                        player1FirstCardImage.setImageResource(R.drawable.king_of_hearts);
                     bot_count+=11;


                } else if (choose_force > 95 && choose_force <= 100) {

                        player1ThirdCardImage.setImageResource(R.drawable.ace_of_hearts);
                     bot_count+=12;


                }

                            } else if (vibor_masti > 50 && vibor_masti <= 75) {
                                int choose_force = (int) (Math.random() * 100);
                                if (choose_force >= 0 && choose_force <= 10) {

                                        player1ThirdCardImage.setImageResource(R.drawable.two_of_diamonds);
                                        bot_count+=2;


                                } else if (choose_force > 10 && choose_force <= 20) {

                                        player1ThirdCardImage.setImageResource(R.drawable.three_of_diamonds);
                                        bot_count+=3;


                                } else if (choose_force > 20 && choose_force <= 30) {

                                        player1ThirdCardImage.setImageResource(R.drawable.four_of_diamonds);
                                        bot_count+=4;


                                } else if (choose_force > 30 && choose_force <= 40) {

                                        player1ThirdCardImage.setImageResource(R.drawable.five_of_diamonds);
                                        bot_count+=5;


                                } else if (choose_force > 40 && choose_force <= 50) {

                                        player1ThirdCardImage.setImageResource(R.drawable.six_of_diamonds);
                                        bot_count+=6;


                                } else if (choose_force > 50 && choose_force <= 60) {

                                        player1ThirdCardImage.setImageResource(R.drawable.seven_of_diamonds);
                                        bot_count+=7;


                                } else if (choose_force > 60 && choose_force <= 70) {

                                        player1ThirdCardImage.setImageResource(R.drawable.eight_of_diamonds);
                                        bot_count+=8;


                                } else if (choose_force > 70 && choose_force <= 80) {

                                        player1ThirdCardImage.setImageResource(R.drawable.nine_of_diamonds);
                                        bot_count+=9;


                                } else if (choose_force > 80 && choose_force <= 90) {

                                        player1ThirdCardImage.setImageResource(R.drawable.ten_of_diamonds);
                                        bot_count+=10;


                                } else if (choose_force > 90 && choose_force <= 95) {

                        player1ThirdCardImage.setImageResource(R.drawable.king_of_diamonds);
                       bot_count+=11;


                } else if (choose_force > 95 && choose_force <= 100) {

                        player1ThirdCardImage.setImageResource(R.drawable.ace_of_diamonds);
                     bot_count+=12;


                }

                            } else if (vibor_masti > 75 && vibor_masti <= 100) {
                                int choose_force = (int) (Math.random() * 100);
                                if (choose_force >= 0 && choose_force <= 10) {

                                        player1ThirdCardImage.setImageResource(R.drawable.two_of_clubs);
                                        bot_count+=2;


                                } else if (choose_force > 10 && choose_force <= 20) {

                                        player1ThirdCardImage.setImageResource(R.drawable.three_of_clubs);
                                        bot_count+=3;


                                } else if (choose_force > 20 && choose_force <= 30) {

                                        player1ThirdCardImage.setImageResource(R.drawable.four_of_clubs);
                                        bot_count+=4;

                                } else if (choose_force > 30 && choose_force <= 40) {

                                        player1ThirdCardImage.setImageResource(R.drawable.five_of_clubs);
                                        bot_count+=5;


                                } else if (choose_force > 40 && choose_force <= 50) {

                                        player1ThirdCardImage.setImageResource(R.drawable.six_of_clubs);
                                        bot_count+=6;


                                } else if (choose_force > 50 && choose_force <= 60) {

                                        player1ThirdCardImage.setImageResource(R.drawable.seven_of_clubs);
                                        bot_count+=7;


                                } else if (choose_force > 60 && choose_force <= 70) {

                                        player1ThirdCardImage.setImageResource(R.drawable.eight_of_clubs);
                                        bot_count+=8;


                                } else if (choose_force > 70 && choose_force <= 80) {

                                        player1ThirdCardImage.setImageResource(R.drawable.nine_of_clubs);
                                        bot_count+=9;

                                } else if (choose_force > 80 && choose_force <= 90) {

                                        player1ThirdCardImage.setImageResource(R.drawable.ten_of_clubs);
                                        bot_count+=10;


                                } else if (choose_force > 90 && choose_force <= 95) {

                        player1ThirdCardImage.setImageResource(R.drawable.king_of_clubs);
                      bot_count+=11;


                } else if (choose_force > 95 && choose_force <= 100) {
                    if (probeg == 0){
                        player1ThirdCardImage.setImageResource(R.drawable.ace_of_clubs);
                        bot_count+=12;
                     }
                }

                            }
                        }
                    }
                }













                if (probeg == 2){
                    int vibor_masti = (int) (Math.random() * 100);
                    if (vibor_masti >= 0 && vibor_masti <= 25) {
                        int choose_force = (int) (Math.random() * 100);
                        if (choose_force >= 0 && choose_force <= 10) {

                            player2FourthCardImage.setImageResource(R.drawable.two_of_spades);
                            main_count_of_player+=2;
                            probeg++;

                        } else if (choose_force > 10 && choose_force <= 20) {

                            player2FourthCardImage.setImageResource(R.drawable.three_of_spades);
                            main_count_of_player+=3;
                            probeg++;
                        } else if (choose_force > 20 && choose_force <= 30) {

                            player2FourthCardImage.setImageResource(R.drawable.four_of_spades);
                            main_count_of_player+=4;
                            probeg++;

                        } else if (choose_force > 30 && choose_force <= 40) {

                            player2FourthCardImage.setImageResource(R.drawable.five_of_spades);
                            main_count_of_player+=5;
                            probeg++;

                        } else if (choose_force > 40 && choose_force <= 50) {

                            player2FourthCardImage.setImageResource(R.drawable.six_of_spades);
                            main_count_of_player+=6;
                            probeg++;

                        } else if (choose_force > 50 && choose_force <= 60) {

                            player2FourthCardImage.setImageResource(R.drawable.seven_of_spades);
                            main_count_of_player+=7;
                            probeg++;

                        } else if (choose_force > 60 && choose_force <= 70) {

                            player2FourthCardImage.setImageResource(R.drawable.eight_of_spades);
                            main_count_of_player+=8;
                            probeg++;

                        } else if (choose_force > 70 && choose_force <= 80) {

                            player2FourthCardImage.setImageResource(R.drawable.nine_of_spades);
                            main_count_of_player+=9;
                            probeg++;

                        } else if (choose_force > 80 && choose_force <= 90) {

                            player2FourthCardImage.setImageResource(R.drawable.ten_of_spades);
                            main_count_of_player+=10;
                            probeg++;

                        } else if (choose_force > 90 && choose_force <= 95) {

                            player2FourthCardImage.setImageResource(R.drawable.king_of_spades);
                            main_count_of_player+=11;
                            probeg++;

                        } else if (choose_force > 95 && choose_force <= 100) {

                            player2FourthCardImage.setImageResource(R.drawable.ace_of_spades);
                            main_count_of_player+=12;
                            probeg++;
                        }
                    } else if (vibor_masti > 25 && vibor_masti <= 50) {
                        int choose_force = (int) (Math.random() * 100);
                        if (choose_force >= 0 && choose_force <= 10) {

                            player2FourthCardImage.setImageResource(R.drawable.two_of_hearts);
                            main_count_of_player+=2;
                            probeg++;
                        } else if (choose_force > 10 && choose_force <= 20) {

                            player2FourthCardImage.setImageResource(R.drawable.three_of_hearts);
                            main_count_of_player+=3;
                            probeg++;

                        } else if (choose_force > 20 && choose_force <= 30) {

                            player2FourthCardImage.setImageResource(R.drawable.four_of_hearts);
                            main_count_of_player+=4;
                            probeg++;

                        } else if (choose_force > 30 && choose_force <= 40) {

                            player2FourthCardImage.setImageResource(R.drawable.five_of_hearts);
                            main_count_of_player+=5;
                            probeg++;

                        } else if (choose_force > 40 && choose_force <= 50) {

                            player2FourthCardImage.setImageResource(R.drawable.six_of_hearts);
                            main_count_of_player+=6;
                            probeg++;

                        } else if (choose_force > 50 && choose_force <= 60) {

                            player2FourthCardImage.setImageResource(R.drawable.seven_of_hearts);
                            main_count_of_player+=7;
                            probeg++;

                        } else if (choose_force > 60 && choose_force <= 70) {

                            player2FourthCardImage.setImageResource(R.drawable.eight_of_hearts);
                            main_count_of_player+=8;
                            probeg++;

                        } else if (choose_force > 70 && choose_force <= 80) {

                            player2FourthCardImage.setImageResource(R.drawable.nine_of_hearts);
                            main_count_of_player+=9;
                            probeg++;

                        } else if (choose_force > 80 && choose_force <= 90) {

                            player2FourthCardImage.setImageResource(R.drawable.ten_of_hearts);
                            main_count_of_player+=10;
                            probeg++;

                        } else if (choose_force > 90 && choose_force <= 95) {

                            player2FourthCardImage.setImageResource(R.drawable.king_of_hearts);
                            main_count_of_player+=11;
                            probeg++;

                        } else if (choose_force > 95 && choose_force <= 100) {

                            player2FourthCardImage.setImageResource(R.drawable.ace_of_hearts);
                            main_count_of_player+=12;
                            probeg++;

                        }

                    } else if (vibor_masti > 50 && vibor_masti <= 75) {
                        int choose_force = (int) (Math.random() * 100);
                        if (choose_force >= 0 && choose_force <= 10) {

                            player2FourthCardImage.setImageResource(R.drawable.two_of_diamonds);
                            main_count_of_player+=2;
                            probeg++;

                        } else if (choose_force > 10 && choose_force <= 20) {

                            player2FourthCardImage.setImageResource(R.drawable.three_of_diamonds);
                            main_count_of_player+=3;
                            probeg++;

                        } else if (choose_force > 20 && choose_force <= 30) {

                            player2FourthCardImage.setImageResource(R.drawable.four_of_diamonds);
                            main_count_of_player+=4;
                            probeg++;

                        } else if (choose_force > 30 && choose_force <= 40) {

                            player2FourthCardImage.setImageResource(R.drawable.five_of_diamonds);
                            main_count_of_player+=5;
                            probeg++;

                        } else if (choose_force > 40 && choose_force <= 50) {

                            player2FourthCardImage.setImageResource(R.drawable.six_of_diamonds);
                            main_count_of_player+=6;
                            probeg++;

                        } else if (choose_force > 50 && choose_force <= 60) {

                            player2FourthCardImage.setImageResource(R.drawable.seven_of_diamonds);
                            main_count_of_player+=7;
                            probeg++;

                        } else if (choose_force > 60 && choose_force <= 70) {

                            player2FourthCardImage.setImageResource(R.drawable.eight_of_diamonds);
                            main_count_of_player+=8;
                            probeg++;

                        } else if (choose_force > 70 && choose_force <= 80) {

                            player2FourthCardImage.setImageResource(R.drawable.nine_of_diamonds);
                            main_count_of_player+=9;
                            probeg++;

                        } else if (choose_force > 80 && choose_force <= 90) {

                            player2FourthCardImage.setImageResource(R.drawable.ten_of_diamonds);
                            main_count_of_player+=10;
                            probeg++;

                        } else if (choose_force > 90 && choose_force <= 95) {

                            player2FourthCardImage.setImageResource(R.drawable.king_of_diamonds);
                            main_count_of_player+=11;
                            probeg++;

                        } else if (choose_force > 95 && choose_force <= 100) {

                            player2FourthCardImage.setImageResource(R.drawable.ace_of_diamonds);
                            main_count_of_player+=12;
                            probeg++;

                        }

                    } else if (vibor_masti > 75 && vibor_masti <= 100) {
                        int choose_force = (int) (Math.random() * 100);
                        if (choose_force >= 0 && choose_force <= 10) {

                            player2FourthCardImage.setImageResource(R.drawable.two_of_clubs);
                            main_count_of_player+=2;
                            probeg++;

                        } else if (choose_force > 10 && choose_force <= 20) {

                            player2FourthCardImage.setImageResource(R.drawable.three_of_clubs);
                            main_count_of_player+=3;
                            probeg++;

                        } else if (choose_force > 20 && choose_force <= 30) {

                            player2FourthCardImage.setImageResource(R.drawable.four_of_clubs);
                            main_count_of_player+=4;
                            probeg++;

                        } else if (choose_force > 30 && choose_force <= 40) {

                            player2FourthCardImage.setImageResource(R.drawable.five_of_clubs);
                            main_count_of_player+=5;
                            probeg++;
                        } else if (choose_force > 40 && choose_force <= 50) {

                            player2FourthCardImage.setImageResource(R.drawable.six_of_clubs);
                            main_count_of_player+=6;
                            probeg++;

                        } else if (choose_force > 50 && choose_force <= 60) {

                            player2FourthCardImage.setImageResource(R.drawable.seven_of_clubs);
                            main_count_of_player+=7;
                            probeg++;

                        } else if (choose_force > 60 && choose_force <= 70) {

                            player2FourthCardImage.setImageResource(R.drawable.eight_of_clubs);
                            main_count_of_player+=8;
                            probeg++;

                        } else if (choose_force > 70 && choose_force <= 80) {

                            player2FourthCardImage.setImageResource(R.drawable.nine_of_clubs);
                            main_count_of_player+=9;
                            probeg++;
                        } else if (choose_force > 80 && choose_force <= 90) {

                            player2FourthCardImage.setImageResource(R.drawable.ten_of_clubs);
                            main_count_of_player+=10;
                            probeg++;

                        } else if (choose_force > 90 && choose_force <= 95) {

                            player2FourthCardImage.setImageResource(R.drawable.king_of_clubs);
                            main_count_of_player+=11;
                            probeg++;

                        } else if (choose_force > 95 && choose_force <= 100) {

                            player2FourthCardImage.setImageResource(R.drawable.ace_of_clubs);
                            main_count_of_player+=12;
                            probeg++;
                        }

                    }
                }


                if (probeg == 1){

                    int vibor_masti = (int) (Math.random() * 100);
                    if (vibor_masti >= 0 && vibor_masti <= 25) {
                        int choose_force = (int) (Math.random() * 100);
                        if (choose_force >= 0 && choose_force <= 10) {

                                player2ThirdCardImage.setImageResource(R.drawable.two_of_spades);
                                main_count_of_player+=2;
                                probeg++;

                        } else if (choose_force > 10 && choose_force <= 20) {

                                player2ThirdCardImage.setImageResource(R.drawable.three_of_spades);
                                main_count_of_player+=3;
                                probeg++;
                        } else if (choose_force > 20 && choose_force <= 30) {

                                player2ThirdCardImage.setImageResource(R.drawable.four_of_spades);
                                main_count_of_player+=4;
                                probeg++;

                        } else if (choose_force > 30 && choose_force <= 40) {

                                player2ThirdCardImage.setImageResource(R.drawable.five_of_spades);
                                main_count_of_player+=5;
                                probeg++;

                        } else if (choose_force > 40 && choose_force <= 50) {

                                player2ThirdCardImage.setImageResource(R.drawable.six_of_spades);
                                main_count_of_player+=6;
                                probeg++;

                        } else if (choose_force > 50 && choose_force <= 60) {

                                player2ThirdCardImage.setImageResource(R.drawable.seven_of_spades);
                                main_count_of_player+=7;
                                probeg++;

                        } else if (choose_force > 60 && choose_force <= 70) {

                                player2ThirdCardImage.setImageResource(R.drawable.eight_of_spades);
                                main_count_of_player+=8;
                                probeg++;

                        } else if (choose_force > 70 && choose_force <= 80) {

                                player2ThirdCardImage.setImageResource(R.drawable.nine_of_spades);
                                main_count_of_player+=9;
                                probeg++;

                        } else if (choose_force > 80 && choose_force <= 90) {

                                player2ThirdCardImage.setImageResource(R.drawable.ten_of_spades);
                                main_count_of_player+=10;
                                probeg++;

                        } else if (choose_force > 90 && choose_force <= 95) {

                                player2ThirdCardImage.setImageResource(R.drawable.king_of_spades);
                                main_count_of_player+=11;
                                probeg++;

                        } else if (choose_force > 95 && choose_force <= 100) {

                                player2ThirdCardImage.setImageResource(R.drawable.ace_of_spades);
                                main_count_of_player+=12;
                                probeg++;
                        }
                    } else if (vibor_masti > 25 && vibor_masti <= 50) {
                        int choose_force = (int) (Math.random() * 100);
                        if (choose_force >= 0 && choose_force <= 10) {

                                player2ThirdCardImage.setImageResource(R.drawable.two_of_hearts);
                                main_count_of_player+=2;
                                probeg++;
                        } else if (choose_force > 10 && choose_force <= 20) {

                                player2ThirdCardImage.setImageResource(R.drawable.three_of_hearts);
                                main_count_of_player+=3;
                                probeg++;

                        } else if (choose_force > 20 && choose_force <= 30) {

                                player2ThirdCardImage.setImageResource(R.drawable.four_of_hearts);
                                main_count_of_player+=4;
                                probeg++;

                        } else if (choose_force > 30 && choose_force <= 40) {

                                player2ThirdCardImage.setImageResource(R.drawable.five_of_hearts);
                                main_count_of_player+=5;
                                probeg++;

                        } else if (choose_force > 40 && choose_force <= 50) {

                                player2ThirdCardImage.setImageResource(R.drawable.six_of_hearts);
                                main_count_of_player+=6;
                                probeg++;

                        } else if (choose_force > 50 && choose_force <= 60) {

                                player2ThirdCardImage.setImageResource(R.drawable.seven_of_hearts);
                                main_count_of_player+=7;
                                probeg++;

                        } else if (choose_force > 60 && choose_force <= 70) {

                                player2ThirdCardImage.setImageResource(R.drawable.eight_of_hearts);
                                main_count_of_player+=8;
                                probeg++;

                        } else if (choose_force > 70 && choose_force <= 80) {

                                player2ThirdCardImage.setImageResource(R.drawable.nine_of_hearts);
                                main_count_of_player+=9;
                                probeg++;

                        } else if (choose_force > 80 && choose_force <= 90) {

                                player2ThirdCardImage.setImageResource(R.drawable.ten_of_hearts);
                                main_count_of_player+=10;
                                probeg++;

                        } else if (choose_force > 90 && choose_force <= 95) {

                                player2ThirdCardImage.setImageResource(R.drawable.king_of_hearts);
                                main_count_of_player+=11;
                                probeg++;

                        } else if (choose_force > 95 && choose_force <= 100) {

                                player2ThirdCardImage.setImageResource(R.drawable.ace_of_hearts);
                                main_count_of_player+=12;
                                probeg++;

                        }

                    } else if (vibor_masti > 50 && vibor_masti <= 75) {
                        int choose_force = (int) (Math.random() * 100);
                        if (choose_force >= 0 && choose_force <= 10) {

                                player2ThirdCardImage.setImageResource(R.drawable.two_of_diamonds);
                                main_count_of_player+=2;
                                probeg++;

                        } else if (choose_force > 10 && choose_force <= 20) {

                                player2ThirdCardImage.setImageResource(R.drawable.three_of_diamonds);
                                main_count_of_player+=3;
                                probeg++;

                        } else if (choose_force > 20 && choose_force <= 30) {

                                player2ThirdCardImage.setImageResource(R.drawable.four_of_diamonds);
                                main_count_of_player+=4;
                                probeg++;

                        } else if (choose_force > 30 && choose_force <= 40) {

                                player2ThirdCardImage.setImageResource(R.drawable.five_of_diamonds);
                                main_count_of_player+=5;
                                probeg++;

                        } else if (choose_force > 40 && choose_force <= 50) {

                                player2ThirdCardImage.setImageResource(R.drawable.six_of_diamonds);
                                main_count_of_player+=6;
                                probeg++;

                        } else if (choose_force > 50 && choose_force <= 60) {

                                player2ThirdCardImage.setImageResource(R.drawable.seven_of_diamonds);
                                main_count_of_player+=7;
                                probeg++;

                        } else if (choose_force > 60 && choose_force <= 70) {

                                player2ThirdCardImage.setImageResource(R.drawable.eight_of_diamonds);
                                main_count_of_player+=8;
                                probeg++;

                        } else if (choose_force > 70 && choose_force <= 80) {

                                player2ThirdCardImage.setImageResource(R.drawable.nine_of_diamonds);
                                main_count_of_player+=9;
                                probeg++;

                        } else if (choose_force > 80 && choose_force <= 90) {

                                player2ThirdCardImage.setImageResource(R.drawable.ten_of_diamonds);
                                main_count_of_player+=10;
                                probeg++;

                        } else if (choose_force > 90 && choose_force <= 95) {

                                player2ThirdCardImage.setImageResource(R.drawable.king_of_diamonds);
                                main_count_of_player+=11;
                                probeg++;

                        } else if (choose_force > 95 && choose_force <= 100) {

                                player2ThirdCardImage.setImageResource(R.drawable.ace_of_diamonds);
                                main_count_of_player+=12;
                                probeg++;

                        }

                    } else if (vibor_masti > 75 && vibor_masti <= 100) {
                        int choose_force = (int) (Math.random() * 100);
                        if (choose_force >= 0 && choose_force <= 10) {

                                player2ThirdCardImage.setImageResource(R.drawable.two_of_clubs);
                                main_count_of_player+=2;
                                probeg++;

                        } else if (choose_force > 10 && choose_force <= 20) {

                                player2ThirdCardImage.setImageResource(R.drawable.three_of_clubs);
                                main_count_of_player+=3;
                                probeg++;

                        } else if (choose_force > 20 && choose_force <= 30) {

                                player2ThirdCardImage.setImageResource(R.drawable.four_of_clubs);
                                main_count_of_player+=4;
                                probeg++;

                        } else if (choose_force > 30 && choose_force <= 40) {

                                player2ThirdCardImage.setImageResource(R.drawable.five_of_clubs);
                                main_count_of_player+=5;
                                probeg++;
                        } else if (choose_force > 40 && choose_force <= 50) {

                                player2ThirdCardImage.setImageResource(R.drawable.six_of_clubs);
                                main_count_of_player+=6;
                                probeg++;

                        } else if (choose_force > 50 && choose_force <= 60) {

                                player2ThirdCardImage.setImageResource(R.drawable.seven_of_clubs);
                                main_count_of_player+=7;
                                probeg++;

                        } else if (choose_force > 60 && choose_force <= 70) {

                                player2ThirdCardImage.setImageResource(R.drawable.eight_of_clubs);
                                main_count_of_player+=8;
                                probeg++;

                        } else if (choose_force > 70 && choose_force <= 80) {

                                player2ThirdCardImage.setImageResource(R.drawable.nine_of_clubs);
                                main_count_of_player+=9;
                                probeg++;
                        } else if (choose_force > 80 && choose_force <= 90) {

                                player2ThirdCardImage.setImageResource(R.drawable.ten_of_clubs);
                                main_count_of_player+=10;
                                probeg++;

                        } else if (choose_force > 90 && choose_force <= 95) {

                                player2ThirdCardImage.setImageResource(R.drawable.king_of_clubs);
                                main_count_of_player+=11;
                                probeg++;

                        } else if (choose_force > 95 && choose_force <= 100) {

                                player2ThirdCardImage.setImageResource(R.drawable.ace_of_clubs);
                                main_count_of_player+=12;
                                probeg++;
                        }

                    }
                }






                main_count =""+ main_count_of_player;
                bt_count.setText(main_count);

            }
        });

        hit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (main_count_of_player>bot_count){
                    if (main_count_of_player<=21){
                    tv_winner.setText("ВЫ ПОБЕДИЛИ!");}
                    else if(bot_count<=21) {
                        tv_winner.setText("ВЫ ПРОИГРАЛИ");
                    }
                }else if (main_count_of_player<bot_count){
                    if (bot_count<=21){
                    tv_winner.setText("ВЫ ПРОИГРАЛИ");}
                    else if (main_count_of_player<=21){
                        tv_winner.setText("ВЫ ПОБЕДИЛИ!");
                    }
                }else{
                    tv_winner.setText("НИЧЬЯ");
                }
                demonstration.setX(9999);
                demonstration.setY(9999);
                demonstration2.setX(9999);
                demonstration2.setY(9999);
                demonstration3.setX(9999);
                demonstration3.setY(9999);
            }
        });













    }

}



