package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.crypto.Mac;

/* renamed from: X.35L  reason: invalid class name */
public class AnonymousClass35L {
    public final int A00;
    public final byte[][] A01;

    public static void A00(byte[][] bArr, int i) {
        int length;
        if (i == 0 && (length = bArr.length) > 1) {
            int i2 = 2;
            if (bArr[1].length == 0) {
                while (i2 < length) {
                    if (bArr[i2].length <= 0) {
                        i2++;
                    } else {
                        throw AnonymousClass001.A0c("Invalid chain key values for starting iteration");
                    }
                }
                return;
            }
        }
        int i3 = 0;
        while (i3 < bArr.length) {
            if (bArr[i3].length != 0) {
                i3++;
            } else {
                throw AnonymousClass001.A0c("Invalid chain key values");
            }
        }
    }

    public static final byte[] A01(byte[] bArr, byte b) {
        try {
            Mac A0k = AnonymousClass0x2.A0k(DefaultCrypto.HMAC_SHA256, bArr);
            A0k.update(b);
            return A0k.doFinal();
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }

    public AnonymousClass35L A02(int i) {
        if (i > 0) {
            int i2 = this.A00;
            int i3 = i + i2;
            int length = this.A01.length;
            int[] A002 = AnonymousClass2AX.A00(i2, length);
            int[] A003 = AnonymousClass2AX.A00(i3, length);
            byte[][] A03 = A03();
            int i4 = 0;
            while (true) {
                int length2 = A03.length;
                if (i4 >= length2) {
                    return new AnonymousClass35L(A03, i3);
                }
                while (true) {
                    int i5 = A003[i4];
                    int i6 = A002[i4];
                    if (i5 <= i6) {
                        break;
                    }
                    if (i4 < length2 - 1 && i5 - 1 == i6) {
                        int i7 = i4 + 1;
                        A03[i7] = A01(A03[i4], (byte) (i4 + 2 + 1));
                        A002[i7] = 0;
                    }
                    A03[i4] = A01(A03[i4], (byte) (i4 + 2));
                    A002[i4] = A002[i4] + 1;
                }
                i4++;
            }
        } else {
            throw AnonymousClass000.A0G("count must be a positive number: ", AnonymousClass001.A0o(), i);
        }
    }

    public byte[][] A03() {
        byte[] bArr;
        byte[][] bArr2 = this.A01;
        int length = bArr2.length;
        byte[][] bArr3 = new byte[length][];
        if (this.A00 == 0 && length > 1 && bArr2[1].length == 0) {
            int i = 0;
            while (i < length - 1) {
                if (i == 0) {
                    bArr = bArr2[0];
                } else {
                    bArr = bArr3[i];
                }
                int i2 = i + 1;
                int i3 = i + 2;
                bArr3[i2] = A01(bArr, (byte) (i3 + 1));
                bArr3[i] = A01(bArr, (byte) i3);
                i = i2;
            }
        } else {
            for (int i4 = 0; i4 < length; i4++) {
                byte[] bArr4 = new byte[bArr2[i4].length];
                bArr3[i4] = bArr4;
                byte[] bArr5 = bArr2[i4];
                System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
            }
        }
        return bArr3;
    }

    public AnonymousClass35L(List list) {
        int i;
        if (list.isEmpty() || 32 % list.size() != 0) {
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass000.A1H("Invalid number of chain keys: ", A0o, list);
            throw C18310x6.A0d(A0o);
        }
        int size = list.size();
        int[] iArr = new int[size];
        this.A01 = new byte[size][];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ((C21361Bn) list.get(i2)).iteration_;
            this.A01[i2] = ((C21361Bn) list.get(i2)).seed_.A07();
        }
        int[] iArr2 = new int[size];
        int i3 = 0;
        while (true) {
            i = size - 1;
            if (i3 >= i) {
                break;
            }
            iArr2[i3] = iArr[i3] - 1;
            i3++;
        }
        iArr2[i] = iArr[i];
        int i4 = 32 / size;
        int i5 = (int) ((1 << i4) - 1);
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            i6 += (iArr2[(size - i7) - 1] & i5) << (i4 * i7);
        }
        this.A00 = i6;
        A00(this.A01, i6);
    }

    public AnonymousClass35L(byte[][] bArr, int i) {
        int length = bArr.length;
        if (length == 0 || 32 % length != 0) {
            throw AnonymousClass000.A0G("Invalid number of chain keys: ", AnonymousClass001.A0o(), length);
        }
        A00(bArr, i);
        this.A00 = i;
        this.A01 = bArr;
    }

    public AnonymousClass35L(byte[] bArr) {
        int i = 1 << 3;
        this.A00 = 0;
        byte[][] bArr2 = new byte[i][];
        this.A01 = bArr2;
        bArr2[0] = bArr;
        for (int i2 = 1; i2 < i; i2++) {
            bArr2[i2] = new byte[0];
        }
    }
}
