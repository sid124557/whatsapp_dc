package X;

/* renamed from: X.90Z  reason: invalid class name */
public class AnonymousClass90Z implements C182758ow {
    public Object A00;
    public boolean A01;
    public final int A02;

    public AnonymousClass90Z(AnonymousClass4U1 r1, int i, boolean z) {
        this.A02 = i;
        this.A00 = r1;
        this.A01 = z;
    }

    public final void BUp(Object obj) {
        C104795Sj r1;
        int i;
        int i2 = this.A02;
        AnonymousClass4U1 r2 = (AnonymousClass4U1) this.A00;
        boolean z = this.A01;
        C109065e1 r4 = (C109065e1) obj;
        if (i2 == 0) {
            if (z) {
                r1 = r2.A0F;
                i = 8;
            }
            r2.A02 = r4;
            C06270Wx.A04(r2.A0I, 6);
        } else if (z) {
            r1 = r2.A0F;
            i = 10;
        } else {
            return;
        }
        r1.A00(i);
        r2.A02 = r4;
        C06270Wx.A04(r2.A0I, 6);
    }
}
