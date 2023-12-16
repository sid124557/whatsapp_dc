package X;

import android.content.Context;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.requirements.Requirement;

/* renamed from: X.5Lr  reason: invalid class name and case insensitive filesystem */
public class C103135Lr {
    public void A00(Context context, Job job) {
        if (job instanceof C1228065u) {
            ((C1228065u) job).Bm4(context);
        }
        for (Requirement requirement : job.parameters.requirements) {
            if (requirement instanceof C1228065u) {
                ((C1228065u) requirement).Bm4(context);
            }
        }
    }
}
