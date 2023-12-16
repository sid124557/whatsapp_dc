package X;

import com.google.protobuf.UnsafeUtil;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6ca  reason: invalid class name and case insensitive filesystem */
public final class C130816ca extends C158277ji {
    public static final Class A00 = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public static List A00(Object obj, int i, long j) {
        AbstractList r1;
        List list = (List) C153777bz.A00(obj, j);
        if (list.isEmpty()) {
            if (list instanceof C188208yW) {
                list = new C130226bc(AnonymousClass002.A0I(i));
            } else if (!(list instanceof C178988iQ) || !(list instanceof C188248ya)) {
                list = AnonymousClass002.A0I(i);
            } else {
                list = ((C188248ya) list).BLN(i);
            }
            UnsafeUtil.A05(obj, j, list);
        } else {
            if (AnonymousClass6C9.A1N(A00, list)) {
                r1 = AnonymousClass6C8.A0i(list, i);
            } else if (list instanceof AnonymousClass8T7) {
                r1 = new C130226bc(AnonymousClass6C8.A0i(list, i));
            } else if ((list instanceof C178988iQ) && (list instanceof C188248ya)) {
                C188248ya r12 = (C188248ya) list;
                if (!((AnonymousClass8T6) r12).A00) {
                    C188248ya BLN = r12.BLN(list.size() + i);
                    UnsafeUtil.A05(obj, j, BLN);
                    return BLN;
                }
            }
            r1.addAll(list);
            UnsafeUtil.A05(obj, j, r1);
            return r1;
        }
        return list;
    }
}
