package X;

/* renamed from: X.0Mx  reason: invalid class name and case insensitive filesystem */
public final class C04130Mx {
    public final boolean A00(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        int length = str.length();
        if (length != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < length) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0) {
                        if (charAt != '(') {
                            break;
                        }
                    } else if (charAt != '(') {
                        if (charAt == ')' && i2 - 1 == 0 && i3 != length - 1) {
                            return false;
                        }
                        i++;
                        i3 = i4;
                    }
                    i2++;
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    String substring = str.substring(1, length - 1);
                    C162457s7.A0D(substring);
                    return C162457s7.A0P(C175728Zm.A0I(substring).toString(), str2);
                }
            }
        }
        return false;
    }
}
