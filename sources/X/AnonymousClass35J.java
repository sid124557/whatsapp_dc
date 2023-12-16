package X;

import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

/* renamed from: X.35J  reason: invalid class name */
public class AnonymousClass35J {
    public static final Random A02 = AnonymousClass0x9.A1C();
    public static volatile SecureRandom A03;
    public final C56972sr A00;
    public final C56612sH A01;

    public static AnonymousClass2z0 A01(C95814uZ r1, AnonymousClass35J r2) {
        return r2.A04(r1, true);
    }

    public static String A02(C56972sr r1, C56612sH r2) {
        return C627236i.A06(A03(r1, r2, false));
    }

    public static byte[] A03(C56972sr r7, C56612sH r8, boolean z) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            long A0H = r8.A0H();
            byte[] bArr = new byte[8];
            for (int i = 7; i >= 0; i--) {
                bArr[i] = (byte) ((int) A0H);
                A0H >>= 8;
            }
            instance.update(bArr);
            instance.update(C56972sr.A06(r7).getBytes());
            byte[] bArr2 = new byte[16];
            if (z) {
                if (A03 == null) {
                    synchronized (AnonymousClass35J.class) {
                        if (A03 == null) {
                            A03 = new SecureRandom();
                        }
                    }
                }
                A03.nextBytes(bArr2);
            } else {
                A02.nextBytes(bArr2);
            }
            instance.update(bArr2);
            return instance.digest();
        } catch (NoSuchAlgorithmException e) {
            Log.w("Unable to provide message id hash due to missing md5 algorithm.", e);
            throw new IllegalStateException("Unable to provide message id hash due to missing md5 algorithm.", e);
        }
    }

    public AnonymousClass2z0 A04(C95814uZ r3, boolean z) {
        return AnonymousClass2z0.A05(r3, A02(this.A00, this.A01), z);
    }

    public AnonymousClass35J(C56972sr r1, C56612sH r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public static AnonymousClass2z0 A00(C56972sr r0, C56612sH r1, C95814uZ r2, boolean z) {
        return AnonymousClass2z0.A05(r2, A02(r0, r1), z);
    }
}
