package com.whatsapp.appwidget;

import X.AnonymousClass002;
import X.AnonymousClass3YV;
import X.AnonymousClass4GJ;
import X.AnonymousClass5ZU;
import X.C105275Ug;
import X.C110265fx;
import X.C22031Ec;
import X.C56612sH;
import X.C620733j;
import X.C64323Da;
import X.C64333Db;
import X.C64773Ex;
import X.C66553Lw;
import android.content.Intent;
import android.widget.RemoteViewsService;

public class WidgetService extends RemoteViewsService implements AnonymousClass4GJ {
    public C105275Ug A00;
    public C64773Ex A01;
    public AnonymousClass5ZU A02;
    public C56612sH A03;
    public C620733j A04;
    public C66553Lw A05;
    public boolean A06;
    public final Object A07;
    public volatile AnonymousClass3YV A08;

    public final Object generatedComponent() {
        if (this.A08 == null) {
            synchronized (this.A07) {
                if (this.A08 == null) {
                    this.A08 = new AnonymousClass3YV(this);
                }
            }
        }
        return this.A08.generatedComponent();
    }

    public void onCreate() {
        if (!this.A06) {
            this.A06 = true;
            C64333Db r1 = ((C22031Ec) ((C64323Da) generatedComponent())).A06;
            this.A03 = C64333Db.A2p(r1);
            this.A00 = (C105275Ug) r1.A0q.get();
            this.A01 = C64333Db.A26(r1);
            this.A02 = C64333Db.A28(r1);
            this.A04 = C64333Db.A2t(r1);
            this.A05 = (C66553Lw) r1.AOX.get();
        }
        super.onCreate();
    }

    public WidgetService(int i) {
        this.A07 = AnonymousClass002.A0D();
        this.A06 = false;
    }

    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new C110265fx(getApplicationContext(), this.A00, this.A01, this.A02, this.A03, this.A04, this.A05);
    }

    public WidgetService() {
        this(0);
    }
}
