package X;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.8dj  reason: invalid class name and case insensitive filesystem */
public abstract class C176888dj extends C177088e3 implements C183628qM {
    public static final char[] A02 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final int A00;
    public final byte[] A01;

    public C177088e3 A0O() {
        return new C176068cP(this.A01, this.A00);
    }

    public void A0Q(C159057l2 r8, boolean z) {
        int i;
        if (this instanceof C176058cO) {
            byte b = (byte) this.A00;
            byte[] bArr = this.A01;
            if (z) {
                r8.A00.write(3);
            }
            int length = bArr.length;
            r8.A00(length + 1);
            OutputStream outputStream = r8.A00;
            outputStream.write(b);
            outputStream.write(bArr, 0, length);
            return;
        }
        byte[] bArr2 = this.A01;
        int length2 = bArr2.length;
        if (!(length2 == 0 || (i = this.A00) == 0)) {
            int i2 = length2 - 1;
            byte b2 = bArr2[i2];
            byte b3 = (byte) ((255 << i) & b2);
            if (b2 != b3) {
                byte b4 = (byte) i;
                if (z) {
                    r8.A00.write(3);
                }
                r8.A00(i2 + 2);
                OutputStream outputStream2 = r8.A00;
                outputStream2.write(b4);
                outputStream2.write(bArr2, 0, i2);
                outputStream2.write(b3);
                return;
            }
        }
        byte b5 = (byte) this.A00;
        if (z) {
            r8.A00.write(3);
        }
        r8.A00(length2 + 1);
        OutputStream outputStream3 = r8.A00;
        outputStream3.write(b5);
        outputStream3.write(bArr2, 0, length2);
    }

    public byte[] A0U() {
        byte[] bArr = this.A01;
        int length = bArr.length;
        if (length == 0) {
            return bArr;
        }
        byte[] A022 = C161007oo.A02(bArr);
        int i = length - 1;
        A022[i] = (byte) (A022[i] & (255 << this.A00));
        return A022;
    }

    public String BDM() {
        StringBuffer stringBuffer = new StringBuffer("#");
        try {
            byte[] A0L = A0L();
            for (int i = 0; i != A0L.length; i++) {
                char[] cArr = A02;
                stringBuffer.append(cArr[(A0L[i] >>> 4) & 15]);
                stringBuffer.append(cArr[A0L[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            throw new C144066zx(AnonymousClass000.A0a("Internal error encoding BitString: ", AnonymousClass001.A0o(), e), e);
        }
    }

    public int hashCode() {
        byte[] bArr = this.A01;
        int length = bArr.length - 1;
        if (length < 0) {
            return 1;
        }
        byte b = bArr[length];
        int i = this.A00;
        byte b2 = (byte) (b & (255 << i));
        int i2 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return ((i2 * 257) ^ b2) ^ i;
            }
            i2 = (i2 * 257) ^ bArr[length];
        }
    }

    public C176888dj(byte[] bArr, int i) {
        if (bArr != null) {
            if (bArr.length == 0) {
                if (i != 0) {
                    throw AnonymousClass001.A0c("zero length data with non-zero pad bits");
                }
            } else if (i > 7 || i < 0) {
                throw AnonymousClass001.A0c("pad bits cannot be greater than 7 or less than 0");
            }
            this.A01 = C161007oo.A02(bArr);
            this.A00 = i;
            return;
        }
        throw AnonymousClass001.A0g("'data' cannot be null");
    }

    public String toString() {
        return BDM();
    }
}
