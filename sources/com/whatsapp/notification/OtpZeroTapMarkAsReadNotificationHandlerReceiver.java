package com.whatsapp.notification;

import X.AnonymousClass002;
import X.AnonymousClass2A1;
import X.AnonymousClass4FS;
import X.C18270x1;
import X.C54122oD;
import X.C55832qz;
import X.C614030o;
import X.C70313aI;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class OtpZeroTapMarkAsReadNotificationHandlerReceiver extends BroadcastReceiver {
    public C54122oD A00;
    public C614030o A01;
    public C55832qz A02;
    public AnonymousClass4FS A03;
    public final Object A04;
    public volatile boolean A05;

    public void onReceive(Context context, Intent intent) {
        if (!this.A05) {
            synchronized (this.A04) {
                if (!this.A05) {
                    AnonymousClass2A1.A00(context).ARS(this);
                    this.A05 = true;
                }
            }
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra("extra_remote_jid");
            String stringExtra2 = intent.getStringExtra("extra_message_key_id");
            if (stringExtra != null && stringExtra2 != null) {
                AnonymousClass4FS r2 = this.A03;
                if (r2 != null) {
                    r2.BkM(new C70313aI(this, stringExtra2, stringExtra, 12));
                    return;
                }
                throw C18270x1.A0S("waWorkers");
            }
        }
    }

    public OtpZeroTapMarkAsReadNotificationHandlerReceiver(int i) {
        this.A05 = false;
        this.A04 = AnonymousClass002.A0D();
    }

    public OtpZeroTapMarkAsReadNotificationHandlerReceiver() {
        this(0);
    }
}
