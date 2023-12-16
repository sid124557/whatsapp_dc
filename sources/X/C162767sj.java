package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7sj  reason: invalid class name and case insensitive filesystem */
public final class C162767sj implements ServiceConnection, C178428hW {
    public int A00 = 2;
    public ComponentName A01;
    public IBinder A02;
    public boolean A03;
    public final C160537np A04;
    public final Map A05 = AnonymousClass001.A0t();
    public final /* synthetic */ C161367pV A06;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0069, code lost:
        if (r12 != null) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(java.lang.String r17) {
        /*
            r16 = this;
            r9 = 0
            r0 = 3
            r13 = r16
            r13.A00 = r0
            android.os.StrictMode$VmPolicy r4 = android.os.StrictMode.getVmPolicy()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto L_0x0020
            android.os.StrictMode$VmPolicy$Builder r0 = new android.os.StrictMode$VmPolicy$Builder
            r0.<init>(r4)
            android.os.StrictMode$VmPolicy$Builder r0 = r0.permitUnsafeIntentLaunch()
            android.os.StrictMode$VmPolicy r0 = r0.build()
            android.os.StrictMode.setVmPolicy(r0)
        L_0x0020:
            X.7pV r2 = r13.A06     // Catch:{ all -> 0x00a4 }
            X.7nn r10 = r2.A02     // Catch:{ all -> 0x00a4 }
            android.content.Context r11 = r2.A00     // Catch:{ all -> 0x00a4 }
            X.7np r3 = r13.A04     // Catch:{ all -> 0x00a4 }
            java.lang.String r6 = "ConnectionStatusConfig"
            java.lang.String r5 = r3.A01     // Catch:{ all -> 0x00a4 }
            if (r5 == 0) goto L_0x0055
            boolean r0 = r3.A03     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x0074
            android.os.Bundle r8 = X.AnonymousClass002.A08()     // Catch:{ all -> 0x00a4 }
            java.lang.String r0 = "serviceActionBundleKey"
            r8.putString(r0, r5)     // Catch:{ all -> 0x00a4 }
            android.content.ContentResolver r7 = r11.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x004a }
            android.net.Uri r1 = X.C160537np.A04     // Catch:{ IllegalArgumentException -> 0x004a }
            java.lang.String r0 = "serviceIntentCall"
            android.os.Bundle r1 = r7.call(r1, r0, r9, r8)     // Catch:{ IllegalArgumentException -> 0x004a }
            if (r1 == 0) goto L_0x006b
            goto L_0x0061
        L_0x004a:
            r0 = move-exception
            java.lang.String r1 = "Dynamic intent resolution failed: "
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00a4 }
            X.AnonymousClass6C9.A13(r1, r0, r6)     // Catch:{ all -> 0x00a4 }
            goto L_0x006b
        L_0x0055:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x00a4 }
            r1.<init>()     // Catch:{ all -> 0x00a4 }
            android.content.ComponentName r0 = r3.A00     // Catch:{ all -> 0x00a4 }
            android.content.Intent r12 = r1.setComponent(r0)     // Catch:{ all -> 0x00a4 }
            goto L_0x007e
        L_0x0061:
            java.lang.String r0 = "serviceResponseIntentKey"
            android.os.Parcelable r12 = r1.getParcelable(r0)     // Catch:{ all -> 0x00a4 }
            android.content.Intent r12 = (android.content.Intent) r12     // Catch:{ all -> 0x00a4 }
            if (r12 != 0) goto L_0x007e
        L_0x006b:
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00a4 }
            java.lang.String r0 = "Dynamic lookup for intent failed for action: "
            X.AnonymousClass6C9.A13(r0, r1, r6)     // Catch:{ all -> 0x00a4 }
        L_0x0074:
            android.content.Intent r1 = X.AnonymousClass0x9.A09(r5)     // Catch:{ all -> 0x00a4 }
            java.lang.String r0 = r3.A02     // Catch:{ all -> 0x00a4 }
            android.content.Intent r12 = r1.setPackage(r0)     // Catch:{ all -> 0x00a4 }
        L_0x007e:
            r15 = 4225(0x1081, float:5.92E-42)
            r1 = 1
            r14 = r17
            boolean r0 = r10.A02(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00a4 }
            r13.A03 = r0     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x009a
            android.os.Handler r0 = r2.A04     // Catch:{ all -> 0x00a4 }
            android.os.Message r3 = r0.obtainMessage(r1, r3)     // Catch:{ all -> 0x00a4 }
            android.os.Handler r2 = r2.A04     // Catch:{ all -> 0x00a4 }
            r0 = 300000(0x493e0, double:1.482197E-318)
            r2.sendMessageDelayed(r3, r0)     // Catch:{ all -> 0x00a4 }
            goto L_0x00a0
        L_0x009a:
            r0 = 2
            r13.A00 = r0     // Catch:{ all -> 0x00a4 }
            r10.A01(r11, r13)     // Catch:{ IllegalArgumentException -> 0x00a0 }
        L_0x00a0:
            android.os.StrictMode.setVmPolicy(r4)
            return
        L_0x00a4:
            r0 = move-exception
            android.os.StrictMode.setVmPolicy(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162767sj.A00(java.lang.String):void");
    }

    public C162767sj(C160537np r2, C161367pV r3) {
        this.A06 = r3;
        this.A04 = r2;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C161367pV r0 = this.A06;
        synchronized (r0.A03) {
            r0.A04.removeMessages(1, this.A04);
            this.A02 = iBinder;
            this.A01 = componentName;
            Iterator A0v = AnonymousClass001.A0v(this.A05);
            while (A0v.hasNext()) {
                ((ServiceConnection) A0v.next()).onServiceConnected(componentName, iBinder);
            }
            this.A00 = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C161367pV r0 = this.A06;
        synchronized (r0.A03) {
            r0.A04.removeMessages(1, this.A04);
            this.A02 = null;
            this.A01 = componentName;
            Iterator A0v = AnonymousClass001.A0v(this.A05);
            while (A0v.hasNext()) {
                ((ServiceConnection) A0v.next()).onServiceDisconnected(componentName);
            }
            this.A00 = 2;
        }
    }
}
