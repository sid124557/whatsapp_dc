package X;

import java.util.List;

/* renamed from: X.950  reason: invalid class name */
public class AnonymousClass950 extends AnonymousClass0QO {
    public final List A00;
    public final List A01;

    public int A00() {
        return this.A01.size();
    }

    public int A01() {
        return this.A00.size();
    }

    public boolean A03(int i, int i2) {
        List list = this.A00;
        if (i >= list.size()) {
            return false;
        }
        List list2 = this.A01;
        if (i2 < list2.size()) {
            return list.get(i).equals(list2.get(i2));
        }
        return false;
    }

    public boolean A04(int i, int i2) {
        List list = this.A00;
        if (i >= list.size()) {
            return false;
        }
        List list2 = this.A01;
        if (i2 >= list2.size()) {
            return false;
        }
        if (list.get(i).getClass() == list2.get(i2).getClass()) {
            return true;
        }
        return false;
    }

    public AnonymousClass950(List list, List list2) {
        this.A00 = list;
        this.A01 = list2;
    }
}
