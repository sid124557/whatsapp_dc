package X;

import com.whatsapp.util.Log;

/* renamed from: X.3TH  reason: invalid class name */
public class AnonymousClass3TH implements AnonymousClass4EZ {
    public final AnonymousClass31B A00;
    public final C72423dh A01;
    public final /* synthetic */ AnonymousClass2ZJ A02;

    public AnonymousClass3TH(AnonymousClass31B r1, AnonymousClass2ZJ r2, C72423dh r3) {
        this.A02 = r2;
        this.A00 = r1;
        this.A01 = r3;
    }

    public final void A00() {
        int i;
        AnonymousClass31B r6 = this.A00;
        long A0H = r6.A06.A0H();
        C60152y5 r7 = r6.A0D;
        C18270x1.A0i(C60152y5.A00(r7, "keystore"), "last_failed_auth_key_rotation_attempt", A0H);
        if (!r6.A0B.A0Y(C58422vE.A02, 1689)) {
            i = 0;
        } else {
            i = r7.A03("keystore").getInt("remaining_auth_key_rotation_attempts", 0);
        }
        r6.A0C(i - 1);
    }

    public void BQs(String str) {
        Log.w("AuthkeyRotationManager/SetAuthkeyIqResponseCallBack/onDeliveryFailure");
    }

