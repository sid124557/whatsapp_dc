package X;

import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: X.2uT  reason: invalid class name and case insensitive filesystem */
public class C57952uT {
    public static final BigDecimal A00 = new BigDecimal("1000");

    public static BigDecimal A00(C160617ny r3, long j) {
        int i = 0;
        while (true) {
            String str = r3.A00;
            if (i >= 3 - C160617ny.A00(str)) {
                return new BigDecimal(new BigInteger(Long.toString(j)), C160617ny.A00(str));
            }
            j /= 10;
            i++;
        }
    }
}
