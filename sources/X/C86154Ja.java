package X;

/* renamed from: X.4Ja  reason: invalid class name and case insensitive filesystem */
public class C86154Ja implements C83884Ae {
    public Object A00;
    public final int A01;

    public C86154Ja(C618132i r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01eb, code lost:
        if (r0 != false) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01fd, code lost:
        if (r0 != false) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0175, code lost:
        if (X.AnonymousClass36O.A06(r1) != false) goto L_0x0177;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean AxF(X.AnonymousClass33C r8, X.C30471mV r9, java.lang.Object r10) {
        /*
            r7 = this;
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x01be;
                case 1: goto L_0x01b2;
                case 2: goto L_0x0151;
                case 3: goto L_0x0077;
                case 4: goto L_0x002b;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.2QF r10 = (X.AnonymousClass2QF) r10
            X.2qb r0 = r9.A0l
            if (r0 != 0) goto L_0x0013
            X.2qb r0 = new X.2qb
            r0.<init>()
            r9.A1W(r0)
        L_0x0013:
            X.2qb r2 = r9.A0l
            byte[] r0 = r10.A02
            r2.A0B = r0
            android.util.Pair r1 = r10.A01
            if (r1 == 0) goto L_0x0029
            int r0 = X.C18280x3.A03(r1)
            r2.A01 = r0
            int r0 = X.C18290x4.A03(r1)
            r2.A00 = r0
        L_0x0029:
            r0 = 1
            return r0
        L_0x002b:
            java.lang.Object r4 = r7.A00
            X.32i r4 = (X.C618132i) r4
            X.7Oi r10 = (X.C149897Oi) r10
            X.2sV r1 = r10.A02
            r4.A02(r8, r1, r9)
            int r3 = r10.A00
            if (r3 != 0) goto L_0x0065
            java.lang.String r0 = r1.A07()
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = r1.A07()
            r9.A07 = r0
        L_0x0046:
            java.lang.String r0 = r1.A03()
            if (r0 == 0) goto L_0x0059
            X.2WV r2 = r4.A04
            java.lang.String r1 = r1.A03()
            r0 = 1
            java.lang.String r0 = r2.A00(r1, r0)
            r8.A0G = r0
        L_0x0059:
            X.1VX r0 = r4.A02
            boolean r0 = X.C154357d2.A01(r0, r3)
            if (r0 != 0) goto L_0x0029
            r0 = 0
            r8.A0M = r0
            goto L_0x0029
        L_0x0065:
            r0 = 12
            if (r3 != r0) goto L_0x0059
            X.30d r0 = r9.A1v()
            if (r0 == 0) goto L_0x0059
            X.30d r0 = r9.A1v()
            r0.A01()
            goto L_0x0059
        L_0x0077:
            java.lang.Object r3 = r7.A00
            X.32i r3 = (X.C618132i) r3
            X.7N0 r10 = (X.AnonymousClass7N0) r10
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x0145
            java.lang.String r0 = r9.A1x()
            r2 = 0
            if (r0 == 0) goto L_0x0098
            android.net.Uri r1 = android.net.Uri.parse(r0)
            if (r1 == 0) goto L_0x0098
            boolean r0 = r1.isAbsolute()
            if (r0 == 0) goto L_0x0098
            java.io.File r2 = X.C627536m.A04(r1)
        L_0x0098:
            java.io.File r4 = r10.A00
            X.C626936e.A06(r4)
            boolean r0 = r10 instanceof X.C135506km
            if (r0 != 0) goto L_0x00a7
            java.lang.String r0 = r4.getName()
            r9.A06 = r0
        L_0x00a7:
            long r0 = r4.length()
            r8.A0A = r0
            r9.A00 = r0
            r8.A0F = r4
            X.30w r0 = r9.A0y()
            if (r0 == 0) goto L_0x00c7
            byte[] r1 = r10.A03
            if (r1 == 0) goto L_0x00c7
            X.30w r0 = r9.A0y()
            r0.A03(r1)
            X.1sV r0 = r3.A07
            r0.A0G(r9)
        L_0x00c7:
            r6 = 1
            r8.A0Q = r6
            r8.A0M = r6
            boolean r0 = r10 instanceof X.C135546kq
            if (r0 == 0) goto L_0x00fa
            r1 = r10
            X.6kq r1 = (X.C135546kq) r1
            int r0 = r1.A02
            r8.A06 = r0
            int r0 = r1.A03
            r8.A08 = r0
            int r0 = r1.A00
            r8.A02 = r0
            int r0 = r1.A01
            r8.A03 = r0
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x0110
            int[] r5 = r1.A05
            int r0 = r5.length
            if (r0 <= 0) goto L_0x0110
            X.30d r1 = r9.A1v()
            X.C626936e.A06(r1)
            monitor-enter(r1)
            r1.A03 = r5     // Catch:{ all -> 0x0239 }
            r1.A01 = r6     // Catch:{ all -> 0x0239 }
            monitor-exit(r1)
            goto L_0x0110
        L_0x00fa:
            boolean r0 = r10 instanceof X.C135526ko
            if (r0 == 0) goto L_0x0123
            r1 = r10
            X.6ko r1 = (X.C135526ko) r1
            int r0 = r1.A00
            r9.A0B = r0
            boolean r1 = r1.A01
            r0 = 0
            if (r1 == 0) goto L_0x010e
            r9.A04 = r0
            r9.A03 = r0
        L_0x010e:
            r8.A0H = r0
        L_0x0110:
            java.lang.String r0 = r10.A01
            r9.A09 = r0
            if (r2 == 0) goto L_0x0029
            boolean r0 = r2.equals(r4)
            if (r0 != 0) goto L_0x0029
            X.53r r0 = r3.A06
            r0.A0J(r2)
            goto L_0x0029
        L_0x0123:
            boolean r0 = r10 instanceof X.C135536kp
            if (r0 == 0) goto L_0x0110
            r1 = r10
            X.6kp r1 = (X.C135536kp) r1
            java.lang.String r0 = r1.A02
            r9.A04 = r0
            r0 = 0
            r9.A03 = r0
            int r0 = r1.A00
            if (r0 <= 0) goto L_0x0137
            r8.A04 = r0
        L_0x0137:
            java.lang.Boolean r0 = r1.A01
            if (r0 == 0) goto L_0x0110
            r1 = r9
            X.1nE r1 = (X.AnonymousClass1nE) r1
            boolean r0 = r0.booleanValue()
            r1.A02 = r0
            goto L_0x0110
        L_0x0145:
            r0 = 0
            r8.A0c = r0
            r9.A1A()
            r8.A0M = r0
            r8.A0Q = r0
            goto L_0x0029
        L_0x0151:
            java.lang.Object r4 = r7.A00
            X.32i r4 = (X.C618132i) r4
            X.2QF r10 = (X.AnonymousClass2QF) r10
            X.38t r1 = X.AnonymousClass36O.A02(r9)
            X.30w r3 = r9.A0y()
            if (r3 == 0) goto L_0x017b
            byte[] r2 = r10.A02
            if (r2 == 0) goto L_0x017b
            X.3My r0 = r4.A03
            r0.A00(r3)
            boolean r0 = X.C106695a0.A03(r1)
            if (r0 != 0) goto L_0x0177
            boolean r1 = X.AnonymousClass36O.A06(r1)
            r0 = 0
            if (r1 == 0) goto L_0x0178
        L_0x0177:
            r0 = 1
        L_0x0178:
            r3.A04(r2, r0)
        L_0x017b:
            android.util.Pair r1 = r10.A01
            if (r1 == 0) goto L_0x018b
            int r0 = X.C18280x3.A03(r1)
            r8.A08 = r0
            int r0 = X.C18290x4.A03(r1)
            r8.A06 = r0
        L_0x018b:
            android.util.Pair r1 = r10.A00
            if (r1 == 0) goto L_0x019b
            int r0 = X.C18280x3.A03(r1)
            r8.A02 = r0
            int r0 = X.C18290x4.A03(r1)
            r8.A03 = r0
        L_0x019b:
            byte[] r3 = r10.A03
            if (r3 == 0) goto L_0x0029
            boolean r0 = r9 instanceof X.AnonymousClass1nE
            if (r0 == 0) goto L_0x0029
            r2 = r9
            X.1nE r2 = (X.AnonymousClass1nE) r2
            X.2qp r1 = r4.A05
            java.lang.String r0 = r9.A05
            X.330 r0 = r1.A03(r0, r3)
            r2.A04 = r0
            goto L_0x0029
        L_0x01b2:
            r0 = 1
            r9.A1G(r0)
            r8.A0c = r0
            r0 = 0
            r8.A0C = r0
            goto L_0x0029
        L_0x01be:
            java.lang.Object r6 = r7.A00
            X.32i r6 = (X.C618132i) r6
            X.7Oi r10 = (X.C149897Oi) r10
            X.1VX r4 = r6.A02
            boolean r0 = X.AnonymousClass2z0.A0B(r9)
            boolean r0 = X.C624234y.A03(r4, r9, r0)
            r5 = 1
            if (r0 == 0) goto L_0x0029
            X.2sV r3 = r10.A02
            X.2qb r0 = r9.A0l
            if (r0 != 0) goto L_0x01df
            X.2qb r0 = new X.2qb
            r0.<init>()
            r9.A1W(r0)
        L_0x01df:
            X.2qb r2 = r9.A0l
            java.lang.String r0 = r3.A05()
            if (r0 != 0) goto L_0x01ed
            monitor-enter(r3)
            boolean r0 = r3.A0G     // Catch:{ all -> 0x023c }
            monitor-exit(r3)
            if (r0 == 0) goto L_0x01f3
        L_0x01ed:
            java.lang.String r0 = r3.A05()
            r2.A05 = r0
        L_0x01f3:
            java.lang.String r0 = r3.A06()
            if (r0 != 0) goto L_0x01ff
            monitor-enter(r3)
            boolean r0 = r3.A0H     // Catch:{ all -> 0x023c }
            monitor-exit(r3)
            if (r0 == 0) goto L_0x0205
        L_0x01ff:
            java.lang.String r0 = r3.A06()
            r2.A08 = r0
        L_0x0205:
            X.32B r0 = r3.A00()
            if (r0 == 0) goto L_0x021b
            X.32B r0 = r3.A00()
            byte[] r0 = r0.A01
            r2.A0A = r0
            X.32B r0 = r3.A00()
            long r0 = r0.A00
            r2.A02 = r0
        L_0x021b:
            int r0 = r10.A00
            if (r0 != 0) goto L_0x0231
            java.lang.String r0 = r3.A03()
            if (r0 == 0) goto L_0x0231
            X.2WV r1 = r6.A04
            java.lang.String r0 = r3.A03()
            java.lang.String r0 = r1.A00(r0, r5)
            r2.A04 = r0
        L_0x0231:
            boolean r0 = X.C624234y.A02(r4, r9)
            r2.A0C = r0
            goto L_0x0029
        L_0x0239:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x023c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86154Ja.AxF(X.33C, X.1mV, java.lang.Object):boolean");
    }
}
