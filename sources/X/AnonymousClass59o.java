package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import com.whatsapp.R;

/* renamed from: X.59o  reason: invalid class name */
public class AnonymousClass59o {
    public static Drawable A00(Context context, int i) {
        ColorStateList valueOf;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setShape(1);
        InsetDrawable insetDrawable = new InsetDrawable(gradientDrawable, i, i, i, i);
        ColorStateList valueOf2 = ColorStateList.valueOf(0);
        TypedValue A01 = C160907oe.A01(context, R.attr.f3nameremoved);
        if (A01 != null) {
            int i2 = A01.resourceId;
            if (i2 != 0) {
                valueOf = AnonymousClass0Y8.A07(context, i2);
            } else {
                valueOf = ColorStateList.valueOf(A01.data);
            }
            if (valueOf != null) {
                valueOf2 = valueOf;
            }
        }
        return new RippleDrawable(valueOf2, (Drawable) null, insetDrawable);
    }
}
