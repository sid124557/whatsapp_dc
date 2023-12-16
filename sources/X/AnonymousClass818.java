package X;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: X.818  reason: invalid class name */
public class AnonymousClass818 implements C185228tI {
    public long A00;
    public Uri A01;
    public C166637z1 A02;
    public C166637z1 A03;
    public AnonymousClass812 A04;
    public C149167Lh A05;
    public C149167Lh A06;
    public C149167Lh A07;
    public final int A08;
    public final AnonymousClass7XN A09 = new AnonymousClass7XN();
    public final C148567Iw A0A = new C148567Iw();
    public final AnonymousClass7ZV A0B;
    public final C161457ph A0C = new C161457ph(32);

    public void B3S(C166637z1 r5) {
        boolean z;
        C166637z1 r3 = r5;
        if (r5 == null) {
            r3 = null;
        }
        AnonymousClass7XN r2 = this.A09;
        synchronized (r2) {
            z = true;
            if (r3 == null) {
                r2.A08 = true;
            } else {
                r2.A08 = false;
                if (!r3.equals(r2.A07)) {
                    r2.A07 = r3;
                }
            }
            z = false;
        }
        this.A03 = r5;
        AnonymousClass812 r0 = this.A04;
        if (r0 != null && z) {
            r0.A0Q.post(r0.A0Y);
        }
    }

