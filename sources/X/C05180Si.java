package X;

import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0Si  reason: invalid class name and case insensitive filesystem */
public class C05180Si {
    public static boolean A00 = true;
    public static Method A01;
    public static boolean A02;

    public static int A00(ViewGroup viewGroup, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return viewGroup.getChildDrawingOrder(i);
        }
        if (!A02) {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                Class[] clsArr = new Class[2];
                Class cls2 = Integer.TYPE;
                clsArr[0] = cls2;
                Method A0H = AnonymousClass002.A0H(cls, cls2, "getChildDrawingOrder", clsArr, 1);
                A01 = A0H;
                A0H.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            A02 = true;
        }
        Method method = A01;
        if (method != null) {
            try {
                Object[] objArr = new Object[2];
                AnonymousClass000.A1P(objArr, viewGroup.getChildCount(), 0);
                AnonymousClass000.A1P(objArr, i, 1);
                return AnonymousClass001.A0K(method.invoke(viewGroup, objArr));
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i;
    }

    public static void A01(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else if (A00) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                A00 = false;
            }
        }
    }
}
