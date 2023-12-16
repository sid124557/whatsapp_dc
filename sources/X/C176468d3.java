package X;

/* renamed from: X.8d3  reason: invalid class name and case insensitive filesystem */
public class C176468d3 extends AnonymousClass8Q0 {
    public static final C176748dV A04 = new C176748dV(20);
    public static final C176748dV A05 = new C176748dV(1);
    public static final C176528d9 A06;
    public static final C176528d9 A07;
    public C176748dV A00 = A04;
    public C176748dV A01 = A05;
    public C176528d9 A02 = A06;
    public C176528d9 A03 = A07;

    static {
        C176528d9 r2 = new C176528d9(C176108cT.A00, C186788vw.A07);
        A06 = r2;
        A07 = new C176528d9(r2, C186938wB.A1J);
    }

    public C176468d3(C176958dq r5) {
        for (int i = 0; i != r5.A0U(); i++) {
            C176908dl r2 = (C176908dl) r5.A0W(i);
            int i2 = r2.A00;
            if (i2 == 0) {
                this.A02 = C176528d9.A0A(C176958dq.A0D(r2, true));
            } else if (i2 == 1) {
                this.A03 = C176528d9.A0A(C176958dq.A0D(r2, true));
            } else if (i2 == 2) {
                this.A00 = C176748dV.A0A(AnonymousClass8Q0.A03(r2));
            } else if (i2 == 3) {
                this.A01 = C176748dV.A0A(AnonymousClass8Q0.A03(r2));
            } else {
                throw AnonymousClass001.A0c("unknown tag");
            }
        }
    }

    public C176468d3() {
    }
}
