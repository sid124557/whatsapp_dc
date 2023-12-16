package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* renamed from: X.0S5  reason: invalid class name */
public class AnonymousClass0S5 {
    public static void A00(C153427bI r3, AnonymousClass84O r4, List list) {
        String valueOf;
        if (Build.VERSION.SDK_INT >= 22 && list != null && !list.isEmpty()) {
            for (Object next : list) {
                if (next == null) {
                    valueOf = null;
                } else if (next instanceof String) {
                    valueOf = (String) next;
                } else {
                    valueOf = String.valueOf(next);
                }
                AnonymousClass84O A00 = AnonymousClass738.A00(r4, new AnonymousClass8DA(valueOf));
                if (A00 != null && A00.A0G(r3) != null) {
                    A00.A0G(r3).setAccessibilityTraversalAfter(-1);
                } else {
                    return;
                }
            }
        }
    }

    public static void A01(C153427bI r2, AnonymousClass84O r3, List list) {
        if (Build.VERSION.SDK_INT >= 22 && list != null && !list.isEmpty()) {
            new Handler(Looper.myLooper()).post(new C12740m3(r2, r3, list));
        }
    }
}
