package com.whatsapp.notification;

import X.AnonymousClass002;
import X.AnonymousClass2A1;
import X.AnonymousClass3XI;
import X.C107695bk;
import X.C72303dV;
import X.C86614Ku;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

public class MissedCallNotificationDismissedReceiver extends BroadcastReceiver {
    public C72303dV A00;
    public AnonymousClass3XI A01;
    public final Object A02;
    public volatile boolean A03;

    public void onReceive(Context context, Intent intent) {
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    C107695bk A002 = AnonymousClass2A1.A00(context);
                    this.A00 = C86614Ku.A0a(A002.ACP);
                    this.A01 = (AnonymousClass3XI) A002.A7g.get();
                    this.A03 = true;
                }
            }
        }
        Log.i("missedcallnotification/dismiss");
        C72303dV r0 = this.A00;
        r0.A05();
        if (r0.A09) {
            this.A01.A02();
        }
    }

    public MissedCallNotificationDismissedReceiver(int i) {
        this.A03 = false;
        this.A02 = AnonymousClass002.A0D();
    }

    public MissedCallNotificationDismissedReceiver() {
        this(0);
    }
}
