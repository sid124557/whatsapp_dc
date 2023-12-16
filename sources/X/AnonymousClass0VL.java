package X;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0VL  reason: invalid class name */
public final class AnonymousClass0VL {
    public static final String A00;

    public static final boolean A01(Context context, C04320Nt r3) {
        C162457s7.A0J(context, 0);
        C162457s7.A0J(r3, 1);
        return C162457s7.A0P(A00(context), context.getApplicationInfo().processName);
    }

    static {
        String A01 = C06240Wu.A01("ProcessUtils");
        C162457s7.A0D(A01);
        A00 = A01;
    }

    public static final String A00(Context context) {
        T t;
        if (Build.VERSION.SDK_INT >= 28) {
            return AnonymousClass0J1.A00();
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, C06310Xb.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke((Object) null, new Object[0]);
            C162457s7.A0H(invoke);
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Throwable th) {
            C06240Wu A002 = C06240Wu.A00();
            String str = A00;
            if (A002.A00 <= 3) {
                Log.d(str, "Unable to check ActivityThread for processName", th);
            }
        }
        int myPid = Process.myPid();
        Object systemService = context.getSystemService("activity");
        C162457s7.A0K(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        Iterator<T> it = runningAppProcesses.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (AnonymousClass000.A1U(((ActivityManager.RunningAppProcessInfo) t).pid, myPid)) {
                break;
            }
        }
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) t;
        if (runningAppProcessInfo != null) {
            return runningAppProcessInfo.processName;
        }
        return null;
    }
}
