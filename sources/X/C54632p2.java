package X;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.2p2  reason: invalid class name and case insensitive filesystem */
public final class C54632p2 {
    public final C54842pN A00 = new C54842pN();
    public final List A01 = AnonymousClass002.A0I(2);
    public volatile C55682qk A02;

    public synchronized void A00(C174368Tz r6) {
        synchronized (this) {
            C155937fl r3 = C155937fl.A01;
            C54842pN r2 = this.A00;
            synchronized (r2) {
                HashMap hashMap = r2.A00;
                AnonymousClass7O8 r0 = (AnonymousClass7O8) hashMap.get(r6);
                if (r0 == null) {
                    hashMap.put(r6, new AnonymousClass7O8(r3));
                } else {
                    r0.A00 = r3;
                }
            }
        }
    }

    public synchronized void A01(C174368Tz r4, Runnable runnable) {
        C54842pN r2 = this.A00;
        synchronized (r2) {
            AnonymousClass7O8 A022 = r2.A02(r4);
            A022.A03.remove(runnable);
            A022.A04.remove(runnable);
            r2.A02.remove(runnable);
            r2.A01.remove(runnable);
        }
        for (C54732pC A002 : this.A01) {
            A002.A00(runnable);
        }
    }

    public synchronized void A03(C174368Tz r6, Runnable runnable, Thread thread) {
        C54842pN r4 = this.A00;
        synchronized (r4) {
            AnonymousClass7O8 A022 = r4.A02(r6);
            A022.A02.remove(runnable);
            AnonymousClass0x2.A1K(runnable, A022.A03, SystemClock.uptimeMillis());
            A022.A04.put(runnable, thread.getName());
        }
        for (C54732pC A012 : this.A01) {
            A012.A01(runnable);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if ((!((X.AnonymousClass3ZZ) r11).A00.startsWith("SerialExecutor")) != false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A02(X.C174368Tz r19, java.lang.Runnable r20) {
        /*
            r18 = this;
            r8 = r18
            monitor-enter(r8)
            X.7fl r6 = X.C155937fl.A01     // Catch:{ all -> 0x01d1 }
            X.2pN r2 = r8.A00     // Catch:{ all -> 0x01cf }
            monitor-enter(r2)     // Catch:{ all -> 0x01cf }
            r3 = r19
            X.7O8 r5 = r2.A02(r3)     // Catch:{ all -> 0x01cc }
            java.util.Map r4 = r5.A02     // Catch:{ all -> 0x01cc }
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x01cc }
            r11 = r20
            X.AnonymousClass0x2.A1K(r11, r4, r0)     // Catch:{ all -> 0x01cc }
            java.util.Map r0 = r2.A02     // Catch:{ all -> 0x01cc }
            r0.put(r11, r3)     // Catch:{ all -> 0x01cc }
            X.7fl r0 = r5.A00     // Catch:{ all -> 0x01cc }
            if (r6 == r0) goto L_0x0027
            java.util.Map r0 = r2.A01     // Catch:{ all -> 0x01cc }
            r0.put(r11, r6)     // Catch:{ all -> 0x01cc }
        L_0x0027:
            boolean r0 = r11 instanceof X.AnonymousClass3ZZ     // Catch:{ all -> 0x01cc }
            if (r0 == 0) goto L_0x003b
            r0 = r11
            X.3ZZ r0 = (X.AnonymousClass3ZZ) r0     // Catch:{ all -> 0x01cc }
            java.lang.String r1 = r0.A00     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = "SerialExecutor"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x01cc }
            r0 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto L_0x003c
        L_0x003b:
            r1 = 1
        L_0x003c:
            java.util.concurrent.atomic.AtomicLong r0 = r2.A03     // Catch:{ all -> 0x01cc }
            r0.incrementAndGet()     // Catch:{ all -> 0x01cc }
            if (r1 == 0) goto L_0x0052
            java.lang.String r1 = "WhatsApp Worker"
            java.lang.String r0 = r3.A00     // Catch:{ all -> 0x01cc }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x01cc }
            if (r0 == 0) goto L_0x0052
            java.util.concurrent.atomic.AtomicLong r0 = r2.A04     // Catch:{ all -> 0x01cc }
            r0.incrementAndGet()     // Catch:{ all -> 0x01cc }
        L_0x0052:
            monitor-exit(r2)     // Catch:{ all -> 0x01cf }
            java.util.List r0 = r8.A01     // Catch:{ all -> 0x01cf }
            java.util.Iterator r17 = r0.iterator()     // Catch:{ all -> 0x01cf }
        L_0x0059:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x01cf }
            if (r0 == 0) goto L_0x01ca
            java.lang.Object r12 = r17.next()     // Catch:{ all -> 0x01cf }
            X.2pC r12 = (X.C54732pC) r12     // Catch:{ all -> 0x01cf }
            boolean r0 = r12 instanceof X.C34191uN     // Catch:{ all -> 0x01cf }
            if (r0 == 0) goto L_0x008f
            X.1uN r12 = (X.C34191uN) r12     // Catch:{ all -> 0x01cf }
            X.2pN r0 = r12.A01     // Catch:{ all -> 0x01cf }
            X.8Tz r0 = r0.A00(r11)     // Catch:{ all -> 0x01cf }
            if (r0 == 0) goto L_0x0059
            java.lang.String r1 = "WhatsApp Worker"
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x01cf }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x01cf }
            if (r0 == 0) goto L_0x0059
            java.util.Map r2 = r12.A00     // Catch:{ all -> 0x01cf }
            monitor-enter(r2)     // Catch:{ all -> 0x01cf }
            boolean r0 = r2.containsKey(r11)     // Catch:{ all -> 0x01c4 }
            if (r0 != 0) goto L_0x008d
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x01c4 }
            X.AnonymousClass0x2.A1K(r11, r2, r0)     // Catch:{ all -> 0x01c4 }
        L_0x008d:
            monitor-exit(r2)     // Catch:{ all -> 0x01c4 }
            goto L_0x0059
        L_0x008f:
            boolean r0 = r12 instanceof X.C34181uM     // Catch:{ all -> 0x01cf }
            if (r0 == 0) goto L_0x0059
            X.1uM r12 = (X.C34181uM) r12     // Catch:{ all -> 0x01cf }
            java.util.concurrent.atomic.AtomicBoolean r10 = r12.A00     // Catch:{ all -> 0x01cf }
            boolean r0 = r10.get()     // Catch:{ all -> 0x01cf }
            if (r0 != 0) goto L_0x0059
            X.2pN r9 = r12.A01     // Catch:{ all -> 0x01cf }
            X.8Tz r7 = r9.A00(r11)     // Catch:{ all -> 0x01cf }
            if (r7 != 0) goto L_0x00b2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01cf }
            java.lang.String r0 = "[JobAnomalyDetector] Could not execute detector as ThreadPoolExecutor is null for job="
            X.C18260x0.A1T(r1, r0, r11)     // Catch:{ all -> 0x01cf }
            X.AnonymousClass0x2.A19(r1)     // Catch:{ all -> 0x01cf }
            goto L_0x0059
        L_0x00b2:
            monitor-enter(r9)     // Catch:{ all -> 0x01cf }
            java.util.concurrent.BlockingQueue r0 = r7.getQueue()     // Catch:{ all -> 0x01c7 }
            monitor-exit(r9)     // Catch:{ all -> 0x01cf }
            if (r0 == 0) goto L_0x0059
            java.lang.Object r1 = r0.peek()     // Catch:{ all -> 0x01cf }
            if (r1 == 0) goto L_0x0059
            monitor-enter(r9)     // Catch:{ all -> 0x01cf }
            X.7O8 r0 = r9.A02(r7)     // Catch:{ all -> 0x01c7 }
            java.util.Map r0 = r0.A02     // Catch:{ all -> 0x01c7 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x01c7 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x01c7 }
            monitor-exit(r9)     // Catch:{ all -> 0x01cf }
            if (r0 == 0) goto L_0x0059
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x01cf }
            long r0 = r0.longValue()     // Catch:{ all -> 0x01cf }
            long r3 = r3 - r0
            r1 = 300000(0x493e0, double:1.482197E-318)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0059
            java.lang.String r6 = r7.A00     // Catch:{ all -> 0x01cf }
            java.util.HashMap r5 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x01cf }
            monitor-enter(r9)     // Catch:{ all -> 0x01cf }
            X.7O8 r0 = r9.A02(r7)     // Catch:{ all -> 0x01c7 }
            java.util.Map r0 = r0.A03     // Catch:{ all -> 0x01c7 }
            java.util.HashSet r0 = X.C18310x6.A0s(r0)     // Catch:{ all -> 0x01c7 }
            monitor-exit(r9)     // Catch:{ all -> 0x01cf }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ all -> 0x01cf }
        L_0x00f6:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x01cf }
            java.lang.String r4 = "ms]"
            java.lang.String r14 = "]"
            if (r0 == 0) goto L_0x0160
            java.lang.Object r1 = r16.next()     // Catch:{ all -> 0x01cf }
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch:{ all -> 0x01cf }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01cf }
            java.lang.String r0 = "Running task: ["
            X.C18270x1.A1H(r2, r0, r1)     // Catch:{ all -> 0x01cf }
            java.lang.String r13 = X.AnonymousClass000.A0X(r14, r2)     // Catch:{ all -> 0x01cf }
            java.lang.StringBuilder r15 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01cf }
            java.lang.String r0 = "[ThreadName: "
            r15.append(r0)     // Catch:{ all -> 0x01cf }
            java.lang.String r0 = r9.A03(r7, r1)     // Catch:{ all -> 0x01cf }
            r15.append(r0)     // Catch:{ all -> 0x01cf }
            java.lang.String r0 = "], "
            r15.append(r0)     // Catch:{ all -> 0x01cf }
            java.lang.String r0 = "[Class: "
            X.C18260x0.A1T(r15, r0, r1)     // Catch:{ all -> 0x01cf }
            r15.append(r14)     // Catch:{ all -> 0x01cf }
            monitor-enter(r9)     // Catch:{ all -> 0x01cf }
            X.7O8 r0 = r9.A02(r7)     // Catch:{ all -> 0x01c7 }
            java.util.Map r0 = r0.A03     // Catch:{ all -> 0x01c7 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x01c7 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x01c7 }
            monitor-exit(r9)     // Catch:{ all -> 0x01cf }
            java.lang.String r0 = ", [StartTime: "
            r15.append(r0)     // Catch:{ all -> 0x01cf }
            if (r1 != 0) goto L_0x0149
            java.lang.String r0 = "Unknown"
            goto L_0x0155
        L_0x0149:
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x01cf }
            long r0 = r1.longValue()     // Catch:{ all -> 0x01cf }
            java.lang.Long r0 = X.C18310x6.A0f(r2, r0)     // Catch:{ all -> 0x01cf }
        L_0x0155:
            r15.append(r0)     // Catch:{ all -> 0x01cf }
            java.lang.String r0 = X.AnonymousClass000.A0X(r4, r15)     // Catch:{ all -> 0x01cf }
            r5.put(r13, r0)     // Catch:{ all -> 0x01cf }
            goto L_0x00f6
        L_0x0160:
            monitor-enter(r9)     // Catch:{ all -> 0x01cf }
            java.util.concurrent.BlockingQueue r0 = r7.getQueue()     // Catch:{ all -> 0x01c7 }
            monitor-exit(r9)     // Catch:{ all -> 0x01cf }
            if (r0 == 0) goto L_0x01bb
            java.util.Iterator r16 = r0.iterator()     // Catch:{ all -> 0x01cf }
        L_0x016c:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x01cf }
            if (r0 == 0) goto L_0x01bb
            java.lang.Object r1 = r16.next()     // Catch:{ all -> 0x01cf }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01cf }
            java.lang.String r0 = "Queued task: ["
            X.C18270x1.A1H(r2, r0, r1)     // Catch:{ all -> 0x01cf }
            java.lang.String r13 = X.AnonymousClass000.A0X(r14, r2)     // Catch:{ all -> 0x01cf }
            java.lang.StringBuilder r15 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01cf }
            java.lang.String r0 = "[ClassName: "
            X.C18260x0.A1T(r15, r0, r1)     // Catch:{ all -> 0x01cf }
            r15.append(r14)     // Catch:{ all -> 0x01cf }
            monitor-enter(r9)     // Catch:{ all -> 0x01cf }
            X.7O8 r0 = r9.A02(r7)     // Catch:{ all -> 0x01c7 }
            java.util.Map r0 = r0.A02     // Catch:{ all -> 0x01c7 }
            java.lang.Object r2 = r0.get(r1)     // Catch:{ all -> 0x01c7 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x01c7 }
            monitor-exit(r9)     // Catch:{ all -> 0x01cf }
            if (r2 == 0) goto L_0x01b3
            java.lang.String r0 = ", [QueuedTime: "
            r15.append(r0)     // Catch:{ all -> 0x01cf }
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x01cf }
            long r2 = r2.longValue()     // Catch:{ all -> 0x01cf }
            long r0 = r0 - r2
            r15.append(r0)     // Catch:{ all -> 0x01cf }
            r15.append(r4)     // Catch:{ all -> 0x01cf }
        L_0x01b3:
            java.lang.String r0 = r15.toString()     // Catch:{ all -> 0x01cf }
            r5.put(r13, r0)     // Catch:{ all -> 0x01cf }
            goto L_0x016c
        L_0x01bb:
            r12.A02(r6, r5)     // Catch:{ all -> 0x01cf }
            r0 = 1
            r10.set(r0)     // Catch:{ all -> 0x01cf }
            goto L_0x0059
        L_0x01c4:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01c4 }
            goto L_0x01ce
        L_0x01c7:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x01cf }
            goto L_0x01ce
        L_0x01ca:
            monitor-exit(r8)
            return
        L_0x01cc:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01cf }
        L_0x01ce:
            throw r0     // Catch:{ all -> 0x01cf }
        L_0x01cf:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01d1 }
        L_0x01d1:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54632p2.A02(X.8Tz, java.lang.Runnable):void");
    }
}
