package com.whatsapp.migration.transfer.service;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass2D7;
import X.AnonymousClass327;
import X.AnonymousClass3YV;
import X.AnonymousClass4FS;
import X.AnonymousClass4GJ;
import X.C18260x0;
import X.C18400xH;
import X.C22031Ec;
import X.C28901hx;
import X.C34161uK;
import X.C44462Wd;
import X.C46762cA;
import X.C54292oU;
import X.C620633i;
import X.C64323Da;
import X.C64333Db;
import X.C70023Zo;
import X.C70113Zy;
import android.content.Intent;
import android.os.IBinder;
import com.whatsapp.util.Log;

public class ReceiverP2pTransferService extends C18400xH implements AnonymousClass4GJ {
    public AnonymousClass2D7 A00;
    public C620633i A01;
    public C54292oU A02;
    public C44462Wd A03;
    public C28901hx A04;
    public C46762cA A05;
    public C34161uK A06;
    public AnonymousClass4FS A07;
    public boolean A08;
    public final Object A09;
    public volatile AnonymousClass3YV A0A;

    public final Object generatedComponent() {
        if (this.A0A == null) {
            synchronized (this.A09) {
                if (this.A0A == null) {
                    this.A0A = new AnonymousClass3YV(this);
                }
            }
        }
        return this.A0A.generatedComponent();
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        if (!this.A08) {
            this.A08 = true;
            C22031Ec r2 = (C22031Ec) ((C64323Da) generatedComponent());
            C64333Db r1 = r2.A06;
            this.A07 = C64333Db.A8y(r1);
            this.A02 = C64333Db.A2q(r1);
            this.A01 = C64333Db.A2o(r1);
            this.A04 = (C28901hx) r1.A00.A8X.get();
            this.A00 = (AnonymousClass2D7) r2.A02.get();
            this.A03 = new C44462Wd((C54292oU) r1.AaB.get());
        }
        super.onCreate();
    }

    public void onDestroy() {
        Log.i("fpm/ReceiverChatTransferService/onDestroy()");
        super.onDestroy();
        stopForeground(true);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        String action;
        Log.d("fpm/ReceiverChatTransferService/onHandleIntent");
        if (intent == null || (action = intent.getAction()) == null) {
            return 2;
        }
        C18260x0.A0q("fpm/ReceiverChatTransferService/Action: ", action, AnonymousClass001.A0o());
        if (action.equals("com.whatsapp.migration.START")) {
            AnonymousClass327.A00(this.A02.A00, this.A01);
            startForeground(56, this.A03.A00());
            this.A07.BkP(new C70113Zy(this, 25, intent));
        } else if (action.equals("com.whatsapp.migration.STOP")) {
            C70023Zo.A00(this.A07, this, 20);
        }
        return 1;
    }

    public ReceiverP2pTransferService(int i) {
        this.A09 = AnonymousClass002.A0D();
        this.A08 = false;
    }

    public ReceiverP2pTransferService() {
        this(0);
    }
}
