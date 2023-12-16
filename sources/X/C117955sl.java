package X;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.5sl  reason: invalid class name and case insensitive filesystem */
public class C117955sl implements RejectedExecutionHandler {
    public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WaWorkers/WaWorkerNoopRejectedExecutionHandler/The task ");
        A0o.append(runnable);
        C18260x0.A1J(A0o, " has been rejected as it is executed after shutdown");
    }
}
