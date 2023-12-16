package X;

import java.util.Random;

/* renamed from: X.7kc  reason: invalid class name and case insensitive filesystem */
public class C158827kc {
    public static final C158827kc A06 = new C158827kc(true);
    public static final C158827kc A07 = new C158827kc(true);
    public static final C158827kc A08 = new C158827kc(true);
    public static final C158827kc A09 = new C158827kc(true);
    public static final C158827kc A0A = new C158827kc(true);
    public static final C158827kc A0B = new C158827kc(true);
    public static final C158827kc A0C;
    public static final C158827kc A0D;
    public static final C158827kc A0E;
    public static final C158827kc A0F = new C158827kc(false);
    public static final C158827kc A0G;
    public static final C158827kc A0H;
    public static final C158827kc A0I = new C158827kc(true);
    public static final C158827kc A0J = new C158827kc(true);
    public static final C158827kc A0K = new C158827kc(true);
    public static final C158827kc A0L;
    public static final C158827kc A0M;
    public static final C158827kc A0N = new C158827kc(false);
    public static final C158827kc A0O;
    public static final Random A0P = new Random();
    public static final C158827kc[] A0Q;
    public int A00 = 0;
    public long A01;
    public long A02;
    public long A03;
    public long[] A04;
    public final boolean A05;

    static {
        C158827kc r9 = new C158827kc(false);
        A0C = r9;
        C158827kc r8 = new C158827kc(false);
        A0E = r8;
        C158827kc r7 = new C158827kc(true);
        A0M = r7;
        C158827kc r6 = new C158827kc(true);
        A0L = r6;
        C158827kc r5 = new C158827kc(true);
        A0O = r5;
        C158827kc r3 = new C158827kc(false);
        A0G = r3;
        C158827kc r2 = new C158827kc(false);
        A0H = r2;
        C158827kc r1 = new C158827kc(false);
        A0D = r1;
        C158827kc[] r0 = new C158827kc[8];
        r0[0] = r9;
        r0[1] = r8;
        AnonymousClass6C7.A19(r7, r6, r5, r0);
        AnonymousClass0x2.A1D(r3, r2, r1, r0);
        A0Q = r0;
    }

    public void A01() {
        synchronized (this) {
        }
    }

    public static void A00(C158827kc r2) {
        r2.A01 = Long.MIN_VALUE;
        r2.A02 = Long.MAX_VALUE;
        r2.A03 = 0;
    }

    public void A02() {
        if (this.A05) {
            synchronized (this) {
                A00(this);
                this.A00 = 0;
            }
            return;
        }
        A00(this);
        this.A00 = 0;
    }

    public void A03(long j) {
        if (this.A05) {
            synchronized (this) {
                A04(j);
            }
            return;
        }
        A04(j);
    }

    public final void A04(long j) {
        long[] jArr = this.A04;
        if (jArr == null) {
            jArr = new long[256];
            this.A04 = jArr;
        }
        long j2 = this.A01;
        if (j2 <= j) {
            j2 = j;
        }
        this.A01 = j2;
        long j3 = this.A02;
        if (j3 >= j) {
            j3 = j;
        }
        this.A02 = j3;
        this.A03 += j;
        int i = this.A00;
        if (i < 256) {
            jArr[i] = j;
        } else {
            int nextInt = A0P.nextInt(i + 1);
            if (nextInt < 256) {
                jArr[nextInt] = j;
            }
        }
        int i2 = i + 1;
        this.A00 = i2;
        if (i2 == 256) {
            A02();
        }
    }

    public C158827kc(boolean z) {
        A00(this);
        this.A05 = z;
    }
}
