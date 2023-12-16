package X;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.7iJ  reason: invalid class name and case insensitive filesystem */
public final class C157447iJ {
    public static final AnonymousClass7GE A03 = new AnonymousClass7GE(2, -9223372036854775807L);
    public static final AnonymousClass7GE A04 = new AnonymousClass7GE(3, -9223372036854775807L);
    public AnonymousClass6E1 A00;
    public IOException A01;
    public final ExecutorService A02;

    public C157447iJ(String str) {
        this.A02 = Executors.newSingleThreadExecutor(new C161557pu(str, 1));
    }

    public void A00(C184918sl r10, C183898qq r11) {
        Looper myLooper = Looper.myLooper();
        C161487pm.A01(myLooper);
        this.A01 = null;
        AnonymousClass6E1 r2 = new AnonymousClass6E1(myLooper, r10, r11, this, SystemClock.elapsedRealtime());
        C157447iJ r1 = r2.A08;
        C161487pm.A04(AnonymousClass000.A1X(r1.A00));
        r1.A00 = r2;
        r2.A02 = null;
        r1.A02.execute(r2);
    }
}
