package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0Wb  reason: invalid class name and case insensitive filesystem */
public class C06060Wb {
    public static int A00(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return i + A02(marginLayoutParams) + A01(marginLayoutParams);
    }

    public static int A01(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    public static int A02(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    public static void A03(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setMarginEnd(i);
    }

    public static void A04(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setMarginStart(i);
    }
}
