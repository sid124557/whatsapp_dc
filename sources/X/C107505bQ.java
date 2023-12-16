package X;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: X.5bQ  reason: invalid class name and case insensitive filesystem */
public final class C107505bQ {
    public static volatile DateFormat A00;
    public static volatile DateFormat A01;
    public static volatile DateFormat[] A02;

    public static String A05(C620733j r1, long j) {
        return C86624Kv.A0c(A09(r1, 0), j);
    }

    public static String A02(C620733j r3, long j) {
        DateFormat dateFormat = r3.A03;
        if (dateFormat == null) {
            Locale A022 = C620733j.A02(r3);
            dateFormat = new SimpleDateFormat(android.text.format.DateFormat.getBestDateTimePattern(A022, "MMMd"), A022);
            r3.A03 = dateFormat;
        }
        return C86624Kv.A0c((DateFormat) dateFormat.clone(), j);
    }

    public static String A03(C620733j r2, long j) {
        if (A01 == null) {
            A01 = DateFormat.getDateInstance(2, C620733j.A02(r2));
        }
        return C86624Kv.A0c((DateFormat) A01.clone(), j);
    }

    public static String A04(C620733j r1, long j) {
        return C86614Ku.A0v(r1, 172, j);
    }

    public static String A06(C620733j r2, long j) {
        if (A00 == null) {
            A00 = DateFormat.getDateInstance(3, C620733j.A02(r2));
        }
        return C86624Kv.A0c((DateFormat) A00.clone(), j);
    }

    public static DateFormat A08(C620733j r5) {
        String[] A002;
        SimpleDateFormat simpleDateFormat;
        DateFormat dateFormat = r5.A02;
        SimpleDateFormat simpleDateFormat2 = dateFormat;
        if (dateFormat == null) {
            Locale A022 = C620733j.A02(r5);
            String A0A = r5.A0A(174);
            if (A0A.contains("MMMM")) {
                A002 = C159777mR.A01(r5, 0);
            } else if (A0A.contains("LLLL")) {
                A0A = A0A.replace("LLLL", "MMMM");
                A002 = C159777mR.A00(r5);
            } else {
                simpleDateFormat = new SimpleDateFormat(A0A, A022);
                r5.A02 = simpleDateFormat;
                simpleDateFormat2 = simpleDateFormat;
            }
            SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(A0A, A022);
            DateFormatSymbols dateFormatSymbols = simpleDateFormat3.getDateFormatSymbols();
            dateFormatSymbols.setMonths(A002);
            simpleDateFormat3.setDateFormatSymbols(dateFormatSymbols);
            simpleDateFormat = simpleDateFormat3;
            r5.A02 = simpleDateFormat;
            simpleDateFormat2 = simpleDateFormat;
        }
        return (DateFormat) simpleDateFormat2.clone();
    }

    public static DateFormat A09(C620733j r4, int i) {
        if (A02 == null) {
            Locale A022 = C620733j.A02(r4);
            String A0A = r4.A0A(169);
            SimpleDateFormat[] simpleDateFormatArr = new SimpleDateFormat[3];
            A0A(r4, A0A, A022, simpleDateFormatArr, 0);
            A0A(r4, A0A, A022, simpleDateFormatArr, 1);
            A0A(r4, A0A, A022, simpleDateFormatArr, 2);
            A02 = simpleDateFormatArr;
        }
        return (DateFormat) A02[i].clone();
    }

    public static String A00(C620733j r2) {
        return A07(C620733j.A02(r2), r2.A0A(298));
    }

    public static String A01(C620733j r3, int i) {
        int i2;
        switch (i) {
            case 1:
                i2 = 205;
                break;
            case 2:
                i2 = 203;
                break;
            case 3:
                i2 = 207;
                break;
            case 4:
                i2 = 208;
                break;
            case 5:
                i2 = 206;
                break;
            case 6:
                i2 = 202;
                break;
            case 7:
                i2 = 204;
                break;
            default:
                throw new AssertionError("Unreachable code");
        }
        String A0A = r3.A0A(i2);
        if ("titlecase-firstword".equals(r3.A0A(274))) {
            return A07(C620733j.A02(r3), A0A);
        }
        return A0A;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r3 == 105) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A07(java.util.Locale r4, java.lang.String r5) {
        /*
            int r1 = r5.length()
            if (r1 != 0) goto L_0x0007
            return r5
        L_0x0007:
            java.lang.String r4 = r4.getLanguage()
            r0 = 0
            int r3 = r5.codePointAt(r0)
            r0 = 105(0x69, float:1.47E-43)
            if (r3 != r0) goto L_0x003a
            java.lang.String r0 = "tr"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = "az"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x003c
        L_0x0024:
            r0 = 304(0x130, float:4.26E-43)
        L_0x0026:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            r1.appendCodePoint(r0)
            int r0 = java.lang.Character.charCount(r3)
            java.lang.String r0 = r5.substring(r0)
        L_0x0035:
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            return r0
        L_0x003a:
            if (r3 != r0) goto L_0x005e
        L_0x003c:
            r2 = 2
            if (r1 < r2) goto L_0x005e
            r0 = 1
            char r1 = r5.charAt(r0)
            r0 = 106(0x6a, float:1.49E-43)
            if (r1 != r0) goto L_0x005e
            java.lang.String r0 = "nl"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x005e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "IJ"
            r1.append(r0)
            java.lang.String r0 = r5.substring(r2)
            goto L_0x0035
        L_0x005e:
            int r0 = java.lang.Character.toTitleCase(r3)
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107505bQ.A07(java.util.Locale, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0A(X.C620733j r2, java.lang.String r3, java.util.Locale r4, java.lang.Object[] r5, int r6) {
        /*
            java.lang.String[] r2 = X.C159777mR.A01(r2, r6)
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r3, r4)
            java.text.DateFormatSymbols r0 = r1.getDateFormatSymbols()
            r0.setMonths(r2)
            r1.setDateFormatSymbols(r0)
            r5[r6] = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107505bQ.A0A(X.33j, java.lang.String, java.util.Locale, java.lang.Object[], int):void");
    }
}
