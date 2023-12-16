package com.whatsapp;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass00W;
import X.AnonymousClass2A1;
import X.C18260x0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

public class AlarmBroadcastReceiver extends BroadcastReceiver {
    public final Object A00;
    public volatile boolean A01;

    public void onReceive(Context context, Intent intent) {
        if (!this.A01) {
            synchronized (this.A00) {
                if (!this.A01) {
                    AnonymousClass2A1.A01(context);
                    this.A01 = true;
                }
            }
        }
        Class<AlarmService> cls = AlarmService.class;
        Intent intent2 = new Intent(intent).setClass(context, cls);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AlarmBroadcastReceiver dispatching to AlarmService; intent=");
        A0o.append(intent);
        A0o.append("; elapsedRealtime=");
        C18260x0.A1I(A0o, SystemClock.elapsedRealtime());
        AnonymousClass00W.A00(context, intent2, cls, 3);
    }

    public AlarmBroadcastReceiver(int i) {
        this.A01 = false;
        this.A00 = AnonymousClass002.A0D();
    }

    public AlarmBroadcastReceiver() {
        this(0);
    }
}
