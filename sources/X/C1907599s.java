package X;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: X.99s  reason: invalid class name and case insensitive filesystem */
public class C1907599s extends C197739dn {
    public final /* synthetic */ AnonymousClass4EY A00;
    public final /* synthetic */ AnonymousClass9U5 A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1907599s(Context context, AnonymousClass4EY r2, C40602Ha r3, AnonymousClass9U5 r4, C84104Ba r5, boolean z, boolean z2) {
        super(context, r3, r5);
        this.A01 = r4;
        this.A00 = r2;
        this.A02 = z;
        this.A03 = z2;
    }

    public void A03(AnonymousClass34V r4) {
        C1899593h.A1G(this.A01.A0H, r4, "TosV2 onRequestError: ", AnonymousClass001.A0o());
        this.A00.Ba4(r4);
    }

    public void A04(AnonymousClass34V r4) {
        C1899593h.A1G(this.A01.A0H, r4, "TosV2 onResponseError: ", AnonymousClass001.A0o());
        this.A00.BaB(r4);
    }

    public void A05(AnonymousClass36K r9) {
        AnonymousClass36K A0l = r9.A0l("accept_pay");
        C190849Ab r3 = new C190849Ab();
        boolean z = false;
        if (A0l != null) {
            String A0r = A0l.A0r("consumer", (String) null);
            String A0r2 = A0l.A0r("merchant", (String) null);
            if ((!this.A02 || "1".equals(A0r)) && (!this.A03 || "1".equals(A0r2))) {
                z = true;
            }
            r3.A02 = z;
            r3.A00 = C1899593h.A1W(A0l, "outage", "1");
            r3.A01 = C1899593h.A1W(A0l, "sandbox", "1");
            if (!TextUtils.isEmpty(A0r) && !TextUtils.isEmpty("tos_no_wallet")) {
                C1906899l r2 = this.A01.A08;
                C151007Tb A012 = r2.A01("tos_no_wallet");
                if ("1".equals(A0r)) {
                    r2.A08(A012);
                } else {
                    r2.A07(A012);
                }
            }
            if (!TextUtils.isEmpty(A0r2) && !TextUtils.isEmpty("tos_merchant")) {
                C1906999m r22 = this.A01.A0B;
                C151007Tb A013 = r22.A01("tos_merchant");
                if ("1".equals(A0r2)) {
                    r22.A08(A013);
                } else {
                    r22.A07(A013);
                }
            }
            C620933l r0 = this.A01.A0C;
            C18270x1.A0l(C620933l.A00(r0), "payments_sandbox", r3.A01);
        } else {
            r3.A02 = false;
        }
        this.A00.BaC(r3);
    }
}
