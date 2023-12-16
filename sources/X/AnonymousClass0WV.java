package X;

import android.app.Notification;

/* renamed from: X.0WV  reason: invalid class name */
public class AnonymousClass0WV {
    public static Notification.Builder A00(Notification.Builder builder, CharSequence charSequence) {
        return builder.setSubText(charSequence);
    }

    public static Notification.Builder A01(Notification.Builder builder, boolean z) {
        return builder.setUsesChronometer(z);
    }

    public static Notification A02(Notification.Builder builder) {
        return builder.build();
    }

    public static void A03(Notification.Builder builder, int i) {
        builder.setPriority(i);
    }
}
