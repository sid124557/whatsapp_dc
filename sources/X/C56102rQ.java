package X;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.security.KeyStore;
import java.security.Signature;
import java.security.cert.Certificate;

/* renamed from: X.2rQ  reason: invalid class name and case insensitive filesystem */
public class C56102rQ {
    public final C55682qk A00;
    public final C56612sH A01;
    public final AnonymousClass33p A02;
    public final AnonymousClass1VW A03;
    public final AnonymousClass1VX A04;
    public final AnonymousClass4FV A05;
    public final C51072jE A06;

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0099, code lost:
        if (r13 == false) goto L_0x009b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009d A[Catch:{ Exception -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d6 A[SYNTHETIC, Splitter:B:31:0x00d6] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00eb A[Catch:{ Exception -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x012c A[Catch:{ Exception -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x013b A[Catch:{ Exception -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0177 A[Catch:{ Exception -> 0x01aa }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(byte[] r21, java.lang.String r22) {
        /*
            r20 = this;
            r5 = r21
            java.lang.String r9 = "AndroidKeyStore"
            java.lang.String r6 = "blacknoise/perf: attestation time "
            java.lang.String r8 = "att-gen"
            r7 = r20
            boolean r0 = r7.A05()
            if (r0 == 0) goto L_0x01f4
            X.2sH r0 = r7.A01
            r19 = r0
            long r3 = android.os.SystemClock.elapsedRealtime()
            java.security.KeyStore r12 = java.security.KeyStore.getInstance(r9)     // Catch:{ Exception -> 0x01aa }
            r0 = 0
            r12.load(r0)     // Catch:{ Exception -> 0x01aa }
            r10 = r22
            java.security.KeyStore$Entry r11 = r12.getEntry(r10, r0)     // Catch:{ Exception -> 0x01aa }
            boolean r13 = r11 instanceof java.security.KeyStore.PrivateKeyEntry     // Catch:{ Exception -> 0x01aa }
            java.lang.String r0 = r7.A01()     // Catch:{ Exception -> 0x01aa }
            boolean r2 = r10.equals(r0)     // Catch:{ Exception -> 0x01aa }
            boolean r0 = r7.A05()     // Catch:{ Exception -> 0x01aa }
            if (r0 == 0) goto L_0x0099
            if (r2 == 0) goto L_0x0041
            X.2jE r0 = r7.A06     // Catch:{ Exception -> 0x01aa }
            boolean r0 = r0.A02()     // Catch:{ Exception -> 0x01aa }
            if (r0 == 0) goto L_0x0041
            goto L_0x0099
        L_0x0041:
            if (r13 == 0) goto L_0x005f
            X.1VX r14 = r7.A04     // Catch:{ Exception -> 0x01aa }
            r1 = 2076(0x81c, float:2.909E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ Exception -> 0x01aa }
            java.lang.String r1 = r14.A0R(r0, r1)     // Catch:{ Exception -> 0x01aa }
            r0 = r11
            java.security.KeyStore$PrivateKeyEntry r0 = (java.security.KeyStore.PrivateKeyEntry) r0     // Catch:{ Exception -> 0x01aa }
            java.security.PrivateKey r0 = r0.getPrivateKey()     // Catch:{ Exception -> 0x01aa }
            java.lang.String r0 = r0.getAlgorithm()     // Catch:{ Exception -> 0x01aa }
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x01aa }
            if (r0 != 0) goto L_0x005f
            goto L_0x009b
        L_0x005f:
            X.33p r0 = r7.A02     // Catch:{ Exception -> 0x01aa }
            if (r2 == 0) goto L_0x007f
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)     // Catch:{ Exception -> 0x01aa }
            java.lang.String r0 = "ka_static_refresh_ts"
            long r16 = X.AnonymousClass0x2.A0B(r1, r0)     // Catch:{ Exception -> 0x01aa }
            X.1VW r14 = r7.A03     // Catch:{ Exception -> 0x01aa }
            r1 = 4878(0x130e, float:6.836E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ Exception -> 0x01aa }
            int r0 = r14.A0O(r0, r1)     // Catch:{ Exception -> 0x01aa }
        L_0x0077:
            long r0 = (long) r0     // Catch:{ Exception -> 0x01aa }
            long r16 = r16 + r0
            long r14 = X.C18280x3.A07()     // Catch:{ Exception -> 0x01aa }
            goto L_0x0094
        L_0x007f:
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)     // Catch:{ Exception -> 0x01aa }
            java.lang.String r0 = "ka_refresh_ts"
            long r16 = X.AnonymousClass0x2.A0B(r1, r0)     // Catch:{ Exception -> 0x01aa }
            X.1VX r14 = r7.A04     // Catch:{ Exception -> 0x01aa }
            r1 = 2079(0x81f, float:2.913E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ Exception -> 0x01aa }
            int r0 = r14.A0O(r0, r1)     // Catch:{ Exception -> 0x01aa }
            goto L_0x0077
        L_0x0094:
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x0099
            goto L_0x009b
        L_0x0099:
            if (r13 != 0) goto L_0x01cf
        L_0x009b:
            if (r2 != 0) goto L_0x00d4
            X.33p r14 = r7.A02     // Catch:{ Exception -> 0x01aa }
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r14)     // Catch:{ Exception -> 0x01aa }
            java.lang.String r13 = "ka_retried_ts"
            long r17 = X.AnonymousClass0x2.A0B(r0, r13)     // Catch:{ Exception -> 0x01aa }
            X.1VX r1 = r7.A04     // Catch:{ Exception -> 0x01aa }
            r0 = 2427(0x97b, float:3.401E-42)
            long r0 = X.C56952sp.A06(r1, r0)     // Catch:{ Exception -> 0x01aa }
            long r17 = r17 + r0
            long r15 = X.C18280x3.A07()     // Catch:{ Exception -> 0x01aa }
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c2
            java.lang.String r0 = "blacknoise/regeneration attempted too soon, waiting"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ Exception -> 0x01aa }
            goto L_0x01cf
        L_0x00c2:
            java.lang.String r0 = "blacknoise/pair not found or force refresh, creating one."
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ Exception -> 0x01aa }
            boolean r0 = r7.A05()     // Catch:{ Exception -> 0x01aa }
            if (r0 == 0) goto L_0x00d4
            long r0 = X.C18280x3.A07()     // Catch:{ Exception -> 0x01aa }
            X.C18260x0.A0M(r14, r13, r0)     // Catch:{ Exception -> 0x01aa }
        L_0x00d4:
            if (r11 == 0) goto L_0x00df
            r12.deleteEntry(r10)     // Catch:{ Exception -> 0x00da }
            goto L_0x00df
        L_0x00da:
            java.lang.String r0 = "blacknoise/error deleting previous pair"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x01aa }
        L_0x00df:
            X.1VX r12 = r7.A04     // Catch:{ Exception -> 0x01aa }
            r0 = 2076(0x81c, float:2.909E-42)
            X.2vE r11 = X.C58422vE.A02     // Catch:{ Exception -> 0x01aa }
            java.lang.String r13 = r12.A0R(r11, r0)     // Catch:{ Exception -> 0x01aa }
            if (r13 != 0) goto L_0x00ed
            java.lang.String r13 = "EC"
        L_0x00ed:
            java.security.KeyPairGenerator r9 = java.security.KeyPairGenerator.getInstance(r13, r9)     // Catch:{ Exception -> 0x01aa }
            java.util.Date r14 = new java.util.Date     // Catch:{ Exception -> 0x01aa }
            r14.<init>()     // Catch:{ Exception -> 0x01aa }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01aa }
            r15 = 2079(0x81f, float:2.913E-42)
            long r17 = X.C56952sp.A06(r12, r15)     // Catch:{ Exception -> 0x01aa }
            r15 = 1000(0x3e8, double:4.94E-321)
            long r17 = r17 * r15
            long r0 = r0 + r17
            r14.setTime(r0)     // Catch:{ Exception -> 0x01aa }
            r0 = 4
            android.security.keystore.KeyGenParameterSpec$Builder r1 = new android.security.keystore.KeyGenParameterSpec$Builder     // Catch:{ Exception -> 0x01aa }
            r1.<init>(r10, r0)     // Catch:{ Exception -> 0x01aa }
            java.lang.String r10 = "SHA-256"
            java.lang.String r0 = "SHA-512"
            java.lang.String[] r0 = new java.lang.String[]{r10, r0}     // Catch:{ Exception -> 0x01aa }
            android.security.keystore.KeyGenParameterSpec$Builder r1 = r1.setDigests(r0)     // Catch:{ Exception -> 0x01aa }
            r0 = 0
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r1.setUserAuthenticationRequired(r0)     // Catch:{ Exception -> 0x01aa }
            android.security.keystore.KeyGenParameterSpec$Builder r10 = r0.setCertificateNotAfter(r14)     // Catch:{ Exception -> 0x01aa }
            java.lang.String r0 = "RSA"
            boolean r0 = r13.equals(r0)     // Catch:{ Exception -> 0x01aa }
            if (r0 == 0) goto L_0x0135
            java.lang.String r0 = "PKCS1"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ Exception -> 0x01aa }
            r10.setSignaturePaddings(r0)     // Catch:{ Exception -> 0x01aa }
        L_0x0135:
            boolean r0 = X.C107385bE.A03()     // Catch:{ Exception -> 0x01aa }
            if (r0 == 0) goto L_0x0171
            if (r21 != 0) goto L_0x014c
            java.security.SecureRandom r1 = X.AnonymousClass29O.A00()     // Catch:{ Exception -> 0x01aa }
            r0 = 2078(0x81e, float:2.912E-42)
            int r0 = r12.A0O(r11, r0)     // Catch:{ Exception -> 0x01aa }
            byte[] r5 = new byte[r0]     // Catch:{ Exception -> 0x01aa }
            r1.nextBytes(r5)     // Catch:{ Exception -> 0x01aa }
        L_0x014c:
            long r0 = r19.A0H()     // Catch:{ Exception -> 0x01aa }
            long r0 = r0 / r15
            int r11 = r5.length     // Catch:{ Exception -> 0x01aa }
            int r11 = r11 + 8
            int r11 = r11 + 1
            java.nio.ByteBuffer r12 = java.nio.ByteBuffer.allocate(r11)     // Catch:{ Exception -> 0x01aa }
            java.nio.ByteOrder r11 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ Exception -> 0x01aa }
            r12.order(r11)     // Catch:{ Exception -> 0x01aa }
            r12.putLong(r0)     // Catch:{ Exception -> 0x01aa }
            r0 = 31
            r12.put(r0)     // Catch:{ Exception -> 0x01aa }
            r12.put(r5)     // Catch:{ Exception -> 0x01aa }
            byte[] r0 = r12.array()     // Catch:{ Exception -> 0x01aa }
            r10.setAttestationChallenge(r0)     // Catch:{ Exception -> 0x01aa }
        L_0x0171:
            boolean r0 = X.C107385bE.A09()     // Catch:{ Exception -> 0x01aa }
            if (r0 == 0) goto L_0x017b
            r0 = 1
            r10.setDevicePropertiesAttestationIncluded(r0)     // Catch:{ Exception -> 0x01aa }
        L_0x017b:
            android.security.keystore.KeyGenParameterSpec r0 = r10.build()     // Catch:{ ProviderException -> 0x0186 }
            r9.initialize(r0)     // Catch:{ ProviderException -> 0x0186 }
            r9.generateKeyPair()     // Catch:{ ProviderException -> 0x0186 }
            goto L_0x01a0
        L_0x0186:
            r1 = move-exception
            boolean r0 = X.C107385bE.A09()     // Catch:{ all -> 0x01a5 }
            if (r0 == 0) goto L_0x01a4
            java.lang.String r0 = "blacknoise/disbabling device ids att"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x01a5 }
            r0 = 0
            r10.setDevicePropertiesAttestationIncluded(r0)     // Catch:{ all -> 0x01a5 }
            android.security.keystore.KeyGenParameterSpec r0 = r10.build()     // Catch:{ all -> 0x01a5 }
            r9.initialize(r0)     // Catch:{ all -> 0x01a5 }
            r9.generateKeyPair()     // Catch:{ all -> 0x01a5 }
        L_0x01a0:
            r7.A03(r2)     // Catch:{ Exception -> 0x01aa }
            goto L_0x01cf
        L_0x01a4:
            throw r1     // Catch:{ all -> 0x01a5 }
        L_0x01a5:
            r0 = move-exception
            r7.A03(r2)     // Catch:{ Exception -> 0x01aa }
            throw r0     // Catch:{ Exception -> 0x01aa }
        L_0x01aa:
            r9 = move-exception
            java.lang.String r1 = "blacknoise/exception on pair creation"
            java.lang.Throwable r0 = r9.getCause()     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x01cd
            java.lang.Throwable r0 = r9.getCause()     // Catch:{ all -> 0x01e1 }
        L_0x01b7:
            com.whatsapp.util.Log.e(r1, r0)     // Catch:{ all -> 0x01e1 }
            X.2qk r5 = r7.A00     // Catch:{ all -> 0x01e1 }
            java.lang.String r2 = "attestation-creation"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "unable to create attestation: "
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r9)     // Catch:{ all -> 0x01e1 }
            r5.A09(r2, r0, r9)     // Catch:{ all -> 0x01e1 }
            goto L_0x01cf
        L_0x01cd:
            r0 = r9
            goto L_0x01b7
        L_0x01cf:
            X.1Xz r0 = new X.1Xz
            r0.<init>()
            java.lang.StringBuilder r1 = A00(r7, r0, r8, r3)
            r1.append(r6)
            java.lang.Long r0 = r0.A00
            X.C18260x0.A0m(r0, r1)
            return
        L_0x01e1:
            r2 = move-exception
            X.1Xz r0 = new X.1Xz
            r0.<init>()
            java.lang.StringBuilder r1 = A00(r7, r0, r8, r3)
            r1.append(r6)
            java.lang.Long r0 = r0.A00
            X.C18260x0.A0m(r0, r1)
            throw r2
        L_0x01f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56102rQ.A04(byte[], java.lang.String):void");
    }

    public byte[] A07(byte[] bArr, byte[] bArr2) {
        StringBuilder sb;
        C24591Xz r0;
        if (!A05()) {
            return null;
        }
        A04(bArr2, A01());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            KeyStore.Entry entry = instance.getEntry(A01(), (KeyStore.ProtectionParameter) null);
            if (!(entry instanceof KeyStore.PrivateKeyEntry)) {
                Log.e("blacknoise/Not an instance of a PKEntry");
                this.A00.A0A("attestation-nosign", true, "cannot sign payload, att pair missing");
                r0 = new C24591Xz();
                sb = A00(this, r0, "att-sign", elapsedRealtime);
                sb.append("blacknoise/perf: signature time ");
                C18260x0.A0m(r0.A00, sb);
                return null;
            }
            Signature instance2 = Signature.getInstance(this.A04.A0R(C58422vE.A02, 2075));
            instance2.initSign(((KeyStore.PrivateKeyEntry) entry).getPrivateKey());
            instance2.update(bArr);
            byte[] sign = instance2.sign();
            Object[] A0M = AnonymousClass002.A0M();
            A0M[0] = Base64.encodeToString(bArr, 0);
            A0M[1] = Base64.encodeToString(sign, 0);
            Log.d(String.format("blacknoise/successfully signed pipe P = %s / S = %s", A0M));
            C24591Xz r02 = new C24591Xz();
            StringBuilder A002 = A00(this, r02, "att-sign", elapsedRealtime);
            A002.append("blacknoise/perf: signature time ");
            C18260x0.A0m(r02.A00, A002);
            return sign;
        } catch (Exception e) {
            Log.e("blacknoise/exception on pair sign", e);
            this.A00.A09("attestation-nosign", AnonymousClass000.A0a("unable to sign payload: ", AnonymousClass001.A0o(), e), e);
            r0 = new C24591Xz();
            sb = A00(this, r0, "att-sign", elapsedRealtime);
        } catch (Throwable th) {
            C24591Xz r03 = new C24591Xz();
            StringBuilder A003 = A00(this, r03, "att-sign", elapsedRealtime);
            A003.append("blacknoise/perf: signature time ");
            C18260x0.A0m(r03.A00, A003);
            throw th;
        }
    }

    public C56102rQ(C55682qk r1, C56612sH r2, AnonymousClass33p r3, AnonymousClass1VW r4, AnonymousClass1VX r5, AnonymousClass4FV r6, C51072jE r7) {
        this.A04 = r5;
        this.A00 = r1;
        this.A02 = r3;
        this.A05 = r6;
        this.A01 = r2;
        this.A06 = r7;
        this.A03 = r4;
    }

    public static StringBuilder A00(C56102rQ r2, C24591Xz r3, String str, long j) {
        r3.A00 = Long.valueOf(SystemClock.elapsedRealtime() - j);
        r3.A02 = str;
        r2.A05.BhD(r3);
        return new StringBuilder();
    }

    public final String A01() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A04.A0R(C58422vE.A02, 2074));
        String A0X = AnonymousClass000.A0X("_static", A0o);
        if (A0X == null) {
            return "my_personal_mini_pony_static";
        }
        return A0X;
    }

    public void A02() {
        if (A05()) {
            try {
                KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                instance.load((KeyStore.LoadStoreParameter) null);
                String A0R = this.A04.A0R(C58422vE.A02, 2074);
                if (A0R == null) {
                    A0R = "my_personal_mini_pony";
                }
                instance.deleteEntry(A0R);
                instance.deleteEntry(A01());
            } catch (Exception e) {
                Log.e("blacknoise/exception on certificate wipe", e);
            } catch (Throwable th) {
                AnonymousClass33p r4 = this.A02;
                C18270x1.A0i(C18270x1.A03(r4), "ka_retried_ts", 0);
                C18270x1.A0i(C18270x1.A03(r4), "ka_static_refresh_ts", 0);
                C18270x1.A0i(C18270x1.A03(r4), "ka_refresh_ts", 0);
                throw th;
            }
            AnonymousClass33p r42 = this.A02;
            C18270x1.A0i(C18270x1.A03(r42), "ka_retried_ts", 0);
            C18270x1.A0i(C18270x1.A03(r42), "ka_static_refresh_ts", 0);
            C18270x1.A0i(C18270x1.A03(r42), "ka_refresh_ts", 0);
        }
    }

    public void A03(boolean z) {
        String str;
        if (A05()) {
            AnonymousClass33p r0 = this.A02;
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor A032 = C18270x1.A03(r0);
            if (z) {
                str = "ka_static_refresh_ts";
            } else {
                str = "ka_refresh_ts";
            }
            C18270x1.A0i(A032, str, currentTimeMillis);
        }
    }

    public boolean A05() {
        if (!C107385bE.A02() || !this.A04.A0Y(C58422vE.A02, 1934)) {
            return false;
        }
        return true;
    }

    public final byte[] A06(byte[] bArr, String str) {
        if (!A05()) {
            return null;
        }
        A04(bArr, str);
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            Certificate[] certificateChain = instance.getCertificateChain(str);
            ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
            if (certificateChain != null) {
                for (int length = certificateChain.length - 1; length >= 0; length--) {
                    A0e.write(certificateChain[length].getEncoded());
                }
            } else {
                Log.d("blacknoise/certificatechain: empty list of certificates found");
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("blacknoise/certificatechain size: ");
            C18260x0.A1F(A0o, A0e.size());
            return A0e.toByteArray();
        } catch (Exception e) {
            Log.e("blacknoise/exception on certificate chain retrieval", e);
            this.A00.A09("attestation-nocertchain", AnonymousClass000.A0a("unable to retrieve certificate chain: ", AnonymousClass001.A0o(), e), e);
            return null;
        }
    }
}
