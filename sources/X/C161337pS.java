package X;

import java.util.Arrays;

/* renamed from: X.7pS  reason: invalid class name and case insensitive filesystem */
public class C161337pS {
    public static final C142056wZ A02 = C142056wZ.AUTO;
    public int A00 = 0;
    public float[] A01 = new float[0];

    public static float[] A02(C161337pS r1) {
        A00(r1, 2);
        return r1.A01;
    }

    public static void A00(C161337pS r3, int i) {
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

    public static boolean A01(float f) {
        return AnonymousClass000.A1T(Float.compare(f, Float.NaN));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0064, code lost:
        r3.append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0097, code lost:
        r3.append(r11[r4 + 1]);
        r3.append("%\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a5, code lost:
        r3.append(r11[r4 + 1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00cc, code lost:
        r3.append(r0);
        r3.append(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d2, code lost:
        r3.append("\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d5, code lost:
        r4 = r4 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e4, code lost:
        r3.append("\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00eb, code lost:
        r3.append("%\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ee, code lost:
        r4 = r4 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fa, code lost:
        r3.append(r0);
        r4 = r4 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r17 = this;
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            r4 = 0
        L_0x0005:
            r12 = r17
            int r0 = r12.A00
            if (r4 >= r0) goto L_0x0101
            X.6uq[] r1 = X.C140986uq.values()
            float[] r11 = r12.A01
            r0 = r11[r4]
            int r0 = (int) r0
            r0 = r1[r0]
            int r16 = r0.ordinal()
            java.lang.String r15 = "  position"
            java.lang.String r14 = "  maxHeight: "
            java.lang.String r13 = "  minHeight: "
            java.lang.String r10 = "  height: "
            java.lang.String r9 = "  maxWidth: "
            java.lang.String r8 = "  minWidth: "
            java.lang.String r7 = "  width: "
            java.lang.String r0 = "  flexBasis: "
            java.lang.String r6 = "  margin"
            java.lang.String r2 = ": "
            java.lang.String r1 = "%\n"
            java.lang.String r5 = "\n"
            switch(r16) {
                case 0: goto L_0x005c;
                case 1: goto L_0x005f;
                case 2: goto L_0x0062;
                case 3: goto L_0x0064;
                case 4: goto L_0x006c;
                case 5: goto L_0x0035;
                case 6: goto L_0x0070;
                case 7: goto L_0x0074;
                case 8: goto L_0x0035;
                case 9: goto L_0x0078;
                case 10: goto L_0x007c;
                case 11: goto L_0x0080;
                case 12: goto L_0x0084;
                case 13: goto L_0x0088;
                case 14: goto L_0x008c;
                case 15: goto L_0x0035;
                case 16: goto L_0x0090;
                case 17: goto L_0x0094;
                case 18: goto L_0x00a2;
                case 19: goto L_0x0068;
                case 20: goto L_0x00ad;
                case 21: goto L_0x00bd;
                case 22: goto L_0x0059;
                case 23: goto L_0x0049;
                case 24: goto L_0x00e1;
                case 25: goto L_0x00e8;
                case 26: goto L_0x0036;
                case 27: goto L_0x00dd;
                case 28: goto L_0x00d9;
                case 29: goto L_0x00f5;
                case 30: goto L_0x00f8;
                case 31: goto L_0x00f2;
                default: goto L_0x0035;
            }
        L_0x0035:
            goto L_0x0005
        L_0x0036:
            int r0 = r4 + 1
            r0 = r11[r0]
            int r0 = (int) r0
            X.6xs r0 = X.C142836xs.A00(r0)
            X.AnonymousClass000.A17(r0, r6, r2, r3)
            java.lang.String r0 = "auto\n"
            r3.append(r0)
            goto L_0x00d5
        L_0x0049:
            X.6wq[] r2 = X.C142226wq.values()
            float[] r1 = r12.A01
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r1 = r2[r0]
            java.lang.String r0 = "  display: "
            goto L_0x00cc
        L_0x0059:
            java.lang.String r0 = "  aspectRatio: "
            goto L_0x0064
        L_0x005c:
            java.lang.String r0 = "  flex: "
            goto L_0x0064
        L_0x005f:
            java.lang.String r0 = "  flexGrow: "
            goto L_0x0064
        L_0x0062:
            java.lang.String r0 = "  flexShrink: "
        L_0x0064:
            r3.append(r0)
            goto L_0x00a5
        L_0x0068:
            r3.append(r14)
            goto L_0x0097
        L_0x006c:
            r3.append(r0)
            goto L_0x0097
        L_0x0070:
            r3.append(r7)
            goto L_0x00a5
        L_0x0074:
            r3.append(r7)
            goto L_0x0097
        L_0x0078:
            r3.append(r8)
            goto L_0x00a5
        L_0x007c:
            r3.append(r8)
            goto L_0x0097
        L_0x0080:
            r3.append(r9)
            goto L_0x00a5
        L_0x0084:
            r3.append(r9)
            goto L_0x0097
        L_0x0088:
            r3.append(r10)
            goto L_0x00a5
        L_0x008c:
            r3.append(r10)
            goto L_0x0097
        L_0x0090:
            r3.append(r13)
            goto L_0x00a5
        L_0x0094:
            r3.append(r13)
        L_0x0097:
            int r0 = r4 + 1
            r0 = r11[r0]
            r3.append(r0)
            r3.append(r1)
            goto L_0x00d5
        L_0x00a2:
            r3.append(r14)
        L_0x00a5:
            int r0 = r4 + 1
            r0 = r11[r0]
            r3.append(r0)
            goto L_0x00d2
        L_0x00ad:
            X.6wZ[] r2 = X.C142056wZ.values()
            float[] r1 = r12.A01
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r1 = r2[r0]
            java.lang.String r0 = "  alignSelf: "
            goto L_0x00cc
        L_0x00bd:
            X.6ws[] r2 = X.C142246ws.values()
            float[] r1 = r12.A01
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r1 = r2[r0]
            java.lang.String r0 = "  positionType: "
        L_0x00cc:
            r3.append(r0)
            r3.append(r1)
        L_0x00d2:
            r3.append(r5)
        L_0x00d5:
            int r4 = r4 + 2
            goto L_0x0005
        L_0x00d9:
            X.C142836xs.A01(r15, r3, r11, r4)
            goto L_0x00eb
        L_0x00dd:
            X.C142836xs.A01(r15, r3, r11, r4)
            goto L_0x00e4
        L_0x00e1:
            X.C142836xs.A01(r6, r3, r11, r4)
        L_0x00e4:
            r3.append(r5)
            goto L_0x00ee
        L_0x00e8:
            X.C142836xs.A01(r6, r3, r11, r4)
        L_0x00eb:
            r3.append(r1)
        L_0x00ee:
            int r4 = r4 + 3
            goto L_0x0005
        L_0x00f2:
            java.lang.String r0 = "  enableTextRounding: true\n"
            goto L_0x00fa
        L_0x00f5:
            java.lang.String r0 = "  hasMeasureFunction: true\n"
            goto L_0x00fa
        L_0x00f8:
            java.lang.String r0 = "  hasBaselineFunction: true\n"
        L_0x00fa:
            r3.append(r0)
            int r4 = r4 + 1
            goto L_0x0005
        L_0x0101:
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x0115
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "{\n"
            X.C18270x1.A1H(r1, r0, r3)
            java.lang.String r0 = X.AnonymousClass000.A0g(r1)
            return r0
        L_0x0115:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161337pS.toString():java.lang.String");
    }
}
