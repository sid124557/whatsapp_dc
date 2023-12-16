package X;

import java.util.regex.Pattern;

/* renamed from: X.7qC  reason: invalid class name and case insensitive filesystem */
public final class C161667qC {
    public static final Pattern A02 = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public final C161467pi A00 = new C161467pi();
    public final StringBuilder A01 = AnonymousClass001.A0o();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r2 == '_') goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        if (r2 != '.') goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        if (r2 <= r1) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(X.C161467pi r7, java.lang.StringBuilder r8) {
        /*
            r5 = 0
            r8.setLength(r5)
            int r4 = r7.A01
            r6 = r4
            int r3 = r7.A00
        L_0x0009:
            if (r4 >= r3) goto L_0x0041
            if (r5 != 0) goto L_0x0041
            byte[] r0 = r7.A02
            byte r0 = r0[r4]
            char r2 = (char) r0
            r0 = 65
            if (r2 < r0) goto L_0x002a
            r0 = 90
            if (r2 <= r0) goto L_0x0024
            r0 = 97
            r1 = 122(0x7a, float:1.71E-43)
            if (r2 >= r0) goto L_0x003e
            r0 = 95
            if (r2 != r0) goto L_0x003c
        L_0x0024:
            int r4 = r4 + 1
            r8.append(r2)
            goto L_0x0009
        L_0x002a:
            r0 = 48
            r1 = 57
            if (r2 >= r0) goto L_0x003e
            r0 = 35
            if (r2 == r0) goto L_0x0024
            r0 = 45
            if (r2 == r0) goto L_0x0024
            r0 = 46
            if (r2 == r0) goto L_0x0024
        L_0x003c:
            r5 = 1
            goto L_0x0009
        L_0x003e:
            if (r2 <= r1) goto L_0x0024
            goto L_0x003c
        L_0x0041:
            int r4 = r4 - r6
            r7.A0T(r4)
            java.lang.String r0 = r8.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161667qC.A00(X.7pi, java.lang.StringBuilder):java.lang.String");
    }

    public static void A02(C161467pi r8) {
        while (true) {
            boolean z = true;
            while (true) {
                int i = r8.A00;
                int i2 = r8.A01;
                if (i - i2 > 0 && z) {
                    byte[] bArr = r8.A02;
                    byte b = bArr[i2];
                    char c = (char) b;
                    if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
                        r8.A0T(1);
                    } else {
                        if (i2 + 2 <= i) {
                            int i3 = i2 + 1;
                            if (b == 47) {
                                int i4 = i3 + 1;
                                if (bArr[i3] == 42) {
                                    while (true) {
                                        int i5 = i4 + 1;
                                        if (i5 >= i) {
                                            break;
                                        } else if (((char) bArr[i4]) == '*' && ((char) bArr[i5]) == '/') {
                                            i4 = i5 + 1;
                                            i = i4;
                                        } else {
                                            i4 = i5;
                                        }
                                    }
                                    r8.A0T(i - i2);
                                }
                            } else {
                                continue;
                            }
                        }
                        z = false;
                    }
                } else {
                    return;
                }
            }
            r8.A0T(1);
        }
    }

    public static String A01(C161467pi r3, StringBuilder sb) {
        A02(r3);
        if (C161467pi.A00(r3) == 0) {
            return null;
        }
        String A002 = A00(r3, sb);
        if (!"".equals(A002)) {
            return A002;
        }
        return AnonymousClass001.A0j(AnonymousClass000.A0l(""), (char) r3.A0C());
    }
}
