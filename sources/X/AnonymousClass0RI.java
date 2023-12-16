package X;

import android.app.Notification;
import android.net.Uri;

/* renamed from: X.0RI  reason: invalid class name */
public class AnonymousClass0RI {
    public static Notification.MessagingStyle.Message A00(CharSequence charSequence, CharSequence charSequence2, long j) {
        return new Notification.MessagingStyle.Message(charSequence, j, charSequence2);
    }

    public static void A01(Notification.MessagingStyle.Message message, Uri uri, String str) {
        message.setData(str, uri);
    }
}
