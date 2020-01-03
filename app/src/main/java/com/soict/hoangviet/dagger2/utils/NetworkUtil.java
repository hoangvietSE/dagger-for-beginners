package com.soict.hoangviet.dagger2.utils;

import android.content.Context;

import com.soict.hoangviet.dagger2.data.network.NetworkChannel;

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
