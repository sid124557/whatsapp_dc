package X;

import android.content.Context;
import android.os.PowerManager;

/* renamed from: X.0SH  reason: invalid class name */
public final class AnonymousClass0SH {
    public static final String A00;

    public static final PowerManager.WakeLock A00(Context context, String str) {
        C162457s7.A0J(context, 0);
        C162457s7.A0J(str, 1);
        Object systemService = context.getApplicationContext().getSystemService("power");
        C162457s7.A0K(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String A0V = AnonymousClass000.A0V("WorkManager: ", str, AnonymousClass001.A0o());
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, A0V);
        synchronized (C05120Sa.A00) {
            C05120Sa.A01.put(newWakeLock, A0V);
        }
        C162457s7.A0D(newWakeLock);
        return newWakeLock;
    }

    static {
        String A01 = C06240Wu.A01("WakeLocks");
        C162457s7.A0D(A01);
        A00 = A01;
    }
}
