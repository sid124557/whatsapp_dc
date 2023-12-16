package X;

import java.util.Arrays;

/* renamed from: X.7nG  reason: invalid class name and case insensitive filesystem */
public class C160217nG {
    public static final C142106we A02 = C142106we.STRETCH;
    public static final C141896wJ A03 = C141896wJ.STRETCH;
    public static final C142436xC A04 = C142436xC.ROW;
    public static final C142546xN A05 = C142546xN.FLEX_START;
    public static final C142336x2 A06 = C142336x2.NO_WRAP;
    public int A00 = 0;
    public float[] A01 = new float[0];

    public static void A00(C160217nG r3, int i) {
        int i2 = r3.A00 + i;
        float[] fArr = r3.A01;
        int length = fArr.length;
        if (i2 > length) {
            int i3 = length * 2;
            if (i3 < i2) {
                i3 += i2 - i3;
            }
            r3.A01 = Arrays.copyOf(fArr, i3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e4, code lost:
        X.AnonymousClass000.A17(r1, r0, "\n", r3);
        r4 = r4 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0044, code lost:
        r3.append("\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0047, code lost:
        r4 = r4 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r7 = this;
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            r4 = 0
        L_0x0005:
            int r0 = r7.A00
            if (r4 >= r0) goto L_0x0123
            X.6up[] r2 = X.C140976up.values()
            float[] r1 = r7.A01
            r0 = r1[r4]
            int r0 = (int) r0
            r0 = r2[r0]
            int r2 = r0.ordinal()
            java.lang.String r0 = "  padding"
            java.lang.String r6 = ": "
            java.lang.String r5 = "\n"
            switch(r2) {
                case 0: goto L_0x00d3;
                case 1: goto L_0x00b5;
                case 2: goto L_0x008b;
                case 3: goto L_0x007b;
                case 4: goto L_0x006b;
                case 5: goto L_0x005b;
                case 6: goto L_0x004a;
                case 7: goto L_0x0041;
                case 8: goto L_0x0038;
                case 9: goto L_0x0022;
                case 10: goto L_0x00f1;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x0005
        L_0x0022:
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            X.6xs r2 = X.C142836xs.A00(r0)
            int r0 = r4 + 2
            r1 = r1[r0]
            java.lang.String r0 = "  border"
            X.AnonymousClass000.A17(r2, r0, r6, r3)
            r3.append(r1)
            goto L_0x0044
        L_0x0038:
            X.C142836xs.A01(r0, r3, r1, r4)
            java.lang.String r0 = "%\n"
            r3.append(r0)
            goto L_0x0047
        L_0x0041:
            X.C142836xs.A01(r0, r3, r1, r4)
        L_0x0044:
            r3.append(r5)
        L_0x0047:
            int r4 = r4 + 3
            goto L_0x0005
        L_0x004a:
            X.6wr[] r2 = X.C142236wr.values()
            float[] r1 = r7.A01
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r1 = r2[r0]
            java.lang.String r0 = "  overflow: "
            goto L_0x00e4
        L_0x005b:
            X.6x2[] r2 = X.C142336x2.values()
            float[] r1 = r7.A01
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r1 = r2[r0]
            java.lang.String r0 = "  flexWrap: "
            goto L_0x00e4
        L_0x006b:
            X.6wJ[] r2 = X.C141896wJ.values()
            float[] r1 = r7.A01
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r1 = r2[r0]
            java.lang.String r0 = "  alignItems: "
            goto L_0x00e4
        L_0x007b:
            X.6we[] r2 = X.C142106we.values()
            float[] r1 = r7.A01
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r1 = r2[r0]
            java.lang.String r0 = "  alignContent: "
            goto L_0x00e4
        L_0x008b:
            int r0 = r4 + 1
            r0 = r1[r0]
            int r2 = (int) r0
            if (r2 == 0) goto L_0x00b2
            r0 = 1
            if (r2 == r0) goto L_0x00af
            r0 = 2
            if (r2 == r0) goto L_0x00ac
            r0 = 3
            if (r2 == r0) goto L_0x00a9
            r0 = 4
            if (r2 == r0) goto L_0x00a6
            r0 = 5
            if (r2 != r0) goto L_0x0102
            X.6xN r1 = X.C142546xN.SPACE_EVENLY
        L_0x00a3:
            java.lang.String r0 = "  justifyContent: "
            goto L_0x00e4
        L_0x00a6:
            X.6xN r1 = X.C142546xN.SPACE_AROUND
            goto L_0x00a3
        L_0x00a9:
            X.6xN r1 = X.C142546xN.SPACE_BETWEEN
            goto L_0x00a3
        L_0x00ac:
            X.6xN r1 = X.C142546xN.FLEX_END
            goto L_0x00a3
        L_0x00af:
            X.6xN r1 = X.C142546xN.CENTER
            goto L_0x00a3
        L_0x00b2:
            X.6xN r1 = X.C142546xN.FLEX_START
            goto L_0x00a3
        L_0x00b5:
            int r0 = r4 + 1
            r0 = r1[r0]
            int r2 = (int) r0
            if (r2 == 0) goto L_0x00d0
            r0 = 1
            if (r2 == r0) goto L_0x00cd
            r0 = 2
            if (r2 == r0) goto L_0x00ca
            r0 = 3
            if (r2 != r0) goto L_0x010d
            X.6xC r1 = X.C142436xC.COLUMN_REVERSE
        L_0x00c7:
            java.lang.String r0 = "  flexDirection: "
            goto L_0x00e4
        L_0x00ca:
            X.6xC r1 = X.C142436xC.COLUMN
            goto L_0x00c7
        L_0x00cd:
            X.6xC r1 = X.C142436xC.ROW_REVERSE
            goto L_0x00c7
        L_0x00d0:
            X.6xC r1 = X.C142436xC.ROW
            goto L_0x00c7
        L_0x00d3:
            int r0 = r4 + 1
            r0 = r1[r0]
            int r2 = (int) r0
            if (r2 == 0) goto L_0x00ee
            r0 = 1
            if (r2 == r0) goto L_0x00eb
            r0 = 2
            if (r2 != r0) goto L_0x0118
            X.6x1 r1 = X.C142326x1.RTL
        L_0x00e2:
            java.lang.String r0 = "  direction: "
        L_0x00e4:
            X.AnonymousClass000.A17(r1, r0, r5, r3)
            int r4 = r4 + 2
            goto L_0x0005
        L_0x00eb:
            X.6x1 r1 = X.C142326x1.LTR
            goto L_0x00e2
        L_0x00ee:
            X.6x1 r1 = X.C142326x1.INHERIT
            goto L_0x00e2
        L_0x00f1:
            int r0 = r4 + 1
            r1 = r1[r0]
            java.lang.String r0 = " pointScalingFactor: "
            r3.append(r0)
            r3.append(r1)
            r3.append(r5)
            goto L_0x0005
        L_0x0102:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown enum value: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r2)
            throw r0
        L_0x010d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown enum value: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r2)
            throw r0
        L_0x0118:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown enum value: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r2)
            throw r0
        L_0x0123:
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x0137
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "{\n"
            X.C18270x1.A1H(r1, r0, r3)
            java.lang.String r0 = X.AnonymousClass000.A0g(r1)
            return r0
        L_0x0137:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160217nG.toString():java.lang.String");
    }
}
