package X;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4up  reason: invalid class name and case insensitive filesystem */
public class C95894up extends C56482s3 {
    public final C56722sS A00;
    public final C64773Ex A01;
    public final C56332ro A02;
    public final C620633i A03;
    public final C54292oU A04;
    public final C620733j A05;
    public final AnonymousClass5TD A06;

    public C95894up(C56722sS r3, C64773Ex r4, C56332ro r5, C620633i r6, C54292oU r7, C620733j r8, AnonymousClass5TD r9, ThreadPoolExecutor threadPoolExecutor) {
        super(new C72333dY(threadPoolExecutor, (AnonymousClass4C1) null));
        this.A04 = r7;
        this.A00 = r3;
        this.A06 = r9;
        this.A01 = r4;
        this.A03 = r6;
        this.A05 = r8;
        this.A02 = r5;
    }

    public static ThreadPoolExecutor A00(AnonymousClass4FS r10) {
        C34091uD r0 = new C34091uD((C69423Wy) r10, "VCardLoader", new PriorityBlockingQueue(), new C117985so(0, "VCardLoader"), TimeUnit.SECONDS, 1, 1, 5, false);
        r0.allowCoreThreadTimeOut(true);
        return r0;
    }

    public /* bridge */ /* synthetic */ Runnable A07(Object obj, Object obj2) {
        return new C90004fd((C624134x) obj, this);
    }

    public void A08() {
        A03(new AnonymousClass92X(this, 9));
        synchronized (this) {
            ((ThreadPoolExecutor) this.A00.get()).shutdown();
        }
    }
}
