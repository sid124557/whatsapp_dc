package X;

import java.io.IOException;
import java.util.Hashtable;

/* renamed from: X.7qs  reason: invalid class name and case insensitive filesystem */
public class C161947qs {
    public static int A00(char c) {
        int i;
        if ('0' <= c) {
            if (c <= '9') {
                return c - '0';
            }
            if ('a' <= c && c <= 'f') {
                i = c - 'a';
                return i + 10;
            }
        }
        i = c - 'A';
        return i + 10;
    }

    public static void A04(StringBuffer stringBuffer, Hashtable hashtable, C176448d1 r4) {
        C176768dX r1 = r4.A01;
        String str = (String) hashtable.get(r1);
        if (str == null) {
            str = r1.A01;
        }
        stringBuffer.append(str);
        stringBuffer.append('=');
        stringBuffer.append(A02(r4.A00));
    }

    public static void A05(StringBuffer stringBuffer, Hashtable hashtable, C176538dA r6) {
        if (r6.A00.A01.length > 1) {
            C176448d1[] A0O = r6.A0O();
            boolean z = true;
            for (int i = 0; i != A0O.length; i++) {
                if (z) {
                    z = false;
                } else {
                    stringBuffer.append('+');
                }
                A04(stringBuffer, hashtable, A0O[i]);
            }
        } else if (r6.A0N() != null) {
            A04(stringBuffer, hashtable, r6.A0N());
        }
    }

    public static boolean A06(C176538dA r9, C176538dA r10) {
        if (r9.A00.A01.length == r10.A00.A01.length) {
            C176448d1[] A0O = r9.A0O();
            C176448d1[] A0O2 = r10.A0O();
            int length = A0O.length;
            if (length == A0O2.length) {
                int i = 0;
                while (i != length) {
                    C176448d1 r3 = A0O[i];
                    C176448d1 r2 = A0O2[i];
                    if (r3 == r2 || (r3 != null && r2 != null && r3.A01.A0T(r2.A01) && A01(A02(r3.A00)).equals(A01(A02(r2.A00))))) {
                        i++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static String A01(String str) {
        int length = str.length();
        int i = 0;
        if (length > 0 && str.charAt(0) == '#') {
            try {
                C177088e3 A0I = C177088e3.A0I(AnonymousClass35E.A01(str, length - 1));
                if (A0I instanceof C183628qM) {
                    str = ((C183628qM) A0I).BDM();
                }
            } catch (IOException e) {
                throw AnonymousClass000.A0H(e, "unknown encoding in name: ", AnonymousClass001.A0o());
            }
        }
        String A00 = C162077rB.A00(str);
        int length2 = A00.length();
        if (length2 < 2) {
            return A00;
        }
        int i2 = length2 - 1;
        while (i < i2 && A00.charAt(i) == '\\' && A00.charAt(i + 1) == ' ') {
            i += 2;
        }
        int i3 = i + 1;
        int i4 = i2;
        while (i4 > i3 && A00.charAt(i4 - 1) == '\\' && A00.charAt(i4) == ' ') {
            i4 -= 2;
        }
        if (i > 0 || i4 < i2) {
            A00 = A00.substring(i, i4 + 1);
        }
        if (A00.indexOf("  ") < 0) {
            return A00;
        }
        StringBuffer A0X = AnonymousClass6CA.A0X();
        char A002 = AnonymousClass6C9.A00(A00);
        A0X.append(A002);
        for (int i5 = 1; i5 < A00.length(); i5++) {
            char charAt = A00.charAt(i5);
            if (A002 != ' ' || charAt != ' ') {
                A0X.append(charAt);
                A002 = charAt;
            }
        }
        return A0X.toString();
    }

    public static String A02(C183618qL r8) {
        int i;
        StringBuffer A0X = AnonymousClass6CA.A0X();
        int i2 = 0;
        if (!(r8 instanceof C183628qM) || (r8 instanceof C176878di)) {
            try {
                A0X.append('#');
                byte[] A09 = AnonymousClass8Q0.A09(r8);
                A0X.append(C162077rB.A02(AnonymousClass35E.A02(A09, 0, A09.length)));
            } catch (IOException unused) {
                throw AnonymousClass001.A0c("Other value has no encoded form");
            }
        } else {
            String BDM = ((C183628qM) r8).BDM();
            if (BDM.length() > 0 && BDM.charAt(0) == '#') {
                A0X.append('\\');
            }
            A0X.append(BDM);
        }
        int length = A0X.length();
        int i3 = 2;
        if (!(A0X.length() >= 2 && A0X.charAt(0) == '\\' && A0X.charAt(1) == '#')) {
            i3 = 0;
        }
        while (i != length) {
            char charAt = A0X.charAt(i);
            if (!(charAt == '\"' || charAt == '\\' || charAt == '+' || charAt == ',')) {
                switch (charAt) {
                    case ';':
                    case AnonymousClass1EU.POLL_CREATION_MESSAGE_V2_FIELD_NUMBER:
                    case '=':
                    case '>':
                        break;
                    default:
                        i++;
                        continue;
                }
            }
            A0X.insert(i, "\\");
            i += 2;
            length++;
        }
        if (A0X.length() > 0) {
            while (A0X.length() > i2 && A0X.charAt(i2) == ' ') {
                A0X.insert(i2, "\\");
                i2 += 2;
            }
        }
        int length2 = A0X.length() - 1;
        while (length2 >= 0 && A0X.charAt(length2) == ' ') {
            A0X.insert(length2, '\\');
            length2--;
        }
        return A0X.toString();
    }

    public static C176768dX A03(String str, Hashtable hashtable) {
        if (C162077rB.A01(str).startsWith("OID.")) {
            str = str.substring(4);
        } else if (str.charAt(0) < '0' || str.charAt(0) > '9') {
            C176768dX r0 = (C176768dX) hashtable.get(C162077rB.A00(str));
            if (r0 != null) {
                return r0;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Unknown object id - ");
            A0o.append(str);
            throw AnonymousClass000.A0F(" - passed to distinguished name", A0o);
        }
        return C176768dX.A0B(str);
    }
}
