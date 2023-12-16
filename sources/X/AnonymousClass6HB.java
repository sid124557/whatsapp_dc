package X;

import java.util.List;

/* renamed from: X.6HB  reason: invalid class name */
public final class AnonymousClass6HB extends AnonymousClass0QO {
    public List A00;
    public List A01;

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        return AnonymousClass6C9.A1O(this.A01.get(i), this.A00, i2);
    }

    public boolean A04(int i, int i2) {
        return ((C105175Tw) this.A01.get(i)).A0b.equals(((C105175Tw) this.A00.get(i2)).A0b);
    }

    public AnonymousClass6HB(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
