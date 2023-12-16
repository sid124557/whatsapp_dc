package X;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0UU  reason: invalid class name */
public abstract class AnonymousClass0UU {
    public C13550nM A00;
    public C13560nN A01;
    public C13390n6 A02;

    public abstract int A01();

    public abstract int A02(Object obj);

    public abstract Object A03(int i, int i2);

    public abstract void A04();

    public abstract void A05(int i);

    public static boolean A00(Collection collection, Map map) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return AnonymousClass001.A1X(size, map.size());
    }

    public Object[] A06(Object[] objArr, int i) {
        int A012 = A01();
        if (objArr.length < A012) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), A012);
        }
        for (int i2 = 0; i2 < A012; i2++) {
            objArr[i2] = A03(i2, i);
        }
        if (objArr.length > A012) {
            objArr[A012] = null;
        }
        return objArr;
    }
}
