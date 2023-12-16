package X;

/* renamed from: X.5NC  reason: invalid class name */
public class AnonymousClass5NC {
    public C106965aS A00;
    public AnonymousClass5NY A01;

    public void A00(C08310eF r4, boolean z, boolean z2) {
        AnonymousClass5NY r1;
        int i;
        C106965aS r2 = this.A00;
        if (r2 != null && z != z2) {
            if (z2) {
                r2.A03(C18310x6.A0n(r4), "visible");
                r1 = this.A01;
                i = 1;
            } else {
                r1 = this.A01;
                i = 2;
            }
            r1.A00(r4, i);
        }
    }

    public AnonymousClass5NC(C106965aS r1, AnonymousClass5NY r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
