package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.3MV  reason: invalid class name */
public final class AnonymousClass3MV implements AnonymousClass4F6 {
    public final C23801Uw A00;
    public final C43052Qo A01;
    public final AnonymousClass2PS A02;
    public final C46302bP A03;
    public final C50672ia A04;
    public final AnonymousClass31V A05;

    public AnonymousClass3MV(C23801Uw r2, C43052Qo r3, AnonymousClass2PS r4, C46302bP r5, C50672ia r6, AnonymousClass31V r7) {
        C162457s7.A0J(r6, 1);
        this.A04 = r6;
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
        this.A05 = r7;
        this.A03 = r5;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.AnonymousClass4EJ r8, X.C54662p5 r9, java.lang.Integer r10, java.security.PublicKey r11, java.security.cert.X509Certificate r12) {
        /*
            r7 = this;
            r0 = 0
            X.C18260x0.A0a(r12, r8, r9, r0)
            java.security.KeyPair r4 = X.AnonymousClass341.A04()     // Catch:{ NoSuchAlgorithmException -> 0x0009 }
            goto L_0x000e
        L_0x0009:
            r0 = move-exception
            r8.BSB(r0)
            r4 = 0
        L_0x000e:
            java.lang.String r3 = X.AnonymousClass341.A00()
            X.C162457s7.A0D(r3)
            r2 = 0
            if (r4 == 0) goto L_0x0051
            java.security.PublicKey r0 = r4.getPublic()
            java.lang.String r6 = X.AnonymousClass341.A02(r0)
            if (r6 == 0) goto L_0x0051
            X.2bP r5 = r7.A03     // Catch:{ JSONException -> 0x004d }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ JSONException -> 0x004d }
            java.lang.String r0 = "CREATE_"
            r1.append(r0)     // Catch:{ JSONException -> 0x004d }
            java.lang.String r0 = "shops"
            r1.append(r0)     // Catch:{ JSONException -> 0x004d }
            java.lang.String r0 = "_USER"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ JSONException -> 0x004d }
            java.lang.String r0 = r0.toUpperCase()     // Catch:{ JSONException -> 0x004d }
            X.C162457s7.A0D(r0)     // Catch:{ JSONException -> 0x004d }
            java.lang.String r1 = r5.A00(r2, r6, r3, r0)     // Catch:{ JSONException -> 0x004d }
            if (r1 == 0) goto L_0x0051
            X.2ia r0 = r7.A04     // Catch:{  }
            X.2Q4 r2 = r0.A02(r1, r12)     // Catch:{  }
            goto L_0x0051
        L_0x004d:
            r0 = move-exception
            r8.BSB(r0)
        L_0x0051:
            X.2PS r1 = r7.A02
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.fbusers.EncryptedData"
            X.C162457s7.A0K(r2, r0)
            X.44B r5 = new X.44B
            r5.<init>(r7, r8, r3, r4)
            X.44N r6 = new X.44N
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            X.1Uw r3 = r1.A02
            X.4IM r1 = new X.4IM
            r1.<init>(r8, r5, r6, r0)
            r0 = 20
            r3.A01(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3MV.A00(X.4EJ, X.2p5, java.lang.Integer, java.security.PublicKey, java.security.cert.X509Certificate):void");
    }

    public /* synthetic */ void Bgm(AnonymousClass4EJ r1, C54662p5 r2, Integer num, Integer num2, String str, String str2, String str3, PublicKey publicKey, X509Certificate x509Certificate) {
        A00(r1, r2, num, publicKey, x509Certificate);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bgp(X.C60272yH r6, X.AnonymousClass4EJ r7, X.C54662p5 r8, java.lang.Integer r9, java.lang.String r10, java.security.PublicKey r11, java.security.cert.X509Certificate r12) {
        /*
            r5 = this;
            r0 = 0
            X.C162457s7.A0J(r12, r0)
            if (r6 != 0) goto L_0x0010
            java.lang.String r0 = "User is null"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            r7.BSB(r0)
        L_0x000f:
            return
        L_0x0010:
            java.security.KeyPair r1 = X.AnonymousClass341.A04()     // Catch:{ NoSuchAlgorithmException -> 0x0015 }
            goto L_0x001a
        L_0x0015:
            r0 = move-exception
            r7.BSB(r0)
            r1 = 0
        L_0x001a:
            X.7yt r0 = r6.A05
            java.lang.String r4 = X.C18280x3.A0b(r0)
            if (r1 == 0) goto L_0x000f
            java.security.PublicKey r0 = r1.getPublic()
            java.lang.String r3 = X.AnonymousClass341.A02(r0)
            if (r3 == 0) goto L_0x000f
            X.2bP r2 = r5.A03     // Catch:{ JSONException -> 0x0052 }
            X.7yt r1 = r6.A04     // Catch:{ JSONException -> 0x0052 }
            X.C162457s7.A0D(r1)     // Catch:{ JSONException -> 0x0052 }
            r0 = 1
            X.C162457s7.A0J(r4, r0)     // Catch:{ JSONException -> 0x0052 }
            java.lang.String r0 = "DELETE_USER"
            java.lang.String r1 = r2.A00(r1, r3, r4, r0)     // Catch:{ JSONException -> 0x0052 }
            if (r1 == 0) goto L_0x000f
            X.2ia r0 = r5.A04     // Catch:{  }
            X.2Q4 r3 = r0.A02(r1, r12)     // Catch:{  }
            X.1Uw r2 = r5.A00
            X.1I9 r1 = new X.1I9
            r1.<init>(r7)
            r0 = 19
            r2.A01(r1, r3, r0)
            return
        L_0x0052:
            r0 = move-exception
            r7.BSB(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3MV.Bgp(X.2yH, X.4EJ, X.2p5, java.lang.Integer, java.lang.String, java.security.PublicKey, java.security.cert.X509Certificate):void");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bgr(X.C60272yH r7, X.AnonymousClass4EJ r8, X.C54662p5 r9, java.lang.Integer r10, java.security.PublicKey r11, java.security.cert.X509Certificate r12) {
        /*
            r6 = this;
            r0 = 0
            X.C162457s7.A0J(r12, r0)
            X.7yt r0 = r7.A05
            java.lang.String r5 = X.C18280x3.A0b(r0)
            java.security.KeyPair r4 = X.AnonymousClass341.A04()     // Catch:{ NoSuchAlgorithmException -> 0x0046 }
            if (r4 == 0) goto L_0x0045
            java.security.PublicKey r0 = r4.getPublic()
            java.lang.String r3 = X.AnonymousClass341.A02(r0)
            if (r3 == 0) goto L_0x0038
            X.2bP r2 = r6.A03     // Catch:{ JSONException -> 0x0034 }
            X.7yt r1 = r7.A04     // Catch:{ JSONException -> 0x0034 }
            X.C162457s7.A0D(r1)     // Catch:{ JSONException -> 0x0034 }
            r0 = 1
            X.C162457s7.A0J(r5, r0)     // Catch:{ JSONException -> 0x0034 }
            java.lang.String r0 = "GET_ACCESS_TOKEN"
            java.lang.String r1 = r2.A00(r1, r3, r5, r0)     // Catch:{ JSONException -> 0x0034 }
            if (r1 == 0) goto L_0x0038
            X.2ia r0 = r6.A04     // Catch:{  }
            X.2Q4 r3 = r0.A02(r1, r12)     // Catch:{  }
            goto L_0x0039
        L_0x0034:
            r0 = move-exception
            r8.BSB(r0)
        L_0x0038:
            r3 = 0
        L_0x0039:
            X.1Uw r2 = r6.A00
            X.1IA r1 = new X.1IA
            r1.<init>(r6, r7, r8, r4)
            r0 = 19
            r2.A01(r1, r3, r0)
        L_0x0045:
            return
        L_0x0046:
            r0 = move-exception
            r8.BSB(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3MV.Bgr(X.2yH, X.4EJ, X.2p5, java.lang.Integer, java.security.PublicKey, java.security.cert.X509Certificate):void");
    }

    public /* bridge */ /* synthetic */ void Bgn(AnonymousClass4EJ r2, C54662p5 r3, Integer num, Object obj, PublicKey publicKey, X509Certificate x509Certificate) {
        throw C18320x8.A0m();
    }

    public void Bgq(C60272yH r2, AnonymousClass4EJ r3, C54662p5 r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        throw C18320x8.A0m();
    }
}
