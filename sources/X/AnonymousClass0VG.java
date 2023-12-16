package X;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;

/* renamed from: X.0VG  reason: invalid class name */
public class AnonymousClass0VG {
    public static Method A00;

    static {
        Class<View> cls = View.class;
        try {
            Class[] clsArr = new Class[2];
            Class<Rect> cls2 = Rect.class;
            clsArr[0] = cls2;
            Method A0H = AnonymousClass002.A0H(cls, cls2, "computeFitSystemWindows", clsArr, 1);
            A00 = A0H;
            if (!A0H.isAccessible()) {
                A00.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }
}
