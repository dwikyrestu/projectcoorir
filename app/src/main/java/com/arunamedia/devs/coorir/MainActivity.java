package com.arunamedia.devs.coorir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.jaeger.library.StatusBarUtil;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private CardView order,promo,profil;
    private TextView greeting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        StatusBarUtil.setTranslucent(MainActivity.this, 65);

        order = (CardView) findViewById(R.id.fooddrink);
        promo = (CardView) findViewById(R.id.promo);
        profil = (CardView) findViewById(R.id.profil);
        greeting = (TextView) findViewById(R.id.tVgreeting);

        greeting.setText(getGreeting());

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This is Order Page!",Toast.LENGTH_LONG).show();
            }
        });

        promo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This is Promo Page!",Toast.LENGTH_LONG).show();
            }
        });

        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This is Profil Page!",Toast.LENGTH_LONG).show();
            }
        });

    }

    public String getGreeting(){
        String greeting = null;
        Date dt = new Date();
        int hours = dt.getHours();
        int min = dt.getMinutes();
        if(hours>=1 && hours<=12){
            greeting = "Selamat Pagi";
        } else if(hours>=12 && hours<=16){
            greeting = "Selamat Siang";
        } else if(hours>=16 && hours<=18){
            greeting = "Selamat Sore";
        } else if(hours>=18 && hours<=24){
            greeting = "Selamat Malam";
        }
        return greeting;
    }
}
