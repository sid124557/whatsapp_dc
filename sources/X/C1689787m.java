package X;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.87m  reason: invalid class name and case insensitive filesystem */
public final class C1689787m implements C187628xY, C187028wK, C184918sl, C178158h4, C178278hH {
    public static final C166527yp A0b;
    public static final Map A0c;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public C184868sg A07;
    public C1688987e A08;
    public C187618xX A09;
    public AnonymousClass7M7 A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public C151517Vc[] A0K;
    public C1687886t[] A0L;
    public final long A0M = ((long) 1048576);
    public final Uri A0N;
    public final Handler A0O;
    public final C156317gQ A0P;
    public final C186718vp A0Q;
    public final C159017kx A0R;
    public final C178148h3 A0S;
    public final C180728lX A0T;
    public final C183888qp A0U;
    public final C187668xc A0V;
    public final C180788ld A0W;
    public final C157447iJ A0X = new C157447iJ("Loader:ProgressiveMediaPeriod");
    public final AnonymousClass7GF A0Y;
    public final Runnable A0Z;
    public final Runnable A0a;

    public void B2W() {
        this.A0I = true;
        this.A0O.post(this.A0Z);
    }

    public C185598tw Br0(int i, int i2) {
        return A01(new C151517Vc(i, false));
    }

    public C1689787m(Uri uri, C156317gQ r6, C186718vp r7, C180658lQ r8, C159017kx r9, C180728lX r10, C183888qp r11, C187668xc r12, C180788ld r13) {
        this.A0N = uri;
        this.A0V = r12;
        this.A0Q = r7;
        this.A0P = r6;
        this.A0W = r13;
        this.A0R = r9;
        this.A0T = r10;
        this.A0U = r11;
        this.A0S = new AnonymousClass882(r8);
        this.A0Y = new AnonymousClass7GF();
        this.A0Z = new C172668Mf(this, 22);
        this.A0a = new C172668Mf(this, 23);
        Looper myLooper = Looper.myLooper();
        C161487pm.A01(myLooper);
        this.A0O = new Handler(myLooper, (Handler.Callback) null);
        this.A0K = new C151517Vc[0];
        this.A0L = new C1687886t[0];
        this.A06 = -9223372036854775807L;
        this.A05 = -1;
        this.A03 = -9223372036854775807L;
        this.A00 = 1;
    }

    public final long A00() {
        long j;
        long j2 = Long.MIN_VALUE;
        for (C1687886t r2 : this.A0L) {
            synchronized (r2) {
                j = r2.A06;
            }
            j2 = Math.max(j2, j);
        }
        return j2;
    }

    public final C185598tw A01(C151517Vc r7) {
        C1687886t[] r2 = this.A0L;
        int length = r2.length;
        for (int i = 0; i < length; i++) {
            if (r7.equals(this.A0K[i])) {
                return r2[i];
            }
        }
        C183888qp r4 = this.A0U;
        Looper looper = this.A0O.getLooper();
        C186718vp r1 = this.A0Q;
        C156317gQ r0 = this.A0P;
        looper.getClass();
        C1687886t r22 = new C1687886t(looper, r0, r1, r4);
        r22.A0D = this;
        int i2 = length + 1;
        Object[] copyOf = Arrays.copyOf(this.A0K, i2);
        copyOf[length] = r7;
        this.A0K = (C151517Vc[]) copyOf;
        Object[] copyOf2 = Arrays.copyOf(this.A0L, i2);
        copyOf2[length] = r22;
        this.A0L = (C1687886t[]) copyOf2;
        return r22;
    }

    public void A02() {
        IOException iOException;
        C157447iJ r3 = this.A0X;
        int i = 3;
        if (this.A00 == 7) {
            i = 6;
        }
        IOException iOException2 = r3.A01;
        if (iOException2 == null) {
            AnonymousClass6E1 r0 = r3.A00;
            if (r0 != null && (iOException = r0.A02) != null && r0.A00 > i) {
                throw iOException;
            }
            return;
        }
        throw iOException2;
    }