    public final int A00(int i) {
        AnonymousClass7A6 r5;
        C149167Lh r4 = this.A07;
        C149167Lh r6 = r4;
        if (r4.A03 == null) {
            AnonymousClass7ZV r3 = this.A0B;
            synchronized (r3) {
                int i2 = r3.A00 + 1;
                r3.A00 = i2;
                int i3 = r3.A01;
                if (i3 > 0) {
                    AnonymousClass7A6[] r1 = r3.A03;
                    int i4 = i3 - 1;
                    r3.A01 = i4;
                    r5 = r1[i4];
                    r5.getClass();
                    r3.A03[r3.A01] = null;
                } else {
                    r5 = new AnonymousClass7A6(new byte[r3.A04]);
                    AnonymousClass7A6[] r12 = r3.A03;
                    int length = r12.length;
                    if (i2 > length) {
                        r3.A03 = (AnonymousClass7A6[]) Arrays.copyOf(r12, length * 2);
                    }
                }
            }
            r6 = this.A07;
            C149167Lh r0 = new C149167Lh(r6.A00, this.A08);
            r4.A03 = r5;
            r4.A02 = r0;
        }
        return Math.min(i, (int) (r6.A00 - this.A00));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01(long r12, boolean r14) {
        /*
            r11 = this;
            X.7XN r4 = r11.A09
            monitor-enter(r4)
            int r0 = r4.A03     // Catch:{ all -> 0x0050 }
            int r5 = r4.A04     // Catch:{ all -> 0x0050 }
            int r5 = r5 + r0
            int r0 = r4.A01     // Catch:{ all -> 0x0050 }
            if (r5 < r0) goto L_0x000d
            int r5 = r5 - r0
        L_0x000d:
            boolean r0 = r4.A01()     // Catch:{ all -> 0x0050 }
            r3 = -1
            if (r0 == 0) goto L_0x0024
            long[] r2 = r4.A0E     // Catch:{ all -> 0x0050 }
            r6 = r2[r5]     // Catch:{ all -> 0x0050 }
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0024
            long r0 = r4.A06     // Catch:{ all -> 0x0050 }
            int r6 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x0027
            if (r14 != 0) goto L_0x0027
        L_0x0024:
            monitor-exit(r4)
            r8 = -1
            return r8
        L_0x0027:
            int r7 = r4.A02     // Catch:{ all -> 0x0050 }
            int r6 = r4.A03     // Catch:{ all -> 0x0050 }
            int r7 = r7 - r6
            r8 = -1
            r1 = 0
        L_0x002e:
            if (r1 >= r7) goto L_0x0049
            r9 = r2[r5]     // Catch:{ all -> 0x0050 }
            int r0 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x0049
            int[] r0 = r4.A0A     // Catch:{ all -> 0x0050 }
            r0 = r0[r5]     // Catch:{ all -> 0x0050 }
            r0 = r0 & 1
            if (r0 == 0) goto L_0x003f
            r8 = r1
        L_0x003f:
            int r5 = r5 + 1
            int r0 = r4.A01     // Catch:{ all -> 0x0050 }
            if (r5 != r0) goto L_0x0046
            r5 = 0
        L_0x0046:
            int r1 = r1 + 1
            goto L_0x002e
        L_0x0049:
            if (r8 == r3) goto L_0x0024
            int r6 = r6 + r8
            r4.A03 = r6     // Catch:{ all -> 0x0050 }
            monitor-exit(r4)
            return r8
        L_0x0050:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass818.A01(long, boolean):int");
    }

    public void A02() {
        long j;
        AnonymousClass7XN r2 = this.A09;
        synchronized (r2) {
            int i = r2.A02;
            if (i == 0) {
                j = -1;
            } else {
                j = r2.A00(i);
            }
        }
        A04(j);
    }

    public void A03() {
        AnonymousClass7XN r2 = this.A09;
        r2.A02 = 0;
        r2.A00 = 0;
        r2.A04 = 0;
        r2.A03 = 0;
        r2.A09 = true;
        r2.A05 = Long.MIN_VALUE;
        r2.A06 = Long.MIN_VALUE;
        C149167Lh r5 = this.A05;
        if (r5.A03 != null) {
            AnonymousClass7ZV r4 = this.A0B;
            C149167Lh r3 = r5;
            synchronized (r4) {
                do {
                    AnonymousClass7A6[] r22 = r4.A03;
                    int i = r4.A01;
                    r4.A01 = i + 1;
                    AnonymousClass7A6 r0 = r3.A03;
                    r0.getClass();
                    r22[i] = r0;
                    r4.A00--;
                    r3 = r3.A02;
                    if (r3 == null || r3.A03 == null) {
                        r4.notifyAll();
                    }
                    AnonymousClass7A6[] r222 = r4.A03;
                    int i2 = r4.A01;
                    r4.A01 = i2 + 1;
                    AnonymousClass7A6 r02 = r3.A03;
                    r02.getClass();
                    r222[i2] = r02;
                    r4.A00--;
                    r3 = r3.A02;
                    break;
                } while (r3.A03 == null);
                r4.notifyAll();
            }
            r5.A03 = null;
            r5.A02 = null;
        }
        C149167Lh r03 = new C149167Lh(0, this.A08);
        this.A05 = r03;
        this.A06 = r03;
        this.A07 = r03;
        this.A00 = 0;
        this.A0B.A01();
    }

    public final void A04(long j) {
        if (j != -1) {
            while (true) {
                C149167Lh r5 = this.A05;
                if (j >= r5.A00) {
                    AnonymousClass7ZV r4 = this.A0B;
                    AnonymousClass7A6 r3 = r5.A03;
                    synchronized (r4) {
                        AnonymousClass7A6[] r2 = r4.A03;
                        int i = r4.A01;
                        r4.A01 = i + 1;
                        r2[i] = r3;
                        r4.A00--;
                        r4.notifyAll();
                    }
                    C149167Lh r22 = this.A05;
                    r22.A03 = null;
                    C149167Lh r0 = r22.A02;
                    r22.A02 = null;
                    this.A05 = r0;
                } else if (this.A06.A01 < r5.A01) {
                    this.A06 = r5;
                    return;
                } else {
                    return;
                }
            }
        }
    }

    public final void A05(byte[] bArr, int i, long j) {
        C149167Lh r3;
        while (true) {
            r3 = this.A06;
            if (j < r3.A00) {
                break;
            }
            this.A06 = r3.A02;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (r3.A00 - j));
            System.arraycopy(r3.A03.A00, (int) (j - r3.A01), bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            r3 = this.A06;
            if (j == r3.A00) {
                r3 = r3.A02;
                this.A06 = r3;
            }
        }
    }

    public void Bkb(C161457ph r7, int i) {
        while (i > 0) {
            int A002 = A00(i);
            C149167Lh r1 = this.A07;
            r7.A0J(r1.A03.A00, (int) (this.A00 - r1.A01), A002);
            i -= A002;
            long j = this.A00 + ((long) A002);
            this.A00 = j;
            C149167Lh r5 = this.A07;
            if (j == r5.A00) {
                this.A07 = r5.A02;
            }
        }
    }

    public void Bkg(AnonymousClass7WT r14, int i, int i2, int i3, long j) {
        long j2 = j + 0;
        long j3 = (this.A00 - ((long) i2)) - ((long) i3);
        AnonymousClass7XN r7 = this.A09;
        synchronized (r7) {
            if (r7.A09) {
                if ((i & 1) != 0) {
                    r7.A09 = false;
                }
            }
            C159197lM.A02(AnonymousClass000.A1T(r7.A08 ? 1 : 0));
            r7.A06 = Math.max(r7.A06, j2);
            int i4 = r7.A02;
            int i5 = r7.A04;
            int i6 = i5 + i4;
            int i7 = r7.A01;
            if (i6 >= i7) {
                i6 -= i7;
            }
            r7.A0E[i6] = j2;
            long[] jArr = r7.A0D;
            jArr[i6] = j3;
            r7.A0B[i6] = i2;
            r7.A0A[i6] = i;
            r7.A0G[i6] = r14;
            r7.A0F[i6] = r7.A07;
            r7.A0C[i6] = 0;
            int i8 = i4 + 1;
            r7.A02 = i8;
            if (i8 == i7) {
                int i9 = i7 + 1000;
                int[] iArr = new int[i9];
                long[] jArr2 = new long[i9];
                long[] jArr3 = new long[i9];
                int[] iArr2 = new int[i9];
                int[] iArr3 = new int[i9];
                AnonymousClass7WT[] r2 = new AnonymousClass7WT[i9];
                C166637z1[] r1 = new C166637z1[i9];
                int i10 = i7 - i5;
                System.arraycopy(jArr, i5, jArr2, 0, i10);
                System.arraycopy(r7.A0E, r7.A04, jArr3, 0, i10);
                System.arraycopy(r7.A0A, r7.A04, iArr2, 0, i10);
                System.arraycopy(r7.A0B, r7.A04, iArr3, 0, i10);
                System.arraycopy(r7.A0G, r7.A04, r2, 0, i10);
                System.arraycopy(r7.A0F, r7.A04, r1, 0, i10);
                System.arraycopy(r7.A0C, r7.A04, iArr, 0, i10);
                int i11 = r7.A04;
                System.arraycopy(r7.A0D, 0, jArr2, i10, i11);
                System.arraycopy(r7.A0E, 0, jArr3, i10, i11);
                System.arraycopy(r7.A0A, 0, iArr2, i10, i11);
                System.arraycopy(r7.A0B, 0, iArr3, i10, i11);
                System.arraycopy(r7.A0G, 0, r2, i10, i11);
                System.arraycopy(r7.A0F, 0, r1, i10, i11);
                System.arraycopy(r7.A0C, 0, iArr, i10, i11);
                r7.A0D = jArr2;
                r7.A0E = jArr3;
                r7.A0A = iArr2;
                r7.A0B = iArr3;
                r7.A0G = r2;
                r7.A0F = r1;
                r7.A0C = iArr;
                r7.A04 = 0;
                r7.A02 = r7.A01;
                r7.A01 = i9;
            }
        }
    }

    public AnonymousClass818(AnonymousClass7ZV r5) {
        this.A0B = r5;
        int i = r5.A04;
        this.A08 = i;
        C149167Lh r0 = new C149167Lh(0, i);
        this.A05 = r0;
        this.A06 = r0;
        this.A07 = r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        if (r6 == 0) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int Bka(X.C153437bJ r14, int r15, boolean r16) {
        /*
            r13 = this;
            int r10 = r13.A00(r15)
            X.7Lh r1 = r13.A07
            X.7A6 r0 = r1.A03
            byte[] r8 = r0.A00
            long r2 = r13.A00
            long r0 = r1.A01
            long r2 = r2 - r0
            int r9 = (int) r2
            r7 = r14
            int r0 = r14.A00
            r11 = 0
            if (r0 == 0) goto L_0x0024
            int r6 = java.lang.Math.min(r0, r10)
            byte[] r0 = r14.A03
            java.lang.System.arraycopy(r0, r11, r8, r9, r6)
            r14.A02(r6)
            if (r6 != 0) goto L_0x0029
        L_0x0024:
            r12 = 1
            int r6 = r7.A00(r8, r9, r10, r11, r12)
        L_0x0029:
            r4 = -1
            if (r6 == r4) goto L_0x0046
            long r2 = r14.A02
            long r0 = (long) r6
            long r2 = r2 + r0
            r14.A02 = r2
            if (r6 == r4) goto L_0x0046
            long r4 = r13.A00
            long r4 = r4 + r0
            r13.A00 = r4
            X.7Lh r3 = r13.A07
            long r1 = r3.A00
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0045
            X.7Lh r0 = r3.A02
            r13.A07 = r0
        L_0x0045:
            return r6
        L_0x0046:
            java.io.EOFException r0 = X.AnonymousClass6CA.A0M()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass818.Bka(X.7bJ, int, boolean):int");
    }
}
