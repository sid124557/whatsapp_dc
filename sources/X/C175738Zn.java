package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.8Zn  reason: invalid class name and case insensitive filesystem */
public class C175738Zn extends C829745q {
    public static final String A0U(String str, String str2, String str3, boolean z) {
        C162457s7.A0J(str, 0);
        C18270x1.A10(str2, 1, str3);
        int i = 0;
        int A0G = C175728Zm.A0G(str, str2, 0, z);
        if (A0G < 0) {
            return str;
        }
        int length = str2.length();
        int i2 = length;
        if (length < 1) {
            i2 = 1;
        }
        int length2 = str.length();
        int length3 = (length2 - length) + str3.length();
        if (length3 >= 0) {
            StringBuilder A0Y = AnonymousClass6CA.A0Y(length3);
            do {
                A0Y.append(str, i, A0G);
                A0Y.append(str3);
                i = A0G + length;
                if (A0G >= length2 || (A0G = C175728Zm.A0G(str, str2, A0G + i2, z)) <= 0) {
                    A0Y.append(str, i, length2);
                }
                A0Y.append(str, i, A0G);
                A0Y.append(str3);
                i = A0G + length;
                break;
            } while ((A0G = C175728Zm.A0G(str, str2, A0G + i2, z)) <= 0);
            A0Y.append(str, i, length2);
            return C18290x4.A0o(A0Y);
        }
        throw new OutOfMemoryError();
    }

    public static final boolean A0V(CharSequence charSequence) {
        C162457s7.A0J(charSequence, 0);
        if (charSequence.length() != 0) {
            C175698Zj r1 = new C175698Zj(0, charSequence.length() - 1);
            if (!(r1 instanceof Collection) || !((Collection) r1).isEmpty()) {
                Iterator it = r1.iterator();
                while (it.hasNext()) {
                    if (!C154557dM.A01(charSequence.charAt(((C72013d2) it).A00()))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static final boolean A0Y(String str, String str2, boolean z) {
        String str3 = str;
        C162457s7.A0J(str, 0);
        String str4 = str2;
        C162457s7.A0J(str2, 1);
        boolean z2 = z;
        if (!z) {
            return str3.startsWith(str2);
        }
        return str3.regionMatches(z2, 0, str4, 0, str2.length());
    }

    public static /* synthetic */ String A0T(String str) {
        C162457s7.A0J(str, 0);
        String replace = str.replace('.', '_');
        C162457s7.A0D(replace);
        return replace;
    }
}
