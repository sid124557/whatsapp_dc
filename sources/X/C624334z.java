package X;

/* renamed from: X.34z  reason: invalid class name and case insensitive filesystem */
public class C624334z {
    public static long A00(String[] strArr, int i) {
        if (strArr.length > i) {
            return C615531h.A04(strArr[i], 0);
        }
        return 0;
    }

    public static Boolean A01(String[] strArr, int i) {
        if (strArr.length > i) {
            String str = strArr[i];
            if (!"null".equals(str)) {
                return Boolean.valueOf(Boolean.parseBoolean(str));
            }
        }
        return null;
    }

    public static Integer A02(String[] strArr) {
        if (strArr.length > 1) {
            String str = strArr[1];
            if (!"null".equals(str)) {
                return Integer.valueOf(C615531h.A01(str, 0));
            }
        }
        return null;
    }

    public static Long A04(String[] strArr, int i) {
        if (strArr.length > i) {
            String str = strArr[i];
            if (!"null".equals(str)) {
                return Long.valueOf(C615531h.A03(str));
            }
        }
        return null;
    }

    public static Long A03(Long l, long j) {
        long longValue;
        if (l == null) {
            longValue = 0;
        } else {
            longValue = l.longValue();
        }
        return Long.valueOf(longValue + j);
    }
}
