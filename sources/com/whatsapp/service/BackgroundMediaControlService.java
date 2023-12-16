package com.whatsapp.service;

import X.AnonymousClass002;
import X.AnonymousClass3YV;
import X.AnonymousClass4GJ;
import X.C113895mA;
import X.C116095pj;
import X.C18400xH;
import X.C22031Ec;
import X.C64323Da;
import android.content.Intent;
import android.os.IBinder;
import com.whatsapp.util.Log;

public class BackgroundMediaControlService extends C18400xH implements AnonymousClass4GJ {
    public C113895mA A00;
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
        return null;
    }

    public void onCreate() {
        if (!this.A01) {
            this.A01 = true;
            this.A00 = (C113895mA) ((C22031Ec) ((C64323Da) generatedComponent())).A06.AKl.get();
        }
        super.onCreate();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        C116095pj A002 = this.A00.A00();
        if (str == null) {
            Log.d("backgroundmediacontrol/null?");
        } else if (str.equals("com.whatsapp.service.BackgroundMediaControlService.STOP")) {
            Log.d("stopping background media");
            this.A00.A04();
        } else if (str.equals("com.whatsapp.service.BackgroundMediaControlService.START") && A002 != null) {
            A002.A09(C116095pj.A12, true, false);
        }
        stopSelf();
        return 2;
    }

    public BackgroundMediaControlService(int i) {
        this.A02 = AnonymousClass002.A0D();
        this.A01 = false;
    }

    public BackgroundMediaControlService() {
        this(0);
    }
}
