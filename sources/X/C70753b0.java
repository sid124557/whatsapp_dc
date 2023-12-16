package X;

/* renamed from: X.3b0  reason: invalid class name and case insensitive filesystem */
public class C70753b0 implements Runnable {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public Object A04;
    public Object A05;
    public final int A06;

    public C70753b0(Object obj, Object obj2, int i, int i2, int i3, int i4, long j) {
        this.A06 = i4;
        this.A04 = obj;
        this.A05 = obj2;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fb, code lost:
        if (r3 != false) goto L_0x00fd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            int r0 = r12.A06
            if (r0 == 0) goto L_0x016f
            java.lang.Object r6 = r12.A04
            X.2oJ r6 = (X.C54182oJ) r6
            int r5 = r12.A00
            long r0 = r12.A03
            java.lang.Object r4 = r12.A05
            X.4uZ r4 = (X.C95814uZ) r4
            int r8 = r12.A01
            int r3 = r12.A02
            X.1as r2 = new X.1as
            r2.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r2.A05 = r7
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A08 = r0
            r7 = 3
            if (r5 != r7) goto L_0x0035
            if (r4 == 0) goto L_0x0035
            boolean r0 = r4 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0144
            r0 = 1
        L_0x002f:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
        L_0x0033:
            r2.A04 = r9
        L_0x0035:
            if (r8 <= 0) goto L_0x0046
            long r0 = (long) r8
            r9 = 32
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 > 0) goto L_0x0040
            r0 = 32
        L_0x0040:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A07 = r0
        L_0x0046:
            if (r3 <= 0) goto L_0x0061
            long r0 = (long) r3
            r9 = 32
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 > 0) goto L_0x0051
            r0 = 32
        L_0x0051:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A06 = r0
            int r0 = X.AnonymousClass36M.A00(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A03 = r0
        L_0x0061:
            com.whatsapp.jid.GroupJid r1 = X.AnonymousClass32V.A00(r4)
            r3 = 0
            if (r1 == 0) goto L_0x007d
            X.3Ex r0 = r6.A06
            X.3ZH r0 = r0.A09(r1)
            if (r0 == 0) goto L_0x007d
            boolean r0 = r0.A0k
            if (r0 == 0) goto L_0x007d
            X.2ss r0 = r6.A09
            boolean r0 = r0.A0O(r1)
            if (r0 == 0) goto L_0x007d
            r3 = 1
        L_0x007d:
            boolean r1 = X.C627336j.A0L(r4)
            r8 = 1
            if (r5 == r7) goto L_0x00f8
            r0 = 8
            if (r5 == r0) goto L_0x00f3
            r0 = 10
            if (r5 != r0) goto L_0x0092
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
        L_0x0090:
            r2.A00 = r0
        L_0x0092:
            java.lang.Integer r0 = r2.A05
            int r1 = r0.intValue()
            r0 = 12
            X.4FV r3 = r6.A0D
            if (r1 != r0) goto L_0x00ef
            X.5ZC r0 = new X.5ZC
            r0.<init>(r8, r8)
            r3.BhC(r2, r0)
        L_0x00a6:
            X.1Wo r2 = new X.1Wo
            r2.<init>()
            X.1im r0 = r6.A05
            int r1 = r0.A04
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A00 = r0
            r3.BhD(r2)
            X.1VX r2 = r6.A0C
            r1 = 305(0x131, float:4.27E-43)
            X.2vE r0 = X.C58422vE.A02
            int r0 = r2.A0O(r0, r1)
            r3.Bn6(r0)
            boolean r0 = r3.BIV()
            if (r0 == 0) goto L_0x00ee
            X.1Xk r2 = new X.1Xk
            r2.<init>()
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.A00 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r2.A01 = r0
            r3.BhD(r2)
            X.1Vs r0 = new X.1Vs
            r0.<init>()
            r3.BhD(r0)
        L_0x00ee:
            return
        L_0x00ef:
            r3.BhD(r2)
            goto L_0x00a6
        L_0x00f3:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            goto L_0x0090
        L_0x00f8:
            if (r1 != 0) goto L_0x00fd
            r0 = 0
            if (r3 == 0) goto L_0x00fe
        L_0x00fd:
            r0 = 1
        L_0x00fe:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A00 = r0
            if (r4 == 0) goto L_0x012f
            X.5rC r1 = r6.A00
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x012f
            java.lang.Object r0 = r1.A04()
            X.2sS r0 = (X.C56722sS) r0
            X.2m4 r0 = r0.A01
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x012f
            java.lang.Object r3 = r1.A04()
            X.2sS r3 = (X.C56722sS) r3
            r1 = 0
            boolean r0 = X.C155477ey.A00(r4)
            if (r0 == 0) goto L_0x013f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x012d:
            r2.A01 = r0
        L_0x012f:
            X.36E r0 = r6.A03
            int r0 = r0.A08(r4)
            if (r0 == 0) goto L_0x0092
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A02 = r0
            goto L_0x0092
        L_0x013f:
            r3.A02(r4)
            r0 = 0
            goto L_0x012d
        L_0x0144:
            boolean r0 = r4 instanceof X.C27991fJ
            r9 = 0
            if (r0 == 0) goto L_0x0168
            X.2ss r1 = r6.A09
            r0 = r4
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            int r1 = r1.A07(r0)
            if (r1 != r7) goto L_0x0157
            r0 = 4
            goto L_0x002f
        L_0x0157:
            r0 = 2
            if (r1 == r0) goto L_0x0162
            r0 = 6
            if (r1 == r0) goto L_0x0162
            if (r1 != 0) goto L_0x0033
            r0 = 2
            goto L_0x002f
        L_0x0162:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            goto L_0x0033
        L_0x0168:
            boolean r0 = r4 instanceof X.C95804uY
            if (r0 == 0) goto L_0x0033
            r0 = 5
            goto L_0x002f
        L_0x016f:
            java.lang.Object r5 = r12.A04
            X.2vp r5 = (X.C58792vp) r5
            java.lang.Object r4 = r12.A05
            X.2Ol r4 = (X.C42512Ol) r4
            int r6 = r12.A00
            int r7 = r12.A01
            int r0 = r12.A02
            short r8 = (short) r0
            long r9 = r12.A03
            java.util.HashMap r2 = X.AnonymousClass001.A0t()
            java.lang.String r1 = r5.A03
            if (r1 == 0) goto L_0x018d
            java.lang.String r0 = "direct_connection_status"
            r2.put(r0, r1)
        L_0x018d:
            java.lang.String r1 = r5.A01
            if (r1 == 0) goto L_0x0196
            java.lang.String r0 = "biz_id"
            r2.put(r0, r1)
        L_0x0196:
            java.lang.String r1 = r5.A02
            if (r1 == 0) goto L_0x019f
            java.lang.String r0 = "biz_type"
            r2.put(r0, r1)
        L_0x019f:
            java.lang.String r1 = r5.A04
            if (r1 == 0) goto L_0x01a9
            java.lang.String r0 = "server_origin"
            r2.put(r0, r1)
        L_0x01a9:
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r2)
            X.C162457s7.A0D(r0)
            java.util.Iterator r3 = X.AnonymousClass0x9.A16(r0)
        L_0x01b4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01cc
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r3)
            X.8JP r2 = r4.A00
            java.lang.String r1 = X.C18310x6.A0q(r0)
            java.lang.String r0 = X.AnonymousClass0x9.A12(r0)
            r2.markerAnnotate((int) r6, (int) r7, (java.lang.String) r1, (java.lang.String) r0)
            goto L_0x01b4
        L_0x01cc:
            java.util.HashMap r2 = X.AnonymousClass001.A0t()
            java.lang.Boolean r0 = r5.A00
            if (r0 == 0) goto L_0x01e1
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01e1
            java.lang.String r1 = "cached"
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.put(r1, r0)
        L_0x01e1:
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r2)
            X.C162457s7.A0D(r0)
            java.util.Iterator r3 = X.AnonymousClass0x9.A16(r0)
        L_0x01ec:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0208
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r3)
            X.8JP r2 = r4.A00
            java.lang.String r1 = X.C18310x6.A0q(r0)
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            r2.markerAnnotate((int) r6, (int) r7, (java.lang.String) r1, (boolean) r0)
            goto L_0x01ec
        L_0x0208:
            X.8JP r5 = r4.A00
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS
            r5.markerEnd(r6, r7, r8, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70753b0.run():void");
    }
}
