package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;
import org.json.JSONObject;

/* renamed from: X.3MW  reason: invalid class name */
public abstract class AnonymousClass3MW implements AnonymousClass4F6 {
    public final C56612sH A00;
    public final C23811Ux A01;
    public final C50672ia A02;
    public final AnonymousClass31V A03;
    public final C50912iy A04;
    public final String A05;

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bgp(X.C60272yH r5, X.AnonymousClass4EJ r6, X.C54662p5 r7, java.lang.Integer r8, java.lang.String r9, java.security.PublicKey r10, java.security.cert.X509Certificate r11) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x000c
            java.lang.String r0 = "User is null"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            r6.BSB(r0)
            return
        L_0x000c:
            X.7yt r0 = r5.A05
            java.lang.Object r3 = X.C18330xA.A08(r0)
            java.lang.String r3 = (java.lang.String) r3
            java.security.KeyPair r0 = X.AnonymousClass341.A04()     // Catch:{ NoSuchAlgorithmException -> 0x003b }
            java.security.PublicKey r0 = r0.getPublic()
            java.lang.String r2 = X.AnonymousClass341.A02(r0)
            X.7yt r1 = r5.A04     // Catch:{  }
            java.lang.String r0 = "DELETE_USER"
            java.lang.String r1 = r4.A00(r1, r2, r0, r3)     // Catch:{  }
            X.2ia r0 = r4.A02     // Catch:{  }
            X.2Q4 r3 = r0.A02(r1, r11)     // Catch:{  }
            X.1Ux r2 = r4.A01
            X.1V7 r1 = new X.1V7
            r1.<init>(r4, r6, r6)
            r0 = 19
            r2.A01(r1, r3, r0)
            return
        L_0x003b:
            r0 = move-exception
            r6.BSB(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3MW.Bgp(X.2yH, X.4EJ, X.2p5, java.lang.Integer, java.lang.String, java.security.PublicKey, java.security.cert.X509Certificate):void");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bgr(X.C60272yH r5, X.AnonymousClass4EJ r6, X.C54662p5 r7, java.lang.Integer r8, java.security.PublicKey r9, java.security.cert.X509Certificate r10) {
        /*
            r4 = this;
            X.7yt r0 = r5.A05
            java.lang.Object r3 = X.C18330xA.A08(r0)
            java.lang.String r3 = (java.lang.String) r3
            java.security.KeyPair r8 = X.AnonymousClass341.A04()     // Catch:{ NoSuchAlgorithmException -> 0x0030 }
            java.security.PublicKey r0 = r8.getPublic()
            java.lang.String r2 = X.AnonymousClass341.A02(r0)
            X.7yt r1 = r5.A04     // Catch:{  }
            java.lang.String r0 = "GET_ACCESS_TOKEN"
            java.lang.String r1 = r4.A00(r1, r2, r0, r3)     // Catch:{  }
            X.2ia r0 = r4.A02     // Catch:{  }
            X.2Q4 r2 = r0.A02(r1, r10)     // Catch:{  }
            X.1Ux r1 = r4.A01
            X.1V8 r3 = new X.1V8
            r7 = r6
            r3.<init>(r4, r5, r6, r7, r8)
            r0 = 19
            r1.A01(r3, r2, r0)
            return
        L_0x0030:
            r0 = move-exception
            r6.BSB(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3MW.Bgr(X.2yH, X.4EJ, X.2p5, java.lang.Integer, java.security.PublicKey, java.security.cert.X509Certificate):void");
    }

    public AnonymousClass3MW(C56612sH r1, C23811Ux r2, C50672ia r3, AnonymousClass31V r4, C50912iy r5, String str) {
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
        this.A05 = str;
    }

    public final String A00(C166557yt r5, String str, String str2, String str3) {
        JSONObject A11 = AnonymousClass0x7.A11();
        A11.put("operation", str2);
        A11.put("timestamp", C56612sH.A00(this.A00));
        C18310x6.A1K(str, A11);
        A11.put("password", str3);
        if (r5 != null) {
            A11.put("fbid", C18280x3.A0a(r5));
        }
        return A11.toString();
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void Bgm(X.AnonymousClass4EJ r5, X.C54662p5 r6, java.lang.Integer r7, java.lang.Integer r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.security.PublicKey r12, java.security.cert.X509Certificate r13) {
        /*
            r4 = this;
            java.security.KeyPair r8 = X.AnonymousClass341.A04()     // Catch:{ NoSuchAlgorithmException -> 0x002b }
            java.security.PublicKey r0 = r8.getPublic()
            java.lang.String r2 = X.AnonymousClass341.A02(r0)
            java.lang.String r7 = X.AnonymousClass341.A00()
            java.lang.String r1 = r4.A05     // Catch:{  }
            r0 = 0
            java.lang.String r1 = r4.A00(r0, r2, r1, r7)     // Catch:{  }
            X.2ia r0 = r4.A02     // Catch:{  }
            X.2Q4 r2 = r0.A02(r1, r13)     // Catch:{  }
            X.1Ux r1 = r4.A01
            X.1V4 r3 = new X.1V4
            r6 = r5
            r3.<init>(r4, r5, r6, r7, r8)
            r0 = 20
            r1.A01(r3, r2, r0)
            return
        L_0x002b:
            r0 = move-exception
            r5.BSB(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3MW.Bgm(X.4EJ, X.2p5, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.security.PublicKey, java.security.cert.X509Certificate):void");
    }

    public /* bridge */ /* synthetic */ void Bgn(AnonymousClass4EJ r2, C54662p5 r3, Integer num, Object obj, PublicKey publicKey, X509Certificate x509Certificate) {
        throw C18320x8.A0m();
    }

    public final void Bgq(C60272yH r2, AnonymousClass4EJ r3, C54662p5 r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        throw C18320x8.A0m();
    }
}
