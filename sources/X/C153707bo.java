package X;

import android.os.SystemClock;

/* renamed from: X.7bo  reason: invalid class name and case insensitive filesystem */
public final class C153707bo {
    public final C56612sH A00;
    public final AnonymousClass1VX A01;
    public final C52992mN A02;
    public final C153077ad A03;

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a6, code lost:
        if (r0 != false) goto L_0x00a8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass3ZG A00(X.C55842r0 r21, int r22, int r23, int r24, int r25, long r26, long r28, long r30) {
        /*
            r20 = this;
            r0 = 3
            r9 = r21
            X.C162457s7.A0J(r9, r0)
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r18 = r2 - r26
            r8 = r20
            X.2mN r1 = r8.A02
            boolean r0 = r1.A02()
            r17 = r0 ^ 1
            r0 = 1
            r12 = r22
            if (r12 == r0) goto L_0x0032
            r0 = 5
            if (r12 == r0) goto L_0x0032
            java.lang.Long r7 = java.lang.Long.valueOf(r30)
        L_0x0022:
            int r6 = r9.A01
            java.lang.Integer r11 = X.AnonymousClass33N.A00(r6)
            java.lang.Integer r5 = r9.A01()
            int r16 = r9.A00()
            monitor-enter(r1)
            goto L_0x0034
        L_0x0032:
            r7 = 0
            goto L_0x0022
        L_0x0034:
            X.32E r0 = r1.A03     // Catch:{ all -> 0x0149 }
            X.32E r4 = new X.32E     // Catch:{ all -> 0x0149 }
            r4.<init>(r0)     // Catch:{ all -> 0x0149 }
            monitor-exit(r1)
            int r0 = r4.A00
            r10 = 0
            if (r0 == 0) goto L_0x010c
            long r0 = r4.A02
            r14 = 0
            int r13 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r13 <= 0) goto L_0x010c
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            X.C626936e.A06(r0)
            long r0 = r0.longValue()
            long r26 = r26 - r0
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS
            r0 = 10
            long r13 = r13.toMillis(r0)
            int r0 = (r26 > r13 ? 1 : (r26 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x010c
            long r0 = r4.A02
            java.lang.Long r10 = X.C18310x6.A0f(r2, r0)
            int r0 = r4.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C626936e.A06(r0)
            int r0 = r0.intValue()
            r13 = 1
            if (r0 == r13) goto L_0x007f
            r13 = 2
            if (r0 == r13) goto L_0x007f
            r13 = 3
            if (r0 != r13) goto L_0x007f
            r13 = 4
        L_0x007f:
            r1 = 1
            r2 = r25
            if (r25 == 0) goto L_0x0107
            r0 = 2
            if (r2 == r1) goto L_0x0093
            r1 = 3
            if (r2 == r0) goto L_0x0107
            r0 = 4
            if (r2 == r1) goto L_0x0093
            r1 = 5
            if (r2 == r0) goto L_0x0107
            if (r2 != r1) goto L_0x0105
            r0 = 6
        L_0x0093:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L_0x0097:
            r0 = 12
            r14 = 0
            if (r6 != r0) goto L_0x00a8
            r14 = 1
            X.1VX r1 = r8.A01
            r0 = 4015(0xfaf, float:5.626E-42)
            boolean r0 = r1.A0X(r0)
            r8 = 1
            if (r0 == 0) goto L_0x00a9
        L_0x00a8:
            r8 = 0
        L_0x00a9:
            r0 = r23
            long r2 = (long) r0
            r0 = r24
            long r0 = (long) r0
            java.lang.Boolean r6 = r9.A00
            if (r6 == 0) goto L_0x0103
            boolean r9 = r6.booleanValue()
        L_0x00b7:
            if (r14 != 0) goto L_0x010f
            X.6iV r6 = new X.6iV
            r6.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
            r6.A07 = r8
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.A0B = r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A0C = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r18)
            r6.A09 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r17)
            r6.A00 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r6.A01 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r28)
            r6.A0A = r0
            if (r7 == 0) goto L_0x00ec
            r6.A0D = r7
        L_0x00ec:
            r6.A05 = r11
            r6.A04 = r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r6.A06 = r0
            if (r10 == 0) goto L_0x00fa
            r6.A08 = r10
        L_0x00fa:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r6.A03 = r0
            r6.A02 = r4
            return r6
        L_0x0103:
            r9 = 0
            goto L_0x00b7
        L_0x0105:
            r4 = 0
            goto L_0x0097
        L_0x0107:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            goto L_0x0097
        L_0x010c:
            r13 = 3
            goto L_0x007f
        L_0x010f:
            if (r8 == 0) goto L_0x0113
            r6 = 0
            return r6
        L_0x0113:
            X.6iL r6 = new X.6iL
            r6.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r6.A05 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r6.A08 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r18)
            r6.A07 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r17)
            r6.A00 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r6.A01 = r0
            if (r7 == 0) goto L_0x013a
            r6.A09 = r7
        L_0x013a:
            r6.A04 = r5
            if (r10 == 0) goto L_0x0140
            r6.A06 = r10
        L_0x0140:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r6.A03 = r0
            r6.A02 = r4
            return r6
        L_0x0149:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153707bo.A00(X.2r0, int, int, int, int, long, long, long):X.3ZG");
    }

    public void A04(C55842r0 r4) {
        C162457s7.A0J(r4, 3);
        this.A03.A03(r4, (Integer) null, 6);
    }

    public void A01() {
        C153077ad r6 = this.A03;
        long uptimeMillis = SystemClock.uptimeMillis();
        r6.A00 = uptimeMillis;
        r6.A03 = uptimeMillis;
        r6.A05 = C18280x3.A0Y();
        r6.A02 = 0;
        C134076iP r1 = new C134076iP();
        r1.A05 = AnonymousClass001.A0f();
        r1.A07 = 0L;
        r1.A0A = 0L;
        r1.A0B = r6.A05;
        long j = r6.A02;
        r1.A09 = Long.valueOf(j);
        long j2 = r6.A01;
        r1.A08 = Long.valueOf(j2);
        r1.A00 = Boolean.TRUE;
        r6.A04 = r1;
        r6.A02 = j + 1;
        r6.A01 = j2 + 1;
    }

    public void A02(int i) {
        C153077ad r5 = this.A03;
        if (i != 12) {
            long uptimeMillis = SystemClock.uptimeMillis();
            C134076iP r4 = new C134076iP();
            r5.A01(r4, 2, uptimeMillis);
            r4.A03 = AnonymousClass33N.A00(i);
            r4.A00 = Boolean.FALSE;
            r4.A06 = 1;
            r5.A03 = uptimeMillis;
            r5.A02++;
            r5.A01++;
            C134076iP r1 = r5.A04;
            if (r1 != null) {
                r5.A07.BhD(r1);
                r5.A04 = null;
            }
            r5.A07.BhD(r4);
        }
    }

    public void A03(C55842r0 r3) {
        this.A03.A02(r3, 6);
    }

    public void A05(C55842r0 r5) {
        C153077ad r3 = this.A03;
        C134076iP A002 = r3.A00(r5, AnonymousClass8ZD.A00, 2);
        if (A002 != null) {
            C134076iP r1 = r3.A04;
            if (r1 != null) {
                r3.A07.BhD(r1);
                r3.A04 = null;
            }
            r3.A07.BhD(A002);
        }
    }

    public void A06(C55842r0 r3) {
        this.A03.A02(r3, 4);
    }

    public void A07(C55842r0 r3) {
        this.A03.A02(r3, 5);
    }

    public void A08(C55842r0 r3) {
        this.A03.A02(r3, 3);
    }

    public void A09(C55842r0 r4, int i) {
        this.A03.A03(r4, Integer.valueOf(i), 4);
    }

    public void A0A(C55842r0 r4, int i) {
        this.A03.A03(r4, Integer.valueOf(i), 5);
    }

    public void A0B(C55842r0 r4, int i) {
        this.A03.A03(r4, Integer.valueOf(i), 3);
    }

    public C153707bo(C56612sH r1, AnonymousClass1VX r2, C52992mN r3, C153077ad r4) {
        C18260x0.A0c(r1, r2, r4, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }
}
