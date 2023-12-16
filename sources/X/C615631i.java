package X;

import android.os.Looper;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.31i  reason: invalid class name and case insensitive filesystem */
public class C615631i {
    public static void A01() {
        try {
            Iterator A0q = AnonymousClass000.A0q(Thread.getAllStackTraces());
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                StringBuilder A0A = C18330xA.A0A("\n");
                Thread thread = (Thread) A0w.getKey();
                StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) A0w.getValue();
                A0A.append("name=");
                A0A.append(thread.getName());
                A0A.append(" state=");
                A0A.append(thread.getState());
                A0A.append(" tid=");
                A0A.append(thread.getId());
                A0A.append(10);
                A0A.append(Log.stackTraceStartPhrase());
                for (StackTraceElement A1H : stackTraceElementArr) {
                    C18270x1.A1H(A0A, "    at ", A1H);
                    A0A.append(10);
                }
                A0A.append("### end stack trace");
                Log.log(3, AnonymousClass001.A0j(A0A, 10));
            }
        } catch (Throwable th) {
            Log.e("ThreadUtils/logAllStackTraces exception", th);
        }
    }

    public static String A00(Throwable th) {
        StringBuilder A0o = AnonymousClass001.A0o();
        int i = 0;
        for (StackTraceElement A1B : th.getStackTrace()) {
            AnonymousClass000.A1B(A1B, A0o);
            A0o.append("\n");
            i++;
            if (i == 15) {
                break;
            }
        }
        return A0o.toString();
    }

    public static boolean A02() {
        return AnonymousClass000.A1Y(Looper.myLooper(), Looper.getMainLooper());
    }
}
