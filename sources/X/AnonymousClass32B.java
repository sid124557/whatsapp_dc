package X;

import java.security.SecureRandom;

/* renamed from: X.32B  reason: invalid class name */
public class AnonymousClass32B {
    public final long A00;
    public final byte[] A01;

    public static boolean A00(AnonymousClass32B r4, long j) {
        return AnonymousClass001.A1V(((j - r4.A00) > (((long) new SecureRandom().nextInt(86400000)) + 172800000) ? 1 : ((j - r4.A00) == (((long) new SecureRandom().nextInt(86400000)) + 172800000) ? 0 : -1)));
    }

    public AnonymousClass32B(byte[] bArr, long j) {
        C626936e.A0C(AnonymousClass001.A1W((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        this.A01 = bArr;
        this.A00 = j;
    }
}
