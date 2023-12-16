package X;

import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: X.0kF  reason: invalid class name and case insensitive filesystem */
public class C11810kF implements Runnable {
    public final /* synthetic */ Object A00;
    public final /* synthetic */ Object A01;

    public C11810kF(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void run() {
        Object obj;
        Object[] objArr;
        try {
            Method method = C05250Sp.A04;
            if (method != null) {
                obj = this.A00;
                objArr = new Object[]{this.A01, Boolean.FALSE, "AppCompat recreation"};
            } else {
                method = C05250Sp.A03;
                obj = this.A00;
                objArr = new Object[]{this.A01, Boolean.FALSE};
            }
            method.invoke(obj, objArr);
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                throw e;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
