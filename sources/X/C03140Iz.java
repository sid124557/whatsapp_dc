package X;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: X.0Iz  reason: invalid class name and case insensitive filesystem */
public class C03140Iz {
    public static void A00(Notification notification, Service service, int i, int i2) {
        try {
            service.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException e) {
            C06240Wu.A00();
            Log.w(SystemForegroundService.A05, "Unable to start foreground service", e);
        }
    }
}
