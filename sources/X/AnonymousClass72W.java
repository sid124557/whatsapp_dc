package X;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.72W  reason: invalid class name */
public final class AnonymousClass72W {
    public static String A00(String str, Object... objArr) {
        int length;
        String A0X;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                A0X = "null";
            } else {
                try {
                    A0X = obj.toString();
                } catch (Exception e) {
                    String A0V = AnonymousClass000.A0V("@", AnonymousClass6CA.A0S(obj), AnonymousClass000.A0l(AnonymousClass000.A0O(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(A0V), e);
                    String A0O = AnonymousClass000.A0O(e);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("<");
                    A0o.append(A0V);
                    A0o.append(" threw ");
                    A0o.append(A0O);
                    A0X = AnonymousClass000.A0X(">", A0o);
                }
            }
            objArr[i2] = A0X;
            i2++;
        }
        int length2 = str.length();
        StringBuilder A0Y = AnonymousClass6CA.A0Y((length * 16) + length2);
        int i3 = 0;
        while (i < length) {
            int indexOf = str.indexOf("%s", i3);
            if (indexOf == -1) {
                break;
            }
            A0Y.append(str, i3, indexOf);
            A0Y.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        A0Y.append(str, i3, length2);
        if (i < length) {
            A0Y.append(" [");
            A0Y.append(objArr[i]);
            for (int i4 = i + 1; i4 < length; i4++) {
                AnonymousClass001.A1M(A0Y);
                A0Y.append(objArr[i4]);
            }
            A0Y.append(']');
        }
        return A0Y.toString();
    }
}
