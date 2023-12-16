package X;

/* renamed from: X.91T  reason: invalid class name */
public class AnonymousClass91T implements C15790rw {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass91T(C153427bI r1, AnonymousClass84O r2, int i) {
        this.A02 = i;
        this.A00 = r2;
        this.A01 = r1;
    }

    public final void AwB(Object obj) {
        if (this.A02 != 0) {
            AnonymousClass84O r3 = (AnonymousClass84O) this.A00;
            C153427bI r2 = (C153427bI) this.A01;
            r3.A0T(40, obj);
            C835248t A0L = r3.A0L(46);
            if (A0L != null) {
                C159377lj.A01(r2, r3, C152057Xj.A02(obj), A0L);
                return;
            }
            return;
        }
        AnonymousClass84O r5 = (AnonymousClass84O) this.A00;
        C153427bI r4 = (C153427bI) this.A01;
        String str = (String) obj;
        C835248t A0L2 = r5.A0L(46);
        if (A0L2 != null && str.length() == r5.A0E(36, 0)) {
            C159377lj.A01(r4, r5, C152057Xj.A00(new C152057Xj(), str, 0), A0L2);
        }
    }
}
