package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

/* renamed from: X.7of  reason: invalid class name and case insensitive filesystem */
public class C160917of {
    public static ColorStateList A01(Context context, AnonymousClass0UD r3, int i) {
        int resourceId;
        ColorStateList A00;
        TypedArray typedArray = r3.A02;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (A00 = AnonymousClass0VX.A00(context, resourceId)) == null) {
            return r3.A01(i);
        }
        return A00;
    }

    public static ColorStateList A00(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList A00;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (A00 = AnonymousClass0VX.A00(context, resourceId)) == null) {
            return typedArray.getColorStateList(i);
        }
        return A00;
    }

    public static Drawable A02(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable A01;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (A01 = AnonymousClass0VX.A01(context, resourceId)) == null) {
            return typedArray.getDrawable(i);
        }
        return A01;
    }
}
