package X;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0Qj  reason: invalid class name and case insensitive filesystem */
public abstract class C04720Qj {
    public static Field A00;
    public static Method A01;
    public static boolean A02;
    public static boolean A03;

    public abstract float A00(View view);

    public abstract void A01(Matrix matrix, View view);

    public abstract void A02(Matrix matrix, View view);

    public abstract void A03(Matrix matrix, View view);

    public abstract void A04(View view, float f);

    public void A05(View view, int i) {
        if (!A03) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                A00 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            A03 = true;
        }
        Field field = A00;
        if (field != null) {
            try {
                A00.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void A06(View view, int i, int i2, int i3, int i4) {
        if (!A02) {
            Class<View> cls = View.class;
            try {
                Class[] clsArr = new Class[4];
                Class cls2 = Integer.TYPE;
                clsArr[0] = cls2;
                clsArr[1] = cls2;
                clsArr[2] = cls2;
                Method A0H = AnonymousClass002.A0H(cls, cls2, "setFrame", clsArr, 3);
                A01 = A0H;
                A0H.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e);
            }
            A02 = true;
        }
        Method method = A01;
        if (method != null) {
            try {
                Object[] objArr = new Object[4];
                AnonymousClass000.A1L(objArr, i);
                AnonymousClass000.A1M(objArr, i2);
                AnonymousClass000.A1N(objArr, i3);
                AnonymousClass000.A1O(objArr, i4);
                method.invoke(view, objArr);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }
}
