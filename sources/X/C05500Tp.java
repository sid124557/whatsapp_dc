package X;

import android.content.Context;
import android.util.Log;
import androidx.work.WorkerParameters;

/* renamed from: X.0Tp  reason: invalid class name and case insensitive filesystem */
public abstract class C05500Tp {
    public static final String A00 = C06240Wu.A01("WorkerFactory");

    public abstract AnonymousClass0QH A01(Context context, WorkerParameters workerParameters, String str);

    public final AnonymousClass0QH A00(Context context, WorkerParameters workerParameters, String str) {
        String str2;
        StringBuilder sb;
        String str3;
        AnonymousClass0QH A01 = A01(context, workerParameters, str);
        if (A01 == null) {
            try {
                Class<? extends U> asSubclass = Class.forName(str).asSubclass(AnonymousClass0QH.class);
                if (asSubclass != null) {
                    try {
                        AnonymousClass0QH r0 = (AnonymousClass0QH) asSubclass.getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
                        A01 = r0;
                        if (r0 != null) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        C06240Wu.A00();
                        str2 = A00;
                        sb = AnonymousClass001.A0o();
                        str3 = "Could not instantiate ";
                        Log.e(str2, AnonymousClass000.A0V(str3, str, sb), th);
                        return A01;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                C06240Wu.A00();
                str2 = A00;
                sb = AnonymousClass001.A0o();
                str3 = "Invalid class: ";
                Log.e(str2, AnonymousClass000.A0V(str3, str, sb), th);
                return A01;
            }
            return A01;
        }
        if (A01.A02) {
            String A0O = AnonymousClass000.A0O(this);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("WorkerFactory (");
            A0o.append(A0O);
            A0o.append(") returned an instance of a ListenableWorker (");
            A0o.append(str);
            throw AnonymousClass000.A0I(") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", A0o);
        }
        return A01;
    }
}
