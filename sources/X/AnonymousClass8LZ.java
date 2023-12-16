package X;

/* renamed from: X.8LZ  reason: invalid class name */
public final class AnonymousClass8LZ implements Comparable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0070, code lost:
        if (r10 == null) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8LZ(X.C166527yp r8, X.C126806Pj r9, java.lang.String r10, int r11) {
        /*
            r7 = this;
            r7.<init>()
            r3 = 0
            boolean r0 = X.AnonymousClass6C8.A1O(r11)
            r7.A08 = r0
            int r1 = r8.A0G
            int r0 = r9.A00
            int r0 = ~r0
            r1 = r1 & r0
            r0 = r1 & 1
            boolean r0 = X.AnonymousClass000.A1S(r0)
            r7.A05 = r0
            r0 = r1 & 2
            boolean r0 = X.AnonymousClass000.A1S(r0)
            r7.A06 = r0
            X.6aY r5 = r9.A04
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = ""
            X.6aY r6 = X.C129586aY.of(r0)
        L_0x002e:
            r2 = 0
        L_0x002f:
            int r0 = r6.size()
            if (r2 >= r0) goto L_0x0046
            java.lang.String r1 = X.AnonymousClass001.A0n(r6, r2)
            boolean r0 = r9.A05
            int r4 = X.C126816Pk.A00(r8, r1, r0)
            if (r4 > 0) goto L_0x004a
            int r2 = r2 + 1
            goto L_0x002f
        L_0x0044:
            r6 = r5
            goto L_0x002e
        L_0x0046:
            r2 = 2147483647(0x7fffffff, float:NaN)
            r4 = 0
        L_0x004a:
            r7.A00 = r2
            r7.A01 = r4
            int r1 = r8.A0D
            int r0 = r9.A02
            r0 = r0 & r1
            int r2 = java.lang.Integer.bitCount(r0)
            r7.A02 = r2
            r0 = r1 & 1088(0x440, float:1.525E-42)
            boolean r0 = X.AnonymousClass000.A1S(r0)
            r7.A04 = r0
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x0072
            java.lang.String r0 = "und"
            boolean r0 = android.text.TextUtils.equals(r10, r0)
            if (r0 != 0) goto L_0x0072
            r0 = 0
            if (r10 != 0) goto L_0x0073
        L_0x0072:
            r0 = 1
        L_0x0073:
            int r1 = X.C126816Pk.A00(r8, r10, r0)
            r7.A03 = r1
            if (r4 > 0) goto L_0x008d
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0083
            if (r2 > 0) goto L_0x008d
        L_0x0083:
            boolean r0 = r7.A05
            if (r0 != 0) goto L_0x008d
            boolean r0 = r7.A06
            if (r0 == 0) goto L_0x008e
            if (r1 <= 0) goto L_0x008e
        L_0x008d:
            r3 = 1
        L_0x008e:
            r7.A07 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8LZ.<init>(X.7yp, X.6Pj, java.lang.String, int):void");
    }

    /* renamed from: A00 */
    public int compareTo(AnonymousClass8LZ r7) {
        C162027r4 A002 = AnonymousClass8NS.A00(C162027r4.start().compareFalseFirst(this.A08, r7.A08), Integer.valueOf(this.A00), r7.A00);
        int i = this.A01;
        C162027r4 compare = A002.compare(i, r7.A01);
        int i2 = this.A02;
        C162027r4 compareFalseFirst = compare.compare(i2, r7.A02).compareFalseFirst(this.A05, r7.A05);
        Boolean valueOf = Boolean.valueOf(this.A06);
        Boolean valueOf2 = Boolean.valueOf(r7.A06);
        AnonymousClass8NS natural = AnonymousClass8NS.natural();
        if (i != 0) {
            natural = natural.reverse();
        }
        C162027r4 compare2 = compareFalseFirst.compare(valueOf, valueOf2, natural).compare(this.A03, r7.A03);
        if (i2 == 0) {
            compare2 = compare2.compareTrueFirst(this.A04, r7.A04);
        }
        return compare2.result();
    }
}
