package X;

import android.app.Notification;
import android.os.Build;

/* renamed from: X.1qQ  reason: invalid class name and case insensitive filesystem */
public abstract class C32451qQ extends AnonymousClass501 {
    public int A00 = -1;
    public C54622p1 A01;
    public boolean A02;
    public final String A03;
    public final boolean A04;

    public void onCreate() {
        this.A02 = false;
        super.onCreate();
    }

    public boolean A01() {
        int i;
        if (this.A04) {
            i = -1;
        } else {
            i = this.A00;
        }
        boolean stopSelfResult = stopSelfResult(i);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A03);
        C18260x0.A1E("/Stop service success:", A0o, stopSelfResult);
        return stopSelfResult;
    }

    public boolean A02(Notification notification, Integer num, int i, int i2) {
        this.A00 = i;
        try {
            if (!C107385bE.A0B() || num == null) {
                startForeground(i2, notification);
            } else {
                startForeground(i2, notification, num.intValue());
            }
            if (!this.A02) {
                this.A02 = true;
                if (Build.VERSION.SDK_INT >= 26) {
                    this.A01.A02(this);
                }
            }
            return true;
        } catch (IllegalStateException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Failed to start foreground service ");
            C18260x0.A14(this.A03, A0o, e);
            A01();
            return false;
        }
    }

    public C32451qQ(String str, boolean z) {
        this.A03 = str;
        this.A04 = z;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A02 = false;
        this.A00 = -1;
    }
}
