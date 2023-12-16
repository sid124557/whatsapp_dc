package X;

import android.os.SystemClock;

/* renamed from: X.2zc  reason: invalid class name and case insensitive filesystem */
public final class C61042zc {
    public int A00 = -1;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public C55842r0 A05;
    public final C44882Xv A06;
    public final C620633i A07;
    public final C56612sH A08;
    public final AnonymousClass4FV A09;
    public final AnonymousClass2X6 A0A;
    public final C111125ha A0B;
    public final C111125ha A0C;
    public final AnonymousClass66R A0D = C154517dI.A01(new C175008Ws(this));
    public final AnonymousClass66R A0E = C154517dI.A01(new C175018Wt(this));

    public final void A03(C55842r0 r1) {
        this.A05 = r1;
    }

    public C61042zc(C44882Xv r2, C620633i r3, C56612sH r4, AnonymousClass4FV r5, AnonymousClass2X6 r6, C111125ha r7, C111125ha r8) {
        C18260x0.A0f(r4, r5, r3, r7, r8);
        C18260x0.A0U(r2, r6);
        this.A08 = r4;
        this.A09 = r5;
        this.A07 = r3;
        this.A0B = r7;
        this.A0C = r8;
        this.A06 = r2;
        this.A0A = r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f7, code lost:
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void A00(X.C61042zc r13, int r14) {
        /*
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "XmppLogoutLogging/WamLogout event is triggered: "
            X.C18260x0.A0w(r0, r1, r14)
            X.2r0 r0 = r13.A05
            if (r0 == 0) goto L_0x00b2
            int r1 = r0.A01
            r0 = 12
            if (r1 == r0) goto L_0x00b2
            X.1b1 r2 = new X.1b1
            r2.<init>()
            r0 = 0
            switch(r14) {
                case 1: goto L_0x00c6;
                case 2: goto L_0x00c8;
                case 3: goto L_0x00ca;
                case 4: goto L_0x00cc;
                case 5: goto L_0x00ce;
                case 6: goto L_0x00d0;
                case 7: goto L_0x00d2;
                case 8: goto L_0x00d4;
                case 9: goto L_0x00d7;
                case 10: goto L_0x00da;
                case 11: goto L_0x00dd;
                case 12: goto L_0x00e0;
                case 13: goto L_0x00e3;
                case 14: goto L_0x00e6;
                case 15: goto L_0x00e9;
                case 16: goto L_0x00ec;
                case 17: goto L_0x00ef;
                case 18: goto L_0x00f2;
                case 19: goto L_0x00f5;
                default: goto L_0x001c;
            }
        L_0x001c:
            r2.A05 = r0
            X.2r0 r1 = r13.A05
            if (r1 == 0) goto L_0x0046
            int r0 = r1.A03
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r2.A09 = r0
            int r0 = r1.A01
            java.lang.Integer r0 = X.AnonymousClass33N.A00(r0)
            r2.A03 = r0
            int r0 = r1.A00()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A04 = r0
            java.lang.Integer r0 = r1.A01()
            r2.A02 = r0
            java.lang.Boolean r0 = r1.A00
            r2.A01 = r0
        L_0x0046:
            boolean r0 = X.C107385bE.A06()
            if (r0 == 0) goto L_0x005f
            X.33i r0 = r13.A07
            android.app.usage.UsageStatsManager r0 = r0.A0B()
            if (r0 == 0) goto L_0x00c3
            int r0 = r0.getAppStandbyBucket()
            long r0 = (long) r0
        L_0x0059:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A06 = r0
        L_0x005f:
            X.2Xv r0 = r13.A06
            boolean r0 = r0.A00()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A00 = r0
            X.5ha r1 = r13.A0B
            long r3 = r1.A02
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x009d
            long r7 = r1.A01
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x009d
            long r7 = r7 - r3
            long r9 = r1.A03
            long r11 = r1.A04
            X.5SN r6 = new X.5SN
            r6.<init>(r7, r9, r11)
            long r0 = r6.A02
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0A = r0
            long r0 = r6.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A08 = r0
            long r0 = r6.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A07 = r0
        L_0x009d:
            long r0 = r13.A02
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0B = r0
            long r0 = r13.A03
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0C = r0
            X.4FV r0 = r13.A09
            r0.BhD(r2)
        L_0x00b2:
            r1 = 0
            r13.A01 = r1
            r13.A04 = r1
            r0 = -1
            r13.A00 = r0
            r0 = 0
            r13.A05 = r0
            r13.A02 = r1
            r13.A03 = r1
            return
        L_0x00c3:
            r0 = -1
            goto L_0x0059
        L_0x00c6:
            r0 = 1
            goto L_0x00f7
        L_0x00c8:
            r0 = 2
            goto L_0x00f7
        L_0x00ca:
            r0 = 3
            goto L_0x00f7
        L_0x00cc:
            r0 = 4
            goto L_0x00f7
        L_0x00ce:
            r0 = 5
            goto L_0x00f7
        L_0x00d0:
            r0 = 6
            goto L_0x00f7
        L_0x00d2:
            r0 = 7
            goto L_0x00f7
        L_0x00d4:
            r0 = 8
            goto L_0x00f7
        L_0x00d7:
            r0 = 9
            goto L_0x00f7
        L_0x00da:
            r0 = 10
            goto L_0x00f7
        L_0x00dd:
            r0 = 11
            goto L_0x00f7
        L_0x00e0:
            r0 = 12
            goto L_0x00f7
        L_0x00e3:
            r0 = 13
            goto L_0x00f7
        L_0x00e6:
            r0 = 14
            goto L_0x00f7
        L_0x00e9:
            r0 = 15
            goto L_0x00f7
        L_0x00ec:
            r0 = 16
            goto L_0x00f7
        L_0x00ef:
            r0 = 17
            goto L_0x00f7
        L_0x00f2:
            r0 = 18
            goto L_0x00f7
        L_0x00f5:
            r0 = 19
        L_0x00f7:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61042zc.A00(X.2zc, int):void");
    }

    public final void A01() {
        this.A04 = SystemClock.uptimeMillis();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
        if (r1 != -1) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0089, code lost:
        if (r1 == 7) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(int r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "XmppLogoutLogging/Logout with reason: "
            X.C18260x0.A0w(r0, r1, r8)
            X.5ha r6 = r7.A0C
            long r3 = r6.A01
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x002b
            long r2 = android.os.SystemClock.uptimeMillis()
            r6.A01 = r2
            long r4 = r6.A02
            long r0 = r6.A00
            long r4 = java.lang.Math.max(r4, r0)
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x008c
            long r0 = r6.A04
            long r2 = r2 - r4
            long r0 = r0 + r2
            r6.A04 = r0
        L_0x002b:
            r0 = 1
            if (r8 == r0) goto L_0x0086
            r0 = 3
            r5 = -1
            if (r8 == r0) goto L_0x0071
            r0 = 4
            if (r8 != r0) goto L_0x004e
            long r3 = r7.A01
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0049
            long r3 = X.C18310x6.A0A(r3)
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0049
            r8 = 18
        L_0x0049:
            int r1 = r7.A00
            if (r1 == r5) goto L_0x004e
        L_0x004d:
            r8 = r1
        L_0x004e:
            r7.A00 = r8
            X.66R r3 = r7.A0D
            android.os.Handler r2 = X.AnonymousClass0x9.A0A(r3)
            X.66R r1 = r7.A0E
            java.lang.Object r0 = r1.getValue()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r2.removeCallbacks(r0)
            android.os.Handler r3 = X.AnonymousClass0x9.A0A(r3)
            java.lang.Object r2 = r1.getValue()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x0071:
            long r3 = r7.A04
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0049
            long r3 = X.C18310x6.A0A(r3)
            r1 = 12000(0x2ee0, double:5.929E-320)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0049
            r8 = 19
            goto L_0x0049
        L_0x0086:
            int r1 = r7.A00
            r0 = 7
            if (r1 != r0) goto L_0x004e
            goto L_0x004d
        L_0x008c:
            long r0 = r6.A03
            long r2 = r2 - r4
            long r0 = r0 + r2
            r6.A03 = r0
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61042zc.A02(int):void");
    }
}
