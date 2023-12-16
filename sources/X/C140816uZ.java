package X;

import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: X.6uZ  reason: invalid class name and case insensitive filesystem */
public final class C140816uZ extends ClassLoader {
    public final Class loadClass(String str, boolean z) {
        if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
            return super.loadClass(str, z);
        }
        if (!FirebaseInstanceId.A03()) {
            return C165917xq.class;
        }
        Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
        return C165917xq.class;
    }
}
