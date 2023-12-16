package X;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.725  reason: invalid class name */
public class AnonymousClass725 {
    public static List A00(C142366x5 r7, Map map, long j) {
        ArrayList A0s = AnonymousClass001.A0s();
        SparseArray sparseArray = (SparseArray) map.get(r7);
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                Object valueAt = sparseArray.valueAt(i);
                valueAt.getClass();
                if (((C153247av) valueAt).A01(j, TimeUnit.MICROSECONDS)) {
                    C18270x1.A1K(A0s, keyAt);
                }
            }
        }
        return A0s;
    }
}
