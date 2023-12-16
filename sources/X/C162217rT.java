package X;

/* renamed from: X.7rT  reason: invalid class name and case insensitive filesystem */
public class C162217rT {
    public static final C161337pS A00 = new C161337pS();

    public static AnonymousClass84O A02(C180488l9 r2) {
        if (!(r2 instanceof AnonymousClass84O)) {
            return null;
        }
        AnonymousClass84O r22 = (AnonymousClass84O) r2;
        if (r22.A0K(132) == null || r22.A0K(132).A03 != 13368) {
            return null;
        }
        return r22.A0K(132);
    }

    public static float A00(AnonymousClass84O r2, float f, int i, boolean z) {
        String str = (String) AnonymousClass84O.A05(r2, i);
        if (str == null || (z && str.equals("auto"))) {
            return Float.NaN;
        }
        try {
            if (AnonymousClass6C9.A1P(str)) {
                return C162407s0.A00(str) * 0.01f * f;
            }
            return C162407s0.A01(str);
        } catch (AnonymousClass6u2 e) {
            C159737mN.A00((C153427bI) null, "BloksFlexLayoutProvider", "Error parsing size dimension value", e);
            return Float.NaN;
        }
    }

    public static float A01(AnonymousClass84O r3, int i) {
        String str = (String) AnonymousClass84O.A05(r3, i);
        if (str == null) {
            return Float.NaN;
        }
        try {
            return C162407s0.A01(str);
        } catch (AnonymousClass6u2 e) {
            C159737mN.A00((C153427bI) null, "BloksFlexLayoutProvider", "Error parsing padding value", e);
            return Float.NaN;
        }
    }

    public static void A03(C142836xs r5, C160217nG r6, String str) {
        float A01;
        float[] fArr;
        int i;
        try {
            if (AnonymousClass6C9.A1P(str)) {
                A01 = C162407s0.A00(str);
                if (Float.compare(A01, Float.NaN) != 0) {
                    C160217nG.A00(r6, 3);
                    fArr = r6.A01;
                    int i2 = r6.A00;
                    int i3 = i2 + 1;
                    r6.A00 = i3;
                    fArr[i2] = (float) 8;
                    i = i3 + 1;
                    r6.A00 = i;
                    fArr[i3] = (float) r5.mIntValue;
                } else {
                    return;
                }
            } else {
                A01 = C162407s0.A01(str);
                if (Float.compare(A01, Float.NaN) != 0) {
                    C160217nG.A00(r6, 3);
                    fArr = r6.A01;
                    int i4 = r6.A00;
                    int i5 = i4 + 1;
                    r6.A00 = i5;
                    fArr[i4] = (float) 7;
                    i = i5 + 1;
                    r6.A00 = i;
                    fArr[i5] = (float) r5.mIntValue;
                } else {
                    return;
                }
            }
            r6.A00 = i + 1;
            fArr[i] = A01;
        } catch (AnonymousClass6u2 e) {
            C159737mN.A00((C153427bI) null, "BloksFlexLayoutProvider", "Error parsing padding value", e);
        }
    }

    public static void A04(C142836xs r5, C161337pS r6, String str) {
        float A01;
        float[] fArr;
        int i;
        try {
            if (AnonymousClass6C9.A1P(str)) {
                A01 = C162407s0.A00(str);
                if (!C161337pS.A01(A01)) {
                    C161337pS.A00(r6, 3);
                    fArr = r6.A01;
                    int i2 = r6.A00;
                    int i3 = i2 + 1;
                    r6.A00 = i3;
                    fArr[i2] = (float) 25;
                    i = i3 + 1;
                    r6.A00 = i;
                    fArr[i3] = (float) r5.mIntValue;
                } else {
                    return;
                }
            } else if (str.equals("auto")) {
                float[] A02 = C161337pS.A02(r6);
                int i4 = r6.A00;
                int i5 = i4 + 1;
                r6.A00 = i5;
                A02[i4] = (float) 26;
                r6.A00 = i5 + 1;
                A02[i5] = (float) r5.mIntValue;
                return;
            } else {
                A01 = C162407s0.A01(str);
                if (!C161337pS.A01(A01)) {
                    C161337pS.A00(r6, 3);
                    fArr = r6.A01;
                    int i6 = r6.A00;
                    int i7 = i6 + 1;
                    r6.A00 = i7;
                    fArr[i6] = (float) 24;
                    i = i7 + 1;
                    r6.A00 = i;
                    fArr[i7] = (float) r5.mIntValue;
                } else {
                    return;
                }
            }
            r6.A00 = i + 1;
            fArr[i] = A01;
        } catch (AnonymousClass6u2 e) {
            C159737mN.A00((C153427bI) null, "BloksFlexLayoutProvider", "Error parsing margin value", e);
        }
    }

    public static void A05(C142836xs r5, C161337pS r6, String str) {
        float A01;
        float[] fArr;
        int i;
        try {
            if (AnonymousClass6C9.A1P(str)) {
                A01 = C162407s0.A00(str);
                if (!C161337pS.A01(A01)) {
                    C161337pS.A00(r6, 3);
                    fArr = r6.A01;
                    int i2 = r6.A00;
                    int i3 = i2 + 1;
                    r6.A00 = i3;
                    fArr[i2] = (float) 28;
                    i = i3 + 1;
                    r6.A00 = i;
                    fArr[i3] = (float) r5.mIntValue;
                } else {
                    return;
                }
            } else {
                A01 = C162407s0.A01(str);
                if (!C161337pS.A01(A01)) {
                    C161337pS.A00(r6, 3);
                    fArr = r6.A01;
                    int i4 = r6.A00;
                    int i5 = i4 + 1;
                    r6.A00 = i5;
                    fArr[i4] = (float) 27;
                    i = i5 + 1;
                    r6.A00 = i;
                    fArr[i5] = (float) r5.mIntValue;
                } else {
                    return;
                }
            }
            r6.A00 = i + 1;
            fArr[i] = A01;
        } catch (AnonymousClass6u2 e) {
            C159737mN.A00((C153427bI) null, "BloksFlexLayoutProvider", "Error parsing position value", e);
        }
    }
}
