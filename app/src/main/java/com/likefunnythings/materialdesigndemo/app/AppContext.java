package com.likefunnythings.materialdesigndemo.app;

import android.app.Application;

import com.likefunnythings.materialdesigndemo.app.util.LogUtils;

/**
 * Globle Context
 *
 * Created by Administrator on 2015/12/3.
 */
public class AppContext extends Application{

    private static final String TAG = AppContext.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();

        LogUtils.i(TAG, "======>>>AppContext onCreate");
    }
}
