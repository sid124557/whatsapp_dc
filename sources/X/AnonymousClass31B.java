package X;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.util.Arrays;
import org.json.JSONException;

/* renamed from: X.31B  reason: invalid class name */
public class AnonymousClass31B {
    public C41522Ko A00;
    public C61172zp A01;
    public C72413dg A02;
    public boolean A03;
    public final C55682qk A04;
    public final C66663Mh A05;
    public final C56612sH A06;
    public final AnonymousClass33p A07;
    public final C56102rQ A08;
    public final C57182tE A09;
    public final C61172zp A0A;
    public final AnonymousClass1VX A0B;
    public final AnonymousClass4FV A0C;
    public final C60152y5 A0D;

    public static C72423dh A00(byte[] bArr) {
        if (bArr.length != 64) {
            return null;
        }
        byte[][] A072 = AnonymousClass36A.A07(bArr, 32, 32);
        return new C72423dh(new C72403df(A072[0]), new C72413dg(A072[1]));
    }

    public synchronized C41522Ko A03() {
        return A04();
    }

    public synchronized C72423dh A05() {
        C72423dh r0;
        r0 = A04().A01;
        if (r0 == null) {
            throw AnonymousClass002.A0E("AuthKeyStore/failed to get client static key pair");
        }
        return r0;
    }

    public synchronized C72413dg A09() {
        C72413dg r2;
        byte[] decode;
        r2 = this.A02;
        if (r2 == null) {
            if (!this.A03) {
                String A0v = AnonymousClass0x9.A0v(C60152y5.A01(this), "server_static_public");
                r2 = null;
                try {
                    if (!TextUtils.isEmpty(A0v) && (decode = Base64.decode(A0v, 3)) != null) {
                        r2 = new C72413dg(decode);
                    }
                } catch (IllegalArgumentException e) {
                    Log.w("failed to deserialize server public key", e);
                }
                this.A02 = r2;
                this.A03 = true;
            }
        }
        return r2;
    }

    public synchronized void A0B() {
        A0A();
        Log.i("clearing client static key pair");
        boolean commit = C60152y5.A00(this.A0D, "keystore").remove("client_static_keypair_enc").remove("client_static_keypair_pwd_enc").commit();
        C61172zp r0 = this.A01;
        if (r0 != null) {
            r0.A03();
        }
        this.A08.A02();
        this.A0A.A03();
        this.A00 = null;
        if (!commit) {
            throw AnonymousClass002.A0E("unable to clear client static keypair");
        }
    }

    public synchronized void A0E(C72413dg r4) {
        Log.i("saving server static public key");
        if (C60152y5.A00(this.A0D, "keystore").putString("server_static_public", C18320x8.A0i(r4.A01)).commit()) {
            this.A02 = r4;
            this.A03 = true;
        } else {
            throw AnonymousClass0x9.A0i("unable to write server static keypair");
        }
    }

    public synchronized byte[] A0K() {
        C72423dh r0 = A04().A01;
        if (r0 == null) {
            return null;
        }
        return r0.A02.A01;
    }

