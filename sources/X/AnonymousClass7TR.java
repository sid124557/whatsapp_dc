package X;

import android.content.BroadcastReceiver;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7TR  reason: invalid class name */
public final class AnonymousClass7TR {
    public boolean A00 = false;
    public final BroadcastReceiver.PendingResult A01;
    public final Intent A02;
    public final ScheduledFuture A03;

    public final synchronized void A00() {
        if (!this.A00) {
            this.A01.finish();
            this.A03.cancel(false);
            this.A00 = true;
        }
    }

    public AnonymousClass7TR(BroadcastReceiver.PendingResult pendingResult, Intent intent, ScheduledExecutorService scheduledExecutorService) {
        this.A02 = intent;
        this.A01 = pendingResult;
        this.A03 = scheduledExecutorService.schedule(new C70173a4(intent, 8, this), 9000, TimeUnit.MILLISECONDS);
    }
}
