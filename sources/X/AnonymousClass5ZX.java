package X;

/* renamed from: X.5ZX  reason: invalid class name */
public class AnonymousClass5ZX implements AnonymousClass4A4 {
    public Object A00;
    public final int A01;

    public final void Bbj(int[] iArr) {
        if (this.A01 != 0) {
            A01(this, iArr);
        } else {
            A00(this, iArr);
        }
    }

    public AnonymousClass5ZX(AnonymousClass4Z4 r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public static final void A00(AnonymousClass5ZX r3, int[] iArr) {
        AnonymousClass4Z4 r32 = (AnonymousClass4Z4) r3.A00;
        C106655Zv r2 = new C106655Zv(iArr);
        r32.A05.BRq(r2, r32.A00);
        int i = r32.A00;
        r32.A01 = r2;
        r32.A00 = i;
        C107005aX.A03(r32.A06, iArr);
        r32.A08();
    }

    public static final void A01(AnonymousClass5ZX r3, int[] iArr) {
        AnonymousClass4Z4 r32 = (AnonymousClass4Z4) r3.A00;
        C106655Zv r2 = new C106655Zv(iArr);
        r32.A05.BRq(r2, r32.A00);
        int i = r32.A00;
        r32.A01 = r2;
        r32.A00 = i;
        C107005aX.A02(r32.A06, iArr);
        r32.A08();
    }
}
