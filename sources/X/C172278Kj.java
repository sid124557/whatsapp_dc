package X;

import java.io.Closeable;
import java.io.Flushable;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;

/* renamed from: X.8Kj  reason: invalid class name and case insensitive filesystem */
public final class C172278Kj implements Closeable, C188558z5, WritableByteChannel, Flushable, Cloneable, ByteChannel {
    public static final byte[] A02;
    public long A00;
    public C158837kd A01;

    public int A01(byte[] bArr, int i, int i2) {
        C1453875h.A00((long) bArr.length, (long) i, (long) i2);
        C158837kd r6 = this.A01;
        if (r6 == null) {
            return -1;
        }
        int i3 = r6.A00;
        int i4 = r6.A01;
        int A0A = AnonymousClass6C9.A0A(i3, i4, i2);
        System.arraycopy(r6.A06, i4, bArr, i, A0A);
        int i5 = r6.A01 + A0A;
        r6.A01 = i5;
        this.A00 -= (long) A0A;
        if (i5 == r6.A00) {
            C158837kd.A00(this, r6);
        }
        return A0A;
    }

    public void A0A(int i) {
        C158837kd A07 = A07(4);
        byte[] bArr = A07.A06;
        int i2 = A07.A00;
        int i3 = i2 + 1;
        AnonymousClass6C9.A1G(bArr, i >>> 24, i2);
        int i4 = i3 + 1;
        AnonymousClass6C9.A1G(bArr, i >>> 16, i3);
        int i5 = i4 + 1;
        AnonymousClass6C9.A1G(bArr, i >>> 8, i4);
        AnonymousClass6C9.A1G(bArr, i, i5);
        A07.A00 = i5 + 1;
        this.A00 += 4;
    }

    public /* bridge */ /* synthetic */ void A0C(String str) {
        C162457s7.A0I(str, 0);
        A0E(str, 0, str.length());
    }

