package X;

import java.util.List;

/* renamed from: X.4Vq  reason: invalid class name and case insensitive filesystem */
public class C87744Vq extends AnonymousClass0QO {
    public final List A00;
    public final List A01;

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        C104125Pt r3 = (C104125Pt) this.A01.get(i);
        C104125Pt r2 = (C104125Pt) this.A00.get(i2);
        if (r3.A00 != r2.A00 || !AnonymousClass75J.A00(r3.A02, r2.A02) || !AnonymousClass75J.A00(r3.A01, r2.A01)) {
            return false;
        }
        return true;
    }

    public boolean A04(int i, int i2) {
        C104125Pt r3 = (C104125Pt) this.A01.get(i);
        C104125Pt r2 = (C104125Pt) this.A00.get(i2);
        if (AnonymousClass75J.A00(r3.A01, r2.A01) || r3.equals(r2)) {
            return true;
        }
        return false;
    }

    public C87744Vq(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
