package X;

import java.util.List;

/* renamed from: X.4Vp  reason: invalid class name and case insensitive filesystem */
public class C87734Vp extends AnonymousClass0QO {
    public final List A00;
    public final List A01;

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        return this.A01.get(i).equals(this.A00.get(i2));
    }

    public boolean A04(int i, int i2) {
        return AnonymousClass000.A1Y(this.A01.get(i), this.A00.get(i2));
    }

    public C87734Vp(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
