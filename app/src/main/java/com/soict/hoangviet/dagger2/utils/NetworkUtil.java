package com.soict.hoangviet.dagger2.utils;

import android.content.Context;

import com.soict.hoangviet.dagger2.custom.NetworkChannel;

import javax.inject.Inject;

public class NetworkUtil {
    private Context context;
    private NetworkChannel networkChannel;

    public NetworkUtil(Context context, NetworkChannel networkChannel) {
        this.context = context;
        this.networkChannel = networkChannel;
    }

    public void callApiAddToCart() {
        networkChannel.callApiAddToCart();
    }
}
