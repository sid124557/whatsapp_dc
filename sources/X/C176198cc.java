package X;

/* renamed from: X.8cc  reason: invalid class name and case insensitive filesystem */
public class C176198cc extends AnonymousClass8Q0 {
    public C176748dV A00;
    public C176958dq A01;
    public C176618dI A02;
    public C176528d9 A03;
    public C176288cl A04;
    public C176598dG A05;
    public C176598dG A06;

    public C176198cc(C176958dq r5) {
        if (r5.A0U() < 3 || r5.A0U() > 7) {
            throw AnonymousClass8Q0.A01(r5);
        }
        int i = 0;
        if (r5.A0W(0) instanceof C176748dV) {
            this.A00 = C176748dV.A0A(r5.A0W(0));
            i = 1;
        }
        int i2 = i + 1;
        this.A03 = C176528d9.A0A(r5.A0W(i));
        int i3 = i2 + 1;
        this.A02 = C176618dI.A0B(r5.A0W(i2));
        int i4 = i3 + 1;
        this.A06 = C176598dG.A0A(r5.A0W(i3));
        if (i4 < r5.A0U() && ((r5.A0W(i4) instanceof C176708dR) || (r5.A0W(i4) instanceof C176758dW) || (r5.A0W(i4) instanceof C176598dG))) {
            this.A05 = C176598dG.A0A(r5.A0W(i4));
            i4++;
        }
        if (i4 < r5.A0U() && !(r5.A0W(i4) instanceof C176908dl)) {
            this.A01 = C176958dq.A0C(r5.A0W(i4));
            i4++;
        }
        if (i4 < r5.A0U() && (r5.A0W(i4) instanceof C176908dl)) {
            this.A04 = C176288cl.A0B(C176958dq.A0D((C176908dl) r5.A0W(i4), true));
        }
    }
}
