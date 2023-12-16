package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: X.0T1  reason: invalid class name */
public class AnonymousClass0T1 {
    public final Map A00 = AnonymousClass001.A0t();
    public final Map A01;

    public static void A00(AnonymousClass0GH r5, C15910sA r6, Object obj, List list) {
        Method method;
        Object[] objArr;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    AnonymousClass0OL r1 = (AnonymousClass0OL) list.get(size);
                    try {
                        int i = r1.A00;
                        if (i == 0) {
                            method = r1.A01;
                            objArr = new Object[0];
                        } else if (i != 1) {
                            method = r1.A01;
                            objArr = new Object[]{r6, r5};
                        } else {
                            method = r1.A01;
                            objArr = new Object[]{r6};
                        }
                        method.invoke(obj, objArr);
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException("Failed to call observer method", e.getCause());
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public AnonymousClass0T1(Map map) {
        this.A01 = map;
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            Object value = A0w.getValue();
            List list = (List) this.A00.get(value);
            if (list == null) {
                list = AnonymousClass001.A0s();
                this.A00.put(value, list);
            }
            list.add(A0w.getKey());
        }
    }
}
