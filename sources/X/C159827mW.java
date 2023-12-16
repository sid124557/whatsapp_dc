package X;

import java.util.regex.Pattern;

/* renamed from: X.7mW  reason: invalid class name and case insensitive filesystem */
public class C159827mW {
    public static final String A00;
    public static final Pattern A01 = Pattern.compile("[#0,.-]+");

    public static String A01(C149447Mm r3, C157407iF r4, C157407iF r5, C157407iF r6, C157407iF r7, String str, String str2, String str3, String str4) {
        String replaceFirst;
        String str5;
        if (r3.A03) {
            replaceFirst = r3.A01;
            str5 = A01.matcher(r3.A02).replaceFirst(str4);
        } else {
            replaceFirst = A01.matcher(r3.A01).replaceFirst(str4);
            str5 = r3.A02;
        }
        if (!replaceFirst.isEmpty() && r7.A00(replaceFirst.codePointBefore(replaceFirst.length())) && r6.A00(str3.codePointAt(0))) {
            replaceFirst = AnonymousClass000.A0T(replaceFirst, str2);
        }
        if (!str5.isEmpty() && r5.A00(str5.codePointAt(0)) && r4.A00(str3.codePointBefore(str3.length()))) {
            str5 = AnonymousClass000.A0T(str, str5);
        }
        return C18260x0.A06(replaceFirst, str3, str5);
    }

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("¤");
        A0o.append(C58152un.A09);
        A00 = AnonymousClass000.A0X("#,##0.00", A0o);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r0 == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass7T2 A00(X.C620733j r2, boolean r3) {
        /*
            java.util.Locale r0 = X.C620733j.A02(r2)
            java.lang.String r1 = X.C162307rf.A03(r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case 1632: goto L_0x0022;
                case 1776: goto L_0x002c;
                case 2406: goto L_0x0036;
                case 2534: goto L_0x0040;
                default: goto L_0x000f;
            }
        L_0x000f:
            r1 = 5
        L_0x0010:
            java.lang.String r1 = r2.A0A(r1)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x001c
            java.lang.String r1 = A00
        L_0x001c:
            X.7T2 r0 = new X.7T2
            r0.<init>(r1, r3)
            return r0
        L_0x0022:
            java.lang.String r0 = "٠"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            r1 = 1
            goto L_0x0010
        L_0x002c:
            java.lang.String r0 = "۰"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            r1 = 2
            goto L_0x0010
        L_0x0036:
            java.lang.String r0 = "०"
            boolean r0 = r1.equals(r0)
            r1 = 4
            if (r0 != 0) goto L_0x0010
            goto L_0x000f
        L_0x0040:
            java.lang.String r0 = "০"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            r1 = 3
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159827mW.A00(X.33j, boolean):X.7T2");
    }
}
