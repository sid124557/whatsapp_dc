package X;

import android.app.Notification;
import android.graphics.Bitmap;

/* renamed from: X.0Us  reason: invalid class name and case insensitive filesystem */
public class C05740Us {
    public static Notification.BigPictureStyle A02(Notification.Builder builder) {
        return new Notification.BigPictureStyle(builder);
    }

    public static Notification.BigPictureStyle A00(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
        return bigPictureStyle.bigPicture(bitmap);
    }

    public static Notification.BigPictureStyle A01(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
        return bigPictureStyle.setBigContentTitle(charSequence);
    }
}
