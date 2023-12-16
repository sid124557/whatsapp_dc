package com.whatsapp.wds.metrics.logging.network;

import X.AnonymousClass0H7;
import X.AnonymousClass0QH;
import X.AnonymousClass5K1;
import X.C110425gD;
import X.C18260x0;
import X.C188268yc;
import X.C389229y;
import android.content.Context;
import androidx.work.WorkerParameters;

public final class HierarchyUploadScheduler$HierarchyUploadWorker extends AnonymousClass0QH {
    public final AnonymousClass5K1 A00;

    public C188268yc A09() {
        return AnonymousClass0H7.A00(new C110425gD(this.A00));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HierarchyUploadScheduler$HierarchyUploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18260x0.A0Q(context, workerParameters);
        this.A00 = (AnonymousClass5K1) C389229y.A01(context).AcK.A00.A5z.get();
    }
}
