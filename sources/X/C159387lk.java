package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7lk  reason: invalid class name and case insensitive filesystem */
public class C159387lk {
    public static int A00(C181458mn r3, List list) {
        for (int i = 0; i < list.size(); i++) {
            AnonymousClass84O A0V = AnonymousClass6C9.A0V(list, i);
            if (A0V.A0N() != null && r3.Bqb(A0V)) {
                return i;
            }
        }
        return -1;
    }

    public static Pair A01(AnonymousClass84O r6, C181458mn r7) {
        Object obj;
        int i;
        int[] A00 = C158977kt.A01().A00(r6.A03);
        int length = A00.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                obj = Collections.EMPTY_LIST;
                i = -1;
                break;
            }
            int i3 = A00[i2];
            List A0R = r6.A0R(i3);
            i = A00(r7, A0R);
            if (i >= 0) {
                obj = AnonymousClass002.A0J(A0R);
                r6.A0T(i3, obj);
                break;
            }
            i2++;
        }
        return C18290x4.A0K(obj, i);
    }

    public static List A02(List list) {
        ArrayList A0p = AnonymousClass000.A0p(list);
        for (int i = 0; i < list.size(); i++) {
            AnonymousClass84O A0V = AnonymousClass6C9.A0V(list, i);
            if (A0V != null) {
                if (A0V.A03 == 13346) {
                    List A0S = A0V.A0S(32);
                    for (int i2 = 0; i2 < A0S.size(); i2++) {
                        A0p.add(A0S.get(i2));
                    }
                } else {
                    A0p.add(A0V);
                }
            }
        }
        return A0p;
    }
}
