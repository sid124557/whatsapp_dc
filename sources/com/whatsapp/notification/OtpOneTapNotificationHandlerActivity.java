package com.whatsapp.notification;

import X.AnonymousClass002;
import X.AnonymousClass4FS;
import X.AnonymousClass4GJ;
import X.AnonymousClass4HY;
import X.AnonymousClass5VY;
import X.C009707r;
import X.C116865qz;
import X.C17190ui;
import X.C18270x1;
import X.C54122oD;
import X.C55832qz;
import X.C614030o;
import X.C69263Wi;
import X.C70313aI;
import android.os.Bundle;

public final class OtpOneTapNotificationHandlerActivity extends C009707r implements AnonymousClass4GJ {
    public C69263Wi A00;
    public C54122oD A01;
    public C614030o A02;
    public C55832qz A03;
    public AnonymousClass4FS A04;
    public boolean A05;
    public final Object A06;
    public volatile C116865qz A07;

    public final Object generatedComponent() {
        if (this.A07 == null) {
            synchronized (this.A06) {
                if (this.A07 == null) {
                    this.A07 = new C116865qz(this);
                }
            }
        }
        return this.A07.generatedComponent();
    }

    public OtpOneTapNotificationHandlerActivity(int i) {
        this.A06 = AnonymousClass002.A0D();
        this.A05 = false;
        AnonymousClass4HY.A00(this, 84);
    }

    public C17190ui B6u() {
        return AnonymousClass5VY.A00(this, super.B6u());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("extra_remote_jid");
        String stringExtra2 = getIntent().getStringExtra("extra_message_key_id");
        if (stringExtra != null && stringExtra2 != null) {
            AnonymousClass4FS r2 = this.A04;
            if (r2 != null) {
                r2.BkM(new C70313aI(this, stringExtra2, stringExtra, 11));
                finish();
                return;
            }
            throw C18270x1.A0S("waWorkers");
        }
    }

    public OtpOneTapNotificationHandlerActivity() {
        this(0);
    }
}
