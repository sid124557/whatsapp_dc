package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.261  reason: invalid class name */
public class AnonymousClass261 {
    public static String[] A00(Collection collection) {
        String[] strArr = new String[(collection.size() * 3)];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            C54562ov r3 = (C54562ov) it.next();
            int i2 = i * 3;
            strArr[i2] = r3.A02;
            C18280x3.A1Q(strArr, r3.A01, i2 + 1);
            C18280x3.A1Q(strArr, r3.A00, i2 + 2);
            i++;
        }
        return strArr;
    }
}
