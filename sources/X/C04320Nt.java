package X;

import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: X.0Nt  reason: invalid class name and case insensitive filesystem */
public final class C04320Nt {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C15340rB A03;
    public final C05500Tp A04;
    public final Executor A05 = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new C13740nf(this, false));
    public final Executor A06 = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new C13740nf(this, true));

    public int A00() {
        if (Build.VERSION.SDK_INT == 23) {
            return 10;
        }
        return 20;
    }

    public C04320Nt(C03780Ln r4) {
        C05500Tp r0 = r4.A02;
        this.A04 = r0 == null ? new AnonymousClass0B4() : r0;
        this.A03 = new C08980fS();
        this.A00 = r4.A00;
        this.A02 = r4.A01;
        this.A01 = Integer.MAX_VALUE;
    }
}
