package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;
import org.json.JSONObject;

/* renamed from: X.3Xi  reason: invalid class name and case insensitive filesystem */
public final class C69523Xi implements C84754Do {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C60272yH A01;
    public final /* synthetic */ AnonymousClass4EJ A02;
    public final /* synthetic */ C54662p5 A03;
    public final /* synthetic */ AnonymousClass3MY A04;
    public final /* synthetic */ PublicKey A05;
    public final /* synthetic */ X509Certificate A06;

    public void BS9(AnonymousClass24F r17) {
        AnonymousClass4HV r5;
        C60192y9 r0;
        AnonymousClass24F r12 = r17;
        C162457s7.A0J(r12, 0);
        AnonymousClass3MY r4 = this.A04;
        C60272yH r1 = this.A01;
        AnonymousClass4EJ r2 = this.A02;
        X509Certificate x509Certificate = this.A06;
        PublicKey publicKey = this.A05;
        int i = this.A00;
        C54662p5 r3 = this.A03;
        int A012 = C57492tj.A01(r12.node);
        AnonymousClass3MY r9 = r4;
        AnonymousClass4EJ r10 = r2;
        C54662p5 r11 = r3;
        if (!r9.A08(r10, r11, r12, new C71633cQ(r1, r2, r3, r4, publicKey, x509Certificate, i), A012)) {
            if (A012 == 401) {
                r5 = new AnonymousClass4HV(r1, r2, r3, r9, 2);
                boolean A032 = r3.A03();
                r0 = r4.A08;
                if (A032) {
                    r0.A00(r2, r12);
                    return;
                }
            } else if (A012 == 480) {
                r0 = r4.A08;
                r5 = new AnonymousClass4HV(r1, r2, r3, r9, 3);
            } else if (A012 != 484) {
                C18270x1.A0z(C18300x5.A0n(A012));
                r2.BSB(r12);
                return;
            } else {
                r4.A04(r1, r10, r11, r12, publicKey, x509Certificate, i);
                return;
            }
            r0.A01(r3, r5, r12);
        }
    }

    public C69523Xi(C60272yH r1, AnonymousClass4EJ r2, C54662p5 r3, AnonymousClass3MY r4, PublicKey publicKey, X509Certificate x509Certificate, int i) {
        this.A01 = r1;
        this.A04 = r4;
        this.A02 = r2;
        this.A06 = x509Certificate;
        this.A05 = publicKey;
        this.A00 = i;
        this.A03 = r3;
    }

    public void BdI(JSONObject jSONObject) {
        C626936e.A06(jSONObject);
        C60272yH r3 = this.A01;
        Object obj = r3.A04.A00;
        C626936e.A06(obj);
        Number number = (Number) obj;
        AnonymousClass3MY r8 = this.A04;
        C162457s7.A0H(jSONObject);
        long j = C18300x5.A10("data", jSONObject).getLong("fbid");
        if (number == null || number.longValue() != j) {
            C18320x8.A1C(this.A02, "ids do not match");
            return;
        }
        AnonymousClass0x9.A0c(r8.A0A).A05(Boolean.FALSE);
        AnonymousClass4EJ r2 = this.A02;
        C626936e.A06(obj);
        C162457s7.A0D(obj);
        long A0B = C18310x6.A0B(obj);
        String A012 = AnonymousClass31V.A01(jSONObject);
        long j2 = C18300x5.A10("data", jSONObject).getLong("timestamp");
        String str = r3.A08;
        r2.Bd3(new C60272yH(r3.A01, (Long) null, (String) C18330xA.A08(r3.A05), A012, str, A0B, j2));
    }
}
