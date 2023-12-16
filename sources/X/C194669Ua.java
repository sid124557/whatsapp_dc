package X;

import com.whatsapp.wamsys.JniBridge;
import java.math.BigInteger;

/* renamed from: X.9Ua  reason: invalid class name and case insensitive filesystem */
public class C194669Ua {
    public final JniBridge A00;

    public static String A00(BigInteger bigInteger) {
        if (bigInteger != null) {
            try {
                byte[] byteArray = bigInteger.toByteArray();
                int length = byteArray.length;
                if (length >= 4) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    for (int i = length - 1; i >= length - 4; i--) {
                        A0o.append(String.format("%02X", new Object[]{Byte.valueOf(byteArray[i])}));
                    }
                    return A0o.toString();
                }
            } catch (Exception e) {
                C18260x0.A1Q(AnonymousClass001.A0o(), "PAY: JweCompactSerializer/getCertID: ", e);
                return null;
            }
        }
        return null;
    }

    public C194669Ua(JniBridge jniBridge) {
        this.A00 = jniBridge;
    }
}
