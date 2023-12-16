package X;

import android.os.Handler;
import android.util.Pair;
import com.google.android.exoplayer2.Timeline;

/* renamed from: X.7bp  reason: invalid class name and case insensitive filesystem */
public final class C153717bp {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C153327b3 A04;
    public C153327b3 A05;
    public C153327b3 A06;
    public Object A07;
    public boolean A08;
    public final Handler A09;
    public final C153417bH A0A = new C153417bH();
    public final C158647kK A0B = new C158647kK();
    public final C1685685x A0C;

    public boolean A08(C153327b3 r5) {
        boolean z = false;
        C161487pm.A04(AnonymousClass000.A1W(r5));
        if (!r5.equals(this.A04)) {
            this.A04 = r5;
            while (r5.A01 != null) {
                r5 = r5.A01;
                if (r5 == this.A06) {
                    this.A06 = this.A05;
                    z = true;
                }
                r5.A03();
                this.A00--;
            }
            C153327b3 r2 = this.A04;
            if (null != r2.A01) {
                r2.A01 = null;
            }
            A07();
        }
        return z;
    }

    public C153327b3 A00() {
        C153327b3 r2 = this.A05;
        if (r2 == null) {
            return null;
        }
        if (r2 == this.A06) {
            this.A06 = r2.A01;
        }
        r2.A03();
        int i = this.A00 - 1;
        this.A00 = i;
        if (i == 0) {
            this.A04 = null;
            C153327b3 r1 = this.A05;
            this.A07 = r1.A0B;
            this.A03 = r1.A02.A04.A03;
        }
        this.A05 = this.A05.A01;
        A07();
        return this.A05;
    }

