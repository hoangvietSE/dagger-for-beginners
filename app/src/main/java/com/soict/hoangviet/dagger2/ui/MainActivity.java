package com.soict.hoangviet.dagger2.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.soict.hoangviet.dagger2.R;
import com.soict.hoangviet.dagger2.application.BaseApplication;
import com.soict.hoangviet.dagger2.data.network.ICSPresenter;
import com.soict.hoangviet.dagger2.di.component.AppComponent;
import com.soict.hoangviet.dagger2.di.component.CSComponent;
import com.soict.hoangviet.dagger2.di.component.ChatComponent;
import com.soict.hoangviet.dagger2.di.component.DaggerCSComponent;
import com.soict.hoangviet.dagger2.di.component.DaggerChatComponent;

import java.util.concurrent.Executor;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {

//    @Inject
//    RxUtilsAbs rxUtil;
//
//    @Inject
//    NetworkUtil networkUtil;

    @Inject
    ICSPresenter presenter;

    @Inject
    @Named("BaseUrl")
    String baseUrl;

    @Inject
    @Named("AppVersion")
    String appVersion;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppComponent appComponent = ((BaseApplication) getApplication()).getAppComponent();
        ChatComponent chatComponent = DaggerChatComponent.builder().appComponent(appComponent).build();
        CSComponent csComponent = DaggerCSComponent.builder().chatComponent(chatComponent).build();
        csComponent.inject(this);
//        appComponent.inject(this);
//        doSomeNetworkCall();
        sendMessage();
    }

    private void sendMessage() {
        presenter.sendMessage("");
    }

    private void doSomeNetworkCall() {
//        networkUtil.callApiAddToCart();
//        rxUtil.observerOn();
//        rxUtil.subscribeOn();
    }
}
