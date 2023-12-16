package com.whatsapp.jobqueue.job;

import X.AnonymousClass31C;
import X.C1228065u;
import X.C18330xA;
import X.C389229y;
import android.content.Context;
import android.text.TextUtils;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.Job;

public final class SendPermanentFailureReceiptJob extends Job implements C1228065u {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass31C A00;
    public final String jid;
    public final String messageKeyId;
    public final String participant;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendPermanentFailureReceiptJob(X.C95814uZ r4, X.C95814uZ r5, java.lang.String r6) {
        /*
            r3 = this;
            X.2gM r2 = X.C49332gM.A01()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "permanent-failure-"
            java.lang.String r0 = X.C18260x0.A03(r4, r0, r1)
            X.C49332gM.A03(r0, r2)
            org.whispersystems.jobqueue.JobParameters r0 = r2.A04()
            r3.<init>(r0)
            java.lang.String r0 = r4.getRawString()
            r3.jid = r0
            java.lang.String r0 = X.C627336j.A07(r5)
            r3.participant = r0
            r3.messageKeyId = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendPermanentFailureReceiptJob.<init>(X.4uZ, X.4uZ, java.lang.String):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.jid)) {
            throw C18330xA.A06("jid must not be empty");
        } else if (TextUtils.isEmpty(this.messageKeyId)) {
            throw C18330xA.A06("messageId must not be empty");
        }
    }

    public void Bm4(Context context) {
        this.A00 = C389229y.A01(context).BLC();
    }
}
