package com.example.princesstest;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class QuestionActivity extends AppCompatActivity {

    private Button btnForward;
    private int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        init();
        setFragment(new Q1fragment());
        setBtnClick();



    }
    @Override
    public void onBackPressed() {
//        super.onBackPressed();
    }

    private void init(){
        btnForward = findViewById(R.id.forward);
    }

    private void setFragment(Fragment frg){

        FragmentManager fm  = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        if(fragmentTransaction!=null){
            fragmentTransaction.replace(R.id.fragment_container_view, frg);
        } else{
            fragmentTransaction.add(R.id.fragment_container_view, frg);
        }
        fragmentTransaction.commit();
    }

    private void setBtnClick(){
        btnForward.setOnClickListener(view -> {
            count++;
            switchFragment();
        });
    }

    private void switchFragment(){
        Fragment fr;

        if(count == 2){
            fr = new Q2fragment();
            setFragment(fr);
        } else if(count==3){
            fr = new Q3fragment();
            setFragment(fr);
        } else{
            Intent intent = new Intent(this, ResultActivity.class);
            startActivity(intent);
        }


    }

}