    public final C153047aa A01(C153327b3 r23, Timeline timeline, long j) {
        int i;
        long j2;
        AnonymousClass6PS r15;
        int i2;
        C153327b3 r7 = r23;
        C153047aa r5 = r7.A02;
        long j3 = r7.A00;
        long j4 = r5.A00;
        long j5 = (j3 + j4) - j;
        Timeline timeline2 = timeline;
        if (r5.A06) {
            AnonymousClass6PS r3 = r5.A04;
            int A042 = timeline2.A04(r3.A04);
            C153417bH r152 = this.A0A;
            C158647kK r10 = this.A0B;
            long j6 = 0;
            C158647kK r16 = r10;
            int A032 = timeline2.A03(r152, r16, A042, this.A01, this.A08);
            if (A032 != -1) {
                int i3 = timeline2.A09(r152, A032, true).A00;
                Object obj = r152.A05;
                long j7 = r3.A03;
                if (timeline2.A0B(r10, i3, 0).A00 == A032) {
                    Pair A082 = timeline2.A08(r152, r16, i3, -9223372036854775807L, Math.max(0, j5));
                    if (A082 != null) {
                        obj = A082.first;
                        j2 = AnonymousClass6C8.A0R(A082);
                        C153327b3 r32 = r7.A01;
                        if (r32 == null || !r32.A0B.equals(obj)) {
                            j7 = this.A02;
                            this.A02 = 1 + j7;
                        } else {
                            j7 = r32.A02.A04.A03;
                        }
                        j6 = -9223372036854775807L;
                    }
                } else {
                    j2 = 0;
                }
                timeline2.A0A(r152, obj);
                int A022 = r152.A02(j2);
                if (A022 == -1) {
                    r15 = new AnonymousClass6PS(obj, j7, r152.A01(j2));
                } else {
                    AnonymousClass7WC r13 = r152.A03.A02[A022];
                    int i4 = -1;
                    do {
                        i4++;
                        int[] iArr = r13.A00;
                        if (i4 >= iArr.length || (i2 = iArr[i4]) == 0) {
                            Object obj2 = obj;
                            r15 = new AnonymousClass6PS(obj2, A022, i4, j7);
                        }
                    } while (i2 != 1);
                    Object obj22 = obj;
                    r15 = new AnonymousClass6PS(obj22, A022, i4, j7);
                }
                return A03(timeline2, r15, j6, j2);
            }
        } else {
            AnonymousClass6PS r8 = r5.A04;
            Object obj3 = r8.A04;
            C153417bH r33 = this.A0A;
            timeline2.A0A(r33, obj3);
            if (!AnonymousClass001.A1X(r8.A00, -1)) {
                int A023 = r33.A02(r5.A01);
                if (A023 == -1) {
                    return A04(timeline2, obj3, j4, j4, r8.A03);
                }
                AnonymousClass7WC r6 = r33.A03.A02[A023];
                int i5 = -1;
                do {
                    i5++;
                    int[] iArr2 = r6.A00;
                    if (i5 >= iArr2.length || (i = iArr2[i5]) == 0) {
                        AnonymousClass6PS r153 = new AnonymousClass6PS(obj3, A023, i5, r8.A03);
                        timeline2.A0A(r33, r153.A04);
                    }
                } while (i != 1);
                AnonymousClass6PS r1532 = new AnonymousClass6PS(obj3, A023, i5, r8.A03);
                timeline2.A0A(r33, r1532.A04);
                return new C153047aa(r1532, 0, j4, -9223372036854775807L, -9223372036854775807L, false, false, false);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r6.A02 != -1) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C153047aa A02(X.C153047aa r19, com.google.android.exoplayer2.Timeline r20) {
        /*
            r18 = this;
            r3 = r19
            X.6PS r6 = r3.A04
            int r0 = r6.A00
            r1 = -1
            boolean r2 = X.AnonymousClass001.A1X(r0, r1)
            if (r2 != 0) goto L_0x0012
            int r0 = r6.A02
            r15 = 1
            if (r0 == r1) goto L_0x0013
        L_0x0012:
            r15 = 0
        L_0x0013:
            r1 = r18
            r5 = r20
            boolean r16 = r1.A0A(r5, r6)
            boolean r17 = r1.A0B(r5, r6, r15)
            java.lang.Object r0 = r6.A04
            X.7bH r4 = r1.A0A
            r5.A0A(r4, r0)
            if (r2 == 0) goto L_0x0039
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x002d:
            long r7 = r3.A03
            long r9 = r3.A02
            long r11 = r3.A01
            X.7aa r5 = new X.7aa
            r5.<init>(r6, r7, r9, r11, r13, r15, r16, r17)
            return r5
        L_0x0039:
            long r13 = r3.A01
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x004a
            r1 = -9223372036854775808
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x002d
        L_0x004a:
            long r13 = r4.A01
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153717bp.A02(X.7aa, com.google.android.exoplayer2.Timeline):X.7aa");
    }

    public final C153047aa A03(Timeline timeline, AnonymousClass6PS r21, long j, long j2) {
        AnonymousClass6PS r1 = r21;
        Object obj = r1.A04;
        C153417bH r4 = this.A0A;
        Timeline timeline2 = timeline;
        timeline2.A0A(r4, obj);
        int i = r1.A00;
        long j3 = j;
        if (!AnonymousClass001.A1X(i, -1)) {
            return A04(timeline2, obj, j2, j3, r1.A03);
        }
        AnonymousClass6PS r13 = new AnonymousClass6PS(obj, i, r1.A01, r1.A03);
        timeline2.A0A(r4, r13.A04);
        return new C153047aa(r13, 0, j3, -9223372036854775807L, -9223372036854775807L, false, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
        if (r7.A02 != -1) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C153047aa A04(com.google.android.exoplayer2.Timeline r20, java.lang.Object r21, long r22, long r24, long r26) {
        /*
            r19 = this;
            r8 = r22
            r5 = r19
            X.7bH r1 = r5.A0A
            r6 = r20
            r0 = r21
            r6.A0A(r1, r0)
            int r4 = r1.A01(r8)
            X.6PS r7 = new X.6PS
            r2 = r26
            r7.<init>(r0, r2, r4)
            int r0 = r7.A00
            r3 = -1
            boolean r0 = X.AnonymousClass001.A1X(r0, r3)
            if (r0 != 0) goto L_0x0026
            int r0 = r7.A02
            r2 = 1
            if (r0 == r3) goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            boolean r17 = r5.A0A(r6, r7)
            boolean r18 = r5.A0B(r6, r7, r2)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == r3) goto L_0x005f
            X.7k3 r0 = r1.A03
            long[] r0 = r0.A01
            r12 = r0[r4]
            int r0 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0064
            r3 = -9223372036854775808
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0064
            r14 = r12
        L_0x0047:
            int r0 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0055
            int r0 = (r22 > r14 ? 1 : (r22 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x0055
            r0 = 1
            long r8 = X.AnonymousClass6C8.A0Q(r14, r0)
        L_0x0055:
            X.7aa r6 = new X.7aa
            r10 = r24
            r16 = r2
            r6.<init>(r7, r8, r10, r12, r14, r16, r17, r18)
            return r6
        L_0x005f:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0064:
            long r14 = r1.A01
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153717bp.A04(com.google.android.exoplayer2.Timeline, java.lang.Object, long, long, long):X.7aa");
    }

    public AnonymousClass6PS A05(Timeline timeline, Object obj, long j) {
        C153327b3 r4;
        long j2;
        int i;
        int A042;
        C153417bH r3 = this.A0A;
        Object obj2 = obj;
        int A002 = C153417bH.A00(r3, timeline, obj);
        Object obj3 = this.A07;
        if (obj3 == null || (A042 = timeline.A04(obj3)) == -1 || timeline.A09(r3, A042, false).A00 != A002) {
            C153327b3 r42 = this.A05;
            while (true) {
                if (r4 != null) {
                    if (r4.A0B.equals(obj)) {
                        break;
                    }
                    r42 = r4.A01;
                } else {
                    r4 = this.A05;
                    while (true) {
                        if (r4 != null) {
                            int A043 = timeline.A04(r4.A0B);
                            if (A043 != -1 && timeline.A09(r3, A043, false).A00 == A002) {
                                break;
                            }
                            r4 = r4.A01;
                        } else {
                            j2 = this.A02;
                            this.A02 = 1 + j2;
                            if (this.A05 == null) {
                                this.A07 = obj;
                                this.A03 = j2;
                            }
                        }
                    }
                }
            }
            j2 = r4.A02.A04.A03;
        } else {
            j2 = this.A03;
        }
        timeline.A0A(r3, obj);
        int A022 = r3.A02(j);
        if (A022 == -1) {
            return new AnonymousClass6PS(obj, j2, r3.A01(j));
        }
        AnonymousClass7WC r32 = r3.A03.A02[A022];
        int i2 = -1;
        do {
            i2++;
            int[] iArr = r32.A00;
            if (i2 >= iArr.length || (i = iArr[i2]) == 0) {
            }
        } while (i != 1);
        return new AnonymousClass6PS(obj2, A022, i2, j2);
    }

    public void A06() {
        if (this.A00 != 0) {
            C153327b3 r0 = this.A05;
            C161487pm.A01(r0);
            this.A07 = r0.A0B;
            this.A03 = r0.A02.A04.A03;
            do {
                r0.A03();
                r0 = r0.A01;
            } while (r0 != null);
            this.A05 = null;
            this.A04 = null;
            this.A06 = null;
            this.A00 = 0;
            A07();
        }
    }

    public final boolean A09(Timeline timeline) {
        C153327b3 r1;
        C153327b3 r2 = this.A05;
        if (r2 == null) {
            return true;
        }
        Timeline timeline2 = timeline;
        int A042 = timeline.A04(r2.A0B);
        while (true) {
            A042 = timeline2.A03(this.A0A, this.A0B, A042, this.A01, this.A08);
            while (true) {
                r1 = r2.A01;
                if (r1 != null && !r2.A02.A06) {
                    r2 = r1;
                }
            }
            if (A042 == -1 || r1 == null || timeline.A04(r1.A0B) != A042) {
                boolean A082 = A08(r2);
                r2.A02 = A02(r2.A02, timeline);
            } else {
                r2 = r1;
            }
        }
        boolean A0822 = A08(r2);
        r2.A02 = A02(r2.A02, timeline);
        return !A0822;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r6.A02 != -1) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0A(com.google.android.exoplayer2.Timeline r5, X.AnonymousClass6PS r6) {
        /*
            r4 = this;
            int r0 = r6.A00
            r2 = -1
            boolean r0 = X.AnonymousClass001.A1X(r0, r2)
            if (r0 != 0) goto L_0x000e
            int r1 = r6.A02
            r0 = 1
            if (r1 == r2) goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            r3 = 0
            if (r0 == 0) goto L_0x0029
            java.lang.Object r1 = r6.A04
            X.7bH r0 = r4.A0A
            int r2 = X.C153417bH.A00(r0, r5, r1)
            int r1 = r5.A04(r1)
            X.7kK r0 = r4.A0B
            X.7kK r0 = X.AnonymousClass6C8.A0X(r0, r5, r2)
            int r0 = r0.A01
            if (r0 != r1) goto L_0x0029
            r3 = 1
        L_0x0029:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153717bp.A0A(com.google.android.exoplayer2.Timeline, X.6PS):boolean");
    }

    public final boolean A0B(Timeline timeline, AnonymousClass6PS r9, boolean z) {
        Timeline timeline2 = timeline;
        int A042 = timeline.A04(r9.A04);
        C153417bH r2 = this.A0A;
        int i = timeline.A09(r2, A042, false).A00;
        C158647kK r3 = this.A0B;
        if (AnonymousClass6C8.A0X(r3, timeline, i).A0A || timeline2.A03(r2, r3, A042, this.A01, this.A08) != -1 || !z) {
            return false;
        }
        return true;
    }

    public C153717bp(Handler handler, C1685685x r3) {
        this.A0C = r3;
        this.A09 = handler;
    }

    public final void A07() {
        AnonymousClass6PS r3;
        C129486aO builder = C129586aY.builder();
        for (C153327b3 r1 = this.A05; r1 != null; r1 = r1.A01) {
            builder.add((Object) r1.A02.A04);
        }
        C153327b3 r0 = this.A06;
        if (r0 == null) {
            r3 = null;
        } else {
            r3 = r0.A02.A04;
        }
        this.A09.post(new C172708Mj(this, builder, r3, 6));
    }
}
