package com.arunamedia.devs.coorir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

import com.jaeger.library.StatusBarUtil;

public class MainActivity extends AppCompatActivity {
    private CardView order,promo,profil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        StatusBarUtil.setTranslucent(MainActivity.this, 65);

        order = (CardView) findViewById(R.id.fooddrink);
        promo = (CardView) findViewById(R.id.promo);
        profil = (CardView) findViewById(R.id.profil);

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
}
