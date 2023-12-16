package com.whatsapp.instrumentation.api;

import X.AnonymousClass002;
import X.AnonymousClass3YV;
import X.AnonymousClass4GJ;
import X.AnonymousClass4MD;
import X.AnonymousClass5JP;
import X.AnonymousClass5LU;
import X.C107695bk;
import X.C22031Ec;
import X.C34211uP;
import X.C64323Da;
import X.C64333Db;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class InstrumentationService extends Service implements AnonymousClass4GJ {
    public AnonymousClass5LU A00;
    public AnonymousClass5JP A01;
    public C34211uP A02;
    public boolean A03;
    public final AnonymousClass4MD A04;
    public final Object A05;
    public volatile AnonymousClass3YV A06;

    public final Object generatedComponent() {
        if (this.A06 == null) {
            synchronized (this.A05) {
                if (this.A06 == null) {
                    this.A06 = new AnonymousClass3YV(this);
                }
            }
        }
        return this.A06.generatedComponent();
    }

    public void onCreate() {
        if (!this.A03) {
            this.A03 = true;
            C64333Db r2 = ((C22031Ec) ((C64323Da) generatedComponent())).A06;
            C107695bk r1 = r2.A00;
            this.A01 = (AnonymousClass5JP) r1.AAX.get();
            this.A00 = (AnonymousClass5LU) r1.AAE.get();
            this.A02 = (C34211uP) r2.AI2.get();
        }
        super.onCreate();
    }

    public InstrumentationService(int i) {
        this.A05 = AnonymousClass002.A0D();
        this.A03 = false;
    }

    public IBinder onBind(Intent intent) {
        return this.A04;
    }

    public InstrumentationService() {
        this(0);
        this.A04 = new AnonymousClass4MD(this);
    }
}
