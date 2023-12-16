package X;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: X.8Qe  reason: invalid class name and case insensitive filesystem */
public class C173438Qe implements C188618zD {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public C185768uD A07;
    public C147597Ex A08;
    public C150767Sd A09;
    public boolean A0A;
    public boolean A0B;
    public byte[] A0C;
    public byte[] A0D;
    public byte[] A0E;
    public byte[] A0F;
    public byte[] A0G;
    public byte[] A0H;
    public byte[] A0I;
    public byte[] A0J;
    public byte[] A0K;
    public byte[] A0L;
    public byte[] A0M;
    public byte[] A0N;

    public static void A02(byte[] bArr, byte[] bArr2, int i) {
        int i2 = 0;
        do {
            AnonymousClass6C7.A1T(bArr2, bArr, i + i2, bArr[i2], i2);
            int i3 = i2 + 1;
            AnonymousClass6C7.A1T(bArr2, bArr, i + i3, bArr[i3], i3);
            int i4 = i3 + 1;
            AnonymousClass6C7.A1T(bArr2, bArr, i + i4, bArr[i4], i4);
            int i5 = i4 + 1;
            AnonymousClass6C7.A1T(bArr2, bArr, i + i5, bArr[i5], i5);
            i2 = i5 + 1;
        } while (i2 < 16);
    }

    public static void A03(byte[] bArr, long[] jArr) {
        int i = 0;
        for (int i2 = 0; i2 < jArr.length; i2++) {
            int i3 = i + 1;
            int A0E2 = AnonymousClass6C7.A0E(bArr, bArr[i] << 24, (bArr[i3] & 255) << 16, i3);
            int i4 = i + 4;
            int i5 = i4 + 1;
            jArr[i2] = AnonymousClass6C8.A0N(A0E2, AnonymousClass6C7.A0E(bArr, bArr[i4] << 24, (bArr[i5] & 255) << 16, i5));
            i += 8;
        }
    }

    public static void A05(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr2[0];
        long j4 = jArr2[1];
        long reverse = Long.reverse(j);
        long reverse2 = Long.reverse(j2);
        long reverse3 = Long.reverse(j3);
        long reverse4 = Long.reverse(j4);
        long reverse5 = Long.reverse(A01(reverse, reverse3));
        long A012 = A01(j, j3) << 1;
        long reverse6 = Long.reverse(A01(reverse2, reverse4));
        long A013 = A01(j2, j4) << 1;
        long reverse7 = (Long.reverse(A01(reverse ^ reverse2, reverse3 ^ reverse4)) ^ ((A012 ^ reverse5) ^ reverse6)) ^ (((A013 ^ (A013 >>> 1)) ^ (A013 >>> 2)) ^ (A013 >>> 7));
        long A014 = ((A01(j ^ j2, j3 ^ j4) << 1) ^ ((reverse6 ^ A012) ^ A013)) ^ ((A013 << 62) ^ (A013 << 57));
        long j5 = reverse5 ^ ((A014 >>> 7) ^ ((A014 ^ (A014 >>> 1)) ^ (A014 >>> 2)));
        jArr[0] = j5;
        jArr[1] = ((A014 << 57) ^ ((A014 << 63) ^ (A014 << 62))) ^ reverse7;
    }

    public final void A0B(byte[] bArr, byte[] bArr2, int i, int i2) {
        if (bArr2.length - i2 >= 16) {
            if (this.A06 == 0) {
                A07();
            }
            byte[] bArr3 = new byte[16];
            A09(bArr3);
            if (this.A0A) {
                A02(bArr3, bArr, i);
                byte[] bArr4 = this.A0E;
                C1454275q.A00(bArr4, bArr3);
                this.A09.A00(bArr4);
                System.arraycopy(bArr3, 0, bArr2, i2, 16);
            } else {
                byte[] bArr5 = this.A0E;
                A02(bArr5, bArr, i);
                this.A09.A00(bArr5);
                int i3 = 0;
                do {
                    AnonymousClass6C7.A1T(bArr, bArr2, i + i3, bArr3[i3], i2 + i3);
                    int i4 = i3 + 1;
                    AnonymousClass6C7.A1T(bArr, bArr2, i + i4, bArr3[i4], i2 + i4);
                    int i5 = i4 + 1;
                    AnonymousClass6C7.A1T(bArr, bArr2, i + i5, bArr3[i5], i2 + i5);
                    int i6 = i5 + 1;
                    AnonymousClass6C7.A1T(bArr, bArr2, i + i6, bArr3[i6], i2 + i6);
                    i3 = i6 + 1;
                } while (i3 < 16);
            }
            this.A06 += 16;
            return;
        }
        throw new C177198eE("Output buffer too short");
    }

