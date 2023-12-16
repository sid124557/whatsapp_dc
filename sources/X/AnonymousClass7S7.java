package X;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.7S7  reason: invalid class name */
public final class AnonymousClass7S7 {
    public final Map A00 = Collections.synchronizedMap(new WeakHashMap());
    public final Map A01 = Collections.synchronizedMap(new WeakHashMap());

    public final void A00(Status status, boolean z) {
        HashMap hashMap;
        HashMap hashMap2;
        Map map = this.A00;
        synchronized (map) {
            hashMap = new HashMap(map);
        }
        Map map2 = this.A01;
        synchronized (map2) {
            hashMap2 = new HashMap(map2);
        }
        Iterator A0u = AnonymousClass001.A0u(hashMap);
        while (A0u.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0u);
            if (z || AnonymousClass001.A1Z(A0w.getValue())) {
                ((BasePendingResult) A0w.getKey()).A07(status);
            }
        }
        Iterator A0u2 = AnonymousClass001.A0u(hashMap2);
        while (A0u2.hasNext()) {
            Map.Entry A0w2 = AnonymousClass001.A0w(A0u2);
            if (z || AnonymousClass001.A1Z(A0w2.getValue())) {
                ((C152017Xf) A0w2.getKey()).A01(new ApiException(status));
            }
        }
    }
}
