package X;

import android.app.Notification;

/* renamed from: X.0WT  reason: invalid class name */
public class AnonymousClass0WT {
    public static Notification.BigTextStyle A01(Notification.Builder builder) {
        return new Notification.BigTextStyle(builder);
    }

    public static Notification.BigTextStyle A00(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
        return bigTextStyle.setBigContentTitle(charSequence);
    }

    public static void A02(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
        bigTextStyle.bigText(charSequence);
    }

    public static void A03(Notification.Builder builder, Notification.Style style) {
        style.setBuilder(builder);
    }
}
