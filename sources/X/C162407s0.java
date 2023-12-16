package X;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import java.text.NumberFormat;
import java.text.ParseException;

/* renamed from: X.7s0  reason: invalid class name and case insensitive filesystem */
public final class C162407s0 {
    public static final ThreadLocal A00 = new AnonymousClass8S8("#dp");
    public static final ThreadLocal A01 = new AnonymousClass8S8("#%");
    public static final ThreadLocal A02 = new AnonymousClass8S8("#px");
    public static final ThreadLocal A03 = new AnonymousClass8S8("#sp");

    public static float A00(String str) {
        try {
            return A04(str, A01) * 100.0f;
        } catch (ParseException e) {
            throw new AnonymousClass6u2(AnonymousClass000.A0V("can't parse pixel value: ", str, AnonymousClass001.A0o()), e);
        }
    }

    public static float A01(String str) {
        try {
            if (str.endsWith("px")) {
                return A04(str, A02);
            }
            if (str.endsWith("sp")) {
                return (float) AnonymousClass001.A07(A04(str, A03), AnonymousClass000.A0B(C158977kt.A00().A00).scaledDensity);
            }
            if (AnonymousClass6C9.A1P(str)) {
                return A00(str);
            }
            return (float) AnonymousClass001.A07(A04(str, A00), ((float) AnonymousClass000.A0B(C158977kt.A00().A00).densityDpi) / 160.0f);
        } catch (ParseException e) {
            throw new AnonymousClass6u2(AnonymousClass000.A0V("can't parse pixel value: ", str, AnonymousClass001.A0o()), e);
        }
    }

    public static float A02(String str) {
        try {
            return A04(str, A03);
        } catch (ParseException e) {
            throw new AnonymousClass6u2(AnonymousClass000.A0V("can't parse scaled pixel value: ", str, AnonymousClass001.A0o()), e);
        }
    }

    public static float A03(String str, float f) {
        if (str == null) {
            return f;
        }
        return A01(str);
    }

    public static int A0A(String str, int i) {
        if (str == null) {
            return i;
        }
        return A05(str);
    }

    public static C157397iE A0D(String str) {
        float A012;
        C141436vZ r0;
        if ("auto".equalsIgnoreCase(str)) {
            return C157397iE.A02;
        }
        if (AnonymousClass6C9.A1P(str)) {
            A012 = Float.parseFloat(AnonymousClass0x7.A0r(str, str.length() - 1));
            r0 = C141436vZ.PERCENT;
        } else {
            A012 = A01(str);
            r0 = C141436vZ.PIXEL;
        }
        return new C157397iE(r0, A012);
    }

    public static float A04(String str, ThreadLocal threadLocal) {
        return ((NumberFormat) threadLocal.get()).parse(str).floatValue();
    }

    public static int A05(String str) {
        try {
            return Color.parseColor(str);
        } catch (IllegalArgumentException e) {
            throw new AnonymousClass6u2(AnonymousClass000.A0V("can't parse color value: ", str, AnonymousClass001.A0o()), e);
        }
    }

    public static int A06(String str) {
        switch (str.hashCode()) {
            case -1078030475:
                if (str.equals("medium")) {
                    return 2;
                }
                break;
            case 3154575:
                if (str.equals("full")) {
                    return 0;
                }
                break;
            case 3327612:
                if (str.equals("long")) {
                    return 1;
                }
                break;
            case 109413500:
                if (str.equals("short")) {
                    return 3;
                }
                break;
        }
        throw new AnonymousClass6u2(AnonymousClass000.A0V("Can't parse unknown datetime format: ", str, AnonymousClass001.A0o()));
    }

