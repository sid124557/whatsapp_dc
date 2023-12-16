package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.os.Bundle;

/* renamed from: X.0WU  reason: invalid class name */
public class AnonymousClass0WU {
    public static Notification.Action.Builder A00(PendingIntent pendingIntent, CharSequence charSequence, int i) {
        return new Notification.Action.Builder(i, charSequence, pendingIntent);
    }

    public static Notification.Action A01(Notification.Action.Builder builder) {
        return builder.build();
    }

    public static void A02(Notification.Action.Builder builder, RemoteInput remoteInput) {
        builder.addRemoteInput(remoteInput);
    }

    public static void A03(Notification.Action.Builder builder, Bundle bundle) {
        builder.addExtras(bundle);
    }
}
