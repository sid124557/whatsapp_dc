package X;

import java.util.List;

/* renamed from: X.2ak  reason: invalid class name and case insensitive filesystem */
public final class C45892ak {
    public final C44902Xx A00;
    public final C50002hT A01;
    public final C40772Hr A02;
    public final C183538qC A03;

    public final boolean A00(C22891Qm r8) {
        List<C371221a> list = r8.A05;
        boolean A012 = this.A01.A01();
        if (list == null) {
            if (!A012) {
                return false;
            }
            if (!((C46522bm) this.A03.get()).A00() && this.A02.A00.A0Y(C58422vE.A02, 2935)) {
                return false;
            }
            C44902Xx r3 = this.A00;
            if ((r8.A06 || r3.A00.A00.A0Y(C58422vE.A02, 976)) && !r3.A00()) {
                return false;
            }
        } else if (!A012) {
            return false;
        } else {
            for (C371221a ordinal : list) {
                int ordinal2 = ordinal.ordinal();
                if (ordinal2 == 1) {
                    C44902Xx r32 = this.A00;
                    if ((r8.A06 || r32.A00.A00.A0Y(C58422vE.A02, 976)) && !r32.A00()) {
                        return false;
                    }
                } else if (ordinal2 != 0) {
                    throw C73153f1.A00();
                } else if (!((C46522bm) this.A03.get()).A00()) {
                    return false;
                }
            }
        }
        return true;
    }

    public C45892ak(C44902Xx r2, C50002hT r3, C40772Hr r4, C183538qC r5) {
        C18260x0.A0Q(r3, r5);
        C162457s7.A0J(r2, 4);
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
        this.A00 = r2;
    }
}
