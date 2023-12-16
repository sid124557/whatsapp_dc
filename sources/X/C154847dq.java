package X;

import android.util.Base64;
import java.util.Random;

/* renamed from: X.7dq  reason: invalid class name and case insensitive filesystem */
public final class C154847dq {
    public static final Random A00 = new Random();

    public static String A00() {
        byte[] bArr = new byte[16];
        A00.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
