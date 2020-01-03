package com.soict.hoangviet.dagger2.data.network;

import com.soict.hoangviet.dagger2.utils.RxUtilsAbs;

public class ChatStateController implements IChatStateController {
    private RxUtilsAbs rxUtilsAbs;

    public ChatStateController(RxUtilsAbs rxUtilsAbs) {
        this.rxUtilsAbs = rxUtilsAbs;
    }
}
