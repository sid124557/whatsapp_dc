package X;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* renamed from: X.85Z  reason: invalid class name */
public class AnonymousClass85Z implements C184848se {
    public final MediaCodec.BufferInfo A00 = new MediaCodec.BufferInfo();
    public final ByteBuffer A01 = ByteBuffer.allocateDirect(1048576);

    public void Blq(int i, int i2, long j, int i3) {
        this.A00.set(0, i2, j, i3);
    }

    public MediaCodec.BufferInfo B4v() {
        return this.A00;
    }

    public ByteBuffer B50() {
        return this.A01;
    }
}
