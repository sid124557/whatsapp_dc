package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.6Dr  reason: invalid class name and case insensitive filesystem */
public class C124736Dr extends Handler {
    public final C147427Eg A00;

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00df, code lost:
        r3 = r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r16) {
        /*
            r15 = this;
            r2 = r16
            int r1 = r2.what
            r0 = 1
            r5 = 2
            if (r1 == r0) goto L_0x0125
            r0 = 3
            if (r1 == r5) goto L_0x0019
            if (r1 != r0) goto L_0x014d
            r15.removeMessages(r5)
        L_0x0010:
            X.7Eg r0 = r15.A00
            if (r0 == 0) goto L_0x014d
            X.7Ty r1 = r0.A00
            r0 = 1
            monitor-enter(r1)
            goto L_0x001d
        L_0x0019:
            r15.removeMessages(r0)
            goto L_0x0010
        L_0x001d:
            r1.A00 = r0     // Catch:{ all -> 0x0122 }
            monitor-exit(r1)     // Catch:{ all -> 0x0122 }
            X.7Eh r0 = r1.A03
            if (r0 == 0) goto L_0x014d
            X.6q5 r7 = r0.A00
            X.2pN r2 = r7.A01
            monitor-enter(r2)
            java.util.HashMap r0 = r2.A00     // Catch:{ all -> 0x011f }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x011f }
            java.util.HashSet r0 = X.AnonymousClass0x9.A15(r0)     // Catch:{ all -> 0x011f }
            monitor-exit(r2)
            java.util.Iterator r14 = r0.iterator()
            r3 = -1
        L_0x003a:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x00e8
            java.lang.Object r6 = r14.next()
            X.8Tz r6 = (X.C174368Tz) r6
            monitor-enter(r2)
            X.7O8 r0 = r2.A02(r6)     // Catch:{ all -> 0x011f }
            java.util.Map r0 = r0.A03     // Catch:{ all -> 0x011f }
            java.util.HashSet r0 = X.C18310x6.A0s(r0)     // Catch:{ all -> 0x011f }
            monitor-exit(r2)
            java.util.Iterator r13 = r0.iterator()
        L_0x0056:
            r11 = r3
        L_0x0057:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00df
            java.lang.Object r8 = r13.next()
            java.lang.Runnable r8 = (java.lang.Runnable) r8
            monitor-enter(r2)
            X.7O8 r0 = r2.A02(r6)     // Catch:{ all -> 0x011f }
            java.util.Map r0 = r0.A03     // Catch:{ all -> 0x011f }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x011f }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x011f }
            monitor-exit(r2)
            if (r0 == 0) goto L_0x0057
            r2.A01(r8)
            long r9 = android.os.SystemClock.uptimeMillis()
            r3 = 600000(0x927c0, double:2.964394E-318)
            long r0 = r0.longValue()
            long r9 = r9 - r0
            long r3 = r3 - r9
            r9 = 0
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00d5
            java.util.WeakHashMap r1 = r7.A02
            monitor-enter(r1)
            boolean r0 = r1.containsKey(r8)     // Catch:{ all -> 0x00e5 }
            if (r0 != 0) goto L_0x00a6
            monitor-enter(r2)     // Catch:{ all -> 0x00e5 }
            X.7O8 r0 = r2.A02(r6)     // Catch:{ all -> 0x00e2 }
            java.util.Map r0 = r0.A03     // Catch:{ all -> 0x00e2 }
            boolean r0 = r0.containsKey(r8)     // Catch:{ all -> 0x00e2 }
            monitor-exit(r2)     // Catch:{ all -> 0x00e5 }
            if (r0 == 0) goto L_0x00a4
            r0 = 0
            r1.put(r8, r0)     // Catch:{ all -> 0x00e5 }
        L_0x00a4:
            r0 = 1
            goto L_0x00a7
        L_0x00a6:
            r0 = 0
        L_0x00a7:
            monitor-exit(r1)     // Catch:{ all -> 0x00e5 }
            if (r0 == 0) goto L_0x0057
            java.lang.String r4 = r6.A00
            java.util.HashMap r3 = X.AnonymousClass001.A0t()
            java.lang.String r1 = r2.A03(r6, r8)
            java.lang.String r0 = "threadName"
            r3.put(r0, r1)
            r2.A01(r8)
            r0 = 600000(0x927c0, double:2.964394E-318)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "expectedJobLimit"
            r3.put(r0, r1)
            java.lang.String r1 = "threadPoolExecutor"
            java.lang.String r0 = r6.toString()
            r3.put(r1, r0)
            r7.A02(r4, r3)
            goto L_0x0057
        L_0x00d5:
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0056
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0057
            goto L_0x0056
        L_0x00df:
            r3 = r11
            goto L_0x003a
        L_0x00e2:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00e5 }
            throw r0     // Catch:{ all -> 0x00e5 }
        L_0x00e5:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00e5 }
            throw r0
        L_0x00e8:
            boolean r0 = r7.A03()
            if (r0 == 0) goto L_0x014d
            X.7Ty r6 = r7.A00
            monitor-enter(r6)
            boolean r0 = r7.A03()     // Catch:{ all -> 0x011c }
            if (r0 == 0) goto L_0x011a
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00fe
            goto L_0x0115
        L_0x00fe:
            r2 = 0
            r6.A03 = r2     // Catch:{ all -> 0x0113 }
            X.6Dr r1 = r6.A02     // Catch:{ all -> 0x0113 }
            if (r1 == 0) goto L_0x011a
            r0 = 1
            r1.removeMessages(r0)     // Catch:{ all -> 0x0113 }
            r0 = 3
            r1.removeMessages(r0)     // Catch:{ all -> 0x0113 }
            r1.removeMessages(r5)     // Catch:{ all -> 0x0113 }
            r6.A02 = r2     // Catch:{ all -> 0x0113 }
            goto L_0x011a
        L_0x0113:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x011c }
        L_0x0115:
            X.7Eh r0 = r7.A01     // Catch:{ all -> 0x011c }
            r6.A00(r0, r3)     // Catch:{ all -> 0x011c }
        L_0x011a:
            monitor-exit(r6)     // Catch:{ all -> 0x011c }
            return
        L_0x011c:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x011c }
            throw r0
        L_0x011f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0122:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0122 }
            throw r0
        L_0x0125:
            android.os.Bundle r1 = r2.getData()
            java.lang.String r0 = "TimerDuration"
            long r3 = r1.getLong(r0)
            android.os.Message r2 = android.os.Message.obtain()
            r2.what = r5
            r0 = 0
            long r0 = java.lang.Math.max(r3, r0)
            r15.sendMessageDelayed(r2, r0)
            X.7Eg r0 = r15.A00
            if (r0 == 0) goto L_0x014d
            X.7Ty r1 = r0.A00
            r0 = 3
            monitor-enter(r1)
            r1.A00 = r0     // Catch:{ all -> 0x014a }
            monitor-exit(r1)     // Catch:{ all -> 0x014a }
            return
        L_0x014a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x014a }
            throw r0
        L_0x014d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124736Dr.handleMessage(android.os.Message):void");
    }

    public C124736Dr(Looper looper, C147427Eg r2) {
        super(looper);
        this.A00 = r2;
    }
}
