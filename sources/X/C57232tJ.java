package X;

import android.text.TextUtils;
import java.util.AbstractMap;

/* renamed from: X.2tJ  reason: invalid class name and case insensitive filesystem */
public class C57232tJ {
    public static Integer A01(String str, String str2) {
        AbstractMap abstractMap = (AbstractMap) AnonymousClass2C2.A02.get(str);
        if (abstractMap != null) {
            return (Integer) abstractMap.get(str2);
        }
        return null;
    }

    public static int A00(String str) {
        Integer A01;
        if (TextUtils.isEmpty(str) || !AnonymousClass2C2.A02.containsKey(str) || (A01 = A01(str, "stable_release")) == null) {
            return 1;
        }
        return A01.intValue();
    }
}
