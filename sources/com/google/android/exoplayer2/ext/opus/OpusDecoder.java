package com.google.android.exoplayer2.ext.opus;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass6C7;
import X.AnonymousClass6C9;
import X.AnonymousClass6CA;
import X.AnonymousClass6OV;
import X.AnonymousClass6OX;
import X.AnonymousClass7PP;
import X.AnonymousClass86D;
import X.C126496Oc;
import X.C143456yu;
import X.C143896ze;
import X.C161487pm;
import X.C18290x4;
import com.google.android.exoplayer2.decoder.SimpleOutputBuffer;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import java.nio.ByteBuffer;
import java.util.List;

public final class OpusDecoder extends AnonymousClass86D {
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final boolean A05;

    private native void opusClose(long j);

    private native int opusDecode(long j, long j2, ByteBuffer byteBuffer, int i, SimpleOutputBuffer simpleOutputBuffer);

    private native int opusGetErrorCode(long j);

    private native String opusGetErrorMessage(long j);

    private native long opusInit(int i, int i2, int i3, int i4, int i5, byte[] bArr);

    private native void opusReset(long j);

    private native int opusSecureDecode(long j, long j2, ByteBuffer byteBuffer, int i, SimpleOutputBuffer simpleOutputBuffer, int i2, ExoMediaCrypto exoMediaCrypto, int i3, byte[] bArr, byte[] bArr2, int i4, int[] iArr, int[] iArr2);

    private native void opusSetFloatOutput();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpusDecoder(List list, int i, boolean z) {
        super(new C126496Oc[16], new SimpleOutputBuffer[16]);
        int A0B;
        int i2;
        boolean z2;
        List list2 = list;
        int size = list2.size();
        byte b = 1;
        if (size != 1 && size != 3) {
            throw new AnonymousClass6OX("Invalid initialization data size");
        } else if (size != 3 || (AnonymousClass6C9.A1V(list2, 1).length == 8 && AnonymousClass6C9.A1V(list2, 2).length == 8)) {
            if (list2.size() == 3) {
                A0B = AnonymousClass6C9.A0C(AnonymousClass6C7.A0I(list2, 1));
            } else {
                byte[] bArr = (byte[]) C18290x4.A0k(list2);
                A0B = AnonymousClass6CA.A0B(bArr, 10, AnonymousClass6C9.A0F(bArr, 11));
            }
            this.A02 = A0B;
            if (list2.size() == 3) {
                i2 = AnonymousClass6C9.A0C(AnonymousClass6C7.A0I(list2, 2));
            } else {
                i2 = 3840;
            }
            this.A03 = i2;
            byte[] A1V = AnonymousClass6C9.A1V(list2, 0);
            int length = A1V.length;
            if (length >= 19) {
                byte b2 = A1V[9] & 255;
                this.A01 = b2;
                if (b2 <= 8) {
                    short A0F = (short) (AnonymousClass6C9.A0F(A1V, 17) | (A1V[16] & 255));
                    byte[] bArr2 = new byte[8];
                    if (A1V[18] == 0) {
                        if (b2 <= 2) {
                            z2 = AnonymousClass000.A1U(b2, 2);
                            bArr2[0] = 0;
                            bArr2[1] = 1;
                        } else {
                            throw new AnonymousClass6OX("Invalid header, missing stream map");
                        }
                    } else if (length >= b2 + 21) {
                        b = A1V[19] & 255;
                        z2 = A1V[20] & true;
                        System.arraycopy(A1V, 21, bArr2, 0, b2);
                    } else {
                        throw new AnonymousClass6OX("Invalid header length");
                    }
                    long opusInit = opusInit(48000, b2, b, z2 ? 1 : 0, A0F, bArr2);
                    this.A04 = opusInit;
                    if (opusInit != 0) {
                        int i3 = this.A00;
                        C161487pm.A04(AnonymousClass000.A1U(i3, r2));
                        for (C126496Oc A012 : this.A0B) {
                            A012.A01(i);
                        }
                        this.A05 = z;
                        if (z) {
                            opusSetFloatOutput();
                            return;
                        }
                        return;
                    }
                    throw new AnonymousClass6OX("Failed to initialize decoder");
                }
                throw new AnonymousClass6OX(AnonymousClass000.A0Y("Invalid channel count: ", AnonymousClass001.A0o(), b2));
            }
            throw new AnonymousClass6OX("Invalid header length");
        } else {
            throw new AnonymousClass6OX("Invalid pre-skip or seek pre-roll");
        }
    }

    public /* bridge */ /* synthetic */ C143896ze A03(C126496Oc r24, AnonymousClass6OV r25, boolean z) {
        int opusDecode;
        int i;
        SimpleOutputBuffer simpleOutputBuffer = (SimpleOutputBuffer) r25;
        C126496Oc r3 = r24;
        if (z) {
            opusReset(this.A04);
            if (r3.A00 == 0) {
                i = this.A02;
            } else {
                i = this.A03;
            }
            this.A00 = i;
        }
        ByteBuffer byteBuffer = r3.A01;
        AnonymousClass7PP r6 = r3.A05;
        boolean A1U = AnonymousClass000.A1U(r3.flags & 1073741824, 1073741824);
        long j = this.A04;
        long j2 = r3.A00;
        int limit = byteBuffer.limit();
        if (A1U) {
            int i2 = r6.A00;
            byte[] bArr = r6.A03;
            bArr.getClass();
            byte[] bArr2 = r6.A02;
            bArr2.getClass();
            opusDecode = opusSecureDecode(j, j2, byteBuffer, limit, simpleOutputBuffer, 48000, (ExoMediaCrypto) null, i2, bArr, bArr2, r6.A01, r6.A04, r6.A05);
        } else {
            opusDecode = opusDecode(j, j2, byteBuffer, limit, simpleOutputBuffer);
        }
        if (opusDecode >= 0) {
            ByteBuffer byteBuffer2 = simpleOutputBuffer.data;
            byteBuffer2.position(0);
            byteBuffer2.limit(opusDecode);
            int i3 = this.A00;
            if (i3 <= 0) {
                return null;
            }
            int i4 = this.A01 * 2;
            int i5 = i3 * i4;
            if (opusDecode <= i5) {
                this.A00 = i3 - (opusDecode / i4);
                simpleOutputBuffer.addFlag(Integer.MIN_VALUE);
                byteBuffer2.position(opusDecode);
                return null;
            }
            this.A00 = 0;
            byteBuffer2.position(i5);
            return null;
        } else if (opusDecode == -2) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Drm error: ");
            String A0X = AnonymousClass000.A0X(opusGetErrorMessage(j), A0o);
            return new AnonymousClass6OX(A0X, new C143456yu(opusGetErrorCode(j), A0X));
        } else {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("Decode error: ");
            return new AnonymousClass6OX(AnonymousClass000.A0X(opusGetErrorMessage((long) opusDecode), A0o2));
        }
    }

    public String getName() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("libopus");
        return AnonymousClass000.A0X(OpusLibrary.opusGetVersion(), A0o);
    }

    public void release() {
        super.release();
        opusClose(this.A04);
    }
}
