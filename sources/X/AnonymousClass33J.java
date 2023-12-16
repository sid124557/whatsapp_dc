package X;

import java.util.Arrays;

/* renamed from: X.33J  reason: invalid class name */
public class AnonymousClass33J {
    public final byte[] A00;

    public int A00() {
        byte[] bArr = this.A00;
        return (bArr[1] & 255) | ((bArr[0] & 255) << 8);
    }

    public AnonymousClass1AH A01() {
        C130546c9 A0G = AnonymousClass1AH.DEFAULT_INSTANCE.A0G();
        C172548Lq A09 = C18270x1.A09(A0G, this.A00);
        AnonymousClass1AH r1 = (AnonymousClass1AH) A0G.A00;
        r1.bitField0_ |= 1;
        r1.keyId_ = A09;
        return (AnonymousClass1AH) A0G.A06();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass33J)) {
            return false;
        }
        return Arrays.equals(this.A00, ((AnonymousClass33J) obj).A00);
    }

    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public AnonymousClass33J(byte[] bArr) {
        this.A00 = bArr;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SyncdKeyId{deviceId=");
        byte[] bArr = this.A00;
        A0o.append((bArr[1] & 255) | ((bArr[0] & 255) << 8));
        A0o.append(", epoch=");
        A0o.append(C18290x4.A07(bArr, bArr[2], 2));
        return AnonymousClass000.A0X("}", A0o);
    }

    public AnonymousClass33J(int i, int i2) {
        byte[] bArr = new byte[6];
        this.A00 = bArr;
        bArr[1] = (byte) i;
        bArr[0] = (byte) (i >> 8);
        bArr[5] = (byte) i2;
        bArr[4] = (byte) (i2 >> 8);
        bArr[3] = (byte) (i2 >> 16);
        bArr[2] = (byte) (i2 >> 24);
    }
}
