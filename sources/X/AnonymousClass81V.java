package X;

/* renamed from: X.81V  reason: invalid class name */
public class AnonymousClass81V implements C180198ke {
    public final /* synthetic */ AnonymousClass6K4 A00;
    public final /* synthetic */ Object A01;

    public AnonymousClass81V(AnonymousClass6K4 r1, Object obj) {
        this.A00 = r1;
        this.A01 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bbp(com.facebook.android.exoplayer2.Timeline r13, X.C185778uE r14, java.lang.Object r15) {
        /*
            r12 = this;
            X.6K4 r5 = r12.A00
            java.lang.Object r4 = r12.A01
            boolean r0 = r5 instanceof X.AnonymousClass6K2
            if (r0 == 0) goto L_0x0044
            X.6K2 r5 = (X.AnonymousClass6K2) r5
            X.6tu r0 = r5.A02
            if (r0 != 0) goto L_0x003b
            int r2 = r5.A00
            r1 = -1
            int r0 = r13.A00()
            if (r2 != r1) goto L_0x003c
            r5.A00 = r0
        L_0x0019:
            r0 = 0
        L_0x001a:
            r5.A02 = r0
            if (r0 != 0) goto L_0x003b
            java.util.ArrayList r2 = r5.A05
            r2.remove(r14)
            X.8uE[] r1 = r5.A06
            r0 = 0
            r0 = r1[r0]
            if (r14 != r0) goto L_0x002e
            r5.A01 = r13
            r5.A03 = r15
        L_0x002e:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x003b
            com.facebook.android.exoplayer2.Timeline r1 = r5.A01
            java.lang.Object r0 = r5.A03
            r5.A02(r1, r0)
        L_0x003b:
            return
        L_0x003c:
            if (r0 == r2) goto L_0x0019
            X.6tu r0 = new X.6tu
            r0.<init>()
            goto L_0x001a
        L_0x0044:
            boolean r0 = r5 instanceof X.AnonymousClass6K1
            if (r0 == 0) goto L_0x0066
            X.6K1 r5 = (X.AnonymousClass6K1) r5
            int r0 = r13.A00()
            r5.A00 = r0
            int r1 = r5.A01
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L_0x0060
            X.6JO r0 = new X.6JO
            r0.<init>(r13, r1)
        L_0x005c:
            r5.A02(r0, r15)
            return
        L_0x0060:
            X.6K5 r0 = new X.6K5
            r0.<init>(r13)
            goto L_0x005c
        L_0x0066:
            X.6K3 r5 = (X.AnonymousClass6K3) r5
            X.8LX r4 = (X.AnonymousClass8LX) r4
            if (r4 == 0) goto L_0x010f
            X.6K6 r8 = r4.A03
            com.facebook.android.exoplayer2.Timeline r0 = r8.A00
            if (r0 == r13) goto L_0x003b
            int r3 = r13.A01()
            int r0 = r8.A01()
            int r3 = r3 - r0
            int r2 = r13.A00()
            int r0 = r8.A00()
            int r1 = r2 - r0
            r6 = 0
            r7 = 1
            if (r3 != 0) goto L_0x008b
            if (r1 == 0) goto L_0x0092
        L_0x008b:
            int r0 = r4.A00
            int r0 = r0 + 1
            r5.A06(r0, r6, r3, r1)
        L_0x0092:
            java.lang.Object r1 = r8.A00
            if (r1 != 0) goto L_0x00a0
            if (r2 <= 0) goto L_0x00a0
            X.7Wk r0 = X.AnonymousClass6K6.A01
            X.7Wk r0 = r13.A08(r0, r6, r7)
            java.lang.Object r1 = r0.A04
        L_0x00a0:
            X.6K6 r0 = new X.6K6
            r0.<init>(r13, r1)
            r4.A03 = r0
            boolean r0 = r4.A05
            if (r0 != 0) goto L_0x00fb
            int r0 = r13.A01()
            boolean r0 = X.AnonymousClass000.A1T(r0)
            if (r0 != 0) goto L_0x00fb
            X.80j r8 = r5.A05
            r0 = 0
            r13.A09(r8, r6, r0)
            r2 = 0
            long r0 = r8.A02
            long r2 = r2 + r0
        L_0x00c1:
            java.util.List r1 = r4.A04
            int r0 = r1.size()
            if (r6 >= r0) goto L_0x00f9
            java.lang.Object r9 = r1.get(r6)
            X.81T r9 = (X.AnonymousClass81T) r9
            long r0 = r9.A01
            r10 = 0
            int r8 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x00df
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00df
            r9.A00 = r2
            r9.A01 = r2
        L_0x00df:
            X.8uE r11 = r9.A05
            X.7Z2 r10 = r9.A04
            X.7ZV r8 = r9.A06
            long r0 = r9.A01
            X.8xB r8 = r11.B0v(r10, r8, r0)
            r9.A03 = r8
            X.8xA r0 = r9.A02
            if (r0 == 0) goto L_0x00f6
            long r0 = r9.A01
            r8.BhH(r9, r0)
        L_0x00f6:
            int r6 = r6 + 1
            goto L_0x00c1
        L_0x00f9:
            r4.A05 = r7
        L_0x00fb:
            boolean r0 = r5.A04
            if (r0 != 0) goto L_0x003b
            X.7br r0 = r5.A02
            X.7af r1 = r0.A04(r5)
            r0 = 5
            r1.A01(r0)
            r1.A00()
            r5.A04 = r7
            return
        L_0x010f:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass6CA.A0N()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass81V.Bbp(com.facebook.android.exoplayer2.Timeline, X.8uE, java.lang.Object):void");
    }
}
