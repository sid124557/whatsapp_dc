package X;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.7iK  reason: invalid class name and case insensitive filesystem */
public final class C157457iK {
    public static final AnonymousClass7A8 A03 = new AnonymousClass7A8(2);
    public static final AnonymousClass7A8 A04 = new AnonymousClass7A8(3);
    public static final AnonymousClass7A8 A05 = new AnonymousClass7A8(0);
    public static final AnonymousClass7A8 A06 = new AnonymousClass7A8(1);
    public AnonymousClass6E2 A00;
    public IOException A01;
    public final ExecutorService A02;

    public C157457iK(String str) {
        this.A02 = Executors.newSingleThreadExecutor(new C161557pu(str, 0));
    }

    public void A00(C184758sT r11, C183688qS r12, int i) {
        Looper myLooper = Looper.myLooper();
        C159197lM.A02(AnonymousClass000.A1W(myLooper));
        C159197lM.A02(AnonymousClass000.A1W(myLooper));
        this.A01 = null;
        AnonymousClass6E2 r2 = new AnonymousClass6E2(myLooper, r11, r12, this, i, SystemClock.elapsedRealtime());
        C157457iK r1 = r2.A0A;
        C159197lM.A02(AnonymousClass000.A1X(r1.A00));
        r1.A00 = r2;
        r2.A03 = null;
        r1.A02.execute(r2);
    }
}
