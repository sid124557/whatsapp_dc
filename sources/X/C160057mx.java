package X;

import android.content.Context;
import android.util.Log;

/* renamed from: X.7mx  reason: invalid class name and case insensitive filesystem */
public class C160057mx {
    public static C160057mx A02;
    public final Context A00;
    public volatile String A01;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if ((r0.flags & 129) == 0) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005f, code lost:
        if (r6 != null) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(android.content.pm.PackageInfo r6, boolean r7) {
        /*
            r3 = 1
            r5 = 0
            if (r7 == 0) goto L_0x005f
            if (r6 == 0) goto L_0x0036
            java.lang.String r0 = "com.android.vending"
            java.lang.String r1 = r6.packageName
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = "com.google.android.gms"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0024
        L_0x0018:
            android.content.pm.ApplicationInfo r0 = r6.applicationInfo
            if (r0 == 0) goto L_0x0023
            int r0 = r0.flags
            r0 = r0 & 129(0x81, float:1.81E-43)
            r7 = 1
            if (r0 != 0) goto L_0x0024
        L_0x0023:
            r7 = 0
        L_0x0024:
            android.content.pm.Signature[] r1 = r6.signatures
            if (r1 == 0) goto L_0x0036
            if (r7 == 0) goto L_0x0056
            X.6UJ[] r4 = X.C1456176o.A00
        L_0x002c:
            int r0 = r1.length
            if (r0 == r3) goto L_0x0037
            java.lang.String r1 = "GoogleSignatureVerifier"
            java.lang.String r0 = "Package has more than one signature."
            android.util.Log.w(r1, r0)
        L_0x0036:
            return r5
        L_0x0037:
            r2 = 0
            r0 = r1[r5]
            byte[] r0 = r0.toByteArray()
            X.6UN r1 = new X.6UN
            r1.<init>(r0)
        L_0x0043:
            int r0 = r4.length
            if (r2 >= r0) goto L_0x0036
            r0 = r4[r2]
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0053
            r0 = r4[r2]
            if (r0 == 0) goto L_0x0036
            return r3
        L_0x0053:
            int r2 = r2 + 1
            goto L_0x0043
        L_0x0056:
            X.6UJ[] r4 = new X.AnonymousClass6UJ[r3]
            X.6UJ[] r0 = X.C1456176o.A00
            r0 = r0[r5]
            r4[r5] = r0
            goto L_0x002c
        L_0x005f:
            if (r6 == 0) goto L_0x0036
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160057mx.A01(android.content.pm.PackageInfo, boolean):boolean");
    }

    public C160057mx(Context context) {
        this.A00 = context.getApplicationContext();
    }

    public static C160057mx A00(Context context) {
        C162177rO.A02(context);
        synchronized (C160057mx.class) {
            if (A02 == null) {
                synchronized (AnonymousClass79K.class) {
                    if (AnonymousClass79K.A00 != null) {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    } else if (context != null) {
                        AnonymousClass79K.A00 = context.getApplicationContext();
                    }
                }
                A02 = new C160057mx(context);
            }
        }
        return A02;
    }
}
