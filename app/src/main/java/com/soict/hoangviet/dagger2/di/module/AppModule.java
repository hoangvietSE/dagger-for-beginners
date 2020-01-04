package com.soict.hoangviet.dagger2.di.module;

import android.content.Context;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Provides
    Context provideContext() {
        return context;
    }

    @Provides
    @Named("BaseUrl")
    @Singleton
    public String provideBaseUrl() {
        return "http://dagger.com/api/v1";
    }

    @Provides
    @Named("AppVersion")
    @Singleton
    public String provideAppVersion() {
        return "2.1.0";
    }
}
