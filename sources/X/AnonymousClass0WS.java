package X;

import android.app.Notification;

/* renamed from: X.0WS  reason: invalid class name */
public class AnonymousClass0WS {
    public static Notification.InboxStyle A00(Notification.Builder builder) {
        return new Notification.InboxStyle(builder);
    }

    public static Notification.InboxStyle A01(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
        return inboxStyle.setBigContentTitle(charSequence);
    }

    public static void A02(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
        inboxStyle.addLine(charSequence);
    }

    public static void A03(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
        inboxStyle.setSummaryText(charSequence);
    }
}
