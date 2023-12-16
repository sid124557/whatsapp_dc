package com.whatsapp.phoneid;

import X.AnonymousClass002;
import X.AnonymousClass1VX;
import X.AnonymousClass2A1;
import X.AnonymousClass3At;
import X.AnonymousClass3Au;
import X.C18420xL;
import android.content.Context;
import android.content.Intent;

public class PhoneIdRequestReceiver extends C18420xL {
    public AnonymousClass1VX A00;
    public AnonymousClass3Au A01;
    public AnonymousClass3At A02;
    public final Object A03;
    public volatile boolean A04;

    public void onReceive(Context context, Intent intent) {
        if (!this.A04) {
            synchronized (this.A03) {
                if (!this.A04) {
                    AnonymousClass2A1.A00(context).ARe(this);
                    this.A04 = true;
                }
            }
        }
        super.onReceive(context, intent);
    }

    public PhoneIdRequestReceiver(int i) {
        this.A04 = false;
        this.A03 = AnonymousClass002.A0D();
    }

    public PhoneIdRequestReceiver() {
        this(0);
    }
}
