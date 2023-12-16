package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* renamed from: X.0VX  reason: invalid class name */
public final class AnonymousClass0VX {
    public static final Object A00 = AnonymousClass002.A0D();
    public static final ThreadLocal A01 = new ThreadLocal();
    public static final WeakHashMap A02 = new WeakHashMap(0);

    public static ColorStateList A00(Context context, int i) {
        WeakHashMap weakHashMap;
        ColorStateList colorStateList;
        C03640Kz r2;
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        Object obj = A00;
        synchronized (obj) {
            weakHashMap = A02;
            SparseArray sparseArray = (SparseArray) weakHashMap.get(context);
            if (!(sparseArray == null || sparseArray.size() <= 0 || (r2 = (C03640Kz) sparseArray.get(i)) == null)) {
                if (r2.A01.equals(AnonymousClass001.A0M(context))) {
                    colorStateList = r2.A00;
                } else {
                    sparseArray.remove(i);
                }
            }
            colorStateList = null;
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        Resources resources = context.getResources();
        TypedValue A0P = AnonymousClass001.A0P(A01);
        boolean z = true;
        resources.getValue(i, A0P, true);
        int i2 = A0P.type;
        if (i2 < 28 || i2 > 31) {
            z = false;
        }
        ColorStateList colorStateList2 = null;
        if (!z) {
            Resources resources2 = context.getResources();
            try {
                colorStateList2 = AnonymousClass0VI.A01(context.getTheme(), resources2, resources2.getXml(i));
            } catch (Exception e) {
                Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateList2 == null) {
            return AnonymousClass0Y8.A07(context, i);
        }
        synchronized (obj) {
            SparseArray sparseArray2 = (SparseArray) weakHashMap.get(context);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                weakHashMap.put(context, sparseArray2);
            }
            sparseArray2.append(i, new C03640Kz(colorStateList2, AnonymousClass001.A0M(context)));
        }
        return colorStateList2;
    }

    public static Drawable A01(Context context, int i) {
        return AnonymousClass0XW.A01(context, i);
    }
}
