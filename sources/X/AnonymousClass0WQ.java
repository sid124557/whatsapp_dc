package X;

import android.app.Notification;

/* renamed from: X.0WQ  reason: invalid class name */
public class AnonymousClass0WQ {
    public static Notification.BigTextStyle A02(Notification.Builder builder) {
        return new Notification.BigTextStyle(builder);
    }

    public static Notification.BigTextStyle A00(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
        return bigTextStyle.bigText(charSequence);
    }

    public static Notification.BigTextStyle A01(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
        return bigTextStyle.setBigContentTitle(charSequence);
    }

    public static void A03(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
        bigTextStyle.setSummaryText(charSequence);
    }
}
