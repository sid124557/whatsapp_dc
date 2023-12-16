package X;

import android.view.animation.Interpolator;

/* renamed from: X.0Ok  reason: invalid class name and case insensitive filesystem */
public final class C04470Ok {
    public int A00 = -1;
    public int A01;
    public int A02;
    public Interpolator A03;
    public Interpolator A04;
    public AnonymousClass0FU A05 = AnonymousClass0FU.BOTTOM;
    public C16310so A06;
    public C16320sp A07;
    public AnonymousClass7r0 A08;
    public String A09;
    public boolean A0A = false;
    public final C153427bI A0B;

    public C06040Vz A00() {
        AnonymousClass7r0 r8 = this.A08;
        if (r8 != null) {
            int i = this.A00;
            if (i != -1) {
                C153427bI r7 = this.A0B;
                int i2 = this.A02;
                int i3 = this.A01;
                Interpolator interpolator = this.A04;
                Interpolator interpolator2 = this.A03;
                C16320sp r6 = this.A07;
                return new C06040Vz(interpolator, interpolator2, (C09670gZ) null, this.A05, this.A06, r6, r7, r8, this.A09, i, i2, i3, this.A0A);
            }
            throw AnonymousClass001.A0c("Auto-dismiss duration must be >= 0ms");
        }
        throw AnonymousClass001.A0c("Bloks content cannot be null in popover window");
    }

    public C04470Ok(C153427bI r2) {
        this.A0B = r2;
    }

    public void A01(AnonymousClass7r0 r1) {
        this.A08 = r1;
    }
}
