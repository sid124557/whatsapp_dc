package X;

/* renamed from: X.9WS  reason: invalid class name */
public class AnonymousClass9WS implements C202439m1 {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass9WS(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c2, code lost:
        r0.A00(r1, (X.AnonymousClass34V) null, (java.util.ArrayList) null, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0135, code lost:
        r2.A00(r3, (X.AnonymousClass34V) null, (java.util.ArrayList) null, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0139, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0180, code lost:
        r2.A01(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0183, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BMJ(java.util.List r7) {
        /*
            r6 = this;
            int r0 = r6.A02
            switch(r0) {
                case 0: goto L_0x001c;
                case 1: goto L_0x00a1;
                case 2: goto L_0x00b2;
                case 3: goto L_0x00c8;
                case 4: goto L_0x00de;
                case 5: goto L_0x00ea;
                case 6: goto L_0x00f6;
                case 7: goto L_0x0103;
                case 8: goto L_0x0116;
                case 9: goto L_0x0126;
                case 10: goto L_0x013a;
                case 11: goto L_0x0149;
                case 12: goto L_0x015c;
                case 13: goto L_0x016b;
                case 14: goto L_0x0176;
                case 15: goto L_0x007b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r6.A00
            X.9bx r0 = (X.C196919bx) r0
            java.lang.Object r1 = r6.A01
            X.6hr r1 = (X.C133736hr) r1
            com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity r2 = r0.A00
            r2.A08 = r1
            X.9Ty r0 = r2.A0C
            android.content.Intent r1 = r0.A00(r2, r1)
            r0 = 1
            r2.BpY(r1, r0)
        L_0x001b:
            return
        L_0x001c:
            java.lang.Object r2 = r6.A00
            X.9QG r2 = (X.AnonymousClass9QG) r2
            java.lang.Object r5 = r6.A01
            X.36K r5 = (X.AnonymousClass36K) r5
            int r1 = r7.size()
            r0 = 1
            if (r1 != r0) goto L_0x001b
            java.lang.Object r3 = X.C18290x4.A0k(r7)
            X.7yw r3 = (X.C166587yw) r3
            X.C626936e.A06(r3)
            java.lang.String r4 = r3.A0A
            X.1iX r0 = r2.A07
            r0.A08(r3, r5)
            X.9U4 r0 = r2.A0D
            X.9oC r0 = r0.A0G()
            X.9Ri r0 = r0.BB2()
            if (r0 == 0) goto L_0x0184
            int r1 = r3.A08()
            r0 = 1
            if (r1 == r0) goto L_0x0064
            r0 = 4
            if (r1 == r0) goto L_0x0064
            r0 = 5
            if (r1 == r0) goto L_0x005b
            r0 = 6
            if (r1 == r0) goto L_0x0064
            r0 = 7
            if (r1 == r0) goto L_0x0064
            return
        L_0x005b:
            X.6hx r0 = r3.A08
            X.99J r0 = (X.AnonymousClass99J) r0
            if (r0 == 0) goto L_0x001b
            java.lang.String r3 = r0.A04
            goto L_0x006c
        L_0x0064:
            X.6hx r0 = r3.A08
            X.99I r0 = (X.AnonymousClass99I) r0
            if (r0 == 0) goto L_0x001b
            java.lang.String r3 = r0.A05
        L_0x006c:
            if (r3 == 0) goto L_0x001b
            X.9Tb r2 = r2.A08
            X.4FS r1 = r2.A0A
            X.9j9 r0 = new X.9j9
            r0.<init>(r2, r4, r3)
            r1.BkM(r0)
            return
        L_0x007b:
            java.lang.Object r1 = r6.A00
            X.9qB r1 = (X.C204949qB) r1
            java.lang.Object r4 = r6.A01
            X.2m3 r4 = (X.C52792m3) r4
            int r0 = r7.size()
            if (r0 <= 0) goto L_0x001b
            java.lang.Object r0 = r1.A00
            com.whatsapp.payments.ui.BrazilPayBloksActivity r0 = (com.whatsapp.payments.ui.BrazilPayBloksActivity) r0
            X.9Ty r3 = r0.A0L
            java.lang.Object r2 = X.C18290x4.A0k(r7)
            X.6hr r2 = (X.C133736hr) r2
            r1 = -1
            r0 = 0
            java.util.HashMap r1 = r3.A04(r2, r0, r0, r1)
            java.lang.String r0 = "on_success"
            r4.A01(r0, r1)
            return
        L_0x00a1:
            java.lang.Object r0 = r6.A00
            X.9oT r0 = (X.C203889oT) r0
            java.lang.Object r1 = r6.A01
            X.6hr r1 = (X.C133736hr) r1
            java.lang.Object r0 = r0.A00
            X.9A3 r0 = (X.AnonymousClass9A3) r0
            X.9R4 r0 = r0.A0G
            r4 = 1
            r5 = 0
            goto L_0x00c2
        L_0x00b2:
            java.lang.Object r0 = r6.A00
            X.9oT r0 = (X.C203889oT) r0
            java.lang.Object r1 = r6.A01
            X.6hr r1 = (X.C133736hr) r1
            java.lang.Object r0 = r0.A00
            X.9A3 r0 = (X.AnonymousClass9A3) r0
            X.9R4 r0 = r0.A0G
            r4 = 0
            r5 = 1
        L_0x00c2:
            r2 = 0
            r3 = r2
            r0.A00(r1, r2, r3, r4, r5)
            return
        L_0x00c8:
            java.lang.Object r0 = r6.A00
            X.9oT r0 = (X.C203889oT) r0
            java.lang.Object r1 = r6.A01
            X.6hr r1 = (X.C133736hr) r1
            java.lang.Object r0 = r0.A00
            X.9A3 r0 = (X.AnonymousClass9A3) r0
            X.9R4 r0 = r0.A0G
            r4 = 0
            r2 = 0
            r3 = r2
            r5 = r4
            r0.A00(r1, r2, r3, r4, r5)
            return
        L_0x00de:
            java.lang.Object r1 = r6.A00
            X.9So r1 = (X.C194359So) r1
            java.lang.Object r0 = r6.A01
            X.6hr r0 = (X.C133736hr) r0
            r1.A01(r0)
            return
        L_0x00ea:
            java.lang.Object r1 = r6.A00
            X.9my r1 = (X.C203009my) r1
            java.lang.Object r0 = r6.A01
            X.6hr r0 = (X.C133736hr) r0
            r1.BOZ(r0)
            return
        L_0x00f6:
            java.lang.Object r2 = r6.A00
            X.9my r2 = (X.C203009my) r2
            java.lang.Object r1 = r6.A01
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r0 = 0
            r2.BaU(r0, r1)
            return
        L_0x0103:
            java.lang.Object r0 = r6.A00
            X.9oT r0 = (X.C203889oT) r0
            java.lang.Object r2 = r6.A01
            X.6ho r2 = (X.C133706ho) r2
            java.lang.Object r0 = r0.A00
            X.9Q6 r0 = (X.AnonymousClass9Q6) r0
            X.9Qi r1 = r0.A06
            r0 = 0
            r1.A00(r2, r0)
            return
        L_0x0116:
            java.lang.Object r0 = r6.A00
            X.9oT r0 = (X.C203889oT) r0
            java.lang.Object r3 = r6.A01
            X.6hr r3 = (X.C133736hr) r3
            java.lang.Object r0 = r0.A00
            X.9A0 r0 = (X.AnonymousClass9A0) r0
            X.9R3 r2 = r0.A09
            r1 = 1
            goto L_0x0135
        L_0x0126:
            java.lang.Object r0 = r6.A00
            X.9oT r0 = (X.C203889oT) r0
            java.lang.Object r3 = r6.A01
            X.6hr r3 = (X.C133736hr) r3
            java.lang.Object r0 = r0.A00
            X.9A0 r0 = (X.AnonymousClass9A0) r0
            X.9R3 r2 = r0.A09
            r1 = 0
        L_0x0135:
            r0 = 0
            r2.A00(r3, r0, r0, r1)
            return
        L_0x013a:
            java.lang.Object r0 = r6.A00
            X.9oT r0 = (X.C203889oT) r0
            java.lang.Object r0 = r0.A00
            X.9A1 r0 = (X.AnonymousClass9A1) r0
            X.9Qk r1 = r0.A07
            r0 = 0
            r1.A00(r0)
            return
        L_0x0149:
            java.lang.Object r0 = r6.A00
            X.9oT r0 = (X.C203889oT) r0
            java.lang.Object r2 = r6.A01
            X.6hr r2 = (X.C133736hr) r2
            java.lang.Object r0 = r0.A00
            X.9A5 r0 = (X.AnonymousClass9A5) r0
            X.9RK r1 = r0.A05
            r0 = 0
            r1.A00(r2, r0)
            return
        L_0x015c:
            java.lang.Object r0 = r6.A00
            X.9oT r0 = (X.C203889oT) r0
            java.lang.Object r0 = r0.A00
            X.9A4 r0 = (X.AnonymousClass9A4) r0
            X.9R5 r1 = r0.A04
            r0 = 0
            r1.A00(r0)
            return
        L_0x016b:
            java.lang.Object r2 = r6.A00
            X.2m3 r2 = (X.C52792m3) r2
            java.lang.Object r1 = r6.A01
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r0 = "on_failure"
            goto L_0x0180
        L_0x0176:
            java.lang.Object r2 = r6.A00
            X.2m3 r2 = (X.C52792m3) r2
            java.lang.Object r1 = r6.A01
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r0 = "on_success"
        L_0x0180:
            r2.A01(r0, r1)
            return
        L_0x0184:
            X.7oG r1 = r2.A0E
            java.lang.String r0 = "onRecvPaymentMethodUpdate: storeOrUpdatePaymentMethod failed"
            r1.A05(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9WS.BMJ(java.util.List):void");
    }
}
