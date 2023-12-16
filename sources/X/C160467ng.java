package X;

import java.nio.ByteBuffer;

/* renamed from: X.7ng  reason: invalid class name and case insensitive filesystem */
public class C160467ng {
    public long A00;
    public C149627Ne A01;
    public C149627Ne A02;
    public C149627Ne A03;
    public final int A04;
    public final C183888qp A05;
    public final C161467pi A06 = C161467pi.A05(32);

    public static C149627Ne A00(C149627Ne r8, ByteBuffer byteBuffer, int i, long j) {
        while (j >= r8.A03) {
            r8 = r8.A00;
        }
        while (i > 0) {
            long j2 = r8.A03;
            int min = Math.min(i, (int) (j2 - j));
            byteBuffer.put(r8.A01.A00, (int) (j - r8.A04), min);
            i -= min;
            j += (long) min;
            if (j == j2) {
                r8 = r8.A00;
            }
        }
        return r8;
    }

    public static C149627Ne A01(C149627Ne r9, byte[] bArr, int i, long j) {
        while (j >= r9.A03) {
            r9 = r9.A00;
        }
        int i2 = i;
        while (i2 > 0) {
            long j2 = r9.A03;
            int min = Math.min(i2, (int) (j2 - j));
            System.arraycopy(r9.A01.A00, (int) (j - r9.A04), bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            if (j == j2) {
                r9 = r9.A00;
            }
        }
        return r9;
    }

    public final int A02(int i) {
        AnonymousClass7BK r4;
        C149627Ne r5 = this.A03;
        C149627Ne r6 = r5;
        if (!r5.A02) {
            AnonymousClass88T r3 = (AnonymousClass88T) this.A05;
            synchronized (r3) {
                r3.A00++;
                int i2 = r3.A01;
                if (i2 > 0) {
                    AnonymousClass7BK[] r1 = r3.A03;
                    int i3 = i2 - 1;
                    r3.A01 = i3;
                    r4 = r1[i3];
                    r4.getClass();
                    r3.A03[r3.A01] = null;
                } else {
                    r4 = new AnonymousClass7BK(new byte[r3.A04]);
                }
            }
            r6 = this.A03;
            C149627Ne r0 = new C149627Ne(r6.A03, this.A04);
            r5.A01 = r4;
            r5.A00 = r0;
            r5.A02 = true;
        }
        return Math.min(i, (int) (r6.A03 - this.A00));
    }

    public void A03(long j) {
        if (j != -1) {
            while (true) {
                C149627Ne r5 = this.A01;
                if (j >= r5.A03) {
                    C183888qp r3 = this.A05;
                    AnonymousClass7BK r2 = r5.A01;
                    AnonymousClass88T r32 = (AnonymousClass88T) r3;
                    synchronized (r32) {
                        AnonymousClass7BK[] r1 = r32.A05;
                        r1[0] = r2;
                        r32.Bin(r1);
                    }
                    C149627Ne r22 = this.A01;
                    r22.A01 = null;
                    C149627Ne r0 = r22.A00;
                    r22.A00 = null;
                    this.A01 = r0;
                } else if (this.A02.A04 < r5.A04) {
                    this.A02 = r5;
                    return;
                } else {
                    return;
                }
            }
        }
    }

    public C160467ng(C183888qp r5) {
        this.A05 = r5;
        int i = ((AnonymousClass88T) r5).A04;
        this.A04 = i;
        C149627Ne r0 = new C149627Ne(0, i);
        this.A01 = r0;
        this.A02 = r0;
        this.A03 = r0;
    }
}
