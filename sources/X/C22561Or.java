package X;

/* renamed from: X.1Or  reason: invalid class name and case insensitive filesystem */
public class C22561Or extends C56822sc {
    public final AnonymousClass33E A00;
    public final C54122oD A01;
    public final C56612sH A02;
    public final C56982ss A03;

    public final void A0D(AnonymousClass1SV r6) {
        AnonymousClass31A A002;
        C95814uZ r3 = r6.A01;
        C56982ss r2 = this.A03;
        if (r2.A0A(r3, false) != null) {
            int A003 = AnonymousClass35N.A00(this.A00.A04(r3, false), r6.A00);
            if (A003 == 0 || !(A003 == 1 || A003 == 2)) {
                if (r6.A02 && (A002 = C56982ss.A00(r2, r3)) != null && ((long) A002.A08) == -1) {
                    A0E(r6);
                }
                A08(r6);
                return;
            }
            A0E(r6);
        }
        A09(r6);
    }

    public final void A0E(AnonymousClass1SV r6) {
        boolean z = r6.A02;
        C54122oD r3 = this.A01;
        C95814uZ r2 = r6.A01;
        if (z) {
            r3.A00(r2, 3, false, true);
        } else {
            r3.A02(r2, false);
        }
    }

    public C22561Or(AnonymousClass33E r1, C54122oD r2, C56612sH r3, C56982ss r4, C623934v r5) {
        super(r5);
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
    }
}
