package com.soict.hoangviet.dagger2.di.module;

import com.soict.hoangviet.dagger2.custom.NetworkChannel;

import dagger.Module;
import dagger.Provides;

@Module
public class ReceiverModule {

    @Provides
    NetworkChannel provideNetworkChannel() {
        return new NetworkChannel();
    }
}
