package com.example.funweather;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class test extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twoday);
    }

    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
//            case R.id.exit_bt:
//                //保存登录状态为false到SharedPreferences
//                SharedPreferences mSharedPreferences = getSharedPreferences("LoginState", Context.MODE_PRIVATE);
//                SharedPreferences.Editor editor = mSharedPreferences.edit();
//                editor.putBoolean("IsLogin",false);
//                editor.apply();
//
//                intent = new Intent(SettingActivity.this, LoginActivity.class);
//                startActivity(intent);
//                break;
        }
    }


    public void onClickBack(View v) {
        // TODO Auto-generated method stub
        this.finish();
    }
}