    public static int A07(String str) {
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    return 1;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    return 8388613;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    return 8388611;
                }
                break;
        }
        throw new AnonymousClass6u2(AnonymousClass000.A0V("can't parse unknown textAlign: ", str, AnonymousClass001.A0o()));
    }

    public static int A08(String str) {
        switch (str.hashCode()) {
            case -2141169668:
                if (str.equals("cap_words")) {
                    return 139265;
                }
                break;
            case -2066832464:
                if (str.equals("text_no_suggestion")) {
                    return 655361;
                }
                break;
            case -1831299680:
                if (str.equals("cap_letters")) {
                    return 135169;
                }
                break;
            case -1413853096:
                if (str.equals("amount")) {
                    return 12290;
                }
                break;
            case -1034364087:
                if (str.equals("number")) {
                    return 2;
                }
                break;
            case 3076014:
                if (str.equals("date")) {
                    return 20;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    return 131073;
                }
                break;
            case 96619420:
                if (str.equals("email")) {
                    return 33;
                }
                break;
            case 106642798:
                if (str.equals("phone")) {
                    return 3;
                }
                break;
            case 260133443:
                if (str.equals("cap_sentences")) {
                    return 180225;
                }
                break;
            case 1216389502:
                if (str.equals("passcode")) {
                    return 18;
                }
                break;
            case 1216985755:
                if (str.equals("password")) {
                    return 129;
                }
                break;
        }
        throw new AnonymousClass6u2(AnonymousClass000.A0V("can't parse unknown inputType: ", str, AnonymousClass001.A0o()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        if (r8.equals("bold") == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        throw new X.AnonymousClass6u2(X.AnonymousClass000.A0V("can't parse unknown typeface: ", r8, X.AnonymousClass001.A0o()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A09(java.lang.String r8) {
        /*
            int r0 = r8.hashCode()
            java.lang.String r7 = "semibold"
            java.lang.String r6 = "light"
            java.lang.String r5 = "heavy"
            r4 = 3
            java.lang.String r3 = "normal"
            java.lang.String r2 = "medium"
            java.lang.String r1 = "bold"
            switch(r0) {
                case -1178781136: goto L_0x0065;
                case -1078030475: goto L_0x005a;
                case -1039745817: goto L_0x0048;
                case 3029637: goto L_0x0041;
                case 99152071: goto L_0x0037;
                case 102970646: goto L_0x004f;
                case 1223860979: goto L_0x0024;
                case 1734741290: goto L_0x002e;
                default: goto L_0x0014;
            }
        L_0x0014:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "can't parse unknown typeface: "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r8, r1)
            X.6u2 r0 = new X.6u2
            r0.<init>(r1)
            throw r0
        L_0x0024:
            boolean r0 = r8.equals(r7)
            if (r0 == 0) goto L_0x0014
            A0E(r7, r1)
            goto L_0x0063
        L_0x002e:
            java.lang.String r0 = "bold_italic"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0064
            goto L_0x0014
        L_0x0037:
            boolean r0 = r8.equals(r5)
            if (r0 == 0) goto L_0x0014
            A0E(r5, r1)
            goto L_0x0063
        L_0x0041:
            boolean r0 = r8.equals(r1)
            if (r0 != 0) goto L_0x0063
            goto L_0x0014
        L_0x0048:
            boolean r0 = r8.equals(r3)
            if (r0 != 0) goto L_0x0058
            goto L_0x0014
        L_0x004f:
            boolean r0 = r8.equals(r6)
            if (r0 == 0) goto L_0x0014
            A0E(r6, r3)
        L_0x0058:
            r4 = 0
            return r4
        L_0x005a:
            boolean r0 = r8.equals(r2)
            if (r0 == 0) goto L_0x0014
            A0E(r2, r1)
        L_0x0063:
            r4 = 1
        L_0x0064:
            return r4
        L_0x0065:
            java.lang.String r0 = "italic"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0014
            r4 = 2
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162407s0.A09(java.lang.String):int");
    }

    public static GradientDrawable.Orientation A0B(String str) {
        switch (str.hashCode()) {
            case -1451623918:
                if (str.equals("bottom_left_to_top_right")) {
                    return GradientDrawable.Orientation.BL_TR;
                }
                break;
            case -1118360059:
                if (str.equals("top_to_bottom")) {
                    return GradientDrawable.Orientation.TOP_BOTTOM;
                }
                break;
            case 404498110:
                if (str.equals("top_left_to_bottom_right")) {
                    return GradientDrawable.Orientation.TL_BR;
                }
                break;
            case 1553519760:
                if (str.equals("left_to_right")) {
                    return GradientDrawable.Orientation.LEFT_RIGHT;
                }
                break;
        }
        throw new AnonymousClass6u2(AnonymousClass000.A0V("can't parse orientation value: ", str, AnonymousClass001.A0o()));
    }

    public static ImageView.ScaleType A0C(String str) {
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    return ImageView.ScaleType.FIT_XY;
                }
                break;
            case 94852023:
                if (str.equals("cover")) {
                    return ImageView.ScaleType.CENTER_CROP;
                }
                break;
            case 951526612:
                if (str.equals("contain")) {
                    return ImageView.ScaleType.FIT_CENTER;
                }
                break;
        }
        throw new AnonymousClass6u2(AnonymousClass000.A0V("can't parse unknown scaleType: ", str, AnonymousClass001.A0o()));
    }

    public static void A0E(String str, String str2) {
        C159737mN.A01("text_style_ignored", AnonymousClass000.A0V(" is not supported, defaulting to ", str2, AnonymousClass000.A0l(str)));
    }
}
