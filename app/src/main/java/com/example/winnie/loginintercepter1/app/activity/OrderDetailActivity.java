package com.example.winnie.loginintercepter1.app.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.example.winnie.loginintercepter.R;
import com.example.winnie.loginintercepter1.app.base.BaseActivity;
import com.example.winnie.loginintercepter1.app.check.DiscountInterceptor;
import com.example.winnie.loginintercepter1.app.check.LoginInterceptor;
import com.example.winnie.loginintercepter1.itercepter.annotation.InterceptWith;

/**
 * Created by winnie on 2018/1/3.
 */
@InterceptWith({LoginInterceptor.class, DiscountInterceptor.class})
public class OrderDetailActivity extends BaseActivity {
    private static final String EXTRA_ORDER_ID = "orderId";

    private TextView mOrderInfoText;
    private String mOrderId;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        mOrderId = getIntent().getStringExtra(EXTRA_ORDER_ID);
        mOrderInfoText = (TextView) findViewById(R.id.order_detail);
    }
}
