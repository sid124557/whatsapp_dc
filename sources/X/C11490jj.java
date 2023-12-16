package X;

import android.os.Process;

/* renamed from: X.0jj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C11490jj implements Runnable {
    public final /* synthetic */ Runnable A00;

    public final void run() {
        Runnable runnable = this.A00;
        Process.setThreadPriority(10);
        runnable.run();
    }

    public /* synthetic */ C11490jj(Runnable runnable) {
        this.A00 = runnable;
    }
}
