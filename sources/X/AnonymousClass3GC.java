package X;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: X.3GC  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3GC implements C182378oJ {
    public final /* synthetic */ C53872no A00;
    public final /* synthetic */ byte[] A01;

    public final InputStream B2Q(InputStream inputStream) {
        C53872no r4 = this.A00;
        byte[] bArr = this.A01;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(1);
        byte[][] bArr2 = new byte[3][];
        bArr2[0] = allocate.array();
        byte[] bArr3 = r4.A01;
        if (bArr3 != null) {
            byte[] A03 = AnonymousClass36A.A03(bArr3, bArr, bArr2, 1, 2);
            byte[] bArr4 = r4.A07;
            byte[] bArr5 = r4.A06;
            byte[] bArr6 = r4.A01;
            if (bArr6 != null) {
                byte[] bArr7 = r4.A00;
                if (bArr7 != null) {
                    byte[] A02 = C161227pF.A02(bArr4, bArr5, bArr6, bArr7, C58412vD.A01, 1);
                    C162457s7.A0D(A02);
                    return new C36841zy(AnonymousClass0x9.A0d(A03), new C140676uI(inputStream, A02, bArr));
                }
                throw AnonymousClass001.A0e("Required value was null.");
            }
            throw AnonymousClass001.A0e("Required value was null.");
        }
        throw AnonymousClass001.A0e("Required value was null.");
    }

    public /* synthetic */ AnonymousClass3GC(C53872no r1, byte[] bArr) {
        this.A00 = r1;
        this.A01 = bArr;
    }
}
