package com.soict.hoangviet.dagger2.di.component;

import android.content.Context;

import com.soict.hoangviet.dagger2.data.network.IChatInteractor;
import com.soict.hoangviet.dagger2.data.network.IChatStateController;
import com.soict.hoangviet.dagger2.di.ChatScope;
import com.soict.hoangviet.dagger2.di.module.ChatModule;

import java.util.concurrent.Executor;

import javax.inject.Named;

import dagger.Component;

@Component(dependencies = AppComponent.class,
        modules = {ChatModule.class})
@ChatScope
public interface ChatComponent {
    Context context();

    IChatInteractor mIChatInteractor();

    IChatStateController mIChatStateController();

    @Named("BaseUrl")
    String baseUrl();

    @Named("AppVersion")
    String appVersion();
}
