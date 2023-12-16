package X;

/* renamed from: X.3ap  reason: invalid class name and case insensitive filesystem */
public class C70643ap implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public final int A05;

    public C70643ap(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z) {
        this.A05 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A04 = z;
        this.A02 = obj3;
        this.A03 = obj4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.A05
            switch(r0) {
                case 0: goto L_0x0098;
                case 1: goto L_0x0069;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x0135;
                case 5: goto L_0x014b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r7 = r11.A00
            X.2dK r7 = (X.C47482dK) r7
            java.lang.Object r0 = r11.A01
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Object r6 = r11.A02
            X.4uZ r6 = (X.C95814uZ) r6
            java.lang.Object r5 = r11.A03
            X.8Sy r5 = (X.C174098Sy) r5
            boolean r4 = r11.A04
            java.util.Iterator r10 = r0.iterator()
        L_0x001b:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00ef
            java.lang.Object r3 = r10.next()
            X.1fL r3 = (X.C28011fL) r3
            X.8Nf r9 = r5.iterator()
        L_0x002b:
            r8 = 0
        L_0x002c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0050
            com.whatsapp.jid.DeviceJid r0 = X.AnonymousClass0x7.A0R(r9)
            java.lang.String r1 = r3.getRawString()
            X.2ov r0 = X.AnonymousClass36G.A02(r0)
            X.2oh r2 = new X.2oh
            r2.<init>(r0, r1)
            X.33n r1 = r7.A06
            r0 = 0
            boolean r0 = r1.A0c(r2, r0)
            if (r0 != 0) goto L_0x004e
            if (r8 == 0) goto L_0x002b
        L_0x004e:
            r8 = 1
            goto L_0x002c
        L_0x0050:
            if (r8 == 0) goto L_0x001b
            if (r4 != 0) goto L_0x001b
            X.36E r2 = r7.A01
            X.2sr r0 = r7.A00
            boolean r1 = r0.A0a(r6)
            r0 = 8
            if (r1 == 0) goto L_0x0061
            r0 = 7
        L_0x0061:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0I(r3, r0)
            goto L_0x001b
        L_0x0069:
            java.lang.Object r5 = r11.A00
            X.3Lv r5 = (X.C66543Lv) r5
            java.lang.Object r4 = r11.A01
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r3 = r11.A04
            java.lang.Object r2 = r11.A02
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r1 = r11.A03
            java.util.Set r1 = (java.util.Set) r1
            X.1io r0 = r5.A14
            if (r3 != 0) goto L_0x0080
            r2 = 0
        L_0x0080:
            r0.A0F(r4, r2)
            java.util.Iterator r3 = r1.iterator()
        L_0x0087:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00ef
            X.4uZ r2 = X.C18300x5.A0P(r3)
            X.1hu r1 = r5.A0U
            r0 = 0
            r1.A0A(r2, r0)
            goto L_0x0087
        L_0x0098:
            java.lang.Object r5 = r11.A00
            X.3ZF r5 = (X.AnonymousClass3ZF) r5
            boolean r8 = r11.A04
            java.lang.Object r3 = r11.A01
            X.34o r3 = (X.C623234o) r3
            java.lang.Object r4 = r11.A02
            X.4uZ r4 = (X.C95814uZ) r4
            java.lang.Object r2 = r11.A03
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r7 = 0
            r0 = 3
            X.C162457s7.A0J(r4, r0)
            X.39J r1 = r5.A0E
            java.lang.String r0 = r1.A02
            java.lang.String r6 = X.C627436k.A07(r0)
            X.C162457s7.A0D(r6)
            if (r8 == 0) goto L_0x011b
            com.whatsapp.jid.GroupJid r1 = r5.A05
            boolean r0 = X.AnonymousClass000.A1W(r1)
            r4 = 0
            if (r0 != 0) goto L_0x00ed
            if (r1 != 0) goto L_0x00ef
            boolean r0 = r5.A0L()
            if (r0 == 0) goto L_0x00ef
            X.5Xv r0 = r3.A01
            android.content.SharedPreferences r2 = r0.A03()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ad_hoc_call_invitor_"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r6, r1)
            java.lang.String r0 = X.C18280x3.A0Z(r2, r0)
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A08(r0)
            if (r1 != 0) goto L_0x00f0
            com.whatsapp.jid.DeviceJid r0 = r5.A0C
            if (r0 == 0) goto L_0x00ef
            com.whatsapp.jid.UserJid r1 = r0.userJid
        L_0x00ed:
            if (r1 != 0) goto L_0x00f0
        L_0x00ef:
            return
        L_0x00f0:
            X.2qz r0 = r3.A09
            X.34x r2 = X.C55832qz.A01(r1, r0, r6, r7)
            X.1mO r2 = (X.C30401mO) r2
            if (r2 == 0) goto L_0x0103
            X.2z0 r0 = r2.A1J
            X.C162457s7.A0C(r0)
            X.34x r4 = r2.Az3(r0)
        L_0x0103:
            boolean r0 = r4 instanceof X.C30401mO
            if (r0 == 0) goto L_0x00ef
            X.1mO r4 = (X.C30401mO) r4
            if (r4 == 0) goto L_0x00ef
            r4.A01 = r5
            long r0 = r2.A1L
            r4.A1L = r0
            long r0 = r2.A1M
            r4.A1M = r0
            X.3Lv r0 = r3.A06
            r0.A0Y(r4)
            return
        L_0x011b:
            if (r2 == 0) goto L_0x0132
            boolean r0 = r2.booleanValue()
        L_0x0121:
            X.2z0 r2 = X.AnonymousClass2z0.A05(r4, r6, r0)
            X.2dw r0 = r3.A02
            X.1mO r1 = new X.1mO
            r1.<init>((X.C47852dw) r0, (X.AnonymousClass2z0) r2, (X.AnonymousClass3ZF) r5)
            X.3Lv r0 = r3.A06
            r0.A0V(r1)
            return
        L_0x0132:
            boolean r0 = r1.A03
            goto L_0x0121
        L_0x0135:
            java.lang.Object r4 = r11.A00
            X.3Lq r4 = (X.C66493Lq) r4
            java.lang.Object r3 = r11.A01
            X.39T r3 = (X.AnonymousClass39T) r3
            java.lang.Object r2 = r11.A02
            X.1fJ r2 = (X.C27991fJ) r2
            boolean r1 = r11.A04
            java.lang.Object r0 = r11.A03
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            r4.A0L(r0, r2, r3, r1)
            return
        L_0x014b:
            java.lang.Object r7 = r11.A00
            X.33d r7 = (X.C620133d) r7
            java.lang.Object r6 = r11.A01
            X.2sk r6 = (X.C56902sk) r6
            java.lang.Object r5 = r11.A02
            X.1mV r5 = (X.C30471mV) r5
            java.lang.Object r4 = r11.A03
            X.2dc r4 = (X.C47662dc) r4
            boolean r3 = r11.A04
            r0 = 0
            r7.A09(r6, r4, r5, r0)
            X.2eP r2 = r7.A0P
            X.33C r1 = r5.A01
            java.lang.String r0 = r4.A0H
            r2.A01(r1, r0)
            X.35m r0 = r6.A01()
            X.C626936e.A06(r0)
            X.35m r0 = r6.A01()
            int r0 = r0.A01
            r7.A0D(r5, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70643ap.run():void");
    }
}
