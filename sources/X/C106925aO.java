package X;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;

/* renamed from: X.5aO  reason: invalid class name and case insensitive filesystem */
public class C106925aO {
    public static final String A00 = C106925aO.class.getSimpleName();
    public static final int[] A01 = {16842910, 16842919};
    public static final int[] A02 = {16842908};
    public static final int[] A03 = {16842919};
    public static final int[] A04 = {16842913, 16842919};
    public static final int[] A05 = {16842913};

    public static ColorStateList A01(ColorStateList colorStateList) {
        int[] iArr = new int[3];
        iArr[0] = A00(colorStateList, A04);
        int[] iArr2 = A02;
        iArr[1] = A00(colorStateList, iArr2);
        return C86664Kz.A0W(iArr, new int[][]{A05, iArr2, StateSet.NOTHING}, A00(colorStateList, A03), 2);
    }

    public static ColorStateList A02(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(A01, 0)) != 0) {
            Log.w(A00, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static int A00(ColorStateList colorStateList, int[] iArr) {
        int i;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i = 0;
        }
        return AnonymousClass0YI.A06(i, Math.min(Color.alpha(i) * 2, 255));
    }
}