    public static long A00(int i, long j, long j2) {
        long j3 = j2 & ((j >>> i) ^ j);
        return j ^ (j3 ^ (j3 << i));
    }

    public final void A06() {
        if (this.A0B) {
            return;
        }
        if (this.A0A) {
            throw AnonymousClass001.A0e("GCM cipher cannot be reused for encryption");
        }
        throw AnonymousClass001.A0e("GCM cipher needs to be initialised");
    }

    public final void A07() {
        if (this.A04 > 0) {
            System.arraycopy(this.A0F, 0, this.A0G, 0, 16);
            this.A05 = this.A04;
        }
        int i = this.A00;
        if (i > 0) {
            A0A(this.A0G, this.A0H, 0, i);
            this.A05 += (long) i;
        }
        if (this.A05 > 0) {
            System.arraycopy(this.A0G, 0, this.A0E, 0, 16);
        }
    }

    public final void A08(boolean z) {
        this.A07.reset();
        this.A0E = new byte[16];
        this.A0F = new byte[16];
        this.A0G = new byte[16];
        this.A0H = new byte[16];
        this.A00 = 0;
        this.A04 = 0;
        this.A05 = 0;
        this.A0J = C161007oo.A02(this.A0D);
        this.A01 = -2;
        this.A02 = 0;
        this.A06 = 0;
        byte[] bArr = this.A0I;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
        if (z) {
            this.A0M = null;
        }
        if (this.A0A) {
            this.A0B = false;
            return;
        }
        byte[] bArr2 = this.A0K;
        if (bArr2 != null) {
            BhZ(bArr2, 0, bArr2.length);
        }
    }

    public final void A09(byte[] bArr) {
        int i = this.A01;
        if (i != 0) {
            this.A01 = i - 1;
            byte[] bArr2 = this.A0J;
            int i2 = (bArr2[15] & 255) + 1;
            bArr2[15] = (byte) i2;
            int i3 = (i2 >>> 8) + (bArr2[14] & 255);
            bArr2[14] = (byte) i3;
            int i4 = (i3 >>> 8) + (bArr2[13] & 255);
            bArr2[13] = (byte) i4;
            bArr2[12] = (byte) ((i4 >>> 8) + (bArr2[12] & 255));
            this.A07.Bha(bArr2, bArr, 0, 0);
            return;
        }
        throw AnonymousClass001.A0e("Attempt to process too many blocks");
    }

    public final void A0A(byte[] bArr, byte[] bArr2, int i, int i2) {
        while (true) {
            i2--;
            if (i2 >= 0) {
                AnonymousClass6C7.A1T(bArr2, bArr, i + i2, bArr[i2], i2);
            } else {
                this.A09.A00(bArr);
                return;
            }
        }
    }

