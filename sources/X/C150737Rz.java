package X;

/* renamed from: X.7Rz  reason: invalid class name and case insensitive filesystem */
public class C150737Rz {
    public int A00;
    public int A01;

    public void A00(int i) {
        int i2;
        int i3 = this.A01;
        if (i3 < i || (i2 = this.A00) <= 0) {
            Object[] A1X = AnonymousClass0x9.A1X();
            C86604Kt.A1X(A1X, i, 0, i3, 1);
            AnonymousClass000.A1N(A1X, this.A00);
            C186438vJ r1 = C161577py.A00;
            if (r1.BI0(6)) {
                r1.Bsm("com.facebook.imagepipeline.memory.BasePool.Counter", AnonymousClass6CA.A0T("Unexpected decrement of %d. Current numBytes = %d, count = %d", A1X));
                return;
            }
            return;
        }
        this.A00 = i2 - 1;
        this.A01 = i3 - i;
    }
}
