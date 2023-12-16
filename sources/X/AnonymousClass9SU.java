package X;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.9SU  reason: invalid class name */
public class AnonymousClass9SU {
    public final String A00;
    public final List A01 = AnonymousClass001.A0s();

    @Deprecated
    public final C203719oC A00() {
        for (AnonymousClass9NJ r0 : this.A01) {
            Iterator it = AnonymousClass002.A0J(r0.A00.values()).iterator();
            while (true) {
                if (it.hasNext()) {
                    C203719oC r1 = (C203719oC) it.next();
                    if (r1.BHL()) {
                        return r1;
                    }
                }
            }
        }
        return null;
    }

    public C203719oC A01(String str) {
        C203719oC r0;
        if (str == null || str.equals(((AnonymousClass3H6) AnonymousClass1S3.A06).A04)) {
            return A00();
        }
        for (AnonymousClass9NJ r1 : this.A01) {
            if (!TextUtils.isEmpty(str)) {
                String A1L = C86664Kz.A1L(str);
                Map map = r1.A00;
                if (map.containsKey(A1L) && (r0 = (C203719oC) map.get(A1L)) != null) {
                    return r0;
                }
            }
        }
        return null;
    }

    public AnonymousClass9SU(String str) {
        C626936e.A05(str);
        this.A00 = str;
    }
}
