package com.whatsapp.jobqueue.job.messagejob;

import X.C389229y;
import X.C624134x;
import X.C66533Lu;
import android.content.Context;

public final class AsyncMessageTokenizationJob extends AsyncMessageJob {
    public static final long serialVersionUID = 1;
    public transient C66533Lu A00;

    public AsyncMessageTokenizationJob(C624134x r5) {
        super(r5.A1L, r5.A1M);
    }

    public void Bm4(Context context) {
        super.Bm4(context);
        this.A00 = (C66533Lu) C389229y.A01(context).AFp.get();
    }
}
