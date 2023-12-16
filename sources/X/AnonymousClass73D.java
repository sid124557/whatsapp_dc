package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.73D  reason: invalid class name */
public class AnonymousClass73D {
    public static AnonymousClass84O A00(C183998r0 r12, AnonymousClass84O r13) {
        int i;
        int i2;
        AnonymousClass84O Ax6 = r12.Ax6(r13);
        boolean A00 = C154137cf.A00(Ax6);
        boolean A01 = C154137cf.A01(Ax6);
        HashSet A0K = AnonymousClass002.A0K();
        if (C154137cf.A01(Ax6)) {
            C18270x1.A1K(A0K, Ax6.A02);
        }
        int[] A012 = C158977kt.A01().A01(Ax6.A03);
        for (int i3 = 0; i3 < A012.length; i3++) {
            AnonymousClass84O A0J = Ax6.A0K(A012[i3]);
            if (A0J != null) {
                AnonymousClass84O A002 = A00(r12, A0J);
                if (A002 != A0J) {
                    if (Ax6 == r13) {
                        Ax6 = new AnonymousClass84O(r13, (AnonymousClass84O) null, r13.A07, r13.A02);
                    }
                    Ax6.A0T(A012[i3], A002);
                }
                int i4 = A002.A00;
                boolean z = true;
                if ((i4 & 1) == 0) {
                    z = false;
                }
                A00 |= z;
                A01 |= AnonymousClass000.A1S(i4 & 2);
                Set set = A002.A01;
                if (set == null) {
                    set = Collections.emptySet();
                }
                if (!set.isEmpty()) {
                    A0K.addAll(set);
                }
            }
        }
        int[] A003 = C158977kt.A01().A00(Ax6.A03);
        for (int i5 = 0; i5 < A003.length; i5++) {
            List A0R = Ax6.A0R(A003[i5]);
            List list = A0R;
            for (int i6 = 0; i6 < A0R.size(); i6++) {
                AnonymousClass84O A0V = AnonymousClass6C9.A0V(A0R, i6);
                if (A0V != null) {
                    AnonymousClass84O A004 = A00(r12, A0V);
                    if (A004 != A0V) {
                        if (list == A0R) {
                            list = AnonymousClass002.A0J(A0R);
                        }
                        list.set(i6, A004);
                    }
                    boolean z2 = true;
                    if ((A004.A00 & 1) == 0) {
                        z2 = false;
                    }
                    A00 |= z2;
                    A01 |= AnonymousClass000.A1S(A004.A00 & 2);
                    Set set2 = A004.A01;
                    if (set2 == null) {
                        set2 = Collections.emptySet();
                    }
                    if (!set2.isEmpty()) {
                        A0K.addAll(set2);
                    }
                }
            }
            if (list != A0R) {
                if (Ax6 == r13) {
                    Ax6 = new AnonymousClass84O(r13, (AnonymousClass84O) null, r13.A07, r13.A02);
                }
                Ax6.A0T(A003[i5], list);
            }
        }
        if (Ax6 != r13) {
            int i7 = Ax6.A00;
            if (A00) {
                i = i7 | 1;
            } else {
                i = i7 & -2;
            }
            Ax6.A00 = i;
            if (A01) {
                i2 = i | 2;
            } else {
                i2 = i & -3;
            }
            Ax6.A00 = i2;
            Ax6.A01 = A0K;
        }
        r12.Bf1(Ax6);
        return Ax6;
    }
}
