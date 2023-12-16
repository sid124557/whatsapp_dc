package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: X.0Rg  reason: invalid class name and case insensitive filesystem */
public class C04940Rg {
    public static void A01(Context context, TypedArray typedArray, AttributeSet attributeSet, View view, int[] iArr, int i, int i2) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }

    public static View.AccessibilityDelegate A00(View view) {
        return view.getAccessibilityDelegate();
    }
}
