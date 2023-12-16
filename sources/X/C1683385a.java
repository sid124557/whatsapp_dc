package X;

import android.media.MediaCodec;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

/* renamed from: X.85a  reason: invalid class name and case insensitive filesystem */
public class C1683385a implements C184848se {
    public MediaCodec.BufferInfo A00;
    public boolean A01 = false;
    public final int A02;
    public final WeakReference A03;

    public void Blq(int i, int i2, long j, int i3) {
        MediaCodec.BufferInfo bufferInfo = this.A00;
        if (bufferInfo == null) {
            bufferInfo = new MediaCodec.BufferInfo();
            this.A00 = bufferInfo;
        }
        bufferInfo.set(0, i2, j, i3);
    }

    public MediaCodec.BufferInfo B4v() {
        return this.A00;
    }

    public ByteBuffer B50() {
        return (ByteBuffer) this.A03.get();
    }

    public C1683385a(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.A03 = AnonymousClass0x9.A14(byteBuffer);
        this.A02 = i;
        this.A00 = bufferInfo;
    }
}
