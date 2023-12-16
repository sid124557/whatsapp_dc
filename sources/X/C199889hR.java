package X;

import com.whatsapp.util.Log;

/* renamed from: X.9hR  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C199889hR implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass9SR A01;

    public final void run() {
        AnonymousClass9SR r3 = this.A01;
        long j = this.A00;
        synchronized (r3) {
            Log.d("LiteCameraView/garbageCollector.run");
            Runtime.getRuntime().gc();
            r3.A01(j);
        }
    }

    public /* synthetic */ C199889hR(AnonymousClass9SR r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }
}
