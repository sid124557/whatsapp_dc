package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* renamed from: X.9SL  reason: invalid class name */
public class AnonymousClass9SL {
    public final HashMap A00 = AnonymousClass001.A0t();

    public void A00(String str, int i) {
        HashMap hashMap = this.A00;
        synchronized (hashMap) {
            if (!hashMap.containsKey(str)) {
                HandlerThread handlerThread = new HandlerThread(str, i);
                handlerThread.start();
                Looper looper = handlerThread.getLooper();
                if (looper != null) {
                    hashMap.put(str, AnonymousClass0x9.A0C(handlerThread, new Handler(looper)));
                } else {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Looper is null: ");
                    throw AnonymousClass000.A0F(str, A0o);
                }
            }
        }
    }

    public AnonymousClass9SL() {
        A00("Lite-Controller-Thread", 0);
        A00("Lite-SurfacePipe-Thread", 0);
        A00("Lite-CPU-Frames-Thread", 0);
        A00("Lite-GPU-Monitor-Thread", 0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:6|7|8|9|10|20|17|4) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x000a, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0023 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void finalize() {
        /*
            r5 = this;
            super.finalize()
            java.util.HashMap r4 = r5.A00
            monitor-enter(r4)
            java.util.Iterator r3 = X.C18290x4.A10(r4)     // Catch:{ all -> 0x0030 }
        L_0x000a:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x002b
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x0030 }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x0030 }
            java.lang.Object r2 = r0.first     // Catch:{ all -> 0x0030 }
            android.os.HandlerThread r2 = (android.os.HandlerThread) r2     // Catch:{ all -> 0x0030 }
            r2.quitSafely()     // Catch:{ all -> 0x0030 }
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.join(r0)     // Catch:{ InterruptedException -> 0x0023 }
            goto L_0x000a
        L_0x0023:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0030 }
            r0.interrupt()     // Catch:{ all -> 0x0030 }
            goto L_0x000a
        L_0x002b:
            r4.clear()     // Catch:{ all -> 0x0030 }
            monitor-exit(r4)     // Catch:{ all -> 0x0030 }
            return
        L_0x0030:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0030 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9SL.finalize():void");
    }
}
