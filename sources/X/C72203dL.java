package X;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.3dL  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C72203dL implements RejectedExecutionHandler {
    public final /* synthetic */ C73213f7 A00;
    public final /* synthetic */ C53752nb A01;

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        C73213f7 r3 = this.A00;
        C53752nb r2 = this.A01;
        if (runnable instanceof C70163a3) {
            C70163a3 r5 = (C70163a3) runnable;
            if (r5.A02 == 18) {
                Job job = (Job) r5.A00;
                r2.A02(job);
                String str = job.parameters.groupId;
                if (str != null) {
                    synchronized (r2) {
                        r2.A03.remove(str);
                        r2.A05.A00.open();
                    }
                }
            }
        }
        try {
            r3.A00.getQueue().put(new C172578Lw(31));
        } catch (InterruptedException unused) {
            C18300x5.A11();
        }
    }

    public /* synthetic */ C72203dL(C73213f7 r1, C53752nb r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
