package X;

/* renamed from: X.5Rl  reason: invalid class name and case insensitive filesystem */
public class C104565Rl {
    public final AnonymousClass5GD A00;
    public final AnonymousClass8JP A01;

    public C104565Rl(AnonymousClass5GD r1, AnonymousClass8JP r2) {
        C18260x0.A0Q(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00(String str) {
        C162457s7.A0J(str, 1);
        if (this.A00.A00.A0X(2087)) {
            this.A01.markerPoint(1029386189, str);
        }
    }

    public void A01(String str) {
        if (this.A00.A00.A0X(2087)) {
            this.A01.markerStart(1029386189, "entry_point", str);
        }
    }

    public void A02(String str, short s) {
        if (this.A00.A00.A0X(2087)) {
            AnonymousClass8JP r0 = this.A01;
            if (str == null) {
                r0.markerEnd(1029386189, s);
            } else {
                r0.BKg(str, 1029386189, s);
            }
        }
    }
}
