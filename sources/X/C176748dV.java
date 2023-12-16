package X;

import java.math.BigInteger;

/* renamed from: X.8dV  reason: invalid class name and case insensitive filesystem */
public class C176748dV extends C177088e3 {
    public final int A00;
    public final byte[] A01;

    public static C176748dV A0A(Object obj) {
        if (obj == null || (obj instanceof C176748dV)) {
            return (C176748dV) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (C176748dV) C177088e3.A0I((byte[]) obj);
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
            throw new ArithmeticException("ASN.1 Integer out of int range");
        }
    }

    public boolean A0V(BigInteger bigInteger) {
        if (bigInteger != null) {
            byte[] bArr = this.A01;
            int i = this.A00;
            int length = bArr.length;
            int max = Math.max(i, length - 4);
            int i2 = -1 & bArr[max];
            while (true) {
                max++;
                if (max >= length) {
                    break;
                }
                i2 = AnonymousClass6CA.A0C(bArr, max, i2 << 8);
            }
            if (i2 != bigInteger.intValue() || !new BigInteger(bArr).equals(bigInteger)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C161007oo.A00(this.A01);
    }

    public String toString() {
        return new BigInteger(this.A01).toString();
    }

    public C176748dV(byte[] bArr, boolean z) {
        byte[] bArr2;
        int length = bArr.length;
        if (length == 0 || (length != 1 && bArr[0] == (bArr[1] >> 7) && !C159797mT.A01("org.spongycastle.asn1.allow_unsafe_integer"))) {
            throw AnonymousClass001.A0c("malformed integer");
        }
        if (z) {
            bArr2 = C161007oo.A02(bArr);
        } else {
            bArr2 = bArr;
        }
        this.A01 = bArr2;
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
    }

    public static C176748dV A0B(C176908dl r2) {
        C177088e3 A03 = AnonymousClass8Q0.A03(r2);
        if (A03 instanceof C176748dV) {
            return A0A(A03);
        }
        return new C176748dV(C176778dY.A0C(A03), true);
    }

    public C176748dV(long j) {
        this.A01 = BigInteger.valueOf(j).toByteArray();
        this.A00 = 0;
    }

    public C176748dV(BigInteger bigInteger) {
        this.A01 = bigInteger.toByteArray();
        this.A00 = 0;
    }
}
