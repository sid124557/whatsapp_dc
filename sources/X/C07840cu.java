package X;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;

/* renamed from: X.0cu  reason: invalid class name and case insensitive filesystem */
public final class C07840cu implements C16540tZ {
    public final JobWorkItem A00;
    public final /* synthetic */ C000000a A01;

    public C07840cu(JobWorkItem jobWorkItem, C000000a r2) {
        this.A01 = r2;
        this.A00 = jobWorkItem;
    }

    public void AzG() {
        C000000a r0 = this.A01;
        synchronized (r0.A02) {
            JobParameters jobParameters = r0.A00;
            if (jobParameters != null) {
                jobParameters.completeWork(this.A00);
            }
        }
    }

    public Intent getIntent() {
        return this.A00.getIntent();
    }
}
