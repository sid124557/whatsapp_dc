package X;

import android.app.ActivityManager;
import android.os.Build;
import com.whatsapp.util.Log;

/* renamed from: X.34L  reason: invalid class name */
public class AnonymousClass34L {
    public static int A00 = -1;
    public static Boolean A01;
    public static final String[] A02 = {"GT-N7100", "GT-I9305"};

    public static synchronized int A00(C620633i r3) {
        synchronized (AnonymousClass34L.class) {
            int i = A00;
            if (i != -1) {
                return i;
            }
            ActivityManager A06 = r3.A06();
            if (A06 == null) {
                Log.w("memoryclassprovider am=null");
                return 16;
            }
            A00 = A06.getMemoryClass();
            int memoryClass = A06.getMemoryClass();
            return memoryClass;
        }
    }

    public static boolean A01() {
        Boolean bool = A01;
        if (bool == null) {
            boolean z = false;
            for (String equals : A02) {
                if (Build.MODEL.equals(equals)) {
                    A01 = Boolean.TRUE;
                    return true;
                }
            }
            int i = A00;
            if (i < 0) {
                return false;
            }
            if (i <= 48) {
                z = true;
            }
            bool = Boolean.valueOf(z);
            A01 = bool;
        }
        return bool.booleanValue();
    }
}
