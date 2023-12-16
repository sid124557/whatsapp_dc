package X;

import android.os.SystemClock;
import java.util.concurrent.Callable;

/* renamed from: X.9kB  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201469kB implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass9ZR A01;

    public final Object call() {
        AnonymousClass9ZR r6 = this.A01;
        long j = this.A00;
        if (r6.A0f) {
            AnonymousClass9VT r5 = r6.A0A;
            r5.getClass();
            r5.A02(AnonymousClass9VT.A0Q, Long.valueOf(SystemClock.elapsedRealtime()));
            r6.A06();
            AnonymousClass9VT r2 = r6.A0A;
            r2.getClass();
            r2.A02(AnonymousClass9VT.A0P, Long.valueOf(j));
            return r6.A0A;
        }
        throw AnonymousClass001.A0e("Not recording video.");
    }

    public /* synthetic */ C201469kB(AnonymousClass9ZR r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }
}
