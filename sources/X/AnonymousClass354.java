package X;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import java.util.List;

/* renamed from: X.354  reason: invalid class name */
public class AnonymousClass354 {
    public static NotificationChannel A00(NotificationManager notificationManager, String str) {
        return notificationManager.getNotificationChannel(str);
    }

    public static List A01(NotificationManager notificationManager) {
        return notificationManager.getNotificationChannels();
    }

    public static void A02(NotificationChannel notificationChannel, NotificationManager notificationManager) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static void A03(NotificationManager notificationManager, String str) {
        notificationManager.deleteNotificationChannel(str);
    }
}
