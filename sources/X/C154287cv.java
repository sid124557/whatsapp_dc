package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.lang.reflect.Method;

/* renamed from: X.7cv  reason: invalid class name and case insensitive filesystem */
public class C154287cv {
    public static AnonymousClass678 A00(Context context, String str, int i) {
        Class<?> loadClass;
        try {
            ClassLoader classLoader = C154287cv.class.getClassLoader();
            if (!(classLoader == null || (loadClass = classLoader.loadClass("com.whatsapp.camera.litecamera.LiteCameraView")) == null)) {
                Method declaredMethod = loadClass.getDeclaredMethod(str, new Class[]{Context.class, Integer.TYPE});
                Object[] objArr = new Object[2];
                objArr[0] = context;
                AnonymousClass000.A1P(objArr, i, 1);
                return (AnonymousClass678) declaredMethod.invoke((Object) null, objArr);
            }
        } catch (Exception e) {
            Log.e("LiteCamera is not available", e);
        }
        return null;
    }
}
