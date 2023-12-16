package X;

import java.util.List;

/* renamed from: X.9ix  reason: invalid class name and case insensitive filesystem */
public class C200829ix implements Runnable {
    public final /* synthetic */ AnonymousClass9W5 A00;
    public final /* synthetic */ C194339Sm A01;
    public final /* synthetic */ List A02;

    public C200829ix(AnonymousClass9W5 r1, C194339Sm r2, List list) {
        this.A00 = r1;
        this.A02 = list;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d8, code lost:
        r1 = r4.A07(r3, r5, !r6.A00());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e7, code lost:
        if (r1.isEmpty() != false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e9, code lost:
        r4.A07(r3, r1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ec, code lost:
        r4.A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ef, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r12 = this;
            X.9W5 r4 = r12.A00
            java.util.List r1 = r12.A02
            X.9Sm r6 = r12.A01
            X.32L r0 = r6.A08
            java.util.List r3 = java.util.Collections.singletonList(r0)
            java.lang.Object r2 = r4.A06
            monitor-enter(r2)
            monitor-enter(r6)     // Catch:{ all -> 0x00f5 }
            boolean r0 = r6.A03     // Catch:{ all -> 0x00f2 }
            monitor-exit(r6)     // Catch:{ all -> 0x00f5 }
            if (r0 != 0) goto L_0x00f0
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x00f5 }
            java.util.Iterator r11 = r1.iterator()     // Catch:{ all -> 0x00f5 }
        L_0x001d:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x00d1
            java.lang.Object r10 = r11.next()     // Catch:{ all -> 0x00f5 }
            X.9Xk r10 = (X.C195349Xk) r10     // Catch:{ all -> 0x00f5 }
            X.9VJ r8 = r4.A01     // Catch:{ all -> 0x00f5 }
            X.9WL r0 = r10.A02     // Catch:{ all -> 0x00f5 }
            java.lang.String r9 = r0.A0A     // Catch:{ all -> 0x00f5 }
            java.util.Map r1 = r8.A03     // Catch:{ all -> 0x00f5 }
            boolean r0 = r1.containsKey(r9)     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x004e
            java.lang.Object r7 = r1.get(r9)     // Catch:{ all -> 0x00f5 }
            X.9Sd r7 = (X.C194249Sd) r7     // Catch:{ all -> 0x00f5 }
            if (r7 != 0) goto L_0x0068
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = "No InternalLoadRequest in mAssetIdToInternalLoadRequestMap for id: "
            r1.append(r0)     // Catch:{ all -> 0x00f5 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r9, r1)     // Catch:{ all -> 0x00f5 }
            goto L_0x00f4
        L_0x004e:
            boolean r0 = r1.containsKey(r9)     // Catch:{ all -> 0x00f5 }
            if (r0 != 0) goto L_0x00c2
            X.9Sd r7 = new X.9Sd     // Catch:{ all -> 0x00f5 }
            r7.<init>(r10)     // Catch:{ all -> 0x00f5 }
            r1.put(r9, r7)     // Catch:{ all -> 0x00f5 }
            java.util.Map r1 = r8.A05     // Catch:{ all -> 0x00f5 }
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x00f5 }
            r1.put(r7, r0)     // Catch:{ all -> 0x00f5 }
            r5.add(r7)     // Catch:{ all -> 0x00f5 }
        L_0x0068:
            java.util.Map r9 = r8.A04     // Catch:{ all -> 0x00f5 }
            boolean r0 = r9.containsKey(r6)     // Catch:{ all -> 0x00f5 }
            X.AnonymousClass9LA.A00(r0)     // Catch:{ all -> 0x00f5 }
            java.util.Map r1 = r8.A05     // Catch:{ all -> 0x00f5 }
            boolean r0 = r1.containsKey(r7)     // Catch:{ all -> 0x00f5 }
            X.AnonymousClass9LA.A00(r0)     // Catch:{ all -> 0x00f5 }
            java.lang.Object r9 = r9.get(r6)     // Catch:{ all -> 0x00f5 }
            java.util.List r9 = (java.util.List) r9     // Catch:{ all -> 0x00f5 }
            java.lang.Object r1 = r1.get(r7)     // Catch:{ all -> 0x00f5 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x00f5 }
            boolean r0 = r1.contains(r6)     // Catch:{ all -> 0x00f5 }
            if (r0 != 0) goto L_0x001d
            boolean r0 = r9.contains(r7)     // Catch:{ all -> 0x00f5 }
            if (r0 != 0) goto L_0x001d
            r9.add(r7)     // Catch:{ all -> 0x00f5 }
            r1.add(r6)     // Catch:{ all -> 0x00f5 }
            boolean r0 = r6.A00()     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x00a6
            int r0 = r7.A01     // Catch:{ all -> 0x00f5 }
            int r0 = r0 + 1
            r7.A01 = r0     // Catch:{ all -> 0x00f5 }
            goto L_0x001d
        L_0x00a6:
            int r0 = r7.A00     // Catch:{ all -> 0x00f5 }
            int r0 = r0 + 1
            r7.A00 = r0     // Catch:{ all -> 0x00f5 }
            java.util.Map r1 = r8.A02     // Catch:{ all -> 0x00f5 }
            X.9Xk r0 = r7.A03     // Catch:{ all -> 0x00f5 }
            X.9WL r0 = r0.A02     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = r0.A0A     // Catch:{ all -> 0x00f5 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x00f5 }
            X.9SP r1 = (X.AnonymousClass9SP) r1     // Catch:{ all -> 0x00f5 }
            if (r1 == 0) goto L_0x001d
            r0 = 0
            r1.A01(r0)     // Catch:{ all -> 0x00f5 }
            goto L_0x001d
        L_0x00c2:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = "mAssetIdToInternalLoadRequestMap already has InternalLoadRequest for id: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r9, r1)     // Catch:{ all -> 0x00f5 }
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x00f5 }
            goto L_0x00f4
        L_0x00d1:
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x00f5 }
            if (r0 != 0) goto L_0x00f0
            monitor-exit(r2)     // Catch:{ all -> 0x00f5 }
            boolean r0 = r6.A00()
            r2 = 1
            r0 = r0 ^ 1
            java.util.List r1 = r4.A07(r3, r5, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00ec
            r4.A07(r3, r1, r2)
        L_0x00ec:
            r4.A08()
            return
        L_0x00f0:
            monitor-exit(r2)     // Catch:{ all -> 0x00f5 }
            return
        L_0x00f2:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00f5 }
        L_0x00f4:
            throw r0     // Catch:{ all -> 0x00f5 }
        L_0x00f5:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00f5 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200829ix.run():void");
    }
}
