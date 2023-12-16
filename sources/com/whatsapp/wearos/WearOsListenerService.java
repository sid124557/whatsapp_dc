package com.whatsapp.wearos;

import X.AnonymousClass002;
import X.AnonymousClass3YV;
import X.AnonymousClass4GJ;
import X.AnonymousClass5H4;
import X.AnonymousClass6CW;
import X.C107695bk;
import X.C126956Qb;
import X.C156227gG;
import X.C22031Ec;
import X.C64323Da;
import X.C69783Yj;

public final class WearOsListenerService extends AnonymousClass6CW implements AnonymousClass4GJ {
    public C126956Qb A00;
    public AnonymousClass5H4 A01;
    public boolean A02;
    public final Object A03;
    public volatile AnonymousClass3YV A04;

    public final Object generatedComponent() {
        if (this.A04 == null) {
            synchronized (this.A03) {
                if (this.A04 == null) {
                    this.A04 = new AnonymousClass3YV(this);
                }
            }
        }
        return this.A04.generatedComponent();
    }

    public void onCreate() {
        if (!this.A02) {
            this.A02 = true;
            C107695bk r1 = ((C22031Ec) ((C64323Da) generatedComponent())).A06.A00;
            this.A01 = (AnonymousClass5H4) r1.AAF.get();
            this.A00 = new C126956Qb(C69783Yj.A00(r1.ACP.AdE), C156227gG.A02);
        }
        super.onCreate();
    }

    public WearOsListenerService(int i) {
        this.A03 = AnonymousClass002.A0D();
        this.A02 = false;
    }

    public WearOsListenerService() {
        this(0);
    }
}
