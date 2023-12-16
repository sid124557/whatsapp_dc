package X;

import android.os.Build;
import com.whatsapp.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.3Ax  reason: invalid class name and case insensitive filesystem */
public class C63793Ax implements C183788qe {
    public static volatile C63793Ax A02;
    public String A00 = null;
    public Method A01 = null;

    public synchronized void A01(boolean z, String str) {
        Class<String> cls = String.class;
        Method method = null;
        if (Build.VERSION.SDK_INT < 23 && z) {
            Class<Runtime> cls2 = Runtime.class;
            try {
                Class[] clsArr = new Class[3];
                clsArr[0] = cls;
                C18300x5.A1K(ClassLoader.class, cls, clsArr);
                Method declaredMethod = cls2.getDeclaredMethod("nativeLoad", clsArr);
                declaredMethod.setAccessible(true);
                method = declaredMethod;
            } catch (NoSuchMethodException | SecurityException e) {
                Log.w("robustsofileloader/get-native-load-runtime-method: Could not get nativeLoad method", e);
            }
        }
        this.A01 = method;
        this.A00 = str;
    }

    public synchronized void BJm(String str, int i) {
        Method method = this.A01;
        if (method == null) {
            System.load(str);
        } else {
            try {
                C626936e.A0C(AnonymousClass000.A1W(this.A00));
                Runtime runtime = Runtime.getRuntime();
                Object[] A1X = AnonymousClass0x9.A1X();
                A1X[0] = str;
                A1X[1] = C63793Ax.class.getClassLoader();
                A1X[2] = this.A00;
                String str2 = (String) method.invoke(runtime, A1X);
                if (str2 != null) {
                    throw new UnsatisfiedLinkError(AnonymousClass000.A0V("robustsofileloader/load: nativeLoad returned error ", str2, AnonymousClass001.A0o()));
                }
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                String A0V = AnonymousClass000.A0V("robustsofileloader/load: Cannot load ", str, AnonymousClass001.A0o());
                C18260x0.A0u("robustsofileloader/load: Error when loading lib: ", A0V, AnonymousClass001.A0o(), e);
                throw new UnsatisfiedLinkError(A0V);
            }
        }
    }

    public static C63793Ax A00() {
        if (A02 == null) {
            synchronized (C183788qe.class) {
                if (A02 == null) {
                    A02 = new C63793Ax();
                }
            }
        }
        return A02;
    }

    public void BJo(C188158yR r1, String str, int i) {
    }
}
