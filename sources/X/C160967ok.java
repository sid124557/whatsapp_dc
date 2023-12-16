package X;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7ok  reason: invalid class name and case insensitive filesystem */
public final class C160967ok {
    public static final Map A00(C138956rH r6) {
        C34801vq r1;
        HashMap A0t = AnonymousClass001.A0t();
        A0t.put(C373621y.SUCCESS_FLAG.key, Boolean.TRUE);
        C138626qj r0 = (C138626qj) ((C138746qv) r6.A00).A03;
        if (!(r0 == null || (r1 = (C34801vq) r0.A00) == null)) {
            String str = C373621y.SCREEN_DATA.key;
            Object A01 = C159957ml.A01(r1.A00).A01("$", new C181468mo[0]);
            C162457s7.A0D(A01);
            A0t.put(str, A01);
        }
        return A0t;
    }

    public static final void A02(C161447pg r2, C138956rH r3) {
        C138626qj r0 = (C138626qj) ((C138746qv) r3.A00).A01;
        if (r0 != null) {
            for (C138816r3 r02 : (Iterable) ((C138626qj) r0.A00).A00) {
                C162457s7.A0H(r02);
                r2.A0C(r02);
            }
        }
    }

    public static final void A03(C161447pg r6, C138956rH r7, String str) {
        C138966rI r2;
        C138626qj r0 = (C138626qj) ((C138746qv) r7.A00).A04;
        if (!(r0 == null || (r2 = (C138966rI) r0.A00) == null)) {
            r6.A0F(r6.A03(r2, str));
            C159127lA r5 = r6.A00;
            if (r5 != null) {
                String str2 = r2.A01;
                C162457s7.A0D(str2);
                long size = (long) ((List) r2.A00).size();
                C151217Tw r02 = r5.A01;
                if (r02 == null) {
                    throw C18270x1.A0S("flowManager");
                }
                ((Deque) C162457s7.A03(r02.A04)).addLast(str2);
                AnonymousClass1j2 r4 = r5.A0M;
                r4.A00(r5.A00, "queueStates");
                r4.A02(r5.A00, "num_states_queued", size);
                r5.A01();
            }
        }
        A02(r6, r7);
    }

    public static final Map A01(Integer num, String str, String str2, Map map) {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C373621y.SUCCESS_FLAG.key, Boolean.FALSE);
        LinkedHashMap A0r2 = C18320x8.A0r();
        String str3 = C373621y.ERROR_NAME.key;
        if (str == null) {
            str = "";
        }
        A0r2.put(str3, str);
        if (num != null) {
            A0r2.put(C373621y.ERROR_CODE.key, Integer.valueOf(num.intValue()));
        }
        if (str2 != null) {
            A0r2.put(C373621y.ERROR_MESSAGE.key, str2);
        }
        if (map != null) {
            A0r2.put(C373621y.ERROR_PARAMS.key, map);
        }
        A0r.put(C373621y.ERROR.key, A0r2);
        return A0r;
    }
}
