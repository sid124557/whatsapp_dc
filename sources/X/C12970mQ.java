package X;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: X.0mQ  reason: invalid class name and case insensitive filesystem */
public class C12970mQ implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Notification A02;
    public final /* synthetic */ SystemForegroundService A03;

    public C12970mQ(Notification notification, SystemForegroundService systemForegroundService, int i, int i2) {
        this.A03 = systemForegroundService;
        this.A00 = i;
        this.A02 = notification;
        this.A01 = i2;
    }

    public void run() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            C03140Iz.A00(this.A02, this.A03, this.A00, this.A01);
            return;
        }
        SystemForegroundService systemForegroundService = this.A03;
        int i2 = this.A00;
        Notification notification = this.A02;
        if (i >= 29) {
            C03130Iy.A00(notification, systemForegroundService, i2, this.A01);
        } else {
            systemForegroundService.startForeground(i2, notification);
        }
    }
}
