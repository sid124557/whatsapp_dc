package X;

import java.util.Collections;

/* renamed from: X.0VO  reason: invalid class name */
public class AnonymousClass0VO {
    public static AnonymousClass0T2 A00 = AnonymousClass0T2.A00("ty", "d");

    public static C01620Bo A00(C01620Bo r1) {
        if (r1 == null) {
            return new C01620Bo(Collections.singletonList(new C06230Wt(100)));
        }
        return r1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: X.0FR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: X.0Bo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: X.0Bl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: X.0Bn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v27, resolved type: X.0Fw} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [X.0sh] */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r8v12 */
    /* JADX WARNING: type inference failed for: r8v13 */
    /* JADX WARNING: type inference failed for: r8v18 */
    /* JADX WARNING: type inference failed for: r8v24, types: [X.0uC] */
    /* JADX WARNING: type inference failed for: r8v28 */
    /* JADX WARNING: type inference failed for: r8v37 */
    /* JADX WARNING: type inference failed for: r8v40 */
    /* JADX WARNING: type inference failed for: r8v41 */
    /* JADX WARNING: type inference failed for: r8v44, types: [X.0uC] */
    /* JADX WARNING: type inference failed for: r8v47 */
    /* JADX WARNING: type inference failed for: r4v38 */
    /* JADX WARNING: type inference failed for: r8v54 */
    /* JADX WARNING: type inference failed for: r8v67 */
    /* JADX WARNING: type inference failed for: r8v68 */
    /* JADX WARNING: type inference failed for: r8v80 */
    /* JADX WARNING: type inference failed for: r8v86 */
    /* JADX WARNING: type inference failed for: r7v27, types: [X.0g8] */
    /* JADX WARNING: type inference failed for: r8v93 */
    /* JADX WARNING: type inference failed for: r6v30, types: [X.0gG] */
    /* JADX WARNING: type inference failed for: r8v100 */
    /* JADX WARNING: type inference failed for: r8v105 */
    /* JADX WARNING: type inference failed for: r8v111 */
    /* JADX WARNING: type inference failed for: r8v112 */
    /* JADX WARNING: type inference failed for: r8v123 */
    /* JADX WARNING: type inference failed for: r8v131 */
    /* JADX WARNING: type inference failed for: r6v31, types: [X.0g7] */
    /* JADX WARNING: type inference failed for: r8v138 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        if (r0.A0N() == false) goto L_0x0629;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        r0.A0L();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x04dd, code lost:
        r8 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0618, code lost:
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0629, code lost:
        r0.A0J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x062c, code lost:
        return r8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C16240sh A02(X.AnonymousClass0QL r20, X.C10470hz r21) {
        /*
            r0 = r21
            r0.A0H()
            r6 = 2
        L_0x0006:
            boolean r1 = r0.A0N()
            r2 = 1
            r8 = 0
            if (r1 == 0) goto L_0x0638
            X.0T2 r1 = A00
            int r1 = r0.A0A(r1)
            if (r1 == 0) goto L_0x0024
            if (r1 == r2) goto L_0x001f
            r0.A0K()
            r0.A0L()
            goto L_0x0006
        L_0x001f:
            int r6 = r0.A09()
            goto L_0x0006
        L_0x0024:
            java.lang.String r3 = r0.A0F()
            if (r3 == 0) goto L_0x0638
            int r2 = r3.hashCode()
            r1 = r20
            switch(r2) {
                case 3239: goto L_0x004a;
                case 3270: goto L_0x009f;
                case 3295: goto L_0x0102;
                case 3307: goto L_0x019f;
                case 3308: goto L_0x01ed;
                case 3488: goto L_0x0322;
                case 3633: goto L_0x037f;
                case 3646: goto L_0x03cb;
                case 3669: goto L_0x0417;
                case 3679: goto L_0x0465;
                case 3681: goto L_0x04e0;
                case 3705: goto L_0x05bb;
                case 3710: goto L_0x061b;
                default: goto L_0x0033;
            }
        L_0x0033:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "Unknown shape type "
            java.lang.String r1 = X.AnonymousClass000.A0V(r1, r3, r2)
            X.AnonymousClass0S3.A00(r1)
        L_0x0040:
            boolean r1 = r0.A0N()
            if (r1 == 0) goto L_0x0629
            r0.A0L()
            goto L_0x0040
        L_0x004a:
            java.lang.String r2 = "el"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0033
            r5 = 1
            r4 = 3
            boolean r10 = X.AnonymousClass000.A1U(r6, r4)
            r9 = 0
            r7 = r8
            r11 = 0
        L_0x005b:
            boolean r2 = r0.A0N()
            if (r2 == 0) goto L_0x0097
            X.0T2 r2 = X.AnonymousClass0SJ.A00
            int r3 = r0.A0A(r2)
            if (r3 == 0) goto L_0x0092
            if (r3 == r5) goto L_0x008d
            r2 = 2
            if (r3 == r2) goto L_0x0088
            if (r3 == r4) goto L_0x0083
            r2 = 4
            if (r3 == r2) goto L_0x007a
            r0.A0K()
            r0.A0L()
            goto L_0x005b
        L_0x007a:
            int r2 = r0.A09()
            boolean r10 = X.AnonymousClass000.A1U(r2, r4)
            goto L_0x005b
        L_0x0083:
            boolean r11 = r0.A0O()
            goto L_0x005b
        L_0x0088:
            X.0Bk r7 = A01(r1, r0)
            goto L_0x005b
        L_0x008d:
            X.0uC r8 = X.AnonymousClass0VN.A01(r1, r0)
            goto L_0x005b
        L_0x0092:
            java.lang.String r9 = r0.A0F()
            goto L_0x005b
        L_0x0097:
            X.0g7 r4 = new X.0g7
            r6 = r4
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x0618
        L_0x009f:
            java.lang.String r2 = "fl"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0033
            r6 = 0
            r5 = 1
            r11 = r8
            r4 = 1
            r14 = 0
            r15 = 0
        L_0x00ad:
            boolean r2 = r0.A0N()
            if (r2 == 0) goto L_0x00ee
            X.0T2 r2 = X.AnonymousClass0SP.A00
            int r3 = r0.A0A(r2)
            if (r3 == 0) goto L_0x00e9
            if (r3 == r5) goto L_0x00e4
            r2 = 2
            if (r3 == r2) goto L_0x00df
            r2 = 3
            if (r3 == r2) goto L_0x00da
            r2 = 4
            if (r3 == r2) goto L_0x00d5
            r2 = 5
            if (r3 == r2) goto L_0x00d0
            r0.A0K()
            r0.A0L()
            goto L_0x00ad
        L_0x00d0:
            boolean r15 = r0.A0O()
            goto L_0x00ad
        L_0x00d5:
            int r4 = r0.A09()
            goto L_0x00ad
        L_0x00da:
            boolean r14 = r0.A0O()
            goto L_0x00ad
        L_0x00df:
            X.0Bo r6 = X.AnonymousClass0VA.A02(r1, r0)
            goto L_0x00ad
        L_0x00e4:
            X.0Bi r11 = X.AnonymousClass0VA.A00(r1, r0)
            goto L_0x00ad
        L_0x00e9:
            java.lang.String r8 = r0.A0F()
            goto L_0x00ad
        L_0x00ee:
            X.0Bo r12 = A00(r6)
            if (r4 != r5) goto L_0x00ff
            android.graphics.Path$FillType r10 = android.graphics.Path.FillType.WINDING
        L_0x00f6:
            X.0gH r9 = new X.0gH
            r13 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r8 = r9
            goto L_0x0040
        L_0x00ff:
            android.graphics.Path$FillType r10 = android.graphics.Path.FillType.EVEN_ODD
            goto L_0x00f6
        L_0x0102:
            java.lang.String r2 = "gf"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0033
            android.graphics.Path$FillType r10 = android.graphics.Path.FillType.WINDING
            r7 = 0
            r15 = r8
            r3 = r8
            r13 = r8
            r14 = r8
            r17 = 0
        L_0x0113:
            boolean r2 = r0.A0N()
            if (r2 == 0) goto L_0x0191
            X.0T2 r2 = X.C05150Se.A01
            int r2 = r0.A0A(r2)
            r5 = 1
            switch(r2) {
                case 0: goto L_0x018c;
                case 1: goto L_0x0156;
                case 2: goto L_0x0151;
                case 3: goto L_0x0145;
                case 4: goto L_0x0140;
                case 5: goto L_0x013b;
                case 6: goto L_0x012f;
                case 7: goto L_0x012a;
                default: goto L_0x0123;
            }
        L_0x0123:
            r0.A0K()
            r0.A0L()
            goto L_0x0113
        L_0x012a:
            boolean r17 = r0.A0O()
            goto L_0x0113
        L_0x012f:
            int r2 = r0.A09()
            if (r2 != r5) goto L_0x0138
            android.graphics.Path$FillType r10 = android.graphics.Path.FillType.WINDING
            goto L_0x0113
        L_0x0138:
            android.graphics.Path$FillType r10 = android.graphics.Path.FillType.EVEN_ODD
            goto L_0x0113
        L_0x013b:
            X.0Bk r14 = A01(r1, r0)
            goto L_0x0113
        L_0x0140:
            X.0Bk r13 = A01(r1, r0)
            goto L_0x0113
        L_0x0145:
            int r2 = r0.A09()
            if (r2 != r5) goto L_0x014e
            X.0FQ r15 = X.AnonymousClass0FQ.LINEAR
            goto L_0x0113
        L_0x014e:
            X.0FQ r15 = X.AnonymousClass0FQ.RADIAL
            goto L_0x0113
        L_0x0151:
            X.0Bo r7 = X.AnonymousClass0VA.A02(r1, r0)
            goto L_0x0113
        L_0x0156:
            r0.A0H()
            r6 = -1
        L_0x015a:
            boolean r2 = r0.A0N()
            if (r2 == 0) goto L_0x0188
            X.0T2 r2 = X.C05150Se.A00
            int r2 = r0.A0A(r2)
            if (r2 == 0) goto L_0x0183
            if (r2 == r5) goto L_0x0171
            r0.A0K()
            r0.A0L()
            goto L_0x015a
        L_0x0171:
            X.0gK r4 = new X.0gK
            r4.<init>(r6)
            r3 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            java.util.List r2 = X.AnonymousClass0VP.A00(r1, r4, r0, r3, r2)
            X.0Bj r3 = new X.0Bj
            r3.<init>(r2)
            goto L_0x015a
        L_0x0183:
            int r6 = r0.A09()
            goto L_0x015a
        L_0x0188:
            r0.A0J()
            goto L_0x0113
        L_0x018c:
            java.lang.String r8 = r0.A0F()
            goto L_0x0113
        L_0x0191:
            X.0Bo r12 = A00(r7)
            X.0g9 r9 = new X.0g9
            r11 = r3
            r16 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x04dd
        L_0x019f:
            java.lang.String r2 = "gr"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0033
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            r5 = 0
            r4 = 0
        L_0x01ad:
            boolean r2 = r0.A0N()
            if (r2 == 0) goto L_0x01e6
            X.0T2 r2 = X.AnonymousClass0SQ.A00
            int r3 = r0.A0A(r2)
            if (r3 == 0) goto L_0x01e1
            r2 = 1
            if (r3 == r2) goto L_0x01dc
            r2 = 2
            if (r3 == r2) goto L_0x01c5
            r0.A0L()
            goto L_0x01ad
        L_0x01c5:
            r0.A0G()
        L_0x01c8:
            boolean r2 = r0.A0N()
            if (r2 == 0) goto L_0x01d8
            X.0sh r2 = A02(r1, r0)
            if (r2 == 0) goto L_0x01c8
            r6.add(r2)
            goto L_0x01c8
        L_0x01d8:
            r0.A0I()
            goto L_0x01ad
        L_0x01dc:
            boolean r4 = r0.A0O()
            goto L_0x01ad
        L_0x01e1:
            java.lang.String r5 = r0.A0F()
            goto L_0x01ad
        L_0x01e6:
            X.0gE r8 = new X.0gE
            r8.<init>(r5, r6, r4)
            goto L_0x0040
        L_0x01ed:
            java.lang.String r2 = "gs"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0033
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            r18 = 0
            r15 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r9 = 0
            r16 = 0
            r17 = 0
            r20 = 0
            r10 = 0
            r21 = 0
            r7 = 0
        L_0x020a:
            boolean r3 = r0.A0N()
            if (r3 == 0) goto L_0x0315
            X.0T2 r3 = X.C05200Sk.A00
            int r3 = r0.A0A(r3)
            switch(r3) {
                case 0: goto L_0x0308;
                case 1: goto L_0x02d0;
                case 2: goto L_0x02ca;
                case 3: goto L_0x02bb;
                case 4: goto L_0x02b5;
                case 5: goto L_0x02af;
                case 6: goto L_0x030e;
                case 7: goto L_0x02a1;
                case 8: goto L_0x0293;
                case 9: goto L_0x028d;
                case 10: goto L_0x0287;
                case 11: goto L_0x0220;
                default: goto L_0x0219;
            }
        L_0x0219:
            r0.A0K()
            r0.A0L()
            goto L_0x020a
        L_0x0220:
            r0.A0G()
        L_0x0223:
            boolean r3 = r0.A0N()
            if (r3 == 0) goto L_0x0274
            r0.A0H()
            r4 = 0
            r6 = 0
        L_0x022e:
            boolean r3 = r0.A0N()
            if (r3 == 0) goto L_0x0250
            X.0T2 r3 = X.C05200Sk.A01
            int r5 = r0.A0A(r3)
            if (r5 == 0) goto L_0x024b
            r3 = 1
            if (r5 == r3) goto L_0x0246
            r0.A0K()
            r0.A0L()
            goto L_0x022e
        L_0x0246:
            X.0Bn r6 = X.AnonymousClass0VA.A01(r1, r0, r3)
            goto L_0x022e
        L_0x024b:
            java.lang.String r4 = r0.A0F()
            goto L_0x022e
        L_0x0250:
            r0.A0J()
            java.lang.String r3 = "o"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x025d
            r10 = r6
            goto L_0x0223
        L_0x025d:
            java.lang.String r3 = "d"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x026d
            java.lang.String r3 = "g"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0223
        L_0x026d:
            r3 = 1
            r1.A0C = r3
            r2.add(r6)
            goto L_0x0223
        L_0x0274:
            r4 = 1
            r0.A0I()
            int r3 = r2.size()
            if (r3 != r4) goto L_0x020a
            r3 = 0
            java.lang.Object r3 = r2.get(r3)
            r2.add(r3)
            goto L_0x020a
        L_0x0287:
            boolean r21 = r0.A0O()
            goto L_0x020a
        L_0x028d:
            float r20 = X.C10470hz.A03(r0)
            goto L_0x020a
        L_0x0293:
            X.0FK[] r5 = X.AnonymousClass0FK.values()
            int r4 = r0.A09()
            r3 = 1
            int r4 = r4 - r3
            r17 = r5[r4]
            goto L_0x020a
        L_0x02a1:
            r5 = 1
            X.0FJ[] r4 = X.AnonymousClass0FJ.values()
            int r3 = r0.A09()
            int r3 = r3 - r5
            r16 = r4[r3]
            goto L_0x020a
        L_0x02af:
            X.0Bk r14 = A01(r1, r0)
            goto L_0x020a
        L_0x02b5:
            X.0Bk r13 = A01(r1, r0)
            goto L_0x020a
        L_0x02bb:
            r4 = 1
            int r3 = r0.A09()
            if (r3 != r4) goto L_0x02c6
            X.0FQ r15 = X.AnonymousClass0FQ.LINEAR
            goto L_0x020a
        L_0x02c6:
            X.0FQ r15 = X.AnonymousClass0FQ.RADIAL
            goto L_0x020a
        L_0x02ca:
            X.0Bo r7 = X.AnonymousClass0VA.A02(r1, r0)
            goto L_0x020a
        L_0x02d0:
            r0.A0H()
            r4 = -1
        L_0x02d4:
            boolean r3 = r0.A0N()
            if (r3 == 0) goto L_0x0303
            X.0T2 r3 = X.C05200Sk.A02
            int r3 = r0.A0A(r3)
            if (r3 == 0) goto L_0x02fe
            r5 = 1
            if (r3 == r5) goto L_0x02ec
            r0.A0K()
            r0.A0L()
            goto L_0x02d4
        L_0x02ec:
            X.0gK r5 = new X.0gK
            r5.<init>(r4)
            r6 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            java.util.List r3 = X.AnonymousClass0VP.A00(r1, r5, r0, r6, r3)
            X.0Bj r11 = new X.0Bj
            r11.<init>(r3)
            goto L_0x02d4
        L_0x02fe:
            int r4 = r0.A09()
            goto L_0x02d4
        L_0x0303:
            r0.A0J()
            goto L_0x020a
        L_0x0308:
            java.lang.String r18 = r0.A0F()
            goto L_0x020a
        L_0x030e:
            r3 = 1
            X.0Bn r9 = X.AnonymousClass0VA.A01(r1, r0, r3)
            goto L_0x020a
        L_0x0315:
            X.0Bo r12 = A00(r7)
            X.0gC r8 = new X.0gC
            r19 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0040
        L_0x0322:
            java.lang.String r2 = "mm"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0033
            r5 = 0
            r4 = 0
        L_0x032c:
            boolean r2 = r0.A0N()
            if (r2 == 0) goto L_0x0372
            X.0T2 r2 = X.AnonymousClass0SL.A00
            int r3 = r0.A0A(r2)
            if (r3 == 0) goto L_0x036d
            r2 = 1
            if (r3 == r2) goto L_0x034c
            r2 = 2
            if (r3 == r2) goto L_0x0347
            r0.A0K()
            r0.A0L()
            goto L_0x032c
        L_0x0347:
            boolean r4 = r0.A0O()
            goto L_0x032c
        L_0x034c:
            int r3 = r0.A09()
            if (r3 == r2) goto L_0x036a
            r2 = 2
            if (r3 == r2) goto L_0x0367
            r2 = 3
            if (r3 == r2) goto L_0x0364
            r2 = 4
            if (r3 == r2) goto L_0x0361
            r2 = 5
            if (r3 != r2) goto L_0x036a
            X.0Fw r8 = X.C02360Fw.EXCLUDE_INTERSECTIONS
            goto L_0x032c
        L_0x0361:
            X.0Fw r8 = X.C02360Fw.INTERSECT
            goto L_0x032c
        L_0x0364:
            X.0Fw r8 = X.C02360Fw.SUBTRACT
            goto L_0x032c
        L_0x0367:
            X.0Fw r8 = X.C02360Fw.ADD
            goto L_0x032c
        L_0x036a:
            X.0Fw r8 = X.C02360Fw.MERGE
            goto L_0x032c
        L_0x036d:
            java.lang.String r5 = r0.A0F()
            goto L_0x032c
        L_0x0372:
            X.0gD r2 = new X.0gD
            r2.<init>(r8, r5, r4)
            r8 = r2
            java.lang.String r2 = "Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove()."
            X.AnonymousClass0QL.A01(r1, r2)
            goto L_0x0040
        L_0x037f:
            java.lang.String r2 = "rc"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0033
            r10 = 0
            r9 = r8
            r7 = r8
            r11 = 0
        L_0x038b:
            boolean r2 = r0.A0N()
            if (r2 == 0) goto L_0x03c3
            X.0T2 r2 = X.AnonymousClass0SN.A00
            int r3 = r0.A0A(r2)
            if (r3 == 0) goto L_0x03be
            r2 = 1
            if (r3 == r2) goto L_0x03b9
            r2 = 2
            if (r3 == r2) goto L_0x03b4
            r2 = 3
            if (r3 == r2) goto L_0x03ae
            r2 = 4
            if (r3 == r2) goto L_0x03a9
            r0.A0L()
            goto L_0x038b
        L_0x03a9:
            boolean r11 = r0.A0O()
            goto L_0x038b
        L_0x03ae:
            r2 = 1
            X.0Bn r7 = X.AnonymousClass0VA.A01(r1, r0, r2)
            goto L_0x038b
        L_0x03b4:
            X.0Bk r9 = A01(r1, r0)
            goto L_0x038b
        L_0x03b9:
            X.0uC r8 = X.AnonymousClass0VN.A01(r1, r0)
            goto L_0x038b
        L_0x03be:
            java.lang.String r10 = r0.A0F()
            goto L_0x038b
        L_0x03c3:
            X.0gG r4 = new X.0gG
            r6 = r4
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x0618
        L_0x03cb:
            java.lang.String r2 = "rp"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0033
            r11 = 0
            r4 = 0
            r9 = r8
            r10 = r8
            r12 = 0
        L_0x03d8:
            boolean r2 = r0.A0N()
            if (r2 == 0) goto L_0x040f
            X.0T2 r2 = X.AnonymousClass0SO.A00
            int r3 = r0.A0A(r2)
            if (r3 == 0) goto L_0x040a
            r2 = 1
            if (r3 == r2) goto L_0x0405
            r2 = 2
            if (r3 == r2) goto L_0x0400
            r2 = 3
            if (r3 == r2) goto L_0x03fb
            r2 = 4
            if (r3 == r2) goto L_0x03f6
            r0.A0L()
            goto L_0x03d8
        L_0x03f6:
            boolean r12 = r0.A0O()
            goto L_0x03d8
        L_0x03fb:
            X.0gJ r10 = X.C05140Sc.A00(r1, r0)
            goto L_0x03d8
        L_0x0400:
            X.0Bn r9 = X.AnonymousClass0VA.A01(r1, r0, r4)
            goto L_0x03d8
        L_0x0405:
            X.0Bn r8 = X.AnonymousClass0VA.A01(r1, r0, r4)
            goto L_0x03d8
        L_0x040a:
            java.lang.String r11 = r0.A0F()
            goto L_0x03d8
        L_0x040f:
            X.0g8 r4 = new X.0g8
            r7 = r4
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x0618
        L_0x0417:
            java.lang.String r2 = "sh"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0033
            r7 = 0
            r6 = 0
            r5 = 0
        L_0x0422:
            boolean r2 = r0.A0N()
            if (r2 == 0) goto L_0x045d
            X.0T2 r2 = X.AnonymousClass0SR.A00
            int r3 = r0.A0A(r2)
            if (r3 == 0) goto L_0x0458
            r2 = 1
            if (r3 == r2) goto L_0x0453
            r2 = 2
            if (r3 == r2) goto L_0x0442
            r2 = 3
            if (r3 == r2) goto L_0x043d
            r0.A0L()
            goto L_0x0422
        L_0x043d:
            boolean r5 = r0.A0O()
            goto L_0x0422
        L_0x0442:
            float r4 = X.AnonymousClass0Y0.A00()
            X.0gS r3 = X.C09600gS.A00
            r2 = 0
            java.util.List r2 = X.AnonymousClass0VP.A00(r1, r3, r0, r4, r2)
            X.0Bl r8 = new X.0Bl
            r8.<init>(r2)
            goto L_0x0422
        L_0x0453:
            int r6 = r0.A09()
            goto L_0x0422
        L_0x0458:
            java.lang.String r7 = r0.A0F()
            goto L_0x0422
        L_0x045d:
            X.0gF r1 = new X.0gF
            r1.<init>(r8, r7, r6, r5)
            r8 = r1
            goto L_0x0040
        L_0x0465:
            java.lang.String r2 = "sr"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0033
            r18 = 0
            r5 = 0
            r10 = r8
            r16 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r15 = r8
            r19 = 0
        L_0x047a:
            boolean r2 = r0.A0N()
            if (r2 == 0) goto L_0x04d6
            X.0T2 r2 = X.AnonymousClass0SM.A00
            int r2 = r0.A0A(r2)
            switch(r2) {
                case 0: goto L_0x04c5;
                case 1: goto L_0x04ae;
                case 2: goto L_0x04a9;
                case 3: goto L_0x04a4;
                case 4: goto L_0x049f;
                case 5: goto L_0x04d0;
                case 6: goto L_0x049a;
                case 7: goto L_0x04ca;
                case 8: goto L_0x0495;
                case 9: goto L_0x0490;
                default: goto L_0x0489;
            }
        L_0x0489:
            r0.A0K()
            r0.A0L()
            goto L_0x047a
        L_0x0490:
            boolean r19 = r0.A0O()
            goto L_0x047a
        L_0x0495:
            X.0Bn r14 = X.AnonymousClass0VA.A01(r1, r0, r5)
            goto L_0x047a
        L_0x049a:
            X.0Bn r15 = X.AnonymousClass0VA.A01(r1, r0, r5)
            goto L_0x047a
        L_0x049f:
            X.0Bn r11 = X.AnonymousClass0VA.A01(r1, r0, r5)
            goto L_0x047a
        L_0x04a4:
            X.0uC r16 = X.AnonymousClass0VN.A01(r1, r0)
            goto L_0x047a
        L_0x04a9:
            X.0Bn r10 = X.AnonymousClass0VA.A01(r1, r0, r5)
            goto L_0x047a
        L_0x04ae:
            int r7 = r0.A09()
            X.0G9[] r4 = X.AnonymousClass0G9.values()
            int r6 = r4.length
            r3 = 0
        L_0x04b8:
            if (r3 >= r6) goto L_0x04c3
            r8 = r4[r3]
            int r2 = r8.value
            if (r2 == r7) goto L_0x047a
            int r3 = r3 + 1
            goto L_0x04b8
        L_0x04c3:
            r8 = 0
            goto L_0x047a
        L_0x04c5:
            java.lang.String r18 = r0.A0F()
            goto L_0x047a
        L_0x04ca:
            r2 = 1
            X.0Bn r12 = X.AnonymousClass0VA.A01(r1, r0, r2)
            goto L_0x047a
        L_0x04d0:
            r2 = 1
            X.0Bn r13 = X.AnonymousClass0VA.A01(r1, r0, r2)
            goto L_0x047a
        L_0x04d6:
            X.0gA r9 = new X.0gA
            r17 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x04dd:
            r8 = r9
            goto L_0x0040
        L_0x04e0:
            java.lang.String r2 = "st"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0033
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            r7 = 0
            r15 = 0
            r10 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r17 = 0
            r18 = 0
        L_0x04f7:
            boolean r2 = r0.A0N()
            if (r2 == 0) goto L_0x05ae
            X.0T2 r2 = X.C05160Sf.A00
            int r2 = r0.A0A(r2)
            r6 = 1
            switch(r2) {
                case 0: goto L_0x05a2;
                case 1: goto L_0x059c;
                case 2: goto L_0x05a8;
                case 3: goto L_0x0596;
                case 4: goto L_0x0589;
                case 5: goto L_0x057c;
                case 6: goto L_0x0576;
                case 7: goto L_0x0571;
                case 8: goto L_0x050b;
                default: goto L_0x0507;
            }
        L_0x0507:
            r0.A0L()
            goto L_0x04f7
        L_0x050b:
            r0.A0G()
        L_0x050e:
            boolean r2 = r0.A0N()
            if (r2 == 0) goto L_0x0560
            r0.A0H()
            r4 = 0
            r3 = 0
        L_0x0519:
            boolean r2 = r0.A0N()
            if (r2 == 0) goto L_0x053a
            X.0T2 r2 = X.C05160Sf.A01
            int r2 = r0.A0A(r2)
            if (r2 == 0) goto L_0x0535
            if (r2 == r6) goto L_0x0530
            r0.A0K()
            r0.A0L()
            goto L_0x0519
        L_0x0530:
            X.0Bn r3 = X.AnonymousClass0VA.A01(r1, r0, r6)
            goto L_0x0519
        L_0x0535:
            java.lang.String r4 = r0.A0F()
            goto L_0x0519
        L_0x053a:
            r0.A0J()
            int r2 = r4.hashCode()
            switch(r2) {
                case 100: goto L_0x0552;
                case 103: goto L_0x054f;
                case 111: goto L_0x0545;
                default: goto L_0x0544;
            }
        L_0x0544:
            goto L_0x050e
        L_0x0545:
            java.lang.String r2 = "o"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x050e
            r10 = r3
            goto L_0x050e
        L_0x054f:
            java.lang.String r2 = "g"
            goto L_0x0554
        L_0x0552:
            java.lang.String r2 = "d"
        L_0x0554:
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x050e
            r1.A0C = r6
            r5.add(r3)
            goto L_0x050e
        L_0x0560:
            r0.A0I()
            int r2 = r5.size()
            if (r2 != r6) goto L_0x04f7
            java.lang.Object r2 = r5.get(r7)
            r5.add(r2)
            goto L_0x04f7
        L_0x0571:
            boolean r18 = r0.A0O()
            goto L_0x04f7
        L_0x0576:
            float r17 = X.C10470hz.A03(r0)
            goto L_0x04f7
        L_0x057c:
            X.0FK[] r3 = X.AnonymousClass0FK.values()
            int r2 = r0.A09()
            int r2 = r2 - r6
            r14 = r3[r2]
            goto L_0x04f7
        L_0x0589:
            X.0FJ[] r3 = X.AnonymousClass0FJ.values()
            int r2 = r0.A09()
            int r2 = r2 - r6
            r13 = r3[r2]
            goto L_0x04f7
        L_0x0596:
            X.0Bo r8 = X.AnonymousClass0VA.A02(r1, r0)
            goto L_0x04f7
        L_0x059c:
            X.0Bi r9 = X.AnonymousClass0VA.A00(r1, r0)
            goto L_0x04f7
        L_0x05a2:
            java.lang.String r15 = r0.A0F()
            goto L_0x04f7
        L_0x05a8:
            X.0Bn r11 = X.AnonymousClass0VA.A01(r1, r0, r6)
            goto L_0x04f7
        L_0x05ae:
            X.0Bo r12 = A00(r8)
            X.0gB r8 = new X.0gB
            r16 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0040
        L_0x05bb:
            java.lang.String r2 = "tm"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0033
            r9 = 0
            r4 = 0
            r5 = r8
            r6 = r8
            r7 = r8
            r10 = 0
        L_0x05c9:
            boolean r2 = r0.A0N()
            if (r2 == 0) goto L_0x0613
            X.0T2 r2 = X.AnonymousClass0SS.A00
            int r3 = r0.A0A(r2)
            if (r3 == 0) goto L_0x060e
            r2 = 1
            if (r3 == r2) goto L_0x0609
            r2 = 2
            if (r3 == r2) goto L_0x0604
            r2 = 3
            if (r3 == r2) goto L_0x05ff
            r2 = 4
            if (r3 == r2) goto L_0x05ef
            r2 = 5
            if (r3 == r2) goto L_0x05ea
            r0.A0L()
            goto L_0x05c9
        L_0x05ea:
            boolean r10 = r0.A0O()
            goto L_0x05c9
        L_0x05ef:
            int r3 = r0.A09()
            r2 = 1
            if (r3 == r2) goto L_0x05fc
            r2 = 2
            if (r3 != r2) goto L_0x062d
            X.0FR r8 = X.AnonymousClass0FR.INDIVIDUALLY
            goto L_0x05c9
        L_0x05fc:
            X.0FR r8 = X.AnonymousClass0FR.SIMULTANEOUSLY
            goto L_0x05c9
        L_0x05ff:
            java.lang.String r9 = r0.A0F()
            goto L_0x05c9
        L_0x0604:
            X.0Bn r7 = X.AnonymousClass0VA.A01(r1, r0, r4)
            goto L_0x05c9
        L_0x0609:
            X.0Bn r6 = X.AnonymousClass0VA.A01(r1, r0, r4)
            goto L_0x05c9
        L_0x060e:
            X.0Bn r5 = X.AnonymousClass0VA.A01(r1, r0, r4)
            goto L_0x05c9
        L_0x0613:
            X.0gI r4 = new X.0gI
            r4.<init>(r5, r6, r7, r8, r9, r10)
        L_0x0618:
            r8 = r4
            goto L_0x0040
        L_0x061b:
            java.lang.String r2 = "tr"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0033
            X.0gJ r8 = X.C05140Sc.A00(r1, r0)
            goto L_0x0040
        L_0x0629:
            r0.A0J()
            return r8
        L_0x062d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown trim path type "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r3)
            throw r0
        L_0x0638:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0VO.A02(X.0QL, X.0hz):X.0sh");
    }

    public static C01580Bk A01(AnonymousClass0QL r3, C10470hz r4) {
        return new C01580Bk(AnonymousClass0VP.A00(r3, C09570gP.A00, r4, AnonymousClass0Y0.A00(), true));
    }
}
