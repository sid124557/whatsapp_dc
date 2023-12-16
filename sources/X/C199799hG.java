package X;

import android.os.Handler;

/* renamed from: X.9hG  reason: invalid class name and case insensitive filesystem */
public class C199799hG implements Runnable {
    public final /* synthetic */ AnonymousClass9SC A00;
    public final /* synthetic */ C201969lA A01;

    public C199799hG(AnonymousClass9SC r1, C201969lA r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void run() {
        AnonymousClass9SC r0 = this.A00;
        C201969lA r5 = this.A01;
        Handler handler = r0.A04;
        C194799Un.A00(r0.A09, "pAS");
        C162477s9.A03("pause", 0, "AudioPipelineController", "%s audio operation returned %d");
        handler.post(new C198609fC(r5));
    }
}
