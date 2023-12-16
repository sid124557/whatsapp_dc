package X;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2Yh  reason: invalid class name and case insensitive filesystem */
public class C45002Yh {
    public final C48972fm A00;
    public final ThreadPoolExecutor A01;

    public void A00(Runnable runnable) {
        ThreadPoolExecutor threadPoolExecutor = this.A01;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.execute(runnable);
        } else {
            C48972fm.A02(this.A00, runnable);
        }
    }

    public C45002Yh(C48972fm r9, AnonymousClass1VX r10) {
        ThreadPoolExecutor threadPoolExecutor;
        this.A00 = r9;
        C58422vE r1 = C58422vE.A02;
        if (!r10.A0Y(r1, 2233) || !r10.A0Y(r1, 1885)) {
            threadPoolExecutor = null;
        } else {
            threadPoolExecutor = new ThreadPoolExecutor(0, 1, 300, TimeUnit.SECONDS, new LinkedBlockingQueue(), new AnonymousClass343(1));
        }
        this.A01 = threadPoolExecutor;
    }
}
