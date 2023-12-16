package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.7Se  reason: invalid class name and case insensitive filesystem */
public class C150777Se {
    public final long A00;
    public final List A01;
    public final List A02;

    public static AnonymousClass7PZ A00(C150777Se r0, int i) {
        return (AnonymousClass7PZ) r0.A01.get(i);
    }

    public int A01(int i) {
        List list = this.A01;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((AnonymousClass7PZ) list.get(i2)).A00 == i) {
                return i2;
            }
        }
        return -1;
    }

    public C150777Se(List list, List list2, long j) {
        this.A00 = j;
        this.A01 = Collections.unmodifiableList(list);
        this.A02 = Collections.unmodifiableList(list2);
    }
}
