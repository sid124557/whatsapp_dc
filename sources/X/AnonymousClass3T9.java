package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3T9  reason: invalid class name */
public final class AnonymousClass3T9 implements AnonymousClass4EZ {
    public final /* synthetic */ C60272yH A00;
    public final /* synthetic */ AnonymousClass4EJ A01;
    public final /* synthetic */ C54662p5 A02;
    public final /* synthetic */ AnonymousClass3MY A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ PublicKey A05;
    public final /* synthetic */ X509Certificate A06;

    public void BdM(AnonymousClass36K r8, String str) {
        C162457s7.A0J(r8, 1);
        AnonymousClass3MY r2 = this.A03;
        AnonymousClass0x9.A0c(r2.A0A).A05(Boolean.FALSE);
        AnonymousClass36K A0l = r8.A0l("ping_interval");
        if (A0l == null || A0l.A0n() == null) {
            C18320x8.A1C(this.A01, "ping interval not present");
            return;
        }
        C49292gI r6 = r2.A06;
        String A0n = A0l.A0n();
        C162457s7.A0H(A0n);
        C18270x1.A0i(r6.A00().edit(), "pref_ping_validity_time", C56612sH.A02(r6.A01) + Long.parseLong(A0n));
        C18270x1.A0l(r6.A00().edit(), "pref_ping_one_time_delay_for_server_error", false);
        this.A01.Bd3(this.A00);
    }

    public AnonymousClass3T9(C60272yH r1, AnonymousClass4EJ r2, C54662p5 r3, AnonymousClass3MY r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A06 = x509Certificate;
        this.A05 = publicKey;
        this.A04 = num;
        this.A02 = r3;
    }

    public void BQs(String str) {
        this.A01.BQp();
    }

    public void BSN(AnonymousClass36K r27, String str) {
        AnonymousClass36K r2 = r27;
        String str2 = str;
        C18260x0.A0O(str2, r2);
        AnonymousClass3MY r8 = this.A03;
        AnonymousClass24F r11 = new AnonymousClass24F(r2, str2);
        AnonymousClass4EJ r7 = this.A01;
        X509Certificate x509Certificate = this.A06;
        PublicKey publicKey = this.A05;
        C162457s7.A0H(publicKey);
        Integer num = this.A04;
        C162457s7.A0H(num);
        int intValue = num.intValue();
        C60272yH r5 = this.A00;
        C54662p5 r10 = this.A02;
        int A012 = C57492tj.A01(r11.node);
        C54662p5 r20 = r10;
        C60272yH r18 = r5;
        AnonymousClass4EJ r19 = r7;
        C71633cQ r17 = new C71633cQ(r18, r19, r20, r8, publicKey, x509Certificate, intValue, 2);
        if (A012 == 500) {
            C49292gI r3 = r8.A06;
            if (!C18280x3.A1W(r3.A00(), "pref_ping_one_time_delay_for_server_error")) {
                long A062 = C56952sp.A06(r8.A03, 2042);
                if (A062 > 0) {
                    C18270x1.A0i(r3.A00().edit(), "pref_ping_validity_time", C56612sH.A02(r3.A01) + TimeUnit.HOURS.toSeconds(A062));
                    C18270x1.A0l(r3.A00().edit(), "pref_ping_one_time_delay_for_server_error", true);
                    r7.Bd3(r5);
                    return;
                }
            }
        }
        if (!r8.A08(r19, r20, r11, r17, A012)) {
            if (A012 != 401) {
                if (A012 == 480) {
                    r8.A08.A01(r10, new AnonymousClass4HV(r5, r7, r10, r8, 1), r11);
                    return;
                } else if (A012 != 484) {
                    C18270x1.A0z(C18300x5.A0n(A012));
                } else {
                    r8.A04(r5, r7, r10, r11, publicKey, x509Certificate, intValue);
                    return;
                }
            } else if (r10.A04()) {
                r8.Bgr(r5, new AnonymousClass3MT(r7, r10, r8, publicKey, x509Certificate, intValue), new C54662p5(1, C625635p.A0L), num, publicKey, x509Certificate);
                return;
            }
            r7.BSB(r11);
        }
    }
}
