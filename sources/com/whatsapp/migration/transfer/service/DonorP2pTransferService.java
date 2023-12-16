package com.whatsapp.migration.transfer.service;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass2D5;
import X.AnonymousClass2D6;
import X.AnonymousClass327;
import X.AnonymousClass3YV;
import X.AnonymousClass4FS;
import X.AnonymousClass4GJ;
import X.C18260x0;
import X.C18400xH;
import X.C22031Ec;
import X.C28901hx;
import X.C34131uH;
import X.C44462Wd;
import X.C54292oU;
import X.C58722vi;
import X.C61002zX;
import X.C620633i;
import X.C64323Da;
import X.C64333Db;
import X.C70023Zo;
import X.C70113Zy;
import android.content.Intent;
import android.os.IBinder;
import com.whatsapp.util.Log;

public class DonorP2pTransferService extends C18400xH implements AnonymousClass4GJ {
    public AnonymousClass2D5 A00;
    public AnonymousClass2D6 A01;
    public C620633i A02;
    public C54292oU A03;
    public C44462Wd A04;
    public C28901hx A05;
    public C61002zX A06;
    public C34131uH A07;
    public C58722vi A08;
    public AnonymousClass4FS A09;
    public boolean A0A;
    public final Object A0B;
    public volatile AnonymousClass3YV A0C;

    public final Object generatedComponent() {
        if (this.A0C == null) {
            synchronized (this.A0B) {
                if (this.A0C == null) {
                    this.A0C = new AnonymousClass3YV(this);
                }
            }
        }
        return this.A0C.generatedComponent();
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        if (!this.A0A) {
            this.A0A = true;
            C22031Ec r2 = (C22031Ec) ((C64323Da) generatedComponent());
            C64333Db r1 = r2.A06;
            this.A09 = C64333Db.A8y(r1);
            this.A03 = C64333Db.A2q(r1);
            this.A02 = C64333Db.A2o(r1);
            this.A05 = (C28901hx) r1.A00.A8X.get();
            this.A00 = (AnonymousClass2D5) r2.A00.get();
            this.A01 = (AnonymousClass2D6) r2.A01.get();
            this.A04 = new C44462Wd((C54292oU) r1.AaB.get());
        }
        super.onCreate();
    }

    public void onDestroy() {
        Log.i("fpm/DonorChatTransferService/onDestroy()");
        super.onDestroy();
        stopForeground(true);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        String action;
        Log.d("fpm/DonorChatTransferService/onHandleIntent");
        if (intent == null || (action = intent.getAction()) == null) {
            return 2;
        }
        C18260x0.A0q("fpm/DonorChatTransferService/Action: ", action, AnonymousClass001.A0o());
        if (action.equals("com.whatsapp.migration.START")) {
            AnonymousClass327.A00(this.A03.A00, this.A02);
            startForeground(56, this.A04.A00());
            this.A09.BkP(new C70113Zy(this, 24, intent));
        } else if (action.equals("com.whatsapp.migration.STOP")) {
            C70023Zo.A00(this.A09, this, 19);
        }
        return 1;
    }

    public DonorP2pTransferService(int i) {
        this.A0B = AnonymousClass002.A0D();
        this.A0A = false;
    }

    public DonorP2pTransferService() {
        this(0);
    }
}
