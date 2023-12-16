package X;

import java.util.Map;

/* renamed from: X.0l0  reason: invalid class name and case insensitive filesystem */
public class C12120l0 implements Runnable {
    public final AnonymousClass0PL A00;
    public final C05410Tf A01;

    public void run() {
        C05410Tf r1 = this.A01;
        synchronized (r1.A01) {
            Map map = r1.A03;
            AnonymousClass0PL r6 = this.A00;
            if (((C12120l0) map.remove(r6)) != null) {
                C15420rJ r4 = (C15420rJ) r1.A02.remove(r6);
                if (r4 != null) {
                    C09070fb r42 = (C09070fb) r4;
                    C06240Wu.A02(C06240Wu.A00(), r6, "Exceeded time limits on execution for ", C09070fb.A0C, AnonymousClass001.A0o());
                    r42.A0B.execute(new C11130j9(r42));
                }
            } else {
                C06240Wu.A00().A04("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", AnonymousClass000.A1b(r6)));
            }
        }
    }

    public C12120l0(AnonymousClass0PL r1, C05410Tf r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
