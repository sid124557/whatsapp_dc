package X;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.7qQ  reason: invalid class name and case insensitive filesystem */
public final class C161777qQ {
    public int A00;
    public C128346Vs A01;
    public final ByteBuffer A02;

    public C161777qQ(byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i);
        this.A02 = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void A03(int i) {
        byte b = (byte) i;
        ByteBuffer byteBuffer = this.A02;
        if (byteBuffer.hasRemaining()) {
            byteBuffer.put(b);
            return;
        }
        throw new C140506tq(byteBuffer.position(), byteBuffer.limit());
    }

    public static int A00(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        if ((j & Long.MIN_VALUE) == 0) {
            return 9;
        }
        return 10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        if (57343 >= r11) goto L_0x0074;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0066 A[Catch:{ ArrayIndexOutOfBoundsException -> 0x00c5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(java.lang.CharSequence r15, java.nio.ByteBuffer r16) {
        /*
            r8 = r16
            boolean r0 = r8.isReadOnly()
            if (r0 != 0) goto L_0x0147
            boolean r0 = r8.hasArray()
            java.lang.String r7 = "Unpaired surrogate at index "
            r16 = 39
            r6 = 57343(0xdfff, float:8.0355E-41)
            r5 = 55296(0xd800, float:7.7486E-41)
            r4 = 2048(0x800, float:2.87E-42)
            r10 = 0
            r3 = 128(0x80, float:1.794E-43)
            r9 = r15
            if (r0 == 0) goto L_0x00cf
            byte[] r15 = r8.array()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00c5 }
            int r12 = r8.arrayOffset()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00c5 }
            int r0 = r8.position()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00c5 }
            int r12 = r12 + r0
            int r14 = r8.remaining()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00c5 }
            int r13 = r9.length()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00c5 }
            int r14 = r14 + r12
        L_0x0034:
            if (r10 >= r13) goto L_0x0045
            int r1 = r10 + r12
            if (r1 >= r14) goto L_0x0045
            char r0 = r9.charAt(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00c5 }
            if (r0 >= r3) goto L_0x0045
            int r10 = X.AnonymousClass6CA.A0D(r15, r0, r1, r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00c5 }
            goto L_0x0034
        L_0x0045:
            if (r10 != r13) goto L_0x0049
            int r12 = r12 + r13
            goto L_0x00bc
        L_0x0049:
            int r12 = r12 + r10
        L_0x004a:
            if (r10 >= r13) goto L_0x00bc
            char r11 = r9.charAt(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00c5 }
            if (r11 >= r3) goto L_0x0057
            if (r12 >= r14) goto L_0x0062
            int r1 = r12 + 1
            goto L_0x0070
        L_0x0057:
            if (r11 < r4) goto L_0x0062
            if (r11 < r5) goto L_0x005d
            if (r6 >= r11) goto L_0x0074
        L_0x005d:
            int r0 = r14 + -3
            if (r12 > r0) goto L_0x0074
            goto L_0x0067
        L_0x0062:
            int r0 = r14 + -2
            if (r12 > r0) goto L_0x005d
            goto L_0x0090
        L_0x0067:
            int r12 = X.AnonymousClass6C8.A0H(r15, r12, r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00c5 }
            int r1 = r12 + 1
            r11 = r11 & 63
            r11 = r11 | r3
        L_0x0070:
            byte r0 = (byte) r11     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00c5 }
            r15[r12] = r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00c5 }
            goto L_0x00a0
        L_0x0074:
            int r0 = r14 + -4
            if (r12 > r0) goto L_0x00a6
            int r2 = r10 + 1
            int r0 = r9.length()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00c5 }
            if (r2 == r0) goto L_0x00b1
            char r1 = r9.charAt(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00c5 }
            boolean r0 = java.lang.Character.isSurrogatePair(r11, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00c5 }
            if (r0 == 0) goto L_0x00a4
            int r12 = X.AnonymousClass6C7.A0A(r15, r11, r1, r12)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00c5 }
            r10 = r2
            goto L_0x00a1
        L_0x0090:
            int r1 = r12 + 1
            int r0 = r11 >>> 6
            r0 = r0 | 960(0x3c0, float:1.345E-42)
            int r12 = X.AnonymousClass6CA.A0D(r15, r0, r12, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00c5 }
            r0 = r11 & 63
            X.AnonymousClass6C8.A0u(r0, r15, r3, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00c5 }
            goto L_0x00a1
        L_0x00a0:
            r12 = r1
        L_0x00a1:
            int r10 = r10 + 1
            goto L_0x004a
        L_0x00a4:
            r10 = r2
            goto L_0x00b1
        L_0x00a6:
            java.lang.StringBuilder r1 = X.AnonymousClass6C9.A0j(r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00c5 }
            java.lang.String r0 = " at index "
            java.lang.ArrayIndexOutOfBoundsException r0 = X.AnonymousClass6C7.A0T(r0, r1, r12)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00c5 }
            goto L_0x00bb
        L_0x00b1:
            int r1 = r10 + -1
            java.lang.StringBuilder r0 = X.AnonymousClass6CA.A0Y(r16)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00c5 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r7, r0, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00c5 }
        L_0x00bb:
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00c5 }
        L_0x00bc:
            int r0 = r8.arrayOffset()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00c5 }
            int r12 = r12 - r0
            r8.position(r12)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00c5 }
            return
        L_0x00c5:
            r1 = move-exception
            java.nio.BufferOverflowException r0 = new java.nio.BufferOverflowException
            r0.<init>()
            r0.initCause(r1)
            throw r0
        L_0x00cf:
            int r2 = r15.length()
        L_0x00d3:
            if (r10 >= r2) goto L_0x0146
            char r11 = r15.charAt(r10)
            if (r11 < r3) goto L_0x00e8
            if (r11 >= r4) goto L_0x00ef
            int r0 = r11 >>> 6
            r0 = r0 | 960(0x3c0, float:1.345E-42)
        L_0x00e1:
            byte r0 = (byte) r0
            r8.put(r0)
            r11 = r11 & 63
            r11 = r11 | r3
        L_0x00e8:
            byte r0 = (byte) r11
            r8.put(r0)
        L_0x00ec:
            int r10 = r10 + 1
            goto L_0x00d3
        L_0x00ef:
            if (r11 < r5) goto L_0x012c
            if (r6 < r11) goto L_0x012c
            int r1 = r10 + 1
            int r0 = r15.length()
            if (r1 == r0) goto L_0x013b
            char r10 = r15.charAt(r1)
            boolean r0 = java.lang.Character.isSurrogatePair(r11, r10)
            if (r0 == 0) goto L_0x013a
            int r10 = java.lang.Character.toCodePoint(r11, r10)
            int r0 = r10 >>> 18
            r0 = r0 | 240(0xf0, float:3.36E-43)
            byte r0 = (byte) r0
            r8.put(r0)
            int r0 = r10 >>> 12
            r0 = r0 & 63
            r0 = r0 | r3
            byte r0 = (byte) r0
            r8.put(r0)
            int r0 = r10 >>> 6
            r0 = r0 & 63
            r0 = r0 | r3
            byte r0 = (byte) r0
            r8.put(r0)
            r0 = r10 & 63
            r0 = r0 | r3
            byte r0 = (byte) r0
            r8.put(r0)
            r10 = r1
            goto L_0x00ec
        L_0x012c:
            int r0 = r11 >>> 12
            r0 = r0 | 480(0x1e0, float:6.73E-43)
            byte r0 = (byte) r0
            r8.put(r0)
            int r0 = r11 >>> 6
            r0 = r0 & 63
            r0 = r0 | r3
            goto L_0x00e1
        L_0x013a:
            r10 = r1
        L_0x013b:
            int r1 = r10 + -1
            java.lang.StringBuilder r0 = X.AnonymousClass6CA.A0Y(r16)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r7, r0, r1)
            throw r0
        L_0x0146:
            return
        L_0x0147:
            java.nio.ReadOnlyBufferException r0 = new java.nio.ReadOnlyBufferException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161777qQ.A02(java.lang.CharSequence, java.nio.ByteBuffer):void");
    }

    public final void A04(int i) {
        while ((i & -128) != 0) {
            A03((i & 127) | 128);
            i >>>= 7;
        }
        A03(i);
    }

    public final void A05(int i, String str) {
        A04((i << 3) | 2);
        try {
            int length = str.length();
            int A002 = AnonymousClass6C7.A00(length);
            if (A002 == AnonymousClass6C7.A00(length * 3)) {
                ByteBuffer byteBuffer = this.A02;
                int position = byteBuffer.position();
                if (byteBuffer.remaining() >= A002) {
                    byteBuffer.position(position + A002);
                    A02(str, byteBuffer);
                    int position2 = byteBuffer.position();
                    byteBuffer.position(position);
                    A04((position2 - position) - A002);
                    byteBuffer.position(position2);
                    return;
                }
                throw new C140506tq(position + A002, byteBuffer.limit());
            }
            A04(A01(str));
            A02(str, this.A02);
        } catch (BufferOverflowException e) {
            ByteBuffer byteBuffer2 = this.A02;
            C140506tq r0 = new C140506tq(byteBuffer2.position(), byteBuffer2.limit());
            r0.initCause(e);
            throw r0;
        }
    }

    public final void A06(int i, byte[] bArr) {
        A04((i << 3) | 2);
        int length = bArr.length;
        A04(length);
        ByteBuffer byteBuffer = this.A02;
        if (byteBuffer.remaining() >= length) {
            byteBuffer.put(bArr, 0, length);
            return;
        }
        throw new C140506tq(byteBuffer.position(), byteBuffer.limit());
    }

    public final void A07(long j) {
        while (true) {
            int i = (int) j;
            if ((-128 & j) == 0) {
                A03(i);
                return;
            } else {
                A03((i & 127) | 128);
                j >>>= 7;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(X.C187818xr r8, int r9) {
        /*
            r7 = this;
            X.6Vs r0 = r7.A01
            if (r0 != 0) goto L_0x0091
            java.nio.ByteBuffer r5 = r7.A02
            boolean r0 = r5.hasArray()
            if (r0 == 0) goto L_0x0075
            X.6Vo r0 = new X.6Vo
            r0.<init>(r5)
        L_0x0011:
            r7.A01 = r0
        L_0x0013:
            int r0 = r5.position()
            r7.A00 = r0
        L_0x0019:
            X.6Vs r6 = r7.A01
            X.C150347Qg.A05(r6, r9)
            int r0 = r8.BtV()
            r6.A03(r0)
            X.8v0 r1 = X.AnonymousClass6C8.A0Y(r8)
            X.8Ad r0 = r6.A00
            if (r0 != 0) goto L_0x0032
            X.8Ad r0 = new X.8Ad
            r0.<init>(r6)
        L_0x0032:
            r1.BtU(r0, r8)
            boolean r0 = r6 instanceof X.C128336Vr
            if (r0 == 0) goto L_0x004d
            X.6Vr r6 = (X.C128336Vr) r6
            java.nio.ByteBuffer r4 = r6.A04
            long r2 = r6.A00
            long r0 = r6.A01
            long r2 = r2 - r0
            int r0 = (int) r2
            r4.position(r0)
        L_0x0046:
            int r0 = r5.position()
            r7.A00 = r0
            return
        L_0x004d:
            boolean r0 = r6 instanceof X.C128316Vp
            if (r0 == 0) goto L_0x005f
            X.6Vp r6 = (X.C128316Vp) r6
            java.nio.ByteBuffer r1 = r6.A00
            java.nio.ByteBuffer r0 = r6.A01
            int r0 = r0.position()
            r1.position(r0)
            goto L_0x0046
        L_0x005f:
            X.6Vq r6 = (X.C128326Vq) r6
            boolean r0 = r6 instanceof X.C128306Vo
            if (r0 == 0) goto L_0x0046
            X.6Vo r6 = (X.C128306Vo) r6
            java.nio.ByteBuffer r3 = r6.A01
            int r2 = r6.A00
            int r1 = r6.A00
            int r0 = r6.A02
            int r1 = r1 - r0
            int r2 = r2 + r1
            r3.position(r2)
            goto L_0x0046
        L_0x0075:
            boolean r0 = r5.isDirect()
            if (r0 == 0) goto L_0x00af
            boolean r0 = r5.isReadOnly()
            if (r0 != 0) goto L_0x00af
            boolean r0 = X.C162337rj.A07
            if (r0 == 0) goto L_0x008b
            X.6Vr r0 = new X.6Vr
            r0.<init>(r5)
            goto L_0x0011
        L_0x008b:
            X.6Vp r0 = new X.6Vp
            r0.<init>(r5)
            goto L_0x0011
        L_0x0091:
            int r1 = r7.A00
            java.nio.ByteBuffer r5 = r7.A02
            int r0 = r5.position()
            if (r1 == r0) goto L_0x0019
            X.6Vs r4 = r7.A01
            byte[] r3 = r5.array()
            int r2 = r7.A00
            int r1 = r5.position()
            int r0 = r7.A00
            int r1 = r1 - r0
            r4.A0E(r3, r2, r1)
            goto L_0x0013
        L_0x00af:
            java.lang.String r0 = "ByteBuffer is read-only"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161777qQ.A08(X.8xr, int):void");
    }

    public final void A09(C160607nx r2, int i) {
        A04((i << 3) | 2);
        if (r2.A00 < 0) {
            r2.A00 = r2.A02();
        }
        A04(r2.A00);
        r2.A04(this);
    }

    public static int A01(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw AnonymousClass000.A0G("Unpaired surrogate at index ", AnonymousClass6CA.A0Y(39), i2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw AnonymousClass6C7.A0V("UTF-8 length does not fit in int: ", AnonymousClass6CA.A0Y(54), ((long) i3) + 4294967296L);
    }
}
