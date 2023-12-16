package X;

/* renamed from: X.8cr  reason: invalid class name and case insensitive filesystem */
public class C176348cr extends AnonymousClass8Q0 {
    public C176958dq A00;
    public C176068cP A01;
    public C176478d4 A02;
    public C176528d9 A03;

    public C176348cr(C176958dq r4) {
        C176478d4 r1;
        C183618qL A0A = C176958dq.A0A(r4);
        if (A0A instanceof C176478d4) {
            r1 = (C176478d4) A0A;
        } else if (A0A != null) {
            r1 = new C176478d4(C176958dq.A0C(A0A));
        } else {
            r1 = null;
        }
        this.A02 = r1;
        this.A03 = C176528d9.A0A(r4.A0W(1));
        this.A01 = (C176068cP) r4.A0W(2);
        if (r4.A0U() > 3) {
            this.A00 = C176958dq.A0D((C176908dl) r4.A0W(3), true);
        }
    }
}
