package androidx.work.impl.foreground;

import X.AnonymousClass000;
import X.AnonymousClass00X;
import X.C06240Wu;
import X.C09010fV;
import X.C16150sY;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.util.Log;

public class SystemForegroundService extends AnonymousClass00X implements C16150sY {
    public static SystemForegroundService A04;
    public static final String A05 = C06240Wu.A01("SystemFgService");
    public NotificationManager A00;
    public Handler A01;
    public C09010fV A02;
    public boolean A03;

    public void stop() {
        this.A03 = true;
        C06240Wu.A00().A04(A05, "All commands completed.");
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        A04 = null;
        stopSelf();
    }

    public final void A00() {
        this.A01 = AnonymousClass000.A0A();
        this.A00 = (NotificationManager) getApplicationContext().getSystemService("notification");
        C09010fV r1 = new C09010fV(getApplicationContext());
        this.A02 = r1;
        if (r1.A02 != null) {
            C06240Wu.A00();
            Log.e(C09010fV.A0A, "A callback already exists.");
            return;
        }
        r1.A02 = this;
    }

    public void onCreate() {
        super.onCreate();
        A04 = this;
        A00();
    }

    public void onDestroy() {
        super.onDestroy();
        this.A02.A00();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.A03) {
            C06240Wu.A00();
            Log.i(A05, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.A02.A00();
            A00();
            this.A03 = false;
        }
        if (intent == null) {
            return 3;
        }
        this.A02.A01(intent);
        return 3;
    }
}
