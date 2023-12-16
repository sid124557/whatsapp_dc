package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;

/* renamed from: X.1LY  reason: invalid class name */
public final class AnonymousClass1LY extends C90244gx {
    public final C56192ra A00;
    public final C40052Ei A01;
    public final AnonymousClass4CP A02;
    public final UserJid A03;
    public final AnonymousClass31C A04;
    public final C104705Sa A05;
    public final String A06;

    public void A02() {
        AnonymousClass31C r8 = this.A04;
        String A032 = r8.A03();
        C620433g r0 = this.A01;
        UserJid userJid = this.A03;
        String A012 = r0.A07.A01(userJid);
        if (A012 != null) {
            AnonymousClass36K r2 = new AnonymousClass36K("direct_connection_encrypted_info", A012, (AnonymousClass39V[]) null);
            AnonymousClass39V[] r1 = new AnonymousClass39V[1];
            AnonymousClass39V.A02(userJid, "biz_jid", r1, 0);
            AnonymousClass36K A0F = AnonymousClass36K.A0F(r2, "verify_postcode", r1);
            AnonymousClass39V[] r22 = new AnonymousClass39V[5];
            AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, r22, 0);
            AnonymousClass39V.A0C("xmlns", "w:biz:catalog", r22, 1, 2);
            AnonymousClass39V.A07("smax_id", "70", r22);
            r22[4] = AnonymousClass39V.A00();
            AnonymousClass36K A0G = AnonymousClass36K.A0G(A0F, r22);
            this.A05.A00(userJid, A032, 317);
            r8.A0E(this, A0G, A032, 317, 32000);
            return;
        }
        this.A02.BYZ("error", 422);
    }

    public final void A07(String str, int i) {
        C162457s7.A0J(str, 0);
        C56192ra r2 = this.A00;
        synchronized (r2) {
            r2.A02 = null;
            r2.A01 = null;
            r2.A00 = 0;
        }
        this.A02.BYZ(str, i);
    }

    public void BQs(String str) {
        C162457s7.A0J(str, 0);
        this.A05.A01(str);
        A07("error", 440);
    }

    public void A03() {
        Log.i("DCPostcodeVerificationProtocolHelper/onDirectConnectionRevokeKey");
    }

    public void A05(UserJid userJid, String str, int i) {
        if (str != null) {
            this.A05.A01(str);
        }
        A07("error", i);
    }

    public final void A06(C108985dt r5) {
        C56192ra r3 = this.A00;
        UserJid userJid = this.A03;
        String str = this.A06;
        synchronized (r3) {
            r3.A02 = str;
            Map map = r3.A03;
            List A0s = C18320x8.A0s(userJid, map);
            if (A0s != null) {
                A0s.add(this);
            } else {
                map.put(userJid, C18300x5.A0s(this));
                if (r3.A00(userJid) == null) {
                    new AnonymousClass3TI(userJid, r3.A0D).A00(new C64503Dt(r3, r5));
                } else {
                    r3.A03(r5, userJid);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1LY(C620433g r2, C56192ra r3, C40052Ei r4, AnonymousClass4CP r5, UserJid userJid, AnonymousClass31C r7, C104705Sa r8, String str) {
        super(r2, userJid);
        C18260x0.A0V(r2, r7, r3);
        C162457s7.A0J(r8, 5);
        this.A04 = r7;
        this.A00 = r3;
        this.A01 = r4;
        this.A05 = r8;
        this.A06 = str;
        this.A03 = userJid;
        this.A02 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c3, code lost:
        r10.A05.A01(r12);
        r1 = "error";
        r0 = 1002;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdM(X.AnonymousClass36K r11, java.lang.String r12) {
        /*
            r10 = this;
            X.C18260x0.A0O(r12, r11)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "DCPostcodeVerificationProtocolHelper/onSuccess/jid="
            r1.append(r0)
            com.whatsapp.jid.UserJid r5 = r10.A03
            X.C18260x0.A0m(r5, r1)
            X.2Ei r1 = r10.A01
            r9 = 0
            java.lang.String r0 = "result_code"
            X.36K r0 = r11.A0l(r0)
            if (r0 == 0) goto L_0x0023
            java.lang.String r6 = r0.A0n()
            if (r6 != 0) goto L_0x0025
        L_0x0023:
            java.lang.String r6 = "invalid_postcode"
        L_0x0025:
            java.lang.String r0 = "encrypted_location_name"
            X.36K r0 = r11.A0l(r0)
            r4 = 0
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = r0.A0n()
            if (r0 == 0) goto L_0x006c
            X.34Q r7 = r1.A00
            byte[] r8 = android.util.Base64.decode(r0, r9)
            byte[] r2 = r7.A00     // Catch:{ GeneralSecurityException -> 0x0062 }
            if (r2 == 0) goto L_0x006a
            int r1 = r2.length     // Catch:{ GeneralSecurityException -> 0x0062 }
            java.lang.String r0 = "AES"
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec     // Catch:{ GeneralSecurityException -> 0x0062 }
            r3.<init>(r2, r9, r1, r0)     // Catch:{ GeneralSecurityException -> 0x0062 }
            byte[] r0 = r7.A01     // Catch:{ GeneralSecurityException -> 0x0062 }
            if (r0 == 0) goto L_0x006a
            javax.crypto.spec.IvParameterSpec r2 = X.C18330xA.A0D(r0)     // Catch:{ GeneralSecurityException -> 0x0062 }
            javax.crypto.Cipher r1 = X.C18320x8.A0v()     // Catch:{ GeneralSecurityException -> 0x0062 }
            r0 = 2
            byte[] r1 = X.C18310x6.A1Y(r3, r2, r1, r8, r0)     // Catch:{ GeneralSecurityException -> 0x0062 }
            java.lang.String r0 = new java.lang.String     // Catch:{ GeneralSecurityException -> 0x0062 }
            r0.<init>(r1)     // Catch:{ GeneralSecurityException -> 0x0062 }
            r7.A00 = r4     // Catch:{ GeneralSecurityException -> 0x0062 }
            r7.A01 = r4     // Catch:{ GeneralSecurityException -> 0x0062 }
            r4 = r0
            goto L_0x006c
        L_0x0062:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x006a:
            java.lang.String r6 = "error"
        L_0x006c:
            X.2JY r7 = new X.2JY
            r7.<init>(r6, r4)
            java.lang.String r0 = r7.A00
            if (r0 != 0) goto L_0x0085
            X.5Sa r0 = r10.A05
            r0.A01(r12)
            java.lang.String r1 = r7.A01
            X.C162457s7.A0D(r1)
            r0 = 1001(0x3e9, float:1.403E-42)
        L_0x0081:
            r10.A07(r1, r0)
            return
        L_0x0085:
            X.2ra r6 = r10.A00
            monitor-enter(r6)
            java.lang.String r0 = r6.A01     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x00c2
            long r1 = r6.A00     // Catch:{ all -> 0x00e4 }
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x00c2
            X.33p r8 = r6.A0A     // Catch:{ all -> 0x00e4 }
            java.lang.String r4 = r5.getRawString()     // Catch:{ all -> 0x00e4 }
            java.lang.String r3 = r6.A01     // Catch:{ all -> 0x00e4 }
            android.content.SharedPreferences$Editor r2 = X.C18270x1.A03(r8)     // Catch:{ all -> 0x00e4 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00e4 }
            java.lang.String r0 = "smb_business_direct_connection_enc_string_"
            X.C18260x0.A0F(r2, r0, r4, r3, r1)     // Catch:{ all -> 0x00e4 }
            java.lang.String r5 = r5.getRawString()     // Catch:{ all -> 0x00e4 }
            long r2 = r6.A00     // Catch:{ all -> 0x00e4 }
            android.content.SharedPreferences$Editor r4 = X.C18270x1.A03(r8)     // Catch:{ all -> 0x00e4 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00e4 }
            java.lang.String r0 = "smb_business_direct_connection_enc_string_expired_timestamp_"
            r1.append(r0)     // Catch:{ all -> 0x00e4 }
            X.C18270x1.A0k(r4, r5, r1, r2)     // Catch:{ all -> 0x00e4 }
            goto L_0x00cd
        L_0x00c2:
            monitor-exit(r6)
            X.5Sa r0 = r10.A05
            r0.A01(r12)
            java.lang.String r1 = "error"
            r0 = 1002(0x3ea, float:1.404E-42)
            goto L_0x0081
        L_0x00cd:
            r0 = 0
            r6.A02 = r0     // Catch:{ all -> 0x00e2 }
            r6.A01 = r0     // Catch:{ all -> 0x00e2 }
            r0 = 0
            r6.A00 = r0     // Catch:{ all -> 0x00e2 }
            monitor-exit(r6)
            X.5Sa r0 = r10.A05
            r0.A02(r12)
            X.4CP r0 = r10.A02
            r0.BYa(r7)
            return
        L_0x00e2:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00e4 }
        L_0x00e4:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1LY.BdM(X.36K, java.lang.String):void");
    }
}
