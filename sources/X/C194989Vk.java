package X;

import android.os.Build;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.9Vk  reason: invalid class name and case insensitive filesystem */
public class C194989Vk {
    public static boolean A01(char c, char c2, char c3) {
        if (!"samsung".equals(Build.MANUFACTURER)) {
            return false;
        }
        String str = Build.FINGERPRINT;
        int indexOf = str.indexOf(":user/");
        if (indexOf == -1) {
            indexOf = str.indexOf(":userdebug/");
        }
        if (indexOf == -1) {
            indexOf = str.indexOf(":eng/");
        }
        if (indexOf < 3) {
            return false;
        }
        char charAt = str.charAt(indexOf - 3);
        char charAt2 = str.charAt(indexOf - 2);
        char charAt3 = str.charAt(indexOf - 1);
        if (charAt <= c) {
            if (charAt != c) {
                return false;
            }
            if (charAt2 <= c2) {
                if (charAt2 != c2 || charAt3 < c3) {
                    return false;
                }
                return true;
            }
        }
        return true;
    }

    public static boolean A02(Set set) {
        if (set.contains(C195099Vy.A03) || set.contains(C195099Vy.A04)) {
            return true;
        }
        return false;
    }

    public static HashSet A00(Object... objArr) {
        HashSet A0K = AnonymousClass002.A0K();
        for (Object add : objArr) {
            A0K.add(add);
        }
        return A0K;
    }
}
