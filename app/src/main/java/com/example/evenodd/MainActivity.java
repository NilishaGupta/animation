package com.example.evenodd;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button b;
    EditText e;
    static int num;
    LinearLayout l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l=findViewById(R.id.l1);
        AnimationDrawable a= (AnimationDrawable) l.getBackground();
        a.setEnterFadeDuration(2000);
        a.setExitFadeDuration(4000);
        a.start();
        e=findViewById(R.id.e1);
        b=findViewById(R.id.but);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
Intent i=new Intent(MainActivity.this,evod.class);
startActivity(i);
                num=Integer.parseInt(e.getText().toString());

            }
        });
    }
}
