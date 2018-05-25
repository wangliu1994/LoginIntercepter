package com.example.winnie.loginintercepter1.itercepter.annotation;

/**
 * Created by winnie on 2018/1/3.
 */

import com.example.winnie.loginintercepter1.itercepter.Interceptor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 这里只能用于无参数的valid模型。
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface InterceptWith {

    Class<? extends Interceptor>[] value() default{ };
}
