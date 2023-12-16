package X;

import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.5am  reason: invalid class name and case insensitive filesystem */
public abstract class C107145am {
    public static final Pattern A00 = Pattern.compile("à\\(s\\)");
    public static final Pattern A01 = Pattern.compile("la\\(s\\)");

    public static String A04(C620733j r14, Calendar calendar, Calendar calendar2) {
        int i;
        String str;
        Locale locale;
        String str2;
        Object[] objArr;
        String str3;
        String str4;
        String str5;
        C620733j r4 = r14;
        Calendar calendar3 = calendar2;
        Calendar calendar4 = calendar;
        if (r14.A05().A00) {
            i = 229;
            if (calendar.get(11) == calendar3.get(11)) {
                i = 230;
            }
        } else {
            int A002 = C162307rf.A00(C620733j.A02(r14));
            if (A002 == 2 || A002 == 3) {
                String A0A = r14.A0A(223);
                Object[] A0M = AnonymousClass002.A0M();
                A0M[0] = A02(r14, A0A, calendar);
                A0M[1] = A02(r14, A0A, calendar3);
                return r14.A0D(231, A0M);
            }
            i = 228;
            if (calendar.get(11) != calendar3.get(11)) {
                i = 226;
                if (calendar.get(9) == calendar3.get(9)) {
                    i = 227;
                }
            }
        }
        String A0A2 = r14.A0A(i);
        int length = A0A2.length();
        StringBuilder A0o = AnonymousClass001.A0o();
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (i2 < length) {
            char charAt = A0A2.charAt(i2);
            if (charAt == '\'') {
                z = !z;
            } else if (z || "ahHKm".indexOf(charAt) == -1) {
                A0o.append(charAt);
            } else {
                int i3 = i2;
                while (i3 < length && A0A2.charAt(i3) == charAt) {
                    i3++;
                }
                int i4 = i3 - i2;
                if (charAt == 'H') {
                    Calendar calendar5 = calendar3;
                    if (!z3) {
                        calendar5 = calendar4;
                    }
                    locale = C620733j.A02(r4);
                    if (i4 == 1) {
                        str3 = "%d";
                    } else {
                        str3 = "%02d";
                    }
                    objArr = new Object[1];
                    AnonymousClass000.A1L(objArr, calendar5.get(11));
                    str = String.format(locale, str2, objArr);
                    A0o.append(str);
                    z3 = true;
                } else if (charAt == 'K') {
                    Calendar calendar6 = calendar3;
                    if (!z3) {
                        calendar6 = calendar4;
                    }
                    int i5 = calendar6.get(10);
                    locale = C620733j.A02(r4);
                    if (i4 == 1) {
                        str2 = "%d";
                    } else {
                        str2 = "%02d";
                    }
                    objArr = new Object[1];
                    C18270x1.A1Q(objArr, i5);
                    str = String.format(locale, str2, objArr);
                    A0o.append(str);
                    z3 = true;
                } else if (charAt == 'a') {
                    Calendar calendar7 = calendar3;
                    if (!z2) {
                        calendar7 = calendar4;
                    }
                    int i6 = 220;
                    if (calendar7.get(9) == 0) {
                        i6 = 211;
                    }
                    A0o.append(r4.A0A(i6));
                    z2 = true;
                } else if (charAt == 'h') {
                    Calendar calendar8 = calendar3;
                    if (!z3) {
                        calendar8 = calendar4;
                    }
                    int i7 = calendar8.get(10);
                    if (i7 == 0) {
                        i7 = 12;
                    }
                    Locale A02 = C620733j.A02(r4);
                    if (i4 == 1) {
                        str4 = "%d";
                    } else {
                        str4 = "%02d";
                    }
                    Object[] objArr2 = new Object[1];
                    C18270x1.A1Q(objArr2, i7);
                    str = String.format(A02, str4, objArr2);
                    A0o.append(str);
                    z3 = true;
                } else if (charAt == 'm') {
                    Calendar calendar9 = calendar3;
                    if (!z4) {
                        calendar9 = calendar4;
                    }
                    Locale A022 = C620733j.A02(r4);
                    if (i4 == 1) {
                        str5 = "%d";
                    } else {
                        str5 = "%02d";
                    }
                    Object[] objArr3 = new Object[1];
                    AnonymousClass000.A1L(objArr3, calendar9.get(12));
                    A0o.append(String.format(A022, str5, objArr3));
                    z4 = true;
                }
                i2 = i3 - 1;
            }
            i2++;
        }
        return A0o.toString();
    }

