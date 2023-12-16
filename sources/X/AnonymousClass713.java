package X;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: X.713  reason: invalid class name */
public final class AnonymousClass713 {
    public static void A00(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(AnonymousClass000.A0Y("csd-", AnonymousClass001.A0o(), i), ByteBuffer.wrap(AnonymousClass6C9.A1V(list, i)));
        }
    }
}
