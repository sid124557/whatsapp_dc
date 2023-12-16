package X;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.2pN  reason: invalid class name and case insensitive filesystem */
public class C54842pN {
    public final HashMap A00 = AnonymousClass001.A0t();
    public final Map A01 = new WeakHashMap();
    public final Map A02 = new WeakHashMap();
    public final AtomicLong A03 = new AtomicLong();
    public final AtomicLong A04 = new AtomicLong();

    public synchronized C174368Tz A00(Runnable runnable) {
        return (C174368Tz) this.A02.get(runnable);
    }

    public synchronized C155937fl A01(Runnable runnable) {
        C155937fl r0;
        r0 = (C155937fl) this.A01.get(runnable);
        if (r0 == null) {
            C174368Tz r02 = (C174368Tz) this.A02.get(runnable);
            if (r02 != null) {
                r0 = A02(r02).A00;
            } else {
                r0 = C155937fl.A01;
            }
        }
        return r0;
    }

    public final synchronized AnonymousClass7O8 A02(C174368Tz r3) {
        AnonymousClass7O8 r0;
        r0 = (AnonymousClass7O8) this.A00.get(r3);
        if (r0 == null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            C18270x1.A1H(A0o, "ThreadPoolExecutor ", r3);
            throw AnonymousClass000.A0I(" must be added using addThreadPoolExecutor", A0o);
        }
        return r0;
    }

    public synchronized String A03(C174368Tz r2, Runnable runnable) {
        return C18310x6.A0o(runnable, A02(r2).A04);
    }
}
