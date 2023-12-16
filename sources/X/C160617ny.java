package X;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.7ny  reason: invalid class name and case insensitive filesystem */
public class C160617ny {
    public static final C160617ny A01 = new C160617ny("USD");
    public static final C160617ny A02 = new C160617ny("XXX");
    public final String A00;

    public static int A00(String str) {
        Number A0p = AnonymousClass0x9.A0p(str.toUpperCase(Locale.US), AnonymousClass797.A01);
        if (A0p == null) {
            return 2;
        }
        return A0p.intValue();
    }

    public String A02(C620733j r13) {
        HashMap hashMap = AnonymousClass797.A02;
        String str = this.A00;
        Number A0p = AnonymousClass0x9.A0p(str, hashMap);
        if (A0p == null) {
            return str;
        }
        String A0A = r13.A0A(A0p.intValue());
        if (A0A.isEmpty()) {
            return str;
        }
        C158117jS r8 = C158117jS.A03;
        if (r8.A00(A0A)) {
            return A0A;
        }
        int length = A0A.length();
        StringBuilder A0Y = AnonymousClass6CA.A0Y(length + 2);
        int i = 0;
        while (i < length) {
            int codePointAt = A0A.codePointAt(i);
            String[] strArr = (String[]) AnonymousClass77W.A00.get(Integer.valueOf(codePointAt));
            if (strArr != null && strArr.length != 0) {
                if (strArr.length != 1) {
                    int length2 = strArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            break;
                        }
                        String str2 = strArr[i2];
                        if (!r8.A00(str2)) {
                            i2++;
                        } else if (str2 != null) {
                            A0Y.append(str2);
                        }
                    }
                } else {
                    A0Y.append(strArr[0]);
                }
                i += Character.charCount(codePointAt);
            }
            A0Y.appendCodePoint(codePointAt);
            i += Character.charCount(codePointAt);
        }
        return A0Y.toString();
    }

    public String A03(C620733j r13, BigDecimal bigDecimal, int i, boolean z) {
        C157407iF r5;
        C157407iF r4;
        C157407iF r7;
        C157407iF r6;
        String str;
        String str2;
        C149447Mm r3;
        AnonymousClass7T2 A002 = C159827mW.A00(r13, z);
        C158737kT r32 = new C158737kT(A002.A00(), C620733j.A02(r13));
        boolean z2 = A002.A02;
        if (z2) {
            r6 = A01(r13, 9);
            r7 = A01(r13, 11);
            str2 = r13.A0A(10);
            r4 = A01(r13, 6);
            r5 = A01(r13, 8);
            str = r13.A0A(7);
        } else {
            r5 = C157407iF.A02;
            r4 = r5;
            r7 = r5;
            r6 = r5;
            str = "";
            str2 = str;
        }
        String A022 = A02(r13);
        r32.A03(i);
        String A023 = r32.A02(bigDecimal);
        if (!z2) {
            return A023;
        }
        if (bigDecimal.compareTo(BigDecimal.ZERO) < 0) {
            r3 = A002.A00;
        } else {
            r3 = A002.A01;
        }
        return C159827mW.A01(r3, r4, r5, r6, r7, str, str2, A022, A023);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C160617ny) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C160617ny(String str) {
        if (str.length() == 3) {
            this.A00 = str.toUpperCase(Locale.US);
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("invalid currency code; currencyCode=");
        throw AnonymousClass000.A0F(str, A0o);
    }

    public static C157407iF A01(C620733j r0, int i) {
        return new C157407iF(r0.A0A(i));
    }

    public String A04(C620733j r14, BigDecimal bigDecimal, boolean z) {
        C157407iF r6;
        C157407iF r5;
        C157407iF r8;
        C157407iF r7;
        String str;
        String str2;
        C149447Mm r4;
        int scale = bigDecimal.scale();
        AnonymousClass7T2 A002 = C159827mW.A00(r14, z);
        C158737kT r3 = new C158737kT(A002.A00(), C620733j.A02(r14));
        boolean z2 = A002.A02;
        if (z2) {
            r7 = A01(r14, 9);
            r8 = A01(r14, 11);
            str2 = r14.A0A(10);
            r5 = A01(r14, 6);
            r6 = A01(r14, 8);
            str = r14.A0A(7);
        } else {
            r6 = C157407iF.A02;
            r5 = r6;
            r8 = r6;
            r7 = r6;
            str = "";
            str2 = str;
        }
        String A022 = A02(r14);
        r3.A03(scale);
        String A023 = r3.A02(bigDecimal);
        if (!z2) {
            return A023;
        }
        if (bigDecimal.compareTo(BigDecimal.ZERO) < 0) {
            r4 = A002.A00;
        } else {
            r4 = A002.A01;
        }
        return C159827mW.A01(r4, r5, r6, r7, r8, str, str2, A022, A023);
    }
}
