package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

/* renamed from: X.0XB  reason: invalid class name */
public class AnonymousClass0XB {
    public static final ThreadLocal A00 = new ThreadLocal();
    public static final int[] A01 = {16842912};
    public static final int[] A02 = {-16842910};
    public static final int[] A03 = new int[0];
    public static final int[] A04 = {16842908};
    public static final int[] A05 = {16842919};
    public static final int[] A06 = new int[1];

    public static int A01(Context context, int i) {
        int[] iArr = A06;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList A02(Context context, int i) {
        int[] iArr = A06;
        iArr[0] = i;
        AnonymousClass0UD r0 = new AnonymousClass0UD(context, context.obtainStyledAttributes((AttributeSet) null, iArr));
        try {
            return r0.A01(0);
        } finally {
            r0.A02.recycle();
        }
    }

    public static void A03(Context context, View view) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AnonymousClass0KC.A09);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("View ");
                A0o.append(view.getClass());
                AnonymousClass000.A1D(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).", "ThemeUtils", A0o);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int A00(Context context, int i) {
        ColorStateList A022 = A02(context, i);
        if (A022 != null && A022.isStateful()) {
            return A022.getColorForState(A02, A022.getDefaultColor());
        }
        TypedValue A0P = AnonymousClass001.A0P(A00);
        context.getTheme().resolveAttribute(16842803, A0P, true);
        float f = A0P.getFloat();
        int A012 = A01(context, i);
        return AnonymousClass0YI.A06(A012, AnonymousClass001.A07((float) Color.alpha(A012), f));
    }

    public static void A04(View view) {
        A03(view.getContext(), view);
    }
}
