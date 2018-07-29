package com.rahmahnajiyahimtihan.tonguetwister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button easy, medium, hard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        easy = (Button) findViewById(R.id.btneasy);
        medium = (Button) findViewById(R.id.btnmedium);
        hard = (Button) findViewById(R.id.btnhard);

        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent easy = new Intent(getApplicationContext(), ListEasy.class);
                startActivity(easy);
            }
        });

        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent medium = new Intent(getApplicationContext(), Listmedium.class);
                startActivity(medium);
            }
        });

        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h = new Intent(getApplicationContext(), Listhard.class);
                startActivity(h);
            }
        });
    }
}
