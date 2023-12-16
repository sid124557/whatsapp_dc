package X;

/* renamed from: X.2gB  reason: invalid class name and case insensitive filesystem */
public class C49222gB {
    public final C42062Mq A00;
    public final AnonymousClass1VV A01;
    public final C51072jE A02;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0058 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A00() {
        /*
            r5 = this;
            X.1VV r3 = r5.A01
            X.8qC r0 = r3.A06
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r0)
            java.lang.String r0 = "ab_props:hash_v2"
            java.lang.String r0 = X.C18280x3.A0Z(r1, r0)
            if (r0 == 0) goto L_0x004f
            X.2bZ r2 = X.C57182tE.A00(r0)     // Catch:{ JSONException -> 0x0049 }
            if (r2 == 0) goto L_0x004f
            X.2iY r1 = r3.A02     // Catch:{ JSONException -> 0x0049 }
            java.lang.String r0 = X.C58172up.A00     // Catch:{ JSONException -> 0x0049 }
            byte[] r1 = r1.A01(r2, r0)     // Catch:{ JSONException -> 0x0049 }
            if (r1 == 0) goto L_0x004f
            java.nio.charset.Charset r0 = X.AnonymousClass1VV.A08     // Catch:{ JSONException -> 0x0049 }
            java.lang.String r4 = new java.lang.String     // Catch:{ JSONException -> 0x0049 }
            r4.<init>(r1, r0)     // Catch:{ JSONException -> 0x0049 }
            X.8qC r0 = r3.A05
            android.content.SharedPreferences r0 = X.C18300x5.A0B(r0)
            java.util.Map r3 = r0.getAll()
            java.util.Set r2 = r3.keySet()
            r1 = 2
            X.4KE r0 = new X.4KE
            r0.<init>(r1)
            X.AnonymousClass367.A01(r0, r2)
            java.lang.String r0 = X.C57622tw.A00(r3)
            boolean r0 = r4.equals(r0)
            r1 = r0 ^ 1
            goto L_0x0050
        L_0x0049:
            r1 = move-exception
            java.lang.String r0 = "AB Props Hash couldn't be decrypted"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x004f:
            r1 = 0
        L_0x0050:
            X.2jE r0 = r5.A02
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x005c
            java.lang.String r0 = "unregistered"
            return r0
        L_0x005c:
            if (r1 == 0) goto L_0x0062
            java.lang.String r0 = "true"
            return r0
        L_0x0062:
            java.lang.String r0 = "false"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49222gB.A00():java.lang.String");
    }

    public String A01() {
        boolean z;
        C42062Mq r2 = this.A00;
        String A0Z = C18280x3.A0Z(C18300x5.A0B(r2.A01), "server_props:hash");
        if (A0Z != null) {
            z = !A0Z.equals(C57622tw.A00(C18300x5.A0B(r2.A02).getAll()));
        } else {
            z = false;
        }
        if (!this.A02.A02()) {
            return "unregistered";
        }
        if (z) {
            return "true";
        }
        return "false";
    }

    public C49222gB(C42062Mq r1, AnonymousClass1VV r2, C51072jE r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
