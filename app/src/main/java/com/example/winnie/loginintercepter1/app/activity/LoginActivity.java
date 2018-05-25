package com.example.winnie.loginintercepter1.app.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.example.winnie.UserConfigCache;
import com.example.winnie.loginintercepter.R;
import com.example.winnie.loginintercepter1.app.base.BaseActivity;

/**
 * Created by winnie on 2018/1/3.
 */
public class LoginActivity extends BaseActivity {

    public static final int REQUEST_LOGIN_CODE = 10001;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void login(View view) {
        Toast.makeText(LoginActivity.this,"登录成功",Toast.LENGTH_SHORT).show();
        UserConfigCache.setLogin(LoginActivity.this, true);
        //这里继续
        setResult(RESULT_OK);
        finish();
    }
}
