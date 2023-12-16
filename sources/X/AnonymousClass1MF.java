package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1MF  reason: invalid class name */
public final class AnonymousClass1MF extends C27141dL {
    public String A02(C46202bF r4, Map map) {
        int i;
        boolean A1U = C18270x1.A1U(map, r4);
        Iterator A0v = AnonymousClass001.A0v(map);
        if (A0v.hasNext()) {
            switch (((C618532n) A0v.next()).A01) {
                case 3489014:
                    i = 10;
                    break;
                case 3489016:
                    r4.A00 = A1U ? 1 : 0;
                    break;
                case 3489017:
                    i = 8;
                    break;
                case 3489018:
                    i = 9;
                    break;
            }
            r4.A00 = i;
        }
        return super.A02(r4, map);
    }
}
