package X;

import java.util.List;

/* renamed from: X.8Gd  reason: invalid class name and case insensitive filesystem */
public final class C171198Gd implements C182468oS {
    public final AnonymousClass5O9 A00;
    public final List A01;

    public C171198Gd(AnonymousClass5O9 r2, List list) {
        C162457s7.A0J(list, 2);
        this.A00 = r2;
        this.A01 = list;
    }

    public C186308v5 B0p(boolean z) {
        C108945dp r1;
        if (z) {
            r1 = new C108945dp();
            r1.A01 = 2;
            r1.A00 = 7;
            r1.A02 = 2;
            r1.A03 = null;
            r1.A04 = false;
        } else {
            r1 = new C108945dp();
            r1.A05 = true;
        }
        C186308v5 A002 = this.A00.A00(r1);
        C162457s7.A0D(A002);
        return new C171178Gb(this, A002, this.A01);
    }
}
