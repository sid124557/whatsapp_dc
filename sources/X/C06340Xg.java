package X;

import android.app.Notification;
import android.content.Context;

/* renamed from: X.0Xg  reason: invalid class name and case insensitive filesystem */
public class C06340Xg {
    public static Notification.Builder A00(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static void A01(Notification.Builder builder, int i) {
        builder.setBadgeIconType(i);
    }

    public static void A02(Notification.Builder builder, int i) {
        builder.setGroupAlertBehavior(i);
    }

    public static void A03(Notification.Builder builder, long j) {
        builder.setTimeoutAfter(j);
    }

    public static void A04(Notification.Builder builder, CharSequence charSequence) {
        builder.setSettingsText(charSequence);
    }

    public static void A05(Notification.Builder builder, String str) {
        builder.setShortcutId(str);
    }
}
