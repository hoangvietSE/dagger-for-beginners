package com.soict.hoangviet.dagger2.data.network;

import android.content.Context;

public class ChatInteractor implements IChatInteractor {
    private Context context;
    private IDataRepository mIDataRepository;
    private IChatStateController mIChatStateController;

    public ChatInteractor(Context context, IDataRepository mIDataRepository, IChatStateController mIChatStateController) {
        this.context = context;
        this.mIDataRepository = mIDataRepository;
        this.mIChatStateController = mIChatStateController;
    }
}
