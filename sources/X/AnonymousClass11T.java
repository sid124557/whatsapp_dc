package X;

import java.util.List;

/* renamed from: X.11T  reason: invalid class name */
public final class AnonymousClass11T extends AnonymousClass0QO {
    public final List A00;
    public final List A01;

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        Object obj;
        Object obj2;
        AnonymousClass2GH r1 = (AnonymousClass2GH) this.A01.get(i);
        AnonymousClass2GH r2 = (AnonymousClass2GH) this.A00.get(i2);
        if ((r1 instanceof AnonymousClass1T5) && (r2 instanceof AnonymousClass1T5)) {
            obj = ((AnonymousClass1T5) r1).A02;
            obj2 = ((AnonymousClass1T5) r2).A02;
        } else if (!(r1 instanceof AnonymousClass1T4) || !(r2 instanceof AnonymousClass1T4)) {
            return false;
        } else {
            obj = ((AnonymousClass1T4) r1).A00;
            obj2 = ((AnonymousClass1T4) r2).A00;
        }
        return C162457s7.A0P(obj, obj2);
    }

    public boolean A04(int i, int i2) {
        return C162457s7.A0P(this.A01.get(i), this.A00.get(i2));
    }

    public AnonymousClass11T(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
