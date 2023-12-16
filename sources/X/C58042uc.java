package X;

import android.os.Process;
import com.whatsapp.util.Log;
import java.lang.reflect.Method;

/* renamed from: X.2uc  reason: invalid class name and case insensitive filesystem */
public class C58042uc {
    public static Method A00;
    public static final int[] A01 = {4096};

    static {
        try {
            A00 = Process.class.getMethod("readProcFile", new Class[]{String.class, int[].class, String[].class, long[].class, float[].class});
        } catch (Exception unused) {
            A00 = null;
            Log.e("procreader/native API inaccessible");
        }
    }

    public static boolean A00() {
        Method method = A00;
        if (method != null) {
            try {
                int myPid = Process.myPid();
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("/proc/");
                A0o.append(myPid);
                try {
                    String[] strArr = {null};
                    Object[] objArr = new Object[5];
                    objArr[0] = AnonymousClass000.A0X("/cgroup", A0o);
                    objArr[1] = A01;
                    AnonymousClass001.A1H(strArr, (Object) null, objArr);
                    objArr[4] = null;
                    method.invoke((Object) null, objArr);
                    String str = strArr[0];
                    if (str != null) {
                        if (str.contains("/bg_non_interactive")) {
                            return true;
                        }
                        if (!str.contains("cpuset:/") || str.contains("cpuset:/top-app")) {
                            return false;
                        }
                        return true;
                    }
                } catch (Exception unused) {
                    Log.e("procreader/native API invoke error");
                    return false;
                }
            } catch (RuntimeException e) {
                Log.e("procreader/Runtime Exception", e);
                return false;
            }
        }
        return false;
    }
}
