package com.soict.hoangviet.dagger2.di.module;

import com.soict.hoangviet.dagger2.data.network.DataRepository;
import com.soict.hoangviet.dagger2.data.network.IDataRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DataModule {

    @Provides
    @Singleton
    public IDataRepository provideIDataRepository() {
        return new DataRepository();
    }
}
