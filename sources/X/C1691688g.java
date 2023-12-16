package X;

import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: X.88g  reason: invalid class name and case insensitive filesystem */
public class C1691688g implements C180788ld {
    public long BCJ(AnonymousClass7MF r3) {
        IOException iOException = r3.A03;
        if ((iOException instanceof AnonymousClass6u7) || (iOException instanceof FileNotFoundException) || (iOException instanceof C126886Ps) || (iOException instanceof C140486to)) {
            return -9223372036854775807L;
        }
        return (long) Math.min((r3.A00 - 1) * 1000, 5000);
    }
}
