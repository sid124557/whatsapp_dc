package X;

import com.google.protobuf.UnsafeUtil;
import java.util.List;

/* renamed from: X.7ji  reason: invalid class name and case insensitive filesystem */
public abstract class C158277ji {
    public static final C158277ji A00 = new C130816ca();
    public static final C158277ji A01 = new C130806cZ();

    public List A01(Object obj, long j) {
        if (!(this instanceof C130806cZ)) {
            return C130816ca.A00(obj, 10, j);
        }
        C188248ya r2 = (C188248ya) C153777bz.A00(obj, j);
        if (((AnonymousClass8T6) r2).A00) {
            return r2;
        }
        int size = r2.size();
        int i = size * 2;
        if (size == 0) {
            i = 10;
        }
        C188248ya BLN = r2.BLN(i);
        UnsafeUtil.A05(obj, j, BLN);
        return BLN;
    }
}
