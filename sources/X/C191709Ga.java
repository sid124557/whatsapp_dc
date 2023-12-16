package X;

import android.text.TextUtils;

/* renamed from: X.9Ga  reason: invalid class name and case insensitive filesystem */
public class C191709Ga extends AnonymousClass5ZM {
    public final /* synthetic */ AnonymousClass39R A00;
    public final /* synthetic */ C194589Tn A01;
    public final /* synthetic */ C197069cT A02;

    public C191709Ga(AnonymousClass39R r1, C194589Tn r2, C197069cT r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return this.A01.A04.A01(this.A00.A0F);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass39R r7 = (AnonymousClass39R) obj;
        if (r7 != null) {
            AnonymousClass39R r1 = this.A00;
            if (!TextUtils.isEmpty(r7.A05)) {
                r1.A05 = r7.A05;
            }
            if (!TextUtils.isEmpty(r7.A06)) {
                r1.A01 = r7.A01;
                r1.A06 = r7.A06;
            }
        }
        C194589Tn r5 = this.A01;
        AnonymousClass39R r4 = this.A00;
        C197069cT r3 = this.A02;
        if (TextUtils.isEmpty(r4.A05)) {
            r5.A09.A00(new AnonymousClass9b4(r4, r5, r3), r4.A0F);
            return;
        }
        r5.A0D.BkM(new C200919jE(r4, r5, r3));
    }
}
