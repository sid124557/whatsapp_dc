package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass31C;
import X.C1228065u;
import X.C162457s7;
import X.C389229y;
import X.C55892r5;
import X.C56612sH;
import X.C64333Db;
import android.content.Context;
import org.whispersystems.jobqueue.Job;

public final class SendEngagedReceiptJob extends Job implements C1228065u {
    public static final long serialVersionUID = 1;
    public transient C56612sH A00;
    public transient AnonymousClass31C A01;
    public transient C55892r5 A02;
    public final String jidStr;
    public final long loggableStanzaId;
    public final String messageId;
    public final long originalMessageTimestamp;
    public final String source;
    public final String value;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendEngagedReceiptJob(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, long r8, long r10) {
        /*
            r3 = this;
            r0 = 1
            X.C162457s7.A0J(r4, r0)
            X.2gM r2 = X.C49332gM.A01()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "engaged-receipt-"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r4, r1)
            X.C49332gM.A03(r0, r2)
            org.whispersystems.jobqueue.JobParameters r0 = r2.A04()
            r3.<init>(r0)
            r3.jidStr = r4
            r3.messageId = r5
            r3.originalMessageTimestamp = r8
            r3.loggableStanzaId = r10
            r3.source = r6
            r3.value = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendEngagedReceiptJob.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long):void");
    }

    public void Bm4(Context context) {
        C162457s7.A0J(context, 0);
        Context applicationContext = context.getApplicationContext();
        C162457s7.A0D(applicationContext);
        C64333Db A012 = C389229y.A01(applicationContext);
        this.A00 = A012.Bqh();
        this.A01 = A012.BLC();
        this.A02 = (C55892r5) A012.AJE.get();
    }

    public final String A08() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SendEngagedReceiptJob(jidStr='");
        A0o.append(this.jidStr);
        A0o.append("', messageId='");
        A0o.append(this.messageId);
        A0o.append("', originalMessageTimestamp=");
        A0o.append(this.originalMessageTimestamp);
        A0o.append(", loggableStanzaId=");
        A0o.append(this.loggableStanzaId);
        A0o.append(", source='");
        A0o.append(this.source);
        A0o.append("', value='");
        A0o.append(this.value);
        return AnonymousClass000.A0X("')", A0o);
    }
}