    public final void A03() {
        C161487pm.A04(this.A0G);
        this.A0A.getClass();
        this.A07.getClass();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0059, code lost:
        if (X.C162107rG.A05(r0) != false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r13 = this;
            boolean r0 = r13.A0H
            if (r0 != 0) goto L_0x00f3
            boolean r0 = r13.A0G
            if (r0 != 0) goto L_0x00f3
            boolean r0 = r13.A0I
            if (r0 == 0) goto L_0x00f3
            X.8sg r0 = r13.A07
            if (r0 == 0) goto L_0x00f3
            X.86t[] r4 = r13.A0L
            int r3 = r4.length
            r8 = 0
            r2 = 0
        L_0x0015:
            if (r2 >= r3) goto L_0x0029
            r1 = r4[r2]
            monitor-enter(r1)
            boolean r0 = r1.A0H     // Catch:{ all -> 0x00f0 }
            if (r0 == 0) goto L_0x001f
            goto L_0x0022
        L_0x001f:
            X.7yp r0 = r1.A0B     // Catch:{ all -> 0x00f0 }
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            monitor-exit(r1)
            if (r0 == 0) goto L_0x00f3
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0029:
            X.7GF r1 = r13.A0Y
            monitor-enter(r1)
            r1.A00 = r8     // Catch:{ all -> 0x00f0 }
            monitor-exit(r1)
            X.86t[] r0 = r13.A0L
            int r7 = r0.length
            X.7ya[] r6 = new X.C166377ya[r7]
            boolean[] r5 = new boolean[r7]
            r4 = 0
        L_0x0037:
            r3 = 1
            if (r4 >= r7) goto L_0x00d9
            X.86t[] r0 = r13.A0L
            r1 = r0[r4]
            monitor-enter(r1)
            boolean r0 = r1.A0H     // Catch:{ all -> 0x00f0 }
            if (r0 == 0) goto L_0x0044
            goto L_0x0047
        L_0x0044:
            X.7yp r9 = r1.A0B     // Catch:{ all -> 0x00f0 }
            goto L_0x0048
        L_0x0047:
            r9 = 0
        L_0x0048:
            monitor-exit(r1)
            r9.getClass()
            java.lang.String r0 = r9.A0T
            boolean r12 = X.C162107rG.A03(r0)
            if (r12 != 0) goto L_0x005b
            boolean r0 = X.C162107rG.A05(r0)
            r1 = 0
            if (r0 == 0) goto L_0x005c
        L_0x005b:
            r1 = 1
        L_0x005c:
            r5[r4] = r1
            boolean r0 = r13.A0B
            r1 = r1 | r0
            r13.A0B = r1
            X.87e r10 = r13.A08
            if (r10 == 0) goto L_0x00a3
            if (r12 != 0) goto L_0x0071
            X.7Vc[] r0 = r13.A0K
            r0 = r0[r4]
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x00a3
        L_0x0071:
            X.7ys r0 = r9.A0L
            X.8x6[] r11 = new X.C187368x6[r3]
            r11[r8] = r10
            if (r0 != 0) goto L_0x00c5
            X.7ys r1 = new X.7ys
            r1.<init>((X.C187368x6[]) r11)
        L_0x007e:
            X.7he r0 = new X.7he
            r0.<init>(r9)
            r0.A0J = r1
            X.7yp r9 = X.C166527yp.A00(r0)
            if (r12 == 0) goto L_0x00a3
            int r0 = r9.A04
            r2 = -1
            if (r0 != r2) goto L_0x00a3
            int r0 = r9.A0C
            if (r0 != r2) goto L_0x00a3
            int r1 = r10.A00
            if (r1 == r2) goto L_0x00a3
            X.7he r0 = new X.7he
            r0.<init>(r9)
            r0.A03 = r1
            X.7yp r9 = X.C166527yp.A00(r0)
        L_0x00a3:
            X.7z2 r0 = r9.A0K
            if (r0 == 0) goto L_0x00c3
            java.lang.Class<X.86H> r1 = X.AnonymousClass86H.class
        L_0x00a9:
            X.7he r0 = new X.7he
            r0.<init>(r9)
            r0.A0L = r1
            X.7yp r0 = X.C166527yp.A00(r0)
            X.7yp[] r1 = new X.C166527yp[r3]
            r1[r8] = r0
            X.7ya r0 = new X.7ya
            r0.<init>((X.C166527yp[]) r1)
            r6[r4] = r0
            int r4 = r4 + 1
            goto L_0x0037
        L_0x00c3:
            r1 = 0
            goto L_0x00a9
        L_0x00c5:
            X.8x6[] r2 = r0.A00
            int r1 = r2.length
            int r0 = r1 + 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            java.lang.System.arraycopy(r11, r8, r0, r1, r3)
            X.8x6[] r0 = (X.C187368x6[]) r0
            X.7ys r1 = new X.7ys
            r1.<init>((X.C187368x6[]) r0)
            goto L_0x007e
        L_0x00d9:
            X.7yb r1 = new X.7yb
            r1.<init>((X.C166377ya[]) r6)
            X.7M7 r0 = new X.7M7
            r0.<init>(r1, r5)
            r13.A0A = r0
            r13.A0G = r3
            X.8xX r0 = r13.A09
            r0.getClass()
            r0.BYn(r13)
            return
        L_0x00f0:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1689787m.A04():void");
    }

    public final void A05() {
        C1691988j r8 = new C1691988j(this.A0N, this, this.A0S, this, this.A0V, this.A0Y);
        if (this.A0G) {
            C161487pm.A04(A08());
            long j = this.A03;
            if (j == -9223372036854775807L || this.A06 <= j) {
                C184868sg r2 = this.A07;
                r2.getClass();
                long j2 = r2.BCb(this.A06).A00.A00;
                long j3 = this.A06;
                r8.A09.A00 = j2;
                r8.A01 = j3;
                r8.A04 = true;
                r8.A05 = false;
                for (C1687886t r0 : this.A0L) {
                    r0.A07 = j3;
                }
                this.A06 = -9223372036854775807L;
            } else {
                this.A0D = true;
                this.A06 = -9223372036854775807L;
                return;
            }
        }
        int i = 0;
        for (C1687886t r02 : this.A0L) {
            i += r02.A00 + r02.A02;
        }
        this.A02 = i;
        this.A0X.A00(this, r8);
        C157677ih r22 = r8.A03;
        C159017kx r4 = this.A0R;
        r4.A04(new C156527gm(r22.A04, r22, Collections.emptyMap()), new AnonymousClass7P1((C166527yp) null, (Object) null, 1, -1, 0, r4.A00(r8.A01), r4.A00(this.A03)));
    }

    public final boolean A08() {
        return AnonymousClass000.A1S((this.A06 > -9223372036854775807L ? 1 : (this.A06 == -9223372036854775807L ? 0 : -1)));
    }

    public boolean Azd(long j) {
        boolean z;
        if (!this.A0D) {
            C157447iJ r3 = this.A0X;
            if (r3.A01 == null && !this.A0F && (!this.A0G || this.A01 != 0)) {
                AnonymousClass7GF r1 = this.A0Y;
                synchronized (r1) {
                    if (r1.A00) {
                        z = false;
                    } else {
                        z = true;
                        r1.A00 = true;
                        r1.notifyAll();
                    }
                }
                if (r3.A00 != null) {
                    return z;
                }
                A05();
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (r7 > r9) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long B4G(X.C158027jJ r18, long r19) {
        /*
            r17 = this;
            r1 = r19
            r0 = r17
            r0.A03()
            X.8sg r3 = r0.A07
            boolean r0 = r3.BIq()
            if (r0 != 0) goto L_0x0012
            r1 = 0
            return r1
        L_0x0012:
            X.7Xv r3 = r3.BCb(r1)
            X.7jy r0 = r3.A00
            long r7 = r0.A01
            X.7jy r0 = r3.A01
            long r5 = r0.A01
            r11 = r18
            long r9 = r11.A01
            r15 = 0
            int r0 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x002f
            long r3 = r11.A00
            int r0 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x002f
            return r1
        L_0x002f:
            long r13 = r19 - r9
            long r9 = r9 ^ r19
            long r3 = r19 ^ r13
            long r3 = r3 & r9
            int r0 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x003c
            r13 = -9223372036854775808
        L_0x003c:
            long r11 = r11.A00
            long r9 = r19 + r11
            long r3 = r19 ^ r9
            long r11 = r11 ^ r9
            long r3 = r3 & r11
            int r0 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x004d
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x004d:
            r4 = 1
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0057
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r3 = 1
            if (r0 <= 0) goto L_0x0058
        L_0x0057:
            r3 = 0
        L_0x0058:
            int r0 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0071
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x0071
        L_0x0060:
            if (r3 == 0) goto L_0x0073
            if (r4 == 0) goto L_0x0070
            long r3 = X.AnonymousClass6C9.A0N(r7, r1)
            long r1 = X.AnonymousClass6C9.A0N(r5, r1)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0076
        L_0x0070:
            return r7
        L_0x0071:
            r4 = 0
            goto L_0x0060
        L_0x0073:
            if (r4 != 0) goto L_0x0076
            return r13
        L_0x0076:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1689787m.B4G(X.7jJ, long):long");
    }

    public long BA0() {
        if (this.A01 == 0) {
            return Long.MIN_VALUE;
        }
        return B4y();
    }

    public boolean BHy() {
        boolean z;
        if (this.A0X.A00 != null) {
            AnonymousClass7GF r2 = this.A0Y;
            synchronized (r2) {
                z = r2.A00;
            }
            if (!z) {
                return false;
            }
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void BVH(C183898qq r19, long j, long j2, boolean z) {
        C1691988j r4 = (C1691988j) r19;
        C1691188b r0 = r4.A0B;
        C156527gm r7 = new C156527gm(r0.A01, r4.A03, r0.A02);
        C159017kx r2 = this.A0R;
        r2.A02(r7, new AnonymousClass7P1((C166527yp) null, (Object) null, 1, -1, 0, r2.A00(r4.A01), r2.A00(this.A03)));
        if (!z) {
            if (this.A05 == -1) {
                this.A05 = r4.A00;
            }
            for (C1687886t A042 : this.A0L) {
                A042.A04(false);
            }
            if (this.A01 > 0) {
                C187618xX r02 = this.A09;
                r02.getClass();
                r02.BQ8(this);
            }
        }
    }

    public /* bridge */ /* synthetic */ void BVL(C183898qq r19, long j, long j2) {
        C184868sg r0;
        long j3;
        C1691988j r6 = (C1691988j) r19;
        if (this.A03 == -9223372036854775807L && (r0 = this.A07) != null) {
            boolean BIq = r0.BIq();
            long A002 = A00();
            if (A002 == Long.MIN_VALUE) {
                j3 = 0;
            } else {
                j3 = A002 + 10000;
            }
            this.A03 = j3;
            this.A0T.Bbo(j3, BIq, this.A0C);
        }
        C1691188b r02 = r6.A0B;
        C156527gm r7 = new C156527gm(r02.A01, r6.A03, r02.A02);
        C159017kx r4 = this.A0R;
        r4.A03(r7, new AnonymousClass7P1((C166527yp) null, (Object) null, 1, -1, 0, r4.A00(r6.A01), r4.A00(this.A03)));
        if (this.A05 == -1) {
            this.A05 = r6.A00;
        }
        this.A0D = true;
        C187618xX r03 = this.A09;
        r03.getClass();
        r03.BQ8(this);
    }

    public /* bridge */ /* synthetic */ AnonymousClass7GE BVT(C183898qq r33, IOException iOException, int i, long j, long j2) {
        AnonymousClass7GE r7;
        C184868sg r2;
        C1691988j r72 = (C1691988j) r33;
        long j3 = this.A05;
        if (j3 == -1) {
            j3 = r72.A00;
            this.A05 = j3;
        }
        C1691188b r0 = r72.A0B;
        C156527gm r02 = new C156527gm(r0.A01, r72.A03, r0.A02);
        long j4 = r72.A01;
        IOException iOException2 = iOException;
        long BCJ = this.A0W.BCJ(new AnonymousClass7MF(r02, new AnonymousClass7P1((C166527yp) null, (Object) null, 1, -1, 0, C161207pD.A01(j4), C161207pD.A01(this.A03)), iOException2, i));
        if (BCJ == -9223372036854775807L) {
            r7 = C157447iJ.A04;
        } else {
            C1687886t[] r11 = this.A0L;
            int i2 = 0;
            for (C1687886t r9 : r11) {
                i2 += r9.A00 + r9.A02;
            }
            boolean A1W = C86624Kv.A1W(i2, this.A02);
            if (j3 == -1 && ((r2 = this.A07) == null || r2.B7B() == -9223372036854775807L)) {
                boolean z = this.A0G;
                if (!z || this.A0E || A08()) {
                    this.A0E = z;
                    j4 = 0;
                    this.A04 = 0;
                    this.A02 = 0;
                    for (C1687886t A042 : r11) {
                        A042.A04(false);
                    }
                    r72.A09.A00 = 0;
                    r72.A01 = 0;
                    r72.A04 = true;
                    r72.A05 = false;
                } else {
                    this.A0F = true;
                    r7 = C157447iJ.A03;
                }
            } else {
                this.A02 = i2;
            }
            r7 = new AnonymousClass7GE(A1W ? 1 : 0, BCJ);
        }
        int i3 = r7.A00;
        boolean z2 = true;
        if (!(i3 == 0 || i3 == 1)) {
            z2 = false;
        }
        C159017kx r4 = this.A0R;
        r4.A05(r02, new AnonymousClass7P1((C166527yp) null, (Object) null, 1, -1, 0, r4.A00(j4), r4.A00(this.A03)), iOException2, !z2);
        return r7;
    }

    public void BhI(C187618xX r3, long j) {
        this.A09 = r3;
        AnonymousClass7GF r1 = this.A0Y;
        synchronized (r1) {
            if (!r1.A00) {
                r1.A00 = true;
                r1.notifyAll();
            }
        }
        A05();
    }

    public long BiL() {
        if (!this.A0E) {
            return -9223372036854775807L;
        }
        if (!this.A0D) {
            int i = 0;
            for (C1687886t r0 : this.A0L) {
                i += r0.A00 + r0.A02;
            }
            if (i <= this.A02) {
                return -9223372036854775807L;
            }
        }
        this.A0E = false;
        return this.A04;
    }

    public void Bl0(C184868sg r3) {
        AnonymousClass8MF.A00(this.A0O, this, r3, 29);
    }

    public long BlC(C185338tU[] r13, C187638xZ[] r14, boolean[] zArr, boolean[] zArr2, long j) {
        int length;
        boolean z;
        AnonymousClass88R r3;
        long j2 = j;
        A03();
        AnonymousClass7M7 r2 = this.A0A;
        C166387yb r9 = r2.A00;
        boolean[] zArr3 = r2.A01;
        int i = this.A01;
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            length = r14.length;
            if (i4 >= length) {
                break;
            }
            AnonymousClass884 r6 = r13[i4];
            if (r6 != null && (r14[i4] == null || !zArr[i4])) {
                int i5 = r6.A00;
                C161487pm.A04(zArr3[i5]);
                i2--;
                this.A01 = i2;
                zArr3[i5] = false;
                r13[i4] = null;
            }
            i4++;
        }
        if (!this.A0J ? j == 0 : i != 0) {
            z = false;
        } else {
            z = true;
        }
        for (int i6 = 0; i6 < length; i6++) {
            if (r13[i6] == null && (r3 = r14[i6]) != null) {
                AnonymousClass88R r32 = r3;
                int[] iArr = r32.A03;
                C161487pm.A04(AnonymousClass000.A1U(iArr.length, 1));
                C161487pm.A04(AnonymousClass000.A1T(iArr[0]));
                C166377ya r4 = r32.A02;
                int i7 = 0;
                while (true) {
                    if (i7 < r9.A01) {
                        if (r9.A02[i7] == r4) {
                            break;
                        }
                        i7++;
                    } else {
                        i7 = -1;
                        break;
                    }
                }
                C161487pm.A04(!zArr3[i7]);
                this.A01++;
                zArr3[i7] = true;
                r13[i6] = new AnonymousClass884(this, i7);
                zArr2[i6] = true;
                if (!z) {
                    C1687886t r42 = this.A0L[i7];
                    if (!r42.A05(j2, true)) {
                        z = true;
                        if (r42.A00 + r42.A03 != 0) {
                        }
                    }
                    z = false;
                }
            }
        }
        if (this.A01 == 0) {
            this.A0F = false;
            this.A0E = false;
            C157447iJ r33 = this.A0X;
            boolean A1W = AnonymousClass000.A1W(r33.A00);
            C1687886t[] r62 = this.A0L;
            int length2 = r62.length;
            if (A1W) {
                while (i3 < length2) {
                    r62[i3].A02();
                    i3++;
                }
                AnonymousClass6E1 r34 = r33.A00;
                C161487pm.A01(r34);
                r34.A00(false);
            } else {
                while (i3 < length2) {
                    r62[i3].A04(false);
                    i3++;
                }
            }
        } else if (z) {
            j2 = Bl5(j2);
            while (i3 < r13.length) {
                if (r13[i3] != null) {
                    zArr2[i3] = true;
                }
                i3++;
            }
        }
        this.A0J = true;
        return j2;
    }

    static {
        HashMap A0t = AnonymousClass001.A0t();
        A0t.put("Icy-MetaData", "1");
        A0c = Collections.unmodifiableMap(A0t);
        C157057he A002 = C157057he.A00();
        A002.A0O = "icy";
        A002.A0R = "application/x-icy";
        A0b = C166527yp.A00(A002);
    }

    public final void A06(int i) {
        A03();
        AnonymousClass7M7 r1 = this.A0A;
        boolean[] zArr = r1.A03;
        if (!zArr[i]) {
            C166527yp r4 = r1.A00.A02[i].A02[0];
            this.A0R.A01(r4, C162107rG.A00(r4.A0T), this.A04);
            zArr[i] = true;
        }
    }

    public final void A07(int i) {
        A03();
        boolean[] zArr = this.A0A.A02;
        if (this.A0F && zArr[i]) {
            if (!this.A0L[i].A06(false)) {
                this.A06 = 0;
                this.A0F = false;
                this.A0E = true;
                this.A04 = 0;
                this.A02 = 0;
                for (C1687886t A042 : this.A0L) {
                    A042.A04(false);
                }
                C187618xX r0 = this.A09;
                r0.getClass();
                r0.BQ8(this);
            }
        }
    }

    public void B1k(long j, boolean z) {
        long j2;
        int i;
        A03();
        if (!A08()) {
            boolean[] zArr = this.A0A.A01;
            int length = this.A0L.length;
            for (int i2 = 0; i2 < length; i2++) {
                C1687886t r8 = this.A0L[i2];
                boolean z2 = zArr[i2];
                C160467ng r2 = r8.A0T;
                synchronized (r8) {
                    int i3 = r8.A02;
                    if (i3 != 0) {
                        long[] jArr = r8.A0N;
                        int i4 = r8.A04;
                        long j3 = j;
                        if (j >= jArr[i4]) {
                            if (z2 && (i = r8.A03) != i3) {
                                i3 = i + 1;
                            }
                            int A002 = r8.A00(i4, i3, j3, z);
                            if (A002 != -1) {
                                j2 = r8.A01(A002);
                            }
                        }
                    }
                    j2 = -1;
                }
                r2.A03(j2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0050, code lost:
        if (r2 == Long.MAX_VALUE) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long B4y() {
        /*
            r12 = this;
            r12.A03()
            X.7M7 r0 = r12.A0A
            boolean[] r7 = r0.A02
            boolean r0 = r12.A0D
            r10 = -9223372036854775808
            if (r0 == 0) goto L_0x000e
            return r10
        L_0x000e:
            boolean r0 = r12.A08()
            if (r0 == 0) goto L_0x0017
            long r0 = r12.A06
            return r0
        L_0x0017:
            boolean r0 = r12.A0B
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 == 0) goto L_0x0052
            X.86t[] r0 = r12.A0L
            int r6 = r0.length
            r5 = 0
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0029:
            if (r5 >= r6) goto L_0x004e
            boolean r0 = r7[r5]
            if (r0 == 0) goto L_0x0045
            X.86t[] r0 = r12.A0L
            r1 = r0[r5]
            monitor-enter(r1)
            boolean r0 = r1.A0E     // Catch:{ all -> 0x004b }
            monitor-exit(r1)
            if (r0 != 0) goto L_0x0045
            X.86t[] r0 = r12.A0L
            r4 = r0[r5]
            monitor-enter(r4)
            long r0 = r4.A06     // Catch:{ all -> 0x0048 }
            monitor-exit(r4)
            long r2 = java.lang.Math.min(r2, r0)
        L_0x0045:
            int r5 = r5 + 1
            goto L_0x0029
        L_0x0048:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x004b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x004e:
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0056
        L_0x0052:
            long r2 = r12.A00()
        L_0x0056:
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x005c
            long r2 = r12.A04
        L_0x005c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1689787m.B4y():long");
    }

    public C166387yb BDt() {
        A03();
        return this.A0A.A00;
    }

    public void BL2() {
        A02();
        if (this.A0D && !this.A0G) {
            throw AnonymousClass6u7.A01("Loading finished before preparation is complete.");
        }
    }

    public long Bl5(long j) {
        A03();
        boolean[] zArr = this.A0A.A02;
        if (!this.A07.BIq()) {
            j = 0;
        }
        int i = 0;
        this.A0E = false;
        this.A04 = j;
        if (A08()) {
            this.A06 = j;
        } else {
            if (this.A00 != 7) {
                int length = this.A0L.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        if (!this.A0L[i2].A05(j, false) && (zArr[i2] || !this.A0B)) {
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
            }
            this.A0F = false;
            this.A06 = j;
            this.A0D = false;
            C157447iJ r3 = this.A0X;
            if (r3.A00 != null) {
                C1687886t[] r2 = this.A0L;
                int length2 = r2.length;
                while (i < length2) {
                    r2[i].A02();
                    i++;
                }
                AnonymousClass6E1 r1 = r3.A00;
                C161487pm.A01(r1);
                r1.A00(false);
                return j;
            }
            r3.A01 = null;
            C1687886t[] r32 = this.A0L;
            int length3 = r32.length;
            while (i < length3) {
                r32[i].A04(false);
                i++;
            }
        }
        return j;
    }
}
