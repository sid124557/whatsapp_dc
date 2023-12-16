package androidx.work.impl.background.systemalarm;

import X.AnonymousClass001;
import X.C06240Wu;
import X.C06310Xb;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

public class RescheduleReceiver extends BroadcastReceiver {
    public static final String A00 = C06240Wu.A01("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        C06240Wu A002 = C06240Wu.A00();
        String str = A00;
        C06240Wu.A02(A002, intent, "Received intent ", str, AnonymousClass001.A0o());
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                C06310Xb A01 = C06310Xb.A01(context);
                BroadcastReceiver.PendingResult goAsync = goAsync();
                synchronized (C06310Xb.A0D) {
                    BroadcastReceiver.PendingResult pendingResult = A01.A00;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    A01.A00 = goAsync;
                    if (A01.A08) {
                        goAsync.finish();
                        A01.A00 = null;
                    }
                }
            } catch (IllegalStateException e) {
                C06240Wu.A00();
                Log.e(str, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
        } else {
            Intent intent2 = new Intent(context, SystemAlarmService.class);
            intent2.setAction("ACTION_RESCHEDULE");
            context.startService(intent2);
        }
    }
}
