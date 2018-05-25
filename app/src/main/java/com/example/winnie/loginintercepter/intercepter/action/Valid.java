package com.example.winnie.loginintercepter.intercepter.action;

/**
 * Created by winnie on 2018/1/3.
 */

public interface Valid {

    /**
     * 是否满足检验器的要求，如果不满足的话，则执行doValid()方法。如果满足，则执行目标action.call
     * @return
     */
    boolean check();

    //去执行验证前置行为，例如跳转到登录界面。（但并未完成验证。）
    void doValid();
}
