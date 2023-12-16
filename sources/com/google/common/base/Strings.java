package com.google.common.base;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass6C7;
import X.AnonymousClass6CA;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Strings {
    public static String A00(String str, Object... objArr) {
        int length;
        String valueOf = String.valueOf(str);
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            String str2 = objArr[i2];
            if (str2 == null) {
                str2 = "null";
            } else {
                try {
                    str2 = str2.toString();
                } catch (Exception e) {
                    String A0O = AnonymousClass000.A0O(str2);
                    String A0S = AnonymousClass6CA.A0S(str2);
                    StringBuilder A0q = AnonymousClass6C7.A0q(A0S, A0O.length() + 1);
                    A0q.append(A0O);
                    String A0e = AnonymousClass0x2.A0e(A0S, A0q, '@');
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String valueOf2 = String.valueOf(A0e);
                    logger.log(level, AnonymousClass6C7.A0k("Exception during lenientFormat for ", valueOf2, valueOf2.length()), e);
                    String A0O2 = AnonymousClass000.A0O(e);
                    StringBuilder A0o = AnonymousClass6C7.A0o(AnonymousClass6C7.A06(A0e) + 9, A0O2);
                    A0o.append("<");
                    A0o.append(A0e);
                    A0o.append(" threw ");
                    A0o.append(A0O2);
                    str2 = AnonymousClass000.A0X(">", A0o);
                }
            }
            objArr[i2] = str2;
            i2++;
        }
        int length2 = valueOf.length();
        StringBuilder A0Y = AnonymousClass6CA.A0Y((length * 16) + length2);
        int i3 = 0;
        while (i < length) {
            int indexOf = valueOf.indexOf("%s", i3);
            if (indexOf == -1) {
                break;
            }
            A0Y.append(valueOf, i3, indexOf);
            A0Y.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        A0Y.append(valueOf, i3, length2);
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
