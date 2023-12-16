package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3g4  reason: invalid class name and case insensitive filesystem */
public class C73783g4 extends AnonymousClass8UF {
    public static final int A0b(Iterable iterable, int i) {
        C162457s7.A0J(iterable, 0);
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i;
    }

    public static ArrayList A0c(Iterable iterable) {
        return new ArrayList(A0b(iterable, 10));
    }

    public static ArrayList A0d(Iterable iterable) {
        return new ArrayList(A0b(iterable, 10));
    }

    public static final List A0e(Iterable iterable) {
        ArrayList A0r = C18300x5.A0r(iterable);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C73743g0.A0W((Iterable) it.next(), A0r);
        }
        return A0r;
    }
}
