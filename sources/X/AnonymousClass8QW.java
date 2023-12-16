package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.8QW  reason: invalid class name */
public class AnonymousClass8QW implements C185978uY {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public final C185768uD A0J;
    public final byte[] A0K;
    public final byte[] A0L;

    public void reset() {
        this.A00 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A02 = 0;
        this.A01 = 0;
    }

    public void update(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i2 > i3) {
            int i4 = this.A00;
            if (i4 == 16) {
                A02();
                this.A00 = 0;
                i4 = 0;
            }
            int A0A2 = AnonymousClass6C9.A0A(16, i4, i2 - i3);
            System.arraycopy(bArr, i3 + i, this.A0K, i4, A0A2);
            i3 += A0A2;
            this.A00 += A0A2;
        }
    }

    public final void A02() {
        int i = this.A00;
        int i2 = i;
        if (i < 16) {
            byte[] bArr = this.A0K;
            bArr[i] = 1;
            while (true) {
                i++;
                if (i >= 16) {
                    break;
                }
                bArr[i] = 0;
            }
        }
        byte[] bArr2 = this.A0K;
        long A0C2 = ((long) AnonymousClass6C7.A0C(bArr2, 0)) & 4294967295L;
        long A0C3 = ((long) AnonymousClass6C7.A0C(bArr2, 4)) & 4294967295L;
        long A0C4 = ((long) AnonymousClass6C7.A0C(bArr2, 8)) & 4294967295L;
        long A0C5 = 4294967295L & ((long) AnonymousClass6C7.A0C(bArr2, 12));
        int i3 = (int) (((long) this.A01) + (A0C2 & 67108863));
        this.A01 = i3;
        int i4 = (int) (((long) this.A02) + ((((A0C3 << 32) | A0C2) >>> 26) & 67108863));
        int i5 = i4;
        this.A02 = i4;
        int i6 = (int) (((long) this.A03) + (((A0C3 | (A0C4 << 32)) >>> 20) & 67108863));
        int i7 = i6;
        this.A03 = i6;
        int i8 = (int) (((long) this.A04) + ((((A0C5 << 32) | A0C4) >>> 14) & 67108863));
        this.A04 = i8;
        int i9 = (int) (((long) this.A05) + (A0C5 >>> 8));
        this.A05 = i9;
        if (i2 == 16) {
            i9 += EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
            this.A05 = i9;
        }
        int i10 = this.A0A;
        long A0M = AnonymousClass6C8.A0M(i3) * ((long) i10);
        int i11 = this.A0I;
        long A012 = A01(i5, i11, A0M);
        int i12 = this.A0H;
        long A013 = A01(i7, i12, A012);
        int i13 = this.A0G;
        long A014 = A01(i9, this.A0F, A01(i8, i13, A013));
        int i14 = this.A0B;
        long A015 = A01(i9, i13, A01(i8, i12, A01(i7, i11, A01(i5, i10, AnonymousClass6C8.A0M(i3) * ((long) i14)))));
        int i15 = this.A0C;
        long A016 = A01(i9, i12, A01(i8, i11, A01(i7, i10, A01(i5, i14, AnonymousClass6C8.A0M(i3) * ((long) i15)))));
        int i16 = this.A0D;
        long A017 = A01(i9, i11, A01(i8, i10, A01(i7, i14, A01(i5, i15, AnonymousClass6C8.A0M(i3) * ((long) i16)))));
        long A018 = A01(i9, i10, A01(i8, i14, A01(i7, i15, A01(i5, i16, AnonymousClass6C8.A0M(i3) * ((long) this.A0E)))));
        long j = A015 + (A014 >>> 26);
        long j2 = A016 + (j >>> 26);
        this.A03 = ((int) j2) & 67108863;
        long j3 = A017 + (j2 >>> 26);
        this.A04 = ((int) j3) & 67108863;
        long j4 = A018 + (j3 >>> 26);
        this.A05 = ((int) j4) & 67108863;
        int i17 = (((int) A014) & 67108863) + (((int) (j4 >>> 26)) * 5);
        this.A02 = (((int) j) & 67108863) + (i17 >>> 26);
        this.A01 = i17 & 67108863;
    }

    public int B24(byte[] bArr, int i) {
        if (i + 16 <= bArr.length) {
            if (this.A00 > 0) {
                A02();
            }
            int i2 = this.A02;
            int i3 = this.A01;
            int i4 = i2 + (i3 >>> 26);
            int i5 = this.A03 + (i4 >>> 26);
            int i6 = this.A04 + (i5 >>> 26);
            int i7 = i5 & 67108863;
            int i8 = this.A05 + (i6 >>> 26);
            int i9 = i6 & 67108863;
            int i10 = (i3 & 67108863) + ((i8 >>> 26) * 5);
            int i11 = i8 & 67108863;
            int i12 = (i4 & 67108863) + (i10 >>> 26);
            int i13 = i10 & 67108863;
            int i14 = i13 + 5;
            int i15 = (i14 >>> 26) + i12;
            int i16 = (i15 >>> 26) + i7;
            int i17 = (i16 >>> 26) + i9;
            int i18 = 67108863 & i17;
            int i19 = ((i17 >>> 26) + i11) - 67108864;
            int i20 = (i19 >>> 31) - 1;
            int i21 = ~i20;
            int i22 = (i13 & i21) | (i14 & 67108863 & i20);
            this.A01 = i22;
            int i23 = (i12 & i21) | (i15 & 67108863 & i20);
            this.A02 = i23;
            int i24 = (i7 & i21) | (i16 & 67108863 & i20);
            this.A03 = i24;
            int i25 = (i18 & i20) | (i9 & i21);
            this.A04 = i25;
            int i26 = (i11 & i21) | (i19 & i20);
            this.A05 = i26;
            long j = (((long) (i22 | (i23 << 26))) & 4294967295L) + (((long) this.A06) & 4294967295L);
            long j2 = (((long) ((i23 >>> 6) | (i24 << 20))) & 4294967295L) + (((long) this.A07) & 4294967295L);
            long j3 = (((long) ((i24 >>> 12) | (i25 << 14))) & 4294967295L) + (((long) this.A08) & 4294967295L);
            AnonymousClass6C8.A1H(bArr, (int) j, i);
            long j4 = j2 + (j >>> 32);
            AnonymousClass6C8.A1H(bArr, (int) j4, i + 4);
            long j5 = j3 + (j4 >>> 32);
            AnonymousClass6C8.A1H(bArr, (int) j5, i + 8);
            AnonymousClass6C8.A1H(bArr, (int) ((((long) ((i25 >>> 18) | (i26 << 8))) & 4294967295L) + (4294967295L & ((long) this.A09)) + (j5 >>> 32)), i + 12);
            reset();
            return 16;
        }
        throw new C177198eE("Output buffer is too short.");
    }

    public int B9H() {
        return 16;
    }

    public void BFu(C834748n r11) {
        byte[] bArr;
        C185768uD r6 = this.A0J;
        if (r6 == null) {
            bArr = null;
        } else if (r11 instanceof AnonymousClass8QP) {
            AnonymousClass8QP r112 = (AnonymousClass8QP) r11;
            bArr = r112.A01;
            r11 = r112.A00;
        } else {
            throw AnonymousClass001.A0c("Poly1305 requires an IV when used with a block cipher.");
        }
        if (r11 instanceof AnonymousClass8QN) {
            byte[] bArr2 = ((AnonymousClass8QN) r11).A00;
            if (bArr2.length == 32) {
                int i = 16;
                if (r6 == null || (bArr != null && bArr.length == 16)) {
                    int A0C2 = AnonymousClass6C7.A0C(bArr2, 0);
                    int A0C3 = AnonymousClass6C7.A0C(bArr2, 4);
                    int A0C4 = AnonymousClass6C7.A0C(bArr2, 8);
                    int A0C5 = AnonymousClass6C7.A0C(bArr2, 12);
                    this.A0A = 67108863 & A0C2;
                    int i2 = ((A0C2 >>> 26) | (A0C3 << 6)) & 67108611;
                    this.A0B = i2;
                    int i3 = ((A0C3 >>> 20) | (A0C4 << 12)) & 67092735;
                    this.A0C = i3;
                    int i4 = ((A0C4 >>> 14) | (A0C5 << 18)) & 66076671;
                    this.A0D = i4;
                    int i5 = (A0C5 >>> 8) & 1048575;
                    this.A0E = i5;
                    this.A0F = i2 * 5;
                    this.A0G = i3 * 5;
                    this.A0H = i4 * 5;
                    this.A0I = i5 * 5;
                    if (r6 != null) {
                        byte[] bArr3 = new byte[16];
                        r6.BFw(new AnonymousClass8QN(bArr2, 16, 16), true);
                        r6.Bha(bArr, bArr3, 0, 0);
                        bArr2 = bArr3;
                        i = 0;
                    }
                    this.A06 = AnonymousClass6C7.A0C(bArr2, i);
                    this.A07 = AnonymousClass6C7.A0C(bArr2, i + 4);
                    this.A08 = AnonymousClass6C7.A0C(bArr2, i + 8);
                    this.A09 = AnonymousClass6C7.A0C(bArr2, i + 12);
                    reset();
                    return;
                }
                throw AnonymousClass001.A0c("Poly1305 requires a 128 bit IV.");
            }
            throw AnonymousClass001.A0c("Poly1305 key must be 256 bits.");
        }
        throw AnonymousClass001.A0c("Poly1305 requires a key.");
    }

    public void BrT(byte b) {
        byte[] bArr = this.A0L;
        bArr[0] = b;
        update(bArr, 0, 1);
    }

    public AnonymousClass8QW(C185768uD r3) {
        this.A0L = new byte[1];
        this.A0K = new byte[16];
        this.A00 = 0;
        if (r3.B4g() == 16) {
            this.A0J = r3;
            return;
        }
        throw AnonymousClass001.A0c("Poly1305 requires a 128 bit block cipher.");
    }

    public static final long A00(int i, int i2) {
        return AnonymousClass6C8.A0M(i) * ((long) i2);
    }

    public static long A01(int i, int i2, long j) {
        return j + A00(i, i2);
    }

    public AnonymousClass8QW() {
        this.A0L = new byte[1];
        this.A0K = new byte[16];
        this.A00 = 0;
        this.A0J = null;
    }
}
