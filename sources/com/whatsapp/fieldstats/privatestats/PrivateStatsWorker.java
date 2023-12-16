package com.whatsapp.fieldstats.privatestats;

import X.C01410Ap;
import X.C03070Is;
import X.C389229y;
import X.C56432ry;
import X.C69993Zl;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;

public class PrivateStatsWorker extends Worker {
    public final C56432ry A00;

    public C03070Is A0C() {
        Log.i("PrivateStatsWorker/doWork--->>> in doWork");
        C56432ry r2 = this.A00;
        C69993Zl.A00(r2.A07, r2, 28);
        return new C01410Ap();
    }

    public PrivateStatsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        Log.d("privatestats/hilt");
        this.A00 = (C56432ry) C389229y.A01(context).AcK.A00.A9O.get();
    }
}
