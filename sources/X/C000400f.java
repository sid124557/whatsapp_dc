package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* renamed from: X.00f  reason: invalid class name and case insensitive filesystem */
public abstract class C000400f extends BroadcastReceiver {
    public static final String A00 = C06240Wu.A01("ConstraintProxy");

    public void onReceive(Context context, Intent intent) {
        C06240Wu.A02(C06240Wu.A00(), intent, "onReceive : ", A00, AnonymousClass001.A0o());
        Intent intent2 = new Intent(context, SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}
