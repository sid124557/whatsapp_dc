package X;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;

/* renamed from: X.6CW  reason: invalid class name */
public abstract class AnonymousClass6CW extends Service implements C185378tY, C178718hz, C178728i0, C178748i2 {
    public ComponentName A00;
    public Intent A01;
    public IBinder A02;
    public Looper A03;
    public C169908Bc A04 = new C169908Bc(new C155767fT(this));
    public C124776Dv A05;
    public boolean A06;
    public final Object A07 = AnonymousClass002.A0D();

    public void BOi(C187348x3 r1) {
    }

    public final IBinder onBind(Intent intent) {
        if (C18280x3.A1V(intent, "com.google.android.gms.wearable.BIND_LISTENER")) {
            return this.A02;
        }
        return null;
    }

    public void onDestroy() {
        if (AnonymousClass6C9.A1Q("WearableLS")) {
            String valueOf = String.valueOf(this.A00);
            AnonymousClass6C7.A1G("onDestroy: ", valueOf, "WearableLS", AnonymousClass6CA.A0Y(valueOf.length() + 11));
        }
        synchronized (this.A07) {
            this.A06 = true;
            C124776Dv r1 = this.A05;
            if (r1 != null) {
                r1.getLooper().quit();
                r1.A00("quit");
            } else {
                String valueOf2 = String.valueOf(this.A00);
                StringBuilder A0Y = AnonymousClass6CA.A0Y(valueOf2.length() + 111);
                A0Y.append("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=");
                throw AnonymousClass000.A0I(valueOf2, A0Y);
            }
        }
        super.onDestroy();
    }

    public void onCreate() {
        super.onCreate();
        this.A00 = new ComponentName(this, AnonymousClass000.A0O(this));
        if (Log.isLoggable("WearableLS", 3)) {
            String valueOf = String.valueOf(this.A00);
            AnonymousClass6C7.A1G("onCreate: ", valueOf, "WearableLS", AnonymousClass6CA.A0Y(valueOf.length() + 10));
        }
        Looper looper = this.A03;
        if (looper == null) {
            looper = AnonymousClass6C9.A0S(new HandlerThread("WearableListenerService"));
            this.A03 = looper;
        }
        this.A05 = new C124776Dv(looper, this);
        Intent A09 = AnonymousClass0x9.A09("com.google.android.gms.wearable.BIND_LISTENER");
        this.A01 = A09;
        A09.setComponent(this.A00);
        this.A02 = new AnonymousClass6YZ(this);
    }

    public void BOh(C187348x3 r1, int i, int i2) {
    }

    public void BUc(C187348x3 r1, int i, int i2) {
    }

    public void BXX(C187348x3 r1, int i, int i2) {
    }
}
