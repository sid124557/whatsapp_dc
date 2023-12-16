package com.whatsapp.instrumentation.service;

import X.AnonymousClass001;
import X.AnonymousClass33T;
import X.C05610Ue;
import X.C107385bE;
import X.C18260x0;
import X.C18290x4;
import X.C18300x5;
import X.C18320x8;
import X.C22031Ec;
import X.C32451qQ;
import X.C54622p1;
import X.C624735e;
import X.C627736r;
import X.C64323Da;
import X.C66553Lw;
import X.C70003Zm;
import android.app.Notification;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.whatsapp.R;

public class InstrumentationFGService extends C32451qQ {
    public Handler A00 = new Handler();
    public Runnable A01 = C70003Zm.A00(this, 44);
    public boolean A02 = false;

    public void onDestroy() {
        stopForeground(true);
        super.onDestroy();
    }

    public InstrumentationFGService() {
        super("instrumentationfgservice", true);
    }

    public void A00() {
        if (!this.A02) {
            this.A02 = true;
            this.A01 = (C54622p1) ((C22031Ec) ((C64323Da) generatedComponent())).A06.AFV.get();
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        A00();
        super.onCreate();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("instrumentationfgservice/onStartCommand:");
        A0o.append(intent);
        C18260x0.A0y(" startId:", A0o, i2);
        C05610Ue A002 = C66553Lw.A00(this);
        A002.A0C(getString(R.string.f11nameremoved));
        C18300x5.A14(this, A002, R.string.f11nameremoved);
        C18320x8.A0z(this, A002, R.string.f11nameremoved);
        A002.A09 = C624735e.A00(this, 1, C627736r.A02(this), 0);
        A002.A03 = C18290x4.A17();
        AnonymousClass33T.A02(A002, R.drawable.notifybar);
        Notification A012 = A002.A01();
        if (C107385bE.A0B()) {
            i3 = 1;
        } else {
            i3 = null;
        }
        A02(A012, i3, i2, 25);
        Handler handler = this.A00;
        Runnable runnable = this.A01;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 5000);
        return 2;
    }
}
