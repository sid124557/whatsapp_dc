package X;

import android.telephony.PhoneNumberUtils;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.util.regex.Pattern;

/* renamed from: X.36P  reason: invalid class name */
public class AnonymousClass36P {
    public static final String[] A00;
    public static final Pattern[] A01;

    static {
        String[] strArr = {"((?:0[1-3]|[457][0-3])\\d{6})", "([04-9][4-6]\\d{6})", "((?:[04-8][7-9]|9[78])\\d{6})", "(5\\d{6})", "(6\\d{6})", "(9\\d{6})", "(7\\d{6})"};
        A00 = strArr;
        A01 = new Pattern[strArr.length];
    }

    public static String A00(C162167rN r2, C95814uZ r3) {
        if (r3 == null) {
            Log.w("contact/phonenumber/jid/null");
            return null;
        } else if (r3 instanceof C135216kJ) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append('+');
            return AnonymousClass000.A0X(r3.user, A0o);
        } else {
            String A05 = A05(r3);
            if (!PhoneNumberUtils.isGlobalPhoneNumber(A05)) {
                return A05;
            }
            C626936e.A06(A05);
            return A01(r2, A05);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ca A[Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A01(X.C162167rN r11, java.lang.String r12) {
        /*
            java.lang.String r4 = " "
            java.lang.String r5 = "ZZ"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            r0 = 43
            java.lang.String r3 = X.AnonymousClass0x2.A0e(r12, r1, r0)
            X.8LC r2 = r11.A0F(r3, r5)     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
            int r6 = r2.countryCode_     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
            long r0 = r2.nationalNumber_     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
            java.lang.String r7 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
            r0 = 52
            r9 = 1
            r10 = 0
            java.lang.String r1 = "+"
            if (r0 != r6) goto L_0x0043
            int r8 = r7.length()     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
            r0 = 11
            if (r8 != r0) goto L_0x00c7
            char r8 = r7.charAt(r10)     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
            r0 = 49
            if (r8 != r0) goto L_0x00c7
            java.lang.StringBuilder r1 = X.C18270x1.A0W(r6, r1)     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
            java.lang.String r0 = r7.substring(r9)     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
            r1.append(r0)     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
        L_0x003d:
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
            goto L_0x00c8
        L_0x0043:
            r0 = 225(0xe1, float:3.15E-43)
            if (r0 != r6) goto L_0x0048
            goto L_0x008d
        L_0x0048:
            r0 = 245(0xf5, float:3.43E-43)
            if (r0 != r6) goto L_0x00c7
            r0 = 3
            java.util.regex.Pattern r0 = A09(r0)     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
            boolean r0 = X.C18280x3.A1X(r7, r0)     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
            if (r0 == 0) goto L_0x005e
            java.lang.StringBuilder r1 = X.C18270x1.A0W(r6, r1)     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
            java.lang.String r0 = "95"
            goto L_0x009d
        L_0x005e:
            r0 = 4
            java.util.regex.Pattern r0 = A09(r0)     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
            boolean r0 = X.C18280x3.A1X(r7, r0)     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
            if (r0 != 0) goto L_0x0086
            r0 = 5
            java.util.regex.Pattern r0 = A09(r0)     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
            boolean r0 = X.C18280x3.A1X(r7, r0)     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
            if (r0 != 0) goto L_0x0086
            r0 = 6
            java.util.regex.Pattern r0 = A09(r0)     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
            boolean r0 = X.C18280x3.A1X(r7, r0)     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
            if (r0 == 0) goto L_0x00c7
            java.lang.StringBuilder r1 = X.C18270x1.A0W(r6, r1)     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
            java.lang.String r0 = "97"
            goto L_0x009d
        L_0x0086:
            java.lang.StringBuilder r1 = X.C18270x1.A0W(r6, r1)     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
            java.lang.String r0 = "96"
            goto L_0x009d
        L_0x008d:
            java.util.regex.Pattern r0 = A09(r10)     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
            boolean r0 = X.C18280x3.A1X(r7, r0)     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
            if (r0 == 0) goto L_0x00a4
            java.lang.StringBuilder r1 = X.C18270x1.A0W(r6, r1)     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
            java.lang.String r0 = "01"
        L_0x009d:
            r1.append(r0)     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
            r1.append(r7)     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
            goto L_0x003d
        L_0x00a4:
            java.util.regex.Pattern r0 = A09(r9)     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
            boolean r0 = X.C18280x3.A1X(r7, r0)     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
            if (r0 == 0) goto L_0x00b5
            java.lang.StringBuilder r1 = X.C18270x1.A0W(r6, r1)     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
            java.lang.String r0 = "05"
            goto L_0x009d
        L_0x00b5:
            r0 = 2
            java.util.regex.Pattern r0 = A09(r0)     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
            boolean r0 = X.C18280x3.A1X(r7, r0)     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
            if (r0 == 0) goto L_0x00c7
            java.lang.StringBuilder r1 = X.C18270x1.A0W(r6, r1)     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
            java.lang.String r0 = "07"
            goto L_0x009d
        L_0x00c7:
            r0 = 0
        L_0x00c8:
            if (r0 == 0) goto L_0x00ce
            X.8LC r2 = r11.A0F(r0, r5)     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
        L_0x00ce:
            X.6uu r0 = X.C141026uu.INTERNATIONAL     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
            java.lang.String r3 = r11.A0H(r0, r2)     // Catch:{ Exception -> 0x00dd, ExceptionInInitializerError -> 0x00d5 }
            return r3
        L_0x00d5:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "contact/formatter-init-exception num:"
            goto L_0x00e4
        L_0x00dd:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "contact/formatter-exception num:"
        L_0x00e4:
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.AnonymousClass000.A0a(r4, r1, r2)
            com.whatsapp.util.Log.e(r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36P.A01(X.7rN, java.lang.String):java.lang.String");
    }

    public static String A05(C95814uZ r4) {
        String str;
        int indexOf;
        if (r4 instanceof PhoneUserJid) {
            return r4.user;
        }
        if (!C627336j.A0K(r4) || r4 == null || (str = r4.user) == null || (indexOf = str.indexOf("-")) == -1) {
            return null;
        }
        return AnonymousClass0x7.A0r(str, indexOf);
    }

    public static Pattern A09(int i) {
        Pattern[] patternArr = A01;
        if (patternArr[i] == null) {
            patternArr[i] = Pattern.compile(A00[i]);
        }
        return patternArr[i];
    }

    public static String A02(AnonymousClass3ZH r0) {
        return A03(AnonymousClass3ZH.A01(r0));
    }

    public static String A03(C95814uZ r1) {
        return A00(C162167rN.A00(), r1);
    }

    public static String A04(C95814uZ r2) {
        String A03 = C107195ar.A03(A03(r2));
        if (A03 != null) {
            return AnonymousClass000.A0V("+", A03, AnonymousClass001.A0o());
        }
        return null;
    }

    public static String A06(C95814uZ r0) {
        return A03(r0);
    }

    public static String A07(String str) {
        return A01(C162167rN.A00(), str);
    }

    public static String A08(String str) {
        return A07(str);
    }
}