    public int B24(byte[] bArr, int i) {
        long[] jArr;
        int i2 = i;
        A06();
        if (this.A06 == 0) {
            A07();
        }
        int i3 = this.A02;
        byte[] bArr2 = bArr;
        if (!this.A0A) {
            int i4 = this.A03;
            if (i3 >= i4) {
                i3 -= i4;
                if (bArr2.length - i < i3) {
                    throw new C177198eE("Output buffer too short");
                }
            } else {
                throw new C177188eD("data too short");
            }
        } else if (bArr2.length - i < this.A03 + i3) {
            throw new C177198eE("Output buffer too short");
        }
        if (i3 > 0) {
            byte[] bArr3 = this.A0I;
            byte[] bArr4 = new byte[16];
            A09(bArr4);
            if (!this.A0A) {
                A0A(this.A0E, bArr3, 0, i3);
                int i5 = i3;
                while (true) {
                    i5--;
                    if (i5 < 0) {
                        break;
                    }
                    AnonymousClass6C8.A1J(bArr3, bArr4, i5);
                }
            } else {
                int i6 = i3;
                while (true) {
                    i6--;
                    if (i6 < 0) {
                        break;
                    }
                    AnonymousClass6C8.A1J(bArr3, bArr4, i6);
                }
                A0A(this.A0E, bArr3, 0, i3);
            }
            System.arraycopy(bArr3, 0, bArr2, i2, i3);
            this.A06 += (long) i3;
        }
        long j = this.A04;
        int i7 = this.A00;
        long j2 = j + ((long) i7);
        this.A04 = j2;
        long j3 = this.A05;
        if (j2 > j3) {
            if (i7 > 0) {
                A0A(this.A0F, this.A0H, 0, i7);
            }
            if (j3 > 0) {
                C1454275q.A00(this.A0F, this.A0G);
            }
            long j4 = ((this.A06 * 8) + 127) >>> 7;
            byte[] bArr5 = new byte[16];
            C147597Ex r12 = this.A08;
            if (r12 == null) {
                r12 = new C147597Ex();
                this.A08 = r12;
                long[] jArr2 = new long[2];
                A03(this.A0C, jArr2);
                r12.A00 = jArr2;
            }
            long[] jArr3 = new long[2];
            jArr3[0] = Long.MIN_VALUE;
            if (j4 <= 0) {
                int i8 = 0;
                int i9 = 0;
            } else {
                long[] jArr4 = r12.A00;
                if (jArr4 == null) {
                    jArr = null;
                } else {
                    jArr = (long[]) jArr4.clone();
                }
                do {
                    if ((1 & j4) != 0) {
                        A05(jArr3, jArr);
                    }
                    long[] jArr5 = new long[4];
                    A04(jArr5, 0, jArr[0]);
                    A04(jArr5, 2, jArr[1]);
                    long j5 = jArr5[0];
                    long j6 = jArr5[1];
                    long j7 = jArr5[2];
                    long j8 = jArr5[3];
                    long j9 = j7 ^ ((j8 << 57) ^ ((j8 << 63) ^ (j8 << 62)));
                    jArr[0] = j5 ^ ((((j9 >>> 1) ^ j9) ^ (j9 >>> 2)) ^ (j9 >>> 7));
                    jArr[1] = (j6 ^ ((((j8 >>> 1) ^ j8) ^ (j8 >>> 2)) ^ (j8 >>> 7))) ^ ((j9 << 57) ^ ((j9 << 63) ^ (j9 << 62)));
                    j4 >>>= 1;
                } while (j4 > 0);
            }
            int i82 = 0;
            int i92 = 0;
            do {
                C161817qb.A03(bArr5, i82, jArr3[i92]);
                i82 += 8;
                i92++;
            } while (i92 < 2);
            byte[] bArr6 = this.A0F;
            long[] jArr6 = new long[2];
            A03(bArr6, jArr6);
            long[] jArr7 = new long[2];
            A03(bArr5, jArr7);
            A05(jArr6, jArr7);
            int i10 = 0;
            int i11 = 0;
            do {
                C161817qb.A03(bArr6, i10, jArr6[i11]);
                i10 += 8;
                i11++;
            } while (i11 < 2);
            C1454275q.A00(this.A0E, this.A0F);
        }
        byte[] bArr7 = new byte[16];
        C161817qb.A03(bArr7, 0, this.A04 * 8);
        C161817qb.A03(bArr7, 8, this.A06 * 8);
        byte[] bArr8 = this.A0E;
        C1454275q.A00(bArr8, bArr7);
        this.A09.A00(bArr8);
        byte[] bArr9 = new byte[16];
        this.A07.Bha(this.A0D, bArr9, 0, 0);
        C1454275q.A00(bArr9, this.A0E);
        int i12 = this.A03;
        byte[] bArr10 = new byte[i12];
        this.A0M = bArr10;
        System.arraycopy(bArr9, 0, bArr10, 0, i12);
        if (this.A0A) {
            System.arraycopy(this.A0M, 0, bArr2, i + this.A02, this.A03);
            i3 += this.A03;
        } else {
            int i13 = this.A03;
            byte[] bArr11 = new byte[i13];
            System.arraycopy(this.A0I, i3, bArr11, 0, i13);
            if (!C161007oo.A01(this.A0M, bArr11)) {
                throw new C177188eD("mac check in GCM failed");
            }
        }
        A08(false);
        return i3;
    }

    public byte[] B9G() {
        byte[] bArr = this.A0M;
        if (bArr == null) {
            return new byte[this.A03];
        }
        return C161007oo.A02(bArr);
    }

    public int BAJ(int i) {
        int i2 = i + this.A02;
        boolean z = this.A0A;
        int i3 = this.A03;
        if (z) {
            return i2 + i3;
        }
        int i4 = i2;
        int i5 = i2 - i3;
        if (i4 < i3) {
            return 0;
        }
        return i5;
    }

    public C185768uD BE1() {
        return this.A07;
    }

    public int BE4(int i) {
        int i2 = i + this.A02;
        if (!this.A0A) {
            int i3 = this.A03;
            int i4 = i2;
            i2 -= i3;
            if (i4 < i3) {
                return 0;
            }
        }
        return i2 - (i2 % 16);
    }

