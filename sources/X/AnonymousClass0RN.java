package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.0RN  reason: invalid class name */
public class AnonymousClass0RN {
    public static void A00(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void A01(Context context, Bundle bundle, Intent[] intentArr) {
        context.startActivities(intentArr, bundle);
    }
}
