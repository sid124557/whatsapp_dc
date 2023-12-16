package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

@Deprecated
/* renamed from: X.72M  reason: invalid class name */
public final class AnonymousClass72M {
    @Deprecated
    public static byte[] A00(InputStream inputStream) {
        ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
        C162177rO.A02(inputStream);
        byte[] bArr = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return A0e.toByteArray();
            }
            A0e.write(bArr, 0, read);
        }
    }
}
