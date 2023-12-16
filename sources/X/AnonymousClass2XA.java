package X;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: X.2XA  reason: invalid class name */
public final class AnonymousClass2XA {
    public final C53862nn A00;

    public final InputStream A00(InputStream inputStream, byte[] bArr) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(1);
        byte[][] bArr2 = new byte[3][];
        bArr2[0] = allocate.array();
        C53862nn r2 = this.A00;
        byte[] bArr3 = r2.A01;
        if (bArr3 != null) {
            C18300x5.A1K(bArr3, bArr, bArr2);
            byte[] A06 = AnonymousClass36A.A06(bArr2);
            byte[] bArr4 = r2.A07;
            byte[] bArr5 = r2.A06;
            byte[] bArr6 = r2.A01;
            if (bArr6 != null) {
                byte[] bArr7 = r2.A00;
                if (bArr7 != null) {
                    byte[] A02 = C161227pF.A02(bArr4, bArr5, bArr6, bArr7, C58402vC.A01, 1);
                    C162457s7.A0D(A02);
                    return new C36841zy(AnonymousClass0x9.A0d(A06), new C140676uI(inputStream, A02, bArr));
                }
                throw AnonymousClass001.A0e("Required value was null.");
            }
            throw AnonymousClass001.A0e("Required value was null.");
        }
        throw AnonymousClass001.A0e("Required value was null.");
    }

    public AnonymousClass2XA(C53862nn r1) {
        this.A00 = r1;
    }
}
