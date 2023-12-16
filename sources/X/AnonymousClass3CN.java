package X;

import com.whatsapp.util.Log;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.3CN  reason: invalid class name */
public class AnonymousClass3CN implements AnonymousClass4CD {
    public final C55682qk A00;
    public final AnonymousClass5ZC A01 = new AnonymousClass5ZC(10, 1000);
    public final AnonymousClass4FS A02;
    public final C72333dY A03 = C72333dY.A03(5);
    public final ReferenceQueue A04 = new ReferenceQueue();
    public final ConcurrentHashMap A05 = AnonymousClass0x9.A1D();
    public volatile Runnable A06;
    public volatile boolean A07 = true;

    public final void A00() {
        String str = "MemoryLeakReporter. Pruning";
        while (true) {
            Log.d(str);
            C73283fF r1 = (C73283fF) this.A04.poll();
            if (r1 != null) {
                ConcurrentHashMap concurrentHashMap = this.A05;
                String str2 = r1.A02;
                concurrentHashMap.remove(str2);
                str = AnonymousClass000.A0V("MemoryLeakReporter. Pruned ", str2, AnonymousClass001.A0o());
            } else {
                return;
            }
        }
    }

    public void BMV() {
        Log.d("MemoryLeakReporter. onAppForegrounded");
        this.A07 = true;
        Runnable runnable = this.A06;
        if (runnable != null) {
            this.A02.BjN(runnable);
            this.A06 = null;
        }
    }

    public void onAppBackgrounded() {
        Log.d("MemoryLeakReporter. onAppBackgrounded");
        this.A07 = false;
        if (this.A06 == null) {
            this.A06 = this.A02.Bkn(new C70013Zn(this, 18), "MemoryLeakReporter/onAppBackgrounded", 5000);
        }
    }

    public AnonymousClass3CN(C55682qk r4, AnonymousClass4FS r5) {
        this.A00 = r4;
        this.A02 = r5;
    }
}
