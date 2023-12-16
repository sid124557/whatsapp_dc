package X;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

/* renamed from: X.0Um  reason: invalid class name and case insensitive filesystem */
public class C05680Um {
    public static void A01(Activity activity, Intent intent, IntentSender intentSender, Bundle bundle, int i, int i2, int i3, int i4) {
        activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public static void A00(Activity activity) {
        activity.finishAffinity();
    }

    public static void A02(Activity activity, Intent intent, Bundle bundle, int i) {
        activity.startActivityForResult(intent, i, bundle);
    }
}
