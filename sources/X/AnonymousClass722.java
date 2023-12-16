package X;

import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* renamed from: X.722  reason: invalid class name */
public class AnonymousClass722 {
    public static boolean A00(MediaFormat mediaFormat, C184848se r9) {
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
        if (byteBuffer == null) {
            return false;
        }
        r9.Blq(0, byteBuffer.limit(), 0, 2);
        ByteBuffer B50 = r9.B50();
        B50.position(0);
        byteBuffer.position(0);
        B50.limit(byteBuffer.limit());
        B50.put(byteBuffer);
        return true;
    }
}
