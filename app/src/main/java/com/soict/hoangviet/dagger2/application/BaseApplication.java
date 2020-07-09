package com.soict.hoangviet.dagger2.application;

import android.app.Application;

import com.soict.hoangviet.dagger2.di.component.AppComponent;
import com.soict.hoangviet.dagger2.di.component.DaggerAppComponent;
import com.soict.hoangviet.dagger2.di.module.AppModule;

public class BaseApplication extends Application {

    private AppComponent appComponent;

    public AppComponent getAppComponent() {
        return appComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = buildComponent();
    }

    private AppComponent buildComponent() {
        return DaggerAppComponent.builder()
                .application(this)
                .build();
    }
}
