package X;

import android.view.View;
import android.view.ViewParent;

/* renamed from: X.0Xx  reason: invalid class name and case insensitive filesystem */
public class C06490Xx {
    public static void A02(View view, ViewParent viewParent, int i, int i2, int i3, int i4) {
        viewParent.onNestedScroll(view, i, i2, i3, i4);
    }

    public static void A01(View view, ViewParent viewParent) {
        viewParent.onStopNestedScroll(view);
    }

    public static boolean A04(View view, View view2, ViewParent viewParent, int i) {
        return viewParent.onStartNestedScroll(view, view2, i);
    }

    public static boolean A05(View view, ViewParent viewParent, float f, float f2) {
        return viewParent.onNestedPreFling(view, f, f2);
    }

    public static boolean A06(View view, ViewParent viewParent, float f, float f2, boolean z) {
        return viewParent.onNestedFling(view, f, f2, z);
    }

    public static void A00(View view, View view2, ViewParent viewParent, int i) {
        viewParent.onNestedScrollAccepted(view, view2, i);
    }

    public static void A03(View view, ViewParent viewParent, int[] iArr, int i, int i2) {
        viewParent.onNestedPreScroll(view, i, i2, iArr);
    }
}
