package X;

import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.89G  reason: invalid class name */
public class AnonymousClass89G implements C180838li {
    public static AtomicReference A00 = new AtomicReference();

    public void BNG(boolean z) {
        synchronized (C161757qO.A09) {
            Iterator it = C18300x5.A0v(C161757qO.A0A).iterator();
            while (it.hasNext()) {
                C161757qO r2 = (C161757qO) it.next();
                if (r2.A07.get()) {
                    Log.d("FirebaseApp", "Notifying background state change listeners.");
                    Iterator it2 = r2.A05.iterator();
                    if (it2.hasNext()) {
                        it2.next();
                        throw AnonymousClass001.A0g("onBackgroundStateChanged");
                    }
                }
            }
        }
    }
}
