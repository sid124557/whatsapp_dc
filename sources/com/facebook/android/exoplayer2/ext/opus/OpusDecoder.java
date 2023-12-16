package com.facebook.android.exoplayer2.ext.opus;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass6C7;
import X.AnonymousClass6C9;
import X.AnonymousClass6Jl;
import X.C125716Jc;
import X.C143426yr;
import X.C143656zG;
import X.C152737a2;
import X.C159197lM;
import com.facebook.android.exoplayer2.decoder.SimpleOutputBuffer;
import java.nio.ByteBuffer;
import java.util.List;

public final class OpusDecoder extends C152737a2 {
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;

    private native void opusClose(long j);

    private native int opusDecode(long j, long j2, ByteBuffer byteBuffer, int i, SimpleOutputBuffer simpleOutputBuffer);

    private native int opusGetErrorCode(long j);

    private native String opusGetErrorMessage(long j);

    private native long opusInit(int i, int i2, int i3, int i4, int i5, byte[] bArr);

    private native void opusReset(long j);

    public /* bridge */ /* synthetic */ C143656zG A00(AnonymousClass6Jl r15, SimpleOutputBuffer simpleOutputBuffer, boolean z) {
        int i;
        if (z) {
            opusReset(this.A04);
            if (r15.A00 == 0) {
                i = this.A03;
            } else {
                i = this.A02;
            }
            this.A00 = i;
        }
        ByteBuffer byteBuffer = r15.A01;
        if ((r15.A00 & 1073741824) != 1073741824) {
            SimpleOutputBuffer simpleOutputBuffer2 = simpleOutputBuffer;
            int opusDecode = opusDecode(this.A04, r15.A00, byteBuffer, byteBuffer.limit(), simpleOutputBuffer2);
            if (opusDecode >= 0) {
                ByteBuffer byteBuffer2 = simpleOutputBuffer2.data;
                byteBuffer2.position(0);
                byteBuffer2.limit(opusDecode);
                int i2 = this.A00;
                if (i2 <= 0) {
                    return null;
                }
                int i3 = this.A01 * 2;
                int i4 = i2 * i3;
                if (opusDecode <= i4) {
                    this.A00 = i2 - (opusDecode / i3);
                    simpleOutputBuffer2.A00 = Integer.MIN_VALUE | simpleOutputBuffer2.A00;
                    byteBuffer2.position(opusDecode);
                    return null;
                }
                this.A00 = 0;
                byteBuffer2.position(i4);
                return null;
            } else if (opusDecode != -2) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Decode error: ");
                return new C125716Jc(AnonymousClass000.A0X(opusGetErrorMessage((long) opusDecode), A0o));
            }
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("Drm error: ");
        long j = this.A04;
        String A0X = AnonymousClass000.A0X(opusGetErrorMessage(j), A0o2);
        return new C125716Jc(A0X, new C143426yr(opusGetErrorCode(j), A0X));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpusDecoder(List list, int i) {
        super(new AnonymousClass6Jl[16], new SimpleOutputBuffer[16]);
        byte b;
        boolean z;
        int i2;
        List list2 = list;
        byte[] A1V = AnonymousClass6C9.A1V(list2, 0);
        int length = A1V.length;
        if (length >= 19) {
            byte b2 = A1V[9] & 255;
            this.A01 = b2;
            if (b2 <= 8) {
                byte A0F = AnonymousClass6C9.A0F(A1V, 11) | (A1V[10] & 255);
                byte A0F2 = AnonymousClass6C9.A0F(A1V, 17) | (A1V[16] & 255);
                byte[] bArr = new byte[8];
                if (A1V[18] == 0) {
                    if (b2 <= 2) {
                        z = AnonymousClass000.A1U(b2, 2);
                        bArr[0] = 0;
                        bArr[1] = 1;
                        b = 1;
                    } else {
                        throw new C125716Jc("Invalid Header, missing stream map.");
                    }
                } else if (length >= b2 + 21) {
                    b = A1V[19] & 255;
                    z = A1V[20] & true;
                    System.arraycopy(A1V, 21, bArr, 0, b2);
                } else {
                    throw new C125716Jc("Header size is too small.");
                }
                if (list2.size() != 3) {
                    this.A03 = A0F;
                    i2 = 3840;
                } else if (AnonymousClass6C9.A1V(list2, 1).length == 8 && AnonymousClass6C9.A1V(list2, 2).length == 8) {
                    long A0I = AnonymousClass6C7.A0I(list2, 1);
                    long A0I2 = AnonymousClass6C7.A0I(list2, 2);
                    this.A03 = AnonymousClass6C9.A0C(A0I);
                    i2 = AnonymousClass6C9.A0C(A0I2);
                } else {
                    throw new C125716Jc("Invalid Codec Delay or Seek Preroll");
                }
                this.A02 = i2;
                long opusInit = opusInit(48000, b2, b, z ? 1 : 0, A0F2, bArr);
                this.A04 = opusInit;
                if (opusInit != 0) {
                    int i3 = this.A00;
                    C159197lM.A02(AnonymousClass000.A1U(i3, r2));
                    for (AnonymousClass6Jl A012 : this.A0B) {
                        A012.A01(i);
                    }
                    return;
                }
                throw new C125716Jc("Failed to initialize decoder");
            }
            throw new C125716Jc(AnonymousClass000.A0Y("Invalid channel count: ", AnonymousClass001.A0o(), b2));
        }
        throw new C125716Jc("Header size is too small.");
    }

    public void A01() {
        super.A01();
        opusClose(this.A04);
    }
}
