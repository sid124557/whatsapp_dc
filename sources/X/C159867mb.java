package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.nio.charset.Charset;

/* renamed from: X.7mb  reason: invalid class name and case insensitive filesystem */
public final class C159867mb {
    public static final Object A00 = AnonymousClass002.A0D();
    public static final Charset A01 = Charset.forName("ISO-8859-1");
    public static final Charset A02 = Charset.forName(DefaultCrypto.UTF_8);

    public static boolean A00(Object[] objArr, Object[] objArr2) {
        int length;
        int length2;
        if (objArr == null) {
            length = 0;
        } else {
            length = objArr.length;
        }
        if (objArr2 == null) {
            length2 = 0;
        } else {
            length2 = objArr2.length;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length || objArr[i] != null) {
                while (i2 < length2 && objArr2[i2] == null) {
                    i2++;
                }
                boolean A1U = C18280x3.A1U(i, length);
                boolean A1U2 = C18280x3.A1U(i2, length2);
                if (!A1U) {
                    if (A1U != A1U2 || !objArr[i].equals(objArr2[i2])) {
                        break;
                    }
                    i++;
                    i2++;
                } else if (A1U2) {
                    return true;
                }
            } else {
                i++;
            }
        }
        return false;
    }
}
