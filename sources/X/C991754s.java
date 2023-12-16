package X;

import java.util.Set;

/* renamed from: X.54s  reason: invalid class name and case insensitive filesystem */
public class C991754s extends AnonymousClass5ZM {
    public final C15630rg A00;
    public final C56942so A01;
    public final C55562qY A02;
    public final Set A03;

    public C991754s(C15630rg r2, C15910sA r3, C56942so r4, C55562qY r5, Set set) {
        super(r3, true);
        this.A02 = r5;
        this.A01 = r4;
        this.A03 = set;
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        int A012;
        C27991fJ A013;
        Set set = this.A03;
        C27991fJ r4 = null;
        if (set.size() == 1) {
            C27991fJ r1 = (C27991fJ) set.toArray()[0];
            A012 = this.A02.A00(r1);
            C56942so r2 = this.A01;
            if (C57192tF.A00(r2.A06.A06(r1)) && (A013 = r2.A01(r1)) != null && r2.A05(A013).size() == 1) {
                r4 = A013;
            }
        } else {
            A012 = this.A02.A01(set);
        }
        return new C101985Ha(r4, A012);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        this.A00.apply(obj);
    }
}
