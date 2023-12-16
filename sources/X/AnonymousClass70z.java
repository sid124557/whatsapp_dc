package X;

import android.util.Log;
import java.util.UUID;

/* renamed from: X.70z  reason: invalid class name */
public final class AnonymousClass70z {
    public static C148537It A00(byte[] bArr) {
        C161457ph r7 = new C161457ph(bArr);
        if (r7.A00 >= 32 && C161457ph.A02(r7, 0) == (r7.A00 - r7.A01) + 4 && r7.A03() == 1886614376) {
            int A03 = (r7.A03() >> 24) & 255;
            if (A03 > 1) {
                Log.w("PsshAtomUtil", AnonymousClass000.A0Y("Unsupported pssh version: ", AnonymousClass001.A0o(), A03));
            } else {
                UUID uuid = new UUID(r7.A08(), r7.A08());
                if (A03 == 1) {
                    r7.A0I(r7.A05() * 16);
                }
                int A05 = r7.A05();
                if (A05 == r7.A00 - r7.A01) {
                    byte[] bArr2 = new byte[A05];
                    r7.A0J(bArr2, 0, A05);
                    return new C148537It(uuid, bArr2, A03);
                }
            }
        }
        return null;
    }
}
