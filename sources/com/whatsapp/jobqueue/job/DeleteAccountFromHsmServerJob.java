package com.whatsapp.jobqueue.job;

import X.AnonymousClass0x9;
import X.AnonymousClass4FS;
import X.C1228065u;
import X.C161767qP;
import X.C389229y;
import X.C49332gM;
import X.C64333Db;
import android.content.Context;
import java.util.Random;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.JobParameters;

public final class DeleteAccountFromHsmServerJob extends Job implements C1228065u {
    public static final long serialVersionUID = 1;
    public transient C161767qP A00;
    public transient AnonymousClass4FS A01;
    public transient Random A02;

    public static DeleteAccountFromHsmServerJob A00() {
        C49332gM A012 = C49332gM.A01();
        C49332gM.A03("DeleteAccountFromHsmServerJob", A012);
        return new DeleteAccountFromHsmServerJob(A012.A04());
    }

    public void Bm4(Context context) {
        C64333Db A012 = C389229y.A01(context);
        this.A02 = AnonymousClass0x9.A1C();
        this.A01 = A012.BsP();
        this.A00 = (C161767qP) A012.A8s.get();
    }

    public DeleteAccountFromHsmServerJob(JobParameters jobParameters) {
        super(jobParameters);
    }
}
