package X;

/* renamed from: X.0Sc  reason: invalid class name and case insensitive filesystem */
public class C05140Sc {
    public static final AnonymousClass0T2 A00 = AnonymousClass0T2.A00("k");
    public static final AnonymousClass0T2 A01 = AnonymousClass0T2.A00("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0145, code lost:
        if (r3.A01 == 1.0f) goto L_0x0147;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C09510gJ A00(X.AnonymousClass0QL r22, X.C10470hz r23) {
        /*
            r2 = r23
            X.0G4 r3 = r2.A0C()
            X.0G4 r1 = X.AnonymousClass0G4.BEGIN_OBJECT
            r0 = 0
            r5 = 0
            if (r3 != r1) goto L_0x0010
            r5 = 1
            r2.A0H()
        L_0x0010:
            r6 = 0
            r12 = 0
            r14 = 0
            r13 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r7 = 0
            r8 = 0
        L_0x0019:
            boolean r1 = r2.A0N()
            if (r1 == 0) goto L_0x00ce
            X.0T2 r1 = A01
            int r3 = r2.A0A(r1)
            r1 = r22
            switch(r3) {
                case 0: goto L_0x009d;
                case 1: goto L_0x0097;
                case 2: goto L_0x00bf;
                case 3: goto L_0x004a;
                case 4: goto L_0x004f;
                case 5: goto L_0x0045;
                case 6: goto L_0x0040;
                case 7: goto L_0x003b;
                case 8: goto L_0x0036;
                case 9: goto L_0x0031;
                default: goto L_0x002a;
            }
        L_0x002a:
            r2.A0K()
            r2.A0L()
            goto L_0x0019
        L_0x0031:
            X.0Bn r10 = X.AnonymousClass0VA.A01(r1, r2, r0)
            goto L_0x0019
        L_0x0036:
            X.0Bn r9 = X.AnonymousClass0VA.A01(r1, r2, r0)
            goto L_0x0019
        L_0x003b:
            X.0Bn r8 = X.AnonymousClass0VA.A01(r1, r2, r0)
            goto L_0x0019
        L_0x0040:
            X.0Bn r7 = X.AnonymousClass0VA.A01(r1, r2, r0)
            goto L_0x0019
        L_0x0045:
            X.0Bo r11 = X.AnonymousClass0VA.A02(r1, r2)
            goto L_0x0019
        L_0x004a:
            java.lang.String r3 = "Lottie doesn't support 3D layers."
            X.AnonymousClass0QL.A01(r1, r3)
        L_0x004f:
            X.0Bn r6 = X.AnonymousClass0VA.A01(r1, r2, r0)
            java.util.List r3 = r6.A00
            boolean r4 = r3.isEmpty()
            r21 = 0
            if (r4 == 0) goto L_0x0076
            java.lang.Float r19 = java.lang.Float.valueOf(r21)
            r16 = 0
            float r4 = r1.A00
            java.lang.Float r18 = java.lang.Float.valueOf(r4)
            X.0Wt r15 = new X.0Wt
            r17 = r1
            r20 = r19
            r15.<init>((android.view.animation.Interpolator) r16, (X.AnonymousClass0QL) r17, (java.lang.Float) r18, (java.lang.Object) r19, (java.lang.Object) r20, (float) r21)
            r3.add(r15)
            goto L_0x0019
        L_0x0076:
            X.0Wt r4 = X.AnonymousClass001.A0b(r3, r0)
            java.lang.Object r4 = r4.A0F
            if (r4 != 0) goto L_0x0019
            java.lang.Float r19 = java.lang.Float.valueOf(r21)
            r16 = 0
            float r4 = r1.A00
            java.lang.Float r18 = java.lang.Float.valueOf(r4)
            X.0Wt r15 = new X.0Wt
            r17 = r1
            r20 = r19
            r15.<init>((android.view.animation.Interpolator) r16, (X.AnonymousClass0QL) r17, (java.lang.Float) r18, (java.lang.Object) r19, (java.lang.Object) r20, (float) r21)
            r3.set(r0, r15)
            goto L_0x0019
        L_0x0097:
            X.0uC r14 = X.AnonymousClass0VN.A01(r1, r2)
            goto L_0x0019
        L_0x009d:
            r2.A0H()
        L_0x00a0:
            boolean r3 = r2.A0N()
            if (r3 == 0) goto L_0x00ba
            X.0T2 r3 = A00
            int r3 = r2.A0A(r3)
            if (r3 == 0) goto L_0x00b5
            r2.A0K()
            r2.A0L()
            goto L_0x00a0
        L_0x00b5:
            X.0g6 r12 = X.AnonymousClass0VN.A00(r1, r2)
            goto L_0x00a0
        L_0x00ba:
            r2.A0J()
            goto L_0x0019
        L_0x00bf:
            X.0gQ r4 = X.C09580gQ.A00
            r3 = 1065353216(0x3f800000, float:1.0)
            java.util.List r1 = X.AnonymousClass0VP.A00(r1, r4, r2, r3, r0)
            X.0Bp r13 = new X.0Bp
            r13.<init>(r1)
            goto L_0x0019
        L_0x00ce:
            if (r5 == 0) goto L_0x00d3
            r2.A0J()
        L_0x00d3:
            if (r12 == 0) goto L_0x00ec
            boolean r1 = r12.BJ2()
            if (r1 == 0) goto L_0x00ed
            java.util.List r1 = r12.A00
            X.0Wt r1 = X.AnonymousClass001.A0b(r1, r0)
            java.lang.Object r2 = r1.A0F
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            r1 = 0
            boolean r1 = r2.equals(r1, r1)
            if (r1 == 0) goto L_0x00ed
        L_0x00ec:
            r12 = 0
        L_0x00ed:
            if (r14 == 0) goto L_0x010c
            boolean r1 = r14 instanceof X.C09370g5
            if (r1 != 0) goto L_0x010d
            boolean r1 = r14.BJ2()
            if (r1 == 0) goto L_0x010d
            java.util.List r1 = r14.B8y()
            X.0Wt r1 = X.AnonymousClass001.A0b(r1, r0)
            java.lang.Object r2 = r1.A0F
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            r1 = 0
            boolean r1 = r2.equals(r1, r1)
            if (r1 == 0) goto L_0x010d
        L_0x010c:
            r14 = 0
        L_0x010d:
            if (r6 == 0) goto L_0x0126
            boolean r1 = r6.BJ2()
            if (r1 == 0) goto L_0x0127
            java.util.List r1 = r6.A00
            X.0Wt r1 = X.AnonymousClass001.A0b(r1, r0)
            java.lang.Object r1 = r1.A0F
            float r2 = X.AnonymousClass001.A05(r1)
            r1 = 0
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0127
        L_0x0126:
            r6 = 0
        L_0x0127:
            if (r13 == 0) goto L_0x0147
            boolean r1 = r13.BJ2()
            if (r1 == 0) goto L_0x0148
            java.util.List r1 = r13.A00
            X.0Wt r1 = X.AnonymousClass001.A0b(r1, r0)
            java.lang.Object r3 = r1.A0F
            X.0TZ r3 = (X.AnonymousClass0TZ) r3
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r3.A00
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0148
            float r1 = r3.A01
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0148
        L_0x0147:
            r13 = 0
        L_0x0148:
            if (r9 == 0) goto L_0x0161
            boolean r1 = r9.BJ2()
            if (r1 == 0) goto L_0x0162
            java.util.List r1 = r9.A00
            X.0Wt r1 = X.AnonymousClass001.A0b(r1, r0)
            java.lang.Object r1 = r1.A0F
            float r2 = X.AnonymousClass001.A05(r1)
            r1 = 0
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0162
        L_0x0161:
            r9 = 0
        L_0x0162:
            if (r10 == 0) goto L_0x017b
            boolean r1 = r10.BJ2()
            if (r1 == 0) goto L_0x017c
            java.util.List r1 = r10.A00
            X.0Wt r0 = X.AnonymousClass001.A0b(r1, r0)
            java.lang.Object r0 = r0.A0F
            float r1 = X.AnonymousClass001.A05(r0)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x017c
        L_0x017b:
            r10 = 0
        L_0x017c:
            X.0gJ r5 = new X.0gJ
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05140Sc.A00(X.0QL, X.0hz):X.0gJ");
    }
}
