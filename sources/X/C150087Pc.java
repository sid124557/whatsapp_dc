package X;

import java.util.List;

/* renamed from: X.7Pc  reason: invalid class name and case insensitive filesystem */
public class C150087Pc {
    public final C151357Ul A00;
    public final C126316Nj A01;
    public final C126296Nh A02;
    public final C126306Ni A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final boolean A07;
    public final boolean A08;

    public C150087Pc(C150257Px r3) {
        String str = r3.A04;
        if (str != null) {
            this.A04 = str;
            C126306Ni r1 = r3.A03;
            this.A07 = r3.A08;
            this.A08 = r3.A09;
            this.A00 = r3.A00;
            this.A03 = r1;
            this.A01 = r3.A01;
            this.A02 = r3.A02;
            this.A06 = r3.A07;
            this.A05 = r3.A06;
            return;
        }
        throw AnonymousClass001.A0e("Cache name must not be null");
    }
}
