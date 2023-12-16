package com.whatsapp.contact.sync;

import X.AnonymousClass002;
import X.AnonymousClass3YV;
import X.AnonymousClass4GJ;
import X.C183538qC;
import X.C18400xH;
import X.C22031Ec;
import X.C64323Da;
import X.C72343dZ;
import android.content.AbstractThreadedSyncAdapter;
import android.content.Intent;
import android.os.IBinder;

public class ContactsSyncAdapterService extends C18400xH implements AnonymousClass4GJ {
    public C183538qC A00;
    public boolean A01;
    public final Object A02;
    public volatile AnonymousClass3YV A03;

    public final Object generatedComponent() {
        if (this.A03 == null) {
            synchronized (this.A02) {
                if (this.A03 == null) {
                    this.A03 = new AnonymousClass3YV(this);
                }
            }
        }
        return this.A03.generatedComponent();
    }

    public IBinder onBind(Intent intent) {
        return ((AbstractThreadedSyncAdapter) this.A00.get()).getSyncAdapterBinder();
    }

    public void onCreate() {
        if (!this.A01) {
            this.A01 = true;
            this.A00 = C72343dZ.A00(((C22031Ec) ((C64323Da) generatedComponent())).A06.A00.A2d);
        }
        super.onCreate();
    }

    public ContactsSyncAdapterService(int i) {
        this.A02 = AnonymousClass002.A0D();
        this.A01 = false;
    }

    public ContactsSyncAdapterService() {
        this(0);
    }
}
