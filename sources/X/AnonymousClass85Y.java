package X;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* renamed from: X.85Y  reason: invalid class name */
public class AnonymousClass85Y implements C184848se {
    public MediaCodec.BufferInfo A00;
    public ByteBuffer A01;

    public void Blq(int i, int i2, long j, int i3) {
        this.A00.set(0, i2, 0, 2);
    }

    public MediaCodec.BufferInfo B4v() {
        return this.A00;
    }

    public ByteBuffer B50() {
        return this.A01;
    }

    public AnonymousClass85Y(C184848se r8) {
        ByteBuffer B50 = r8.B50();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(B50.limit());
        allocateDirect.put(B50.asReadOnlyBuffer());
        this.A01 = allocateDirect;
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        this.A00 = bufferInfo;
        MediaCodec.BufferInfo B4v = r8.B4v();
        bufferInfo.set(B4v.offset, B4v.size, B4v.presentationTimeUs, B4v.flags);
    }
}
