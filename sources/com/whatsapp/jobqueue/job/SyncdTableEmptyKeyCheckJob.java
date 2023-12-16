package com.whatsapp.jobqueue.job;

import X.C1228065u;
import X.C389229y;
import X.C613730l;
import X.C623934v;
import X.C64333Db;
import android.content.Context;
import org.whispersystems.jobqueue.Job;

public class SyncdTableEmptyKeyCheckJob extends Job implements C1228065u {
    public static final long serialVersionUID = 1;
    public transient C613730l A00;
    public transient C623934v A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SyncdTableEmptyKeyCheckJob() {
        /*
            r2 = this;
            X.2gM r1 = X.C49332gM.A01()
            r0 = 1
            r1.A02 = r0
            java.lang.String r0 = "syncd-table-empty-key-check"
            r1.A00 = r0
            org.whispersystems.jobqueue.JobParameters r0 = r1.A04()
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob.<init>():void");
    }

    public void Bm4(Context context) {
        C64333Db A012 = C389229y.A01(context);
        this.A01 = (C623934v) A012.AXz.get();
        this.A00 = (C613730l) A012.AY1.get();
    }
}
