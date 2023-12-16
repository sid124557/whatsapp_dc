package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;
import org.json.JSONObject;

/* renamed from: X.4JC  reason: invalid class name */
public class AnonymousClass4JC implements C84754Do {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public String A06;
    public final int A07;

    public AnonymousClass4JC(AnonymousClass4EJ r1, C54662p5 r2, AnonymousClass3MY r3, Integer num, String str, PublicKey publicKey, X509Certificate x509Certificate, int i) {
        this.A07 = i;
        if (i != 0) {
            this.A00 = r1;
            this.A05 = r3;
            this.A01 = x509Certificate;
            this.A04 = publicKey;
            this.A03 = num;
            this.A02 = r2;
            this.A06 = str;
        } else {
            this.A05 = r3;
            this.A01 = x509Certificate;
            this.A00 = r1;
            this.A06 = str;
            this.A04 = publicKey;
            this.A03 = num;
            this.A02 = r2;
        }
    }

    public void BS9(AnonymousClass24F r21) {
        AnonymousClass24F r0 = r21;
        if (this.A07 != 0) {
            C162457s7.A0J(r0, 0);
            AnonymousClass3MY r6 = (AnonymousClass3MY) this.A05;
            Object obj = this.A01;
            Object obj2 = this.A04;
            Object obj3 = this.A03;
            AnonymousClass4EJ r10 = (AnonymousClass4EJ) this.A00;
            C54662p5 r11 = (C54662p5) this.A02;
            String str = this.A06;
            int A012 = C57492tj.A01(r0.node);
            C70943bJ r5 = new C70943bJ(r6, obj, obj2, obj3, r10, r11, str, 0);
            if (!r6.A09(r10, r11, r0, r5, A012)) {
                if (A012 != 429) {
                    if (A012 != 481) {
                        if (A012 != 500) {
                            C626936e.A0D(false, AnonymousClass000.A0Y("unexpected error code: ", AnonymousClass001.A0o(), A012));
                        }
                    } else if (r11.A04()) {
                        r5.run();
                        return;
                    }
                    r10.BSB(r0);
                    return;
                }
                C60192y9 r4 = r6.A08;
                Long A013 = r11.A01();
                if (A013 != null) {
                    r4.A00.Bkn(r5, "WaffleIQErrorHelper/retry", A013.longValue());
                    return;
                }
                r10.BSB(r0);
                return;
            }
            return;
        }
        C162457s7.A0J(r0, 0);
        AnonymousClass3MY r62 = (AnonymousClass3MY) this.A05;
        AnonymousClass4EJ r42 = (AnonymousClass4EJ) this.A00;
        PublicKey publicKey = (PublicKey) this.A04;
        int A0K = AnonymousClass001.A0K(this.A03);
        C54662p5 r52 = (C54662p5) this.A02;
        int A014 = C57492tj.A01(r0.node);
        C71473cA r3 = new C71473cA(r42, r52, r62, publicKey, (X509Certificate) this.A01, A0K);
        if (!r62.A09(r42, r52, r0, r3, A014)) {
            if (!(A014 == 304 || A014 == 409)) {
                if (A014 == 480) {
                    r62.A08.A01(r52, new C34471vD(r42, r52, r62), r0);
                    return;
                } else if (A014 != 488) {
                    C18270x1.A0z(C18300x5.A0n(A014));
                    r42.BSB(r0);
                    return;
                }
            }
            r62.A08.A00(r42, r0);
        }
    }

    public void BdI(JSONObject jSONObject) {
        if (this.A07 != 0) {
            ((AnonymousClass4EJ) this.A00).Bd3((C60272yH) null);
            ((C48782fT) ((AnonymousClass3MY) this.A05).A08.A04.get()).A00();
            return;
        }
        AnonymousClass3QD A002 = AnonymousClass3QD.A00();
        C626936e.A06(jSONObject);
        C166557yt r3 = new C166557yt(A002, Long.valueOf(C18300x5.A10("data", jSONObject).getLong("fbid")), "WaFbid");
        AnonymousClass4EJ r1 = (AnonymousClass4EJ) this.A00;
        String str = this.A06;
        PublicKey publicKey = (PublicKey) this.A04;
        int A0K = AnonymousClass001.A0K(this.A03);
        AnonymousClass3MY.A00(r1, (C54662p5) this.A02, r3, (AnonymousClass3MY) this.A05, str, publicKey, (X509Certificate) this.A01, A0K);
    }
}
