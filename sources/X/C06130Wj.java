package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: X.0Wj  reason: invalid class name and case insensitive filesystem */
public final class C06130Wj {
    public static Method A00;
    public static Method A01;
    public static boolean A02;
    public static boolean A03;

    public static int A00(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AnonymousClass0RV.A00(drawable);
        }
        if (!A02) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                A00 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
            }
            A02 = true;
        }
        Method method = A00;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e2) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e2);
                A00 = null;
            }
        }
        return 0;
    }

    public static Drawable A01(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23 || (drawable instanceof C14920qU)) {
            return drawable;
        }
        return new AnonymousClass01J(drawable);
    }

    public static void A02(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        Drawable drawable2;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            drawable2 = AnonymousClass0X1.A02((InsetDrawable) drawable);
        } else if (drawable instanceof C15750rs) {
            drawable2 = ((AnonymousClass01J) ((C15750rs) drawable)).A02;
        } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
            int childCount = drawableContainerState.getChildCount();
            for (int i = 0; i < childCount; i++) {
                Drawable A012 = AnonymousClass0X1.A01(drawableContainerState, i);
                if (A012 != null) {
                    A02(A012);
                }
            }
            return;
        } else {
            return;
        }
        A02(drawable2);
    }

    public static boolean A03(int i, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AnonymousClass0RV.A01(i, drawable);
        }
        if (!A03) {
            Class<Drawable> cls = Drawable.class;
            try {
                Method A0H = AnonymousClass002.A0H(cls, Integer.TYPE, "setLayoutDirection", new Class[1], 0);
                A01 = A0H;
                A0H.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
            }
            A03 = true;
        }
        Method method = A01;
        if (method != null) {
            try {
                Object[] objArr = new Object[1];
                AnonymousClass000.A1P(objArr, i, 0);
                method.invoke(drawable, objArr);
                return true;
            } catch (Exception e2) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                A01 = null;
            }
        }
        return false;
    }
}
