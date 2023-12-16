package X;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7dh  reason: invalid class name and case insensitive filesystem */
public class C154757dh {
    public static AtomicBoolean A00 = C18280x3.A0l();

    public static void A00() {
        boolean isEnabled = Trace.isEnabled();
        if (A00.compareAndSet(!isEnabled, isEnabled)) {
            C161617q6.A00(4);
        }
    }
}
