package X;

/* renamed from: X.6JN  reason: invalid class name */
public class AnonymousClass6JN extends AnonymousClass0Y3 {
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02b7, code lost:
        if (r5.equals("reverse") == false) goto L_0x02b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02db, code lost:
        if (r2.equals("radial") == false) goto L_0x02dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02ff, code lost:
        if (r0 == false) goto L_0x0295;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable A06(X.C153427bI r17, X.AnonymousClass84O r18, X.AnonymousClass84O r19) {
        /*
            r16 = this;
            r1 = r18
            int r3 = r1.A03
            r0 = 13761(0x35c1, float:1.9283E-41)
            r2 = r17
            if (r3 == r0) goto L_0x01b6
            r0 = 15775(0x3d9f, float:2.2105E-41)
            if (r3 == r0) goto L_0x0119
            r0 = 16526(0x408e, float:2.3158E-41)
            if (r3 == r0) goto L_0x001b
            r0 = r16
            r3 = r19
            android.graphics.drawable.Drawable r9 = super.A06(r2, r1, r3)
            return r9
        L_0x001b:
            java.lang.String r5 = "CDSShadowDrawableV2Utils"
            android.content.Context r7 = r2.A00
            r3 = 43
            java.lang.String r0 = "rectangle"
            java.lang.String r9 = r1.A0P(r3, r0)
            X.0FI[] r8 = X.AnonymousClass0FI.A00
            int r6 = r8.length
            r3 = 0
        L_0x002b:
            if (r3 >= r6) goto L_0x003c
            r4 = r8[r3]
            java.lang.String r0 = r4.toString()
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x004b
            int r3 = r3 + 1
            goto L_0x002b
        L_0x003c:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Error finding Shape enum value for: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r9, r3)
            X.C159737mN.A01(r5, r0)
            X.0FI r4 = X.AnonymousClass0FI.RECTANGLE
        L_0x004b:
            r0 = 42
            java.lang.Object r9 = X.AnonymousClass84O.A05(r1, r0)
            java.lang.String r9 = (java.lang.String) r9
            r6 = 1098907648(0x41800000, float:16.0)
            r15 = 0
            float r0 = X.AnonymousClass0J7.A00(r7, r6)     // Catch:{ 6u2 -> 0x0065 }
            if (r9 == 0) goto L_0x0060
            float r0 = X.C162407s0.A01(r9)     // Catch:{ 6u2 -> 0x0065 }
        L_0x0060:
            float r11 = java.lang.Math.max(r15, r0)     // Catch:{ 6u2 -> 0x0065 }
            goto L_0x0077
        L_0x0065:
            r8 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Error parsing shadow radius: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r9, r3)
            X.C159737mN.A00(r2, r5, r0, r8)
            float r11 = X.AnonymousClass0J7.A00(r7, r6)
        L_0x0077:
            r0 = 36
            X.84O r3 = r1.A0K(r0)
            if (r3 == 0) goto L_0x00a3
            r0 = 0
            int r14 = X.C154127ce.A01(r2, r3, r0)
        L_0x0084:
            r0 = 41
            X.84O r3 = r1.A0K(r0)
            if (r3 == 0) goto L_0x009f
            r0 = 0
            int r12 = X.C154127ce.A01(r2, r3, r0)
        L_0x0091:
            X.0FI r0 = X.AnonymousClass0FI.CIRCLE
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00a5
            X.018 r9 = new X.018
            r9.<init>(r12, r14, r11)
            return r9
        L_0x009f:
            r12 = -13350828(0xffffffffff344854, float:-2.3963659E38)
            goto L_0x0091
        L_0x00a3:
            r14 = 0
            goto L_0x0084
        L_0x00a5:
            java.lang.String r9 = X.AnonymousClass84O.A06(r1)
            r8 = 1082130432(0x40800000, float:4.0)
            float r0 = X.AnonymousClass0J7.A00(r7, r8)     // Catch:{ 6u2 -> 0x00ba }
            if (r9 == 0) goto L_0x00b5
            float r0 = X.C162407s0.A01(r9)     // Catch:{ 6u2 -> 0x00ba }
        L_0x00b5:
            float r10 = java.lang.Math.max(r15, r0)     // Catch:{ 6u2 -> 0x00ba }
            goto L_0x00cc
        L_0x00ba:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Error parsing corner radius: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r9, r3)
            X.C159737mN.A00(r2, r5, r0, r4)
            float r10 = X.AnonymousClass0J7.A00(r7, r8)
        L_0x00cc:
            r0 = 38
            java.lang.Object r8 = X.AnonymousClass84O.A05(r1, r0)
            java.lang.String r8 = (java.lang.String) r8
            float r0 = X.AnonymousClass0J7.A00(r7, r6)     // Catch:{ 6u2 -> 0x00e3 }
            if (r8 == 0) goto L_0x00de
            float r0 = X.C162407s0.A01(r8)     // Catch:{ 6u2 -> 0x00e3 }
        L_0x00de:
            float r13 = java.lang.Math.max(r15, r0)     // Catch:{ 6u2 -> 0x00e3 }
            goto L_0x00f2
        L_0x00e3:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Error parsing horizontal offset: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r8, r3)
            X.C159737mN.A00(r2, r5, r0, r4)
            r13 = 0
        L_0x00f2:
            java.lang.String r4 = X.AnonymousClass84O.A08(r1)
            float r0 = X.AnonymousClass0J7.A00(r7, r6)     // Catch:{ 6u2 -> 0x0105 }
            if (r4 == 0) goto L_0x0100
            float r0 = X.C162407s0.A01(r4)     // Catch:{ 6u2 -> 0x0105 }
        L_0x0100:
            float r15 = java.lang.Math.max(r15, r0)     // Catch:{ 6u2 -> 0x0105 }
            goto L_0x0113
        L_0x0105:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Error parsing vertical offset: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r4, r1)
            X.C159737mN.A00(r2, r5, r0, r3)
        L_0x0113:
            X.019 r9 = new X.019
            r9.<init>(r10, r11, r12, r13, r14, r15)
            return r9
        L_0x0119:
            r3 = 38
            java.lang.String r0 = "primary"
            java.lang.String r3 = r1.A0P(r3, r0)
            java.lang.String r0 = "circular"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0131
            android.content.Context r0 = r2.A00
            X.01C r9 = new X.01C
            r9.<init>(r0, r2)
            return r9
        L_0x0131:
            java.lang.String r0 = "elevated"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x019e
            X.0GA r5 = X.AnonymousClass0GA.ELEVATED
        L_0x013b:
            r0 = 36
            X.84O r3 = r1.A0K(r0)
            if (r3 == 0) goto L_0x019c
            r0 = 0
            int r7 = X.C154127ce.A01(r2, r3, r0)
        L_0x0148:
            r0 = 35
            java.util.List r0 = r1.A0S(r0)
            java.util.Iterator r3 = r0.iterator()
            r8 = 0
        L_0x0153:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01ac
            java.lang.String r1 = X.AnonymousClass001.A0m(r3)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1383228885: goto L_0x0191;
                case 96673: goto L_0x0186;
                case 115029: goto L_0x017b;
                case 3317767: goto L_0x0170;
                case 108511772: goto L_0x0165;
                default: goto L_0x0164;
            }
        L_0x0164:
            goto L_0x0153
        L_0x0165:
            java.lang.String r0 = "right"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0153
            r8 = r8 | 4
            goto L_0x0153
        L_0x0170:
            java.lang.String r0 = "left"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0153
            r8 = r8 | 2
            goto L_0x0153
        L_0x017b:
            java.lang.String r0 = "top"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0153
            r8 = r8 | 1
            goto L_0x0153
        L_0x0186:
            java.lang.String r0 = "all"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0153
            r8 = r8 | 15
            goto L_0x0153
        L_0x0191:
            java.lang.String r0 = "bottom"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0153
            r8 = r8 | 8
            goto L_0x0153
        L_0x019c:
            r7 = 0
            goto L_0x0148
        L_0x019e:
            java.lang.String r0 = "persistent"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x01a9
            X.0GA r5 = X.AnonymousClass0GA.PERSISTENT
            goto L_0x013b
        L_0x01a9:
            X.0GA r5 = X.AnonymousClass0GA.PRIMARY
            goto L_0x013b
        L_0x01ac:
            android.content.Context r4 = r2.A00
            X.01D r9 = new X.01D
            r3 = r9
            r6 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            return r9
        L_0x01b6:
            X.4Ls r9 = new X.4Ls
            r9.<init>()
            r0 = 41
            r8 = 0
            boolean r0 = r1.A0W(r0, r8)
            if (r0 == 0) goto L_0x030e
            X.6NM r4 = new X.6NM
            r4.<init>()
        L_0x01c9:
            boolean r0 = r4 instanceof X.AnonymousClass6NM
            if (r0 == 0) goto L_0x01fa
            r0 = 38
            X.84O r5 = r1.A0K(r0)
            r0 = 50
            X.84O r7 = r1.A0K(r0)
            if (r5 == 0) goto L_0x01dd
            if (r7 != 0) goto L_0x01e4
        L_0x01dd:
            java.lang.String r3 = "ShimmerDrawableUtils"
            java.lang.String r0 = "Base Color or highlight color were null for a Color highlight Shimmer Drawable"
            X.C159737mN.A01(r3, r0)
        L_0x01e4:
            if (r5 != 0) goto L_0x0308
            r6 = 0
        L_0x01e7:
            X.7QQ r5 = r4.A00
            int r3 = r5.A05
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3 = r3 & r0
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r6 = r6 & r0
            r6 = r6 | r3
            r5.A05 = r6
            if (r7 != 0) goto L_0x0302
            r0 = 0
        L_0x01f8:
            r5.A09 = r0
        L_0x01fa:
            r2 = 40
            r0 = 1
            boolean r0 = r1.A0W(r2, r0)
            X.7QQ r3 = r4.A00
            r3.A0H = r0
            r2 = 36
            r0 = 1050253722(0x3e99999a, float:0.3)
            float r0 = r1.A0B(r2, r0)
            r4.A02(r0)
            r0 = 49
            r7 = 1065353216(0x3f800000, float:1.0)
            float r0 = r1.A0B(r0, r7)
            r4.A04(r0)
            r2 = 44
            r0 = 1000(0x3e8, float:1.401E-42)
            int r0 = r1.A0E(r2, r0)
            long r5 = (long) r0
            r4.A06(r5)
            r2 = 52
            r0 = -1
            int r0 = r1.A0E(r2, r0)
            r3.A0A = r0
            r0 = 53
            int r0 = r1.A0E(r0, r8)
            long r5 = (long) r0
            r4.A07(r5)
            r2 = 43
            r0 = 1056964608(0x3f000000, float:0.5)
            float r0 = r1.A0B(r2, r0)
            r4.A03(r0)
            r0 = 46
            int r2 = r1.A0E(r0, r8)
            if (r2 < 0) goto L_0x0342
            r3.A08 = r2
            r0 = 45
            int r2 = r1.A0E(r0, r8)
            if (r2 < 0) goto L_0x0337
            r3.A07 = r2
            r0 = 51
            r5 = 0
            float r0 = r1.A0B(r0, r5)
            r4.A05(r0)
            r0 = 57
            float r2 = r1.A0B(r0, r7)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0326
            r3.A04 = r2
            r0 = 48
            float r2 = r1.A0B(r0, r7)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0315
            r3.A01 = r2
            r0 = 56
            float r0 = r1.A0B(r0, r5)
            r3.A03 = r0
            r0 = 42
            java.lang.Object r2 = X.AnonymousClass84O.A05(r1, r0)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0295
            int r0 = r2.hashCode()
            switch(r0) {
                case -1118360059: goto L_0x02e8;
                case -1085344219: goto L_0x02f0;
                case -87315416: goto L_0x02f8;
                default: goto L_0x0295;
            }
        L_0x0295:
            r2 = 0
        L_0x0296:
            r3.A06 = r2
            r0 = 54
            java.lang.Object r5 = X.AnonymousClass84O.A05(r1, r0)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x02b9
            int r2 = r5.hashCode()
            r0 = 1097506319(0x416a9e0f, float:14.663589)
            if (r2 == r0) goto L_0x02b9
            r0 = 1099846370(0x418e52e2, float:17.79047)
            if (r2 != r0) goto L_0x02b9
            java.lang.String r0 = "reverse"
            boolean r0 = r5.equals(r0)
            r2 = 2
            if (r0 != 0) goto L_0x02ba
        L_0x02b9:
            r2 = 1
        L_0x02ba:
            r3.A0B = r2
            r0 = 55
            java.lang.Object r2 = X.AnonymousClass84O.A05(r1, r0)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x02dd
            int r1 = r2.hashCode()
            r0 = -1102672091(0xffffffffbe468f25, float:-0.19390543)
            if (r1 == r0) goto L_0x02dd
            r0 = -938579425(0xffffffffc80e6a1f, float:-145832.48)
            if (r1 != r0) goto L_0x02dd
            java.lang.String r0 = "radial"
            boolean r0 = r2.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x02de
        L_0x02dd:
            r1 = 0
        L_0x02de:
            r3.A0C = r1
            X.7QQ r0 = r4.A01()
            r9.A02(r0)
            return r9
        L_0x02e8:
            java.lang.String r0 = "top_to_bottom"
            boolean r0 = r2.equals(r0)
            r2 = 1
            goto L_0x02ff
        L_0x02f0:
            java.lang.String r0 = "bottom_to_top"
            boolean r0 = r2.equals(r0)
            r2 = 3
            goto L_0x02ff
        L_0x02f8:
            java.lang.String r0 = "right_to_left"
            boolean r0 = r2.equals(r0)
            r2 = 2
        L_0x02ff:
            if (r0 != 0) goto L_0x0296
            goto L_0x0295
        L_0x0302:
            int r0 = X.C154127ce.A01(r2, r7, r8)
            goto L_0x01f8
        L_0x0308:
            int r6 = X.C154127ce.A01(r2, r5, r8)
            goto L_0x01e7
        L_0x030e:
            X.6NL r4 = new X.6NL
            r4.<init>()
            goto L_0x01c9
        L_0x0315:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Given invalid height ratio: "
            r1.append(r0)
            r1.append(r2)
            java.lang.IllegalArgumentException r0 = X.C18310x6.A0d(r1)
            throw r0
        L_0x0326:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Given invalid width ratio: "
            r1.append(r0)
            r1.append(r2)
            java.lang.IllegalArgumentException r0 = X.C18310x6.A0d(r1)
            throw r0
        L_0x0337:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Given invalid height: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r2)
            throw r0
        L_0x0342:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Given invalid width: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6JN.A06(X.7bI, X.84O, X.84O):android.graphics.drawable.Drawable");
    }

    public boolean A07(AnonymousClass84O r3) {
        int i = r3.A03;
        if (i == 13761) {
            return r3.A0W(40, true);
        }
        if (i == 15775 || i == 16526) {
            return false;
        }
        return super.A07(r3);
    }
}
