package X;

import java.util.Arrays;

/* renamed from: X.0Nl  reason: invalid class name and case insensitive filesystem */
public class C04260Nl {
    public final String A00;
    public final byte[] A01;
    public final byte[] A02;
    public final byte[] A03;
    public final byte[] A04;

    public C04260Nl(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.A03 = bArr;
        this.A00 = str;
        this.A04 = bArr2;
        this.A02 = bArr3;
        this.A01 = bArr4;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BackupCipher [cipherVersion=");
        A0o.append(Arrays.toString(this.A03));
        A0o.append(" keyVersion=");
        A0o.append(this.A00);
        A0o.append(", serverSalt=");
        A0o.append(Arrays.toString(this.A04));
        A0o.append(", googleIdSalt=");
        A0o.append(Arrays.toString(this.A02));
        A0o.append(", encryptionIv=");
        return AnonymousClass000.A0W(Arrays.toString(this.A01), A0o);
    }
}
