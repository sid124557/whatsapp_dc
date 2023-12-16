package X;

import com.whatsapp.util.Log;

/* renamed from: X.2nG  reason: invalid class name and case insensitive filesystem */
public final class C53542nG {
    public final AnonymousClass5HD A00;
    public final C56612sH A01;
    public final AnonymousClass33p A02;
    public final C57182tE A03;
    public final C50652iY A04;
    public final AnonymousClass1VX A05;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
        if ((r4 + 2592000000L) < r9.A01.A0H()) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair A00(java.lang.String r10, boolean r11) {
        /*
            r9 = this;
            X.33p r2 = r9.A02
            r0 = -1
            X.8qC r7 = r2.A01
            android.content.SharedPreferences r2 = X.C18300x5.A0B(r7)
            java.lang.String r6 = "push:push_pkey_generate_ts"
            long r4 = r2.getLong(r6, r0)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0026
            r0 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            long r4 = r4 + r0
            X.2sH r0 = r9.A01
            long r2 = r0.A0H()
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 >= 0) goto L_0x0027
        L_0x0026:
            r0 = 1
        L_0x0027:
            if (r0 == 0) goto L_0x006f
            java.lang.String r0 = "PushEncryptionHelper/isKeyExpired yes"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x002e:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r0 = 32
            byte[] r8 = X.AnonymousClass29O.A01(r0)
            X.2iY r1 = r9.A04
            java.lang.String r0 = X.C58172up.A0T
            X.2bZ r0 = r1.A00(r0, r8)
            r1 = 0
            if (r0 == 0) goto L_0x0069
            java.lang.String r4 = r0.A00()
            if (r4 == 0) goto L_0x0069
            java.lang.String r0 = "PushEncryptionHelper/created new shared secret"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2sH r0 = r9.A01
            long r2 = r0.A0H()
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass0x2.A0E(r7)
            java.lang.String r0 = "push:push_pkey_data"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r4)
            X.C18270x1.A0i(r0, r6, r2)
            java.lang.String r1 = X.AnonymousClass0x7.A0s(r8)
        L_0x0064:
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r5, r1)
            return r0
        L_0x0069:
            java.lang.String r0 = "PushEncryptionHelper/makeNewSharedSecret generation failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0064
        L_0x006f:
            byte[] r4 = r9.A02()
            if (r4 == 0) goto L_0x002e
            if (r11 != 0) goto L_0x00a7
            r0 = 1
            if (r10 == 0) goto L_0x00a1
            r3 = 0
            java.security.MessageDigest r0 = X.AnonymousClass0x7.A0t()     // Catch:{ NoSuchAlgorithmException -> 0x0080 }
            goto L_0x0086
        L_0x0080:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0 = 0
            goto L_0x00a1
        L_0x0086:
            r2 = 6
            byte[] r1 = new byte[r2]
            byte[] r0 = r0.digest(r4)
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            java.lang.String r0 = X.C18290x4.A0t(r1)
            boolean r1 = r0.equals(r10)
            if (r1 != 0) goto L_0x009f
            java.lang.String r0 = "PushEncryptionHelper/pKey hash mismatch with server"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x009f:
            r0 = r1 ^ 1
        L_0x00a1:
            if (r0 != 0) goto L_0x00a7
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r1 = 0
            goto L_0x0064
        L_0x00a7:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            java.lang.String r1 = X.AnonymousClass0x7.A0s(r4)
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53542nG.A00(java.lang.String, boolean):android.util.Pair");
    }

    public final boolean A01() {
        if (this.A05.A0O(C58422vE.A02, 4116) > 0 || ((C614930z) this.A00.A00.get()).A07()) {
            return true;
        }
        return false;
    }

    public final byte[] A02() {
        C46402bZ A002;
        String A0Z = C18280x3.A0Z(AnonymousClass0x2.A0F(this.A02), "push:push_pkey_data");
        if (A0Z == null || (A002 = C57182tE.A00(A0Z)) == null) {
            return null;
        }
        byte[] A012 = this.A04.A01(A002, C58172up.A0T);
        if (A012 == null) {
            Log.e("PushEncryptionHelper/getSavedPKey failed to parse");
        }
        return A012;
    }

    public C53542nG(AnonymousClass5HD r2, C56612sH r3, AnonymousClass33p r4, C57182tE r5, C50652iY r6, AnonymousClass1VX r7) {
        C18260x0.A0d(r3, r7, r4, r6);
        C162457s7.A0J(r2, 6);
        this.A01 = r3;
        this.A05 = r7;
        this.A03 = r5;
        this.A02 = r4;
        this.A04 = r6;
        this.A00 = r2;
    }
}
