package com.example.princesstest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        touch();

    }
    @Override
    public void onBackPressed() {
//        super.onBackPressed();
    }

    private void init(){
        btnStart = findViewById(R.id.btnStart);
    }
    private void touch(){
        btnStart.setOnClickListener(view -> {
            Intent intent = new Intent(this, QuestionActivity.class);
            startActivity(intent);
        });
    }
}