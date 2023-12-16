package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* renamed from: X.75x  reason: invalid class name and case insensitive filesystem */
public final class C1454475x {
    public static byte[] A00(InputStream inputStream) {
        ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
        byte[] bArr = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
        while (true) {
            int read = inputStream.read(bArr, 0, ZipDecompressor.UNZIP_BUFFER_SIZE);
            if (read < 0) {
                return A0e.toByteArray();
            }
            A0e.write(bArr, 0, read);
        }
    }
}
