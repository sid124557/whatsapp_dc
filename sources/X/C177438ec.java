package X;

/* renamed from: X.8ec  reason: invalid class name and case insensitive filesystem */
public class C177438ec extends C173958Sk {
    public C177428eb A00;
    public final Object A01;
    public volatile int A02;
    public volatile boolean A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C177438ec(X.C176268cj r9, X.C180128kX r10) {
        /*
            r8 = this;
            r4 = r9
            X.8d9 r0 = r9.A02     // Catch:{ Exception -> 0x0059 }
            java.lang.String r3 = X.C161977qv.A01(r0)     // Catch:{ Exception -> 0x0059 }
            X.8qL r0 = r0.A00     // Catch:{ Exception -> 0x0048 }
            if (r0 != 0) goto L_0x000d
            r6 = 0
            goto L_0x0011
        L_0x000d:
            byte[] r6 = X.AnonymousClass8Q0.A09(r0)     // Catch:{ Exception -> 0x0048 }
        L_0x0011:
            X.8dX r0 = X.C176548dB.A0K     // Catch:{ Exception -> 0x0041 }
            java.lang.String r2 = r0.A01     // Catch:{ Exception -> 0x0041 }
            X.8cc r0 = r9.A03     // Catch:{ Exception -> 0x0041 }
            X.8cl r1 = r0.A04     // Catch:{ Exception -> 0x0041 }
            if (r1 == 0) goto L_0x0034
            X.8dX r0 = X.C176768dX.A0B(r2)     // Catch:{ Exception -> 0x0041 }
            X.8dB r0 = X.C176288cl.A0A(r0, r1)     // Catch:{ Exception -> 0x0041 }
            if (r0 == 0) goto L_0x0034
            X.8dY r0 = r0.A01     // Catch:{ Exception -> 0x0041 }
            if (r0 == 0) goto L_0x0034
            byte[] r0 = r0.A00     // Catch:{ Exception -> 0x0041 }
            if (r0 == 0) goto L_0x0034
            X.8d7 r0 = X.C176508d7.A0A(r0)     // Catch:{ Exception -> 0x0041 }
            boolean r7 = r0.A03     // Catch:{ Exception -> 0x0041 }
            goto L_0x0035
        L_0x0034:
            r7 = 0
        L_0x0035:
            r2 = r8
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r0 = X.AnonymousClass002.A0D()
            r8.A01 = r0
            return
        L_0x0041:
            r1 = move-exception
            X.8SW r0 = new X.8SW
            r0.<init>(r1)
            throw r0
        L_0x0048:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CRL contents invalid: "
            java.lang.String r1 = X.AnonymousClass000.A0P(r2, r0, r1)
            java.security.cert.CRLException r0 = new java.security.cert.CRLException
            r0.<init>(r1)
            throw r0
        L_0x0059:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CRL contents invalid: "
            java.lang.String r1 = X.AnonymousClass000.A0P(r2, r0, r1)
            java.security.cert.CRLException r0 = new java.security.cert.CRLException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C177438ec.<init>(X.8cj, X.8kX):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000f, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r7 = getEncoded();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C177428eb A03() {
        /*
            r9 = this;
            java.lang.Object r1 = r9.A01
            monitor-enter(r1)
            X.8eb r0 = r9.A00     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r1)     // Catch:{ all -> 0x002c }
            return r0
        L_0x0009:
            monitor-exit(r1)     // Catch:{ all -> 0x002c }
            byte[] r7 = r9.getEncoded()     // Catch:{ CRLException -> 0x000f }
            goto L_0x0010
        L_0x000f:
            r7 = 0
        L_0x0010:
            X.8kX r5 = r9.A02
            X.8cj r4 = r9.A01
            java.lang.String r3 = r9.A00
            byte[] r6 = r9.A04
            boolean r8 = r9.A03
            X.8eb r2 = new X.8eb
            r2.<init>(r3, r4, r5, r6, r7, r8)
            monitor-enter(r1)
            X.8eb r0 = r9.A00     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0027
            r9.A00 = r2     // Catch:{ all -> 0x0029 }
            r0 = r2
        L_0x0027:
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            return r0
        L_0x0029:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            throw r0
        L_0x002c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C177438ec.A03():X.8eb");
    }

    public boolean equals(Object obj) {
        C176068cP r1;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C177438ec) {
            C177438ec r3 = (C177438ec) obj;
            if (!this.A03 || !r3.A03) {
                if ((this.A00 == null || r3.A00 == null) && (r1 = this.A01.A01) != null && !r1.A0T(r3.A01.A01)) {
                    return false;
                }
            } else if (this.A02 != r3.A02) {
                return false;
            }
        }
        return A03().equals(obj);
    }

    public int hashCode() {
        if (!this.A03) {
            this.A02 = A03().hashCode();
            this.A03 = true;
        }
        return this.A02;
    }
}
