package X;

import java.util.List;

/* renamed from: X.6HD  reason: invalid class name */
public final class AnonymousClass6HD extends AnonymousClass0QO {
    public final List A00;
    public final List A01;

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        return C162457s7.A0P(this.A01.get(i), this.A00.get(i2));
    }

    public boolean A04(int i, int i2) {
        String str;
        String str2;
        AnonymousClass7V0 r5 = (AnonymousClass7V0) this.A01.get(i);
        AnonymousClass7V0 r4 = (AnonymousClass7V0) this.A00.get(i2);
        boolean z = r5 instanceof C137826pK;
        if (z) {
            str = ((C137826pK) r5).A01;
        } else {
            str = ((C137836pL) r5).A03;
        }
        boolean z2 = r4 instanceof C137826pK;
        if (z2) {
            str2 = ((C137826pK) r4).A01;
        } else {
            str2 = ((C137836pL) r4).A03;
        }
        if (!C162457s7.A0P(str, str2)) {
            return false;
        }
        if ((!(r5 instanceof C137836pL) || !(r4 instanceof C137836pL)) && (!z || !z2)) {
            return false;
        }
        return true;
    }

    public AnonymousClass6HD(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
