package com.soict.hoangviet.dagger2.di.module;

import android.content.Context;

import com.soict.hoangviet.dagger2.data.network.ChatInteractor;
import com.soict.hoangviet.dagger2.data.network.ChatStateController;
import com.soict.hoangviet.dagger2.data.network.IChatInteractor;
import com.soict.hoangviet.dagger2.data.network.IChatStateController;
import com.soict.hoangviet.dagger2.data.network.IDataRepository;
import com.soict.hoangviet.dagger2.di.ChatScope;
import com.soict.hoangviet.dagger2.utils.RxUtilsAbs;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ChatModule {

    @Provides
    @ChatScope
    public IChatInteractor provideIChatInteractor(Context context, IDataRepository mIDataRepository, IChatStateController mIChatStateController) {
        return new ChatInteractor(context, mIDataRepository, mIChatStateController);
    }

    @Provides
    @ChatScope
    public IChatStateController provideIChatStateController(RxUtilsAbs rxUtilsAbs) {
        return new ChatStateController(rxUtilsAbs);
    }
}
