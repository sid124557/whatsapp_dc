package X;

/* renamed from: X.6bf  reason: invalid class name and case insensitive filesystem */
public class C130256bf extends C130266bg {
    public static final long serialVersionUID = 1;
    public final byte[] bytes;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r7 = (X.C172548Lq) r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r1 = 1
            if (r9 == r8) goto L_0x008e
            boolean r0 = r9 instanceof X.C172548Lq
            r4 = 0
            if (r0 == 0) goto L_0x0025
            int r2 = r8.A03()
            r7 = r9
            X.8Lq r7 = (X.C172548Lq) r7
            int r3 = r7.A03()
            if (r2 != r3) goto L_0x0025
            if (r2 == 0) goto L_0x008e
            boolean r0 = r9 instanceof X.C130256bf
            if (r0 == 0) goto L_0x0089
            int r1 = r8.hash
            int r0 = r7.hash
            if (r1 == 0) goto L_0x0026
            if (r0 == 0) goto L_0x0026
            if (r1 == r0) goto L_0x0026
        L_0x0025:
            return r4
        L_0x0026:
            if (r2 > r3) goto L_0x0075
            if (r2 > r3) goto L_0x005c
            boolean r0 = r7 instanceof X.C130256bf
            if (r0 == 0) goto L_0x004f
            X.6bf r7 = (X.C130256bf) r7
            byte[] r6 = r8.bytes
            byte[] r5 = r7.bytes
            int r4 = r8.A08()
            int r3 = r4 + r2
            int r2 = r7.A08()
        L_0x003e:
            if (r4 >= r3) goto L_0x004d
            byte r1 = r6[r4]
            byte r0 = r5[r2]
            if (r1 == r0) goto L_0x0048
            r0 = 0
            return r0
        L_0x0048:
            int r4 = r4 + 1
            int r2 = r2 + 1
            goto L_0x003e
        L_0x004d:
            r0 = 1
            return r0
        L_0x004f:
            X.8Lq r1 = r7.A04(r2)
            X.8Lq r0 = r8.A04(r2)
            boolean r0 = r1.equals(r0)
            return r0
        L_0x005c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Ran off end of other: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", "
            r1.append(r0)
            r1.append(r2)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r3)
            throw r0
        L_0x0075:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Length too large: "
            r1.append(r0)
            r1.append(r2)
            r1.append(r2)
            java.lang.IllegalArgumentException r0 = X.C18310x6.A0d(r1)
            throw r0
        L_0x0089:
            boolean r0 = r9.equals(r8)
            return r0
        L_0x008e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130256bf.equals(java.lang.Object):boolean");
    }

    public int A08() {
        if (this instanceof C130246be) {
            return ((C130246be) this).bytesOffset;
        }
        return 0;
    }

    public C130256bf(byte[] bArr) {
        bArr.getClass();
        this.bytes = bArr;
    }
}
