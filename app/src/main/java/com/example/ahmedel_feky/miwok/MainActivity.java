package com.example.ahmedel_feky.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* **
        For NumbersActivity Lstener!.
         */
        //find the view that shows the number category
        TextView numbers = (TextView) findViewById(R.id.numbers);
        //set a click listener on that view
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create a new intent to open the (@link NumbersActivity}
                Intent numberintent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numberintent);
            }
        });
        /************
        For  FamilyActivity Listener!.
        *
         * * */

        //find the view that shows the family category
        TextView family = (TextView) findViewById(R.id.family);
        //set a click listener on that view
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create a new intent to open the (@link Family Activity}
                Intent familyintent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyintent);
            }
        });
                 /*******
                 For ColorsActivity Listener!.
                   *****
                   * */
        //find the view that shows the Colors category
        TextView colors = (TextView) findViewById(R.id.colors);
        //set a click listener on that view
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create a new intent to open the (@link Colors Activity}
                Intent colorsintent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsintent);
            }
        });
        /*****
        For Phrases Activity Listener!.
         ****/
        //find the view that shows the phrases category
        TextView phrases = (TextView) findViewById(R.id.phrases);
        //set a click listener on that view
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create a new intent to open the (@link NumbersActivity}
                Intent phrasesintent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesintent);
            }
        });

    }
}