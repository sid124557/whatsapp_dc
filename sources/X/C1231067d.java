package X;

/* renamed from: X.67d  reason: invalid class name and case insensitive filesystem */
public class C1231067d extends AnonymousClass0O4 {
    public final int A00;

    public C1231067d(int i) {
        this.A00 = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: int[]} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0068, code lost:
        return r8.equals(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00d3, code lost:
        if (r1 != r0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        return false;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ boolean A00(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x0064;
                case 1: goto L_0x00b7;
                case 2: goto L_0x0069;
                case 3: goto L_0x0061;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.5Sw r8 = (X.C104925Sw) r8
            X.5Sw r9 = (X.C104925Sw) r9
            X.C18260x0.A0O(r8, r9)
            java.lang.String r1 = r8.A02
            java.lang.String r0 = r9.A02
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x00d7
            int r1 = r8.A00
            int r0 = r9.A00
            if (r1 != r0) goto L_0x00d7
            java.util.List r2 = r8.A04
            r6 = 0
            if (r2 == 0) goto L_0x005f
            java.lang.Integer r1 = X.AnonymousClass0x9.A0l(r2)
        L_0x0025:
            java.util.List r5 = r9.A04
            if (r5 == 0) goto L_0x005d
            java.lang.Integer r0 = X.AnonymousClass0x9.A0l(r5)
        L_0x002d:
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x00d7
            if (r2 == 0) goto L_0x00d5
            java.util.Iterator r4 = r2.iterator()
            r3 = 0
        L_0x003a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00d5
            java.lang.Object r2 = r4.next()
            int r1 = r3 + 1
            if (r3 >= 0) goto L_0x004d
            java.lang.RuntimeException r0 = X.C18280x3.A0X()
            throw r0
        L_0x004d:
            if (r5 == 0) goto L_0x005b
            java.lang.Object r0 = r5.get(r3)
        L_0x0053:
            boolean r0 = X.C162457s7.A0P(r2, r0)
            if (r0 == 0) goto L_0x00d7
            r3 = r1
            goto L_0x003a
        L_0x005b:
            r0 = r6
            goto L_0x0053
        L_0x005d:
            r0 = r6
            goto L_0x002d
        L_0x005f:
            r1 = r6
            goto L_0x0025
        L_0x0061:
            X.C18260x0.A0O(r8, r9)
        L_0x0064:
            boolean r0 = r8.equals(r9)
            return r0
        L_0x0069:
            X.5MX r8 = (X.AnonymousClass5MX) r8
            X.5MX r9 = (X.AnonymousClass5MX) r9
            X.C18260x0.A0O(r8, r9)
            boolean r0 = r8 instanceof X.C94404rD
            r2 = 0
            if (r0 == 0) goto L_0x0088
            X.4rD r8 = (X.C94404rD) r8
            int[] r1 = r8.A04
            boolean r0 = r9 instanceof X.C94404rD
            if (r0 == 0) goto L_0x0083
            X.4rD r9 = (X.C94404rD) r9
            if (r9 == 0) goto L_0x0083
            int[] r2 = r9.A04
        L_0x0083:
            boolean r0 = java.util.Arrays.equals(r1, r2)
            return r0
        L_0x0088:
            boolean r0 = r8 instanceof X.AnonymousClass4rE
            if (r0 == 0) goto L_0x009f
            X.4rE r8 = (X.AnonymousClass4rE) r8
            int[][] r1 = r8.A04
            boolean r0 = r9 instanceof X.AnonymousClass4rE
            if (r0 == 0) goto L_0x009a
            X.4rE r9 = (X.AnonymousClass4rE) r9
            if (r9 == 0) goto L_0x009a
            int[][] r2 = r9.A04
        L_0x009a:
            boolean r0 = X.AnonymousClass8UD.A08(r1, r2)
            return r0
        L_0x009f:
            boolean r0 = r8 instanceof X.AnonymousClass4rC
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r9 instanceof X.AnonymousClass4rC
            if (r0 == 0) goto L_0x00d7
            X.4rC r9 = (X.AnonymousClass4rC) r9
            if (r9 == 0) goto L_0x00d7
            X.4rC r8 = (X.AnonymousClass4rC) r8
            int r1 = r8.A00
            int r0 = r9.A00
            goto L_0x00d3
        L_0x00b2:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x00b7:
            X.7Kl r8 = (X.C148977Kl) r8
            X.7Kl r9 = (X.C148977Kl) r9
            java.lang.String r1 = r8.A01
            java.lang.String r0 = r9.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00d7
            java.lang.String r1 = r8.A02
            java.lang.String r0 = r9.A02
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00d7
            boolean r1 = r8.A00
            boolean r0 = r9.A00
        L_0x00d3:
            if (r1 != r0) goto L_0x00d7
        L_0x00d5:
            r0 = 1
            return r0
        L_0x00d7:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1231067d.A00(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: int[]} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ boolean A01(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x00b1;
                case 1: goto L_0x00ac;
                case 2: goto L_0x0021;
                case 3: goto L_0x0015;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.5Sw r5 = (X.C104925Sw) r5
            X.5Sw r6 = (X.C104925Sw) r6
            X.C18260x0.A0O(r5, r6)
            java.lang.String r1 = r5.A02
            java.lang.String r0 = r6.A02
        L_0x0010:
            boolean r3 = X.C162457s7.A0P(r1, r0)
            return r3
        L_0x0015:
            X.5SX r5 = (X.AnonymousClass5SX) r5
            X.5SX r6 = (X.AnonymousClass5SX) r6
            X.C18260x0.A0O(r5, r6)
            java.lang.String r1 = r5.A02
            java.lang.String r0 = r6.A02
            goto L_0x0010
        L_0x0021:
            X.5MX r5 = (X.AnonymousClass5MX) r5
            X.5MX r6 = (X.AnonymousClass5MX) r6
            X.C18260x0.A0O(r5, r6)
            boolean r0 = r5 instanceof X.C94404rD
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0055
            X.5SX r0 = r5.A00()
            java.lang.String r1 = r0.A02
            X.5SX r0 = r6.A00()
            java.lang.String r0 = r0.A02
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x00a5
            X.4rD r5 = (X.C94404rD) r5
            int[] r1 = r5.A03
            boolean r0 = r6 instanceof X.C94404rD
            if (r0 == 0) goto L_0x004e
            X.4rD r6 = (X.C94404rD) r6
            if (r6 == 0) goto L_0x004e
            int[] r2 = r6.A03
        L_0x004e:
            boolean r0 = java.util.Arrays.equals(r1, r2)
        L_0x0052:
            if (r0 == 0) goto L_0x00a5
            return r3
        L_0x0055:
            boolean r0 = r5 instanceof X.AnonymousClass4rE
            if (r0 == 0) goto L_0x007e
            X.5SX r0 = r5.A00()
            java.lang.String r1 = r0.A02
            X.5SX r0 = r6.A00()
            java.lang.String r0 = r0.A02
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x00a5
            X.4rE r5 = (X.AnonymousClass4rE) r5
            int[][] r1 = r5.A03
            boolean r0 = r6 instanceof X.AnonymousClass4rE
            if (r0 == 0) goto L_0x0079
            X.4rE r6 = (X.AnonymousClass4rE) r6
            if (r6 == 0) goto L_0x0079
            int[][] r2 = r6.A03
        L_0x0079:
            boolean r0 = X.AnonymousClass8UD.A08(r1, r2)
            goto L_0x0052
        L_0x007e:
            boolean r0 = r5 instanceof X.AnonymousClass4rC
            if (r0 == 0) goto L_0x00a7
            X.5SX r0 = r5.A00()
            java.lang.String r1 = r0.A02
            X.5SX r0 = r6.A00()
            java.lang.String r0 = r0.A02
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x00a5
            boolean r0 = r6 instanceof X.AnonymousClass4rC
            if (r0 == 0) goto L_0x00a5
            X.4rC r6 = (X.AnonymousClass4rC) r6
            if (r6 == 0) goto L_0x00a5
            X.4rC r5 = (X.AnonymousClass4rC) r5
            int r1 = r5.A00
            int r0 = r6.A00
            if (r1 != r0) goto L_0x00a5
            return r3
        L_0x00a5:
            r3 = 0
            return r3
        L_0x00a7:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x00ac:
            boolean r3 = X.AnonymousClass75J.A00(r5, r6)
            return r3
        L_0x00b1:
            X.6lz r5 = (X.C136186lz) r5
            X.6lz r6 = (X.C136186lz) r6
            boolean r0 = r5 instanceof X.C96414wK
            if (r0 == 0) goto L_0x00ce
            boolean r0 = r6 instanceof X.C96414wK
            if (r0 == 0) goto L_0x00ce
            X.4wK r5 = (X.C96414wK) r5
            X.4wK r6 = (X.C96414wK) r6
            X.5e1 r0 = r5.A0B
            java.lang.String r1 = r0.A0F
            X.5e1 r0 = r6.A0B
            java.lang.String r0 = r0.A0F
            boolean r3 = r1.equals(r0)
            return r3
        L_0x00ce:
            boolean r3 = r5.equals(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1231067d.A01(java.lang.Object, java.lang.Object):boolean");
    }
}
