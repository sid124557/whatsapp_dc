package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5At  reason: invalid class name and case insensitive filesystem */
public class C100395At {
    public static List A00(Long l, int[] iArr) {
        long longValue;
        ArrayList A0s = AnonymousClass001.A0s();
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                break;
            }
            j += (long) iArr[i];
            if (i != length - 1 || l == null) {
                if (j > j2) {
                    int i2 = (int) ((((j - j2) + 15) / 16) * 16);
                    C18270x1.A1K(A0s, i2);
                    j3 = j2;
                    j2 = ((long) i2) + j2;
                }
                i++;
            } else {
                if (j > j2) {
                    longValue = l.longValue() - j2;
                } else {
                    A0s.remove(C86664Kz.A0M(A0s));
                    longValue = l.longValue() - j3;
                }
                C18270x1.A1K(A0s, (int) longValue);
            }
        }
        return A0s;
    }
}
