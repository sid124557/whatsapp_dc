package X;

import android.os.Looper;
import android.util.Log;

/* renamed from: X.86t  reason: invalid class name and case insensitive filesystem */
public class C1687886t implements C185598tw {
    public int A00;
    public int A01 = 1000;
    public int A02;
    public int A03;
    public int A04;
    public long A05 = Long.MIN_VALUE;
    public long A06 = Long.MIN_VALUE;
    public long A07 = Long.MIN_VALUE;
    public C166527yp A08;
    public C166527yp A09;
    public C166527yp A0A;
    public C166527yp A0B;
    public C178058gt A0C;
    public C178158h4 A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H = true;
    public boolean A0I = true;
    public int[] A0J = new int[1000];
    public int[] A0K = new int[1000];
    public int[] A0L = new int[1000];
    public long[] A0M = new long[1000];
    public long[] A0N = new long[1000];
    public C166527yp[] A0O = new C166527yp[1000];
    public AnonymousClass7WZ[] A0P = new AnonymousClass7WZ[1000];
    public final Looper A0Q;
    public final C156317gQ A0R;
    public final C186718vp A0S;
    public final C160467ng A0T;
    public final C148637Jd A0U = new C148637Jd();

    public final int A00(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.A0N[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.A0J[i] & 1) != 0) {
                i3 = i4;
                if (j2 == j) {
                    break;
                }
            }
            i++;
            if (i == this.A01) {
                i = 0;
            }
        }
        return i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A05(long r11, boolean r13) {
        /*
            r10 = this;
            r4 = r10
            monitor-enter(r4)
            r3 = 0
            r10.A03 = r3     // Catch:{ all -> 0x003c }
            X.7ng r1 = r10.A0T     // Catch:{ all -> 0x003c }
            X.7Ne r0 = r1.A01     // Catch:{ all -> 0x003c }
            r1.A02 = r0     // Catch:{ all -> 0x003c }
            int r5 = r10.A04     // Catch:{ all -> 0x003e }
            int r0 = r10.A01     // Catch:{ all -> 0x003e }
            if (r5 < r0) goto L_0x0012
            int r5 = r5 - r0
        L_0x0012:
            int r6 = r10.A02     // Catch:{ all -> 0x003e }
            boolean r0 = X.AnonymousClass001.A1X(r3, r6)
            if (r0 == 0) goto L_0x002b
            long[] r0 = r10.A0N     // Catch:{ all -> 0x003e }
            r1 = r0[r5]     // Catch:{ all -> 0x003e }
            r7 = r11
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x002b
            long r0 = r10.A06     // Catch:{ all -> 0x003e }
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x002d
            if (r13 != 0) goto L_0x002d
        L_0x002b:
            monitor-exit(r4)
            return r3
        L_0x002d:
            r9 = 1
            int r1 = r4.A00(r5, r6, r7, r9)     // Catch:{ all -> 0x003e }
            r0 = -1
            if (r1 == r0) goto L_0x002b
            r10.A07 = r11     // Catch:{ all -> 0x003e }
            int r3 = r3 + r1
            r10.A03 = r3     // Catch:{ all -> 0x003e }
            monitor-exit(r4)
            return r9
        L_0x003c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1687886t.A05(long, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0032, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0035, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A06(boolean r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            int r3 = r4.A03     // Catch:{ all -> 0x0036 }
            int r0 = r4.A02     // Catch:{ all -> 0x0036 }
            boolean r0 = X.AnonymousClass001.A1X(r3, r0)
            r2 = 1
            if (r0 != 0) goto L_0x001b
            if (r5 != 0) goto L_0x0034
            boolean r0 = r4.A0E     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0034
            X.7yp r1 = r4.A0B     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0033
            X.7yp r0 = r4.A08     // Catch:{ all -> 0x0036 }
            if (r1 == r0) goto L_0x0033
            goto L_0x0034
        L_0x001b:
            int r1 = r4.A04     // Catch:{ all -> 0x0036 }
            int r1 = r1 + r3
            int r0 = r4.A01     // Catch:{ all -> 0x0036 }
            if (r1 < r0) goto L_0x0023
            int r1 = r1 - r0
        L_0x0023:
            X.7yp[] r0 = r4.A0O     // Catch:{ all -> 0x0036 }
            r1 = r0[r1]     // Catch:{ all -> 0x0036 }
            X.7yp r0 = r4.A08     // Catch:{ all -> 0x0036 }
            if (r1 != r0) goto L_0x0034
            X.8gt r1 = r4.A0C     // Catch:{ all -> 0x0036 }
            r0 = 1
            if (r1 == 0) goto L_0x0031
            r0 = 0
        L_0x0031:
            monitor-exit(r4)
            return r0
        L_0x0033:
            r2 = 0
        L_0x0034:
            monitor-exit(r4)
            return r2
        L_0x0036:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1687886t.A06(boolean):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006e, code lost:
        if (r1 != 16) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B3T(X.C166527yp r7) {
        /*
            r6 = this;
            r4 = 0
            r6.A09 = r7
            r5 = r6
            monitor-enter(r5)
            r6.A0H = r4     // Catch:{ all -> 0x0087 }
            X.7yp r0 = r6.A0B     // Catch:{ all -> 0x0087 }
            boolean r0 = X.C162387ry.A0D(r7, r0)     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0010
            goto L_0x0075
        L_0x0010:
            X.7yp r0 = r6.A0A     // Catch:{ all -> 0x0087 }
            boolean r0 = X.C162387ry.A0D(r7, r0)     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x001a
            X.7yp r7 = r6.A0A     // Catch:{ all -> 0x0087 }
        L_0x001a:
            r6.A0B = r7     // Catch:{ all -> 0x0087 }
            java.lang.String r3 = r7.A0T     // Catch:{ all -> 0x0087 }
            java.lang.String r1 = r7.A0O     // Catch:{ all -> 0x0087 }
            r2 = 0
            if (r3 == 0) goto L_0x002a
            int r0 = r3.hashCode()     // Catch:{ all -> 0x0087 }
            switch(r0) {
                case -2123537834: goto L_0x002f;
                case -432837260: goto L_0x0032;
                case -432837259: goto L_0x0035;
                case -53558318: goto L_0x0038;
                case 187078296: goto L_0x0051;
                case 187094639: goto L_0x0054;
                case 1504578661: goto L_0x0057;
                case 1504619009: goto L_0x005a;
                case 1504831518: goto L_0x005d;
                case 1903231877: goto L_0x0060;
                case 1903589369: goto L_0x0063;
                default: goto L_0x002a;
            }     // Catch:{ all -> 0x0087 }
        L_0x002a:
            r6.A0G = r2     // Catch:{ all -> 0x0087 }
            r6.A0F = r4     // Catch:{ all -> 0x0087 }
            goto L_0x0072
        L_0x002f:
            java.lang.String r0 = "audio/eac3-joc"
            goto L_0x0065
        L_0x0032:
            java.lang.String r0 = "audio/mpeg-L1"
            goto L_0x0065
        L_0x0035:
            java.lang.String r0 = "audio/mpeg-L2"
            goto L_0x0065
        L_0x0038:
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x002a
            if (r1 == 0) goto L_0x002a
            X.7GG r0 = X.C162107rG.A01(r1)     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x002a
            int r0 = r0.A00     // Catch:{ all -> 0x0087 }
            int r1 = X.AnonymousClass6C9.A06(r0)     // Catch:{ all -> 0x0087 }
            if (r1 == 0) goto L_0x002a
            goto L_0x006c
        L_0x0051:
            java.lang.String r0 = "audio/ac3"
            goto L_0x0065
        L_0x0054:
            java.lang.String r0 = "audio/raw"
            goto L_0x0065
        L_0x0057:
            java.lang.String r0 = "audio/eac3"
            goto L_0x0065
        L_0x005a:
            java.lang.String r0 = "audio/flac"
            goto L_0x0065
        L_0x005d:
            java.lang.String r0 = "audio/mpeg"
            goto L_0x0065
        L_0x0060:
            java.lang.String r0 = "audio/g711-alaw"
            goto L_0x0065
        L_0x0063:
            java.lang.String r0 = "audio/g711-mlaw"
        L_0x0065:
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0087 }
            if (r0 != 0) goto L_0x0070
            goto L_0x002a
        L_0x006c:
            r0 = 16
            if (r1 == r0) goto L_0x002a
        L_0x0070:
            r2 = 1
            goto L_0x002a
        L_0x0072:
            monitor-exit(r5)
            r1 = 1
            goto L_0x0077
        L_0x0075:
            monitor-exit(r5)
            r1 = 0
        L_0x0077:
            X.8h4 r0 = r6.A0D
            if (r0 == 0) goto L_0x0086
            if (r1 == 0) goto L_0x0086
            X.87m r0 = (X.C1689787m) r0
            android.os.Handler r1 = r0.A0O
            java.lang.Runnable r0 = r0.A0Z
            r1.post(r0)
        L_0x0086:
            return
        L_0x0087:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1687886t.B3T(X.7yp):void");
    }

    public /* synthetic */ void Bkc(C161467pi r2, int i) {
        Bkd(r2, i, 0);
    }

    public void Bkh(AnonymousClass7WZ r14, int i, int i2, int i3, long j) {
        int i4 = i & 1;
        boolean A1S = AnonymousClass000.A1S(i4);
        if (this.A0I) {
            if (A1S) {
                this.A0I = false;
            } else {
                return;
            }
        }
        long j2 = 0 + j;
        if (this.A0G) {
            if (j2 < this.A07) {
                return;
            }
            if (i4 == 0) {
                if (!this.A0F) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Overriding unexpected non-sync sample for format: ");
                    Log.w("SampleQueue", AnonymousClass000.A0R(this.A0B, A0o));
                    this.A0F = true;
                }
                i |= 1;
            }
        }
        long j3 = (this.A0T.A00 - ((long) i2)) - ((long) i3);
        synchronized (this) {
            int i5 = this.A02;
            if (i5 > 0) {
                int i6 = this.A04 + (i5 - 1);
                int i7 = this.A01;
                if (i6 >= i7) {
                    i6 -= i7;
                }
                C161487pm.A03(AnonymousClass0x7.A1P(((this.A0M[i6] + ((long) this.A0K[i6])) > j3 ? 1 : ((this.A0M[i6] + ((long) this.A0K[i6])) == j3 ? 0 : -1))));
            }
            this.A0E = AnonymousClass000.A1S(536870912 & i);
            this.A06 = Math.max(this.A06, j2);
            int i8 = this.A02;
            int i9 = this.A04;
            int i10 = i9 + i8;
            int i11 = this.A01;
            if (i10 >= i11) {
                i10 -= i11;
            }
            this.A0N[i10] = j2;
            long[] jArr = this.A0M;
            jArr[i10] = j3;
            this.A0K[i10] = i2;
            this.A0J[i10] = i;
            this.A0P[i10] = r14;
            C166527yp[] r1 = this.A0O;
            C166527yp r2 = this.A0B;
            r1[i10] = r2;
            this.A0L[i10] = 0;
            this.A0A = r2;
            int i12 = i8 + 1;
            this.A02 = i12;
            if (i12 == i11) {
                int i13 = i11 + 1000;
                int[] iArr = new int[i13];
                long[] jArr2 = new long[i13];
                long[] jArr3 = new long[i13];
                int[] iArr2 = new int[i13];
                int[] iArr3 = new int[i13];
                AnonymousClass7WZ[] r22 = new AnonymousClass7WZ[i13];
                C166527yp[] r12 = new C166527yp[i13];
                int i14 = i11 - i9;
                System.arraycopy(jArr, i9, jArr2, 0, i14);
                System.arraycopy(this.A0N, this.A04, jArr3, 0, i14);
                System.arraycopy(this.A0J, this.A04, iArr2, 0, i14);
                System.arraycopy(this.A0K, this.A04, iArr3, 0, i14);
                System.arraycopy(this.A0P, this.A04, r22, 0, i14);
                System.arraycopy(this.A0O, this.A04, r12, 0, i14);
                System.arraycopy(this.A0L, this.A04, iArr, 0, i14);
                int i15 = this.A04;
                System.arraycopy(this.A0M, 0, jArr2, i14, i15);
                System.arraycopy(this.A0N, 0, jArr3, i14, i15);
                System.arraycopy(this.A0J, 0, iArr2, i14, i15);
                System.arraycopy(this.A0K, 0, iArr3, i14, i15);
                System.arraycopy(this.A0P, 0, r22, i14, i15);
                System.arraycopy(this.A0O, 0, r12, i14, i15);
                System.arraycopy(this.A0L, 0, iArr, i14, i15);
                this.A0M = jArr2;
                this.A0N = jArr3;
                this.A0J = iArr2;
                this.A0K = iArr3;
                this.A0P = r22;
                this.A0O = r12;
                this.A0L = iArr;
                this.A04 = 0;
                this.A01 = i13;
            }
        }
    }

    public final long A01(int i) {
        int i2;
        long j = this.A05;
        long j2 = Long.MIN_VALUE;
        if (i != 0) {
            int i3 = this.A04 + (i - 1);
            int i4 = this.A01;
            if (i3 >= i4) {
                i3 -= i4;
            }
            for (int i5 = 0; i5 < i; i5++) {
                j2 = Math.max(j2, this.A0N[i2]);
                if ((this.A0J[i2] & 1) != 0) {
                    break;
                }
                i2--;
                if (i2 == -1) {
                    i2 = i4 - 1;
                }
            }
        }
        this.A05 = Math.max(j, j2);
        int i6 = this.A02 - i;
        this.A02 = i6;
        this.A00 += i;
        int i7 = this.A04 + i;
        this.A04 = i7;
        int i8 = this.A01;
        if (i7 >= i8) {
            i7 -= i8;
            this.A04 = i7;
        }
        int i9 = this.A03 - i;
        this.A03 = i9;
        if (i9 < 0) {
            this.A03 = 0;
        }
        if (i6 != 0) {
            return this.A0M[i7];
        }
        if (i7 != 0) {
            i8 = i7;
        }
        int i10 = i8 - 1;
        return this.A0M[i10] + ((long) this.A0K[i10]);
    }

    public final void A02() {
        long j;
        C160467ng r3 = this.A0T;
        synchronized (this) {
            int i = this.A02;
            if (i == 0) {
                j = -1;
            } else {
                j = A01(i);
            }
        }
        r3.A03(j);
    }

    public final void A03(C166527yp r6, C147807Fu r7) {
        boolean z;
        C166647z2 r3;
        Class<AnonymousClass86H> cls;
        AnonymousClass86E r1;
        C166527yp r0 = this.A08;
        if (r0 == null) {
            z = true;
            r3 = null;
        } else {
            z = false;
            r3 = r0.A0K;
        }
        this.A08 = r6;
        C166647z2 r2 = r6.A0K;
        if (r2 != null) {
            cls = AnonymousClass86H.class;
        } else {
            cls = null;
        }
        C157057he r02 = new C157057he(r6);
        r02.A0L = cls;
        r7.A00 = C166527yp.A00(r02);
        r7.A01 = this.A0C;
        if (z || !C162387ry.A0D(r3, r2)) {
            if (r2 == null) {
                r1 = null;
            } else {
                r1 = new AnonymousClass86E(new C140456tl(new C143466yv()));
            }
            this.A0C = r1;
            r7.A01 = r1;
        }
    }

    public void A04(boolean z) {
        C160467ng r5 = this.A0T;
        C149627Ne r6 = r5.A01;
        if (r6.A02) {
            C149627Ne r0 = r5.A03;
            int i = (r0.A02 ? 1 : 0) + (((int) (r0.A04 - r6.A04)) / r5.A04);
            AnonymousClass7BK[] r3 = new AnonymousClass7BK[i];
            for (int i2 = 0; i2 < i; i2++) {
                r3[i2] = r6.A01;
                r6.A01 = null;
                C149627Ne r02 = r6.A00;
                r6.A00 = null;
                r6 = r02;
            }
            r5.A05.Bin(r3);
        }
        C149627Ne r03 = new C149627Ne(0, r5.A04);
        r5.A01 = r03;
        r5.A02 = r03;
        r5.A03 = r03;
        r5.A00 = 0;
        r5.A05.Br9();
        this.A02 = 0;
        this.A00 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A0I = true;
        this.A07 = Long.MIN_VALUE;
        this.A05 = Long.MIN_VALUE;
        this.A06 = Long.MIN_VALUE;
        this.A0E = false;
        this.A0A = null;
        if (z) {
            this.A09 = null;
            this.A0B = null;
            this.A0H = true;
        }
    }

    public final void Bkd(C161467pi r9, int i, int i2) {
        C160467ng r6 = this.A0T;
        while (i > 0) {
            int A022 = r6.A02(i);
            C149627Ne r3 = r6.A03;
            r9.A0V(r3.A01.A00, (int) (r6.A00 - r3.A04), A022);
            i -= A022;
            long j = r6.A00 + ((long) A022);
            r6.A00 = j;
            C149627Ne r5 = r6.A03;
            if (j == r5.A03) {
                r6.A03 = r5.A00;
            }
        }
    }

    public final int Bkf(C180768lb r9, int i, int i2, boolean z) {
        C160467ng r7 = this.A0T;
        int A022 = r7.A02(i);
        C149627Ne r3 = r7.A03;
        int read = r9.read(r3.A01.A00, (int) (r7.A00 - r3.A04), A022);
        if (read != -1) {
            long j = r7.A00 + ((long) read);
            r7.A00 = j;
            C149627Ne r32 = r7.A03;
            if (j != r32.A03) {
                return read;
            }
            r7.A03 = r32.A00;
            return read;
        } else if (z) {
            return -1;
        } else {
            throw AnonymousClass6CA.A0M();
        }
    }

    public C1687886t(Looper looper, C156317gQ r4, C186718vp r5, C183888qp r6) {
        this.A0Q = looper;
        this.A0S = r5;
        this.A0R = r4;
        this.A0T = new C160467ng(r6);
    }
}
