package X;

import java.util.Arrays;

/* renamed from: X.0NX  reason: invalid class name */
public class AnonymousClass0NX {
    public final C04260Nl A00;
    public final byte[] A01;
    public final byte[] A02;

    public AnonymousClass0NX(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.A00 = new C04260Nl(str, bArr, bArr2, bArr3, bArr5);
        this.A02 = bArr4;
        this.A01 = bArr6;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BackupKey [");
        AnonymousClass000.A1B(this.A00, A0o);
        A0o.append(", hashedGoogleId=");
        A0o.append(Arrays.toString(this.A02));
        A0o.append(", cipherKey=");
        return AnonymousClass000.A0W(Arrays.toString(this.A01), A0o);
    }
}
