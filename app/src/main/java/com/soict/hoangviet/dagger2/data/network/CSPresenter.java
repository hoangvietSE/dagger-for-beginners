package com.soict.hoangviet.dagger2.data.network;

import android.content.Context;
import android.util.Log;

public class CSPresenter implements ICSPresenter {
    private static final String TAG = "Dagger2";
    private Context context;

    private IChatInteractor mIChatInteractor;

    public CSPresenter(Context context, IChatInteractor mIChatInteractor) {
        this.context = context;
        this.mIChatInteractor = mIChatInteractor;
    }

    @Override
    public void sendMessage(String msg) {
        Log.d(TAG, "sendMessage: msg");
    }
}