    /* renamed from: A0D */
    public void A0E(String str, int i, int i2) {
        int i3;
        long j;
        long j2;
        long j3;
        long j4;
        char c;
        if (i < 0) {
            throw AnonymousClass000.A0G("beginIndex < 0: ", AnonymousClass001.A0o(), i);
        } else if (i2 >= i) {
            int length = str.length();
            if (i2 > length) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("endIndex > string.length: ");
                A0o.append(i2);
                throw AnonymousClass000.A0G(" > ", A0o, length);
            }
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    C158837kd A07 = A07(1);
                    byte[] bArr = A07.A06;
                    int i4 = A07.A00 - i;
                    int min = Math.min(i2, 8192 - i4);
                    i3 = i + 1;
                    bArr[i + i4] = (byte) charAt;
                    while (i3 < min) {
                        char charAt2 = str.charAt(i3);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i3 + i4] = (byte) charAt2;
                        i3++;
                    }
                    int i5 = A07.A00;
                    int i6 = (i4 + i3) - i5;
                    A07.A00 = i5 + i6;
                    j = this.A00;
                    j2 = (long) i6;
                } else {
                    if (charAt < 2048) {
                        C158837kd A072 = A07(2);
                        byte[] bArr2 = A072.A06;
                        int i7 = A072.A00;
                        AnonymousClass6C8.A0u(charAt & '?', bArr2, 128, AnonymousClass6CA.A0A(bArr2, (charAt >> 6) | 192, i7));
                        A072.A00 = i7 + 2;
                        j3 = this.A00;
                        j4 = 2;
                    } else if (charAt < 55296 || charAt > 57343) {
                        C158837kd A073 = A07(3);
                        byte[] bArr3 = A073.A06;
                        int i8 = A073.A00;
                        AnonymousClass6C8.A0u(63 & (charAt >> 6), bArr3, 128, AnonymousClass6CA.A0A(bArr3, (charAt >> 12) | 224, i8));
                        AnonymousClass6C8.A0u(charAt & '?', bArr3, 128, i8 + 2);
                        A073.A00 = i8 + 3;
                        j3 = this.A00;
                        j4 = 3;
                    } else {
                        i3 = i + 1;
                        if (i3 < i2) {
                            c = str.charAt(i3);
                        } else {
                            c = 0;
                        }
                        if (charAt > 56319 || 56320 > c || 57343 < c) {
                            C158837kd A074 = A07(1);
                            byte[] bArr4 = A074.A06;
                            int i9 = A074.A00;
                            A074.A00 = i9 + 1;
                            bArr4[i9] = (byte) 63;
                            j = this.A00;
                            j2 = 1;
                        } else {
                            int i10 = (((charAt & 1023) << 10) | (c & 1023)) + 0;
                            C158837kd A075 = A07(4);
                            byte[] bArr5 = A075.A06;
                            int i11 = A075.A00;
                            AnonymousClass6C8.A0u((i10 >> 12) & 63, bArr5, 128, AnonymousClass6CA.A0A(bArr5, (i10 >> 18) | 240, i11));
                            AnonymousClass6C8.A0u((i10 >> 6) & 63, bArr5, 128, i11 + 2);
                            AnonymousClass6C8.A0u(i10 & 63, bArr5, 128, i11 + 3);
                            A075.A00 = i11 + 4;
                            this.A00 += 4;
                            i += 2;
                        }
                    }
                    this.A00 = j3 + j4;
                    i++;
                }
                this.A00 = j + j2;
                i = i3;
            }
        } else {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("endIndex < beginIndex: ");
            A0o2.append(i2);
            throw AnonymousClass000.A0G(" < ", A0o2, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0062, code lost:
        return r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long BiH(X.C172278Kj r13, long r14) {
        /*
            r12 = this;
            r10 = r14
            r1 = 0
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x010e
            long r6 = r12.A00
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0010
            r0 = -1
            return r0
        L_0x0010:
            int r0 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0015
            r10 = r6
        L_0x0015:
            r0 = r10
            if (r12 == r13) goto L_0x0107
            r8 = 0
            X.C1453875h.A00(r6, r8, r10)
        L_0x001d:
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0062
            X.7kd r6 = r12.A01
            if (r6 != 0) goto L_0x002c
            java.lang.RuntimeException r0 = X.C162457s7.A05()
            throw r0
        L_0x002c:
            int r7 = r6.A00
            int r2 = r6.A01
            int r7 = r7 - r2
            long r2 = (long) r7
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x009e
            X.7kd r2 = r13.A01
            if (r2 == 0) goto L_0x0066
            X.7kd r8 = r2.A03
            if (r8 == 0) goto L_0x0066
            boolean r2 = r8.A04
            if (r2 == 0) goto L_0x0066
            int r2 = r8.A00
            long r4 = (long) r2
            long r4 = r4 + r0
            boolean r2 = r8.A05
            if (r2 == 0) goto L_0x0063
            r2 = 0
        L_0x004b:
            long r2 = (long) r2
            long r4 = r4 - r2
            r2 = 8192(0x2000, float:1.14794E-41)
            long r2 = (long) r2
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 > 0) goto L_0x0066
            int r2 = (int) r0
            r6.A04(r8, r2)
            long r2 = r12.A00
            long r2 = r2 - r0
            r12.A00 = r2
            long r2 = r13.A00
            long r2 = r2 + r0
            r13.A00 = r2
        L_0x0062:
            return r10
        L_0x0063:
            int r2 = r8.A01
            goto L_0x004b
        L_0x0066:
            int r8 = (int) r0
            if (r8 <= 0) goto L_0x00f9
            if (r8 > r7) goto L_0x00f9
            r2 = 1024(0x400, float:1.435E-42)
            if (r8 < r2) goto L_0x0086
            X.7kd r7 = r6.A02()
        L_0x0073:
            int r2 = r7.A01
            int r2 = r2 + r8
            r7.A00 = r2
            int r2 = r6.A01
            int r2 = r2 + r8
            r6.A01 = r2
            X.7kd r2 = r6.A03
            if (r2 != 0) goto L_0x0098
            java.lang.RuntimeException r0 = X.C162457s7.A05()
            throw r0
        L_0x0086:
            X.7kd r7 = X.C161197pC.A00()
            byte[] r5 = r6.A06
            int r4 = r6.A01
            byte[] r3 = r7.A06
            r2 = 0
            X.C162457s7.A0I(r5, r2)
            java.lang.System.arraycopy(r5, r4, r3, r2, r8)
            goto L_0x0073
        L_0x0098:
            r2.A03(r7)
            r6 = r7
            r12.A01 = r7
        L_0x009e:
            int r3 = r6.A00
            int r2 = r6.A01
            int r3 = r3 - r2
            long r3 = (long) r3
            X.7kd r2 = r6.A01()
            r12.A01 = r2
            X.7kd r2 = r13.A01
            if (r2 != 0) goto L_0x00c1
            r13.A01 = r6
            r6.A03 = r6
            r6.A02 = r6
        L_0x00b4:
            long r5 = r12.A00
            long r5 = r5 - r3
            r12.A00 = r5
            long r5 = r13.A00
            long r5 = r5 + r3
            r13.A00 = r5
            long r0 = r0 - r3
            goto L_0x001d
        L_0x00c1:
            X.7kd r2 = r2.A03
            if (r2 != 0) goto L_0x00ca
            java.lang.RuntimeException r0 = X.C162457s7.A05()
            throw r0
        L_0x00ca:
            r2.A03(r6)
            X.7kd r9 = r6.A03
            r8 = 0
            if (r9 == r6) goto L_0x0100
            if (r9 != 0) goto L_0x00d9
            java.lang.RuntimeException r0 = X.C162457s7.A05()
            throw r0
        L_0x00d9:
            boolean r2 = r9.A04
            if (r2 == 0) goto L_0x00b4
            int r7 = r6.A00
            int r2 = r6.A01
            int r7 = r7 - r2
            int r2 = r9.A00
            int r5 = 8192 - r2
            boolean r2 = r9.A05
            if (r2 != 0) goto L_0x00ec
            int r8 = r9.A01
        L_0x00ec:
            int r5 = r5 + r8
            if (r7 > r5) goto L_0x00b4
            r6.A04(r9, r7)
            r6.A01()
            X.C161197pC.A01(r6)
            goto L_0x00b4
        L_0x00f9:
            java.lang.String r0 = "byteCount out of range"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0100:
            java.lang.String r0 = "cannot compact"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0107:
            java.lang.String r0 = "source == this"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x010e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "byteCount < 0: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass6C7.A0V(r0, r1, r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172278Kj.BiH(X.8Kj, long):long");
    }

    public int read(ByteBuffer byteBuffer) {
        C162457s7.A0I(byteBuffer, 0);
        C158837kd r6 = this.A01;
        if (r6 == null) {
            return -1;
        }
        int remaining = byteBuffer.remaining();
        int i = r6.A00;
        int i2 = r6.A01;
        int A0A = AnonymousClass6C9.A0A(i, i2, remaining);
        byteBuffer.put(r6.A06, i2, A0A);
        int i3 = r6.A01 + A0A;
        r6.A01 = i3;
        this.A00 -= (long) A0A;
        if (i3 == r6.A00) {
            C158837kd.A00(this, r6);
        }
        return A0A;
    }

    public int write(ByteBuffer byteBuffer) {
        C162457s7.A0I(byteBuffer, 0);
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            C158837kd A07 = A07(1);
            int i2 = A07.A00;
            int min = Math.min(i, 8192 - i2);
            byteBuffer.get(A07.A06, i2, min);
            i -= min;
            A07.A00 += min;
        }
        this.A00 += (long) remaining;
        return remaining;
    }

    static {
        byte[] bytes = "0123456789abcdef".getBytes(AnonymousClass79X.A05);
        C162457s7.A09(bytes);
        A02 = bytes;
    }

    public final byte A00(long j) {
        byte[] bArr;
        long j2;
        C1453875h.A00(this.A00, j, 1);
        C158837kd r7 = this.A01;
        if (r7 != null) {
            long j3 = this.A00;
            if (j3 - j >= j) {
                long j4 = 0;
                while (true) {
                    int i = r7.A00;
                    int i2 = r7.A01;
                    long j5 = ((long) (i - i2)) + j4;
                    if (j5 > j) {
                        bArr = r7.A06;
                        j2 = (((long) i2) + j) - j4;
                        break;
                    }
                    r7 = r7.A02;
                    if (r7 == null) {
                        throw C162457s7.A05();
                    }
                    j4 = j5;
                }
            } else {
                while (j3 > j) {
                    r7 = r7.A03;
                    if (r7 == null) {
                        throw C162457s7.A05();
                    }
                    j3 -= (long) (r7.A00 - r7.A01);
                }
                bArr = r7.A06;
                j2 = (((long) r7.A01) + j) - j3;
            }
            return bArr[(int) j2];
        }
        AnonymousClass700 r0 = new AnonymousClass700();
        C162457s7.A0O(r0);
        throw r0;
    }

    public final long A02() {
        return this.A00;
    }

    public String A03() {
        return A05(AnonymousClass79X.A05, this.A00);
    }

    public String A04(long j) {
        return A05(AnonymousClass79X.A05, j);
    }

    public String A05(Charset charset, long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0 || j > ((long) Integer.MAX_VALUE)) {
            throw AnonymousClass6C7.A0V("byteCount: ", AnonymousClass001.A0o(), j);
        } else if (this.A00 < j) {
            throw AnonymousClass6CA.A0M();
        } else if (i == 0) {
            return "";
        } else {
            C158837kd r4 = this.A01;
            if (r4 == null) {
                throw C162457s7.A05();
            }
            int i2 = r4.A01;
            if (((long) i2) + j > ((long) r4.A00)) {
                return new String(A0F(j), charset);
            }
            int i3 = (int) j;
            String A0W = AnonymousClass6CA.A0W(charset, r4.A06, i2, i3);
            int i4 = r4.A01 + i3;
            r4.A01 = i4;
            this.A00 -= j;
            if (i4 == r4.A00) {
                C158837kd.A00(this, r4);
            }
            return A0W;
        }
    }

    public AnonymousClass8Lk A06() {
        return new AnonymousClass8Lk(A0F(this.A00));
    }

    public final C158837kd A07(int i) {
        C158837kd r0 = this.A01;
        if (r0 == null) {
            C158837kd A002 = C161197pC.A00();
            this.A01 = A002;
            A002.A03 = A002;
            A002.A02 = A002;
            return A002;
        }
        C158837kd r1 = r0.A03;
        if (r1 == null) {
            throw C162457s7.A05();
        } else if (r1.A00 + i <= 8192 && r1.A04) {
            return r1;
        } else {
            C158837kd A003 = C161197pC.A00();
            r1.A03(A003);
            return A003;
        }
    }

    public final void A08() {
        A0B(this.A00);
    }

    public /* bridge */ /* synthetic */ void A09() {
        C158837kd A07 = A07(1);
        byte[] bArr = A07.A06;
        int i = A07.A00;
        A07.A00 = i + 1;
        bArr[i] = (byte) 34;
        this.A00++;
    }

    public void A0B(long j) {
        while (j > 0) {
            C158837kd r7 = this.A01;
            if (r7 != null) {
                int i = r7.A00;
                int i2 = r7.A01;
                int A022 = AnonymousClass6CA.A02(j, (long) (i - i2));
                long j2 = (long) A022;
                this.A00 -= j2;
                j -= j2;
                int i3 = i2 + A022;
                r7.A01 = i3;
                if (i3 == i) {
                    C158837kd.A00(this, r7);
                }
            } else {
                throw AnonymousClass6CA.A0M();
            }
        }
    }

    public byte[] A0F(long j) {
        if (j < 0 || j > ((long) Integer.MAX_VALUE)) {
            throw AnonymousClass6C7.A0V("byteCount: ", AnonymousClass001.A0o(), j);
        } else if (this.A00 >= j) {
            int i = (int) j;
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int A012 = A01(bArr, i2, i - i2);
                if (A012 != -1) {
                    i2 += A012;
                } else {
                    throw AnonymousClass6CA.A0M();
                }
            }
            return bArr;
        } else {
            throw AnonymousClass6CA.A0M();
        }
    }

    public C172278Kj B4u() {
        return this;
    }

    public boolean Bjk(long j) {
        return AnonymousClass001.A1U((this.A00 > j ? 1 : (this.A00 == j ? 0 : -1)));
    }

    public /* bridge */ /* synthetic */ Object clone() {
        C172278Kj r5 = new C172278Kj();
        if (this.A00 != 0) {
            C158837kd r0 = this.A01;
            if (r0 != null) {
                C158837kd A022 = r0.A02();
                r5.A01 = A022;
                A022.A03 = A022;
                A022.A02 = A022;
                C158837kd r2 = this.A01;
                if (r2 != null) {
                    while (true) {
                        r2 = r2.A02;
                        if (r2 == this.A01) {
                            r5.A00 = this.A00;
                            break;
                        }
                        C158837kd r02 = r5.A01;
                        if (r02 == null) {
                            throw C162457s7.A05();
                        }
                        C158837kd r1 = r02.A03;
                        if (r1 == null) {
                            throw C162457s7.A05();
                        } else if (r2 == null) {
                            throw C162457s7.A05();
                        } else {
                            r1.A03(r2.A02());
                        }
                    }
                } else {
                    throw C162457s7.A05();
                }
            } else {
                throw C162457s7.A05();
            }
        }
        return r5;
    }

    public void close() {
    }

    /* JADX WARNING: type inference failed for: r18v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r6 = r18
            r16 = 1
            r3 = r17
            if (r3 == r6) goto L_0x007e
            boolean r0 = r6 instanceof X.C172278Kj
            r15 = 0
            if (r0 == 0) goto L_0x007d
            long r4 = r3.A00
            X.8Kj r6 = (X.C172278Kj) r6
            long r1 = r6.A00
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x007d
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x007e
            X.7kd r9 = r3.A01
            if (r9 != 0) goto L_0x0026
            java.lang.RuntimeException r0 = X.C162457s7.A05()
            throw r0
        L_0x0026:
            X.7kd r8 = r6.A01
            if (r8 != 0) goto L_0x002f
            java.lang.RuntimeException r0 = X.C162457s7.A05()
            throw r0
        L_0x002f:
            int r1 = r9.A01
            int r10 = r8.A01
            r13 = 0
        L_0x0035:
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x007e
            int r2 = r9.A00
            int r2 = r2 - r1
            int r0 = r8.A00
            int r0 = X.AnonymousClass6C9.A0A(r0, r10, r2)
            long r2 = (long) r0
            r11 = 0
        L_0x0045:
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x005d
            byte[] r0 = r9.A06
            int r7 = r1 + 1
            byte r1 = r0[r1]
            byte[] r0 = r8.A06
            int r6 = r10 + 1
            byte r0 = r0[r10]
            if (r1 != r0) goto L_0x007d
            r0 = 1
            long r11 = r11 + r0
            r1 = r7
            r10 = r6
            goto L_0x0045
        L_0x005d:
            int r0 = r9.A00
            if (r1 != r0) goto L_0x006c
            X.7kd r9 = r9.A02
            if (r9 != 0) goto L_0x006a
            java.lang.RuntimeException r0 = X.C162457s7.A05()
            throw r0
        L_0x006a:
            int r1 = r9.A01
        L_0x006c:
            int r0 = r8.A00
            if (r10 != r0) goto L_0x007b
            X.7kd r8 = r8.A02
            if (r8 != 0) goto L_0x0079
            java.lang.RuntimeException r0 = X.C162457s7.A05()
            throw r0
        L_0x0079:
            int r10 = r8.A01
        L_0x007b:
            long r13 = r13 + r2
            goto L_0x0035
        L_0x007d:
            return r15
        L_0x007e:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172278Kj.equals(java.lang.Object):boolean");
    }

    public void flush() {
    }

    public int hashCode() {
        C158837kd r5 = this.A01;
        C158837kd r4 = r5;
        if (r5 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = r5.A00;
            for (int i3 = r5.A01; i3 < i2; i3++) {
                i = (i * 31) + r5.A06[i3];
            }
            r5 = r5.A02;
            if (r5 == null) {
                throw C162457s7.A05();
            }
        } while (r5 != r4);
        return i;
    }

    public boolean isOpen() {
        return true;
    }

    public byte readByte() {
        long j = this.A00;
        if (j != 0) {
            C158837kd r7 = this.A01;
            if (r7 == null) {
                throw C162457s7.A05();
            }
            int i = r7.A01;
            int i2 = r7.A00;
            int i3 = i + 1;
            byte b = r7.A06[i];
            this.A00 = j - 1;
            if (i3 == i2) {
                C158837kd.A00(this, r7);
                return b;
            }
            r7.A01 = i3;
            return b;
        }
        throw AnonymousClass6CA.A0M();
    }

    public String toString() {
        Object r0;
        long j = this.A00;
        if (j <= ((long) Integer.MAX_VALUE)) {
            int i = (int) j;
            if (i == 0) {
                r0 = AnonymousClass8Lk.A02;
            } else {
                C1453875h.A00(j, 0, (long) i);
                C158837kd r3 = this.A01;
                C158837kd r8 = r3;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (i3 < i) {
                    if (r3 == null) {
                        throw C162457s7.A05();
                    }
                    int i5 = r3.A00;
                    int i6 = r3.A01;
                    if (i5 != i6) {
                        i3 += i5 - i6;
                        i4++;
                        r3 = r3.A02;
                    } else {
                        throw AnonymousClass0x9.A0i("s.limit == s.pos");
                    }
                }
                byte[][] bArr = new byte[i4][];
                int[] iArr = new int[(i4 * 2)];
                int i7 = 0;
                while (i2 < i) {
                    if (r8 == null) {
                        throw C162457s7.A05();
                    }
                    bArr[i7] = r8.A06;
                    int i8 = r8.A00;
                    int i9 = r8.A01;
                    i2 += i8 - i9;
                    iArr[i7] = Math.min(i2, i);
                    iArr[i7 + i4] = i9;
                    r8.A05 = true;
                    i7++;
                    r8 = r8.A02;
                }
                r0 = new C175998aD(iArr, bArr);
            }
            return r0.toString();
        }
        throw AnonymousClass001.A0e(AnonymousClass000.A0Z("size > Integer.MAX_VALUE: ", AnonymousClass001.A0o(), j));
    }
}
