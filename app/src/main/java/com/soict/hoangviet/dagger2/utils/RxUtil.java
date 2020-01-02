package com.soict.hoangviet.dagger2.utils;

import android.content.Context;
import android.util.Log;

import javax.inject.Inject;

public class RxUtil implements RxUtilsAbs {
    private static final String TAG = "Dagger2";
    private Context context;

    public RxUtil(Context context) {
        this.context = context;
    }

    @Override
    public void observerOn() {
        Log.d(TAG, "observerOn: AndroidScheduler.mainThread()");
    }

    @Override
    public void subscribeOn() {
        Log.d(TAG, "subscribeOn: Scheduler.io()");
    }
}
