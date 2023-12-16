package androidx.work.impl.workers;

import X.C01410Ap;
import X.C03070Is;
import X.C162457s7;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public final class CombineContinuationsWorker extends Worker {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C162457s7.A0J(context, 1);
        C162457s7.A0J(workerParameters, 2);
    }

    public C03070Is A0C() {
        return new C01410Ap(this.A01.A01);
    }
}