    public void BSN(AnonymousClass36K r2, String str) {
        Log.w("AuthkeyRotationManager/SetAuthkeyIqResponseCallBack/onError: 500 IQ error");
        A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0058, code lost:
        if (r9 > ((long) r11)) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0113, code lost:
        com.whatsapp.util.Log.w("AuthkeyRotationManager/SetAuthkeyIqResponseCallBack/onSuccess: failed to overwrite existing authkey");
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdM(X.AnonymousClass36K r16, java.lang.String r17) {
        /*
            r15 = this;
            X.31B r2 = r15.A00
            X.3dh r6 = r15.A01
            monitor-enter(r2)
            X.1VX r8 = r2.A0B     // Catch:{ all -> 0x011c }
            r0 = 1689(0x699, float:2.367E-42)
            X.2vE r1 = X.C58422vE.A02     // Catch:{ all -> 0x011c }
            boolean r0 = r8.A0Y(r1, r0)     // Catch:{ all -> 0x011c }
            r3 = 0
            if (r0 == 0) goto L_0x0112
            r2.A0A()     // Catch:{ all -> 0x011c }
            X.2y5 r5 = r2.A0D     // Catch:{ all -> 0x011c }
            java.lang.String r4 = "keystore"
            android.content.SharedPreferences r7 = r5.A03(r4)     // Catch:{ all -> 0x011c }
            r0 = 831(0x33f, float:1.164E-42)
            boolean r0 = r8.A0Y(r1, r0)     // Catch:{ all -> 0x011c }
            if (r0 != 0) goto L_0x00cd
            X.2zp r0 = r2.A01     // Catch:{ all -> 0x011c }
            if (r0 == 0) goto L_0x00cd
            java.lang.String r0 = "can_user_android_key_store"
            boolean r0 = r7.getBoolean(r0, r3)     // Catch:{ all -> 0x011c }
            if (r0 == 0) goto L_0x00cd
            android.content.SharedPreferences r9 = r5.A03(r4)     // Catch:{ all -> 0x011c }
            r0 = 375(0x177, float:5.25E-43)
            int r14 = r8.A0O(r1, r0)     // Catch:{ all -> 0x011c }
            r0 = 384(0x180, float:5.38E-43)
            int r11 = r8.A0O(r1, r0)     // Catch:{ all -> 0x011c }
            java.lang.String r8 = "client_static_keypair_enc_success"
            r0 = 0
            long r12 = r9.getLong(r8, r0)     // Catch:{ all -> 0x011c }
            java.lang.String r8 = "client_static_keypair_enc_failed"
            long r9 = r9.getLong(r8, r0)     // Catch:{ all -> 0x011c }
            long r0 = (long) r14     // Catch:{ all -> 0x011c }
            int r8 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x005a
            long r0 = (long) r11     // Catch:{ all -> 0x011c }
            int r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            r0 = 1
            if (r8 <= 0) goto L_0x005b
        L_0x005a:
            r0 = 0
        L_0x005b:
            java.lang.String r9 = "AuthKeyStore/mismatch after rotation"
            if (r0 == 0) goto L_0x0096
            android.content.SharedPreferences r0 = r5.A03(r4)     // Catch:{ all -> 0x011c }
            X.AnonymousClass31B.A01(r0)     // Catch:{ all -> 0x011c }
            byte[] r0 = r6.A01()     // Catch:{ all -> 0x011c }
            boolean r0 = r2.A0J(r0)     // Catch:{ all -> 0x011c }
            if (r0 != 0) goto L_0x0077
            java.lang.String r0 = "authkeystore/overwriteExistingKeypairKeyStore: failed to write the new authkey, lost the old authkey"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x011c }
            r1 = 0
            goto L_0x0078
        L_0x0077:
            r1 = 1
        L_0x0078:
            java.lang.String r0 = "client_static_keypair_pwd_enc"
            boolean r0 = r7.contains(r0)     // Catch:{ all -> 0x011c }
            if (r1 == 0) goto L_0x0083
            if (r0 == 0) goto L_0x00e1
            goto L_0x00d4
        L_0x0083:
            if (r0 != 0) goto L_0x0112
            X.2qk r4 = r2.A04     // Catch:{ all -> 0x011c }
            java.lang.String r1 = "AuthKeyStore/failed to rotate KeyStore key"
            java.lang.String r0 = "Failed to update new authkey to KeyStore"
            r4.A0A(r1, r3, r0)     // Catch:{ all -> 0x011c }
            byte[] r0 = r6.A01()     // Catch:{ all -> 0x011c }
            r2.A0D(r7, r0)     // Catch:{ all -> 0x011c }
            goto L_0x0112
        L_0x0096:
            android.content.SharedPreferences r0 = r5.A03(r4)     // Catch:{ all -> 0x011c }
            X.AnonymousClass31B.A01(r0)     // Catch:{ all -> 0x011c }
            byte[] r0 = r6.A01()     // Catch:{ all -> 0x011c }
            boolean r0 = r2.A0J(r0)     // Catch:{ all -> 0x011c }
            if (r0 != 0) goto L_0x00ae
            java.lang.String r0 = "authkeystore/overwriteExistingKeypairKeyStore: failed to write the new authkey, lost the old authkey"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x011c }
            r8 = 0
            goto L_0x00af
        L_0x00ae:
            r8 = 1
        L_0x00af:
            boolean r10 = r2.A0I(r6)     // Catch:{ all -> 0x011c }
            if (r8 == r10) goto L_0x00d1
            X.2qk r7 = r2.A04     // Catch:{ all -> 0x011c }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x011c }
            java.lang.String r0 = "KeyStoreKeyIsSuccessfullyRotated: "
            r1.append(r0)     // Catch:{ all -> 0x011c }
            r1.append(r8)     // Catch:{ all -> 0x011c }
            java.lang.String r0 = ", PwdKeyIsSuccessfullyRotated: "
            java.lang.String r0 = X.AnonymousClass000.A0b(r0, r1, r10)     // Catch:{ all -> 0x011c }
            r7.A0A(r9, r3, r0)     // Catch:{ all -> 0x011c }
            goto L_0x00d1
        L_0x00cd:
            boolean r10 = r2.A0I(r6)     // Catch:{ all -> 0x011c }
        L_0x00d1:
            if (r10 == 0) goto L_0x0112
            goto L_0x00e1
        L_0x00d4:
            boolean r0 = r2.A0I(r6)     // Catch:{ all -> 0x011c }
            if (r0 != 0) goto L_0x00e1
            X.2qk r1 = r2.A04     // Catch:{ all -> 0x011c }
            java.lang.String r0 = "KeyStore key was rotated, PWD key was not rotated"
            r1.A0A(r9, r3, r0)     // Catch:{ all -> 0x011c }
        L_0x00e1:
            r1 = 7
            X.2Ko r0 = new X.2Ko     // Catch:{ all -> 0x011c }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x011c }
            r2.A00 = r0     // Catch:{ all -> 0x011c }
            X.33p r0 = r2.A07     // Catch:{ all -> 0x011c }
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)     // Catch:{ all -> 0x011c }
            java.lang.String r0 = "connection_lc"
            X.C18270x1.A0h(r1, r0, r3)     // Catch:{ all -> 0x011c }
            X.2rQ r0 = r2.A08     // Catch:{ all -> 0x011c }
            r0.A02()     // Catch:{ all -> 0x011c }
            monitor-exit(r2)
            java.lang.String r0 = "AuthkeyRotationManager/SetAuthkeyIqResponseCallBack/onSuccess: success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.A0C(r3)
            X.2sH r0 = r2.A06
            long r2 = r0.A0H()
            android.content.SharedPreferences$Editor r1 = X.C60152y5.A00(r5, r4)
            java.lang.String r0 = "last_succeeded_auth_key_rotation_attempt"
            X.C18270x1.A0i(r1, r0, r2)
            return
        L_0x0112:
            monitor-exit(r2)
            java.lang.String r0 = "AuthkeyRotationManager/SetAuthkeyIqResponseCallBack/onSuccess: failed to overwrite existing authkey"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r15.A00()
            return
        L_0x011c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3TH.BdM(X.36K, java.lang.String):void");
    }
}
