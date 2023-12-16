package X;

import android.os.SystemClock;
import java.util.HashMap;

/* renamed from: X.2jH  reason: invalid class name and case insensitive filesystem */
public class C51102jH {
    public final HashMap A00 = AnonymousClass001.A0t();

    public synchronized void A00() {
        this.A00.clear();
    }

    public synchronized void A01(Object obj) {
        this.A00.remove(obj);
    }

    public synchronized boolean A02(Object obj) {
        HashMap hashMap = this.A00;
        Long l = (Long) hashMap.get(obj);
        if (l != null && l.longValue() + 60000 > SystemClock.elapsedRealtime()) {
            return false;
        }
        AnonymousClass0x2.A1J(obj, hashMap, SystemClock.elapsedRealtime());
        return true;
    }
}
