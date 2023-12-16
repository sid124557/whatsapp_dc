package com.whatsapp.accountsync;

import X.AnonymousClass002;
import X.AnonymousClass3YV;
import X.AnonymousClass4GJ;
import X.AnonymousClass4L1;
import X.C18280x3;
import X.C18400xH;
import android.content.Intent;
import android.os.IBinder;

public class AccountAuthenticatorService extends C18400xH implements AnonymousClass4GJ {
    public static AnonymousClass4L1 A03;
    public boolean A00;
    public final Object A01;
    public volatile AnonymousClass3YV A02;

    public final Object generatedComponent() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    this.A02 = new AnonymousClass3YV(this);
                }
            }
        }
        return this.A02.generatedComponent();
    }

    public IBinder onBind(Intent intent) {
        if (!C18280x3.A1V(intent, "android.accounts.AccountAuthenticator")) {
            return null;
        }
        AnonymousClass4L1 r0 = A03;
        if (r0 == null) {
            r0 = new AnonymousClass4L1(this);
            A03 = r0;
        }
        return r0.getIBinder();
    }

    public void onCreate() {
        if (!this.A00) {
            this.A00 = true;
            generatedComponent();
        }
        super.onCreate();
    }

    public AccountAuthenticatorService(int i) {
        this.A01 = AnonymousClass002.A0D();
        this.A00 = false;
    }

    public AccountAuthenticatorService() {
        this(0);
    }
}
