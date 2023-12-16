package X;

import android.util.Base64;
import com.facebook.msys.mci.DefaultCrypto;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.31b  reason: invalid class name and case insensitive filesystem */
public class C615131b {
    public static String A01(C55682qk r2, File file, MessageDigest messageDigest) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(C107655bf.A0T(r2, file));
        try {
            A02(bufferedInputStream, messageDigest);
            String encodeToString = Base64.encodeToString(messageDigest.digest(), 2);
            bufferedInputStream.close();
            return encodeToString;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public static void A02(InputStream inputStream, MessageDigest messageDigest) {
        byte[] bArr = new byte[DefaultCrypto.BUFFER_SIZE];
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                messageDigest.update(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static String A00(C55682qk r1, File file) {
        try {
            return A01(r1, file, AnonymousClass0x7.A0t());
        } catch (NoSuchAlgorithmException e) {
            throw new IOException(e);
        }
    }
}
