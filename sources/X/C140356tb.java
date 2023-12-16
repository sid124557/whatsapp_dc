package X;

import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: X.6tb  reason: invalid class name and case insensitive filesystem */
public class C140356tb extends FilterInputStream {
    public final int A00;
    public final boolean A01 = false;
    public final byte[][] A02 = new byte[11][];

    public static int A00(InputStream inputStream, int i) {
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int read = inputStream.read();
        if ((read & 127) != 0) {
            int i3 = 0;
            while (read >= 0) {
                int i4 = read & 127;
                if ((read & 128) == 0) {
                    return i3 | i4;
                }
                i3 = (i4 | i3) << 7;
                read = inputStream.read();
            }
            throw new EOFException("EOF found inside tag value.");
        }
        throw AnonymousClass002.A0C("corrupted stream - invalid high tag number found");
    }

    public static C161377pW A02(C177108e5 r2) {
        if (r2.A00 < 1) {
            return new C161377pW(0);
        }
        C140356tb r1 = new C140356tb((InputStream) r2);
        C161377pW r22 = new C161377pW();
        while (true) {
            C177088e3 A06 = r1.A06();
            if (A06 == null) {
                return r22;
            }
            r22.A03(A06);
        }
    }

    public static C140356tb A03(StringBuffer stringBuffer, C176778dY r3, C176548dB r4) {
        C140356tb r1 = new C140356tb(r3.A00);
        stringBuffer.append("                       critical(");
        stringBuffer.append(r4.A02);
        stringBuffer.append(") ");
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0149, code lost:
        if (r1 != 8) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x014b, code lost:
        r7[r3] = (char) X.AnonymousClass6CA.A0C(r5, 1, r5[0] << 8);
        r7[r3 + 1] = (char) X.AnonymousClass6CA.A0C(r5, 3, r5[2] << 8);
        r7[r3 + 2] = (char) X.AnonymousClass6CA.A0C(r5, 5, r5[4] << 8);
        r7[r3 + 3] = (char) X.AnonymousClass6CA.A0C(r5, 7, r5[6] << 8);
        r3 = r3 + 4;
        r9 = r9 - 8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fe A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01a2 A[LOOP:4: B:99:0x01a2->B:100:0x01b4, LOOP_START, PHI: r3 r4 
      PHI: (r3v4 int) = (r3v2 int), (r3v5 int) binds: [B:96:0x019a, B:100:0x01b4] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:96:0x019a, B:100:0x01b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C177088e3 A04(X.C177108e5 r10, byte[][] r11, int r12) {
        /*
            r0 = 10
            if (r12 == r0) goto L_0x01d8
            r0 = 12
            if (r12 == r0) goto L_0x01ce
            r0 = 30
            if (r12 == r0) goto L_0x0129
            switch(r12) {
                case 1: goto L_0x008d;
                case 2: goto L_0x00b0;
                case 3: goto L_0x00e1;
                case 4: goto L_0x00bb;
                case 5: goto L_0x00c5;
                case 6: goto L_0x00c8;
                default: goto L_0x000f;
            }
        L_0x000f:
            switch(r12) {
                case 18: goto L_0x01f8;
                case 19: goto L_0x0029;
                case 20: goto L_0x0033;
                case 21: goto L_0x003d;
                case 22: goto L_0x0047;
                case 23: goto L_0x0051;
                case 24: goto L_0x005b;
                case 25: goto L_0x0065;
                case 26: goto L_0x006f;
                case 27: goto L_0x0079;
                case 28: goto L_0x0083;
                default: goto L_0x0012;
            }
        L_0x0012:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "unknown tag "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = " encountered"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            java.io.IOException r1 = X.AnonymousClass002.A0C(r0)
            throw r1
        L_0x0029:
            byte[] r0 = r10.A02()
            X.8dg r2 = new X.8dg
            r2.<init>((byte[]) r0)
            return r2
        L_0x0033:
            byte[] r0 = r10.A02()
            X.8de r2 = new X.8de
            r2.<init>(r0)
            return r2
        L_0x003d:
            byte[] r0 = r10.A02()
            X.8da r2 = new X.8da
            r2.<init>(r0)
            return r2
        L_0x0047:
            byte[] r0 = r10.A02()
            X.8dk r2 = new X.8dk
            r2.<init>((byte[]) r0)
            return r2
        L_0x0051:
            byte[] r0 = r10.A02()
            X.8dR r2 = new X.8dR
            r2.<init>((byte[]) r0)
            return r2
        L_0x005b:
            byte[] r0 = r10.A02()
            X.8dW r2 = new X.8dW
            r2.<init>((byte[]) r0)
            return r2
        L_0x0065:
            byte[] r0 = r10.A02()
            X.8dZ r2 = new X.8dZ
            r2.<init>(r0)
            return r2
        L_0x006f:
            byte[] r0 = r10.A02()
            X.8df r2 = new X.8df
            r2.<init>(r0)
            return r2
        L_0x0079:
            byte[] r0 = r10.A02()
            X.8dc r2 = new X.8dc
            r2.<init>(r0)
            return r2
        L_0x0083:
            byte[] r0 = r10.A02()
            X.8di r2 = new X.8di
            r2.<init>(r0)
            return r2
        L_0x008d:
            byte[] r2 = A05(r10, r11)
            int r1 = r2.length
            r0 = 1
            if (r1 != r0) goto L_0x00a9
            r0 = 0
            byte r1 = r2[r0]
            r0 = -1
            if (r1 == r0) goto L_0x00a6
            if (r1 == 0) goto L_0x00a3
            X.8dU r2 = new X.8dU
            r2.<init>(r1)
            return r2
        L_0x00a3:
            X.8dU r2 = X.C176738dU.A01
            return r2
        L_0x00a6:
            X.8dU r2 = X.C176738dU.A02
            return r2
        L_0x00a9:
            java.lang.String r0 = "BOOLEAN value should have 1 byte in it"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x00b0:
            byte[] r1 = r10.A02()
            r0 = 0
            X.8dV r2 = new X.8dV
            r2.<init>(r1, r0)
            return r2
        L_0x00bb:
            byte[] r0 = r10.A02()
            X.8dL r2 = new X.8dL
            r2.<init>(r0)
            return r2
        L_0x00c5:
            X.8cT r2 = X.C176108cT.A00
            return r2
        L_0x00c8:
            byte[] r3 = A05(r10, r11)
            X.7Vz r1 = new X.7Vz
            r1.<init>(r3)
            java.util.concurrent.ConcurrentMap r0 = X.C176768dX.A02
            java.lang.Object r2 = r0.get(r1)
            X.8e3 r2 = (X.C177088e3) r2
            if (r2 != 0) goto L_0x0201
            X.8dX r2 = new X.8dX
            r2.<init>((byte[]) r3)
            return r2
        L_0x00e1:
            int r5 = r10.A00
            r2 = 1
            if (r5 < r2) goto L_0x0122
            int r4 = r10.read()
            int r5 = r5 - r2
            byte[] r3 = new byte[r5]
            if (r5 == 0) goto L_0x011c
            r1 = 0
        L_0x00f0:
            if (r1 >= r5) goto L_0x00fc
            int r0 = r5 - r1
            int r0 = r10.read(r3, r1, r0)
            if (r0 < 0) goto L_0x00fc
            int r1 = r1 + r0
            goto L_0x00f0
        L_0x00fc:
            if (r1 != r5) goto L_0x0114
            if (r4 <= 0) goto L_0x011c
            r0 = 8
            if (r4 >= r0) goto L_0x011c
            int r5 = r5 - r2
            byte r1 = r3[r5]
            r0 = 255(0xff, float:3.57E-43)
            int r0 = r0 << r4
            r0 = r0 & r1
            byte r0 = (byte) r0
            if (r1 == r0) goto L_0x011c
            X.8cO r2 = new X.8cO
            r2.<init>(r3, r4)
            return r2
        L_0x0114:
            java.lang.String r0 = "EOF encountered in middle of BIT STRING"
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>(r0)
            throw r1
        L_0x011c:
            X.8cP r2 = new X.8cP
            r2.<init>(r3, r4)
            return r2
        L_0x0122:
            java.lang.String r0 = "truncated BIT STRING detected"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A0c(r0)
            throw r1
        L_0x0129:
            int r9 = r10.A00
            r0 = r9 & 1
            if (r0 != 0) goto L_0x01c7
            int r8 = r9 / 2
            char[] r7 = new char[r8]
            r6 = 8
            byte[] r5 = new byte[r6]
            r4 = 0
            r3 = 0
        L_0x0139:
            java.lang.String r2 = "EOF encountered in middle of BMPString"
            if (r9 < r6) goto L_0x018b
            r1 = 0
        L_0x013e:
            int r0 = r6 - r1
            int r0 = r10.read(r5, r1, r0)
            if (r0 < 0) goto L_0x0185
            int r1 = r1 + r0
            if (r1 < r6) goto L_0x013e
            if (r1 != r6) goto L_0x0185
            byte r1 = r5[r4]
            int r1 = r1 << r6
            r0 = 1
            int r0 = X.AnonymousClass6CA.A0C(r5, r0, r1)
            char r0 = (char) r0
            r7[r3] = r0
            int r2 = r3 + 1
            r0 = 2
            byte r1 = r5[r0]
            int r1 = r1 << r6
            r0 = 3
            int r0 = X.AnonymousClass6CA.A0C(r5, r0, r1)
            char r0 = (char) r0
            r7[r2] = r0
            int r2 = r3 + 2
            r0 = 4
            byte r1 = r5[r0]
            int r1 = r1 << r6
            r0 = 5
            int r0 = X.AnonymousClass6CA.A0C(r5, r0, r1)
            char r0 = (char) r0
            r7[r2] = r0
            int r2 = r3 + 3
            r0 = 6
            byte r1 = r5[r0]
            int r1 = r1 << r6
            r0 = 7
            int r0 = X.AnonymousClass6CA.A0C(r5, r0, r1)
            char r0 = (char) r0
            r7[r2] = r0
            int r3 = r3 + 4
            int r9 = r9 + -8
            goto L_0x0139
        L_0x0185:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>(r2)
            throw r1
        L_0x018b:
            if (r9 <= 0) goto L_0x01b6
            r1 = 0
        L_0x018e:
            int r0 = r9 - r1
            int r0 = r10.read(r5, r1, r0)
            if (r0 < 0) goto L_0x019a
            int r1 = r1 + r0
            if (r1 >= r9) goto L_0x019a
            goto L_0x018e
        L_0x019a:
            if (r1 == r9) goto L_0x01a2
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>(r2)
            throw r1
        L_0x01a2:
            int r0 = r4 + 1
            byte r2 = r5[r4]
            int r2 = r2 << r6
            int r4 = r0 + 1
            byte r0 = r5[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r3 + 1
            r2 = r2 | r0
            char r0 = (char) r2
            r7[r3] = r0
            r3 = r1
            if (r4 < r9) goto L_0x01a2
        L_0x01b6:
            int r0 = r10.A00
            if (r0 != 0) goto L_0x01c2
            if (r8 != r3) goto L_0x01c2
            X.8db r2 = new X.8db
            r2.<init>(r7)
            return r2
        L_0x01c2:
            java.lang.IllegalStateException r1 = X.AnonymousClass6CA.A0O()
            throw r1
        L_0x01c7:
            java.lang.String r0 = "malformed BMPString encoding encountered"
            java.io.IOException r1 = X.AnonymousClass002.A0C(r0)
            throw r1
        L_0x01ce:
            byte[] r0 = r10.A02()
            X.8dh r2 = new X.8dh
            r2.<init>((byte[]) r0)
            return r2
        L_0x01d8:
            byte[] r4 = A05(r10, r11)
            int r1 = r4.length
            r0 = 1
            if (r1 > r0) goto L_0x0209
            if (r1 == 0) goto L_0x0202
            r0 = 0
            byte r0 = r4[r0]
            r3 = r0 & 255(0xff, float:3.57E-43)
            X.8dT[] r1 = X.C176728dT.A02
            int r0 = r1.length
            if (r3 >= r0) goto L_0x0209
            r2 = r1[r3]
            if (r2 != 0) goto L_0x0201
            X.8dT r2 = new X.8dT
            r2.<init>((byte[]) r4)
            r1[r3] = r2
            return r2
        L_0x01f8:
            byte[] r0 = r10.A02()
            X.8dd r2 = new X.8dd
            r2.<init>(r0)
        L_0x0201:
            return r2
        L_0x0202:
            java.lang.String r0 = "ENUMERATED has zero length"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A0c(r0)
            throw r1
        L_0x0209:
            X.8dT r2 = new X.8dT
            r2.<init>((byte[]) r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140356tb.A04(X.8e5, byte[][], int):X.8e3");
    }

    public static byte[] A05(C177108e5 r6, byte[][] bArr) {
        int i = r6.A00;
        if (i >= bArr.length) {
            return r6.A02();
        }
        byte[] bArr2 = bArr[i];
        if (bArr2 == null) {
            bArr2 = new byte[i];
            bArr[i] = bArr2;
        }
        int length = bArr2.length;
        if (i != length) {
            throw AnonymousClass001.A0c("buffer length not right for data");
        } else if (i == 0) {
            return bArr2;
        } else {
            int i2 = r6.A00;
            if (i < i2) {
                InputStream inputStream = r6.A01;
                int i3 = 0;
                while (i3 < length) {
                    int read = inputStream.read(bArr2, i3, length - i3);
                    if (read < 0) {
                        break;
                    }
                    i3 += read;
                }
                int i4 = i - i3;
                r6.A00 = i4;
                if (i4 == 0) {
                    r6.A01();
                    return bArr2;
                }
                throw new EOFException(AnonymousClass000.A0Y(" object truncated by ", C177108e5.A00(r6), i4));
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("corrupted stream - out of bounds length found: ");
            A0o.append(i);
            throw AnonymousClass002.A0C(AnonymousClass000.A0Y(" >= ", A0o, i2));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C140356tb(byte[] r4, boolean r5) {
        /*
            r3 = this;
            java.io.ByteArrayInputStream r2 = X.AnonymousClass0x9.A0d(r4)
            int r1 = r4.length
            r0 = 1
            r3.<init>(r2)
            r3.A00 = r1
            r3.A01 = r0
            r0 = 11
            byte[][] r0 = new byte[r0][]
            r3.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140356tb.<init>(byte[], boolean):void");
    }

    public static int A01(InputStream inputStream, int i, boolean z) {
        int read = inputStream.read();
        if (read < 0) {
            throw new EOFException("EOF found when length expected");
        } else if (read == 128) {
            return -1;
        } else {
            if (read > 127) {
                int i2 = read & 127;
                if (i2 <= 4) {
                    read = 0;
                    int i3 = 0;
                    while (i3 < i2) {
                        int read2 = inputStream.read();
                        if (read2 >= 0) {
                            read = (read << 8) + read2;
                            i3++;
                        } else {
                            throw new EOFException("EOF found reading length");
                        }
                    }
                    if (read < 0) {
                        throw AnonymousClass002.A0C("corrupted stream - negative length found");
                    } else if (read >= i && !z) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("corrupted stream - out of bounds length found: ");
                        A0o.append(read);
                        throw AnonymousClass002.A0C(AnonymousClass000.A0Y(" >= ", A0o, i));
                    }
                } else {
                    throw AnonymousClass002.A0C(AnonymousClass000.A0Y("DER length more than 4 bytes: ", AnonymousClass001.A0o(), i2));
                }
            }
            return read;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: X.8dY[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C177088e3 A06() {
        /*
            r8 = this;
            int r7 = r8.read()
            if (r7 > 0) goto L_0x0011
            if (r7 == 0) goto L_0x000a
            r0 = 0
            return r0
        L_0x000a:
            java.lang.String r0 = "unexpected end-of-contents marker"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        L_0x0011:
            int r4 = A00(r8, r7)
            r2 = r7 & 32
            boolean r1 = X.AnonymousClass000.A1S(r2)
            int r3 = r8.A00
            r0 = 0
            int r0 = A01(r8, r3, r0)
            if (r0 >= 0) goto L_0x008d
            if (r1 == 0) goto L_0x0086
            X.8e4 r0 = new X.8e4
            r0.<init>(r8, r3)
            X.7Z0 r1 = new X.7Z0
            r1.<init>(r0, r3)
            r0 = r7 & 64
            if (r0 == 0) goto L_0x003e
            X.8Q2 r0 = new X.8Q2
            r0.<init>(r1, r4)
            X.8e3 r0 = r0.B99()
            return r0
        L_0x003e:
            r0 = r7 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0048
            r0 = 1
            X.8e3 r0 = r1.A02(r4, r0)
            return r0
        L_0x0048:
            r0 = 4
            if (r4 == r0) goto L_0x007c
            r0 = 8
            if (r4 == r0) goto L_0x0072
            r0 = 16
            if (r4 == r0) goto L_0x0068
            r0 = 17
            if (r4 != r0) goto L_0x0061
            X.8Q7 r0 = new X.8Q7
            r0.<init>(r1)
            X.8e3 r0 = r0.B99()
            return r0
        L_0x0061:
            java.lang.String r0 = "unknown BER object encountered"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        L_0x0068:
            X.8Q5 r0 = new X.8Q5
            r0.<init>(r1)
            X.8e3 r0 = r0.B99()
            return r0
        L_0x0072:
            X.8Q1 r0 = new X.8Q1
            r0.<init>(r1)
            X.8e3 r0 = r0.B99()
            return r0
        L_0x007c:
            X.8Q3 r0 = new X.8Q3
            r0.<init>(r1)
            X.8e3 r0 = r0.B99()
            return r0
        L_0x0086:
            java.lang.String r0 = "indefinite-length primitive encoding encountered"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        L_0x008d:
            r6 = 0
            boolean r5 = X.AnonymousClass000.A1S(r2)
            X.8e5 r2 = new X.8e5     // Catch:{ IllegalArgumentException -> 0x0152 }
            r2.<init>(r8, r0, r3)     // Catch:{ IllegalArgumentException -> 0x0152 }
            r0 = r7 & 64
            if (r0 == 0) goto L_0x00a5
            byte[] r0 = r2.A02()     // Catch:{ IllegalArgumentException -> 0x0152 }
            X.8cN r3 = new X.8cN     // Catch:{ IllegalArgumentException -> 0x0152 }
            r3.<init>(r0, r4, r5)     // Catch:{ IllegalArgumentException -> 0x0152 }
            return r3
        L_0x00a5:
            r0 = r7 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00b7
            int r1 = X.C161127p3.A02(r2)     // Catch:{ IllegalArgumentException -> 0x0152 }
            X.7Z0 r0 = new X.7Z0     // Catch:{ IllegalArgumentException -> 0x0152 }
            r0.<init>(r2, r1)     // Catch:{ IllegalArgumentException -> 0x0152 }
            X.8e3 r3 = r0.A02(r4, r5)     // Catch:{ IllegalArgumentException -> 0x0152 }
            return r3
        L_0x00b7:
            if (r5 == 0) goto L_0x014b
            r0 = 4
            if (r4 == r0) goto L_0x0104
            r0 = 8
            if (r4 == r0) goto L_0x00fa
            r0 = 16
            if (r4 == r0) goto L_0x00da
            r0 = 17
            if (r4 != r0) goto L_0x012e
            X.7pW r2 = A02(r2)     // Catch:{ IllegalArgumentException -> 0x0152 }
            int r1 = r2.A00     // Catch:{ IllegalArgumentException -> 0x0152 }
            r0 = 1
            if (r1 >= r0) goto L_0x00d4
            X.8du r3 = X.C1461378u.A01     // Catch:{ IllegalArgumentException -> 0x0152 }
            return r3
        L_0x00d4:
            X.8ds r3 = new X.8ds     // Catch:{ IllegalArgumentException -> 0x0152 }
            r3.<init>((X.C161377pW) r2)     // Catch:{ IllegalArgumentException -> 0x0152 }
            return r3
        L_0x00da:
            boolean r0 = r8.A01     // Catch:{ IllegalArgumentException -> 0x0152 }
            if (r0 == 0) goto L_0x00e8
            byte[] r0 = r2.A02()     // Catch:{ IllegalArgumentException -> 0x0152 }
            X.8dm r3 = new X.8dm     // Catch:{ IllegalArgumentException -> 0x0152 }
            r3.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x0152 }
            return r3
        L_0x00e8:
            X.7pW r2 = A02(r2)     // Catch:{ IllegalArgumentException -> 0x0152 }
            int r1 = r2.A00     // Catch:{ IllegalArgumentException -> 0x0152 }
            r0 = 1
            if (r1 >= r0) goto L_0x00f4
            X.8dq r3 = X.C1461378u.A00     // Catch:{ IllegalArgumentException -> 0x0152 }
            return r3
        L_0x00f4:
            X.8do r3 = new X.8do     // Catch:{ IllegalArgumentException -> 0x0152 }
            r3.<init>((X.C161377pW) r2)     // Catch:{ IllegalArgumentException -> 0x0152 }
            return r3
        L_0x00fa:
            X.7pW r0 = A02(r2)     // Catch:{ IllegalArgumentException -> 0x0152 }
            X.8cQ r3 = new X.8cQ     // Catch:{ IllegalArgumentException -> 0x0152 }
            r3.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x0152 }
            return r3
        L_0x0104:
            X.7pW r4 = A02(r2)     // Catch:{ IllegalArgumentException -> 0x0152 }
            int r3 = r4.A00     // Catch:{ IllegalArgumentException -> 0x0152 }
            X.8dY[] r1 = new X.C176778dY[r3]     // Catch:{ IllegalArgumentException -> 0x0152 }
        L_0x010c:
            if (r6 == r3) goto L_0x0145
            X.8qL r2 = r4.A02(r6)     // Catch:{ IllegalArgumentException -> 0x0152 }
            boolean r0 = r2 instanceof X.C176778dY     // Catch:{ IllegalArgumentException -> 0x0152 }
            if (r0 == 0) goto L_0x011b
            r1[r6] = r2     // Catch:{ IllegalArgumentException -> 0x0152 }
            int r6 = r6 + 1
            goto L_0x010c
        L_0x011b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IllegalArgumentException -> 0x0152 }
            java.lang.String r0 = "unknown object encountered in constructed OCTET STRING: "
            X.AnonymousClass6C7.A1O(r1, r0, r2)     // Catch:{ IllegalArgumentException -> 0x0152 }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalArgumentException -> 0x0152 }
            X.6u6 r1 = new X.6u6     // Catch:{ IllegalArgumentException -> 0x0152 }
            r1.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x0152 }
            goto L_0x0144
        L_0x012e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IllegalArgumentException -> 0x0152 }
            java.lang.String r0 = "unknown tag "
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x0152 }
            r1.append(r4)     // Catch:{ IllegalArgumentException -> 0x0152 }
            java.lang.String r0 = " encountered"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0152 }
            java.io.IOException r1 = X.AnonymousClass002.A0C(r0)     // Catch:{ IllegalArgumentException -> 0x0152 }
        L_0x0144:
            throw r1     // Catch:{ IllegalArgumentException -> 0x0152 }
        L_0x0145:
            X.8dM r3 = new X.8dM     // Catch:{ IllegalArgumentException -> 0x0152 }
            r3.<init>((X.C176778dY[]) r1)     // Catch:{ IllegalArgumentException -> 0x0152 }
            return r3
        L_0x014b:
            byte[][] r0 = r8.A02     // Catch:{ IllegalArgumentException -> 0x0152 }
            X.8e3 r3 = A04(r2, r0, r4)     // Catch:{ IllegalArgumentException -> 0x0152 }
            return r3
        L_0x0152:
            r2 = move-exception
            java.lang.String r1 = "corrupted stream detected"
            X.6u6 r0 = new X.6u6
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140356tb.A06():X.8e3");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140356tb(InputStream inputStream, boolean z) {
        super(inputStream);
        int A022 = C161127p3.A02(inputStream);
        this.A00 = A022;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C140356tb(byte[] r4) {
        /*
            r3 = this;
            java.io.ByteArrayInputStream r2 = X.AnonymousClass0x9.A0d(r4)
            int r1 = r4.length
            r0 = 0
            r3.<init>(r2)
            r3.A00 = r1
            r3.A01 = r0
            r0 = 11
            byte[][] r0 = new byte[r0][]
            r3.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140356tb.<init>(byte[]):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140356tb(InputStream inputStream) {
        super(inputStream);
        int A022 = C161127p3.A02(inputStream);
        this.A00 = A022;
    }
}
