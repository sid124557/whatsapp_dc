package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.7as  reason: invalid class name and case insensitive filesystem */
public class C153217as {
    public C162037r7 A00 = new C162037r7();

    public void A00(C176608dH r5) {
        C143406yp r1;
        try {
            C162037r7 r3 = this.A00;
            int i = r5.A00;
            if (i == 0) {
                Set<Object> set = r3.A04;
                C176308cn A0A = C176308cn.A0A(r5.A01);
                if (!set.isEmpty()) {
                    for (Object A0A2 : set) {
                        if (C176308cn.A0A(A0A2).equals(A0A)) {
                            r1 = new C143406yp("OtherName is from an excluded subtree.");
                        }
                    }
                    return;
                }
                return;
            } else if (i == 1) {
                Set set2 = r3.A02;
                String A02 = AnonymousClass8Q0.A02(r5);
                if (!set2.isEmpty()) {
                    Iterator it = set2.iterator();
                    while (it.hasNext()) {
                        if (r3.A09(A02, AnonymousClass001.A0m(it))) {
                            r1 = new C143406yp("Email address is from an excluded subtree.");
                        }
                    }
                    return;
                }
                return;
            } else if (i == 2) {
                Set set3 = r3.A01;
                String A022 = AnonymousClass8Q0.A02(r5);
                if (!set3.isEmpty()) {
                    Iterator it2 = set3.iterator();
                    while (it2.hasNext()) {
                        String A0m = AnonymousClass001.A0m(it2);
                        if (C162037r7.A03(A022, A0m) || A022.equalsIgnoreCase(A0m)) {
                            r1 = new C143406yp("DNS is from an excluded subtree.");
                        }
                    }
                    return;
                }
                return;
            } else if (i == 4) {
                r3.A07(C176618dI.A0B(r5.A01));
                return;
            } else if (i == 6) {
                Set set4 = r3.A05;
                String A023 = AnonymousClass8Q0.A02(r5);
                if (!set4.isEmpty()) {
                    Iterator it3 = set4.iterator();
                    while (it3.hasNext()) {
                        if (r3.A0A(A023, AnonymousClass001.A0m(it3))) {
                            r1 = new C143406yp("URI is from an excluded subtree.");
                        }
                    }
                    return;
                }
                return;
            } else if (i == 7) {
                Set<byte[]> set5 = r3.A03;
                byte[] A0C = C176778dY.A0C(r5.A01);
                if (!set5.isEmpty()) {
                    for (byte[] A05 : set5) {
                        if (C162037r7.A05(A0C, A05)) {
                            r1 = new C143406yp("IP is from an excluded subtree.");
                        }
                    }
                    return;
                }
                return;
            } else {
                return;
            }
            throw r1;
        } catch (C143406yp e) {
            throw new C143606zB(e.getMessage(), e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x008f A[Catch:{ 6yp -> 0x011b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C176608dH r6) {
        /*
            r5 = this;
            X.7r7 r4 = r5.A00     // Catch:{ 6yp -> 0x011b }
            int r1 = r6.A00     // Catch:{ 6yp -> 0x011b }
            if (r1 == 0) goto L_0x00e7
            r0 = 1
            if (r1 == r0) goto L_0x00b5
            r0 = 2
            if (r1 == r0) goto L_0x007d
            r0 = 4
            if (r1 == r0) goto L_0x0073
            r0 = 6
            if (r1 == r0) goto L_0x0049
            r0 = 7
            if (r1 != r0) goto L_0x011a
            java.util.Set r3 = r4.A09     // Catch:{ 6yp -> 0x011b }
            X.8qL r0 = r6.A01     // Catch:{ 6yp -> 0x011b }
            byte[] r2 = X.C176778dY.A0C(r0)     // Catch:{ 6yp -> 0x011b }
            if (r3 == 0) goto L_0x011a
            java.util.Iterator r1 = r3.iterator()     // Catch:{ 6yp -> 0x011b }
        L_0x0023:
            boolean r0 = r1.hasNext()     // Catch:{ 6yp -> 0x011b }
            if (r0 == 0) goto L_0x0036
            java.lang.Object r0 = r1.next()     // Catch:{ 6yp -> 0x011b }
            byte[] r0 = (byte[]) r0     // Catch:{ 6yp -> 0x011b }
            boolean r0 = X.C162037r7.A05(r2, r0)     // Catch:{ 6yp -> 0x011b }
            if (r0 == 0) goto L_0x0023
            return
        L_0x0036:
            int r0 = r2.length     // Catch:{ 6yp -> 0x011b }
            if (r0 != 0) goto L_0x0040
            int r0 = r3.size()     // Catch:{ 6yp -> 0x011b }
            if (r0 != 0) goto L_0x0040
            return
        L_0x0040:
            java.lang.String r0 = "IP is not from a permitted subtree."
            X.6yp r1 = new X.6yp     // Catch:{ 6yp -> 0x011b }
            r1.<init>(r0)     // Catch:{ 6yp -> 0x011b }
            goto L_0x0119
        L_0x0049:
            java.util.Set r3 = r4.A0B     // Catch:{ 6yp -> 0x011b }
            java.lang.String r2 = X.AnonymousClass8Q0.A02(r6)     // Catch:{ 6yp -> 0x011b }
            if (r3 == 0) goto L_0x011a
            java.util.Iterator r1 = r3.iterator()     // Catch:{ 6yp -> 0x011b }
        L_0x0055:
            boolean r0 = r1.hasNext()     // Catch:{ 6yp -> 0x011b }
            if (r0 == 0) goto L_0x0066
            java.lang.String r0 = X.AnonymousClass001.A0m(r1)     // Catch:{ 6yp -> 0x011b }
            boolean r0 = r4.A0A(r2, r0)     // Catch:{ 6yp -> 0x011b }
            if (r0 == 0) goto L_0x0055
            return
        L_0x0066:
            int r0 = r2.length()     // Catch:{ 6yp -> 0x011b }
            if (r0 != 0) goto L_0x0112
            int r0 = r3.size()     // Catch:{ 6yp -> 0x011b }
            if (r0 != 0) goto L_0x0112
            return
        L_0x0073:
            X.8qL r0 = r6.A01     // Catch:{ 6yp -> 0x011b }
            X.8dI r0 = X.C176618dI.A0B(r0)     // Catch:{ 6yp -> 0x011b }
            r4.A08(r0)     // Catch:{ 6yp -> 0x011b }
            return
        L_0x007d:
            java.util.Set r4 = r4.A07     // Catch:{ 6yp -> 0x011b }
            java.lang.String r3 = X.AnonymousClass8Q0.A02(r6)     // Catch:{ 6yp -> 0x011b }
            if (r4 == 0) goto L_0x011a
            java.util.Iterator r2 = r4.iterator()     // Catch:{ 6yp -> 0x011b }
        L_0x0089:
            boolean r0 = r2.hasNext()     // Catch:{ 6yp -> 0x011b }
            if (r0 == 0) goto L_0x00a0
            java.lang.String r1 = X.AnonymousClass001.A0m(r2)     // Catch:{ 6yp -> 0x011b }
            boolean r0 = X.C162037r7.A03(r3, r1)     // Catch:{ 6yp -> 0x011b }
            if (r0 != 0) goto L_0x011a
            boolean r0 = r3.equalsIgnoreCase(r1)     // Catch:{ 6yp -> 0x011b }
            if (r0 == 0) goto L_0x0089
            return
        L_0x00a0:
            int r0 = r3.length()     // Catch:{ 6yp -> 0x011b }
            if (r0 != 0) goto L_0x00ad
            int r0 = r4.size()     // Catch:{ 6yp -> 0x011b }
            if (r0 != 0) goto L_0x00ad
            return
        L_0x00ad:
            java.lang.String r0 = "DNS is not from a permitted subtree."
            X.6yp r1 = new X.6yp     // Catch:{ 6yp -> 0x011b }
            r1.<init>(r0)     // Catch:{ 6yp -> 0x011b }
            goto L_0x0119
        L_0x00b5:
            java.util.Set r3 = r4.A08     // Catch:{ 6yp -> 0x011b }
            java.lang.String r2 = X.AnonymousClass8Q0.A02(r6)     // Catch:{ 6yp -> 0x011b }
            if (r3 == 0) goto L_0x011a
            java.util.Iterator r1 = r3.iterator()     // Catch:{ 6yp -> 0x011b }
        L_0x00c1:
            boolean r0 = r1.hasNext()     // Catch:{ 6yp -> 0x011b }
            if (r0 == 0) goto L_0x00d2
            java.lang.String r0 = X.AnonymousClass001.A0m(r1)     // Catch:{ 6yp -> 0x011b }
            boolean r0 = r4.A09(r2, r0)     // Catch:{ 6yp -> 0x011b }
            if (r0 == 0) goto L_0x00c1
            return
        L_0x00d2:
            int r0 = r2.length()     // Catch:{ 6yp -> 0x011b }
            if (r0 != 0) goto L_0x00df
            int r0 = r3.size()     // Catch:{ 6yp -> 0x011b }
            if (r0 != 0) goto L_0x00df
            return
        L_0x00df:
            java.lang.String r0 = "Subject email address is not from a permitted subtree."
            X.6yp r1 = new X.6yp     // Catch:{ 6yp -> 0x011b }
            r1.<init>(r0)     // Catch:{ 6yp -> 0x011b }
            goto L_0x0119
        L_0x00e7:
            java.util.Set r1 = r4.A0A     // Catch:{ 6yp -> 0x011b }
            X.8qL r0 = r6.A01     // Catch:{ 6yp -> 0x011b }
            X.8cn r2 = X.C176308cn.A0A(r0)     // Catch:{ 6yp -> 0x011b }
            if (r1 == 0) goto L_0x011a
            java.util.Iterator r1 = r1.iterator()     // Catch:{ 6yp -> 0x011b }
        L_0x00f5:
            boolean r0 = r1.hasNext()     // Catch:{ 6yp -> 0x011b }
            if (r0 == 0) goto L_0x010a
            java.lang.Object r0 = r1.next()     // Catch:{ 6yp -> 0x011b }
            X.8cn r0 = X.C176308cn.A0A(r0)     // Catch:{ 6yp -> 0x011b }
            boolean r0 = r0.equals(r2)     // Catch:{ 6yp -> 0x011b }
            if (r0 == 0) goto L_0x00f5
            return
        L_0x010a:
            java.lang.String r0 = "Subject OtherName is not from a permitted subtree."
            X.6yp r1 = new X.6yp     // Catch:{ 6yp -> 0x011b }
            r1.<init>(r0)     // Catch:{ 6yp -> 0x011b }
            goto L_0x0119
        L_0x0112:
            java.lang.String r0 = "URI is not from a permitted subtree."
            X.6yp r1 = new X.6yp     // Catch:{ 6yp -> 0x011b }
            r1.<init>(r0)     // Catch:{ 6yp -> 0x011b }
        L_0x0119:
            throw r1     // Catch:{ 6yp -> 0x011b }
        L_0x011a:
            return
        L_0x011b:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            X.6zB r0 = new X.6zB
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153217as.A01(X.8dH):void");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C153217as)) {
            return false;
        }
        return this.A00.equals(((C153217as) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return this.A00.toString();
    }
}
