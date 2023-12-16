package com.whatsapp.jobqueue.job;

import X.AnonymousClass001;
import X.AnonymousClass3FH;
import X.C107695bk;
import X.C116985rC;
import X.C1228065u;
import X.C389229y;
import X.C49332gM;
import X.C58812vr;
import X.C620233e;
import X.C64333Db;
import android.content.Context;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.JobParameters;

public final class GetStatusPrivacyJob extends Job implements C1228065u {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass3FH A00;
    public transient C620233e A01;
    public transient C58812vr A02;

    public static GetStatusPrivacyJob A00(C116985rC r2) {
        C49332gM A012 = C49332gM.A01();
        C49332gM.A03("GetStatusPrivacyJob", A012);
        if (!r2.A07()) {
            return new GetStatusPrivacyJob(A012.A04());
        }
        r2.A04();
        throw AnonymousClass001.A0g("getValidVNameRequirement");
    }

    public void Bm4(Context context) {
        C64333Db A012 = C389229y.A01(context);
        this.A01 = (C620233e) A012.AWq.get();
        C107695bk r1 = A012.AcK.A00;
        this.A02 = r1.APe();
        this.A00 = (AnonymousClass3FH) r1.ABa.get();
    }

    public GetStatusPrivacyJob(JobParameters jobParameters) {
        super(jobParameters);
    }
}
