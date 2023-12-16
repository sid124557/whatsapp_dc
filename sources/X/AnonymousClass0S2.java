package X;

import android.app.job.JobParameters;
import android.net.Uri;

/* renamed from: X.0S2  reason: invalid class name */
public class AnonymousClass0S2 {
    public static Uri[] A00(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentUris();
    }

    public static String[] A01(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentAuthorities();
    }
}
