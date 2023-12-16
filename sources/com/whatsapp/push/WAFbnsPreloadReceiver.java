package com.whatsapp.push;

import X.AnonymousClass002;
import X.AnonymousClass2A1;
import X.AnonymousClass6CZ;
import X.C107695bk;
import X.C183538qC;
import X.C60232yD;
import X.C72343dZ;
import android.content.Context;
import android.content.Intent;

public class WAFbnsPreloadReceiver extends AnonymousClass6CZ {
    public C60232yD A00;
    public C183538qC A01;
    public final Object A02;
    public volatile boolean A03;

    public void onReceive(Context context, Intent intent) {
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    C107695bk A002 = AnonymousClass2A1.A00(context);
                    this.A01 = C72343dZ.A00(A002.A6H);
                    this.A00 = (C60232yD) A002.ACP.AEy.get();
                    this.A03 = true;
                }
            }
        }
        super.onReceive(context, intent);
    }

    public WAFbnsPreloadReceiver(int i) {
        this.A03 = false;
        this.A02 = AnonymousClass002.A0D();
    }

    public WAFbnsPreloadReceiver() {
        this(0);
    }
}
