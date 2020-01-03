package com.soict.hoangviet.dagger2.di.component;

import android.content.Context;

import com.soict.hoangviet.dagger2.data.network.IDataRepository;
import com.soict.hoangviet.dagger2.di.module.AppModule;
import com.soict.hoangviet.dagger2.di.module.DataModule;
import com.soict.hoangviet.dagger2.di.module.ReceiverModule;
import com.soict.hoangviet.dagger2.di.module.UtilsModule;
import com.soict.hoangviet.dagger2.ui.MainActivity;
import com.soict.hoangviet.dagger2.utils.NetworkUtil;
import com.soict.hoangviet.dagger2.utils.RxUtilsAbs;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {
        AppModule.class,
        ReceiverModule.class,
        UtilsModule.class,
        DataModule.class
})
@Singleton
public interface AppComponent {
    Context context();

    RxUtilsAbs rxUtilsAbs();

    NetworkUtil networkUtil();

    IDataRepository iDataRepository();

}
