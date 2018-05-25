package com.example.winnie.loginintercepter.app.valid;

import android.content.Context;
import android.content.Intent;

import com.example.winnie.UserConfigCache;
import com.example.winnie.loginintercepter.app.activity.DiscountActivity;
import com.example.winnie.loginintercepter.intercepter.action.Valid;

/**
 * Created by winnie on 2018/1/3.
 */

public class DiscountValid implements Valid {
    private Context context;

    public DiscountValid(Context context) {
        this.context = context;
    }

    @Override
    public boolean check() {
        return UserConfigCache.isDiscount(context);
    }

    @Override
    public void doValid() {
        context.startActivity(new Intent(context, DiscountActivity.class));
    }
}
