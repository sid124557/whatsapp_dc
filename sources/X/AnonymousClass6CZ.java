package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.whatsapp.util.Log;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.6CZ  reason: invalid class name */
public abstract class AnonymousClass6CZ extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            C148487Io r5 = C148487Io.A02;
            if (r5 == null) {
                r5 = new C148487Io(context);
                C148487Io.A02 = r5;
            }
            C172708Mj r4 = new C172708Mj(this, context, intent, 1);
            PowerManager.WakeLock newWakeLock = r5.A00.newWakeLock(1, "FBNSPreloadWakefulExecutor");
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            try {
                r5.A01.execute(new C172708Mj(r5, r4, newWakeLock, 2));
            } catch (RejectedExecutionException e) {
                Log.e("FBNSPreloadWakefulExecutor/Notification skipped", e);
                newWakeLock.release();
            }
        }
    }
}
