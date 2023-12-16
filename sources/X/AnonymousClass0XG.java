package X;

import java.util.Map;

/* renamed from: X.0XG  reason: invalid class name */
public class AnonymousClass0XG {
    public final C55552qX A00;
    public final AnonymousClass2XX A01;

    public static void A01(C150917Ss r7, C131266dJ r8, C835248t r9, C835248t r10, Map map) {
        C156377gW r4;
        C157967jD A03;
        C835248t r1;
        C131266dJ r0;
        String str;
        String str2;
        C156377gW r6 = null;
        if (r9 == null) {
            r4 = null;
        } else {
            r4 = new C156377gW(r8, r9);
        }
        if (r10 != null) {
            r6 = new C156377gW(r8, r10);
        }
        C153427bI r5 = r8.A00;
        if (r5 == null) {
            str = "BloksAsyncAction";
            str2 = "Async action executed with a null Context";
        } else {
            C131266dJ A002 = C159377lj.A00(r7, r5, map);
            C835248t r12 = r7.A01;
            if (r12 != null) {
                C152057Xj r02 = new C152057Xj();
                r02.A04(r5, 0);
                Object A003 = C157157hp.A00(A002, r02.A03(), r12);
                if (r4 != null) {
                    C152057Xj r13 = new C152057Xj();
                    r13.A04(A003, 0);
                    r13.A04(r5, 1);
                    A03 = r13.A03();
                    r1 = r4.A01;
                    r0 = r4.A00;
                } else {
                    return;
                }
            } else if (r6 != null) {
                C152057Xj r03 = new C152057Xj();
                r03.A04(r5, 0);
                A03 = r03.A03();
                r1 = r6.A01;
                r0 = r6.A00;
            } else {
                return;
            }
            if (r0 != null) {
                C157157hp.A00(r0, A03, r1);
                return;
            } else {
                str = "BloksCallback";
                str2 = "An attempt to invoke an invalid callback";
            }
        }
        C159737mN.A01(str, str2);
    }

    public void A04(C150917Ss r3, AnonymousClass49I r4, AnonymousClass49I r5, Object obj) {
        this.A01.A00(new C13040mX(r3, r4, r5, obj));
    }

    public AnonymousClass0XG(C55552qX r1, AnonymousClass2XX r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
