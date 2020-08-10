package com.example.hanium.pmb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class SayingActivity extends AppCompatActivity {

    private String TAG = SayingActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e(TAG, "onCreate in SayingActivity");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saying);
    }

    public void reading(View v){
        Toast.makeText(getApplicationContext(),"책을 읽는 것은 첫 신을 신고 발 떼기를 기다리는 것과 같다.",Toast.LENGTH_LONG).show();
    }

    public void life(View v){
        Toast.makeText(getApplicationContext(),"인생은 과감한 모험이던가, 아니면 아무 것도 아니다.",Toast.LENGTH_LONG).show();
    }

    public void effort(View v){
        Toast.makeText(getApplicationContext(),"티끌 모아 태산",Toast.LENGTH_LONG).show();
    }

    public void study(View v){
        Toast.makeText(getApplicationContext(),"교육은 배운 것이 잊혀졌을 때 살아 남는 것이다.",Toast.LENGTH_LONG).show();
    }

    public void challenge(View v){
        Toast.makeText(getApplicationContext(),"가장 큰 위험은 위험없는 삶이다.",Toast.LENGTH_LONG).show();
    }

    public void confidence(View v){
        Toast.makeText(getApplicationContext(),"천재는 거대한 인내일 뿐이다.",Toast.LENGTH_LONG).show();
    }

    public void success(View v){
        Toast.makeText(getApplicationContext(),"작은 기회로부터 종종 위대한 업적이 시작된다.",Toast.LENGTH_LONG).show();
    }

}
