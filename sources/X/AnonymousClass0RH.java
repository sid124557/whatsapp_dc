package X;

import android.app.Notification;
import android.app.Person;

/* renamed from: X.0RH  reason: invalid class name */
public class AnonymousClass0RH {
    public static Notification.MessagingStyle A00(Person person) {
        return new Notification.MessagingStyle(person);
    }

    public static void A01(Notification.MessagingStyle messagingStyle, boolean z) {
        messagingStyle.setGroupConversation(z);
    }
}
