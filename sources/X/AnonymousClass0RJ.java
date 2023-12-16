package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;

/* renamed from: X.0RJ  reason: invalid class name */
public class AnonymousClass0RJ {
    public static Notification.Action.Builder A00(PendingIntent pendingIntent, Icon icon, CharSequence charSequence) {
        return new Notification.Action.Builder(icon, charSequence, pendingIntent);
    }

    public static void A01(Notification.Builder builder, Object obj) {
        builder.setSmallIcon((Icon) obj);
    }
}
