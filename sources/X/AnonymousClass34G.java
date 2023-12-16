package X;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.34G  reason: invalid class name */
public final class AnonymousClass34G {
    public static int A00 = -1;

    public static int A01(C620633i r5, C60152y5 r6) {
        int i = A00;
        if (i != -1) {
            return i;
        }
        synchronized (AnonymousClass34G.class) {
            SharedPreferences A03 = r6.A03(C58152un.A0A);
            int i2 = A03.getInt("year_class_cached_value_pref", -1);
            if (i2 == -1) {
                int A002 = A00(r5);
                C18270x1.A0h(A03.edit(), "year_class_cached_value_pref", A002);
                A00 = A002;
                return A002;
            }
            A00 = i2;
            return i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (X.AnonymousClass35D.A00() < 1800000) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A02(X.C620633i r8, X.C60152y5 r9) {
        /*
            java.lang.String r0 = X.C58152un.A0A
            android.content.SharedPreferences r4 = r9.A03(r0)
            java.lang.String r3 = "year_class_cached_value_2016_pref"
            r1 = -1
            int r0 = r4.getInt(r3, r1)
            if (r0 != r1) goto L_0x0085
            long r6 = X.AnonymousClass35D.A02(r8)
            r1 = -1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0026
            int r5 = A00(r8)
        L_0x001e:
            android.content.SharedPreferences$Editor r0 = r4.edit()
            X.C18270x1.A0h(r0, r3, r5)
            return r5
        L_0x0026:
            r1 = 805306368(0x30000000, double:3.97874211E-315)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0039
            int r1 = X.AnonymousClass35D.A01()
            r0 = 1
            r5 = 2010(0x7da, float:2.817E-42)
            if (r1 > r0) goto L_0x001e
            r5 = 2009(0x7d9, float:2.815E-42)
            goto L_0x001e
        L_0x0039:
            r1 = 1073741824(0x40000000, double:5.304989477E-315)
            r5 = 2012(0x7dc, float:2.82E-42)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x004e
            int r1 = X.AnonymousClass35D.A00()
            r0 = 1300000(0x13d620, float:1.821688E-39)
            if (r1 >= r0) goto L_0x001e
            r5 = 2011(0x7db, float:2.818E-42)
            goto L_0x001e
        L_0x004e:
            r1 = 1610612736(0x60000000, double:7.957484216E-315)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x005f
            int r1 = X.AnonymousClass35D.A00()
            r0 = 1800000(0x1b7740, float:2.522337E-39)
            if (r1 >= r0) goto L_0x0082
            goto L_0x001e
        L_0x005f:
            r1 = 2147483648(0x80000000, double:1.0609978955E-314)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0082
            r1 = 3221225472(0xc0000000, double:1.591496843E-314)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0074
            r5 = 2014(0x7de, float:2.822E-42)
            goto L_0x001e
        L_0x0074:
            r1 = 5368709120(0x140000000, double:2.6524947387E-314)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            r5 = 2016(0x7e0, float:2.825E-42)
            if (r0 > 0) goto L_0x001e
            r5 = 2015(0x7df, float:2.824E-42)
            goto L_0x001e
        L_0x0082:
            r5 = 2013(0x7dd, float:2.821E-42)
            goto L_0x001e
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass34G.A02(X.33i, X.2y5):int");
    }

    public static int A00(C620633i r6) {
        int i;
        int i2;
        ArrayList A0s = AnonymousClass001.A0s();
        int A01 = AnonymousClass35D.A01();
        if (A01 >= 1) {
            int i3 = 2008;
            if (A01 != 1) {
                i3 = 2012;
                if (A01 <= 3) {
                    i3 = 2011;
                }
            }
            C18270x1.A1K(A0s, i3);
        }
        long A002 = (long) AnonymousClass35D.A00();
        if (A002 != -1) {
            if (A002 <= 528000) {
                i2 = 2008;
            } else if (A002 <= 620000) {
                i2 = 2009;
            } else if (A002 <= 1020000) {
                i2 = 2010;
            } else if (A002 <= 1220000) {
                i2 = 2011;
            } else if (A002 <= 1520000) {
                i2 = 2012;
            } else {
                i2 = 2014;
                if (A002 <= 2020000) {
                    i2 = 2013;
                }
            }
            C18270x1.A1K(A0s, i2);
        }
        long A02 = AnonymousClass35D.A02(r6);
        if (A02 > 0) {
            if (A02 <= 201326592) {
                i = 2008;
            } else if (A02 <= 304087040) {
                i = 2009;
            } else if (A02 <= 536870912) {
                i = 2010;
            } else if (A02 <= 1073741824) {
                i = 2011;
            } else if (A02 <= 1610612736) {
                i = 2012;
            } else {
                i = 2014;
                if (A02 <= 2147483648L) {
                    i = 2013;
                }
            }
            C18270x1.A1K(A0s, i);
        }
        if (A0s.isEmpty()) {
            return -1;
        }
        Collections.sort(A0s);
        int size = A0s.size() & 1;
        int size2 = A0s.size() / 2;
        if (size == 1) {
            return AnonymousClass001.A0K(A0s.get(size2));
        }
        int i4 = size2 - 1;
        return AnonymousClass001.A0K(A0s.get(i4)) + ((AnonymousClass001.A0K(A0s.get(i4 + 1)) - AnonymousClass001.A0K(A0s.get(i4))) / 2);
    }
}
