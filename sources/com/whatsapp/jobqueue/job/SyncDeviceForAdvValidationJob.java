package com.whatsapp.jobqueue.job;

import X.AnonymousClass318;
import X.AnonymousClass33p;
import X.C1228065u;
import X.C29411im;
import X.C389229y;
import X.C64223Cq;
import X.C64333Db;
import android.content.Context;
import org.whispersystems.jobqueue.Job;

public class SyncDeviceForAdvValidationJob extends Job implements C1228065u {
    public static final long serialVersionUID = 1;
    public transient C29411im A00;
    public transient C64223Cq A01;
    public transient AnonymousClass33p A02;
    public transient AnonymousClass318 A03;
    public final String[] jids;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SyncDeviceForAdvValidationJob(com.whatsapp.jid.UserJid[] r3) {
        /*
            r2 = this;
            X.2gM r1 = X.C49332gM.A01()
            java.lang.String r0 = "SyncDeviceForAdvValidationJob"
            r1.A00 = r0
            org.whispersystems.jobqueue.JobParameters r0 = r1.A04()
            r2.<init>(r0)
            java.lang.String[] r0 = X.C627336j.A0P(r3)
            r2.jids = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SyncDeviceForAdvValidationJob.<init>(com.whatsapp.jid.UserJid[]):void");
    }

    public void Bm4(Context context) {
        C64333Db A012 = C389229y.A01(context);
        this.A00 = A012.Bso();
        this.A03 = (AnonymousClass318) A012.AZQ.get();
        this.A01 = (C64223Cq) A012.A6b.get();
        this.A02 = A012.BsO();
    }
}
