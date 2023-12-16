package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.0VK  reason: invalid class name */
public final class AnonymousClass0VK {
    public static final String A00;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r6.isConnected() == false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass0Ph A00(android.net.ConnectivityManager r7) {
        /*
            r0 = 0
            X.C162457s7.A0J(r7, r0)
            android.net.NetworkInfo r6 = r7.getActiveNetworkInfo()
            r5 = 1
            if (r6 == 0) goto L_0x0012
            boolean r0 = r6.isConnected()
            r4 = 1
            if (r0 != 0) goto L_0x0013
        L_0x0012:
            r4 = 0
        L_0x0013:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            r3 = 0
            if (r1 < r0) goto L_0x0036
            android.net.Network r0 = X.AnonymousClass0J3.A00(r7)     // Catch:{ SecurityException -> 0x002b }
            android.net.NetworkCapabilities r1 = X.AnonymousClass0V9.A00(r7, r0)     // Catch:{ SecurityException -> 0x002b }
            if (r1 == 0) goto L_0x0036
            r0 = 16
            boolean r3 = X.AnonymousClass0V9.A02(r1, r0)     // Catch:{ SecurityException -> 0x002b }
            goto L_0x0036
        L_0x002b:
            r2 = move-exception
            X.C06240Wu.A00()
            java.lang.String r1 = A00
            java.lang.String r0 = "Unable to validate active network"
            android.util.Log.e(r1, r0, r2)
        L_0x0036:
            boolean r1 = X.C02780Ho.A00(r7)
            if (r6 == 0) goto L_0x0048
            boolean r0 = r6.isRoaming()
            if (r0 != 0) goto L_0x0048
        L_0x0042:
            X.0Ph r0 = new X.0Ph
            r0.<init>(r4, r3, r1, r5)
            return r0
        L_0x0048:
            r5 = 0
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0VK.A00(android.net.ConnectivityManager):X.0Ph");
    }

    static {
        String A01 = C06240Wu.A01("NetworkStateTracker");
        C162457s7.A0D(A01);
        A00 = A01;
    }

    public static final AnonymousClass0UM A01(Context context, C16180sb r3) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new AnonymousClass0BM(context, r3);
        }
        return new AnonymousClass0BK(context, r3);
    }
}
