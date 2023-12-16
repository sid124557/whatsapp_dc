package X;

import java.util.Comparator;

/* renamed from: X.0n9  reason: invalid class name and case insensitive filesystem */
public class C13420n9 implements Comparator {
    public final /* synthetic */ C10130hR A00;
    public final /* synthetic */ C131266dJ A01;
    public final /* synthetic */ C835248t A02;

    public C13420n9(C10130hR r1, C131266dJ r2, C835248t r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public int compare(Object obj, Object obj2) {
        C835248t r3 = this.A02;
        C152057Xj r1 = new C152057Xj();
        r1.A05(obj, 0);
        r1.A05(obj2, 1);
        Object A002 = C157157hp.A00(this.A01, r1.A03(), r3);
        if (A002 instanceof Integer) {
            return AnonymousClass001.A0K(A002);
        }
        C159737mN.A01("bk.action.array.SortedArray", "Got non-integer result while evaluating comparator predicate");
        return 0;
    }
}
