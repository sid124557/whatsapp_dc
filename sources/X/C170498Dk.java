package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.8Dk  reason: invalid class name and case insensitive filesystem */
public class C170498Dk implements C181488mq {
    public Object BGp(C172478Lh r4, C158627kI r5, Object obj, String str, List list) {
        int BJg;
        if (list != null && list.size() > 0) {
            C131616ds r1 = ((C161297pO) list.get(0)).A02.A00;
            boolean z = r1.A01 instanceof C131606dr;
            C153617bf r12 = r1;
            if (!z) {
                while (true) {
                    C153617bf r13 = r12.A01;
                    if (r13 == null) {
                        break;
                    }
                    C153617bf r0 = r13.A01;
                    r12 = r13;
                    if (r0 == null) {
                        r13.A01 = new C131586dp();
                        break;
                    }
                }
            }
            C151637Vo r02 = ((C161297pO) list.get(0)).A02;
            AnonymousClass7TV r14 = r5.A01;
            Object A00 = r02.A00(r14, obj, obj).A00();
            C187038wL r15 = r14.A00;
            if (A00 instanceof List) {
                BJg = r15.BJg(A00);
                return Integer.valueOf(BJg);
            }
        }
        C187038wL r16 = r5.A01.A00;
        if (!(obj instanceof List) && !(obj instanceof Map)) {
            return null;
        }
        BJg = r16.BJg(obj);
        return Integer.valueOf(BJg);
    }
}
