package X;

/* renamed from: X.8LY  reason: invalid class name */
public final class AnonymousClass8LY implements Comparable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C126806Pj A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    /* renamed from: A00 */
    public int compareTo(AnonymousClass8LY r8) {
        AnonymousClass8NS r6;
        AnonymousClass8NS reverse;
        AnonymousClass8NS r0;
        boolean z = this.A04;
        if (!z || !this.A06) {
            r6 = C126816Pk.A03;
            reverse = r6.reverse();
        } else {
            r6 = C126816Pk.A03;
            reverse = r6;
        }
        C162027r4 A002 = AnonymousClass8NS.A00(C162027r4.start().compareFalseFirst(this.A06, r8.A06).compareFalseFirst(z, r8.A04).compareFalseFirst(this.A05, r8.A05), Integer.valueOf(this.A02), r8.A02);
        Integer valueOf = Integer.valueOf(this.A00);
        Integer valueOf2 = Integer.valueOf(r8.A00);
        if (this.A03.A0Q) {
            r0 = r6.reverse();
        } else {
            r0 = C126816Pk.A04;
        }
        return A002.compare(valueOf, valueOf2, r0).compare(Integer.valueOf(this.A01), Integer.valueOf(r8.A01), reverse).compare(valueOf, valueOf2, reverse).result();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0051, code lost:
        if (r1 < ((float) r8.A07)) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0059, code lost:
        if (r1 < r8.A06) goto L_0x0094;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0090 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8LY(X.C166527yp r7, X.C126806Pj r8, int r9, boolean r10) {
        /*
            r6 = this;
            r6.<init>()
            r6.A03 = r8
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 1
            r3 = 0
            r4 = -1
            if (r10 == 0) goto L_0x0096
            int r1 = r7.A0I
            if (r1 == r4) goto L_0x0014
            int r0 = r8.A05
            if (r1 > r0) goto L_0x0096
        L_0x0014:
            int r1 = r7.A09
            if (r1 == r4) goto L_0x001c
            int r0 = r8.A04
            if (r1 > r0) goto L_0x0096
        L_0x001c:
            float r1 = r7.A01
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0029
            int r0 = r8.A03
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0096
        L_0x0029:
            int r1 = r7.A05
            if (r1 == r4) goto L_0x0031
            int r0 = r8.A02
            if (r1 > r0) goto L_0x0096
        L_0x0031:
            r0 = 1
        L_0x0032:
            r6.A04 = r0
            if (r10 == 0) goto L_0x0094
            int r1 = r7.A0I
            if (r1 == r4) goto L_0x003e
            int r0 = r8.A09
            if (r1 < r0) goto L_0x0094
        L_0x003e:
            int r1 = r7.A09
            if (r1 == r4) goto L_0x0046
            int r0 = r8.A08
            if (r1 < r0) goto L_0x0094
        L_0x0046:
            float r1 = r7.A01
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0053
            int r0 = r8.A07
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0094
        L_0x0053:
            int r1 = r7.A05
            if (r1 == r4) goto L_0x005b
            int r0 = r8.A06
            if (r1 < r0) goto L_0x0094
        L_0x005b:
            r6.A05 = r2
            boolean r0 = X.AnonymousClass6C8.A1O(r9)
            r6.A06 = r0
            int r0 = r7.A05
            r6.A00 = r0
            int r2 = r7.A0I
            r1 = -1
            if (r2 == r4) goto L_0x0072
            int r0 = r7.A09
            if (r0 == r4) goto L_0x0072
            int r1 = r2 * r0
        L_0x0072:
            r6.A01 = r1
        L_0x0074:
            X.6aY r2 = r8.A0F
            int r0 = r2.size()
            if (r3 >= r0) goto L_0x0090
            java.lang.String r1 = r7.A0T
            if (r1 == 0) goto L_0x008d
            java.lang.Object r0 = r2.get(r3)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x008d
        L_0x008a:
            r6.A02 = r3
            return
        L_0x008d:
            int r3 = r3 + 1
            goto L_0x0074
        L_0x0090:
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x008a
        L_0x0094:
            r2 = 0
            goto L_0x005b
        L_0x0096:
            r0 = 0
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8LY.<init>(X.7yp, X.6Pj, int, boolean):void");
    }
}
