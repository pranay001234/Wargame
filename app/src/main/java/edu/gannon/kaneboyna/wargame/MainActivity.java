package edu.gannon.kaneboyna.wargame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void deal(View view) {
        ImageView Ivcard1 = findViewById(R.id.card1);
        ImageView Ivcard2 = findViewById(R.id.card2);


             PlayingCard card1 = PlayingCard.getRandomCard();
             PlayingCard card2 = PlayingCard.getRandomCard();


            //PlayingCard car1 = Playing

            int drawableId1 = getResources().getIdentifier(
                    card1.getNameForRank("card%d"),
                    "drawable",
                    "edu.gannon.kaneboyna.wargame"
            );
        int drawableId2 = getResources().getIdentifier(
                card1.getNameForRank("card%d"),
                "drawable",
                "edu.gannon.kaneboyna.wargame"
        );


           // Log.d("random Number", randomNumber1 + "");
          //  Log.d("random Number", randomNumber2 + "");

        Ivcard1.setImageDrawable(getDrawable(drawableId1));
        Ivcard2.setImageDrawable(getDrawable(drawableId2));

    }
}