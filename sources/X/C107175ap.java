package X;

import android.text.format.Time;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.util.Calendar;

/* renamed from: X.5ap  reason: invalid class name and case insensitive filesystem */
public final class C107175ap {
    public static final AnonymousClass7VL A00 = new AnonymousClass90C(3);
    public static final AnonymousClass7VL A01 = new AnonymousClass90C(0);
    public static final AnonymousClass7VL A02 = new AnonymousClass90C(4);
    public static final AnonymousClass7VL A03 = new AnonymousClass90C(2);
    public static final AnonymousClass7VL A04 = new AnonymousClass90C(1);

    public static int A00(long j, long j2) {
        Time time = new Time();
        time.set(j);
        Time time2 = new Time();
        time2.set(j2);
        return ((int) ((j + (time.gmtoff * 1000)) / 86400000)) - ((int) ((j2 + (time2.gmtoff * 1000)) / 86400000));
    }

    public static String A03(long j) {
        return C86624Kv.A0c((DateFormat) A01.A01(), j);
    }

    public static String A04(C620733j r1, String str, String str2) {
        String A0A = r1.A0A(180);
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass000.A16(str2, str, A0M);
        return MessageFormat.format(A0A, A0M);
    }

    public static boolean A05(long j, long j2) {
        Calendar calendar = (Calendar) A04.A01();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = (Calendar) A03.A01();
        calendar2.setTimeInMillis(j2);
        if (calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5)) {
            return true;
        }
        return false;
    }

    public static boolean A06(long j, long j2) {
        Calendar calendar = (Calendar) A04.A01();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = (Calendar) A03.A01();
        calendar2.setTimeInMillis(j2);
        if (calendar.get(1) != calendar2.get(1)) {
            return false;
        }
        return true;
    }

    public static long A01(long j) {
        return (A02(j) - System.currentTimeMillis()) + 1000;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long A02(long r9) {
        /*
            long r7 = X.AnonymousClass0x9.A05(r9)
            r5 = 0
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x003b
            r3 = 60000(0xea60, double:2.9644E-319)
        L_0x0010:
            long r7 = r7 / r3
            long r7 = r7 * r3
            long r9 = r9 + r7
            long r9 = r9 + r3
        L_0x0014:
            java.util.GregorianCalendar r2 = new java.util.GregorianCalendar
            r2.<init>()
            r1 = 5
            r0 = 1
            r2.add(r1, r0)
            r0 = 11
            r1 = 0
            r2.set(r0, r1)
            r0 = 12
            r2.set(r0, r1)
            r0 = 13
            r2.set(r0, r1)
            long r1 = r2.getTimeInMillis()
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x003a
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0045
        L_0x003a:
            return r1
        L_0x003b:
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0010
            r9 = 0
            goto L_0x0014
        L_0x0045:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107175ap.A02(long):long");
    }
}
