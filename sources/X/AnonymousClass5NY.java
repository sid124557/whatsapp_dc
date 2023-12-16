package X;

/* renamed from: X.5NY  reason: invalid class name */
public class AnonymousClass5NY {
    public final AnonymousClass4FV A00;
    public final C45322Zo A01;
    public final AnonymousClass4FS A02;

    public void A00(C08310eF r8, int i) {
        AnonymousClass5ZC r4;
        C08310eF r3 = r8;
        if (r8 instanceof AnonymousClass65S) {
            r4 = ((AnonymousClass65S) r3).BCP();
        } else {
            r4 = C58152un.A02;
        }
        int i2 = r4.A01 * 2;
        if (i2 > 0 && r4.A04.nextInt(i2) == 0) {
            this.A02.BkP(new C71433c6(this, r3, r4, i, 32));
        }
    }

    public AnonymousClass5NY(AnonymousClass4FV r1, C45322Zo r2, AnonymousClass4FS r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
