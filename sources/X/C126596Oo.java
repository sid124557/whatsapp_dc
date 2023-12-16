package X;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* renamed from: X.6Oo  reason: invalid class name and case insensitive filesystem */
public final class C126596Oo extends AnonymousClass7VC {
    public long A00 = -9223372036854775807L;
    public long[] A01 = new long[0];
    public long[] A02 = new long[0];

    public C126596Oo() {
        super(new C1687786s());
    }

    public static Object A00(C161467pi r4, int i) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(r4.A0H()));
        }
        if (i == 1) {
            return Boolean.valueOf(AnonymousClass6C9.A1M(r4.A0C()));
        }
        if (i == 2) {
            return A01(r4);
        }
        if (i == 3) {
            HashMap A0t = AnonymousClass001.A0t();
            while (true) {
                String A012 = A01(r4);
                int A0C = r4.A0C();
                if (A0C == 9) {
                    return A0t;
                }
                Object A002 = A00(r4, A0C);
                if (A002 != null) {
                    A0t.put(A012, A002);
                }
            }
        } else if (i == 8) {
            return A02(r4);
        } else {
            if (i == 10) {
                int A0E = r4.A0E();
                ArrayList A0I = AnonymousClass002.A0I(A0E);
                for (int i2 = 0; i2 < A0E; i2++) {
                    Object A003 = A00(r4, r4.A0C());
                    if (A003 != null) {
                        A0I.add(A003);
                    }
                }
                return A0I;
            } else if (i != 11) {
                return null;
            } else {
                Date date = new Date((long) Double.longBitsToDouble(r4.A0H()));
                r4.A0T(2);
                return date;
            }
        }
    }

    public static String A01(C161467pi r4) {
        int A0F = r4.A0F();
        int i = r4.A01;
        r4.A0T(A0F);
        return new String(r4.A02, i, A0F);
    }

    public static HashMap A02(C161467pi r5) {
        int A0E = r5.A0E();
        HashMap hashMap = new HashMap(A0E);
        for (int i = 0; i < A0E; i++) {
            String A012 = A01(r5);
            Object A002 = A00(r5, r5.A0C());
            if (A002 != null) {
                hashMap.put(A012, A002);
            }
        }
        return hashMap;
    }
}
