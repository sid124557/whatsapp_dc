package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6bi  reason: invalid class name and case insensitive filesystem */
public final class C130286bi extends C153797c2 {
    public int A00;
    public int A01;
    public int A02 = Integer.MAX_VALUE;
    public int A03;
    public int A04;
    public int A05;
    public final InputStream A06;
    public final byte[] A07;

    public C130286bi(InputStream inputStream) {
        this.A06 = inputStream;
        this.A07 = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
        this.A00 = 0;
        this.A04 = 0;
        this.A05 = 0;
    }

    public int A0P() {
        int i = this.A04;
        if (this.A00 - i < 4) {
            A0X(4);
            i = this.A04;
        }
        byte[] bArr = this.A07;
        this.A04 = i + 4;
        return AnonymousClass6C7.A0B(bArr, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r4[r2] < 0) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0Q() {
        /*
            r5 = this;
            int r0 = r5.A04
            int r1 = r5.A00
            if (r1 == r0) goto L_0x003c
            byte[] r4 = r5.A07
            int r2 = r0 + 1
            byte r3 = r4[r0]
            if (r3 < 0) goto L_0x005d
            r5.A04 = r2
            return r3
        L_0x0011:
            int r2 = r1 + 1
            byte r1 = r4[r1]
            int r0 = r1 << 28
            r3 = r3 ^ r0
            r0 = 266354560(0xfe03f80, float:2.2112565E-29)
            r3 = r3 ^ r0
            if (r1 >= 0) goto L_0x004d
            int r1 = r2 + 1
            byte r0 = r4[r2]
            if (r0 >= 0) goto L_0x006d
            int r2 = r1 + 1
            byte r0 = r4[r1]
            if (r0 >= 0) goto L_0x004d
            int r1 = r2 + 1
            byte r0 = r4[r2]
            if (r0 >= 0) goto L_0x006d
            int r2 = r1 + 1
            byte r0 = r4[r1]
            if (r0 >= 0) goto L_0x004d
            int r1 = r2 + 1
            byte r0 = r4[r2]
            if (r0 >= 0) goto L_0x006d
        L_0x003c:
            long r1 = r5.A0T()
            int r0 = (int) r1
            return r0
        L_0x0042:
            int r2 = r1 + 1
            byte r0 = r4[r1]
            int r0 = r0 << 14
            r3 = r3 ^ r0
            if (r3 < 0) goto L_0x004f
            r3 = r3 ^ 16256(0x3f80, float:2.278E-41)
        L_0x004d:
            r1 = r2
            goto L_0x006d
        L_0x004f:
            int r1 = r2 + 1
            byte r0 = r4[r2]
            int r0 = r0 << 21
            r3 = r3 ^ r0
            if (r3 >= 0) goto L_0x0011
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r3 = r3 ^ r0
            goto L_0x006d
        L_0x005d:
            int r1 = r1 - r2
            r0 = 9
            if (r1 < r0) goto L_0x003c
            int r1 = r2 + 1
            byte r0 = r4[r2]
            int r0 = r0 << 7
            r3 = r3 ^ r0
            if (r3 >= 0) goto L_0x0042
            r3 = r3 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x006d:
            r5.A04 = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130286bi.A0Q():int");
    }

    public long A0R() {
        int i = this.A04;
        if (this.A00 - i < 8) {
            A0X(8);
            i = this.A04;
        }
        byte[] bArr = this.A07;
        this.A04 = i + 8;
        return C153797c2.A00(bArr, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (((long) r5[r9]) < 0) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A0S() {
        /*
            r10 = this;
            int r0 = r10.A04
            int r3 = r10.A00
            if (r3 == r0) goto L_0x002e
            byte[] r5 = r10.A07
            int r1 = r0 + 1
            byte r2 = r5[r0]
            if (r2 < 0) goto L_0x0083
            r10.A04 = r1
            long r0 = (long) r2
            return r0
        L_0x0012:
            int r9 = r6 + 1
            byte r0 = r5[r6]
            long r1 = (long) r0
            r0 = 56
            long r1 = r1 << r0
            long r3 = r3 ^ r1
            r0 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0047
            int r6 = r9 + 1
            byte r0 = r5[r9]
            long r1 = (long) r0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0094
        L_0x002e:
            long r0 = r10.A0T()
            return r0
        L_0x0033:
            long r3 = (long) r2
            int r9 = r6 + 1
            byte r0 = r5[r6]
            long r1 = (long) r0
            r0 = 28
            long r1 = r1 << r0
            long r3 = r3 ^ r1
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0049
            r0 = 266354560(0xfe03f80, double:1.315966377E-315)
        L_0x0046:
            long r3 = r3 ^ r0
        L_0x0047:
            r6 = r9
            goto L_0x0094
        L_0x0049:
            int r6 = r9 + 1
            byte r0 = r5[r9]
            long r1 = (long) r0
            r0 = 35
            long r1 = r1 << r0
            long r3 = r3 ^ r1
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x005d
            r0 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L_0x005b:
            long r3 = r3 ^ r0
            goto L_0x0094
        L_0x005d:
            int r9 = r6 + 1
            byte r0 = r5[r6]
            long r1 = (long) r0
            r0 = 42
            long r1 = r1 << r0
            long r3 = r3 ^ r1
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0070
            r0 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x0046
        L_0x0070:
            int r6 = r9 + 1
            byte r0 = r5[r9]
            long r1 = (long) r0
            r0 = 49
            long r1 = r1 << r0
            long r3 = r3 ^ r1
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0012
            r0 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x005b
        L_0x0083:
            int r3 = r3 - r1
            r0 = 9
            if (r3 < r0) goto L_0x002e
            int r6 = r1 + 1
            byte r0 = r5[r1]
            int r0 = r0 << 7
            r2 = r2 ^ r0
            if (r2 >= 0) goto L_0x0097
            r2 = r2 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x0093:
            long r3 = (long) r2
        L_0x0094:
            r10.A04 = r6
            return r3
        L_0x0097:
            int r1 = r6 + 1
            byte r0 = r5[r6]
            int r0 = r0 << 14
            r2 = r2 ^ r0
            if (r2 < 0) goto L_0x00a5
            r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            long r3 = (long) r0
            r6 = r1
            goto L_0x0094
        L_0x00a5:
            int r6 = r1 + 1
            byte r0 = r5[r1]
            int r0 = r0 << 21
            r2 = r2 ^ r0
            if (r2 >= 0) goto L_0x0033
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r2 = r2 ^ r0
            goto L_0x0093
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130286bi.A0S():long");
    }

    public long A0T() {
        long j = 0;
        int i = 0;
        do {
            if (this.A04 == this.A00) {
                A0X(1);
            }
            byte[] bArr = this.A07;
            int i2 = this.A04;
            this.A04 = i2 + 1;
            byte b = bArr[i2];
            j |= ((long) (b & Byte.MAX_VALUE)) << i;
            if ((b & 128) == 0) {
                return j;
            }
            i += 7;
        } while (i < 64);
        throw AnonymousClass6u5.A02("CodedInputStream encountered a malformed varint.");
    }

    public final void A0V() {
        int i = this.A00 + this.A01;
        this.A00 = i;
        int i2 = this.A05 + i;
        int i3 = this.A02;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.A01 = i4;
            this.A00 = i - i4;
            return;
        }
        this.A01 = 0;
    }

    public void A0W(int i) {
        int i2 = this.A00;
        int i3 = this.A04;
        int i4 = i2 - i3;
        if (i <= i4) {
            if (i >= 0) {
                this.A04 = i3 + i;
                return;
            }
        } else if (i >= 0) {
            int i5 = this.A05;
            int i6 = i5 + i3;
            int i7 = i6 + i;
            int i8 = this.A02;
            if (i7 <= i8) {
                this.A05 = i6;
                this.A00 = 0;
                this.A04 = 0;
                while (i4 < i) {
                    int i9 = i - i4;
                    try {
                        InputStream inputStream = this.A06;
                        long j = (long) i9;
                        long skip = inputStream.skip(j);
                        int i10 = (skip > 0 ? 1 : (skip == 0 ? 0 : -1));
                        if (i10 >= 0 && skip <= j) {
                            if (i10 == 0) {
                                break;
                            }
                            i4 += (int) skip;
                        } else {
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append(inputStream.getClass());
                            A0o.append("#skip returned invalid result: ");
                            A0o.append(skip);
                            throw AnonymousClass000.A0I("\nThe InputStream implementation is buggy.", A0o);
                        }
                    } catch (AnonymousClass6u5 e) {
                        e.wasThrownFromInputStream = true;
                        throw e;
                    } catch (Throwable th) {
                        this.A05 += i4;
                        A0V();
                        throw th;
                    }
                }
                this.A05 += i4;
                A0V();
                if (i4 < i) {
                    int i11 = this.A00;
                    int i12 = i11 - this.A04;
                    this.A04 = i11;
                    while (true) {
                        A0X(1);
                        int i13 = i - i12;
                        int i14 = this.A00;
                        if (i13 > i14) {
                            i12 += i14;
                            this.A04 = i14;
                        } else {
                            this.A04 = i13;
                            return;
                        }
                    }
                } else {
                    return;
                }
            } else {
                A0W((i8 - i5) - i3);
                throw AnonymousClass6u5.A00();
            }
        }
        throw AnonymousClass6u5.A01();
    }

    public final boolean A0Y(int i) {
        int i2 = this.A04;
        int i3 = i2 + i;
        int i4 = this.A00;
        if (i3 > i4) {
            int i5 = this.A05;
            if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.A02) {
                if (i2 > 0) {
                    if (i4 > i2) {
                        byte[] bArr = this.A07;
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    i5 = this.A05 + i2;
                    this.A05 = i5;
                    i4 = this.A00 - i2;
                    this.A00 = i4;
                    this.A04 = 0;
                }
                InputStream inputStream = this.A06;
                byte[] bArr2 = this.A07;
                int length = bArr2.length;
                try {
                    int read = inputStream.read(bArr2, i4, AnonymousClass6C9.A0A(Integer.MAX_VALUE - i5, i4, length - i4));
                    if (read == 0 || read < -1 || read > length) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append(inputStream.getClass());
                        A0o.append("#read(byte[]) returned invalid result: ");
                        A0o.append(read);
                        throw AnonymousClass000.A0I("\nThe InputStream implementation is buggy.", A0o);
                    } else if (read > 0) {
                        this.A00 += read;
                        A0V();
                        if (this.A00 >= i) {
                            return true;
                        }
                        return A0Y(i);
                    }
                } catch (AnonymousClass6u5 e) {
                    e.wasThrownFromInputStream = true;
                    throw e;
                }
            }
            return false;
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("refillBuffer() called when ");
        A0o2.append(i);
        throw AnonymousClass000.A0I(" bytes were already available in buffer", A0o2);
    }

    public final byte[] A0a(int i) {
        if (i >= 0) {
            int i2 = this.A05;
            int i3 = this.A04;
            int i4 = i2 + i3 + i;
            if (i4 - Integer.MAX_VALUE <= 0) {
                int i5 = this.A02;
                if (i4 <= i5) {
                    int i6 = this.A00 - i3;
                    int i7 = i - i6;
                    if (i7 >= 4096) {
                        try {
                            if (i7 > this.A06.available()) {
                                return null;
                            }
                        } catch (AnonymousClass6u5 e) {
                            e.wasThrownFromInputStream = true;
                            throw e;
                        }
                    }
                    byte[] bArr = new byte[i];
                    System.arraycopy(this.A07, this.A04, bArr, 0, i6);
                    this.A05 += this.A00;
                    this.A04 = 0;
                    this.A00 = 0;
                    while (i6 < i) {
                        int read = this.A06.read(bArr, i6, i - i6);
                        if (read != -1) {
                            this.A05 += read;
                            i6 += read;
                        } else {
                            throw AnonymousClass6u5.A00();
                        }
                    }
                    return bArr;
                }
                A0W((i5 - i2) - i3);
                throw AnonymousClass6u5.A00();
            }
            throw AnonymousClass6u5.A02("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw AnonymousClass6u5.A01();
    }

    public final List A0U(int i) {
        ArrayList A0s = AnonymousClass001.A0s();
        while (i > 0) {
            int min = Math.min(i, ZipDecompressor.UNZIP_BUFFER_SIZE);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.A06.read(bArr, i2, min - i2);
                if (read != -1) {
                    this.A05 += read;
                    i2 += read;
                } else {
                    throw AnonymousClass6u5.A00();
                }
            }
            i -= min;
            A0s.add(bArr);
        }
        return A0s;
    }

    public final void A0X(int i) {
        if (A0Y(i)) {
            return;
        }
        if (i > (Integer.MAX_VALUE - this.A05) - this.A04) {
            throw AnonymousClass6u5.A02("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw AnonymousClass6u5.A00();
    }

    public final byte[] A0Z(int i) {
        byte[] A0a = A0a(i);
        if (A0a != null) {
            return A0a;
        }
        int i2 = this.A04;
        int i3 = this.A00;
        int i4 = i3 - i2;
        this.A05 += i3;
        this.A04 = 0;
        this.A00 = 0;
        List<byte[]> A0U = A0U(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.A07, i2, bArr, 0, i4);
        for (byte[] bArr2 : A0U) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }
}
