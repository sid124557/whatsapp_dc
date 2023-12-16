package X;

import java.util.Arrays;

/* renamed from: X.2jv  reason: invalid class name and case insensitive filesystem */
public class C51502jv {
    public final byte A00;
    public final byte[] A01;

    public byte[] A00() {
        byte[][] bArr = new byte[2][];
        bArr[0] = new byte[]{this.A00};
        return AnonymousClass36A.A04(this.A01, bArr, 1);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C51502jv)) {
            return false;
        }
        return Arrays.equals(this.A01, ((C51502jv) obj).A01);
    }

    public int hashCode() {
        return Arrays.hashCode(this.A01);
    }

    public C51502jv(byte[] bArr, byte b) {
        this.A01 = bArr;
        this.A00 = b;
    }
}
