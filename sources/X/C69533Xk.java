package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;
import org.json.JSONObject;

/* renamed from: X.3Xk  reason: invalid class name and case insensitive filesystem */
public final class C69533Xk implements C84754Do {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass4EJ A01;
    public final /* synthetic */ C54662p5 A02;
    public final /* synthetic */ C166557yt A03;
    public final /* synthetic */ AnonymousClass3MY A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ PublicKey A06;
    public final /* synthetic */ X509Certificate A07;

    public void BS9(AnonymousClass24F r22) {
        AnonymousClass24F r0 = r22;
        C162457s7.A0J(r0, 0);
        AnonymousClass3MY r7 = this.A04;
        AnonymousClass4EJ r5 = this.A01;
        X509Certificate x509Certificate = this.A07;
        PublicKey publicKey = this.A06;
        int i = this.A00;
        Object A08 = C18330xA.A08(this.A03);
        C162457s7.A0D(A08);
        long A0B = C18310x6.A0B(A08);
        C60272yH r11 = new C60272yH(AnonymousClass3MY.A0B, (Long) null, this.A05, "dummy", (String) null, A0B, -1);
        C54662p5 r6 = this.A02;
        int A012 = C57492tj.A01(r0.node);
        AnonymousClass4EJ r12 = r5;
        C54662p5 r13 = r6;
        if (r7.A08(r12, r13, r0, new C71633cQ(r11, r5, r6, r7, publicKey, x509Certificate, i, 1), A012)) {
            return;
        }
        if (A012 == 304) {
            r7.Bgr(r11, r12, r13, Integer.valueOf(i), publicKey, x509Certificate);
        } else if (A012 == 401 || A012 == 409) {
            r7.A08.A00(r5, r0);
        } else if (A012 != 480) {
            C18270x1.A0z(C18300x5.A0n(A012));
            r5.BSB(r0);
        } else {
            r7.A08.A01(r6, new AnonymousClass4HV(r11, r5, r6, r7, 0), r0);
        }
    }

    public C69533Xk(AnonymousClass4EJ r1, C54662p5 r2, C166557yt r3, AnonymousClass3MY r4, String str, PublicKey publicKey, X509Certificate x509Certificate, int i) {
        this.A04 = r4;
        this.A05 = str;
        this.A03 = r3;
        this.A01 = r1;
        this.A07 = x509Certificate;
        this.A06 = publicKey;
        this.A00 = i;
        this.A02 = r2;
    }

    public void BdI(JSONObject jSONObject) {
        C626936e.A06(jSONObject);
        String str = this.A05;
        C626936e.A06(str);
        C60272yH A002 = AnonymousClass31V.A00(AnonymousClass3MY.A0B, str, jSONObject);
        if (C162457s7.A0P(C18330xA.A08(A002.A04), C18330xA.A08(this.A03))) {
            this.A01.Bd3(A002);
        } else {
            C18320x8.A1C(this.A01, "ids do not match");
        }
    }
}
