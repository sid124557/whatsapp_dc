package X;

/* renamed from: X.6Xu  reason: invalid class name and case insensitive filesystem */
public class C128876Xu extends C128886Xv {
    public final byte[] zzb;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r7 = (X.C172538Lp) r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r1 = 1
            if (r9 == r8) goto L_0x008c
            boolean r0 = r9 instanceof X.C172538Lp
            r4 = 0
            if (r0 == 0) goto L_0x0025
            int r2 = r8.A01()
            r7 = r9
            X.8Lp r7 = (X.C172538Lp) r7
            int r3 = r7.A01()
            if (r2 != r3) goto L_0x0025
            if (r2 == 0) goto L_0x008c
            boolean r0 = r9 instanceof X.C128876Xu
            if (r0 == 0) goto L_0x0087
            int r1 = r8.zzc
            int r0 = r7.zzc
            if (r1 == 0) goto L_0x0026
            if (r0 == 0) goto L_0x0026
            if (r1 == r0) goto L_0x0026
        L_0x0025:
            return r4
        L_0x0026:
            if (r2 > r3) goto L_0x0071
            if (r2 > r3) goto L_0x005c
            boolean r0 = r7 instanceof X.C128876Xu
            if (r0 == 0) goto L_0x004f
            X.6Xu r7 = (X.C128876Xu) r7
            byte[] r6 = r8.zzb
            byte[] r5 = r7.zzb
            int r4 = r8.A03()
            int r3 = r4 + r2
            int r2 = r7.A03()
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
            X.8Lp r1 = r7.A02(r2)
            X.8Lp r0 = r8.A02(r2)
            boolean r0 = r1.equals(r0)
            return r0
        L_0x005c:
            r0 = 59
            java.lang.StringBuilder r1 = X.AnonymousClass6CA.A0Y(r0)
            java.lang.String r0 = "Ran off end of other: 0, "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r3)
            throw r0
        L_0x0071:
            r0 = 40
            java.lang.StringBuilder r1 = X.AnonymousClass6CA.A0Y(r0)
            java.lang.String r0 = "Length too large: "
            r1.append(r0)
            r1.append(r2)
            r1.append(r2)
            java.lang.IllegalArgumentException r0 = X.C18310x6.A0d(r1)
            throw r0
        L_0x0087:
            boolean r0 = r9.equals(r8)
            return r0
        L_0x008c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128876Xu.equals(java.lang.Object):boolean");
    }

    public int A03() {
        if (this instanceof C128866Xt) {
            return ((C128866Xt) this).zzc;
        }
        return 0;
    }

    public C128876Xu(byte[] bArr) {
        bArr.getClass();
        this.zzb = bArr;
    }
}
