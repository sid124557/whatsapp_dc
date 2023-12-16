package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: X.0UD  reason: invalid class name */
public class AnonymousClass0UD {
    public TypedValue A00;
    public final Context A01;
    public final TypedArray A02;

    public ColorStateList A01(int i) {
        int resourceId;
        ColorStateList A002;
        TypedArray typedArray = this.A02;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (A002 = AnonymousClass0VX.A00(this.A01, resourceId)) == null) {
            return typedArray.getColorStateList(i);
        }
        return A002;
    }

    public Drawable A02(int i) {
        int resourceId;
        TypedArray typedArray = this.A02;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return typedArray.getDrawable(i);
        }
        return AnonymousClass0XW.A01(this.A01, resourceId);
    }

    public Drawable A03(int i) {
        int resourceId;
        Drawable A07;
        TypedArray typedArray = this.A02;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        AnonymousClass0XJ A012 = AnonymousClass0XJ.A01();
        Context context = this.A01;
        synchronized (A012) {
            A07 = A012.A00.A07(context, resourceId, true);
        }
        return A07;
    }

    public AnonymousClass0UD(Context context, TypedArray typedArray) {
        this.A01 = context;
        this.A02 = typedArray;
    }

    public static AnonymousClass0UD A00(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new AnonymousClass0UD(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }
}
