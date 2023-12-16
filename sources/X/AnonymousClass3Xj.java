package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;
import org.json.JSONObject;

/* renamed from: X.3Xj  reason: invalid class name */
public final class AnonymousClass3Xj implements C84754Do {
    public final /* synthetic */ C60272yH A00;
    public final /* synthetic */ AnonymousClass4EJ A01;
    public final /* synthetic */ C54662p5 A02;
    public final /* synthetic */ AnonymousClass3MY A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ PublicKey A05;
    public final /* synthetic */ X509Certificate A06;

    public void BS9(AnonymousClass24F r19) {
        AnonymousClass4HV r2;
        C60192y9 r0;
        AnonymousClass24F r14 = r19;
        C162457s7.A0J(r14, 0);
        AnonymousClass3MY r6 = this.A03;
        AnonymousClass4EJ r4 = this.A01;
        X509Certificate x509Certificate = this.A06;
        PublicKey publicKey = this.A05;
        int intValue = this.A04.intValue();
        C60272yH r3 = this.A00;
        C54662p5 r5 = this.A02;
        int A012 = C57492tj.A01(r14.node);
        AnonymousClass4EJ r12 = r4;
        C54662p5 r13 = r5;
        if (!r6.A08(r12, r13, r14, new C71633cQ(r3, r4, r5, r6, publicKey, x509Certificate, intValue, 4), A012)) {
            if (A012 == 401) {
                r2 = new AnonymousClass4HV(r3, r4, r5, r6, 4);
                boolean A032 = r5.A03();
                r0 = r6.A08;
                if (A032) {
                    r0.A00(r4, r14);
                    return;
                }
            } else if (A012 == 480) {
                r0 = r6.A08;
                r2 = new AnonymousClass4HV(r3, r4, r5, r6, 5);
            } else if (A012 != 484) {
                C18270x1.A0z(C18300x5.A0n(A012));
                r4.BSB(r14);
                return;
            } else {
                r6.A04(r3, r12, r13, r14, publicKey, x509Certificate, intValue);
                return;
            }
            r0.A01(r5, r2, r14);
        }
    }

    public AnonymousClass3Xj(C60272yH r1, AnonymousClass4EJ r2, C54662p5 r3, AnonymousClass3MY r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A06 = x509Certificate;
        this.A05 = publicKey;
        this.A04 = num;
        this.A02 = r3;
    }

    public void BdI(JSONObject jSONObject) {
        AnonymousClass3MY r2 = this.A03;
        JSONObject jSONObject2 = jSONObject;
        C626936e.A06(jSONObject2);
        String A012 = AnonymousClass31V.A01(jSONObject2);
        C162457s7.A0D(A012);
        C162457s7.A0H(jSONObject2);
        long j = C18300x5.A10("data", jSONObject2).getLong("timestamp");
        C60272yH r5 = this.A00;
        Object obj = r5.A04.A00;
        C626936e.A06(obj);
        Number number = (Number) obj;
        long j2 = C18300x5.A10("data", jSONObject2).getLong("fbid");
        if (number == null || number.longValue() != j2) {
            C18320x8.A1C(this.A01, "ids do not match");
        } else {
            AnonymousClass4EJ r1 = this.A01;
            C626936e.A06(obj);
            C162457s7.A0D(obj);
            long A0B = C18310x6.A0B(obj);
            String str = r5.A08;
            r1.Bd3(new C60272yH(r5.A01, (Long) null, (String) C18330xA.A08(r5.A05), A012, str, A0B, j));
        }
        AnonymousClass0x9.A0c(r2.A0A).A05(Boolean.FALSE);
    }
}
