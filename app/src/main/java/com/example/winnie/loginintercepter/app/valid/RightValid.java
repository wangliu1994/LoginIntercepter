package com.example.winnie.loginintercepter.app.valid;

import android.content.Context;
import android.widget.Toast;

import com.example.winnie.loginintercepter.intercepter.action.ActionManager;
import com.example.winnie.loginintercepter.intercepter.action.Valid;

/**
 * Created by winnie on 2018/1/3.
 */

public class RightValid implements Valid {

    String right;
    String page;
    Context context;

    public RightValid(Context context, String right, String page) {
        this.right = right;
        this.page = page;
        this.context = context;
    }

    @Override
    public boolean check() {
        if(right.equals("2") && page.equals("order")){
            return true;
        }
        return false;
    }

    @Override
    public void doValid() {
        Toast.makeText(context, String.format("没有%s界面的权限",page),Toast.LENGTH_SHORT).show();
        right = "2";
        page = "order";

        Toast.makeText(context, String.format("获得%s界面的权限",page),Toast.LENGTH_SHORT).show();
        ActionManager.instance().checkValid();
    }
}