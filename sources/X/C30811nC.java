package X;

/* renamed from: X.1nC  reason: invalid class name and case insensitive filesystem */
public abstract class C30811nC extends C30471mV {
    public C60072xx A00;

    public void A23(C60072xx r2) {
        this.A00 = r2;
        if (r2 == null) {
            A1C(32768);
        } else {
            A1B(32768);
        }
    }

    public C30811nC(AnonymousClass2z0 r1, byte b, long j) {
        super(r1, b, j);
    }

    public C30811nC(AnonymousClass33C r12, AnonymousClass2z0 r13, C30811nC r14, long j, boolean z) {
        super(r12, r13, r14, r14.A1I, j, z);
        C60072xx r0 = r14.A00;
        if (r0 != null) {
            A23(new C60072xx(r0.A02, r0.A01));
        }
    }
}
