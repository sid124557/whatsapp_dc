package X;

import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.7fr  reason: invalid class name and case insensitive filesystem */
public class C155997fr {
    public final C183718qV A00;
    public final ExecutorService A01 = Executors.newFixedThreadPool(3);

    public C155997fr(int i) {
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        this.A00 = realtimeSinceBootClock;
    }

    public C155997fr() {
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        this.A00 = realtimeSinceBootClock;
    }
}
