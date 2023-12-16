package X;

/* renamed from: X.5gs  reason: invalid class name and case insensitive filesystem */
public class C110695gs implements C17190ui {
    public boolean A00;
    public final C621033m A01;
    public final AnonymousClass4FP A02;
    public final C56982ss A03;
    public final C95814uZ A04;
    public final C55832qz A05;
    public final C33141sV A06;

    public C05550Ty Azr(Class cls) {
        if (cls.equals(AnonymousClass4UX.class)) {
            C56982ss r3 = this.A03;
            C621033m r1 = this.A01;
            C55832qz r5 = this.A05;
            C33141sV r6 = this.A06;
            return new AnonymousClass4UX(r1, this.A02, r3, this.A04, r5, r6, this.A00);
        }
        throw AnonymousClass001.A0c(AnonymousClass000.A0P(cls, "Unknown class ", AnonymousClass001.A0o()));
    }

    public C110695gs(C621033m r1, AnonymousClass4FP r2, C56982ss r3, C95814uZ r4, C55832qz r5, C33141sV r6, boolean z) {
        this.A03 = r3;
        this.A01 = r1;
        this.A05 = r5;
        this.A06 = r6;
        this.A04 = r4;
        this.A02 = r2;
        this.A00 = z;
    }

    public /* synthetic */ C05550Ty B09(AnonymousClass0N3 r2, Class cls) {
        return C86604Kt.A0K(this, cls);
    }
}
