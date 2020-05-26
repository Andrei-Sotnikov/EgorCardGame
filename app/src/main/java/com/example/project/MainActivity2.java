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


    Hand hand1 = new Hand();
    Hand hand2 = new Hand();



    Player player1 = new Player("Player1", hand1);
    Player player2 = new Player("Player2", hand2);

    Game game = new Game(player1, player2);

    private Suit player1DealtCardSuit;
    private Rank player1DealtCardRank;
    private int player1HandOldValue;
    private int player1HandNewValue;
    private ArrayList<Card> player1Hand;
    private ArrayList<String> hand1Details;
    private String player1CardDetails;
    private String player1EachIcon;
    private ArrayList<String> Player1AllIcons;

    private Suit player2DealtCardSuit;
    private Rank player2DealtCardRank;
    private int player2HandOldValue;
    private int player2HandNewValue;
    private ArrayList<Card> player2Hand;
    private ArrayList<String> hand2Details;
    private String player2CardDetails;
    private String player2EachIcon;
    private ArrayList<String> Player2AllIcons;

    TextView textPlayer1LatestCard;
    Button buttonPlayer1;

    TextView textPlayer2LatestCard;
    Button buttonPlayer2;


    DBHelper dbHelper;
    DBsecond dbHelper2;


    SQLiteDatabase database;
    SQLiteDatabase database2;


    TextView textResult;
    Button buttonGameResult;
//ааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааа
//    Button buttonAnotherPlay;

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

    Button Redial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




       // Bundle arguments = getIntent().getExtras();

        Bundle arguments = getIntent().getExtras();

        if(arguments!=null){

            second_number = arguments.getInt("second_number");
        }
        imageView = (ImageView) findViewById(R.id.imageView);
        if (second_number == 1){
            imageView.setImageResource(R.drawable.background1);
        }else if (second_number == 2){
            imageView.setImageResource(R.drawable.background2);
        }else if (second_number == 3){
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

        buttonPlayer1 = (Button) findViewById(R.id.buttonPlayer1);
        textPlayer1LatestCard = (TextView) findViewById(R.id.player1Choice);

        player1FirstCardImage = (ImageView) findViewById(R.id.player1FirstCard);
        //Animation sunRiseAnimation = AnimationUtils.loadAnimation(this, R.anim.animation);
      //  player1FirstCardImage.startAnimation(sunRiseAnimation);
        player1SecondCardImage = (ImageView) findViewById(R.id.player1SecondCard);

        //player1SecondCardImage.startAnimation(sunRiseAnimation);

        player1ThirdCardImage = (ImageView) findViewById(R.id.player1ThirdCard);
        //player1ThirdCardImage.startAnimation(sunRiseAnimation);

        player1FourthCardImage = (ImageView) findViewById(R.id.player1FourthCard);
        //player1FourthCardImage.startAnimation(sunRiseAnimation);

        buttonPlayer2 = (Button) findViewById(R.id.buttonPlayer2);
        textPlayer2LatestCard = (TextView) findViewById(R.id.player2Choice);

        player2FirstCardImage = (ImageView) findViewById(R.id.player2FirstCard);
        //player2FirstCardImage.startAnimation(sunRiseAnimation);
        player2SecondCardImage = (ImageView) findViewById(R.id.player2SecondCard);
        //player2SecondCardImage.startAnimation(sunRiseAnimation);

        player2ThirdCardImage = (ImageView) findViewById(R.id.player2ThirdCard);
        //player2ThirdCardImage.startAnimation(sunRiseAnimation);

        player2FourthCardImage = (ImageView) findViewById(R.id.player2FourthCard);
        //player2FourthCardImage.startAnimation(sunRiseAnimation);

        buttonGameResult = (Button) findViewById(R.id.buttonResult);
        textResult = (TextView) findViewById(R.id.gameResult);



/*
        ImageView sunImageView = (ImageView) findViewById(R.id.player1FirstCard);
        Animation sunRiseAnimation = AnimationUtils.loadAnimation(this, R.anim.animation);
        sunImageView.startAnimation(sunRiseAnimation);

        ImageView sunImageView1 = (ImageView) findViewById(R.id.player1SecondCard);
      //  Animation sunRiseAnimation1 = AnimationUtils.loadAnimation(this, R.anim.animation);
        sunImageView1.startAnimation(sunRiseAnimation);

        ImageView sunImageView2 = (ImageView) findViewById(R.id.player1ThirdCard);
      //  Animation sunRiseAnimation2 = AnimationUtils.loadAnimation(this, R.anim.animation);
        sunImageView2.startAnimation(sunRiseAnimation);

        ImageView sunImageView3 = (ImageView) findViewById(R.id.player1FourthCard);
       // Animation sunRiseAnimation3 = AnimationUtils.loadAnimation(this, R.anim.animation);
        sunImageView3.startAnimation(sunRiseAnimation);

        ImageView sunImageView4 = (ImageView) findViewById(R.id.player2FirstCard);
        //Animation sunRiseAnimation4 = AnimationUtils.loadAnimation(this, R.anim.animation);
        sunImageView4.startAnimation(sunRiseAnimation);


        ImageView sunImageView5 = (ImageView) findViewById(R.id.player2SecondCard);
      //  Animation sunRiseAnimation5 = AnimationUtils.loadAnimation(this, R.anim.animation);
        sunImageView5.startAnimation(sunRiseAnimation);

        ImageView sunImageView6 = (ImageView) findViewById(R.id.player2ThirdCard);
       // Animation sunRiseAnimation6 = AnimationUtils.loadAnimation(this, R.anim.animation);
        sunImageView6.startAnimation(sunRiseAnimation);

        ImageView sunImageView7 = (ImageView) findViewById(R.id.player2FourthCard);
      //  Animation sunRiseAnimation7 = AnimationUtils.loadAnimation(this, R.anim.animation);
        sunImageView7.startAnimation(sunRiseAnimation);*/


        // buttonAnotherPlay = (Button) findViewById(R.id.buttonPlayAgain);
    }

    public void onPlayer1ButtonClick(View view) {


     ImageView sunImageView = (ImageView) findViewById(R.id.player1FirstCard);
        Animation sunRiseAnimation = AnimationUtils.loadAnimation(this, R.anim.animation);
        sunImageView.startAnimation(sunRiseAnimation);

        ImageView sunImageView1 = (ImageView) findViewById(R.id.player1SecondCard);
        //  Animation sunRiseAnimation1 = AnimationUtils.loadAnimation(this, R.anim.animation);
        sunImageView1.startAnimation(sunRiseAnimation);

        ImageView sunImageView2 = (ImageView) findViewById(R.id.player1ThirdCard);
        //  Animation sunRiseAnimation2 = AnimationUtils.loadAnimation(this, R.anim.animation);
        sunImageView2.startAnimation(sunRiseAnimation);

        ImageView sunImageView3 = (ImageView) findViewById(R.id.player1FourthCard);
        // Animation sunRiseAnimation3 = AnimationUtils.loadAnimation(this, R.anim.animation);
        sunImageView3.startAnimation(sunRiseAnimation);

        hand1Details = new ArrayList<String>();
        Player1AllIcons = new ArrayList<String>();

        ArrayList<ImageView> player1CardIconImageViews = new ArrayList<>();
        player1CardIconImageViews.add(player1FirstCardImage);
        player1CardIconImageViews.add(player1SecondCardImage);
        player1CardIconImageViews.add(player1ThirdCardImage);
        player1CardIconImageViews.add(player1FourthCardImage);

        int imageViewIndex = 0;

        if(player1Hand != null && player1Hand.size() == 4) return;

        player1Hand = game.dealPlayer1Card();
        player1DealtCardRank = game.getplayer1DealtCardRank();
        player1DealtCardSuit = game.getplayer1DealtCardSuit();

        for (Card card:player1Hand) {
            Suit suit = card.getSuit();
            Rank rank = card.getRank();
            int cardValue = card.getValue(rank);

            player1CardDetails = rank + " of " + suit;
            player1EachIcon = card.getCardIcon(player1CardDetails);

            setCardImage(player1EachIcon, player1CardIconImageViews.get(imageViewIndex));
            imageViewIndex++;

            Player1AllIcons.add(player1EachIcon);
            hand1Details.add(player1CardDetails);
        }
        for (String player1Card: hand1Details) {
            System.out.println("Player 1 card in hand is: "+player1Card);
        }
    }

    public void onPlayer2ButtonClick(View view) {

        ImageView sunImageView4 = (ImageView) findViewById(R.id.player2FirstCard);
        Animation sunRiseAnimation2 = AnimationUtils.loadAnimation(this, R.anim.animation);
        sunImageView4.startAnimation(sunRiseAnimation2);


        ImageView sunImageView5 = (ImageView) findViewById(R.id.player2SecondCard);
        //  Animation sunRiseAnimation5 = AnimationUtils.loadAnimation(this, R.anim.animation);
        sunImageView5.startAnimation(sunRiseAnimation2);

        ImageView sunImageView6 = (ImageView) findViewById(R.id.player2ThirdCard);
        // Animation sunRiseAnimation6 = AnimationUtils.loadAnimation(this, R.anim.animation);
        sunImageView6.startAnimation(sunRiseAnimation2);

        ImageView sunImageView7 = (ImageView) findViewById(R.id.player2FourthCard);
        //  Animation sunRiseAnimation7 = AnimationUtils.loadAnimation(this, R.anim.animation);
        sunImageView7.startAnimation(sunRiseAnimation2);

        hand2Details = new ArrayList<String>();
        Player2AllIcons = new ArrayList<String>();

        ArrayList<ImageView> player2CardIconImageViews = new ArrayList<>();
        player2CardIconImageViews.add(player2FirstCardImage);
        player2CardIconImageViews.add(player2SecondCardImage);
        player2CardIconImageViews.add(player2ThirdCardImage);
        player2CardIconImageViews.add(player2FourthCardImage);

        int imageViewIndex = 0;

        if(player2Hand != null && player2Hand.size() == 4) return;

        player2Hand = game.dealPlayer2Card();
        player2DealtCardRank = game.getplayer2DealtCardRank();
        player2DealtCardSuit = game.getplayer2DealtCardSuit();

        for (Card card:player2Hand) {
            Suit suit = card.getSuit();
            Rank rank = card.getRank();
            int cardValue = card.getValue(rank);

            player2CardDetails = rank + " of " + suit;
            player2EachIcon = card.getCardIcon(player2CardDetails);

            setCardImage(player2EachIcon, player2CardIconImageViews.get(imageViewIndex));
            imageViewIndex++;

            Player2AllIcons.add(player2EachIcon);
            hand2Details.add(player2CardDetails);
        }
    }

    public void onResultButtonClick(View view) {
        dbHelper2 = new DBsecond(this);
        database = dbHelper2.getWritableDatabase();

        player1HandNewValue = game.getPlayer1HandNewValue();
        player2HandNewValue = game.getPlayer2HandNewValue();
        ContentValues contentValues = new ContentValues();
        String outcome = game.getResult(player1HandNewValue, player2HandNewValue);

        contentValues.put(DBsecond.KEY_NAME, outcome);
        database.insert(DBsecond.TABLE_CONTACTS, null, contentValues);
        textResult.setText(outcome);

    }

    public void onPlayAgainButtonClick(View view) {
        ArrayList<Card> player1Hand = new ArrayList<Card>();
        ArrayList<Card> player2Hand = new ArrayList<Card>();
        ArrayList<ImageView> player1CardIconImageViews = new ArrayList<>();
        ArrayList<ImageView> player2CardIconImageViews = new ArrayList<>(); }

    public void setCardImage(String card, ImageView imageView) {
        //card param example= "ace_of_spades"
        int imageId = getResources().getIdentifier(card, "drawable", getPackageName());
        imageView.setImageResource(imageId);
    }

}




