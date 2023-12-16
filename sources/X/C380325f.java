package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.25f  reason: invalid class name and case insensitive filesystem */
public final class C380325f {
    public static void A00(List list, List list2, int i) {
        Object obj;
        float size;
        list2.clear();
        if (i == list.size()) {
            list2.addAll(list);
        } else if (i == 0) {
        } else {
            if (list.isEmpty()) {
                for (int i2 = 0; i2 < i; i2++) {
                    list2.add(Float.valueOf(0.0f));
                }
                return;
            }
            int size2 = list.size();
            boolean isEmpty = list2.isEmpty();
            if (i > size2) {
                C626936e.A0B(isEmpty);
                if (list.size() == 1) {
                    size = 0.0f;
                } else {
                    size = 1.0f / (((((float) (i - list.size())) * 1.0f) / ((float) AnonymousClass002.A04(list, 1))) + 1.0f);
                }
                for (int i3 = 0; i3 < i - 1; i3++) {
                    float f = ((float) i3) * size;
                    double d = (double) f;
                    int floor = (int) Math.floor(d);
                    int ceil = (int) Math.ceil(d);
                    float floatValue = ((Number) list.get(floor)).floatValue();
                    list2.add(Float.valueOf(floatValue + ((((Number) list.get(ceil)).floatValue() - floatValue) * (f - ((float) floor)))));
                }
                if (i >= 2) {
                    obj = list.get(AnonymousClass002.A04(list, 1));
                } else {
                    return;
                }
            } else {
                C626936e.A0B(isEmpty);
                float size3 = (((float) i) * 1.0f) / ((float) list.size());
                Iterator it = list.iterator();
                int i4 = 0;
                float f2 = 0.0f;
                float f3 = 0.0f;
                while (it.hasNext()) {
                    f2 += ((Number) it.next()).floatValue();
                    i4++;
                    f3 += size3;
                    if (f3 >= 1.0f) {
                        list2.add(Float.valueOf(f2 / ((float) i4)));
                        f3 -= 1.0f;
                        i4 = 0;
                        f2 = 0.0f;
                    }
                }
                if (i4 > 0) {
                    obj = Float.valueOf(f2 / ((float) i4));
                } else {
                    return;
                }
            }
            list2.add(obj);
        }
    }
}
