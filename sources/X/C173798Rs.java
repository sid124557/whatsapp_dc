package X;

import android.os.Process;

/* renamed from: X.8Rs  reason: invalid class name and case insensitive filesystem */
public class C173798Rs extends Thread {
    public C173798Rs(Runnable runnable, String str) {
        super(runnable, str);
    }

    public void run() {
        int myTid = Process.myTid();
        C156487gi r2 = C156487gi.A03;
        Integer valueOf = Integer.valueOf(myTid);
        synchronized (r2) {
            if (valueOf != null) {
                r2.A01.add(valueOf);
            }
        }
        super.run();
        synchronized (r2) {
            if (valueOf != null) {
                r2.A01.remove(valueOf);
                r2.A00.remove(valueOf);
            }
        }
    }

    public C173798Rs() {
    }

    public C173798Rs(Runnable runnable) {
        super(runnable);
    }
}
