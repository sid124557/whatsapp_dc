package com.whatsapp.jobqueue.job;

import X.AnonymousClass31C;
import X.C1228065u;
import X.C18330xA;
import X.C389229y;
import android.content.Context;
import android.text.TextUtils;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.Job;

@Deprecated
public final class SendPlayedReceiptJob extends Job implements C1228065u {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass31C A00;
    public final String messageId;
    public final String remoteJidRawJid;
    public final String remoteResourceRawJid;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendPlayedReceiptJob(X.C624134x r6) {
        /*
            r5 = this;
            X.2gM r4 = X.C49332gM.A01()
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "played-receipt-"
            X.2z0 r2 = X.C624134x.A08(r6, r0, r3)
            X.4uZ r1 = X.AnonymousClass2z0.A01(r2)
            X.C18280x3.A0u(r1, r3)
            java.lang.String r0 = r3.toString()
            X.C49332gM.A03(r0, r4)
            org.whispersystems.jobqueue.JobParameters r0 = r4.A04()
            r5.<init>(r0)
            java.lang.String r0 = r1.getRawString()
            r5.remoteJidRawJid = r0
            X.4uZ r0 = r6.A0n()
            java.lang.String r0 = X.C627336j.A07(r0)
            r5.remoteResourceRawJid = r0
            java.lang.String r0 = r2.A01
            r5.messageId = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendPlayedReceiptJob.<init>(X.34x):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.remoteJidRawJid)) {
            throw C18330xA.A06("remoteJid must not be empty");
        } else if (TextUtils.isEmpty(this.messageId)) {
            throw C18330xA.A06("messageId must not be empty");
        }
    }

    public void Bm4(Context context) {
        this.A00 = C389229y.A01(context).BLC();
    }
}
