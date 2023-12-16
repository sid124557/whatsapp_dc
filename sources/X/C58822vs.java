package X;

import java.text.ParseException;

/* renamed from: X.2vs  reason: invalid class name and case insensitive filesystem */
public class C58822vs {
    public static final int[] A05 = {32, 32, 32, 32, 32};
    public final byte[] A00;
    public final byte[] A01;
    public final byte[] A02;
    public final byte[] A03;
    public final byte[] A04;

    public C58822vs(C52402lQ r10) {
        ParseException parseException;
        int[] iArr = A05;
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        byte[] A002 = AnonymousClass31Q.A00(r10.A02, "WhatsApp Mutation Keys".getBytes(C58152un.A0D), i);
        if (A002 != null) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i3 < r7) {
                    try {
                        int i5 = iArr[i3];
                        if (i5 < 0) {
                            parseException = new ParseException(AnonymousClass000.A0Y("Invalid length: ", AnonymousClass001.A0o(), i5), 0);
                            break;
                        } else {
                            i4 += i5;
                            i3++;
                        }
                    } catch (ParseException e) {
                        throw new C23301Sb(e);
                    }
                } else if (A002.length >= i4) {
                    byte[][] bArr = new byte[r7][];
                    int i6 = 0;
                    for (int i7 = 0; i7 < r7; i7++) {
                        int i8 = iArr[i7];
                        byte[] bArr2 = new byte[i8];
                        bArr[i7] = bArr2;
                        System.arraycopy(A002, i6, bArr2, 0, i8);
                        i6 += i8;
                    }
                    this.A00 = bArr[0];
                    this.A03 = bArr[1];
                    this.A04 = bArr[2];
                    this.A02 = bArr[3];
                    this.A01 = bArr[4];
                    return;
                } else {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Input too small: ");
                    parseException = new ParseException(AnonymousClass000.A0X(C58012uZ.A00(A002), A0o), 0);
                }
            }
        } else {
            parseException = new ParseException("Null input", 0);
        }
        throw parseException;
    }
}
