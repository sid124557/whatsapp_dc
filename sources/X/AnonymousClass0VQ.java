package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import com.whatsapp.R;

/* renamed from: X.0VQ  reason: invalid class name */
public final class AnonymousClass0VQ {
    public static final int[][] A00 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    public static ColorStateList A00(Context context, Integer num, Integer num2, Integer num3, Integer num4) {
        int A0G;
        int defaultColor;
        int colorForState;
        int i = -7829368;
        if (num != null) {
            A0G = num.intValue();
        } else {
            A0G = AnonymousClass001.A0G(context.getTheme(), new int[1], R.attr.f3nameremoved, -7829368);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.f3nameremoved});
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        obtainStyledAttributes.recycle();
        if (num2 != null) {
            defaultColor = num2.intValue();
        } else if (colorStateList == null) {
            defaultColor = -7829368;
        } else {
            defaultColor = colorStateList.getDefaultColor();
        }
        if (num3 != null) {
            colorForState = num3.intValue();
        } else if (colorStateList == null) {
            colorForState = -7829368;
        } else {
            colorForState = colorStateList.getColorForState(new int[]{-16842910}, colorStateList.getDefaultColor());
        }
        if (num4 != null) {
            i = num4.intValue();
        } else if (colorStateList != null) {
            i = colorStateList.getColorForState(new int[]{-16842910}, colorStateList.getDefaultColor());
        }
        return new ColorStateList(A00, new int[]{A0G, defaultColor, colorForState, i});
    }

    public static ColorStateList A01(Context context, Integer num, Integer num2, Integer num3, Integer num4) {
        int A0G;
        int A0G2;
        int A06;
        int A062;
        if (num != null) {
            A0G = num.intValue();
        } else {
            A0G = AnonymousClass001.A0G(context.getTheme(), new int[1], 16843818, -7829368);
        }
        if (num2 != null) {
            A0G2 = num2.intValue();
        } else {
            A0G2 = AnonymousClass001.A0G(context.getTheme(), new int[1], 16842800, -7829368);
        }
        if (num3 != null) {
            A06 = num3.intValue();
        } else {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843818});
            A06 = AnonymousClass0YI.A06(obtainStyledAttributes.getColor(0, -7829368), AnonymousClass001.A07((float) Color.alpha(A0G), 0.25f));
            obtainStyledAttributes.recycle();
        }
        if (num4 != null) {
            A062 = num4.intValue();
        } else {
            TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{16842800});
            A062 = AnonymousClass0YI.A06(obtainStyledAttributes2.getColor(0, -7829368), AnonymousClass001.A07((float) Color.alpha(A0G2), 0.25f));
            obtainStyledAttributes2.recycle();
        }
        return new ColorStateList(A00, new int[]{A0G, A0G2, A06, A062});
    }
}