    public void BFw(C834748n r22, boolean z) {
        byte[] bArr;
        int i;
        AnonymousClass8QN r0;
        byte[] bArr2;
        C834748n r1 = r22;
        this.A0A = z;
        this.A0M = null;
        this.A0B = true;
        if (r1 instanceof AnonymousClass8QK) {
            AnonymousClass8QK r12 = (AnonymousClass8QK) r1;
            bArr = C161007oo.A02(r12.A03);
            this.A0K = C161007oo.A02(r12.A02);
            int i2 = r12.A00;
            if (i2 < 32 || i2 > 128 || i2 % 8 != 0) {
                throw AnonymousClass000.A0G("Invalid value for MAC size: ", AnonymousClass001.A0o(), i2);
            }
            i = i2 / 8;
            this.A03 = i;
            r0 = r12.A01;
        } else if (r1 instanceof AnonymousClass8QP) {
            AnonymousClass8QP r13 = (AnonymousClass8QP) r1;
            bArr = r13.A01;
            this.A0K = null;
            this.A03 = 16;
            i = 16;
            r0 = (AnonymousClass8QN) r13.A00;
        } else {
            throw AnonymousClass001.A0c("invalid parameters passed to GCM");
        }
        int i3 = i + 16;
        if (z) {
            i3 = 16;
        }
        this.A0I = new byte[i3];
        if (bArr == null || bArr.length < 1) {
            throw AnonymousClass001.A0c("IV must be at least 1 byte");
        }
        if (z && (bArr2 = this.A0N) != null && Arrays.equals(bArr2, bArr)) {
            if (r0 != null) {
                byte[] bArr3 = this.A0L;
                if (bArr3 != null && Arrays.equals(bArr3, r0.A00)) {
                    throw AnonymousClass001.A0c("cannot reuse nonce for GCM encryption");
                }
            } else {
                throw AnonymousClass001.A0c("cannot reuse nonce for GCM encryption");
            }
        }
        this.A0N = bArr;
        if (r0 != null) {
            this.A0L = r0.A00;
        }
        if (r0 != null) {
            C185768uD r14 = this.A07;
            r14.BFw(r0, true);
            byte[] bArr4 = new byte[16];
            this.A0C = bArr4;
            r14.Bha(bArr4, bArr4, 0, 0);
            C150767Sd r3 = this.A09;
            byte[] bArr5 = this.A0C;
            int i4 = 2;
            if (r3.A01 == null) {
                r3.A01 = (long[][]) Array.newInstance(Long.TYPE, new int[]{256, 2});
            } else if (Arrays.equals(r3.A00, bArr5)) {
                this.A08 = null;
            }
            byte[] A022 = C161007oo.A02(bArr5);
            r3.A00 = A022;
            long[][] jArr = r3.A01;
            long[] jArr2 = jArr[1];
            A03(A022, jArr2);
            long j = jArr2[0];
            long j2 = jArr2[1];
            long j3 = j2 << 57;
            jArr2[0] = (j3 >>> 7) ^ ((((j >>> 7) ^ j3) ^ (j3 >>> 1)) ^ (j3 >>> 2));
            jArr2[1] = (j << 57) | (j2 >>> 7);
            do {
                long[] jArr3 = jArr[i4 >> 1];
                long[] jArr4 = jArr[i4];
                long j4 = jArr3[0];
                long j5 = jArr3[1];
                long j6 = j4 >> 63;
                jArr4[0] = ((j4 ^ (-2233785415175766016L & j6)) << 1) | (j5 >>> 63);
                jArr4[1] = (j5 << 1) | (-j6);
                long[] jArr5 = jArr[i4 + 1];
                jArr5[0] = jArr4[0] ^ jArr2[0];
                jArr5[1] = jArr2[1] ^ jArr4[1];
                i4 += 2;
            } while (i4 < 256);
            this.A08 = null;
        } else if (this.A0C == null) {
            throw AnonymousClass001.A0c("Key must be specified in initial init");
        }
        byte[] bArr6 = new byte[16];
        this.A0D = bArr6;
        byte[] bArr7 = this.A0N;
        int length = bArr7.length;
        if (length == 12) {
            System.arraycopy(bArr7, 0, bArr6, 0, length);
            bArr6 = this.A0D;
            bArr6[15] = 1;
        } else {
            for (int i5 = 0; i5 < length; i5 += 16) {
                A0A(bArr6, bArr7, i5, Math.min(length - i5, 16));
            }
            byte[] bArr8 = new byte[16];
            C161817qb.A03(bArr8, 8, ((long) length) * 8);
            C1454275q.A00(bArr6, bArr8);
            this.A09.A00(bArr6);
        }
        this.A0E = new byte[16];
        this.A0F = new byte[16];
        this.A0G = new byte[16];
        this.A0H = new byte[16];
        this.A00 = 0;
        this.A04 = 0;
        this.A05 = 0;
        this.A0J = C161007oo.A02(bArr6);
        this.A01 = -2;
        this.A02 = 0;
        this.A06 = 0;
        byte[] bArr9 = this.A0K;
        if (bArr9 != null) {
            BhZ(bArr9, 0, bArr9.length);
        }
    }

