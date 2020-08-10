package com.example.hanium.pmb;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.support.v7.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private String TAG = HomeActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e(TAG, "onCreate in HomeActivity");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void yes24click(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.yes24.com"));
        startActivity(intent);
    }

    public void aladinclick(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.aladin.co.kr"));
        startActivity(intent);
    }

    public void kyobobookclick(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kyobobook.co.kr"));
        startActivity(intent);
    }

    public void naverbookclick(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://book.naver.com/index.nhn"));
        startActivity(intent);
    }

}
