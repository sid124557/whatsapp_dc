package X;

import java.security.AccessControlException;
import java.security.AccessController;
import java.util.Map;

/* renamed from: X.7mT  reason: invalid class name and case insensitive filesystem */
public class C159797mT {
    public static final ThreadLocal A00 = new ThreadLocal();

    public static String A00(String str) {
        Map map;
        String str2 = (String) AccessController.doPrivileged(new C1897992r(str, 1));
        if (str2 == null && ((map = (Map) A00.get()) == null || (str2 = C18310x6.A0o(str, map)) == null)) {
            return (String) AccessController.doPrivileged(new C1897992r(str, 2));
        }
        return str2;
    }

    public static boolean A01(String str) {
        try {
            String A002 = A00(str);
            if (A002 == null || A002.length() != 4) {
                return false;
            }
            if (A002.charAt(0) != 't' && A002.charAt(0) != 'T') {
                return false;
            }
            if (A002.charAt(1) != 'r' && A002.charAt(1) != 'R') {
                return false;
            }
            if (A002.charAt(2) != 'u' && A002.charAt(2) != 'U') {
                return false;
            }
            if (A002.charAt(3) == 'e' || A002.charAt(3) == 'E') {
                return true;
            }
            return false;
        } catch (AccessControlException unused) {
            return false;
        }
    }
}
