package X;

import java.util.List;

/* renamed from: X.6HC  reason: invalid class name */
public class AnonymousClass6HC extends AnonymousClass0QO {
    public final List A00;
    public final List A01;

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        return ((AnonymousClass7IL) this.A01.get(i)).A01.equals(((AnonymousClass7IL) this.A00.get(i2)).A01);
    }

    public boolean A04(int i, int i2) {
        return AnonymousClass000.A1U(((AnonymousClass7IL) this.A01.get(i)).A00, ((AnonymousClass7IL) this.A00.get(i2)).A00);
    }

    public AnonymousClass6HC(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
