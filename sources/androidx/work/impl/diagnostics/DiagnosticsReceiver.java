package androidx.work.impl.diagnostics;

import X.AnonymousClass0Aw;
import X.C06240Wu;
import X.C06310Xb;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.work.impl.workers.DiagnosticsWorker;

public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String A00 = C06240Wu.A01("DiagnosticsRcvr");

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            C06240Wu A002 = C06240Wu.A00();
            String str = A00;
            A002.A04(str, "Requesting diagnostics");
            try {
                C06310Xb.A01(context).A08(new AnonymousClass0Aw(DiagnosticsWorker.class).A00());
            } catch (IllegalStateException e) {
                C06240Wu.A00();
                Log.e(str, "WorkManager is not initialized", e);
            }
        }
    }
}
