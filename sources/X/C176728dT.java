package X;

import java.math.BigInteger;

/* renamed from: X.8dT  reason: invalid class name and case insensitive filesystem */
public class C176728dT extends C177088e3 {
    public static C176728dT[] A02 = new C176728dT[12];
    public final int A00;
    public final byte[] A01;

    public static C176728dT A0A(Object obj) {
        if (obj == null || (obj instanceof C176728dT)) {
            return (C176728dT) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (C176728dT) C177088e3.A0I((byte[]) obj);
            } catch (Exception e) {
                StringBuilder A0o = AnonymousClass001.A0o();
                C18270x1.A1H(A0o, "encoding error in getInstance: ", e);
                throw C18310x6.A0d(A0o);
            }
        } else {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            C18260x0.A1T(A0o2, "illegal object in getInstance: ", obj);
            throw C18310x6.A0d(A0o2);
        }
    }

    public int A0U() {
        byte[] bArr = this.A01;
        int length = bArr.length;
        int i = this.A00;
        if (length - i <= 4) {
            int max = Math.max(i, length - 4);
            int i2 = -1 & bArr[max];
            while (true) {
                max++;
                if (max >= length) {
                    return i2;
                }
                i2 = AnonymousClass6CA.A0C(bArr, max, i2 << 8);
            }
        } else {
            throw new ArithmeticException("ASN.1 Enumerated out of int range");
        }
    }

    public int hashCode() {
        return C161007oo.A00(this.A01);
    }

    public C176728dT(byte[] bArr) {
        int length = bArr.length;
        if (length == 0 || (length != 1 && bArr[0] == (bArr[1] >> 7) && !C159797mT.A01("org.spongycastle.asn1.allow_unsafe_integer"))) {
            throw AnonymousClass001.A0c("malformed enumerated");
        } else if ((bArr[0] & 128) == 0) {
            this.A01 = C161007oo.A02(bArr);
            int i = length - 1;
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                if (bArr[i2] != (bArr[i3] >> 7)) {
                    break;
                }
                i2 = i3;
            }
            this.A00 = i2;
        } else {
            throw AnonymousClass001.A0c("enumerated must be non-negative");
        }
    }

    public C176728dT(int i) {
        if (i >= 0) {
            this.A01 = BigInteger.valueOf((long) i).toByteArray();
            this.A00 = 0;
            return;
        }
        throw AnonymousClass001.A0c("enumerated must be non-negative");
    }
}
