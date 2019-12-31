package com.example.randombackground;


import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Handler mHandler = new Handler();
    Boolean on=false;
Button button;
View lay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        lay=findViewById(R.id.lay);
    }

    public void changeColor(View v)
    {
        if(on==false) {
            delayer.run();
            on=true;
        }
        else {
            mHandler.removeCallbacks(delayer);
            on=false;
        }
    }

    private Runnable delayer = new Runnable() {
        @Override
        public void run() {

            Random rand=new Random();
                int a=rand.nextInt();
                int r=rand.nextInt();
                int g=rand.nextInt();
                int b=rand.nextInt();
                mHandler.postDelayed(this, 300);
                lay.setBackgroundColor(Color.argb(a, r, g, b));

        }
    };

}
