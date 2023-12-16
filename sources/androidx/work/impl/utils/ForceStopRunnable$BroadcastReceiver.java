package androidx.work.impl.utils;

import X.C06240Wu;
import X.C13300mx;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {
    public static final String A00 = C06240Wu.A01("ForceStopRunnable$Rcvr");

    public void onReceive(Context context, Intent intent) {
        if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            C06240Wu A002 = C06240Wu.A00();
            String str = A00;
            if (A002.A00 <= 2) {
                Log.v(str, "Rescheduling alarm that keeps track of force-stops.");
            }
            C13300mx.A00(context);
        }
    }
}
