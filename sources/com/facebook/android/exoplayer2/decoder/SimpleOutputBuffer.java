package com.facebook.android.exoplayer2.decoder;

import X.AnonymousClass6C7;
import X.C1463579y;
import X.C152737a2;
import java.nio.ByteBuffer;

public class SimpleOutputBuffer extends C1463579y {
    public int A00;
    public long A01;
    public ByteBuffer data;
    public final C152737a2 owner;

    public ByteBuffer init(long j, int i) {
        this.A01 = j;
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.data = AnonymousClass6C7.A0s(i);
        }
        this.data.position(0);
        this.data.limit(i);
        return this.data;
    }

    public void release() {
        C152737a2 r4 = this.owner;
        Object obj = r4.A07;
        synchronized (obj) {
            this.A00 = 0;
            ByteBuffer byteBuffer = this.data;
            if (byteBuffer != null) {
                byteBuffer.clear();
            }
            SimpleOutputBuffer[] simpleOutputBufferArr = r4.A0C;
            int i = r4.A01;
            r4.A01 = i + 1;
            simpleOutputBufferArr[i] = this;
            if (!r4.A09.isEmpty() && r4.A01 > 0) {
                obj.notify();
            }
        }
    }

    public SimpleOutputBuffer(C152737a2 r1) {
        this.owner = r1;
    }

    public SimpleOutputBuffer() {
    }
}
