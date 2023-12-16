package X;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: X.0m0  reason: invalid class name */
public class AnonymousClass0m0 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Notification A01;
    public final /* synthetic */ SystemForegroundService A02;

    public AnonymousClass0m0(Notification notification, SystemForegroundService systemForegroundService, int i) {
        this.A02 = systemForegroundService;
        this.A00 = i;
        this.A01 = notification;
    }

    public void run() {
        this.A02.A00.notify(this.A00, this.A01);
    }
}
