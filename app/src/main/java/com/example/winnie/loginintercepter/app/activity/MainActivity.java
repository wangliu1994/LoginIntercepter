package com.example.winnie.loginintercepter.app.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.winnie.loginintercepter.R;
import com.example.winnie.UserConfigCache;
import com.example.winnie.loginintercepter.app.base.BaseActivity;
import com.example.winnie.loginintercepter.app.valid.DiscountValid;
import com.example.winnie.loginintercepter.app.valid.LoginValid;
import com.example.winnie.loginintercepter.intercepter.action.Action;
import com.example.winnie.loginintercepter.intercepter.action.CallUnit;
import com.example.winnie.loginintercepter.intercepter.action.SingleCall;
import com.example.winnie.loginintercepter.intercepter.annotation.Interceptor;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void order(View view) {

        CallUnit
                .newInstance(new Action() {
                    @Override
                    public void call() {
                        Intent intent = new Intent(MainActivity.this, OrderDetailActivity.class);
                        startActivity(intent);
                    }
                })
                .addValid(new LoginValid(MainActivity.this))
                .doCall();
//        SingleCall.getInstance()
//                .addAction(new Action() {
//                    @Override
//                    public void call() {
//                        Intent intent = new Intent(MainActivity.this, OrderDetailActivity.class);
//                        startActivity(intent);
//                    }
//                })
//                .addValid(new LoginValid(MainActivity.this))
//                .doCall();
    }

    public void discount(View view) {

        SingleCall.getInstance()
                .addAction(new Action() {
                    @Override
                    public void call() {
                        Intent intent = new Intent(MainActivity.this, OrderDetailActivity.class);
                        startActivity(intent);
                    }
                })
                .addValid(new LoginValid(MainActivity.this))
                .addValid(new DiscountValid(MainActivity.this))
                .doCall();
    }

    public void logout(View view) {
        UserConfigCache.setLogin(MainActivity.this, false);
    }

    public void clearDiscount(View view) {
        UserConfigCache.setDiscount(MainActivity.this, false);
    }
}
