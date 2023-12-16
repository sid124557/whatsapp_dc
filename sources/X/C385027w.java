package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.27w  reason: invalid class name and case insensitive filesystem */
public final class C385027w {
    public static final void A00(Context context, Intent intent) {
        PendingIntent A01 = C624735e.A01(context, 0, intent, 0);
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = AnonymousClass002.A08();
        }
        extras.putParcelable("_ci_", A01);
        intent.putExtras(extras);
    }
}
