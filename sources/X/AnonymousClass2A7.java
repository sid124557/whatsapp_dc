package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* renamed from: X.2A7  reason: invalid class name */
public final class AnonymousClass2A7 {
    public static final byte[] A00(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(DefaultCrypto.BUFFER_SIZE, inputStream.available()));
        byte[] bArr = new byte[DefaultCrypto.BUFFER_SIZE];
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                C162457s7.A0D(byteArray);
                return byteArray;
            }
        }
    }
}
