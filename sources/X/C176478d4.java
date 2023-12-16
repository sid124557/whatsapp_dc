package X;

/* renamed from: X.8d4  reason: invalid class name and case insensitive filesystem */
public class C176478d4 extends AnonymousClass8Q0 {
    public static final C176748dV A06 = new C176748dV(0);
    public C176758dW A00;
    public C176748dV A01;
    public C176958dq A02;
    public C176568dD A03;
    public C176288cl A04;
    public boolean A05;

    public C176478d4(C176958dq r6) {
        C176618dI A0B;
        C176568dD r1;
        C176778dY A0B2;
        C176568dD r3;
        int i = 0;
        if (!(r6.A0W(0) instanceof C176908dl) || ((C176908dl) r6.A0W(0)).A00 != 0) {
            this.A01 = A06;
        } else {
            this.A05 = true;
            this.A01 = C176748dV.A0A(AnonymousClass8Q0.A03((C176908dl) r6.A0W(0)));
            i = 1;
        }
        int i2 = i + 1;
        C183618qL A0W = r6.A0W(i);
        if (A0W instanceof C176568dD) {
            r3 = (C176568dD) A0W;
        } else {
            if (A0W instanceof C176648dL) {
                A0B2 = (C176778dY) A0W;
            } else {
                if (A0W instanceof C176908dl) {
                    C176908dl r32 = (C176908dl) A0W;
                    if (r32.A00 == 1) {
                        A0B = C176618dI.A0B(C176958dq.A0D(r32, true));
                    } else {
                        A0B2 = C176778dY.A0B(r32, true);
                    }
                } else {
                    A0B = C176618dI.A0B(A0W);
                }
                r1 = new C176568dD(A0B);
                r3 = r1;
            }
            r1 = new C176568dD(A0B2);
            r3 = r1;
        }
        this.A03 = r3;
        int i3 = i2 + 1;
        this.A00 = C176758dW.A0C(r6.A0W(i2));
        int i4 = i3 + 1;
        this.A02 = (C176958dq) r6.A0W(i3);
        if (r6.A0U() > i4) {
            this.A04 = C176288cl.A0B(C176958dq.A0D((C176908dl) r6.A0W(i4), true));
        }
    }
}
