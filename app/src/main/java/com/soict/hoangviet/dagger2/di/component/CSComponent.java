package com.soict.hoangviet.dagger2.di.component;

import com.soict.hoangviet.dagger2.di.ChatScreenScope;
import com.soict.hoangviet.dagger2.di.module.CSModule;
import com.soict.hoangviet.dagger2.ui.MainActivity;

import dagger.Component;

@Component(dependencies = ChatComponent.class,
        modules = {CSModule.class})
@ChatScreenScope
public interface CSComponent {
    void inject(MainActivity mainActivity);
}
