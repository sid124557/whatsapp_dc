package com.whatsapp.jobqueue.job;

import X.AnonymousClass31C;
import X.C1228065u;
import X.C389229y;
import android.content.Context;
import org.whispersystems.jobqueue.Job;

public final class SendOrderStatusUpdateFailureReceiptJob extends Job implements C1228065u {
    public transient AnonymousClass31C A00;
    public final String jid;
    public final String messageKeyId;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendOrderStatusUpdateFailureReceiptJob(X.C95814uZ r4, java.lang.String r5) {
        /*
            r3 = this;
            X.2gM r2 = X.C49332gM.A01()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "order-status-update-failure-"
            java.lang.String r0 = X.C18260x0.A03(r4, r0, r1)
            X.C49332gM.A03(r0, r2)
            org.whispersystems.jobqueue.JobParameters r0 = r2.A04()
            r3.<init>(r0)
            java.lang.String r0 = r4.getRawString()
            r3.jid = r0
            r3.messageKeyId = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendOrderStatusUpdateFailureReceiptJob.<init>(X.4uZ, java.lang.String):void");
    }

    public void Bm4(Context context) {
        this.A00 = C389229y.A01(context).BLC();
    }
}