    public static String A00(C620733j r1, long j) {
        Calendar instance = Calendar.getInstance(C620733j.A02(r1));
        instance.setTimeInMillis(j);
        return A03(r1, instance);
    }

    public static String A01(C620733j r3, String str, long j) {
        Matcher matcher;
        String str2;
        boolean z;
        String A07 = r3.A07();
        if (A07.equals("es")) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j);
            int i = instance.get(11);
            if (i == 1 || (i == 13 && !r3.A05().A00)) {
                matcher = A01.matcher(str);
                str2 = "la";
            } else {
                matcher = A01.matcher(str);
                str2 = "las";
            }
        } else if (!A07.equals("pt")) {
            return str;
        } else {
            Calendar instance2 = Calendar.getInstance();
            instance2.setTimeInMillis(j);
            int i2 = instance2.get(11);
            if (i2 != 0) {
                z = true;
                if (i2 != 1) {
                    if (i2 != 13) {
                        z = false;
                    } else {
                        z = true ^ r3.A05().A00;
                    }
                }
            } else {
                z = r3.A05().A00;
            }
            matcher = A00.matcher(str);
            if (z) {
                str2 = "à";
            } else {
                str2 = "às";
            }
        }
        return matcher.replaceAll(str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A02(X.C620733j r10, java.lang.String r11, java.util.Calendar r12) {
        /*
            int r6 = r11.length()
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            r3 = 0
            r9 = 0
        L_0x000a:
            if (r3 >= r6) goto L_0x0120
            char r2 = r11.charAt(r3)
            r0 = 39
            if (r2 != r0) goto L_0x0019
            r9 = r9 ^ 1
        L_0x0016:
            int r3 = r3 + 1
            goto L_0x000a
        L_0x0019:
            if (r9 != 0) goto L_0x011b
            java.lang.String r0 = "aBhHKm"
            int r1 = r0.indexOf(r2)
            r0 = -1
            if (r1 == r0) goto L_0x011b
            r4 = r3
        L_0x0025:
            if (r4 >= r6) goto L_0x0030
            char r0 = r11.charAt(r4)
            if (r0 != r2) goto L_0x0030
            int r4 = r4 + 1
            goto L_0x0025
        L_0x0030:
            int r1 = r4 - r3
            r0 = 66
            if (r2 == r0) goto L_0x00b8
            r0 = 72
            if (r2 == r0) goto L_0x00a7
            r0 = 75
            if (r2 == r0) goto L_0x008b
            r0 = 97
            if (r2 == r0) goto L_0x00d6
            r0 = 104(0x68, float:1.46E-43)
            if (r2 == r0) goto L_0x006b
            r0 = 109(0x6d, float:1.53E-43)
            if (r2 != r0) goto L_0x0065
            java.util.Locale r3 = X.C620733j.A02(r10)
            r0 = 1
            if (r1 != r0) goto L_0x0068
            java.lang.String r2 = "%d"
        L_0x0053:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 12
        L_0x0057:
            int r0 = r12.get(r0)
            X.AnonymousClass000.A1L(r1, r0)
            java.lang.String r0 = java.lang.String.format(r3, r2, r1)
        L_0x0062:
            r5.append(r0)
        L_0x0065:
            int r3 = r4 + -1
            goto L_0x0016
        L_0x0068:
            java.lang.String r2 = "%02d"
            goto L_0x0053
        L_0x006b:
            r0 = 10
            int r3 = r12.get(r0)
            if (r3 != 0) goto L_0x0075
            r3 = 12
        L_0x0075:
            java.util.Locale r2 = X.C620733j.A02(r10)
            r0 = 1
            if (r1 != r0) goto L_0x0088
            java.lang.String r1 = "%d"
        L_0x007e:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            X.C18270x1.A1Q(r0, r3)
            java.lang.String r0 = java.lang.String.format(r2, r1, r0)
            goto L_0x0062
        L_0x0088:
            java.lang.String r1 = "%02d"
            goto L_0x007e
        L_0x008b:
            r0 = 10
            int r3 = r12.get(r0)
            java.util.Locale r2 = X.C620733j.A02(r10)
            r0 = 1
            if (r1 != r0) goto L_0x00a4
            java.lang.String r1 = "%d"
        L_0x009a:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            X.C18270x1.A1Q(r0, r3)
            java.lang.String r0 = java.lang.String.format(r2, r1, r0)
            goto L_0x0062
        L_0x00a4:
            java.lang.String r1 = "%02d"
            goto L_0x009a
        L_0x00a7:
            java.util.Locale r3 = X.C620733j.A02(r10)
            r0 = 1
            if (r1 != r0) goto L_0x00b5
            java.lang.String r2 = "%d"
        L_0x00b0:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 11
            goto L_0x0057
        L_0x00b5:
            java.lang.String r2 = "%02d"
            goto L_0x00b0
        L_0x00b8:
            java.util.Locale r2 = X.C620733j.A02(r10)
            java.lang.String r0 = r2.toLanguageTag()
            X.05C r1 = X.AnonymousClass77X.A00
            java.lang.Object r8 = r1.get(r0)
            X.7Kk r8 = (X.C148967Kk) r8
            if (r8 != 0) goto L_0x00e8
            java.lang.String r0 = r2.getLanguage()
            java.lang.Object r8 = r1.get(r0)
            X.7Kk r8 = (X.C148967Kk) r8
            if (r8 != 0) goto L_0x00e8
        L_0x00d6:
            r0 = 9
            int r1 = r12.get(r0)
            r0 = 220(0xdc, float:3.08E-43)
            if (r1 != 0) goto L_0x00e2
            r0 = 211(0xd3, float:2.96E-43)
        L_0x00e2:
            java.lang.String r0 = r10.A0A(r0)
            goto L_0x0062
        L_0x00e8:
            r0 = 11
            int r7 = r12.get(r0)
            r0 = 12
            int r0 = r12.get(r0)
            if (r0 != 0) goto L_0x0111
            int[] r3 = r8.A00
            if (r3 == 0) goto L_0x0111
            int[] r2 = r8.A01
            if (r2 == 0) goto L_0x0111
            r1 = 0
        L_0x00ff:
            int r0 = r3.length
            if (r1 >= r0) goto L_0x0111
            r0 = r3[r1]
            if (r0 != r7) goto L_0x010e
            r0 = r2[r1]
            java.lang.String r0 = r10.A0A(r0)
            goto L_0x0062
        L_0x010e:
            int r1 = r1 + 1
            goto L_0x00ff
        L_0x0111:
            int[] r0 = r8.A02
            r0 = r0[r7]
            java.lang.String r0 = r10.A0A(r0)
            goto L_0x0062
        L_0x011b:
            r5.append(r2)
            goto L_0x0016
        L_0x0120:
            java.lang.String r0 = r5.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107145am.A02(X.33j, java.lang.String, java.util.Calendar):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r1 == 3) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A03(X.C620733j r3, java.util.Calendar r4) {
        /*
            X.5Ki r0 = r3.A05()
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0013
            r2 = 225(0xe1, float:3.15E-43)
        L_0x000a:
            java.lang.String r0 = r3.A0A(r2)
            java.lang.String r0 = A02(r3, r0, r4)
            return r0
        L_0x0013:
            java.util.Locale r0 = X.C620733j.A02(r3)
            int r1 = X.C162307rf.A00(r0)
            r0 = 2
            if (r1 == r0) goto L_0x0023
            r0 = 3
            r2 = 224(0xe0, float:3.14E-43)
            if (r1 != r0) goto L_0x000a
        L_0x0023:
            r2 = 223(0xdf, float:3.12E-43)
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107145am.A03(X.33j, java.util.Calendar):java.lang.String");
    }
}
