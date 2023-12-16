package com.whatsapp.jobqueue.job.messagejob;

import X.C1228065u;
import X.C389229y;
import X.C55832qz;
import X.C64333Db;
import X.C72303dV;
import android.content.Context;
import org.whispersystems.jobqueue.Job;

public abstract class AsyncMessageJob extends Job implements C1228065u {
    public transient C72303dV A00;
    public transient C55832qz A01;
    public final long rowId;
    public final long sortId;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AsyncMessageJob(long r3, long r5) {
        /*
            r2 = this;
            X.2gM r1 = X.C49332gM.A01()
            java.lang.String r0 = "async-message"
            r1.A00 = r0
            r0 = 1
            r1.A02 = r0
            org.whispersystems.jobqueue.JobParameters r0 = r1.A04()
            r2.<init>(r0)
            r2.rowId = r3
            r2.sortId = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.messagejob.AsyncMessageJob.<init>(long, long):void");
    }

    public void Bm4(Context context) {
        C64333Db A012 = C389229y.A01(context);
        this.A01 = C64333Db.A8F(A012);
        this.A00 = A012.BLG();
    }
}
