package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandom;

/* renamed from: X.362  reason: invalid class name */
public class AnonymousClass362 {
    public static final SecureRandom A04 = new SecureRandom();
    public byte[] A00;
    public final AnonymousClass5LG A01;
    public final C149857Oe[] A02;
    public final C149457Mn[] A03;

    public static AnonymousClass362 A00(byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        if (length >= 12) {
            short A022 = A02(bArr2, 0);
            byte b = bArr[2];
            boolean A1S = AnonymousClass000.A1S(b & 128);
            byte b2 = (byte) ((b >> 3) & 15);
            boolean A1S2 = AnonymousClass000.A1S(b & 4);
            boolean A1S3 = AnonymousClass000.A1S(b & 2);
            boolean A1S4 = AnonymousClass000.A1S(b & 1);
            byte b3 = bArr[3];
            short s = (short) ((byte) (b3 & 15));
            AnonymousClass5LG r3 = new AnonymousClass5LG(b2, A022, s, A02(bArr2, 4), A02(bArr2, 6), A02(bArr2, 8), A02(bArr2, 10), A1S, A1S2, A1S3, A1S4, AnonymousClass000.A1S(b3 & 128));
            int i = 12;
            int i2 = r3.A05;
            C149457Mn[] r11 = new C149457Mn[i2];
            int i3 = 0;
            int i4 = 0;
            while (i4 < i2) {
                C617632d A002 = C617632d.A00(bArr2, i);
                int i5 = A002.A00;
                int i6 = i + i5;
                if (length >= i6 + 4) {
                    C149457Mn r32 = new C149457Mn(A002, i5 + 4, A02(bArr2, i6), A02(bArr2, i6 + 2));
                    r11[i4] = r32;
                    i += r32.A00;
                    i4++;
                } else {
                    throw new C118215tB("insufficient data");
                }
            }
            int i7 = r3.A03;
            C149857Oe[] r8 = new C149857Oe[i7];
            while (i3 < i7) {
                C617632d A003 = C617632d.A00(bArr2, i);
                int i8 = A003.A00;
                int i9 = i + i8;
                int i10 = i9 + 10;
                if (length >= i10) {
                    short A023 = A02(bArr2, i9);
                    short A024 = A02(bArr2, i9 + 2);
                    int i11 = i9 + 4;
                    byte b4 = ((bArr2[i11] << 24) & -16777216) | ((bArr2[i11 + 1] << 16) & 16711680) | ((bArr2[i11 + 2] << 8) & 65280) | (bArr2[i11 + 3] & 255);
                    int A025 = A02(bArr2, i9 + 8);
                    if (length >= i10 + A025) {
                        byte[] bArr3 = new byte[A025];
                        System.arraycopy(bArr2, i10, bArr3, 0, A025);
                        C149857Oe r14 = new C149857Oe(A003, bArr3, b4, A025 + i8 + 10, A023, A024);
                        r8[i3] = r14;
                        i += r14.A00;
                        i3++;
                    } else {
                        throw new C118215tB("insufficient data");
                    }
                } else {
                    throw new C118215tB("insufficient data");
                }
            }
            AnonymousClass362 r1 = new AnonymousClass362(r3, r8, r11);
            r1.A00 = bArr2;
            return r1;
        }
        throw AnonymousClass001.A0c("bytes does not contain enough data");
    }

    public static AnonymousClass362 A01(C149457Mn[] r15) {
        return new AnonymousClass362(new AnonymousClass5LG((byte) 0, (short) A04.nextInt(65536), 0, 1, 0, 0, 0, false, false, false, true, false), new C149857Oe[0], r15);
    }

    public static short A02(byte[] bArr, int i) {
        return (short) (((bArr[i] << 8) & 65280) | (bArr[i + 1] & 255));
    }

    public AnonymousClass362(AnonymousClass5LG r1, C149857Oe[] r2, C149457Mn[] r3) {
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
    }

    public static void A03(OutputStream outputStream, short s) {
        outputStream.write((byte) ((65280 & s) >>> 8));
        outputStream.write((byte) (s & 255));
    }

    public static void A04(byte[] bArr, int i, short s) {
        bArr[i] = (byte) ((65280 & s) >>> 8);
        bArr[i + 1] = (byte) (s & 255);
    }

    public byte[] A05() {
        ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
        try {
            AnonymousClass5LG r3 = this.A01;
            byte[] bArr = new byte[12];
            A04(bArr, 0, r3.A01);
            bArr[2] = 0;
            int i = 128;
            int i2 = 0;
            if (r3.A0A) {
                i2 = 128;
            }
            byte b = (byte) i2;
            bArr[2] = b;
            byte b2 = (byte) (b | ((byte) ((r3.A00 & 15) << 3)));
            bArr[2] = b2;
            byte A002 = (byte) (b2 | AnonymousClass0x9.A00(r3.A07 ? 1 : 0));
            bArr[2] = A002;
            byte A022 = (byte) (A002 | C18310x6.A02(r3.A0B ? 1 : 0));
            bArr[2] = A022;
            bArr[2] = A022 | r3.A09 ? (byte) 1 : 0;
            bArr[3] = 0;
            if (!r3.A08) {
                i = 0;
            }
            byte b3 = (byte) (0 | i);
            bArr[3] = b3;
            bArr[3] = (byte) (b3 | ((byte) (r3.A06 & 15)));
            A04(bArr, 4, r3.A05);
            A04(bArr, 6, r3.A03);
            A04(bArr, 8, r3.A04);
            A04(bArr, 10, r3.A02);
            A0e.write(bArr);
            for (C149457Mn r1 : this.A03) {
                r1.A01.A02(A0e);
                A03(A0e, r1.A03);
                A03(A0e, r1.A02);
            }
            for (C149857Oe r6 : this.A02) {
                r6.A02.A02(A0e);
                A03(A0e, r6.A04);
                A03(A0e, r6.A03);
                int i3 = r6.A01;
                A0e.write((i3 >>> 24) & 255);
                A0e.write((i3 >>> 16) & 255);
                A0e.write((i3 >>> 8) & 255);
                A0e.write(i3 & 255);
                byte[] bArr2 = r6.A05;
                A03(A0e, (short) bArr2.length);
                A0e.write(bArr2);
            }
            return A0e.toByteArray();
        } catch (IOException unused) {
            return null;
        }
    }
}
