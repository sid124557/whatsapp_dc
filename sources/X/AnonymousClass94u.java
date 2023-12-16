package X;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: X.94u  reason: invalid class name */
public class AnonymousClass94u extends C05550Ty {
    public AnonymousClass4UC A00 = new AnonymousClass4UC();
    public String A01;
    public boolean A02;
    public final AnonymousClass08M A03 = AnonymousClass08M.A01();
    public final C66663Mh A04;
    public final C620733j A05;
    public final AnonymousClass9Qx A06;
    public final AnonymousClass9QD A07;
    public final C194759Uj A08;

    public final void A0F() {
        C193639Pk r2 = new C193639Pk(5);
        r2.A03 = C18320x8.A1U(A0D().A0A);
        r2.A04 = "DEEP_LINK".equals(this.A01);
        this.A00.A0H(r2);
    }

    public static /* synthetic */ void A00(AnonymousClass94u r16) {
        AnonymousClass94u r2 = r16;
        if (!r2.A04.A08(C66663Mh.A0i) || TextUtils.isEmpty(r2.A0D().A0I)) {
            r2.A0E();
            return;
        }
        AnonymousClass9QD r1 = r2.A07;
        Context context = r1.A01.A00;
        C69263Wi r10 = r1.A00;
        C153607bd r13 = new C153607bd();
        AnonymousClass9A6 r8 = new AnonymousClass9A6(context, r10, r1.A04, r1.A07, r13, r1.A08);
        String str = r2.A0D().A08;
        C193129Ng r9 = new C193129Ng(r2);
        AnonymousClass31C r102 = r8.A02;
        String A032 = r102.A03();
        C35371wl A0X = C1899693i.A0X(A032);
        C56052rL A012 = C56052rL.A01();
        C56052rL.A0E(A012, "xmlns", "w:pay");
        C56052rL A0U = C1899593h.A0U();
        C56052rL.A0D(A0U, "action", "upi-verify-qr-code");
        if (C1899693i.A10(str, 1, false)) {
            C56052rL.A0D(A0U, "signed-qr-code", str);
        }
        r102.A0D(new C203929oX(r8.A00, r8.A01, r8.A03, AnonymousClass9OC.A02(r8, "upi-verify-qr-code"), r8, r9), C41032Ir.A03(A0U, A012, A0X), A032, 204, 0);
    }

    public C195179Wl A0D() {
        Object A072 = this.A03.A07();
        C626936e.A06(A072);
        return (C195179Wl) A072;
    }

    public final void A0E() {
        if (!this.A04.A08(C66663Mh.A0l) || !A0D().A0P || TextUtils.isEmpty(A0D().A0F)) {
            A0F();
        } else {
            C193639Pk.A00(this.A00, 3);
        }
    }

    public AnonymousClass94u(C66663Mh r2, C620733j r3, AnonymousClass9Qx r4, AnonymousClass9QD r5, C194759Uj r6) {
        this.A04 = r2;
        this.A08 = r6;
        this.A05 = r3;
        this.A07 = r5;
        this.A06 = r4;
    }
}
