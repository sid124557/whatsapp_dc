package X;

import com.whatsapp.bridge.wfal.WfalManager;

/* renamed from: X.1sl  reason: invalid class name and case insensitive filesystem */
public final class C33291sl extends AnonymousClass5ZM {
    public final WfalManager A00;
    public final C56612sH A01;
    public final C55202py A02;
    public final C48612fB A03;
    public final C55832qz A04;
    public final C55542qW A05;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00ac, code lost:
        X.AnonymousClass356.A01(r0);
        r1 = X.AnonymousClass001.A0o();
        r1.append("CrosspostSendUnsentSessionsTask/doInBackground sessionId: ");
        r1.append(r4);
        X.AnonymousClass356.A05(r1, " not eligible for retry, updating db");
        X.C162457s7.A0H(r4);
        r5.A00(r4);
        r7 = r6.A02;
        r4 = X.C73783g4.A0c(r2);
        r1 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d4, code lost:
        if (r1.hasNext() == false) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d6, code lost:
        X.C624134x.A0Z(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0164, code lost:
        r7.A04(r4, r3, 4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r17) {
        /*
            r16 = this;
            r6 = r16
            X.2fB r5 = r6.A03
            X.66R r0 = r5.A01
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            X.8OQ r0 = X.AnonymousClass8OQ.copyOf((java.util.Map) r0)
            X.C162457s7.A0D(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r15 = r0.iterator()
        L_0x001b:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x01a1
            java.util.Map$Entry r1 = X.AnonymousClass001.A0w(r15)
            java.lang.String r4 = X.C18310x6.A0q(r1)
            java.lang.Object r0 = r1.getValue()
            X.2k8 r0 = (X.C51632k8) r0
            java.util.Set r0 = r0.A01
            java.util.List r3 = X.C73723fy.A0F(r0)
            java.lang.Object r0 = r1.getValue()
            X.2k8 r0 = (X.C51632k8) r0
            java.util.LinkedHashSet r0 = r0.A00
            java.util.List r0 = X.C73723fy.A0F(r0)
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            java.util.Iterator r9 = r0.iterator()
        L_0x0049:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0081
            long r0 = X.C18270x1.A02(r9)
            X.2qz r7 = r6.A04
            X.34x r8 = X.C55122pp.A00(r7, r0)
            if (r8 == 0) goto L_0x0065
            boolean r7 = X.C627636p.A0l(r8)
            if (r7 != 0) goto L_0x0065
            r2.add(r8)
            goto L_0x0049
        L_0x0065:
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()
            java.lang.String r7 = "CrosspostSendUnsentSessionsTask/getMessageFromMessageRowIds encountered empty or revoked message: "
            r8.append(r7)
            r8.append(r0)
            java.lang.String r7 = ", skipping and retrying the rest"
            X.AnonymousClass356.A05(r8, r7)
            X.2py r7 = r6.A02
            java.util.List r1 = X.C18280x3.A0j(r0)
            r0 = 4
            r7.A04(r1, r3, r0)
            goto L_0x0049
        L_0x0081:
            r12 = 0
            java.util.Iterator r1 = r3.iterator()
        L_0x0086:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00da
            java.lang.Object r7 = r1.next()
            X.223 r7 = (X.AnonymousClass223) r7
            com.whatsapp.bridge.wfal.WfalManager r0 = r6.A00
            X.7yt r0 = r0.A01(r7)
            if (r0 != 0) goto L_0x0086
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CrosspostSendUnsentSessionsTask/session messages "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " invalid for retry due to account not linked: "
            java.lang.String r0 = X.AnonymousClass000.A0P(r7, r0, r1)
        L_0x00ac:
            X.AnonymousClass356.A01(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CrosspostSendUnsentSessionsTask/doInBackground sessionId: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " not eligible for retry, updating db"
            X.AnonymousClass356.A05(r1, r0)
            X.C162457s7.A0H(r4)
            r5.A00(r4)
            X.2py r7 = r6.A02
            java.util.ArrayList r4 = X.C73783g4.A0c(r2)
            java.util.Iterator r1 = r2.iterator()
        L_0x00d0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0164
            X.C624134x.A0Z(r4, r1)
            goto L_0x00d0
        L_0x00da:
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0112
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0112
        L_0x00e4:
            X.2py r0 = r6.A02
            java.util.List r11 = X.C626736a.A03(r0, r2, r3)
            X.2qW r7 = r6.A05
            X.C162457s7.A0H(r4)
            java.lang.StringBuilder r9 = X.C18280x3.A0g(r4, r12)
            java.lang.String r0 = "CrosspostRequestSessionManager/handleCrosspostRetry started for session: "
            r9.append(r0)
            r9.append(r4)
            java.lang.String r0 = " with messages: "
            r9.append(r0)
            java.util.ArrayList r8 = X.C73783g4.A0d(r2)
            java.util.Iterator r1 = r2.iterator()
        L_0x0108:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x016a
            X.C624134x.A0Z(r8, r1)
            goto L_0x0108
        L_0x0112:
            java.util.Iterator r14 = r2.iterator()
        L_0x0116:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x00e4
            X.34x r11 = X.C18300x5.A0T(r14)
            X.C162457s7.A0J(r11, r12)
            boolean r0 = X.C626736a.A07(r11)
            java.lang.String r13 = "CrosspostSendUnsentSessionsTask/message "
            if (r0 != 0) goto L_0x013f
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0l(r13)
            long r0 = r11.A1L
            r7.append(r0)
            java.lang.String r0 = " invalid for retry due to incompatible type: "
            X.C624134x.A0T(r11, r0, r7)
        L_0x0139:
            java.lang.String r0 = r7.toString()
            goto L_0x00ac
        L_0x013f:
            X.2sH r0 = r6.A01
            long r0 = X.C56612sH.A04(r0, r11)
            long r9 = java.lang.Math.abs(r0)
            r7 = 10800000(0xa4cb80, double:5.335909E-317)
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0116
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0l(r13)
            long r0 = r11.A1L
            r7.append(r0)
            java.lang.String r0 = " invalid for retry due to timestamp expiration: "
            r7.append(r0)
            long r0 = r11.A0K
            r7.append(r0)
            goto L_0x0139
        L_0x0164:
            r0 = 4
            r7.A04(r4, r3, r0)
            goto L_0x001b
        L_0x016a:
            java.lang.String r0 = X.AnonymousClass000.A0R(r8, r9)
            X.AnonymousClass356.A01(r0)
            X.8qC r0 = r7.A08
            java.lang.Object r0 = r0.get()
            X.2fB r0 = (X.C48612fB) r0
            r0.A00(r4)
            X.8qC r0 = r7.A05
            java.lang.Object r1 = r0.get()
            X.5Ng r1 = (X.C103515Ng) r1
            X.1vF r0 = new X.1vF
            r0.<init>(r1)
            X.3Xn r1 = new X.3Xn
            r1.<init>(r0, r7, r4, r2)
            X.8qC r0 = r7.A03
            java.lang.Object r7 = r0.get()
            X.2cz r7 = (X.C47272cz) r7
            r13 = 10
            r10 = r2
            r12 = r3
            r8 = r1
            r9 = r4
            r7.A00(r8, r9, r10, r11, r12, r13)
            goto L_0x001b
        L_0x01a1:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33291sl.A08(java.lang.Object[]):java.lang.Object");
    }

    public C33291sl(WfalManager wfalManager, C56612sH r2, C55202py r3, C48612fB r4, C55832qz r5, C55542qW r6) {
        this.A01 = r2;
        this.A04 = r5;
        this.A00 = wfalManager;
        this.A02 = r3;
        this.A05 = r6;
        this.A03 = r4;
    }
}
