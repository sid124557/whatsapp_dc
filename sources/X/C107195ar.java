package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: X.5ar  reason: invalid class name and case insensitive filesystem */
public class C107195ar {
    public static int A00(C106175Xx r9, String str, String str2) {
        try {
            int length = str.length();
            if (length < 1 || length > 3) {
                C18260x0.A0t("enterphone/cc/bad-length cc=", str, AnonymousClass001.A0o());
                return 2;
            }
            try {
                if (AnonymousClass79A.A01.indexOfKey(Integer.parseInt(str)) >= 0) {
                    if (str2 == null || str2.length() == 0 || str2.replaceAll("\\D", "").length() == 0) {
                        C18260x0.A0t("enterphone/num/error/empty cc=", str, AnonymousClass001.A0o());
                        return 4;
                    }
                    int parseInt = Integer.parseInt(str);
                    String A02 = r9.A02(parseInt, str2.replaceAll("\\D", ""));
                    int length2 = A02.length();
                    r9.A05();
                    Iterator it = r9.A01.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C103905Ow r1 = (C103905Ow) it.next();
                        if (r1.A00 == parseInt) {
                            int A00 = r1.A00(length2);
                            if (A00 != 0) {
                                if (A00 < 0) {
                                    return 5;
                                }
                                return 6;
                            }
                        }
                    }
                    int i = length + length2;
                    if (i <= 15 && i >= 8) {
                        return 1;
                    }
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("enterphone/num/error/length cc=");
                    A0o.append(str);
                    C18260x0.A0t(" ph=", A02, A0o);
                    return 7;
                }
            } catch (NumberFormatException unused) {
            }
            C18260x0.A0t("enterphone/cc/bad-name ", str, AnonymousClass001.A0o());
            return 3;
        } catch (IOException e) {
            Log.e("enterphone/error trimLeadingZero or nativeNameFromCallingCode from CountryPhoneInfo IOException", e);
            return 7;
        }
    }

    public static String A03(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("\\D", "");
    }

    public static int A01(C106175Xx r3, String str, String str2) {
        int A00 = A00(r3, str, str2);
        if (A00 != 7 && A00 != 5 && A00 != 6) {
            return A00;
        }
        int length = str.length() + str2.length();
        if (length > 17 || length < 6) {
            C18260x0.A0t("enterphone/num/allow-landline/error/length input=", str2, AnonymousClass001.A0o());
            return 7;
        }
        C18260x0.A0s("enterphone/num/allow-landline/ok/length input=", str2, AnonymousClass001.A0o());
        return 1;
    }

    public static String A02(C106175Xx r1, String str, String str2) {
        try {
            return r1.A02(Integer.parseInt(str), str2);
        } catch (IOException e) {
            Log.e("phonenumberutils/trim/error", e);
            return str2;
        }
    }

    public static boolean A04(String str, String str2, String str3) {
        if (!str.equals(str2)) {
            String replaceAll = str.replaceAll("[^0-9]", "");
            String replaceAll2 = str2.replaceAll("[^0-9]", "");
            if (replaceAll2.equals(replaceAll) || C18320x8.A0f(str3, replaceAll2).equals(replaceAll)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r6 = X.AnonymousClass000.A0T(r11, r9);
        r5 = A06(r8, r9, r6, r7, r2);
        r4 = A06(r10, r9, r6, r7, r2);
        r1 = r2 - r11.length();
        r3 = A06(r9, r8, r10, r7, r1);
        r2 = A06(r6, r8, r10, r7, r2);
        r0 = A06(r8, r9, r6, r7, r1);
        r1 = A06(r10, r9, r6, r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        if (r5 != false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        if (r4 != false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        if (r3 != false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        if (r2 != false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        if (r0 != false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A05(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            int r0 = r11.hashCode()
            r1 = 0
            switch(r0) {
                case 1693: goto L_0x002c;
                case 1695: goto L_0x0021;
                case 1696: goto L_0x0015;
                case 49686: goto L_0x0009;
                default: goto L_0x0008;
            }
        L_0x0008:
            return r1
        L_0x0009:
            java.lang.String r0 = "237"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0008
            java.lang.String r7 = "6"
            r2 = 3
            goto L_0x0037
        L_0x0015:
            java.lang.String r0 = "55"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0008
            java.lang.String r7 = "9"
            r2 = 4
            goto L_0x0037
        L_0x0021:
            java.lang.String r0 = "54"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0008
            java.lang.String r7 = "9"
            goto L_0x0036
        L_0x002c:
            java.lang.String r0 = "52"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0008
            java.lang.String r7 = "1"
        L_0x0036:
            r2 = 2
        L_0x0037:
            java.lang.String r6 = X.AnonymousClass000.A0T(r11, r9)
            boolean r5 = A06(r8, r9, r6, r7, r2)
            boolean r4 = A06(r10, r9, r6, r7, r2)
            int r0 = r11.length()
            int r1 = r2 - r0
            boolean r3 = A06(r9, r8, r10, r7, r1)
            boolean r2 = A06(r6, r8, r10, r7, r2)
            boolean r0 = A06(r8, r9, r6, r7, r1)
            boolean r1 = A06(r10, r9, r6, r7, r1)
            if (r5 != 0) goto L_0x0066
            if (r4 != 0) goto L_0x0066
            if (r3 != 0) goto L_0x0066
            if (r2 != 0) goto L_0x0066
            if (r0 != 0) goto L_0x0066
            r0 = 0
            if (r1 == 0) goto L_0x0067
        L_0x0066:
            r0 = 1
        L_0x0067:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107195ar.A05(java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public static boolean A06(String str, String str2, String str3, String str4, int i) {
        if (str.length() < i) {
            return false;
        }
        StringBuilder A0A = C18330xA.A0A(str);
        A0A.insert(i, str4);
        String obj = A0A.toString();
        if (obj.equals(str2) || obj.equals(str3)) {
            return true;
        }
        return false;
    }
}
