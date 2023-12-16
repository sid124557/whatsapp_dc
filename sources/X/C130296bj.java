package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.6bj  reason: invalid class name and case insensitive filesystem */
public class C130296bj extends CodedOutputStream {
    public int A00;
    public final int A01;
    public final byte[] A02;

    public C130296bj(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.A02 = bArr;
            this.A00 = 0;
            this.A01 = i;
            return;
        }
        Object[] A1X = AnonymousClass0x9.A1X();
        AnonymousClass000.A1P(A1X, length, 0);
        AnonymousClass6C7.A1U(A1X, 0, i);
        throw AnonymousClass6C7.A0W("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", A1X);
    }

    public final void A0L(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.A02, this.A00, i2);
            this.A00 += i2;
        } catch (IndexOutOfBoundsException e) {
            Object[] A1X = AnonymousClass0x9.A1X();
            AnonymousClass000.A1L(A1X, this.A00);
            AnonymousClass000.A1M(A1X, this.A01);
            AnonymousClass000.A1P(A1X, i2, 2);
            throw new AnonymousClass6u9(String.format("Pos: %d, limit: %d, len: %d", A1X), e);
        }
    }
}
