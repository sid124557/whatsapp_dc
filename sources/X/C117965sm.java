package X;

import android.util.Log;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.5sm  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C117965sm implements RejectedExecutionHandler {
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("The task ");
        A0o.append(runnable);
        Log.d("JobConsumer", AnonymousClass000.A0X(" has been rejected as it is executed after shutdown", A0o));
    }
}
