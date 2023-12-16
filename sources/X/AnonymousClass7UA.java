package X;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7UA  reason: invalid class name */
public class AnonymousClass7UA {
    public int A00;
    public final AnonymousClass7JO A01;
    public final Object A02;
    public final String A03 = AnonymousClass7UA.class.getSimpleName();
    public final HashSet A04;
    public final LinkedList A05;
    public final AtomicInteger A06;

    public static void A00(AnonymousClass7UA r4, Object obj) {
        if (obj != null) {
            C161157p6.A01(r4.A03, "%s", obj);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ac, code lost:
        A00(r11, r8);
        A00(r11, r3);
        r3 = r11.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b4, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r8 = r11.A00;
        r7 = r2.prefetchTaskQueueWorkerNum;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bb, code lost:
        if (r2.useNetworkAwaretPrefetchTaskQueueWorkerNum == false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bd, code lost:
        r1 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bf, code lost:
        if (r1 == null) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c1, code lost:
        r7 = r1.A01(17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c7, code lost:
        if (r8 >= r7) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ca, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r7 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d3, code lost:
        if (r7.hasNext() == false) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d5, code lost:
        r0 = (X.C152147Xs) r7.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00db, code lost:
        if (r0 == null) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e3, code lost:
        if (r0.A00.A00 != X.C141886wI.URGENT) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e5, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r1 = r11.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ea, code lost:
        if (r1 >= r2.prefetchUrgentTaskQueueWorkerNum) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ec, code lost:
        r0 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00ef, code lost:
        r0 = r11.A00 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f3, code lost:
        r11.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f5, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f6, code lost:
        r1 = new X.C173798Rs(new X.C172668Mf(r11, 5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0103, code lost:
        if (r2.changeThreadPriorityForPrefetch == false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0105, code lost:
        r1.setPriority(r2.prefetchThreadUpdatedPriority);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x010a, code lost:
        r1.start();
        r4 = r11.A03;
        r2 = X.AnonymousClass002.A0M();
        X.AnonymousClass000.A1Q(r2, 0, r1.getId());
        X.AnonymousClass000.A1P(r2, r11.A00, 1);
        X.C161157p6.A01(r4, "Create a new worker %d. Total worker number is %d.", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0124, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0127, code lost:
        r3 = r11.A03;
        r1 = new java.lang.Object[1];
        X.AnonymousClass000.A1P(r1, r4.size(), 0);
        X.C161157p6.A01(r3, "All workers are busy. Tasks on pending %d.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0137, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C152147Xs r12, boolean r13) {
        /*
            r11 = this;
            r6 = 1
            r7 = 0
            r5 = 0
            java.util.LinkedList r4 = r11.A05     // Catch:{ all -> 0x0150 }
            monitor-enter(r4)     // Catch:{ all -> 0x0150 }
            java.util.HashSet r0 = r11.A04     // Catch:{ all -> 0x0141 }
            boolean r0 = r0.contains(r12)     // Catch:{ all -> 0x0141 }
            if (r0 == 0) goto L_0x0010
            monitor-exit(r4)     // Catch:{ all -> 0x0141 }
            return
        L_0x0010:
            int r10 = r4.size()     // Catch:{ all -> 0x0141 }
            X.7JO r1 = r11.A01     // Catch:{ all -> 0x0141 }
            X.8LG r2 = r1.A02     // Catch:{ all -> 0x0141 }
            int r9 = r2.prefetchTaskQueueSize     // Catch:{ all -> 0x0141 }
            if (r13 == 0) goto L_0x0052
            boolean r0 = r4.contains(r12)     // Catch:{ all -> 0x0141 }
            if (r0 == 0) goto L_0x0032
            r4.remove(r12)     // Catch:{ all -> 0x0141 }
            int r10 = r10 + -1
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = "Found duplicate task. The old task is removed "
            java.lang.String r8 = X.AnonymousClass000.A0P(r12, r0, r3)     // Catch:{ all -> 0x0141 }
            goto L_0x0033
        L_0x0032:
            r8 = r7
        L_0x0033:
            int r9 = r9 - r6
            if (r9 >= r10) goto L_0x003f
            java.util.List r0 = r4.subList(r9, r10)     // Catch:{ all -> 0x0145 }
            r0.clear()     // Catch:{ all -> 0x0145 }
            java.lang.String r8 = "Task queue is over sized. Remove the old tasks"
        L_0x003f:
            r4.addFirst(r12)     // Catch:{ all -> 0x0145 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = "Add new task to the front of the queue. Total task number is "
            X.C18260x0.A19(r0, r3, r4)     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = ", "
            java.lang.String r3 = X.AnonymousClass000.A0P(r12, r0, r3)     // Catch:{ all -> 0x0145 }
            goto L_0x0098
        L_0x0052:
            if (r9 > r10) goto L_0x0073
            if (r9 >= r10) goto L_0x0068
            java.util.List r0 = r4.subList(r9, r10)     // Catch:{ all -> 0x0141 }
            r0.clear()     // Catch:{ all -> 0x0141 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = "Task queue is over sized. Remove the old tasks. The new task is not added "
            java.lang.String r8 = X.AnonymousClass000.A0P(r12, r0, r3)     // Catch:{ all -> 0x0141 }
            goto L_0x0083
        L_0x0068:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = "Task queue is over sized. The new task is not added "
            java.lang.String r8 = X.AnonymousClass000.A0P(r12, r0, r3)     // Catch:{ all -> 0x0141 }
            goto L_0x0083
        L_0x0073:
            boolean r0 = r4.contains(r12)     // Catch:{ all -> 0x0141 }
            if (r0 == 0) goto L_0x0085
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = "Found duplicate task. The new task is not added. "
            java.lang.String r8 = X.AnonymousClass000.A0P(r12, r0, r3)     // Catch:{ all -> 0x0141 }
        L_0x0083:
            r3 = r7
            goto L_0x00ab
        L_0x0085:
            r4.addLast(r12)     // Catch:{ all -> 0x0141 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = "Add new task to the end of queue. Total task number is "
            X.C18260x0.A19(r0, r3, r4)     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = ", "
            java.lang.String r3 = X.AnonymousClass000.A0P(r12, r0, r3)     // Catch:{ all -> 0x0141 }
            r8 = r7
        L_0x0098:
            java.util.concurrent.atomic.AtomicInteger r0 = r11.A06     // Catch:{ all -> 0x013e }
            int r0 = r0.get()     // Catch:{ all -> 0x013e }
            if (r0 <= 0) goto L_0x00ab
            r4.notify()     // Catch:{ all -> 0x013e }
            monitor-exit(r4)     // Catch:{ all -> 0x013e }
            A00(r11, r8)
            A00(r11, r3)
            return
        L_0x00ab:
            monitor-exit(r4)     // Catch:{ all -> 0x013e }
            A00(r11, r8)
            A00(r11, r3)
            java.lang.Object r3 = r11.A02
            monitor-enter(r3)
            int r8 = r11.A00     // Catch:{ all -> 0x013b }
            int r7 = r2.prefetchTaskQueueWorkerNum     // Catch:{ all -> 0x013b }
            boolean r0 = r2.useNetworkAwaretPrefetchTaskQueueWorkerNum     // Catch:{ all -> 0x013b }
            if (r0 == 0) goto L_0x00c7
            X.7pY r1 = r1.A00     // Catch:{ all -> 0x013b }
            if (r1 == 0) goto L_0x00c7
            r0 = 17
            int r7 = r1.A01(r0)     // Catch:{ all -> 0x013b }
        L_0x00c7:
            if (r8 >= r7) goto L_0x00ca
            goto L_0x00ef
        L_0x00ca:
            monitor-enter(r4)     // Catch:{ all -> 0x013b }
            java.util.Iterator r7 = r4.iterator()     // Catch:{ all -> 0x0138 }
        L_0x00cf:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0138 }
            if (r0 == 0) goto L_0x0125
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x0138 }
            X.7Xs r0 = (X.C152147Xs) r0     // Catch:{ all -> 0x0138 }
            if (r0 == 0) goto L_0x00cf
            X.7bc r0 = r0.A00     // Catch:{ all -> 0x0138 }
            X.6wI r1 = r0.A00     // Catch:{ all -> 0x0138 }
            X.6wI r0 = X.C141886wI.URGENT     // Catch:{ all -> 0x0138 }
            if (r1 != r0) goto L_0x00cf
            monitor-exit(r4)     // Catch:{ all -> 0x0138 }
            int r1 = r11.A00     // Catch:{ all -> 0x013b }
            int r0 = r2.prefetchUrgentTaskQueueWorkerNum     // Catch:{ all -> 0x013b }
            if (r1 >= r0) goto L_0x0126
            int r0 = r1 + 1
            goto L_0x00f3
        L_0x00ef:
            int r0 = r11.A00     // Catch:{ all -> 0x013b }
            int r0 = r0 + 1
        L_0x00f3:
            r11.A00 = r0     // Catch:{ all -> 0x013b }
            monitor-exit(r3)     // Catch:{ all -> 0x013b }
            r1 = 5
            X.8Mf r0 = new X.8Mf
            r0.<init>(r11, r1)
            X.8Rs r1 = new X.8Rs
            r1.<init>(r0)
            boolean r0 = r2.changeThreadPriorityForPrefetch
            if (r0 == 0) goto L_0x010a
            int r0 = r2.prefetchThreadUpdatedPriority
            r1.setPriority(r0)
        L_0x010a:
            r1.start()
            java.lang.String r4 = r11.A03
            java.lang.String r3 = "Create a new worker %d. Total worker number is %d."
            java.lang.Object[] r2 = X.AnonymousClass002.A0M()
            long r0 = r1.getId()
            X.AnonymousClass000.A1Q(r2, r5, r0)
            int r0 = r11.A00
            X.AnonymousClass000.A1P(r2, r0, r6)
            X.C161157p6.A01(r4, r3, r2)
            return
        L_0x0125:
            monitor-exit(r4)     // Catch:{ all -> 0x0138 }
        L_0x0126:
            monitor-exit(r3)     // Catch:{ all -> 0x013b }
            java.lang.String r3 = r11.A03
            java.lang.String r2 = "All workers are busy. Tasks on pending %d."
            java.lang.Object[] r1 = new java.lang.Object[r6]
            int r0 = r4.size()
            X.AnonymousClass000.A1P(r1, r0, r5)
            X.C161157p6.A01(r3, r2, r1)
            return
        L_0x0138:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0138 }
            throw r0     // Catch:{ all -> 0x013b }
        L_0x013b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x013b }
            throw r0
        L_0x013e:
            r0 = move-exception
            r7 = r3
            goto L_0x0143
        L_0x0141:
            r0 = move-exception
            r8 = r7
        L_0x0143:
            monitor-exit(r4)     // Catch:{ all -> 0x0145 }
            goto L_0x0147
        L_0x0145:
            r0 = move-exception
            goto L_0x0143
        L_0x0147:
            throw r0     // Catch:{ all -> 0x0148 }
        L_0x0148:
            r0 = move-exception
            A00(r11, r8)
            A00(r11, r7)
            throw r0
        L_0x0150:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7UA.A01(X.7Xs, boolean):void");
    }

    public AnonymousClass7UA(AnonymousClass7JO r3) {
        this.A01 = r3;
        this.A05 = AnonymousClass0x9.A18();
        this.A04 = AnonymousClass002.A0K();
        this.A02 = AnonymousClass002.A0D();
        this.A00 = 0;
        this.A06 = new AtomicInteger(0);
    }
}
