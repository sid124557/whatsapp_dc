package X;

import android.app.Notification;

/* renamed from: X.0Uw  reason: invalid class name and case insensitive filesystem */
public class C05780Uw {
    public static void A00(Notification.Action.Builder builder, boolean z) {
        builder.setContextual(z);
    }

    public static void A01(Notification.BubbleMetadata bubbleMetadata, Notification.Builder builder) {
        builder.setBubbleMetadata(bubbleMetadata);
    }

    public static void A02(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }
}