    public C173438Qe(C185768uD r3) {
        if (r3.B4g() == 16) {
            C150767Sd r0 = new C150767Sd();
            this.A07 = r3;
            this.A09 = r0;
            return;
        }
        throw AnonymousClass001.A0c("cipher required with a block size of 16.");
    }

    public String B4N() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass6C9.A1A(A0o, this.A07);
        return AnonymousClass000.A0X("/GCM", A0o);
    }

    public void BhZ(byte[] bArr, int i, int i2) {
        A06();
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.A0H;
            int i4 = this.A00;
            AnonymousClass6CA.A0g(bArr, bArr2, i + i3, i4);
            int i5 = i4 + 1;
            this.A00 = i5;
            if (i5 == 16) {
                byte[] bArr3 = this.A0F;
                C1454275q.A00(bArr3, bArr2);
                this.A09.A00(bArr3);
                this.A00 = 0;
                this.A04 += 16;
            }
        }
    }

    public int Bhb(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4;
        A06();
        if (bArr.length - i >= i2) {
            if (this.A0A) {
                int i5 = this.A02;
                if (i5 != 0) {
                    while (true) {
                        if (i2 <= 0) {
                            break;
                        }
                        i2--;
                        byte[] bArr3 = this.A0I;
                        int i6 = i + 1;
                        AnonymousClass6CA.A0g(bArr, bArr3, i, i5);
                        i5++;
                        this.A02 = i5;
                        if (i5 == 16) {
                            A0B(bArr3, bArr2, 0, i3);
                            this.A02 = 0;
                            i = i6;
                            i4 = 16;
                            break;
                        }
                        i = i6;
                    }
                }
                i4 = 0;
                while (i2 >= 16) {
                    A0B(bArr, bArr2, i, i3 + i4);
                    i += 16;
                    i2 -= 16;
                    i4 += 16;
                }
                if (i2 > 0) {
                    System.arraycopy(bArr, i, this.A0I, 0, i2);
                    this.A02 = i2;
                }
            } else {
                i4 = 0;
                for (int i7 = 0; i7 < i2; i7++) {
                    byte[] bArr4 = this.A0I;
                    int i8 = this.A02;
                    AnonymousClass6CA.A0g(bArr, bArr4, i + i7, i8);
                    int i9 = i8 + 1;
                    this.A02 = i9;
                    if (i9 == bArr4.length) {
                        A0B(bArr4, bArr2, 0, i3 + i4);
                        byte[] bArr5 = this.A0I;
                        System.arraycopy(bArr5, 16, bArr5, 0, this.A03);
                        this.A02 = this.A03;
                        i4 += 16;
                    }
                }
            }
            return i4;
        }
        throw new C177248eJ("Input buffer too short");
    }

    public static long A01(long j, long j2) {
        long j3 = j & 1229782938247303441L;
        long j4 = j & 2459565876494606882L;
        long j5 = j & 4919131752989213764L;
        long j6 = j & -8608480567731124088L;
        long j7 = j2 & 1229782938247303441L;
        long j8 = j2 & 2459565876494606882L;
        long j9 = j2 & 4919131752989213764L;
        long j10 = j2 & -8608480567731124088L;
        return (((((j3 * j7) ^ (j4 * j10)) ^ (j5 * j9)) ^ (j6 * j8)) & 1229782938247303441L) | (((((j3 * j8) ^ (j4 * j7)) ^ (j5 * j10)) ^ (j6 * j9)) & 2459565876494606882L) | (((((j3 * j9) ^ (j4 * j8)) ^ (j5 * j7)) ^ (j6 * j10)) & 4919131752989213764L) | (((((j3 * j10) ^ (j4 * j9)) ^ (j5 * j8)) ^ (j6 * j7)) & -8608480567731124088L);
    }

    public static void A04(long[] jArr, int i, long j) {
        long A002 = A00(1, A00(2, A00(4, A00(8, A00(16, j, 4294901760L), 280375465148160L), 67555025218437360L), 868082074056920076L), 2459565876494606882L);
        jArr[i] = A002 & -6148914691236517206L;
        jArr[i + 1] = (A002 << 1) & -6148914691236517206L;
    }
}
