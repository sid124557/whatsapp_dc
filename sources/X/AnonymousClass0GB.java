package X;

import android.app.ActivityManager;
import android.content.Context;

/* renamed from: X.0GB  reason: invalid class name */
public enum AnonymousClass0GB {
    AUTOMATIC,
    TRUNCATE,
    WRITE_AHEAD_LOGGING;

    public final AnonymousClass0GB A00(Context context) {
        Object systemService = context.getSystemService("activity");
        C162457s7.A0K(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        if (!C02960Ig.A00((ActivityManager) systemService)) {
            return WRITE_AHEAD_LOGGING;
        }
        return TRUNCATE;
    }
}
