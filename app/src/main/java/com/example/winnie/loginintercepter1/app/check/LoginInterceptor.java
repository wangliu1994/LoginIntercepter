package com.example.winnie.loginintercepter1.app.check;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.example.winnie.UserConfigCache;
import com.example.winnie.loginintercepter1.app.activity.LoginActivity;
import com.example.winnie.loginintercepter1.itercepter.Interceptor;

/**
 * Created by winnie on 2018/1/4.
 */

public class LoginInterceptor extends Interceptor{
    @Override
    public int getRequestCode() {
        return LoginActivity.REQUEST_LOGIN_CODE;
    }

    @Override
    public boolean isSatisfied(Context context) {
        return UserConfigCache.isLogin(context);
    }

    @Override
    public void process(Activity activity) {
        activity.startActivityForResult(new Intent(activity, LoginActivity.class), getRequestCode());
    }
}