    public final int A02(SharedPreferences sharedPreferences, C72423dh r5, C72423dh r6, int i) {
        if (r6 == null || r5 != null || !this.A0B.A0Y(C58422vE.A02, 377)) {
            return i;
        }
        Log.w("AuthKeyStore/recovering PWD key");
        A0D(sharedPreferences, r6.A01());
        C72423dh A062 = A06(sharedPreferences);
        C18270x1.A0g(sharedPreferences.edit().remove("client_static_keypair_enc_success"), "client_static_keypair_enc_failed");
        if (A062 != null) {
            return 5;
        }
        throw AnonymousClass002.A0E("AuthKeyStore/failed to get client static key pair");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0072, code lost:
        if (A0J(r7.A01()) != false) goto L_0x0074;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0128 A[Catch:{ JSONException -> 0x0084 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized X.C41522Ko A04() {
        /*
            r25 = this;
            r9 = r25
            monitor-enter(r9)
            r9.A0A()     // Catch:{ all -> 0x021b }
            X.2Ko r1 = r9.A00     // Catch:{ all -> 0x021b }
            if (r1 == 0) goto L_0x000e
            X.3dh r0 = r1.A01     // Catch:{ all -> 0x021b }
            if (r0 != 0) goto L_0x0219
        L_0x000e:
            android.content.SharedPreferences r8 = X.C60152y5.A01(r9)     // Catch:{ all -> 0x021b }
            X.3dh r7 = r9.A06(r8)     // Catch:{ all -> 0x021b }
            java.lang.String r11 = "can_user_android_key_store"
            boolean r0 = r8.contains(r11)     // Catch:{ all -> 0x021b }
            r10 = 1
            if (r0 != 0) goto L_0x0034
            android.content.SharedPreferences$Editor r0 = r8.edit()     // Catch:{ all -> 0x021b }
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r11, r10)     // Catch:{ all -> 0x021b }
            boolean r2 = r0.commit()     // Catch:{ all -> 0x021b }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x021b }
            java.lang.String r0 = "AuthKeyStore/first upgrade from non android key store code - assuming key store can be used "
            X.C18260x0.A1D(r0, r1, r2)     // Catch:{ all -> 0x021b }
        L_0x0034:
            X.2zp r0 = r9.A01     // Catch:{ all -> 0x021b }
            r2 = 0
            if (r0 == 0) goto L_0x01e4
            boolean r0 = r8.getBoolean(r11, r2)     // Catch:{ all -> 0x021b }
            if (r0 == 0) goto L_0x01e4
            X.1VX r13 = r9.A0B     // Catch:{ all -> 0x021b }
            r0 = 375(0x177, float:5.25E-43)
            X.2vE r12 = X.C58422vE.A02     // Catch:{ all -> 0x021b }
            int r24 = r13.A0O(r12, r0)     // Catch:{ all -> 0x021b }
            r0 = 384(0x180, float:5.38E-43)
            int r23 = r13.A0O(r12, r0)     // Catch:{ all -> 0x021b }
            r0 = 378(0x17a, float:5.3E-43)
            boolean r22 = r13.A0Y(r12, r0)     // Catch:{ all -> 0x021b }
            java.lang.String r0 = "AuthKeyStore/AndroidKeyStore in use"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x021b }
            java.lang.String r14 = "client_static_keypair_enc"
            boolean r0 = r8.contains(r14)     // Catch:{ all -> 0x021b }
            if (r0 != 0) goto L_0x0074
            if (r7 == 0) goto L_0x0074
            java.lang.String r0 = "AuthKeyStore/storing AndroidKeyStore key"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x021b }
            byte[] r0 = r7.A01()     // Catch:{ all -> 0x021b }
            boolean r0 = r9.A0J(r0)     // Catch:{ all -> 0x021b }
            r15 = 1
            if (r0 == 0) goto L_0x0075
        L_0x0074:
            r15 = 0
        L_0x0075:
            X.20A r0 = X.AnonymousClass20A.READ_ACTIVE     // Catch:{ all -> 0x021b }
            X.3dh r6 = r9.A07(r0)     // Catch:{ JSONException -> 0x007e }
            if (r6 != 0) goto L_0x0091
            goto L_0x007f
        L_0x007e:
            r6 = 0
        L_0x007f:
            X.3dh r6 = r9.A07(r0)     // Catch:{ JSONException -> 0x0084 }
            goto L_0x0091
        L_0x0084:
            r3 = move-exception
            java.lang.String r2 = "read invalid json"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x021b }
            java.lang.String r0 = "EncryptedKeyHelper/reportEncryptedKeyHelperProblem/"
            X.C18260x0.A0u(r0, r2, r1, r3)     // Catch:{ all -> 0x021b }
        L_0x0091:
            java.lang.String r21 = "client_static_keypair_enc_success"
            r0 = 0
            r2 = r21
            long r4 = r8.getLong(r2, r0)     // Catch:{ all -> 0x021b }
            java.lang.String r20 = "client_static_keypair_enc_failed"
            r2 = r20
            long r2 = r8.getLong(r2, r0)     // Catch:{ all -> 0x021b }
            r0 = 831(0x33f, float:1.164E-42)
            boolean r0 = r13.A0Y(r12, r0)     // Catch:{ all -> 0x021b }
            if (r0 == 0) goto L_0x00c6
            int r2 = r9.A02(r8, r7, r6, r15)     // Catch:{ all -> 0x021b }
            if (r7 != 0) goto L_0x00bb
            r0 = 5
            if (r2 == r0) goto L_0x00bb
            java.lang.String r0 = "AuthKeyStore/stopUsingAndroidKeyStore/cant stop using AndroidKeyStore"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x021b }
            goto L_0x0206
        L_0x00bb:
            android.content.SharedPreferences$Editor r1 = r8.edit()     // Catch:{ all -> 0x021b }
            r0 = 0
            X.C18270x1.A0l(r1, r11, r0)     // Catch:{ all -> 0x021b }
            r2 = 6
            goto L_0x0206
        L_0x00c6:
            r18 = 1
            r17 = 2
            if (r7 == 0) goto L_0x0164
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x021b }
            java.lang.String r0 = "AuthKeyStore/AndroidKeyStore in verifying stage/accessed = "
            X.C18260x0.A12(r0, r1, r4)     // Catch:{ all -> 0x021b }
            if (r6 != 0) goto L_0x00dd
            java.lang.String r0 = "AuthKeyStore/AndroidKeyStore in verifying stage/read failed"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x021b }
            goto L_0x0130
        L_0x00dd:
            byte[] r1 = r7.A01()     // Catch:{ all -> 0x021b }
            byte[] r0 = r6.A01()     // Catch:{ all -> 0x021b }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ all -> 0x021b }
            if (r0 == 0) goto L_0x012b
            long r4 = r4 + r18
            r0 = r24
            long r0 = (long) r0     // Catch:{ all -> 0x021b }
            int r10 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x010d
            r0 = r23
            long r0 = (long) r0     // Catch:{ all -> 0x021b }
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x010d
            java.lang.String r0 = "AuthKeyStore/AndroidKeyStore verified"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x021b }
            if (r22 == 0) goto L_0x010d
            android.content.SharedPreferences$Editor r1 = r8.edit()     // Catch:{ all -> 0x021b }
            java.lang.String r0 = "client_static_keypair_pwd_enc"
            X.C18270x1.A0g(r1, r0)     // Catch:{ all -> 0x021b }
            r15 = 4
            goto L_0x010e
        L_0x010d:
            r15 = 3
        L_0x010e:
            r0 = r21
            X.C18270x1.A0o(r8, r0, r4)     // Catch:{ all -> 0x021b }
            X.1Xx r10 = new X.1Xx     // Catch:{ all -> 0x021b }
            r10.<init>()     // Catch:{ all -> 0x021b }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x021b }
            r10.A01 = r0     // Catch:{ all -> 0x021b }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x021b }
            r10.A02 = r0     // Catch:{ all -> 0x021b }
            r1 = 3
            r0 = 5
            if (r15 != r1) goto L_0x01ec
            r0 = 4
            goto L_0x01ec
        L_0x012b:
            java.lang.String r0 = "AuthKeyStore/AndroidKeyStore in verifying stage/read wrong key"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x021b }
        L_0x0130:
            r0 = r15
            r15 = 1
            if (r0 == r10) goto L_0x0135
            r15 = 2
        L_0x0135:
            java.lang.String r0 = "AuthKeyStore/failed to use AndroidKeyStore"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x021b }
            long r2 = r2 + r18
            r0 = r20
            X.C18270x1.A0o(r8, r0, r2)     // Catch:{ all -> 0x021b }
            X.1Xw r1 = new X.1Xw     // Catch:{ all -> 0x021b }
            r1.<init>()     // Catch:{ all -> 0x021b }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x021b }
            r1.A01 = r0     // Catch:{ all -> 0x021b }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x021b }
            r1.A02 = r0     // Catch:{ all -> 0x021b }
            r0 = 3
            if (r15 != r10) goto L_0x0156
            r0 = 2
        L_0x0156:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x021b }
            r1.A00 = r0     // Catch:{ all -> 0x021b }
            X.4FV r0 = r9.A0C     // Catch:{ all -> 0x021b }
            r0.BhA(r1)     // Catch:{ all -> 0x021b }
            r6 = 0
            goto L_0x01f7
        L_0x0164:
            r0 = 0
            if (r6 == 0) goto L_0x016b
            r15 = 4
            goto L_0x01f7
        L_0x016b:
            boolean r16 = r8.contains(r14)     // Catch:{ all -> 0x021b }
            if (r16 != 0) goto L_0x0197
            java.lang.String r0 = "AuthKeyStore/AndroidKeyStore enabled, but have no keys, need to generate one"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x021b }
            r0 = r24
            long r0 = (long) r0     // Catch:{ all -> 0x021b }
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x0187
            r0 = r23
            long r0 = (long) r0     // Catch:{ all -> 0x021b }
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 > 0) goto L_0x0187
            if (r22 == 0) goto L_0x0187
            goto L_0x0188
        L_0x0187:
            r10 = 0
        L_0x0188:
            X.3dh r7 = r9.A08(r10)     // Catch:{ all -> 0x021b }
            boolean r0 = r8.contains(r14)     // Catch:{ all -> 0x021b }
            if (r0 == 0) goto L_0x0194
            r17 = 4
        L_0x0194:
            r15 = r17
            goto L_0x0202
        L_0x0197:
            boolean r2 = r8.contains(r14)     // Catch:{ all -> 0x021b }
            if (r2 == 0) goto L_0x01f7
            java.lang.String r4 = "android_key_store_verified_failures"
            long r0 = r8.getLong(r4, r0)     // Catch:{ all -> 0x021b }
            long r0 = r0 + r18
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x021b }
            java.lang.String r2 = "AuthKeyStore/failed to load auth key in \"verified\" AndroidKeyStore state/ failedCount = "
            X.C18260x0.A11(r2, r3, r0)     // Catch:{ all -> 0x021b }
            r2 = 376(0x178, float:5.27E-43)
            int r3 = r13.A0O(r12, r2)     // Catch:{ all -> 0x021b }
            r2 = -1
            if (r3 == r2) goto L_0x01e2
            long r2 = (long) r3     // Catch:{ all -> 0x021b }
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x01df
            if (r22 == 0) goto L_0x01df
            java.lang.String r0 = "AuthKeyStore/failed too much must recover"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x021b }
            r9.A0B()     // Catch:{ all -> 0x021b }
            r0 = r21
            android.content.SharedPreferences$Editor r1 = X.C18310x6.A0E(r8, r0)     // Catch:{ all -> 0x021b }
            r0 = r20
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)     // Catch:{ all -> 0x021b }
            android.content.SharedPreferences$Editor r1 = r0.remove(r4)     // Catch:{ all -> 0x021b }
            r0 = 0
            X.C18270x1.A0l(r1, r11, r0)     // Catch:{ all -> 0x021b }
            X.3dh r7 = r9.A08(r0)     // Catch:{ all -> 0x021b }
            goto L_0x01e2
        L_0x01df:
            X.C18270x1.A0o(r8, r4, r0)     // Catch:{ all -> 0x021b }
        L_0x01e2:
            r15 = 2
            goto L_0x0202
        L_0x01e4:
            if (r7 != 0) goto L_0x01ea
            X.3dh r7 = r9.A08(r2)     // Catch:{ all -> 0x021b }
        L_0x01ea:
            r6 = 0
            goto L_0x0206
        L_0x01ec:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x021b }
            r10.A00 = r0     // Catch:{ all -> 0x021b }
            X.4FV r0 = r9.A0C     // Catch:{ all -> 0x021b }
            r0.BhD(r10)     // Catch:{ all -> 0x021b }
        L_0x01f7:
            java.lang.String r1 = "android_key_store_verified_failures"
            boolean r0 = r8.contains(r1)     // Catch:{ all -> 0x021b }
            if (r0 == 0) goto L_0x0202
            X.C18270x1.A0n(r8, r1)     // Catch:{ all -> 0x021b }
        L_0x0202:
            int r2 = r9.A02(r8, r7, r6, r15)     // Catch:{ all -> 0x021b }
        L_0x0206:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x021b }
            java.lang.String r0 = "AuthKeyStore/current AES state = "
            X.C18260x0.A0y(r0, r1, r2)     // Catch:{ all -> 0x021b }
            if (r7 != 0) goto L_0x0212
            r7 = r6
        L_0x0212:
            X.2Ko r1 = new X.2Ko     // Catch:{ all -> 0x021b }
            r1.<init>(r7, r2)     // Catch:{ all -> 0x021b }
            r9.A00 = r1     // Catch:{ all -> 0x021b }
        L_0x0219:
            monitor-exit(r9)
            return r1
        L_0x021b:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass31B.A04():X.2Ko");
    }

    public final C72423dh A06(SharedPreferences sharedPreferences) {
        String string = sharedPreferences.getString("client_static_keypair_pwd_enc", (String) null);
        if (string != null) {
            try {
                C46402bZ A002 = C57182tE.A00(string);
                if (A002 != null) {
                    if (A002.A00 != 2) {
                        Log.e("AuthKeyStore/readClientStaticKeypairEnc 3 not expected type");
                        return null;
                    }
                    byte[] A042 = this.A0A.A04(AnonymousClass20A.READ_ACTIVE, A002);
                    Log.i("AuthKeyStore/readClientStaticKeypairEnc 3");
                    if (A042 != null) {
                        return A00(A042);
                    }
                    Log.e("AuthKeyStore/readClientStaticKeypairEnc/failed to read data");
                    return null;
                }
            } catch (JSONException unused) {
                return null;
            }
        }
        return null;
    }

    public final void A0A() {
        C23421Sz r0;
        if (this.A01 == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                C60152y5 r4 = this.A0D;
                SharedPreferences A032 = r4.A03("keystore");
                AnonymousClass1VX r3 = this.A0B;
                String A0R = r3.A0R(C58422vE.A02, 388);
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(Build.MANUFACTURER);
                String A0X = AnonymousClass000.A0X(";", A0o);
                if (A0R == null || !A0R.contains(A0X) || !A032.contains("client_static_keypair_pwd_enc")) {
                    r0 = new C23421Sz(this.A04, this.A05, r3, r4);
                    this.A01 = r0;
                }
            }
            r0 = null;
            this.A01 = r0;
        }
    }

    public void A0C(int i) {
        if (this.A0B.A0Y(C58422vE.A02, 1689)) {
            SharedPreferences A012 = C60152y5.A01(this);
            if (i > 5) {
                i = 5;
            } else if (i < 0) {
                i = 0;
            }
            C18270x1.A0h(A012.edit(), "remaining_auth_key_rotation_attempts", i);
        }
    }

    public final boolean A0G(SharedPreferences sharedPreferences, byte[] bArr) {
        C72423dh A062;
        if (!A0H(this.A0A.A02(bArr), "client_static_keypair_pwd_enc") || (A062 = A06(sharedPreferences)) == null || !Arrays.equals(bArr, A062.A01())) {
            C18260x0.A0u("EncryptedKeyHelper/reportEncryptedKeyHelperProblem/", "failed to store and read correct key", AnonymousClass001.A0o(), new RuntimeException());
            return false;
        }
        Log.i("AuthKeyStore/storedAndCanRead/3");
        return true;
    }

    public AnonymousClass31B(C55682qk r2, C66663Mh r3, C56612sH r4, AnonymousClass33p r5, C56102rQ r6, C57182tE r7, C50652iY r8, AnonymousClass1VX r9, AnonymousClass4FV r10, C60152y5 r11) {
        this.A06 = r4;
        this.A0B = r9;
        this.A04 = r2;
        this.A0C = r10;
        this.A05 = r3;
        this.A09 = r7;
        this.A07 = r5;
        this.A0D = r11;
        this.A08 = r6;
        this.A0A = new C23411Sy(r2, r3, r8, r11);
    }

    public static final void A01(SharedPreferences sharedPreferences) {
        if (!sharedPreferences.edit().remove("client_static_keypair_enc").commit()) {
            Log.w("AuthKeyStore/failed to clear key pair");
        }
    }

    public final C72423dh A07(AnonymousClass20A r6) {
        C46402bZ A002;
        C61172zp r0;
        SharedPreferences A012 = C60152y5.A01(this);
        String string = A012.getString("client_static_keypair_enc", (String) null);
        if (string == null || (A002 = C57182tE.A00(string)) == null) {
            return null;
        }
        if (A002.A00 != 0) {
            Log.e("AuthKeyStore/readAndroidKeyStoreClientStaticKeypairEnc not supported type");
            A01(A012);
        } else if (Build.VERSION.SDK_INT < 23 || (r0 = this.A01) == null) {
            Log.e("AuthKeyStore/readAndroidKeyStoreClientStaticKeypairEnc/not supported sdk for type");
            A01(A012);
            return null;
        } else {
            byte[] A042 = r0.A04(r6, A002);
            Log.i("AuthKeyStore/readAndroidKeyStoreClientStaticKeypairEnc");
            if (A042 != null) {
                return A00(A042);
            }
        }
        Log.e("AuthKeyStore/readAndroidKeyStoreClientStaticKeypairEnc/failed to read data");
        return null;
    }

    public final C72423dh A08(boolean z) {
        SharedPreferences A012 = C60152y5.A01(this);
        C18260x0.A1E("AuthKeyStore/generating new client static keypair/store 1 = ", AnonymousClass001.A0o(), z);
        C72423dh A002 = C72423dh.A00();
        byte[] A013 = A002.A01();
        if (!z || !A0J(A013)) {
            A0D(A012, A013);
        }
        C18270x1.A0h(C18270x1.A03(this.A07), "connection_lc", 0);
        return A002;
    }

    public final void A0D(SharedPreferences sharedPreferences, byte[] bArr) {
        if (!A0G(sharedPreferences, bArr) && !A0G(sharedPreferences, bArr)) {
            throw AnonymousClass002.A0E("unable to write client static keypair");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (java.util.Arrays.equals(r7, r0.A01()) == false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        com.whatsapp.util.Log.i("AuthKeyStore/storeAndCanReadAndroidKeyStoreKey/1");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        X.C18260x0.A0u("EncryptedKeyHelper/reportEncryptedKeyHelperProblem/", "read invalid json", X.AnonymousClass001.A0o(), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r0 == null) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r0 = A07(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r0 == null) goto L_0x0038;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0014 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0F(android.content.SharedPreferences r5, X.C61172zp r6, byte[] r7) {
        /*
            r4 = this;
            X.2bZ r1 = r6.A02(r7)
            java.lang.String r0 = "client_static_keypair_enc"
            boolean r0 = r4.A0H(r1, r0)
            if (r0 == 0) goto L_0x0038
            X.20A r1 = X.AnonymousClass20A.READ_SELFTEST
            X.3dh r0 = r4.A07(r1)     // Catch:{ JSONException -> 0x0014 }
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            X.3dh r0 = r4.A07(r1)     // Catch:{ JSONException -> 0x002b }
            if (r0 == 0) goto L_0x0038
        L_0x001a:
            byte[] r0 = r0.A01()
            boolean r0 = java.util.Arrays.equals(r7, r0)
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = "AuthKeyStore/storeAndCanReadAndroidKeyStoreKey/1"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 1
            return r0
        L_0x002b:
            r3 = move-exception
            java.lang.String r2 = "read invalid json"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "EncryptedKeyHelper/reportEncryptedKeyHelperProblem/"
            X.C18260x0.A0u(r0, r2, r1, r3)
        L_0x0038:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>()
            java.lang.String r2 = "failed to store and read correct key"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "EncryptedKeyHelper/reportEncryptedKeyHelperProblem/"
            X.C18260x0.A0u(r0, r2, r1, r3)
            A01(r5)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass31B.A0F(android.content.SharedPreferences, X.2zp, byte[]):boolean");
    }

    public final boolean A0H(C46402bZ r3, String str) {
        String A002;
        SharedPreferences A012 = C60152y5.A01(this);
        if (r3 == null || (A002 = r3.A00()) == null) {
            Log.e("AuthKeyStore/failed to store clientStaticKeypair/cant generate json");
            return false;
        }
        boolean commit = A012.edit().putString(str, A002).commit();
        if (!commit) {
            Log.e("AuthKeyStore/failed to store clientStaticKeypair");
        }
        return commit;
    }

    public final boolean A0I(C72423dh r4) {
        try {
            A0D(C60152y5.A01(this), r4.A01());
            return true;
        } catch (RuntimeException e) {
            C18260x0.A1O(AnonymousClass001.A0o(), "authkeystore/overwriteExistingKeypairPwd: ", e);
            return false;
        }
    }

    public final boolean A0J(byte[] bArr) {
        SharedPreferences A012 = C60152y5.A01(this);
        if (!TextUtils.isEmpty(C18280x3.A0Z(A012, "client_static_keypair_enc"))) {
            return false;
        }
        C61172zp r0 = this.A01;
        if (r0 != null && (A0F(A012, r0, bArr) || A0F(A012, this.A01, bArr))) {
            return true;
        }
        Log.w("AuthKeyStore/ensureEncKeyStored/failed to use enc csk");
        return false;
    }
}
