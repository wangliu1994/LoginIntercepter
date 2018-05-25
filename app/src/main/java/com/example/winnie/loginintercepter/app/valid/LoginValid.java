package com.example.winnie.loginintercepter.app.valid;

import android.content.Context;
import android.content.Intent;

import com.example.winnie.UserConfigCache;
import com.example.winnie.loginintercepter.app.activity.LoginActivity;
import com.example.winnie.loginintercepter.intercepter.action.Valid;

/**
 * Created by winnie on 2018/1/3.
 */

public class LoginValid implements Valid {
    private Context context;

    public LoginValid(Context context) {
        this.context = context;
    }

    @Override
    public boolean check() {
        return UserConfigCache.isLogin(context);
    }

    @Override
    public void doValid() {
        context.startActivity(new Intent(context, LoginActivity.class));
    }
}
