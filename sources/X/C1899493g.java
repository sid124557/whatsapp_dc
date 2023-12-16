package X;

/* renamed from: X.93g  reason: invalid class name and case insensitive filesystem */
public class C1899493g implements C183238pi {
    public Object A00;
    public final int A01;

    public C1899493g(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(C1899493g r1) {
        C116095pj r12 = (C116095pj) r1.A00;
        C45142Yv r0 = r12.A0O;
        if (r0 != null) {
            r0.A00();
            r12.A0O = null;
        }
    }

    public void Bcl() {
        if (this.A01 != 0) {
            AnonymousClass5ZT r1 = (AnonymousClass5ZT) this.A00;
            C45142Yv r0 = r1.A0I;
            if (r0 != null) {
                r0.A00();
                r1.A0I = null;
                return;
            }
            return;
        }
        A00(this);
    }
}
