package com.whatsapp.migration.export.service;

import X.AnonymousClass002;
import X.AnonymousClass33T;
import X.AnonymousClass3R1;
import X.AnonymousClass3YV;
import X.AnonymousClass4GJ;
import X.C22031Ec;
import X.C28851hs;
import X.C32471qZ;
import X.C52582li;
import X.C54292oU;
import X.C56582sE;
import X.C620733j;
import X.C64323Da;
import X.C64333Db;
import android.content.Intent;
import android.os.IBinder;
import com.whatsapp.util.Log;

public class MessagesExporterService extends C32471qZ implements AnonymousClass4GJ {
    public C56582sE A00;
    public C52582li A01;
    public C28851hs A02;
    public AnonymousClass3R1 A03;
    public boolean A04 = false;
    public final Object A05 = AnonymousClass002.A0D();
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

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        if (!this.A04) {
            this.A04 = true;
            C64333Db r1 = ((C22031Ec) ((C64323Da) generatedComponent())).A06;
            this.A01 = C64333Db.A01(r1);
            this.A02 = C64333Db.A8y(r1);
            this.A00 = (C56582sE) r1.A9S.get();
            this.A02 = (C28851hs) r1.AMk.get();
            this.A01 = new C52582li((C54292oU) r1.AaB.get(), (AnonymousClass33T) r1.Aaf.get(), (C620733j) r1.AbU.get());
        }
        super.onCreate();
        AnonymousClass3R1 r12 = new AnonymousClass3R1(this);
        this.A03 = r12;
        this.A02.A06(r12);
    }

    public void onDestroy() {
        Log.i("xpm-export-service-onDestroy()");
        super.onDestroy();
        this.A02.A07(this.A03);
        stopForeground(false);
    }
}
