package com.soict.hoangviet.dagger2.di.module;

import android.content.Context;

import com.soict.hoangviet.dagger2.data.network.NetworkChannel;
import com.soict.hoangviet.dagger2.utils.NetworkUtil;
import com.soict.hoangviet.dagger2.utils.RxUtil;
import com.soict.hoangviet.dagger2.utils.RxUtilsAbs;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class UtilsModule {

    @Provides
    @Singleton
    RxUtilsAbs provideRxUtilsAbs(Context context) {
        return new RxUtil(context);
    }

    @Provides
    @Singleton
    NetworkUtil provideNetworkUtil(Context context, NetworkChannel networkChannel) {
        return new NetworkUtil(context, networkChannel);
    }
}
