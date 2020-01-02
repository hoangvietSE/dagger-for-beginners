package com.soict.hoangviet.dagger2.di.component;

import com.soict.hoangviet.dagger2.application.BaseApplication;
import com.soict.hoangviet.dagger2.di.module.AppModule;
import com.soict.hoangviet.dagger2.di.module.ReceiverModule;
import com.soict.hoangviet.dagger2.di.module.UtilsModule;
import com.soict.hoangviet.dagger2.ui.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {
        AppModule.class,
        ReceiverModule.class,
        UtilsModule.class
})
@Singleton
public interface AppComponent {

    void inject(MainActivity mainActivity);
}
