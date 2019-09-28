package com.example.evenodd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.evenodd.MainActivity.num;

public class evod extends AppCompatActivity {
    EditText en;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evod);

        en=findViewById(R.id.en);

        if(num % 2 == 0)
        {
            Toast.makeText(evod.this,num+""+"even number"
                    , Toast.LENGTH_SHORT).show();

            en.setText("even number");
        }
        else
        {
            Toast.makeText(evod.this,num+""+"odd number"
                    , Toast.LENGTH_SHORT).show();
            en.setText("odd number");
        }
    }
}
