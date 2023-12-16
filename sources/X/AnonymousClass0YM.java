package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.os.Bundle;

/* renamed from: X.0YM  reason: invalid class name */
public class AnonymousClass0YM {
    public static Notification.Action.Builder A00(PendingIntent pendingIntent, CharSequence charSequence, int i) {
        return new Notification.Action.Builder(i, charSequence, pendingIntent);
    }

    public static Notification.Action A01(Notification.Action.Builder builder) {
        return builder.build();
    }

    public static String A02(Notification notification) {
        return notification.getGroup();
    }

    public static void A03(Notification.Action.Builder builder, RemoteInput remoteInput) {
        builder.addRemoteInput(remoteInput);
    }

    public static void A04(Notification.Action.Builder builder, Bundle bundle) {
        builder.addExtras(bundle);
    }

    public static void A05(Notification.Action action, Notification.Builder builder) {
        builder.addAction(action);
    }

    public static void A06(Notification.Builder builder, String str) {
        builder.setGroup(str);
    }

    public static void A07(Notification.Builder builder, String str) {
        builder.setSortKey(str);
    }

    public static void A08(Notification.Builder builder, boolean z) {
        builder.setGroupSummary(z);
    }

    public static void A09(Notification.Builder builder, boolean z) {
        builder.setLocalOnly(z);
    }
}
