package X;

import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.1fi  reason: invalid class name and case insensitive filesystem */
public class C28111fi extends C56482s3 {
    public final AnonymousClass1VX A00;

    /* renamed from: A08 */
    public synchronized AnonymousClass1I7 A02(AnonymousClass1I7 r6, C624134x r7) {
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.A00.get();
        int corePoolSize = threadPoolExecutor.getCorePoolSize();
        int max = Math.max(1, Math.min(10, this.A00.A0O(C58422vE.A02, 49)));
        if (corePoolSize != max) {
            C18260x0.A0w("mediadownloadpriorityqueue/enqueue/updating thread pool size to ", AnonymousClass001.A0o(), max);
            if (max > corePoolSize) {
                threadPoolExecutor.setMaximumPoolSize(max);
                threadPoolExecutor.setCorePoolSize(max);
            } else {
                threadPoolExecutor.setCorePoolSize(max);
                threadPoolExecutor.setMaximumPoolSize(max);
            }
        }
        return (AnonymousClass1I7) super.A02(r7, r6);
    }

    public C28111fi(AnonymousClass1VX r2, AnonymousClass4FS r3) {
        super(C72333dY.A05(r3, 25));
        this.A00 = r2;
    }
}
