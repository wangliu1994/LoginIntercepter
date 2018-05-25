package com.example.winnie.loginintercepter1.app.check;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.example.winnie.UserConfigCache;
import com.example.winnie.loginintercepter1.app.activity.DiscountActivity;
import com.example.winnie.loginintercepter1.itercepter.Interceptor;

/**
 * Created by winnie on 2018/1/4.
 */

public class DiscountInterceptor extends Interceptor{
    @Override
    public int getRequestCode() {
        return DiscountActivity.REQUEST_DISCOUNT_CODE;
    }

    @Override
    public boolean isSatisfied(Context context) {
        return UserConfigCache.isDiscount(context);
    }

    @Override
    public void process(Activity activity) {
        activity.startActivityForResult(new Intent(activity, DiscountActivity.class), getRequestCode());
    }
}
