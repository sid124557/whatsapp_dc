package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;

/* renamed from: X.0mw  reason: invalid class name and case insensitive filesystem */
public class C13290mw implements Runnable {
    public final Throwable A00;
    public final /* synthetic */ Handler A01;
    public final /* synthetic */ C08310eF A02;
    public final /* synthetic */ Runnable A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C13290mw(Handler handler, C08310eF r3, Runnable runnable) {
        this(true);
        this.A02 = r3;
        this.A01 = handler;
        this.A03 = runnable;
    }

    public final void run() {
        try {
            C08310eF r0 = this.A02;
            Context A1D = r0.A1D();
            boolean z = true;
            boolean A1W = AnonymousClass000.A1W(r0.A0B);
            boolean A1X = AnonymousClass000.A1X(A1D);
            if (!(A1D instanceof ContextWrapper) || ((ContextWrapper) A1D).getBaseContext() != null) {
                z = false;
            }
            if (!A1W || A1X || z) {
                this.A01.post(this);
            } else {
                this.A03.run();
            }
        } catch (Throwable th) {
            Throwable th2 = this.A00;
            C162477s9.A08("CDSThreadTracing", "--- start debug trace");
            C162477s9.A0H(th2);
            C162477s9.A08("CDSThreadTracing", "--- end debug trace");
            throw th;
        }
    }

    public C13290mw(boolean z) {
        Thread currentThread = Thread.currentThread();
        StringBuilder sb = new StringBuilder("Runnable instantiated on thread id: ");
        sb.append(currentThread.getId());
        sb.append(", name: ");
        this.A00 = new Throwable(AnonymousClass000.A0X(currentThread.getName(), sb));
    }

    public C13290mw() {
        this(true);
    }
}
