package com.whatsapp.service;

import X.AnonymousClass001;
import X.AnonymousClass33T;
import X.AnonymousClass4FV;
import X.C05610Ue;
import X.C18260x0;
import X.C18400xH;
import X.C18570xu;
import X.C24591Xz;
import X.C32451qQ;
import X.C56612sH;
import X.C624735e;
import X.C627736r;
import X.C64333Db;
import X.C66553Lw;
import android.app.Notification;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.IBinder;
import android.os.SystemClock;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public final class GcmFGService extends C32451qQ {
    public C56612sH A00;
    public AnonymousClass4FV A01;
    public boolean A02 = false;
    public volatile long A03;

    public GcmFGService() {
        super("gcmfgservice", false);
    }

    public void A00() {
        if (!this.A02) {
            this.A02 = true;
            C64333Db A002 = C18400xH.A00(this);
            this.A00 = C64333Db.A2p(A002);
            this.A01 = C64333Db.A4H(A002);
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        Log.i("gcmfgservice/onCreate");
        A00();
        super.onCreate();
    }

    public void onDestroy() {
        Log.i("gcmfgservice/onDestroy");
        stopForeground(true);
        super.onDestroy();
    }

    public boolean A01() {
        boolean A012 = super.A01();
        if (A012) {
            C24591Xz r4 = new C24591Xz();
            r4.A02 = "GcmFGService";
            C24591Xz.A00(r4, SystemClock.uptimeMillis(), this.A03);
            this.A01.BhD(r4);
            this.A03 = 0;
        }
        return A012;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("gcmfgservice/onStartCommand:");
        A0o.append(intent);
        C18260x0.A0y(" startId:", A0o, i2);
        Resources A012 = C18570xu.A01(getResources());
        C05610Ue A002 = C66553Lw.A00(this);
        A002.A0C(A012.getString(R.string.f11nameremoved));
        A002.A0B(A012.getString(R.string.f11nameremoved));
        A002.A0A(A012.getString(R.string.f11nameremoved));
        A002.A09 = C624735e.A00(this, 1, C627736r.A02(this), 0);
        int i3 = Build.VERSION.SDK_INT;
        int i4 = -2;
        if (i3 >= 26) {
            i4 = -1;
        }
        A002.A03 = i4;
        if (i3 != 24) {
            AnonymousClass33T.A02(A002, R.drawable.notifybar);
        }
        Notification A013 = A002.A01();
        int i5 = 11;
        if (i3 == 24) {
            Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(this, A013);
            recoverBuilder.setSmallIcon(Icon.createWithBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.notifybar)));
            A013 = recoverBuilder.build();
            i5 = 232614016;
        }
        A02(A013, (Integer) null, i2, i5);
        if (this.A03 == 0) {
            this.A03 = SystemClock.uptimeMillis();
        }
        return 1;
    }
}
