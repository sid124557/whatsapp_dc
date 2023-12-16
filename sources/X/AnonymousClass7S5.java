package X;

import java.util.List;

/* renamed from: X.7S5  reason: invalid class name */
public final class AnonymousClass7S5 {
    public final List A00;
    public final C185598tw[] A01;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        if ("application/cea-708".equals(r7) != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C187028wK r9, X.C151897Ws r10) {
        /*
            r8 = this;
            r5 = 0
        L_0x0001:
            X.8tw[] r4 = r8.A01
            int r0 = r4.length
            if (r5 >= r0) goto L_0x0069
            r10.A02()
            r10.A03()
            int r1 = r10.A00
            r0 = 3
            X.8tw r3 = r9.Br0(r1, r0)
            java.util.List r0 = r8.A00
            java.lang.Object r6 = r0.get(r5)
            X.7yp r6 = (X.C166527yp) r6
            java.lang.String r7 = r6.A0T
            java.lang.String r0 = "application/cea-608"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r0.equals(r7)
            r2 = 0
            if (r0 == 0) goto L_0x002f
        L_0x002e:
            r2 = 1
        L_0x002f:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid closed caption mime type provided: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r7, r1)
            if (r2 == 0) goto L_0x0064
            java.lang.String r0 = r6.A0Q
            if (r0 != 0) goto L_0x0044
            r10.A03()
            java.lang.String r0 = r10.A01
        L_0x0044:
            X.7he r1 = X.C157057he.A00()
            r1.A0O = r0
            r1.A0R = r7
            int r0 = r6.A0G
            r1.A0E = r0
            java.lang.String r0 = r6.A0S
            r1.A0Q = r0
            int r0 = r6.A03
            r1.A02 = r0
            java.util.List r0 = r6.A0U
            r1.A0S = r0
            X.C166527yp.A01(r1, r3)
            r4[r5] = r3
            int r5 = r5 + 1
            goto L_0x0001
        L_0x0064:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass6C7.A0U(r0)
            throw r0
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7S5.A00(X.8wK, X.7Ws):void");
    }

    public AnonymousClass7S5(List list) {
        this.A00 = list;
        this.A01 = new C185598tw[list.size()];
    }
}
