package com.google.android.exoplayer2.decoder;

import X.AnonymousClass6C7;
import X.AnonymousClass6OV;
import X.C180638lO;
import java.nio.ByteBuffer;

public class SimpleOutputBuffer extends AnonymousClass6OV {
    public ByteBuffer data;
    public final C180638lO owner;

    public void clear() {
        this.flags = 0;
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public ByteBuffer init(long j, int i) {
        this.timeUs = j;
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.data = AnonymousClass6C7.A0s(i);
        }
        this.data.position(0);
        this.data.limit(i);
        return this.data;
    }

    public void release() {
        this.owner.Bit(this);
    }

    public SimpleOutputBuffer(C180638lO r1) {
        this.owner = r1;
    }
}
