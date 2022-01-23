package com.example.princesstest;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {
    private Button btnRetest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        init();
        setClick();

    }
    @Override
    public void onBackPressed() {
//        super.onBackPressed();
    }

    private void init(){
        btnRetest = findViewById(R.id.btnStart);
    }

    private void setClick(){
        btnRetest.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });
    }
}
