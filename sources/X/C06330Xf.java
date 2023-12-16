package X;

import android.app.Notification;
import android.media.AudioAttributes;
import android.net.Uri;

/* renamed from: X.0Xf  reason: invalid class name and case insensitive filesystem */
public class C06330Xf {
    public static void A03(Notification.Builder builder, Uri uri, Object obj) {
        builder.setSound(uri, (AudioAttributes) obj);
    }

    public static void A00(Notification.Builder builder, int i) {
        builder.setColor(i);
    }

    public static void A01(Notification.Builder builder, int i) {
        builder.setVisibility(i);
    }

    public static void A02(Notification.Builder builder, Notification notification) {
        builder.setPublicVersion(notification);
    }

    public static void A04(Notification.Builder builder, String str) {
        builder.addPerson(str);
    }

    public static void A05(Notification.Builder builder, String str) {
        builder.setCategory(str);
    }
}
