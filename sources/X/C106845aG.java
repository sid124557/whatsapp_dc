package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5aG  reason: invalid class name and case insensitive filesystem */
public class C106845aG {
    public static double A01(List list, int i) {
        long A0B = C18310x6.A0B(list.get(0));
        long A0B2 = C18310x6.A0B(list.get(1));
        long j = (long) (2 << (i - 1));
        double d = 360.0d / ((double) j);
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(Double.valueOf(A00(A0B2, j, true)));
        A0s.add(Double.valueOf((((double) A0B) * d) - 180.0d));
        A0s.add(Double.valueOf(A00(A0B2, j, false)));
        A0s.add(Double.valueOf((d * ((double) (A0B + 1))) - 180.0d));
        return (double) (C1451974o.A00(C86624Kv.A0H((Number) A0s.get(1), ((Number) A0s.get(0)).doubleValue()), C86624Kv.A0H((Number) A0s.get(3), ((Number) A0s.get(2)).doubleValue())) / 2.0f);
    }

    public static double A00(long j, long j2, boolean z) {
        if (z) {
            j++;
        }
        double exp = Math.exp((((((double) j) * 1.0d) / ((double) j2)) - 0.5d) * 4.0d * 3.141592653589793d);
        return -((Math.asin((exp - 1.0d) / (exp + 1.0d)) * 180.0d) / 3.141592653589793d);
    }

    public static ArrayList A03(double d, double d2, int i) {
        if (i <= 0 || d < -85.05112878d || d > 85.05112878d || d2 < -180.0d || d2 > 180.0d) {
            return null;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        long j = (long) (2 << (i - 1));
        double d3 = (double) j;
        A0s.add(Long.valueOf((long) Math.min(Math.max(((d2 + 180.0d) / 360.0d) * d3, 0.0d), (double) (j - 1))));
        double sin = Math.sin((Math.min(Math.max(d, -85.05112878d), 85.05112878d) * 3.141592653589793d) / 180.0d);
        A0s.add(Long.valueOf((long) Math.min(Math.max((0.5d - (Math.log((sin + 1.0d) / (1.0d - sin)) / 12.566370614359172d)) * d3, 0.0d), d3 - 1.0d)));
        return A0s;
    }

    public static ArrayList A04(int i, long j, long j2) {
        long j3 = (long) (2 << (i - 1));
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(Double.valueOf((A00(j2, j3, true) + A00(j2, j3, false)) / 2.0d));
        A0s.add(Double.valueOf(((360.0d / ((double) j3)) * (((double) j) + 0.5d)) - 180.0d));
        return A0s;
    }

    public static String A02(Long l, Long l2, int i) {
        StringBuilder A0o = AnonymousClass001.A0o();
        while (i > 0) {
            long j = (long) (1 << (i - 1));
            char c = '0';
            if ((l.longValue() & j) != 0) {
                c = (char) 49;
            }
            if ((l2.longValue() & j) != 0) {
                c = (char) (((char) (c + 1)) + 1);
            }
            A0o.append(c);
            i--;
        }
        return A0o.toString();
    }
}
