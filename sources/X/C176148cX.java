package X;

/* renamed from: X.8cX  reason: invalid class name and case insensitive filesystem */
public class C176148cX extends AnonymousClass8Q0 {
    public C176128cV A00;
    public C176278ck A01;

    public C176148cX(C176958dq r3) {
        C176128cV r1;
        C176278ck r0;
        C183618qL A0A = C176958dq.A0A(r3);
        if (A0A instanceof C176128cV) {
            r1 = (C176128cV) A0A;
        } else if (A0A != null) {
            r1 = new C176128cV(C176728dT.A0A(A0A));
        } else {
            r1 = null;
        }
        this.A00 = r1;
        if (r3.A0U() == 2) {
            C176958dq A0D = C176958dq.A0D((C176908dl) r3.A0W(1), true);
            if (A0D != null) {
                r0 = new C176278ck(C176958dq.A0C(A0D));
            } else {
                r0 = null;
            }
            this.A01 = r0;
        }
    }
}
