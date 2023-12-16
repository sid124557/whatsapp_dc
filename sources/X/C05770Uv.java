package X;

import android.app.Notification;
import android.widget.RemoteViews;

/* renamed from: X.0Uv  reason: invalid class name and case insensitive filesystem */
public class C05770Uv {
    public static void A00(Notification.Action.Builder builder, boolean z) {
        builder.setAllowGeneratedReplies(z);
    }

    public static void A01(Notification.Builder builder, RemoteViews remoteViews) {
        builder.setCustomContentView(remoteViews);
    }

    public static void A02(Notification.Builder builder, CharSequence[] charSequenceArr) {
        builder.setRemoteInputHistory(charSequenceArr);
    }
}
