package X;

import android.os.Process;

/* renamed from: X.8Rj  reason: invalid class name and case insensitive filesystem */
public final class C173718Rj extends Thread {
    public final /* synthetic */ AnonymousClass7FF A00;

    public C173718Rj(AnonymousClass7FF r1) {
        this.A00 = r1;
    }

    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                ((C172748Mo) this.A00.A00.take()).run();
            } catch (InterruptedException unused) {
            }
        }
    }
}
