package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.7R7  reason: invalid class name */
public final class AnonymousClass7R7 {
    public final int A00;

    public final Map A00(int i, int i2, int i3) {
        if (i3 < 1) {
            i3 = 1;
        }
        int i4 = this.A00;
        if (i3 > i4) {
            i3 = i4;
        }
        float f = ((float) i3) * (((float) i) / 1000.0f);
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = (float) i2;
        if (f > f2) {
            f = f2;
        }
        float f3 = f2 / f;
        int i5 = 0;
        C175698Zj A02 = C175708Zk.A02(0, i2);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C57692u3.A01(A02));
        Iterator it = A02.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int A0K = AnonymousClass001.A0K(next);
            if (((int) (((float) A0K) % f3)) == 0) {
                i5 = A0K;
            }
            AnonymousClass0x2.A1I(next, linkedHashMap, i5);
        }
        return linkedHashMap;
    }

    public AnonymousClass7R7(int i) {
        this.A00 = i;
    }
}
