package X;

import java.util.List;

/* renamed from: X.11V  reason: invalid class name */
public final class AnonymousClass11V extends AnonymousClass0QO {
    public final List A00;
    public final List A01;

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        C51722kH r3 = (C51722kH) this.A01.get(i);
        C51722kH r2 = (C51722kH) this.A00.get(i2);
        if (r3.A00 != r2.A00 || !C162457s7.A0P(r3.A01, r2.A01)) {
            return false;
        }
        return true;
    }

    public boolean A04(int i, int i2) {
        return C162457s7.A0P(this.A01.get(i), this.A00.get(i2));
    }

    public AnonymousClass11V(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
