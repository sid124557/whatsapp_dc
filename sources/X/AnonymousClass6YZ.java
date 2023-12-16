package X;

import android.app.AppOpsManager;
import android.os.Binder;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import java.util.List;

/* renamed from: X.6YZ  reason: invalid class name */
public final class AnonymousClass6YZ extends AnonymousClass6YP {
    public volatile int A00 = -1;
    public final /* synthetic */ AnonymousClass6CW A01;

    public final void Bu2(AnonymousClass6TE r3) {
        A00(r3, new C70173a4(this, 0, r3), "onPeerDisconnected");
    }

    public final void Bu5(List list) {
        A00(list, new C70173a4(this, 1, list), "onConnectedNodes");
    }

    public final void Bu7(AnonymousClass6T9 r3) {
        A00(r3, new C70173a4(this, 2, r3), "onConnectedCapabilityChanged");
    }

    public final void BuA(AnonymousClass6TH r3) {
        A00(r3, new C70173a4(this, 3, r3), "onNotificationReceived");
    }

    public final void BuD(AnonymousClass6TB r3) {
        A00(r3, new C70173a4(this, 4, r3), "onEntityUpdate");
    }

    public final void BuE(AnonymousClass6T0 r3) {
        A00(r3, new C70173a4(this, 5, r3), "onChannelEvent");
    }

    public /* synthetic */ AnonymousClass6YZ(AnonymousClass6CW r2) {
        this.A01 = r2;
    }

    public final boolean A00(Object obj, Runnable runnable, String str) {
        if (Log.isLoggable("WearableLS", 3)) {
            Object[] objArr = new Object[3];
            objArr[0] = str;
            C18300x5.A1K(this.A01.A00.toString(), obj, objArr);
            Log.d("WearableLS", String.format("%s: %s %s", objArr));
        }
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.A00) {
            AnonymousClass6CW r5 = this.A01;
            C162177rO.A02(r5);
            synchronized (C161327pR.class) {
                if (C161327pR.A01 == null) {
                    C161327pR.A01 = new C161327pR(r5);
                }
            }
            if (C161327pR.A01.A01()) {
                try {
                    AppOpsManager appOpsManager = (AppOpsManager) C159987mq.A00(r5).A00.getSystemService("appops");
                    if (appOpsManager != null) {
                        appOpsManager.checkPackage(callingUid, "com.google.android.wearable.app.cn");
                        this.A00 = callingUid;
                    } else {
                        throw AnonymousClass001.A0g("context.getSystemService(Context.APP_OPS_SERVICE) is null");
                    }
                } catch (SecurityException unused) {
                }
            }
            if (!AnonymousClass72O.A00(r5, callingUid)) {
                Log.e("WearableLS", AnonymousClass000.A0Y("Caller is not GooglePlayServices; caller UID: ", AnonymousClass6CA.A0Y(57), callingUid));
                return false;
            }
            this.A00 = callingUid;
        }
        AnonymousClass6CW r2 = this.A01;
        synchronized (r2.A07) {
            if (r2.A06) {
                return false;
            }
            r2.A05.post(runnable);
            return true;
        }
    }

    public final void Bte(DataHolder dataHolder) {
        AnonymousClass8MF r4 = new AnonymousClass8MF(dataHolder, 47, this);
        try {
            String valueOf = String.valueOf(dataHolder);
            if (A00(AnonymousClass000.A0Y(", rows=", AnonymousClass6C8.A0g(valueOf.length() + 18, valueOf), dataHolder.A00), r4, "onDataItemChanged")) {
            }
        } finally {
            dataHolder.close();
        }
    }

    public final void Bto(AnonymousClass6SZ r3) {
        A00(r3, new AnonymousClass8MF(r3, 48, this), "onMessageReceived");
    }

    public final void Btx(AnonymousClass6TE r3) {
        A00(r3, new AnonymousClass8MF(r3, 49, this), "onPeerConnected");
    }

    public final void BuF(AnonymousClass6YL r3, AnonymousClass6SZ r4) {
        A00(r4, new C172708Mj(r3, r4, this), "onRequestReceived");
    }
}
