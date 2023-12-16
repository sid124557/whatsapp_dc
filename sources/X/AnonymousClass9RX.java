package X;

/* renamed from: X.9RX  reason: invalid class name */
public class AnonymousClass9RX {
    public C620633i A00;
    public C54292oU A01;
    public C620933l A02;
    public C160757oG A03 = C160757oG.A00("PaymentCommonDeviceIdManager", "infra", "COMMON");

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A00() {
        /*
            r7 = this;
            X.7oG r2 = r7.A03
            java.lang.String r0 = "PaymentDeviceId: getid_v2()"
            r2.A04(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x001d
            java.lang.String r0 = "PaymentDeviceId: still fallback to v1"
            r2.A04(r0)
            X.33i r0 = r7.A00
            X.5UR r0 = r0.A0R()
            java.lang.String r0 = X.C627236i.A01(r0)
        L_0x001c:
            return r0
        L_0x001d:
            java.lang.String r0 = "PaymentDeviceId: generate id for v2"
            r2.A04(r0)
            X.33i r0 = r7.A00
            X.5UR r0 = r0.A0R()
            java.lang.String r3 = X.C627236i.A01(r0)
            X.2oU r0 = r7.A01
            android.content.Context r0 = r0.A00
            if (r3 != 0) goto L_0x0034
            java.lang.String r3 = ""
        L_0x0034:
            r4 = 0
            android.content.pm.PackageManager r2 = r0.getPackageManager()     // Catch:{ NameNotFoundException | NullPointerException -> 0x0073 }
            java.lang.String r1 = r0.getPackageName()     // Catch:{ NameNotFoundException | NullPointerException -> 0x0073 }
            r0 = 64
            android.content.pm.PackageInfo r0 = r2.getPackageInfo(r1, r0)     // Catch:{ NameNotFoundException | NullPointerException -> 0x0073 }
            android.content.pm.Signature[] r1 = r0.signatures     // Catch:{ NameNotFoundException | NullPointerException -> 0x0073 }
            r0 = 0
            r0 = r1[r0]     // Catch:{ NameNotFoundException | NullPointerException -> 0x0073 }
            java.lang.String r2 = r0.toCharsString()     // Catch:{ NameNotFoundException | NullPointerException -> 0x0073 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ NameNotFoundException | NullPointerException -> 0x0073 }
            if (r0 != 0) goto L_0x0062
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ NameNotFoundException | NullPointerException -> 0x0073 }
            java.lang.String r0 = "-"
            r1.append(r0)     // Catch:{ NameNotFoundException | NullPointerException -> 0x0073 }
            r1.append(r2)     // Catch:{ NameNotFoundException | NullPointerException -> 0x0073 }
            java.lang.String r3 = r1.toString()     // Catch:{ NameNotFoundException | NullPointerException -> 0x0073 }
        L_0x0062:
            java.lang.String r0 = "SHA-1"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r0)     // Catch:{  }
            java.lang.String r0 = X.C58152un.A0B     // Catch:{  }
            byte[] r0 = r3.getBytes(r0)     // Catch:{  }
            byte[] r0 = r1.digest(r0)     // Catch:{  }
            goto L_0x0078
        L_0x0073:
            android.util.Pair r1 = X.AnonymousClass0x9.A0C(r3, r4)
            goto L_0x007c
        L_0x0078:
            android.util.Pair r1 = X.AnonymousClass0x9.A0C(r3, r0)
        L_0x007c:
            java.lang.Object r0 = r1.first
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r6 = r1.second
            byte[] r6 = (byte[]) r6
            if (r6 == 0) goto L_0x001c
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            int r4 = r6.length
            r3 = 0
            r2 = 0
        L_0x008d:
            if (r2 >= r4) goto L_0x00a7
            byte r0 = r6[r2]
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r1[r3] = r0
            java.lang.String r0 = "%02X"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r5.append(r0)
            int r2 = r2 + 1
            goto L_0x008d
        L_0x00a7:
            java.lang.String r0 = r5.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9RX.A00():java.lang.String");
    }

    public AnonymousClass9RX(C620633i r4, C54292oU r5, C620933l r6) {
        this.A01 = r5;
        this.A00 = r4;
        this.A02 = r6;
    }
}
