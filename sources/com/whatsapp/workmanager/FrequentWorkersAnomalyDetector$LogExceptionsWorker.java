package com.whatsapp.workmanager;

import X.AnonymousClass0QH;
import X.C162457s7;
import X.C18260x0;
import X.C188268yc;
import X.C1895491s;
import X.C55682qk;
import X.C70153a2;
import androidx.work.WorkerParameters;

public final class FrequentWorkersAnomalyDetector$LogExceptionsWorker extends AnonymousClass0QH {
    public final AnonymousClass0QH A00;
    public final C55682qk A01;

    public C188268yc A08() {
        C188268yc A08 = this.A00.A08();
        C162457s7.A0D(A08);
        return A08;
    }

    public C188268yc A09() {
        C188268yc A09 = this.A00.A09();
        A09.AwV(new C70153a2(A09, 45, this), new C1895491s(1));
        return A09;
    }

    public void A0A() {
        this.A00.A0A();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FrequentWorkersAnomalyDetector$LogExceptionsWorker(AnonymousClass0QH r2, C55682qk r3, WorkerParameters workerParameters) {
        super(r2.A00, workerParameters);
        C18260x0.A0V(r2, r3, workerParameters);
        this.A00 = r2;
        this.A01 = r3;
    }
}
