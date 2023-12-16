package com.whatsapp;

import X.AnonymousClass002;
import X.AnonymousClass2A1;
import X.C107575bX;
import X.C18320x8;
import X.C49762h3;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

public class TellAFriendReceiver extends BroadcastReceiver {
    public C49762h3 A00;
    public final Object A01;
    public volatile boolean A02;

    public void onReceive(Context context, Intent intent) {
        ComponentName componentName;
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    AnonymousClass2A1.A00(context).ARA(this);
                    this.A02 = true;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 22 && (componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT")) != null) {
            String packageName = componentName.getPackageName();
            if (!C107575bX.A0F(packageName)) {
                this.A00.A01(Integer.valueOf(C18320x8.A01(intent, "extra_invite_source")), packageName, 2);
            }
        }
    }

    public TellAFriendReceiver(int i) {
        this.A02 = false;
        this.A01 = AnonymousClass002.A0D();
    }

    public TellAFriendReceiver() {
        this(0);
    }
}
