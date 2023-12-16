package X;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.8Oe  reason: invalid class name and case insensitive filesystem */
public class C173068Oe implements Callable {
    public final /* synthetic */ C180488l9 A00;
    public final /* synthetic */ AnonymousClass7S1 A01;
    public final /* synthetic */ C146727Bj A02;
    public final /* synthetic */ Object A03;
    public final /* synthetic */ List A04;

    public C173068Oe(C180488l9 r1, AnonymousClass7S1 r2, C146727Bj r3, Object obj, List list) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = obj;
        this.A04 = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0067, code lost:
        if (r3 == null) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r10 = this;
            X.7Bj r0 = r10.A02
            X.7S1 r7 = r10.A01
            java.lang.Object r6 = r10.A03
            java.util.List r4 = r10.A04
            X.7Ge r6 = (X.C147907Ge) r6
            X.7K5 r5 = r0.A00
            monitor-enter(r5)
            java.util.concurrent.RunnableFuture r3 = r5.A01     // Catch:{ all -> 0x00a3 }
            X.7P6 r1 = r5.A00     // Catch:{ all -> 0x00a3 }
            monitor-exit(r5)     // Catch:{ all -> 0x00a3 }
            if (r1 != 0) goto L_0x0042
            if (r3 == 0) goto L_0x003b
            java.util.concurrent.atomic.AtomicInteger r2 = r5.A02
            r1 = -1
            int r0 = android.os.Process.myTid()
            boolean r0 = r2.compareAndSet(r1, r0)
            if (r0 == 0) goto L_0x0026
            r3.run()
        L_0x0026:
            int r0 = r2.get()
            java.lang.Object r1 = X.C161827qc.A01(r3, r0)
            X.7P6 r1 = (X.AnonymousClass7P6) r1
            monitor-enter(r5)
            r5.A00 = r1     // Catch:{ all -> 0x0038 }
            r0 = 0
            r5.A01 = r0     // Catch:{ all -> 0x0038 }
            monitor-exit(r5)     // Catch:{ all -> 0x0038 }
            goto L_0x0042
        L_0x0038:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0038 }
            throw r0
        L_0x003b:
            java.lang.String r0 = "The future task is null but there is no computed result"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0042:
            java.lang.Object r0 = r7.A01
            X.7bI r0 = (X.C153427bI) r0
            java.util.Objects.requireNonNull(r0)
            boolean r0 = X.C162377rs.A0C(r0)
            r5 = 0
            if (r0 == 0) goto L_0x00a1
            if (r6 == 0) goto L_0x009f
            X.7jL r2 = r6.A00
        L_0x0054:
            X.8DC r9 = X.AnonymousClass8DC.A00
            r0 = 1
            X.C162457s7.A0J(r1, r0)
            X.84O r8 = r1.A01
            r6 = 0
            if (r2 == 0) goto L_0x0069
            X.8l9 r6 = r2.A00
            X.84O r6 = (X.AnonymousClass84O) r6
            java.lang.Object r3 = r2.A01
            java.util.Map r3 = (java.util.Map) r3
            if (r3 != 0) goto L_0x006d
        L_0x0069:
            java.util.Map r3 = X.C73813g7.A0A()
        L_0x006d:
            r0 = 0
            X.C162457s7.A0J(r4, r0)
            java.util.ArrayList r2 = X.AnonymousClass002.A0J(r4)
            X.7Nk r0 = new X.7Nk
            r0.<init>(r7, r9, r2, r3)
            X.84O r2 = X.AnonymousClass73L.A00(r8, r6, r0)
            java.util.Map r0 = r0.A03
            X.7jL r3 = new X.7jL
            r3.<init>(r2, r0, r4)
        L_0x0085:
            X.7Ge r2 = new X.7Ge
            r2.<init>(r3, r1)
            X.7jL r0 = r2.A00
            if (r0 == 0) goto L_0x009a
            X.8l9 r1 = r0.A00
        L_0x0090:
            if (r3 == 0) goto L_0x0094
            java.util.List r5 = r3.A02
        L_0x0094:
            X.7jL r0 = new X.7jL
            r0.<init>(r1, r2, r5)
            return r0
        L_0x009a:
            X.7P6 r0 = r2.A01
            X.84O r1 = r0.A01
            goto L_0x0090
        L_0x009f:
            r2 = r5
            goto L_0x0054
        L_0x00a1:
            r3 = r5
            goto L_0x0085
        L_0x00a3:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00a3 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C173068Oe.call():java.lang.Object");
    }
}
