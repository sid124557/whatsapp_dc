package X;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.83m  reason: invalid class name and case insensitive filesystem */
public final class C1679683m implements C177808gU {
    public final Executor A00;
    public final Executor A01;
    public final Executor A02;
    public final Executor A03;
    public final ScheduledExecutorService A04;

    public C1679683m(int i) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2, new C173198Or("FrescoIoBoundExecutor"));
        C162457s7.A0D(newFixedThreadPool);
        this.A02 = newFixedThreadPool;
        ExecutorService newFixedThreadPool2 = Executors.newFixedThreadPool(i, new C173198Or("FrescoDecodeExecutor"));
        C162457s7.A0D(newFixedThreadPool2);
        this.A01 = newFixedThreadPool2;
        ExecutorService newFixedThreadPool3 = Executors.newFixedThreadPool(i, new C173198Or("FrescoBackgroundExecutor"));
        C162457s7.A0D(newFixedThreadPool3);
        this.A00 = newFixedThreadPool3;
        ExecutorService newFixedThreadPool4 = Executors.newFixedThreadPool(1, new C173198Or("FrescoLightWeightBackgroundExecutor"));
        C162457s7.A0D(newFixedThreadPool4);
        this.A03 = newFixedThreadPool4;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(i, new C173198Or("FrescoBackgroundExecutor"));
        C162457s7.A0D(newScheduledThreadPool);
        this.A04 = newScheduledThreadPool;
    }
}
