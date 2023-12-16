package X;

import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0fH  reason: invalid class name and case insensitive filesystem */
public final class C08890fH implements C16730ts {
    public final AnonymousClass0Q7 A00;
    public final WindowLayoutComponent A01;
    public final Map A02 = new LinkedHashMap();
    public final Map A03 = new LinkedHashMap();
    public final Map A04 = new LinkedHashMap();
    public final ReentrantLock A05 = new ReentrantLock();

    public void Bie(Activity activity, C15790rw r8, Executor executor) {
        C162457s7.A0J(activity, 0);
        ReentrantLock reentrantLock = this.A05;
        reentrantLock.lock();
        try {
            Map map = this.A02;
            C08020dC r0 = (C08020dC) map.get(activity);
            if (r0 != null) {
                r0.A00(r8);
                this.A04.put(r8, activity);
            } else {
                C08020dC r4 = new C08020dC(activity);
                map.put(activity, r4);
                this.A04.put(r8, activity);
                r4.A00(r8);
                this.A03.put(r4, this.A00.A00(activity, this.A01, new C14240pA(r4), C57982uW.A00(WindowLayoutInfo.class)));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BrN(X.C15790rw r10) {
        /*
            r9 = this;
            r0 = 0
            X.C162457s7.A0J(r10, r0)
            java.util.concurrent.locks.ReentrantLock r6 = r9.A05
            r6.lock()
            java.util.Map r8 = r9.A04     // Catch:{ all -> 0x005c }
            java.lang.Object r7 = r8.get(r10)     // Catch:{ all -> 0x005c }
            android.app.Activity r7 = (android.app.Activity) r7     // Catch:{ all -> 0x005c }
            if (r7 == 0) goto L_0x0058
            java.util.Map r5 = r9.A02     // Catch:{ all -> 0x005c }
            java.lang.Object r2 = r5.get(r7)     // Catch:{ all -> 0x005c }
            X.0dC r2 = (X.C08020dC) r2     // Catch:{ all -> 0x005c }
            if (r2 == 0) goto L_0x0058
            java.util.concurrent.locks.ReentrantLock r1 = r2.A03     // Catch:{ all -> 0x005c }
            r1.lock()     // Catch:{ all -> 0x005c }
            java.util.Set r0 = r2.A02     // Catch:{ all -> 0x0053 }
            r0.remove(r10)     // Catch:{ all -> 0x0053 }
            r1.unlock()     // Catch:{ all -> 0x005c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x0058
            java.util.Map r0 = r9.A03     // Catch:{ all -> 0x005c }
            java.lang.Object r0 = r0.remove(r2)     // Catch:{ all -> 0x005c }
            X.0r6 r0 = (X.C15290r6) r0     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x004c
            X.0f8 r0 = (X.C08800f8) r0     // Catch:{ all -> 0x005c }
            java.lang.reflect.Method r4 = r0.A02     // Catch:{ all -> 0x005c }
            java.lang.Object r3 = r0.A01     // Catch:{ all -> 0x005c }
            java.lang.Object[] r2 = X.AnonymousClass002.A0L()     // Catch:{ all -> 0x005c }
            r1 = 0
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x005c }
            r2[r1] = r0     // Catch:{ all -> 0x005c }
            r4.invoke(r3, r2)     // Catch:{ all -> 0x005c }
        L_0x004c:
            r8.remove(r10)     // Catch:{ all -> 0x005c }
            r5.remove(r7)     // Catch:{ all -> 0x005c }
            goto L_0x0058
        L_0x0053:
            r0 = move-exception
            r1.unlock()     // Catch:{ all -> 0x005c }
            throw r0     // Catch:{ all -> 0x005c }
        L_0x0058:
            r6.unlock()
            return
        L_0x005c:
            r0 = move-exception
            r6.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08890fH.BrN(X.0rw):void");
    }

    public C08890fH(AnonymousClass0Q7 r2, WindowLayoutComponent windowLayoutComponent) {
        this.A01 = windowLayoutComponent;
        this.A00 = r2;
    }
}
