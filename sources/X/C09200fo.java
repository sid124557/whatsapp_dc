package X;

import java.util.List;

/* renamed from: X.0fo  reason: invalid class name and case insensitive filesystem */
public class C09200fo implements C16780tx, C16230sg {
    public final C04850Qx A00;
    public final C04850Qx A01;
    public final C04850Qx A02;
    public final AnonymousClass0FR A03;
    public final String A04;
    public final List A05 = AnonymousClass001.A0s();
    public final boolean A06;

    public void BfC() {
        int i = 0;
        while (true) {
            List list = this.A05;
            if (i < list.size()) {
                ((C16230sg) list.get(i)).BfC();
                i++;
            } else {
                return;
            }
        }
    }

    public String getName() {
        return this.A04;
    }

    public C09200fo(C09500gI r4, C09320g0 r5) {
        this.A04 = r4.A04;
        this.A06 = r4.A05;
        this.A03 = r4.A03;
        C01540Bg A002 = AnonymousClass0BW.A00(r4.A02);
        this.A02 = A002;
        C01540Bg A003 = AnonymousClass0BW.A00(r4.A00);
        this.A00 = A003;
        C01540Bg A004 = AnonymousClass0BW.A00(r4.A01);
        this.A01 = A004;
        r5.A08(A002);
        r5.A08(A003);
        r5.A08(A004);
        C04850Qx.A06(A002, this);
        C04850Qx.A06(A003, this);
        C04850Qx.A06(A004, this);
    }

    public void Bm3(List list, List list2) {
    }
}
