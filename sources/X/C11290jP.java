package X;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0jP  reason: invalid class name and case insensitive filesystem */
public class C11290jP implements Runnable {
    public final /* synthetic */ AnonymousClass0MX A00;

    public C11290jP(AnonymousClass0MX r1) {
        this.A00 = r1;
    }

    public void run() {
        C126356Nn r1;
        try {
            AnonymousClass0MX r5 = this.A00;
            List list = r5.A04;
            if (!list.isEmpty()) {
                synchronized (list) {
                    r1 = new C126356Nn(list);
                    list.clear();
                }
                r5.A02.B2p(r1);
            }
            r5.A01.postDelayed(r5.A03, TimeUnit.SECONDS.toMillis((long) r5.A00));
        } catch (Throwable th) {
            AnonymousClass0MX r0 = this.A00;
            r0.A01.postDelayed(r0.A03, TimeUnit.SECONDS.toMillis((long) r0.A00));
            throw th;
        }
    }
}
