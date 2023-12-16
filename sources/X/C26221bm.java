package X;

/* renamed from: X.1bm  reason: invalid class name and case insensitive filesystem */
public class C26221bm extends C52932mH {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26221bm(C43812To r1, AnonymousClass4C1 r2, AnonymousClass4C1 r3, AnonymousClass4C1 r4, int i) {
        super(r1);
        this.A03 = i;
        C18260x0.A0c(r1, r2, r3, r4);
        if (i != 0) {
            this.A00 = r2;
            this.A02 = r3;
        } else {
            super(r1);
            this.A02 = r2;
            this.A00 = r3;
        }
        this.A01 = r4;
    }
}
