package X;

import android.content.Context;
import androidx.work.WorkerParameters;

/* renamed from: X.0QH  reason: invalid class name */
public abstract class AnonymousClass0QH {
    public Context A00;
    public WorkerParameters A01;
    public boolean A02;
    public volatile boolean A03;

    public abstract C188268yc A09();

    public final C188268yc A07(AnonymousClass0PW r4) {
        WorkerParameters workerParameters = this.A01;
        return workerParameters.A02.BmK(this.A00, r4, workerParameters.A08);
    }

    public void A0A() {
    }

    public AnonymousClass0QH(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw AnonymousClass001.A0c("Application Context is null");
        } else if (workerParameters != null) {
            this.A00 = context;
            this.A01 = workerParameters;
        } else {
            throw AnonymousClass001.A0c("WorkerParameters is null");
        }
    }

    public C188268yc A08() {
        AnonymousClass0BT A002 = AnonymousClass0BT.A00();
        A002.A0A(AnonymousClass001.A0e("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return A002;
    }
}
