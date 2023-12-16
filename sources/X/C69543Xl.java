package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Xl  reason: invalid class name and case insensitive filesystem */
public final class C69543Xl implements C84754Do {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass4EJ A01;
    public final /* synthetic */ C54662p5 A02;
    public final /* synthetic */ C166557yt A03;
    public final /* synthetic */ C166557yt A04;
    public final /* synthetic */ C166557yt A05;
    public final /* synthetic */ C166557yt A06;
    public final /* synthetic */ C166557yt A07;
    public final /* synthetic */ AnonymousClass3MY A08;
    public final /* synthetic */ Integer A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ PublicKey A0B;
    public final /* synthetic */ X509Certificate A0C;

    public void BS9(AnonymousClass24F r23) {
        AnonymousClass24F r0 = r23;
        C162457s7.A0J(r0, 0);
        AnonymousClass3MY r11 = this.A08;
        C166557yt r6 = this.A03;
        Integer num = this.A09;
        C166557yt r7 = this.A05;
        C166557yt r8 = this.A04;
        C166557yt r9 = this.A06;
        C166557yt r10 = this.A07;
        AnonymousClass4EJ r4 = this.A01;
        X509Certificate x509Certificate = this.A0C;
        PublicKey publicKey = this.A0B;
        int i = this.A00;
        C54662p5 r5 = this.A02;
        int A012 = C57492tj.A01(r0.node);
        if (r11.A08(r4, r5, r0, new C71173bg(r4, r5, r6, r7, r8, r9, r10, r11, num, publicKey, x509Certificate, i), A012)) {
            return;
        }
        if (A012 == 480) {
            r11.A08.A01(r5, new C34481vE(r4, r5, r6, r7, r8, r9, r10, r11, num), r0);
        } else if (A012 != 484) {
            C18270x1.A0z(C18300x5.A0n(A012));
            r4.BSB(r0);
        } else {
            r11.A04((C60272yH) null, r4, r5, r0, publicKey, x509Certificate, i);
        }
    }

    public C69543Xl(AnonymousClass4EJ r1, C54662p5 r2, C166557yt r3, C166557yt r4, C166557yt r5, C166557yt r6, C166557yt r7, AnonymousClass3MY r8, Integer num, String str, PublicKey publicKey, X509Certificate x509Certificate, int i) {
        this.A08 = r8;
        this.A01 = r1;
        this.A0A = str;
        this.A03 = r3;
        this.A09 = num;
        this.A05 = r4;
        this.A04 = r5;
        this.A06 = r6;
        this.A07 = r7;
        this.A0C = x509Certificate;
        this.A0B = publicKey;
        this.A00 = i;
        this.A02 = r2;
    }

    public void BdI(JSONObject jSONObject) {
        AnonymousClass4EJ r2;
        Exception A0e;
        C626936e.A06(jSONObject);
        try {
            C162457s7.A0H(jSONObject);
            int i = C18300x5.A10("data", jSONObject).getInt("response_code");
            if (i != 0) {
                if (i != 1) {
                    r2 = this.A01;
                    if (i != 2) {
                        A0e = AnonymousClass001.A0e(AnonymousClass000.A0Y("unknown code: ", AnonymousClass001.A0o(), i));
                    } else {
                        A0e = new C23791Uv();
                    }
                } else {
                    r2 = this.A01;
                    A0e = AnonymousClass001.A0e("invalid auth token");
                }
                r2.BSB(A0e);
                return;
            }
        } catch (JSONException unused) {
        }
        AnonymousClass4EJ r22 = this.A01;
        C162457s7.A0H(jSONObject);
        long j = C18300x5.A10("data", jSONObject).getLong("fbid");
        r22.Bd3(new C60272yH(AnonymousClass3MY.A0B, (Long) null, this.A0A, "dummy access token", (String) null, j, C18300x5.A10("data", jSONObject).getLong("timestamp")));
    }
}
