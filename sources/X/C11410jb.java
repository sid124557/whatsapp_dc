package X;

import android.os.Process;

/* renamed from: X.0jb  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C11410jb implements Runnable {
    public final /* synthetic */ Runnable A00;

    public final void run() {
        Runnable runnable = this.A00;
        Process.setThreadPriority(10);
        runnable.run();
    }

    public /* synthetic */ C11410jb(Runnable runnable) {
        this.A00 = runnable;
    }
}
