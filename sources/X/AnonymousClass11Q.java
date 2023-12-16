package X;

import java.util.List;

/* renamed from: X.11Q  reason: invalid class name */
public final class AnonymousClass11Q extends AnonymousClass0QO {
    public final List A00;
    public final List A01;

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        AnonymousClass2FD r4 = (AnonymousClass2FD) this.A01.get(i);
        AnonymousClass2FD r3 = (AnonymousClass2FD) this.A00.get(i2);
        if ((r4 instanceof AnonymousClass1NM) && (r3 instanceof AnonymousClass1NM)) {
            AnonymousClass1NM r42 = (AnonymousClass1NM) r4;
            AnonymousClass1NM r32 = (AnonymousClass1NM) r3;
            if (!C162457s7.A0P(r42.A01.A1J.A01, r32.A01.A1J.A01) || r42.A02 != r32.A02) {
                return false;
            }
            return true;
        } else if (!(r4 instanceof AnonymousClass1NL) || !(r3 instanceof AnonymousClass1NL)) {
            return false;
        } else {
            return C162457s7.A0P(((AnonymousClass1NL) r4).A00, ((AnonymousClass1NL) r3).A00);
        }
    }

    public boolean A04(int i, int i2) {
        return C162457s7.A0P(this.A01.get(i), this.A00.get(i2));
    }

    public AnonymousClass11Q(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
