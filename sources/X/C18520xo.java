package X;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.os.Build;
import android.os.PowerManager;

/* renamed from: X.0xo  reason: invalid class name and case insensitive filesystem */
public final class C18520xo extends BroadcastReceiver {
    public static final C18520xo A04 = new C18520xo(0);
    public C620633i A00;
    public C29321id A01;
    public final Object A02;
    public volatile boolean A03;

    public static boolean A00(C620633i r2) {
        C620633i.A0P = true;
        PowerManager A0J = r2.A0J();
        KeyguardManager A09 = r2.A09();
        C620633i.A0P = false;
        if (A0J == null || !A0J.isScreenOn()) {
            return true;
        }
        if ("xiaomi".equalsIgnoreCase(Build.MANUFACTURER) || !A09.isKeyguardLocked() || !A09.inKeyguardRestrictedInputMode()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            boolean r0 = r5.A03
            if (r0 != 0) goto L_0x001a
            java.lang.Object r1 = r5.A02
            monitor-enter(r1)
            boolean r0 = r5.A03     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x0015
            X.5bk r0 = X.AnonymousClass2A1.A00(r6)     // Catch:{ all -> 0x0017 }
            r0.ARp(r5)     // Catch:{ all -> 0x0017 }
            r0 = 1
            r5.A03 = r0     // Catch:{ all -> 0x0017 }
        L_0x0015:
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            goto L_0x001a
        L_0x0017:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            throw r0
        L_0x001a:
            X.1id r0 = r5.A01
            boolean r4 = r0.A09()
            java.lang.String r1 = r7.getAction()
            if (r1 == 0) goto L_0x002d
            int r0 = r1.hashCode()
            switch(r0) {
                case -2128145023: goto L_0x006d;
                case -1454123155: goto L_0x0061;
                case 823795052: goto L_0x0055;
                default: goto L_0x002d;
            }
        L_0x002d:
            java.lang.String r3 = "unknown"
        L_0x0030:
            X.33i r0 = r5.A00
            boolean r2 = A00(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ScreenLockReceiver; tag="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "; locked="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "; oldLocked="
            X.C18260x0.A1E(r0, r1, r4)
            X.1id r0 = r5.A01
            r0.A08(r2)
            return
        L_0x0055:
            java.lang.String r0 = "android.intent.action.USER_PRESENT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002d
            java.lang.String r3 = "unlock"
            goto L_0x0030
        L_0x0061:
            java.lang.String r0 = "android.intent.action.SCREEN_ON"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002d
            java.lang.String r3 = "on"
            goto L_0x0030
        L_0x006d:
            java.lang.String r0 = "android.intent.action.SCREEN_OFF"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002d
            java.lang.String r3 = "off"
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18520xo.onReceive(android.content.Context, android.content.Intent):void");
    }

    public C18520xo(int i) {
        this.A03 = false;
        this.A02 = AnonymousClass002.A0D();
    }

    public C18520xo() {
        this(0);
    }
}
