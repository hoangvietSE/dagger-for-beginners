package com.soict.hoangviet.dagger2.di.module;

import android.content.Context;

import com.soict.hoangviet.dagger2.data.network.CSPresenter;
import com.soict.hoangviet.dagger2.data.network.ICSPresenter;
import com.soict.hoangviet.dagger2.data.network.IChatInteractor;
import com.soict.hoangviet.dagger2.di.ChatScreenScope;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class CSModule {

    @Provides
    @ChatScreenScope
    public ICSPresenter provideICSPresenter(Context context, IChatInteractor mIChatInteractor) {
        return new CSPresenter(context, mIChatInteractor);
    }

}
