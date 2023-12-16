package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.34E  reason: invalid class name */
public class AnonymousClass34E {
    public static final String[] A00 = new String[0];

    public static String[] A01(C95814uZ r6, AnonymousClass2z0 r7, String[] strArr) {
        String str;
        int length = strArr.length;
        String[] strArr2 = new String[(length + 4)];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            strArr2[i2] = strArr[i];
            i++;
            i2++;
        }
        int i3 = i2 + 1;
        C18280x3.A0w(AnonymousClass2z0.A01(r7), strArr2, i2);
        int i4 = i3 + 1;
        strArr2[i3] = r7.A01;
        int i5 = i4 + 1;
        strArr2[i4] = AnonymousClass2z0.A08(r7);
        if (r6 != null) {
            str = r6.getRawString();
        } else {
            str = "0";
        }
        strArr2[i5] = str;
        return strArr2;
    }

    public static Boolean A00(String str) {
        if ("1".equals(str)) {
            return Boolean.TRUE;
        }
        if ("0".equals(str)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static String[] A02(Collection collection) {
        LinkedHashSet A17 = AnonymousClass0x9.A17();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A17.add(C18320x8.A0K(it).A08());
        }
        return (String[]) A17.toArray(A00);
    }
}
