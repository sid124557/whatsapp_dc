package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8Zm  reason: invalid class name and case insensitive filesystem */
public class C175728Zm extends C175738Zn {
    public static final int A0C(CharSequence charSequence, char c, int i) {
        C162457s7.A0J(charSequence, 0);
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(c, i);
        }
        return A0H(charSequence, new char[]{c}, i, false);
    }

    public static final int A0D(CharSequence charSequence, char c, int i) {
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        int length = charSequence.length() - 1;
        if (i > length) {
            i = length;
        }
        while (-1 < i) {
            if (cArr[0] == charSequence.charAt(i)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static final int A0E(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        AnonymousClass8Ls r1;
        int i3;
        boolean regionMatches;
        int i4 = i2;
        int i5 = i;
        if (!z2) {
            if (i < 0) {
                i5 = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i4 = length;
            }
            r1 = new C175698Zj(i5, i4);
        } else {
            int length2 = charSequence.length() - 1;
            if (i > length2) {
                i5 = length2;
            }
            if (i2 < 0) {
                i4 = 0;
            }
            r1 = new AnonymousClass8Ls(i5, i4, -1);
        }
        CharSequence charSequence3 = charSequence2;
        boolean z3 = z;
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            i3 = r1.A00;
            int i6 = r1.A01;
            int i7 = r1.A02;
            if (i7 > 0) {
                if (i3 > i6) {
                    return -1;
                }
            } else if (i6 > i3) {
                return -1;
            }
            while (true) {
                String str = (String) charSequence3;
                String str2 = (String) charSequence;
                int length3 = charSequence2.length();
                C18270x1.A10(str, 0, str2);
                if (!z) {
                    regionMatches = str.regionMatches(0, str2, i3, length3);
                } else {
                    regionMatches = str.regionMatches(z3, 0, str2, i3, length3);
                }
                if (regionMatches) {
                    break;
                } else if (i3 == i6) {
                    return -1;
                } else {
                    i3 += i7;
                }
            }
        } else {
            int i8 = r1.A00;
            int i9 = r1.A01;
            int i10 = r1.A02;
            if (i10 > 0) {
                if (i8 > i9) {
                    return -1;
                }
            } else if (i9 > i8) {
                return -1;
            }
            while (true) {
                if (A0R(charSequence3, charSequence, 0, i3, charSequence3.length(), z)) {
                    break;
                } else if (i3 == i9) {
                    return -1;
                } else {
                    i8 = i3 + i10;
                }
            }
        }
        return i3;
    }

    public static final int A0F(CharSequence charSequence, String str, int i) {
        CharSequence charSequence2 = charSequence;
        String str2 = str;
        C162457s7.A0J(str, 1);
        int i2 = i;
        if (!(charSequence2 instanceof String)) {
            return A0E(charSequence2, str2, i2, 0, false, true);
        }
        return ((String) charSequence2).lastIndexOf(str, i);
    }

    public static final int A0G(CharSequence charSequence, String str, int i, boolean z) {
        CharSequence charSequence2 = charSequence;
        String str2 = str;
        C18270x1.A14(charSequence2, str);
        int i2 = i;
        boolean z2 = z;
        if (z || !(charSequence2 instanceof String)) {
            return A0E(charSequence2, str2, i2, charSequence2.length(), z2, false);
        }
        return ((String) charSequence2).indexOf(str, i);
    }

    public static final int A0H(CharSequence charSequence, char[] cArr, int i, boolean z) {
        char upperCase;
        char upperCase2;
        C162457s7.A0J(cArr, 1);
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            if (i < 0) {
                i = 0;
            }
            C72013d2 A00 = new C175698Zj(i, charSequence.length() - 1).iterator();
            loop0:
            while (A00.hasNext()) {
                int A002 = A00.A00();
                char charAt = charSequence.charAt(A002);
                int length = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        char c = cArr[i2];
                        if (c == charAt || (z && ((upperCase = Character.toUpperCase(c)) == (upperCase2 = Character.toUpperCase(charAt)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) {
                            return A002;
                        }
                        i2++;
                    }
                }
                return A002;
            }
            return -1;
        }
        return ((String) charSequence).indexOf(cArr[0], i);
    }

    public static final CharSequence A0I(CharSequence charSequence) {
        C162457s7.A0J(charSequence, 0);
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A01 = C154557dM.A01(charSequence.charAt(i2));
            if (z) {
                if (!A01) {
                    break;
                }
                length--;
            } else if (!A01) {
                z = true;
            } else {
                i++;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final String A0J(CharSequence charSequence, String str) {
        boolean A0R;
        String str2 = str;
        CharSequence charSequence2 = charSequence;
        C162457s7.A0J(charSequence, 1);
        if (str == null || !(charSequence instanceof String)) {
            A0R = A0R(str2, charSequence2, 0, 0, charSequence.length(), false);
        } else {
            String str3 = (String) charSequence2;
            C162457s7.A0J(str3, 1);
            A0R = str.startsWith(str3);
        }
        if (!A0R) {
            return str2;
        }
        String substring = str2.substring(charSequence2.length());
        C162457s7.A0D(substring);
        return substring;
    }

    public static final String A0K(CharSequence charSequence, String str) {
        boolean A0R;
        String str2 = str;
        C162457s7.A0J(str, 0);
        CharSequence charSequence2 = charSequence;
        C162457s7.A0J(charSequence, 1);
        if (charSequence instanceof String) {
            String str3 = (String) charSequence2;
            C162457s7.A0J(str3, 1);
            A0R = str.endsWith(str3);
        } else {
            A0R = A0R(str2, charSequence2, str.length() - charSequence.length(), 0, charSequence.length(), false);
        }
        if (!A0R) {
            return str2;
        }
        String substring = str2.substring(0, str2.length() - charSequence2.length());
        C162457s7.A0D(substring);
        return substring;
    }

    public static final String A0L(String str, String str2, String str3) {
        C162457s7.A0J(str, 0);
        C18260x0.A0Q(str2, str3);
        int A0G = A0G(str, str2, 0, false);
        if (A0G == -1) {
            return str3;
        }
        String substring = str.substring(A0G + str2.length(), str.length());
        C162457s7.A0D(substring);
        return substring;
    }

    public static final List A0N(CharSequence charSequence, String str, int i) {
        int i2 = 0;
        int A0G = A0G(charSequence, str, 0, false);
        if (A0G == -1 || i == 1) {
            return C18290x4.A12(charSequence.toString());
        }
        boolean z = false;
        int i3 = 10;
        if (i > 0) {
            z = true;
            i3 = i;
        }
        ArrayList A0I = AnonymousClass002.A0I(i3);
        do {
            AnonymousClass0x7.A1D(charSequence.subSequence(i2, A0G), A0I);
            i2 = str.length() + A0G;
            if ((z && A0I.size() == i - 1) || (A0G = A0G(charSequence, str, i2, false)) == -1) {
                AnonymousClass0x7.A1D(charSequence.subSequence(i2, charSequence.length()), A0I);
            }
            AnonymousClass0x7.A1D(charSequence.subSequence(i2, A0G), A0I);
            i2 = str.length() + A0G;
            break;
        } while ((A0G = A0G(charSequence, str, i2, false)) == -1);
        AnonymousClass0x7.A1D(charSequence.subSequence(i2, charSequence.length()), A0I);
        return A0I;
    }

    public static final List A0O(CharSequence charSequence, char[] cArr) {
        C162457s7.A0J(charSequence, 0);
        if (cArr.length == 1) {
            return A0N(charSequence, String.valueOf(cArr[0]), 0);
        }
        AnonymousClass3ZX r0 = new AnonymousClass3ZX(new AnonymousClass8PN(charSequence, new AnonymousClass8ZQ(cArr), 0));
        ArrayList A0c = C73783g4.A0c(r0);
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            AnonymousClass8Ls r2 = (AnonymousClass8Ls) it.next();
            C162457s7.A0J(r2, 1);
            AnonymousClass0x7.A1D(charSequence.subSequence(r2.A00, r2.A01 + 1), A0c);
        }
        return A0c;
    }

    public static final List A0P(CharSequence charSequence, String[] strArr, int i) {
        C162457s7.A0J(charSequence, 0);
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return A0N(charSequence, str, i);
            }
        }
        List asList = Arrays.asList(strArr);
        C162457s7.A0D(asList);
        AnonymousClass3ZX r0 = new AnonymousClass3ZX(new AnonymousClass8PN(charSequence, new AnonymousClass8ZR(asList), i));
        ArrayList A0c = C73783g4.A0c(r0);
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            AnonymousClass8Ls r2 = (AnonymousClass8Ls) it.next();
            C162457s7.A0J(r2, 1);
            AnonymousClass0x7.A1D(charSequence.subSequence(r2.A00, r2.A01 + 1), A0c);
        }
        return A0c;
    }

    public static final boolean A0R(CharSequence charSequence, CharSequence charSequence2, int i, int i2, int i3, boolean z) {
        char upperCase;
        char upperCase2;
        if (i2 >= 0 && i >= 0 && i <= charSequence.length() - i3 && i2 <= charSequence2.length() - i3) {
            int i4 = 0;
            while (i4 < i3) {
                char charAt = charSequence.charAt(i + i4);
                char charAt2 = charSequence2.charAt(i2 + i4);
                if (charAt == charAt2 || (z && ((upperCase = Character.toUpperCase(charAt)) == (upperCase2 = Character.toUpperCase(charAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) {
                    i4++;
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean A0S(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        int A0E;
        CharSequence charSequence3 = charSequence2;
        CharSequence charSequence4 = charSequence;
        C18270x1.A14(charSequence, charSequence2);
        boolean z2 = charSequence2 instanceof String;
        boolean z3 = z;
        if (z2) {
            A0E = A0G(charSequence, (String) charSequence3, 0, z);
        } else {
            A0E = A0E(charSequence4, charSequence3, 0, charSequence.length(), z3, false);
        }
        if (A0E < 0) {
            return false;
        }
        return true;
    }

    public static final List A0M(CharSequence charSequence) {
        List asList = Arrays.asList(new String[]{"\r\n", "\n", "\r"});
        C162457s7.A0D(asList);
        return C829345m.A01(new C72623e1(new C175348Ya(charSequence), new AnonymousClass8PN(charSequence, new AnonymousClass8ZR(asList), 0)));
    }
}
