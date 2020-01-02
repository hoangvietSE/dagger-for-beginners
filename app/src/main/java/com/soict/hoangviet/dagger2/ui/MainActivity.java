package com.soict.hoangviet.dagger2.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.soict.hoangviet.dagger2.R;
import com.soict.hoangviet.dagger2.application.BaseApplication;
import com.soict.hoangviet.dagger2.di.component.AppComponent;
import com.soict.hoangviet.dagger2.utils.NetworkUtil;
import com.soict.hoangviet.dagger2.utils.RxUtil;
import com.soict.hoangviet.dagger2.utils.RxUtilsAbs;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    RxUtilsAbs rxUtil;

    @Inject
    NetworkUtil networkUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppComponent appComponent = ((BaseApplication) getApplication()).getAppComponent();
        appComponent.inject(this);
        doSomeNetworkCall();
    }

    private void doSomeNetworkCall() {
        networkUtil.callApiAddToCart();
        rxUtil.observerOn();
        rxUtil.subscribeOn();
    }
}
