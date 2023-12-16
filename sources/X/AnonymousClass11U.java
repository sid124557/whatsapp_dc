package X;

import java.util.List;

/* renamed from: X.11U  reason: invalid class name */
public final class AnonymousClass11U extends AnonymousClass0QO {
    public final List A00;
    public final List A01;

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        return C162457s7.A0P(((AnonymousClass3ZO) this.A01.get(i)).A06, ((AnonymousClass3ZO) this.A00.get(i2)).A06);
    }

    public boolean A04(int i, int i2) {
        return C162457s7.A0P(this.A01.get(i), this.A00.get(i2));
    }

    public AnonymousClass11U(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
