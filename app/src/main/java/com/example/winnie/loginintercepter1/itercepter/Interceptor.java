package com.example.winnie.loginintercepter1.itercepter;

import android.app.Activity;
import android.content.Context;

/**
 * Created by winnie on 2018/1/4.
 */

public abstract class Interceptor {

    /**
     * Request code used to start activity for result.
     *
     * @return request code
     */
    public abstract int getRequestCode();

    /**
     * Check interceptor's condition is meet or no.
     *
     * @param context Android context
     * @return condition is meet or no
     */
    public abstract boolean isSatisfied(Context context);

    /**
     * if condition was not satisfied, it'll be called to acquire resource or permission and so on.
     *
     * @param activity see {@link Activity}
     */
    public abstract void process(Activity activity);


}
