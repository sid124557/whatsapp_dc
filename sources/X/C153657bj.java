package X;

import android.util.Pair;
import com.facebook.android.exoplayer2.Timeline;

/* renamed from: X.7bj  reason: invalid class name and case insensitive filesystem */
public final class C153657bj {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C152757a4 A04;
    public C152757a4 A05;
    public C152757a4 A06;
    public Timeline A07;
    public Object A08;
    public boolean A09;
    public final C151817Wk A0A = new C151817Wk();
    public final C1672580j A0B = new C1672580j();

    public final C149987Or A01(int i, long j, long j2) {
        long[] jArr;
        int length;
        long j3;
        long j4;
        long j5;
        AnonymousClass7Z2 r0 = new AnonymousClass7Z2(i, -1, j2, -1);
        Timeline timeline = this.A07;
        int i2 = r0.A02;
        C151817Wk r5 = this.A0A;
        timeline.A08(r5, i2, false);
        C156497gj r10 = r5.A03;
        int i3 = 0;
        while (true) {
            jArr = r10.A01;
            length = jArr.length;
            j3 = j;
            if (i3 >= length) {
                break;
            }
            long j6 = jArr[i3];
            if (j6 == Long.MIN_VALUE || j < j6) {
                break;
            }
            i3++;
        }
        if (i3 >= length) {
            i3 = -1;
        }
        if (i3 == -1) {
            j4 = Long.MIN_VALUE;
        } else {
            j4 = jArr[i3];
        }
        boolean A092 = A09(r0, j4);
        boolean A0A2 = A0A(r0, A092);
        if (j4 == Long.MIN_VALUE) {
            j5 = r5.A01;
        } else {
            j5 = j4;
        }
        return new C149987Or(r0, j3, j4, -9223372036854775807L, j5, A092, A0A2);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006e  */
    public X.AnonymousClass7Z2 A04(int r14, long r15) {
        /*
            r13 = this;
            r7 = r13
            com.facebook.android.exoplayer2.Timeline r1 = r13.A07
            X.7Wk r6 = r13.A0A
            r0 = 1
            r8 = r14
            X.7Wk r0 = r1.A08(r6, r14, r0)
            java.lang.Object r3 = r0.A04
            int r5 = r6.A00
            java.lang.Object r1 = r13.A08
            r4 = -1
            if (r1 == 0) goto L_0x002f
            com.facebook.android.exoplayer2.Timeline r0 = r13.A07
            int r2 = r0.A04(r1)
            if (r2 == r4) goto L_0x002f
            com.facebook.android.exoplayer2.Timeline r1 = r13.A07
            r0 = 0
            X.7Wk r0 = r1.A08(r6, r2, r0)
            int r0 = r0.A00
            if (r0 != r5) goto L_0x002f
            long r11 = r13.A03
        L_0x0029:
            r9 = r15
            X.7Z2 r0 = r7.A05(r8, r9, r11)
            return r0
        L_0x002f:
            X.7a4 r1 = r13.A05
            if (r1 != 0) goto L_0x0047
            X.7a4 r1 = r13.A04
        L_0x0035:
            if (r1 != 0) goto L_0x0047
            X.7a4 r3 = r13.A05
            if (r3 != 0) goto L_0x0052
            X.7a4 r3 = r13.A04
        L_0x003d:
            if (r3 != 0) goto L_0x0052
            long r11 = r13.A02
            r0 = 1
            long r0 = r0 + r11
            r13.A02 = r0
            goto L_0x0029
        L_0x0047:
            java.lang.Object r0 = r1.A0B
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0071
            X.7Or r0 = r1.A02
            goto L_0x0069
        L_0x0052:
            com.facebook.android.exoplayer2.Timeline r1 = r13.A07
            java.lang.Object r0 = r3.A0B
            int r2 = r1.A04(r0)
            if (r2 == r4) goto L_0x006e
            com.facebook.android.exoplayer2.Timeline r1 = r13.A07
            r0 = 0
            X.7Wk r0 = r1.A08(r6, r2, r0)
            int r0 = r0.A00
            if (r0 != r5) goto L_0x006e
            X.7Or r0 = r3.A02
        L_0x0069:
            X.7Z2 r0 = r0.A04
            long r11 = r0.A03
            goto L_0x0029
        L_0x006e:
            X.7a4 r3 = r3.A01
            goto L_0x003d
        L_0x0071:
            X.7a4 r1 = r1.A01
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153657bj.A04(int, long):X.7Z2");
    }

    public boolean A08(C152757a4 r4) {
        boolean z = false;
        C159197lM.A02(AnonymousClass000.A1W(r4));
        this.A04 = r4;
        while (true) {
            r4 = r4.A01;
            if (r4 != null) {
                if (r4 == this.A06) {
                    this.A06 = this.A05;
                    z = true;
                }
                r4.A01();
                this.A00--;
            } else {
                this.A04.A01 = null;
                return z;
            }
        }
    }

    public C152757a4 A00() {
        C152757a4 r1 = this.A05;
        if (r1 != null) {
            if (r1 == this.A06) {
                this.A06 = r1.A01;
            }
            r1.A01();
            C152757a4 r12 = this.A05.A01;
            this.A05 = r12;
            int i = this.A00 - 1;
            this.A00 = i;
            if (i == 0) {
                this.A04 = null;
            }
            return r12;
        }
        C152757a4 r13 = this.A04;
        this.A05 = r13;
        this.A06 = r13;
        return r13;
    }

    public final C149987Or A02(C152757a4 r21, long j) {
        C152757a4 r7 = r21;
        C149987Or r3 = r7.A02;
        if (r3.A06) {
            Timeline timeline = this.A07;
            int i = r3.A04.A02;
            C151817Wk r13 = this.A0A;
            C1672580j r14 = this.A0B;
            int A032 = timeline.A03(r13, r14, i, this.A01, this.A09);
            if (A032 != -1) {
                int i2 = this.A07.A08(r13, A032, true).A00;
                Object obj = r13.A04;
                long j2 = r3.A04.A03;
                long j3 = 0;
                if (this.A07.A09(r14, i2, 0).A00 == A032) {
                    Pair A072 = this.A07.A07(r13, r14, i2, -9223372036854775807L, Math.max(0, (r7.A00 + r3.A01) - j));
                    if (A072 != null) {
                        A032 = C18280x3.A03(A072);
                        j3 = AnonymousClass6C8.A0R(A072);
                        C152757a4 r0 = r7.A01;
                        if (r0 == null || !r0.A0B.equals(obj)) {
                            j2 = this.A02;
                            this.A02 = 1 + j2;
                        } else {
                            j2 = r7.A01.A02.A04.A03;
                        }
                    }
                }
                AnonymousClass7Z2 A052 = A05(A032, j3, j2);
                Timeline timeline2 = this.A07;
                int i3 = A052.A02;
                timeline2.A08(r13, i3, false);
                if (A052.A00 != -1) {
                    return null;
                }
                return A01(i3, j3, A052.A03);
            }
        } else {
            AnonymousClass7Z2 r10 = r3.A04;
            Timeline timeline3 = this.A07;
            int i4 = r10.A02;
            C151817Wk r1 = this.A0A;
            timeline3.A08(r1, i4, false);
            if (r10.A00 == -1) {
                long j4 = r3.A02;
                if (j4 != Long.MIN_VALUE) {
                    long[] jArr = r1.A03.A01;
                    int length = jArr.length;
                    while (true) {
                        length--;
                        if (length >= 0) {
                            long j5 = jArr[length];
                            if (j5 != Long.MIN_VALUE && j5 <= j4) {
                                break;
                            }
                        } else {
                            return A01(r10.A02, j4, r10.A03);
                        }
                    }
                }
            }
        }
        return null;
    }

    public final C149987Or A03(C149987Or r17, AnonymousClass7Z2 r18) {
        long j;
        C149987Or r3 = r17;
        long j2 = r3.A03;
        long j3 = r3.A02;
        AnonymousClass7Z2 r5 = r18;
        boolean A092 = A09(r5, j3);
        boolean A0A2 = A0A(r5, A092);
        Timeline timeline = this.A07;
        int i = r5.A02;
        C151817Wk r4 = this.A0A;
        timeline.A08(r4, i, false);
        if (r5.A00 != -1) {
            j = -9223372036854775807L;
        } else if (j3 == Long.MIN_VALUE) {
            j = r4.A01;
        } else {
            j = j3;
        }
        return new C149987Or(r5, j2, j3, r3.A00, j, A092, A0A2);
    }

    public final AnonymousClass7Z2 A05(int i, long j, long j2) {
        int i2;
        Timeline timeline = this.A07;
        C151817Wk r1 = this.A0A;
        int i3 = i;
        timeline.A08(r1, i, false);
        C156497gj r6 = r1.A03;
        long[] jArr = r6.A01;
        int length = jArr.length;
        while (true) {
            length--;
            long j3 = j2;
            if (length < 0) {
                return new AnonymousClass7Z2(i3, -1, j3, -1);
            }
            long j4 = jArr[length];
            if (j4 != Long.MIN_VALUE && j4 <= j) {
                AnonymousClass7A5 r3 = r6.A02[length];
                int i4 = -1;
                do {
                    i4++;
                    int[] iArr = r3.A00;
                    if (i4 >= iArr.length || (i2 = iArr[i4]) == 0) {
                    }
                } while (i2 != 1);
                return new AnonymousClass7Z2(i3, length, j3, i4);
            }
        }
    }

    public void A06(boolean z) {
        Object obj;
        C152757a4 r3 = this.A05;
        if (r3 == null) {
            r3 = this.A04;
        }
        if (r3 != null) {
            if (z) {
                obj = r3.A0B;
            } else {
                obj = null;
            }
            this.A08 = obj;
            this.A03 = r3.A02.A04.A03;
            r3.A01();
            A08(r3);
        } else if (!z) {
            this.A08 = null;
        }
        this.A05 = null;
        this.A04 = null;
        this.A06 = null;
        this.A00 = 0;
    }

    public final boolean A07() {
        C152757a4 r1;
        C152757a4 r3 = this.A05;
        if (r3 == null) {
            r3 = this.A04;
        }
        if (r3 != null) {
            while (true) {
                int A032 = this.A07.A03(this.A0A, this.A0B, r3.A02.A04.A02, this.A01, this.A09);
                while (true) {
                    r1 = r3.A01;
                    if (r1 != null && !r3.A02.A06) {
                        r3 = r1;
                    }
                }
                if (A032 == -1 || r1 == null || r1.A02.A04.A02 != A032) {
                    boolean A082 = A08(r3);
                    C149987Or r12 = r3.A02;
                    r3.A02 = A03(r12, r12.A04);
                } else {
                    r3 = r1;
                }
            }
            boolean A0822 = A08(r3);
            C149987Or r122 = r3.A02;
            r3.A02 = A03(r122, r122.A04);
            if (!A0822 || this.A05 == null) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean A09(AnonymousClass7Z2 r9, long j) {
        Timeline timeline = this.A07;
        int i = r9.A02;
        C151817Wk r3 = this.A0A;
        int i2 = timeline.A08(r3, i, false).A03.A00;
        if (i2 != 0) {
            boolean A1X = AnonymousClass001.A1X(r9.A00, -1);
            if (r3.A03.A01[i2 - 1] == Long.MIN_VALUE || A1X || j != Long.MIN_VALUE) {
                return false;
            }
        }
        return true;
    }

    public final boolean A0A(AnonymousClass7Z2 r10, boolean z) {
        Timeline timeline = this.A07;
        int i = r10.A02;
        C151817Wk r4 = this.A0A;
        int i2 = timeline.A08(r4, i, false).A00;
        Timeline timeline2 = this.A07;
        C1672580j r5 = this.A0B;
        if (timeline2.A09(r5, i2, 0).A09 || this.A07.A03(r4, r5, i, this.A01, this.A09) != -1 || !z) {
            return false;
        }
        return true;
    }
}
