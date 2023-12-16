package X;

/* renamed from: X.0Va  reason: invalid class name and case insensitive filesystem */
public class C05800Va {
    public static final AnonymousClass0T2 A00 = AnonymousClass0T2.A00("nm");
    public static final AnonymousClass0T2 A01 = AnonymousClass0T2.A00("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");
    public static final AnonymousClass0T2 A02 = AnonymousClass0T2.A00("d", "a");

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01c9, code lost:
        r2.A0I();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C04510Oo A00(X.AnonymousClass0QL r62, X.C10470hz r63) {
        /*
            X.0FS r34 = X.AnonymousClass0FS.NONE
            java.util.ArrayList r26 = X.AnonymousClass001.A0s()
            java.util.ArrayList r25 = X.AnonymousClass001.A0s()
            r2 = r63
            r2.A0H()
            java.lang.String r14 = "UNSET"
            r36 = 0
            r13 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r61 = java.lang.Float.valueOf(r0)
            r58 = 0
            java.lang.Float r56 = java.lang.Float.valueOf(r58)
            r32 = r36
            r24 = r36
            r12 = r36
            r29 = r12
            r15 = 0
            r17 = -1
            r63 = 0
            r11 = 0
            r19 = 0
            r20 = 0
            r44 = 0
            r40 = 1065353216(0x3f800000, float:1.0)
            r41 = 0
            r21 = 0
            r22 = 0
            r51 = 0
            r23 = r12
            r33 = r12
        L_0x0043:
            boolean r1 = r2.A0N()
            r0 = r62
            if (r1 == 0) goto L_0x030b
            X.0T2 r1 = A01
            int r1 = r2.A0A(r1)
            r4 = 1
            r8 = 3
            switch(r1) {
                case 0: goto L_0x005d;
                case 1: goto L_0x0062;
                case 2: goto L_0x0068;
                case 3: goto L_0x006d;
                case 4: goto L_0x007d;
                case 5: goto L_0x0085;
                case 6: goto L_0x0093;
                case 7: goto L_0x00a1;
                case 8: goto L_0x00aa;
                case 9: goto L_0x00af;
                case 10: goto L_0x00e7;
                case 11: goto L_0x01ab;
                case 12: goto L_0x01ce;
                case 13: goto L_0x027a;
                case 14: goto L_0x02c3;
                case 15: goto L_0x02c9;
                case 16: goto L_0x02cf;
                case 17: goto L_0x02de;
                case 18: goto L_0x02ed;
                case 19: goto L_0x02f3;
                case 20: goto L_0x02f9;
                case 21: goto L_0x02ff;
                case 22: goto L_0x0305;
                default: goto L_0x0056;
            }
        L_0x0056:
            r2.A0K()
            r2.A0L()
            goto L_0x0043
        L_0x005d:
            java.lang.String r14 = r2.A0F()
            goto L_0x0043
        L_0x0062:
            int r0 = r2.A09()
            long r15 = (long) r0
            goto L_0x0043
        L_0x0068:
            java.lang.String r36 = r2.A0F()
            goto L_0x0043
        L_0x006d:
            int r1 = r2.A09()
            X.0Ff r33 = X.C02190Ff.UNKNOWN
            r0 = 6
            if (r1 >= r0) goto L_0x0043
            X.0Ff[] r0 = X.C02190Ff.values()
            r33 = r0[r1]
            goto L_0x0043
        L_0x007d:
            int r0 = r2.A09()
            long r0 = (long) r0
            r17 = r0
            goto L_0x0043
        L_0x0085:
            int r0 = r2.A09()
            float r0 = (float) r0
            float r1 = X.AnonymousClass0Y0.A00()
            float r0 = r0 * r1
            int r0 = (int) r0
            r19 = r0
            goto L_0x0043
        L_0x0093:
            int r0 = r2.A09()
            float r0 = (float) r0
            float r1 = X.AnonymousClass0Y0.A00()
            float r0 = r0 * r1
            int r0 = (int) r0
            r20 = r0
            goto L_0x0043
        L_0x00a1:
            java.lang.String r0 = r2.A0F()
            int r44 = android.graphics.Color.parseColor(r0)
            goto L_0x0043
        L_0x00aa:
            X.0gJ r32 = X.C05140Sc.A00(r0, r2)
            goto L_0x0043
        L_0x00af:
            int r3 = r2.A09()
            X.0FS[] r1 = X.AnonymousClass0FS.values()
            int r1 = r1.length
            if (r3 < r1) goto L_0x00c8
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "Unsupported matte type: "
            r1.append(r4)
            r1.append(r3)
            goto L_0x02ba
        L_0x00c8:
            X.0FS[] r1 = X.AnonymousClass0FS.values()
            r34 = r1[r3]
            int r1 = r34.ordinal()
            if (r1 == r8) goto L_0x00e4
            r3 = 4
            if (r1 != r3) goto L_0x00dc
            java.lang.String r1 = "Unsupported matte type: Luma Inverted"
        L_0x00d9:
            X.AnonymousClass0QL.A01(r0, r1)
        L_0x00dc:
            int r1 = r0.A03
            int r1 = r1 + 1
            r0.A03 = r1
            goto L_0x0043
        L_0x00e4:
            java.lang.String r1 = "Unsupported matte type: Luma"
            goto L_0x00d9
        L_0x00e7:
            r2.A0G()
        L_0x00ea:
            boolean r1 = r2.A0N()
            if (r1 == 0) goto L_0x01c0
            r2.A0H()
            r1 = 0
            r5 = r1
            r7 = r1
            r6 = 0
        L_0x00f7:
            boolean r3 = r2.A0N()
            if (r3 == 0) goto L_0x019c
            java.lang.String r3 = r2.A0E()
            int r4 = r3.hashCode()
            switch(r4) {
                case 111: goto L_0x018e;
                case 3588: goto L_0x0175;
                case 104433: goto L_0x0168;
                case 3357091: goto L_0x010c;
                default: goto L_0x0108;
            }
        L_0x0108:
            r2.A0L()
            goto L_0x00f7
        L_0x010c:
            java.lang.String r4 = "mode"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0108
            java.lang.String r1 = r2.A0F()
            int r4 = r1.hashCode()
            switch(r4) {
                case 97: goto L_0x015d;
                case 105: goto L_0x014d;
                case 110: goto L_0x0142;
                case 115: goto L_0x0137;
                default: goto L_0x011f;
            }
        L_0x011f:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "Unknown mask mode "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = ". Defaulting to Add."
            java.lang.String r1 = X.AnonymousClass000.A0X(r3, r1)
            X.AnonymousClass0S3.A00(r1)
            X.0Ft r1 = X.C02330Ft.MASK_MODE_ADD
            goto L_0x00f7
        L_0x0137:
            java.lang.String r4 = "s"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x011f
            X.0Ft r1 = X.C02330Ft.MASK_MODE_SUBTRACT
            goto L_0x00f7
        L_0x0142:
            java.lang.String r4 = "n"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x011f
            X.0Ft r1 = X.C02330Ft.MASK_MODE_NONE
            goto L_0x00f7
        L_0x014d:
            java.lang.String r4 = "i"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x011f
            java.lang.String r1 = "Animation contains intersect masks. They are not supported but will be treated like add masks."
            X.AnonymousClass0QL.A01(r0, r1)
            X.0Ft r1 = X.C02330Ft.MASK_MODE_INTERSECT
            goto L_0x00f7
        L_0x015d:
            java.lang.String r4 = "a"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x011f
            X.0Ft r1 = X.C02330Ft.MASK_MODE_ADD
            goto L_0x00f7
        L_0x0168:
            java.lang.String r4 = "inv"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0108
            boolean r6 = r2.A0O()
            goto L_0x00f7
        L_0x0175:
            java.lang.String r4 = "pt"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0108
            float r4 = X.AnonymousClass0Y0.A00()
            X.0gS r3 = X.C09600gS.A00
            java.util.List r3 = X.AnonymousClass0VP.A00(r0, r3, r2, r4, r13)
            X.0Bl r5 = new X.0Bl
            r5.<init>(r3)
            goto L_0x00f7
        L_0x018e:
            java.lang.String r4 = "o"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0108
            X.0Bo r7 = X.AnonymousClass0VA.A02(r0, r2)
            goto L_0x00f7
        L_0x019c:
            r2.A0J()
            X.0MD r3 = new X.0MD
            r3.<init>(r7, r5, r1, r6)
            r1 = r26
            r1.add(r3)
            goto L_0x00ea
        L_0x01ab:
            r2.A0G()
        L_0x01ae:
            boolean r1 = r2.A0N()
            if (r1 == 0) goto L_0x01c9
            X.0sh r3 = X.AnonymousClass0VO.A02(r0, r2)
            if (r3 == 0) goto L_0x01ae
            r1 = r25
            r1.add(r3)
            goto L_0x01ae
        L_0x01c0:
            int r3 = r26.size()
            int r1 = r0.A03
            int r1 = r1 + r3
            r0.A03 = r1
        L_0x01c9:
            r2.A0I()
            goto L_0x0043
        L_0x01ce:
            r2.A0H()
        L_0x01d1:
            boolean r1 = r2.A0N()
            if (r1 == 0) goto L_0x0275
            X.0T2 r1 = A02
            int r1 = r2.A0A(r1)
            if (r1 == 0) goto L_0x0264
            if (r1 == r4) goto L_0x01e8
            r2.A0K()
            r2.A0L()
            goto L_0x01d1
        L_0x01e8:
            r2.A0G()
            boolean r1 = r2.A0N()
            if (r1 == 0) goto L_0x0255
            r2.A0H()
            r3 = 0
            r12 = r3
        L_0x01f6:
            boolean r1 = r2.A0N()
            if (r1 == 0) goto L_0x024b
            X.0T2 r1 = X.C05130Sb.A01
            int r1 = r2.A0A(r1)
            if (r1 == 0) goto L_0x020b
            r2.A0K()
            r2.A0L()
            goto L_0x01f6
        L_0x020b:
            r2.A0H()
            r5 = 0
            r10 = r3
            r9 = r3
            r7 = r3
        L_0x0212:
            boolean r1 = r2.A0N()
            if (r1 == 0) goto L_0x0242
            X.0T2 r1 = X.C05130Sb.A00
            int r1 = r2.A0A(r1)
            if (r1 == 0) goto L_0x023d
            if (r1 == r4) goto L_0x0238
            r6 = 2
            if (r1 == r6) goto L_0x0233
            if (r1 == r8) goto L_0x022e
            r2.A0K()
            r2.A0L()
            goto L_0x0212
        L_0x022e:
            X.0Bn r7 = X.AnonymousClass0VA.A01(r0, r2, r4)
            goto L_0x0212
        L_0x0233:
            X.0Bn r9 = X.AnonymousClass0VA.A01(r0, r2, r4)
            goto L_0x0212
        L_0x0238:
            X.0Bi r10 = X.AnonymousClass0VA.A00(r0, r2)
            goto L_0x0212
        L_0x023d:
            X.0Bi r5 = X.AnonymousClass0VA.A00(r0, r2)
            goto L_0x0212
        L_0x0242:
            r2.A0J()
            X.0MC r12 = new X.0MC
            r12.<init>(r5, r10, r9, r7)
            goto L_0x01f6
        L_0x024b:
            r2.A0J()
            if (r12 != 0) goto L_0x0255
            X.0MC r12 = new X.0MC
            r12.<init>(r3, r3, r3, r3)
        L_0x0255:
            boolean r1 = r2.A0N()
            if (r1 == 0) goto L_0x025f
            r2.A0L()
            goto L_0x0255
        L_0x025f:
            r2.A0I()
            goto L_0x01d1
        L_0x0264:
            X.0gR r3 = X.C09590gR.A00
            r1 = 1065353216(0x3f800000, float:1.0)
            java.util.List r3 = X.AnonymousClass0VP.A00(r0, r3, r2, r1, r13)
            X.0Bm r24 = new X.0Bm
            r1 = r24
            r1.<init>(r3)
            goto L_0x01d1
        L_0x0275:
            r2.A0J()
            goto L_0x0043
        L_0x027a:
            r2.A0G()
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
        L_0x0281:
            boolean r1 = r2.A0N()
            if (r1 == 0) goto L_0x02ab
            r2.A0H()
        L_0x028a:
            boolean r1 = r2.A0N()
            if (r1 == 0) goto L_0x02a7
            X.0T2 r1 = A00
            int r1 = r2.A0A(r1)
            if (r1 == 0) goto L_0x029f
            r2.A0K()
            r2.A0L()
            goto L_0x028a
        L_0x029f:
            java.lang.String r1 = r2.A0F()
            r3.add(r1)
            goto L_0x028a
        L_0x02a7:
            r2.A0J()
            goto L_0x0281
        L_0x02ab:
            r2.A0I()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: "
            r1.append(r4)
            r1.append(r3)
        L_0x02ba:
            java.lang.String r1 = r1.toString()
            X.AnonymousClass0QL.A01(r0, r1)
            goto L_0x0043
        L_0x02c3:
            float r40 = X.C10470hz.A03(r2)
            goto L_0x0043
        L_0x02c9:
            float r41 = X.C10470hz.A03(r2)
            goto L_0x0043
        L_0x02cf:
            int r0 = r2.A09()
            float r0 = (float) r0
            float r1 = X.AnonymousClass0Y0.A00()
            float r0 = r0 * r1
            int r0 = (int) r0
            r21 = r0
            goto L_0x0043
        L_0x02de:
            int r0 = r2.A09()
            float r0 = (float) r0
            float r1 = X.AnonymousClass0Y0.A00()
            float r0 = r0 * r1
            int r0 = (int) r0
            r22 = r0
            goto L_0x0043
        L_0x02ed:
            float r63 = X.C10470hz.A03(r2)
            goto L_0x0043
        L_0x02f3:
            float r11 = X.C10470hz.A03(r2)
            goto L_0x0043
        L_0x02f9:
            X.0Bn r29 = X.AnonymousClass0VA.A01(r0, r2, r13)
            goto L_0x0043
        L_0x02ff:
            java.lang.String r23 = r2.A0F()
            goto L_0x0043
        L_0x0305:
            boolean r51 = r2.A0O()
            goto L_0x0043
        L_0x030b:
            r2.A0J()
            float r63 = r63 / r40
            float r11 = r11 / r40
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
            int r2 = (r63 > r58 ? 1 : (r63 == r58 ? 0 : -1))
            if (r2 <= 0) goto L_0x032e
            r53 = 0
            java.lang.Float r55 = java.lang.Float.valueOf(r63)
            X.0Wt r2 = new X.0Wt
            r52 = r2
            r54 = r0
            r57 = r56
            r52.<init>((android.view.animation.Interpolator) r53, (X.AnonymousClass0QL) r54, (java.lang.Float) r55, (java.lang.Object) r56, (java.lang.Object) r57, (float) r58)
            r1.add(r2)
        L_0x032e:
            int r2 = (r11 > r58 ? 1 : (r11 == r58 ? 0 : -1))
            if (r2 > 0) goto L_0x0334
            float r11 = r0.A00
        L_0x0334:
            r58 = 0
            java.lang.Float r60 = java.lang.Float.valueOf(r11)
            X.0Wt r2 = new X.0Wt
            r57 = r2
            r59 = r0
            r62 = r61
            r57.<init>((android.view.animation.Interpolator) r58, (X.AnonymousClass0QL) r59, (java.lang.Float) r60, (java.lang.Object) r61, (java.lang.Object) r62, (float) r63)
            r1.add(r2)
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            java.lang.Float r5 = java.lang.Float.valueOf(r2)
            X.0Wt r2 = new X.0Wt
            r7 = r56
            r3 = r58
            r4 = r0
            r6 = r7
            r8 = r11
            r2.<init>((android.view.animation.Interpolator) r3, (X.AnonymousClass0QL) r4, (java.lang.Float) r5, (java.lang.Object) r6, (java.lang.Object) r7, (float) r8)
            r1.add(r2)
            java.lang.String r2 = ".ai"
            boolean r2 = r14.endsWith(r2)
            if (r2 != 0) goto L_0x0370
            java.lang.String r3 = "ai"
            r2 = r23
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0375
        L_0x0370:
            java.lang.String r2 = "Convert your Illustrator layers to shape layers."
            X.AnonymousClass0QL.A01(r0, r2)
        L_0x0375:
            X.0Oo r27 = new X.0Oo
            r35 = r14
            r37 = r25
            r38 = r26
            r39 = r1
            r42 = r19
            r43 = r20
            r45 = r21
            r46 = r22
            r47 = r15
            r49 = r17
            r28 = r0
            r30 = r24
            r31 = r12
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r49, r51)
            return r27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05800Va.A00(X.0QL, X.0hz):X.0Oo");
    }
}
