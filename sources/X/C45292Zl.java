package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Zl  reason: invalid class name and case insensitive filesystem */
public final class C45292Zl {
    public final C56542sA A00;
    public final C56982ss A01;
    public final C45282Zk A02;

    public final Map A00(List list) {
        long A002 = this.A02.A00();
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object next : list) {
            if (((AnonymousClass31A) next).A02() >= A002) {
                A0s.add(next);
            }
        }
        AnonymousClass3ZW r1 = new AnonymousClass3ZW(new C79903xN(C73723fy.A0J(C73723fy.A0H(A0s, 25), 50)));
        LinkedHashMap A0C = C18330xA.A0C(C57692u3.A01(r1));
        Iterator it = r1.iterator();
        while (it.hasNext()) {
            C55232q1 r2 = (C55232q1) it.next();
            AnonymousClass0x2.A1I(((AnonymousClass31A) r2.A01).A05(), A0C, r2.A00);
        }
        return A0C;
    }

    public C45292Zl(C56542sA r1, C56982ss r2, C45282Zk r3) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
