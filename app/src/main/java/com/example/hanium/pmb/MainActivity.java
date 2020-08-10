package com.example.hanium.pmb;

import android.app.SearchManager;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.content.res.AssetManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e(TAG, "onCreate in MainActivity");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBackButtonClick(View v){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);

    }
    public void PMB_CHATHOME_Clicked(View v){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void PMB_CHATBOT_Clicked(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://pf.kakao.com/_SfxnZj/chat"));
        startActivity(intent);
    }
    public void List_Clicked(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ypbooks.co.kr/book_arrange.yp?targetpage=book_week_best&pagetype=5&depth=1"));
        startActivity(intent);
    }

    public void saying_Clicked(View v){
        Intent intent = new Intent(this, SayingActivity.class);
        startActivity(intent);
    }

    public void Search_Clicked(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bookcube.com"));
        startActivity(intent);
    }

}
