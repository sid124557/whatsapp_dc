package X;

import android.os.Process;

/* renamed from: X.0ns  reason: invalid class name and case insensitive filesystem */
public class C13870ns extends Thread {
    public final int A00 = 10;

    public C13870ns(Runnable runnable) {
        super(runnable, "fonts-androidx");
    }

    public void run() {
        Process.setThreadPriority(this.A00);
        super.run();
    }
}
