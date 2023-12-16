package com.whatsapp.jobqueue.job;

import X.AnonymousClass2H2;
import X.C1228065u;
import X.C29011i8;
import X.C389229y;
import X.C55002pd;
import X.C64333Db;
import android.content.Context;
import org.whispersystems.jobqueue.Job;

public class SendDeleteHistorySyncMmsJob extends Job implements C1228065u {
    public static final long serialVersionUID = 1;
    public transient C55002pd A00;
    public transient AnonymousClass2H2 A01;
    public transient C29011i8 A02;
    public final String chunkId;
    public final String directPath;
    public final String mediaEncHash;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendDeleteHistorySyncMmsJob(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            r2 = this;
            X.2gM r1 = X.C49332gM.A01()
            r0 = 1
            r1.A02 = r0
            org.whispersystems.jobqueue.requirements.NetworkRequirement r0 = new org.whispersystems.jobqueue.requirements.NetworkRequirement
            r0.<init>()
            r1.A05(r0)
            org.whispersystems.jobqueue.JobParameters r0 = r1.A04()
            r2.<init>(r0)
            r2.chunkId = r3
            r2.directPath = r4
            r2.mediaEncHash = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob.<init>(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public void Bm4(Context context) {
        C64333Db A002 = C389229y.A00(context);
        this.A02 = (C29011i8) A002.AU2.get();
        this.A01 = (AnonymousClass2H2) A002.AZH.get();
        this.A00 = A002.Anb();
    }
}
