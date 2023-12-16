package X;

import java.io.File;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2tG  reason: invalid class name and case insensitive filesystem */
public final class C57202tG {
    public static boolean A01(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File A0f = AnonymousClass0x9.A0f(it);
            if (A0f != null && A0f.getName().startsWith("msgstore.db") && A0f.exists()) {
                return true;
            }
        }
        return false;
    }

    public static AnonymousClass22O A00(String str) {
        int A01 = C06550Ye.A01(str, "msgstore.db");
        if (A01 > 0) {
            return AnonymousClass22O.A02(A01);
        }
        return null;
    }
}
