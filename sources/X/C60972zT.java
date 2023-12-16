package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.2zT  reason: invalid class name and case insensitive filesystem */
public class C60972zT {
    public static final C53442n6 A07;
    public final HashMap A00 = AnonymousClass001.A0t();
    public final ConcurrentHashMap A01 = AnonymousClass0x9.A1D();
    public final ConcurrentHashMap A02 = AnonymousClass0x9.A1D();
    public final ConcurrentHashMap A03 = AnonymousClass0x9.A1D();
    public final AtomicInteger A04 = new AtomicInteger(0);
    public final AnonymousClass66R A05;
    public final AnonymousClass66R A06 = C154517dI.A01(AnonymousClass40V.A00);

    public C60972zT(AnonymousClass1VX r3) {
        C162457s7.A0J(r3, 1);
        this.A05 = C154517dI.A01(new C77793ty(r3));
    }

    static {
        C72043d5 r2 = C72043d5.A00;
        C162457s7.A0K(r2, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        C162457s7.A0K(r2, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        C162457s7.A0K(r2, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        C162457s7.A0K(r2, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        A07 = new C53442n6("", r2, r2, r2, r2, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = new java.util.concurrent.atomic.AtomicLong(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A01(java.lang.Object r4, java.util.concurrent.ConcurrentHashMap r5) {
        /*
            r2 = 0
            java.lang.Object r0 = r5.get(r4)
            if (r0 != 0) goto L_0x0014
            java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
            r1.<init>(r2)
            java.lang.Object r0 = r5.putIfAbsent(r4, r1)
            if (r0 != 0) goto L_0x0014
            return r1
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60972zT.A01(java.lang.Object, java.util.concurrent.ConcurrentHashMap):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0134, code lost:
        return r15;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized X.C53442n6 A02() {
        /*
            r23 = this;
            java.lang.String r7 = "app-startup"
            r3 = r23
            monitor-enter(r3)
            r2 = 0
            java.util.HashMap r6 = r3.A00     // Catch:{ all -> 0x0135 }
            java.lang.Object r8 = r6.remove(r7)     // Catch:{ all -> 0x0135 }
            X.2n6 r8 = (X.C53442n6) r8     // Catch:{ all -> 0x0135 }
            if (r8 != 0) goto L_0x0029
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0135 }
            java.lang.String r0 = "Unexpected code path name \""
            r1.append(r0)     // Catch:{ all -> 0x0135 }
            r1.append(r7)     // Catch:{ all -> 0x0135 }
            r0 = 34
            java.lang.String r0 = X.AnonymousClass001.A0j(r1, r0)     // Catch:{ all -> 0x0135 }
            X.C626936e.A0D(r2, r0)     // Catch:{ all -> 0x0135 }
            X.2n6 r0 = A07     // Catch:{ all -> 0x0135 }
            monitor-exit(r3)
            return r0
        L_0x0029:
            boolean r5 = r8.A05     // Catch:{ all -> 0x0135 }
            java.util.concurrent.ConcurrentHashMap r0 = r3.A02     // Catch:{ all -> 0x0135 }
            r22 = r0
            java.util.LinkedHashMap r4 = X.C57692u3.A03(r22)     // Catch:{ all -> 0x0135 }
            java.util.Set r0 = r22.entrySet()     // Catch:{ all -> 0x0135 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ all -> 0x0135 }
        L_0x003b:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0135 }
            r17 = 0
            if (r0 == 0) goto L_0x0064
            java.util.Map$Entry r9 = X.AnonymousClass001.A0w(r12)     // Catch:{ all -> 0x0135 }
            java.lang.Object r11 = r9.getKey()     // Catch:{ all -> 0x0135 }
            long r0 = A00(r9)     // Catch:{ all -> 0x0135 }
            java.util.Map r2 = r8.A03     // Catch:{ all -> 0x0135 }
            java.lang.Object r2 = X.AnonymousClass0x7.A0k(r9, r2)     // Catch:{ all -> 0x0135 }
            if (r2 != 0) goto L_0x005b
            java.lang.Long r2 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x0135 }
        L_0x005b:
            long r9 = X.C18310x6.A0B(r2)     // Catch:{ all -> 0x0135 }
            long r0 = r0 - r9
            X.AnonymousClass0x2.A1J(r11, r4, r0)     // Catch:{ all -> 0x0135 }
            goto L_0x003b
        L_0x0064:
            java.util.concurrent.ConcurrentHashMap r9 = r3.A03     // Catch:{ all -> 0x0135 }
            java.util.LinkedHashMap r10 = X.C57692u3.A03(r9)     // Catch:{ all -> 0x0135 }
            java.util.Set r0 = r9.entrySet()     // Catch:{ all -> 0x0135 }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ all -> 0x0135 }
        L_0x0072:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0135 }
            if (r0 == 0) goto L_0x0099
            java.util.Map$Entry r11 = X.AnonymousClass001.A0w(r14)     // Catch:{ all -> 0x0135 }
            java.lang.Object r13 = r11.getKey()     // Catch:{ all -> 0x0135 }
            long r0 = A00(r11)     // Catch:{ all -> 0x0135 }
            java.util.Map r2 = r8.A04     // Catch:{ all -> 0x0135 }
            java.lang.Object r2 = X.AnonymousClass0x7.A0k(r11, r2)     // Catch:{ all -> 0x0135 }
            if (r2 != 0) goto L_0x0090
            java.lang.Long r2 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x0135 }
        L_0x0090:
            long r11 = X.C18310x6.A0B(r2)     // Catch:{ all -> 0x0135 }
            long r0 = r0 - r11
            X.AnonymousClass0x2.A1J(r13, r10, r0)     // Catch:{ all -> 0x0135 }
            goto L_0x0072
        L_0x0099:
            java.util.concurrent.ConcurrentHashMap r2 = r3.A01     // Catch:{ all -> 0x0135 }
            java.util.LinkedHashMap r11 = X.C57692u3.A03(r2)     // Catch:{ all -> 0x0135 }
            java.util.Set r0 = r2.entrySet()     // Catch:{ all -> 0x0135 }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ all -> 0x0135 }
        L_0x00a7:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0135 }
            if (r0 == 0) goto L_0x00ce
            java.util.Map$Entry r13 = X.AnonymousClass001.A0w(r15)     // Catch:{ all -> 0x0135 }
            java.lang.Object r14 = r13.getKey()     // Catch:{ all -> 0x0135 }
            long r0 = A00(r13)     // Catch:{ all -> 0x0135 }
            java.util.Map r12 = r8.A02     // Catch:{ all -> 0x0135 }
            java.lang.Object r12 = X.AnonymousClass0x7.A0k(r13, r12)     // Catch:{ all -> 0x0135 }
            if (r12 != 0) goto L_0x00c5
            java.lang.Long r12 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x0135 }
        L_0x00c5:
            long r12 = X.C18310x6.A0B(r12)     // Catch:{ all -> 0x0135 }
            long r0 = r0 - r12
            X.AnonymousClass0x2.A1J(r14, r11, r0)     // Catch:{ all -> 0x0135 }
            goto L_0x00a7
        L_0x00ce:
            X.66R r0 = r3.A06     // Catch:{ all -> 0x0135 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0135 }
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ all -> 0x0135 }
            java.util.LinkedHashMap r14 = X.C57692u3.A03(r0)     // Catch:{ all -> 0x0135 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0135 }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ all -> 0x0135 }
        L_0x00e2:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0135 }
            if (r0 == 0) goto L_0x0109
            java.util.Map$Entry r13 = X.AnonymousClass001.A0w(r16)     // Catch:{ all -> 0x0135 }
            java.lang.Object r15 = r13.getKey()     // Catch:{ all -> 0x0135 }
            long r0 = A00(r13)     // Catch:{ all -> 0x0135 }
            java.util.Map r12 = r8.A01     // Catch:{ all -> 0x0135 }
            java.lang.Object r12 = X.AnonymousClass0x7.A0k(r13, r12)     // Catch:{ all -> 0x0135 }
            if (r12 != 0) goto L_0x0100
            java.lang.Long r12 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x0135 }
        L_0x0100:
            long r12 = X.C18310x6.A0B(r12)     // Catch:{ all -> 0x0135 }
            long r0 = r0 - r12
            X.AnonymousClass0x2.A1J(r15, r14, r0)     // Catch:{ all -> 0x0135 }
            goto L_0x00e2
        L_0x0109:
            X.2n6 r15 = new X.2n6     // Catch:{ all -> 0x0135 }
            r16 = r7
            r17 = r4
            r18 = r10
            r19 = r11
            r20 = r14
            r21 = r5
            r15.<init>(r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0135 }
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x0135 }
            if (r0 == 0) goto L_0x0126
            r22.clear()     // Catch:{ all -> 0x0135 }
            r9.clear()     // Catch:{ all -> 0x0135 }
        L_0x0126:
            if (r5 == 0) goto L_0x0133
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A04     // Catch:{ all -> 0x0135 }
            int r0 = r0.decrementAndGet()     // Catch:{ all -> 0x0135 }
            if (r0 > 0) goto L_0x0133
            r2.clear()     // Catch:{ all -> 0x0135 }
        L_0x0133:
            monitor-exit(r3)
            return r15
        L_0x0135:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60972zT.A02():X.2n6");
    }

    public final synchronized void A04(boolean z) {
        HashMap hashMap = this.A00;
        if (!hashMap.containsKey("app-startup")) {
            ConcurrentHashMap concurrentHashMap = this.A02;
            LinkedHashMap A032 = C57692u3.A03(concurrentHashMap);
            Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(it);
                AnonymousClass0x2.A1J(A0w.getKey(), A032, A00(A0w));
            }
            ConcurrentHashMap concurrentHashMap2 = this.A03;
            LinkedHashMap A033 = C57692u3.A03(concurrentHashMap2);
            Iterator it2 = concurrentHashMap2.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry A0w2 = AnonymousClass001.A0w(it2);
                AnonymousClass0x2.A1J(A0w2.getKey(), A033, A00(A0w2));
            }
            ConcurrentHashMap concurrentHashMap3 = this.A01;
            LinkedHashMap A034 = C57692u3.A03(concurrentHashMap3);
            Iterator it3 = concurrentHashMap3.entrySet().iterator();
            while (it3.hasNext()) {
                Map.Entry A0w3 = AnonymousClass001.A0w(it3);
                AnonymousClass0x2.A1J(A0w3.getKey(), A034, A00(A0w3));
            }
            ConcurrentHashMap concurrentHashMap4 = (ConcurrentHashMap) this.A06.getValue();
            LinkedHashMap A035 = C57692u3.A03(concurrentHashMap4);
            Iterator it4 = concurrentHashMap4.entrySet().iterator();
            while (it4.hasNext()) {
                Map.Entry A0w4 = AnonymousClass001.A0w(it4);
                AnonymousClass0x2.A1J(A0w4.getKey(), A035, A00(A0w4));
            }
            hashMap.put("app-startup", new C53442n6("app-startup", A032, A033, A034, A035, z));
            if (z) {
                this.A04.incrementAndGet();
            }
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Already tracking \"");
            A0o.append("app-startup");
            A0o.append('\"');
            C18270x1.A0z(A0o);
        }
    }

    public static long A00(Map.Entry entry) {
        return ((AtomicLong) entry.getValue()).get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (X.C615631i.A02() == false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(java.lang.String r5, int r6, java.lang.String r7) {
        /*
            r4 = this;
            X.C18260x0.A0P(r5, r7)
            monitor-enter(r4)
            java.util.HashMap r0 = r4.A00     // Catch:{ all -> 0x00c6 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00c6 }
            monitor-exit(r4)
            if (r0 != 0) goto L_0x006f
            X.66R r0 = r4.A05
            boolean r0 = X.C18270x1.A1V(r0)
            if (r0 == 0) goto L_0x001c
            boolean r0 = X.C615631i.A02()
            r3 = 1
            if (r0 != 0) goto L_0x001d
        L_0x001c:
            r3 = 0
        L_0x001d:
            switch(r6) {
                case 0: goto L_0x0073;
                case 1: goto L_0x0073;
                case 2: goto L_0x0020;
                case 3: goto L_0x0020;
                case 4: goto L_0x0020;
                case 5: goto L_0x0020;
                case 6: goto L_0x0073;
                default: goto L_0x0020;
            }
        L_0x0020:
            java.util.concurrent.ConcurrentHashMap r0 = r4.A03
            java.lang.Object r0 = A01(r5, r0)
            java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0
            r0.incrementAndGet()
            java.util.concurrent.atomic.AtomicInteger r0 = r4.A04
            int r0 = r0.get()
            if (r0 <= 0) goto L_0x0070
            java.util.concurrent.ConcurrentHashMap r2 = r4.A01
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "w-"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r7, r1)
            java.lang.Object r0 = A01(r0, r2)
            java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0
            r0.incrementAndGet()
            if (r3 == 0) goto L_0x006f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "m-"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r7, r1)
            java.lang.Object r0 = A01(r0, r2)
            java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0
            r0.incrementAndGet()
        L_0x005e:
            X.66R r0 = r4.A06
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r0 = A01(r5, r0)
            java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0
            r0.incrementAndGet()
        L_0x006f:
            return
        L_0x0070:
            if (r3 == 0) goto L_0x006f
            goto L_0x005e
        L_0x0073:
            java.util.concurrent.ConcurrentHashMap r0 = r4.A02
            java.lang.Object r0 = A01(r5, r0)
            java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0
            r0.incrementAndGet()
            java.util.concurrent.atomic.AtomicInteger r0 = r4.A04
            int r0 = r0.get()
            if (r0 <= 0) goto L_0x00c3
            java.util.concurrent.ConcurrentHashMap r2 = r4.A01
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "r-"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r7, r1)
            java.lang.Object r0 = A01(r0, r2)
            java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0
            r0.incrementAndGet()
            if (r3 == 0) goto L_0x006f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "m-"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r7, r1)
            java.lang.Object r0 = A01(r0, r2)
            java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0
            r0.incrementAndGet()
        L_0x00b1:
            X.66R r0 = r4.A06
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r0 = A01(r5, r0)
            java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0
            r0.incrementAndGet()
            return
        L_0x00c3:
            if (r3 == 0) goto L_0x006f
            goto L_0x00b1
        L_0x00c6:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60972zT.A03(java.lang.String, int, java.lang.String):void");
    }
}
