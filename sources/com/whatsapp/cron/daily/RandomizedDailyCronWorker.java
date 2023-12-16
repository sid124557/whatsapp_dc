package com.whatsapp.cron.daily;

import X.AnonymousClass3DH;
import X.C01410Ap;
import X.C03070Is;
import X.C389229y;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;

public class RandomizedDailyCronWorker extends Worker {
    public final Context A00;

    public C03070Is A0C() {
        Log.d("RandomizedDailyCronWorker/doWork");
        ((AnonymousClass3DH) C389229y.A01(this.A00).AcK.A00.AA0.get()).A00(true);
        return new C01410Ap();
    }

    public RandomizedDailyCronWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.A00 = context;
    }
}
