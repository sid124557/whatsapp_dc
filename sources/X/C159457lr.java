package X;

import com.whatsapp.util.Log;
import java.security.MessageDigest;

/* renamed from: X.7lr  reason: invalid class name and case insensitive filesystem */
public class C159457lr {
    public static byte[] A01(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        AnonymousClass8QX A00 = A00(bArr, bArr2);
        AnonymousClass8QW r4 = new AnonymousClass8QW();
        byte[] bArr4 = new byte[32];
        A00.A03(bArr4, bArr4, 0, 32, 0);
        r4.BFu(new AnonymousClass8QN(bArr4));
        byte[] bArr5 = bArr3;
        int length = bArr3.length;
        int max = Math.max(length - 16, 0);
        byte[] bArr6 = new byte[16];
        byte[] bArr7 = new byte[16];
        byte[] bArr8 = new byte[max];
        r4.update(bArr3, 16, max);
        r4.B24(bArr6, 0);
        System.arraycopy(bArr3, 0, bArr7, 0, Math.min(length, 16));
        if (MessageDigest.isEqual(bArr6, bArr7)) {
            A00.A03(bArr5, bArr8, 16, max, 0);
            return bArr8;
        }
        Log.w("XSalsa20Poly1305/decrypt Presented MAC doesn't match calculated MAC (MAC prepended)");
        throw new AnonymousClass8RN();
    }

    public static AnonymousClass8QX A00(byte[] bArr, byte[] bArr2) {
        AnonymousClass8QX r5 = new AnonymousClass8QX();
        AnonymousClass8QP r1 = new AnonymousClass8QP(new AnonymousClass8QN(bArr), bArr2);
        byte[] bArr3 = r1.A01;
        if (bArr3.length == 24) {
            C834748n r12 = r1.A00;
            if (r12 == null) {
                boolean z = r5.A04;
                StringBuilder A0o = AnonymousClass001.A0o();
                if (z) {
                    A0o.append("XSalsa20");
                    throw AnonymousClass000.A0F(" doesn't support re-init with null key", A0o);
                }
                A0o.append("XSalsa20");
                throw AnonymousClass000.A0I(" KeyParameter can not be null for first initialisation", A0o);
            } else if (r12 instanceof AnonymousClass8QN) {
                byte[] bArr4 = ((AnonymousClass8QN) r12).A00;
                if (bArr4.length == 32) {
                    int i = 16;
                    int[] iArr = r5.A06;
                    int[] iArr2 = AnonymousClass8QX.A0A;
                    iArr[0] = iArr2[4];
                    iArr[5] = iArr2[5];
                    iArr[10] = iArr2[6];
                    iArr[15] = iArr2[7];
                    int i2 = 0;
                    int i3 = 0;
                    do {
                        i3++;
                        C161817qb.A05(bArr4, iArr, i2, i3);
                        i2 += 4;
                    } while (i3 < 4);
                    int i4 = 0;
                    do {
                        C161817qb.A05(bArr4, iArr, i, i4 + 11);
                        i += 4;
                        i4++;
                    } while (i4 < 4);
                    int i5 = 0;
                    int i6 = 0;
                    do {
                        C161817qb.A05(bArr3, iArr, i5, i6 + 6);
                        i5 += 4;
                        i6++;
                    } while (i6 < 2);
                    int i7 = 8;
                    int i8 = 0;
                    do {
                        C161817qb.A05(bArr3, iArr, i7, i8 + 8);
                        i7 += 4;
                        i8++;
                    } while (i8 < 2);
                    int[] iArr3 = new int[iArr.length];
                    AnonymousClass8QX.A02(iArr, iArr3);
                    iArr[1] = iArr3[0] - iArr[0];
                    iArr[2] = iArr3[5] - iArr[5];
                    iArr[3] = iArr3[10] - iArr[10];
                    iArr[4] = iArr3[15] - iArr[15];
                    iArr[11] = iArr3[6] - iArr[6];
                    iArr[12] = iArr3[7] - iArr[7];
                    iArr[13] = iArr3[8] - iArr[8];
                    iArr[14] = iArr3[9] - iArr[9];
                    int i9 = 16;
                    int i10 = 0;
                    do {
                        C161817qb.A05(bArr3, iArr, i9, i10 + 6);
                        i9 += 4;
                        i10++;
                    } while (i10 < 2);
                    r5.A03 = 0;
                    r5.A00 = 0;
                    r5.A01 = 0;
                    r5.A02 = 0;
                    int i11 = 0;
                    iArr[9] = 0;
                    iArr[8] = 0;
                    byte[] bArr5 = r5.A05;
                    int[] iArr4 = r5.A07;
                    AnonymousClass8QX.A02(iArr, iArr4);
                    for (int A1H : iArr4) {
                        AnonymousClass6C8.A1H(bArr5, A1H, i11);
                        i11 += 4;
                    }
                    r5.A04 = true;
                    return r5;
                }
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("XSalsa20");
                throw AnonymousClass000.A0F(" requires a 256 bit key", A0o2);
            } else {
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append("XSalsa20");
                throw AnonymousClass000.A0F(" Init parameters must contain a KeyParameter (or null for re-init)", A0o3);
            }
        } else {
            StringBuilder A0o4 = AnonymousClass001.A0o();
            A0o4.append("XSalsa20");
            A0o4.append(" requires exactly ");
            A0o4.append(24);
            throw AnonymousClass000.A0F(" bytes of IV", A0o4);
        }
    }

    public static byte[] A02(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        AnonymousClass8QX A00 = A00(bArr, bArr2);
        AnonymousClass8QW r1 = new AnonymousClass8QW();
        byte[] bArr4 = new byte[32];
        A00.A03(bArr4, bArr4, 0, 32, 0);
        int length = bArr3.length;
        byte[] bArr5 = new byte[(length + 16)];
        A00.A03(bArr3, bArr5, 0, length, 16);
        r1.BFu(new AnonymousClass8QN(bArr4));
        r1.update(bArr5, 16, length);
        r1.B24(bArr5, 0);
        return bArr5;
    }
}
