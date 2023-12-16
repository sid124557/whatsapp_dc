package X;

import android.text.TextUtils;

/* renamed from: X.9Se  reason: invalid class name and case insensitive filesystem */
public class C194259Se {
    public AnonymousClass9RX A00 = null;
    public final C54292oU A01;
    public final C620933l A02;
    public final C153087ae A03;
    public final AnonymousClass9U4 A04;

    public final AnonymousClass9RX A00() {
        AnonymousClass9SU r1;
        String str;
        C203719oC A012;
        C153087ae r2 = this.A03;
        if (r2.A02() != null) {
            r1 = this.A04.A0F(r2.A02().A03);
        } else {
            r1 = null;
        }
        C85204Fi A013 = r2.A01();
        if (A013 != null) {
            str = ((AnonymousClass3H6) A013).A04;
        } else {
            str = null;
        }
        if (r1 == null || (A012 = r1.A01(str)) == null) {
            return null;
        }
        return A012.BAo(this.A01, this.A02);
    }

    public String A01() {
        C160757oG r2;
        StringBuilder A0o;
        String str;
        AnonymousClass9RX r4 = this.A00;
        if (r4 == null) {
            r4 = A00();
            this.A00 = r4;
            if (r4 == null) {
                return null;
            }
        }
        C620933l r22 = r4.A02;
        String A0Z = C18280x3.A0Z(r22.A03(), "payments_device_id");
        if (!TextUtils.isEmpty(A0Z)) {
            r2 = r4.A03;
            A0o = AnonymousClass001.A0o();
            str = "PaymentDeviceId: from cache: ";
        } else {
            A0Z = r4.A00();
            C18270x1.A0j(C620933l.A00(r22), "payments_device_id", A0Z);
            r2 = r4.A03;
            A0o = AnonymousClass001.A0o();
            str = "PaymentDeviceId: generated: ";
        }
        r2.A04(AnonymousClass000.A0V(str, A0Z, A0o));
        return A0Z;
    }

    public C194259Se(C54292oU r2, C620933l r3, C153087ae r4, AnonymousClass9U4 r5) {
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
    }
}
