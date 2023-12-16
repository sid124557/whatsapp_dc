package com.whatsapp.notification;

import X.AnonymousClass002;
import X.AnonymousClass2A1;
import X.AnonymousClass4FS;
import X.C54122oD;
import X.C55832qz;
import X.C614030o;
import X.C69263Wi;
import X.C70493aa;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

public class MessageOtpNotificationBroadcastReceiver extends BroadcastReceiver {
    public C69263Wi A00;
    public C54122oD A01;
    public C614030o A02;
    public C55832qz A03;
    public AnonymousClass4FS A04;
    public final Object A05;
    public volatile boolean A06;

    public void onReceive(Context context, Intent intent) {
        Context context2 = context;
        if (!this.A06) {
            synchronized (this.A05) {
                if (!this.A06) {
                    AnonymousClass2A1.A00(context).ARR(this);
                    this.A06 = true;
                }
            }
        }
        Log.d("OTP: broadcast receiver onReceive");
        String stringExtra = intent.getStringExtra("extra_remote_jid");
        String stringExtra2 = intent.getStringExtra("extra_message_key_id");
        if (stringExtra != null && stringExtra2 != null) {
            this.A04.BkM(new C70493aa(this, context2, stringExtra, stringExtra2, 4));
        }
    }

    public MessageOtpNotificationBroadcastReceiver(int i) {
        this.A06 = false;
        this.A05 = AnonymousClass002.A0D();
    }

    public MessageOtpNotificationBroadcastReceiver() {
        this(0);
    }
}
