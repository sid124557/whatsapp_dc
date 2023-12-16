package X;

import android.util.Log;
import java.util.Set;

/* renamed from: X.0S3  reason: invalid class name */
public class AnonymousClass0S3 {
    public static void A00(String str) {
        Set set = C03260Jl.A00;
        if (!set.contains(str)) {
            Log.w("LOTTIE", str, (Throwable) null);
            set.add(str);
        }
    }

    public static void A01(String str, Throwable th) {
        Set set = C03260Jl.A00;
        if (!set.contains(str)) {
            Log.w("LOTTIE", str, th);
            set.add(str);
        }
    }
}
