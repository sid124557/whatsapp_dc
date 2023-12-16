package X;

/* renamed from: X.7pE  reason: invalid class name and case insensitive filesystem */
public class C161217pE {
    public static final C173298Pb A00 = new C173298Pb();
    public static final C173308Pc A01 = new C173308Pc();
    public static final AnonymousClass8PY A02 = new AnonymousClass8PY();
    public static final AnonymousClass8PZ A03 = new AnonymousClass8PZ();
    public static final C173288Pa A04 = new C173288Pa();

    public static boolean A00(char c) {
        if (c == '{' || c == '[' || c == ',' || c == '}' || c == ']' || c == ':' || c == '\'' || c == '\"') {
            return true;
        }
        return false;
    }

    public static boolean A01(char c) {
        if (c < 0) {
            return false;
        }
        if (c <= 31) {
            return true;
        }
        if (c < 127) {
            return false;
        }
        if (c <= 159) {
            return true;
        }
        if (c < 8192 || c > 8447) {
            return false;
        }
        return true;
    }

    public static boolean A02(String str) {
        String str2;
        if (str.length() >= 3) {
            char charAt = str.charAt(0);
            if (charAt == 'n') {
                str2 = "null";
            } else if (charAt == 't') {
                str2 = "true";
            } else if (charAt == 'f') {
                str2 = "false";
            } else if (charAt == 'N') {
                str2 = "NaN";
            }
            return str.equals(str2);
        }
        return false;
    }
}
