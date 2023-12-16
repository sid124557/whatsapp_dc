package X;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7pV  reason: invalid class name and case insensitive filesystem */
public final class C161367pV {
    public static HandlerThread A05;
    public static C161367pV A06;
    public static final Object A07 = AnonymousClass002.A0D();
    public final Context A00;
    public final C162957t2 A01;
    public final C160517nn A02;
    public final HashMap A03;
    public volatile Handler A04;

    public static C161367pV A00(Context context) {
        synchronized (A07) {
            if (A06 == null) {
                A06 = new C161367pV(context.getApplicationContext(), context.getMainLooper());
            }
        }
        return A06;
    }

    public final void A01(ServiceConnection serviceConnection, C160537np r7) {
        IllegalStateException illegalStateException;
        HashMap hashMap = this.A03;
        synchronized (hashMap) {
            C162767sj r0 = (C162767sj) hashMap.get(r7);
            if (r0 != null) {
                Map map = r0.A05;
                if (map.containsKey(serviceConnection)) {
                    map.remove(serviceConnection);
                    if (map.isEmpty()) {
                        this.A04.sendMessageDelayed(this.A04.obtainMessage(0, r7), 5000);
                    }
                } else {
                    String obj = r7.toString();
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    illegalStateException = AnonymousClass000.A0I(obj, A0o);
                }
            } else {
                String obj2 = r7.toString();
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("Nonexistent connection status for service config: ");
                illegalStateException = AnonymousClass000.A0I(obj2, A0o2);
            }
            throw illegalStateException;
        }
    }

    public final boolean A02(ServiceConnection serviceConnection, C160537np r6, String str) {
        boolean z;
        HashMap hashMap = this.A03;
        synchronized (hashMap) {
            C162767sj r2 = (C162767sj) hashMap.get(r6);
            if (r2 == null) {
                r2 = new C162767sj(r6, this);
                r2.A05.put(serviceConnection, serviceConnection);
                r2.A00(str);
                hashMap.put(r6, r2);
            } else {
                this.A04.removeMessages(0, r6);
                Map map = r2.A05;
                if (!map.containsKey(serviceConnection)) {
                    map.put(serviceConnection, serviceConnection);
                    int i = r2.A00;
                    if (i == 1) {
                        serviceConnection.onServiceConnected(r2.A01, r2.A02);
                    } else if (i == 2) {
                        r2.A00(str);
                    }
                } else {
                    String obj = r6.toString();
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    throw AnonymousClass000.A0I(obj, A0o);
                }
            }
            z = r2.A03;
        }
        return z;
    }

    public C161367pV(Context context, Looper looper) {
        this.A03 = AnonymousClass001.A0t();
        C162957t2 r1 = new C162957t2(this);
        this.A01 = r1;
        this.A00 = context.getApplicationContext();
        this.A04 = new C124816Dz(looper, r1);
        this.A02 = C160517nn.A00();
    }

    public C161367pV() {
    }
}
