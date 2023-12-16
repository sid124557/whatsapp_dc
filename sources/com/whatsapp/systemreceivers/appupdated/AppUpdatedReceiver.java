package com.whatsapp.systemreceivers.appupdated;

import X.AnonymousClass002;
import X.AnonymousClass2A1;
import X.AnonymousClass3DE;
import X.C162457s7;
import X.C18270x1;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

public final class AppUpdatedReceiver extends BroadcastReceiver {
    public AnonymousClass3DE A00;
    public final Object A01;
    public volatile boolean A02;

    public void onReceive(Context context, Intent intent) {
        String str;
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    this.A00 = AnonymousClass2A1.A00(context).APp();
                    this.A02 = true;
                }
            }
        }
        C162457s7.A0J(context, 0);
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"android.intent.action.MY_PACKAGE_REPLACED".equals(str)) {
            return;
        }
        if (this.A00 != null) {
            Log.d("AppUpdatedEventManager: app updated event (via receiver)");
            return;
        }
        throw C18270x1.A0S("appUpdateManager");
    }

    public AppUpdatedReceiver(int i) {
        this.A02 = false;
        this.A01 = AnonymousClass002.A0D();
    }

    public AppUpdatedReceiver() {
        this(0);
    }
}
