package com.example.winnie.loginintercepter1.app.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.winnie.UserConfigCache;
import com.example.winnie.loginintercepter.R;
import com.example.winnie.loginintercepter1.app.base.BaseActivity;


public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void invoked() {
        super.invoked();

    }

    public void order(View view) {
        startActivity(new Intent(MainActivity.this, OrderDetailActivity.class));
    }

    public void discount(View view) {
        startActivity(new Intent(MainActivity.this, OrderDetailActivity.class));
    }

    public void logout(View view) {
        UserConfigCache.setLogin(MainActivity.this, false);
    }

    public void clearDiscount(View view) {
        UserConfigCache.setDiscount(MainActivity.this, false);
    }
}
