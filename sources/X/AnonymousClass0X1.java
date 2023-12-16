package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;

/* renamed from: X.0X1  reason: invalid class name */
public class AnonymousClass0X1 {
    public static int A00(Drawable drawable) {
        return drawable.getAlpha();
    }

    public static Drawable A01(DrawableContainer.DrawableContainerState drawableContainerState, int i) {
        return drawableContainerState.getChild(i);
    }

    public static Drawable A02(InsetDrawable insetDrawable) {
        return insetDrawable.getDrawable();
    }

    public static void A03(Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }

    public static boolean A04(Drawable drawable) {
        return drawable.isAutoMirrored();
    }
}
