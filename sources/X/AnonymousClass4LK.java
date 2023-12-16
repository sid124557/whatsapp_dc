package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.HomeActivity;
import com.whatsapp.util.Log;

/* renamed from: X.4LK  reason: invalid class name */
public class AnonymousClass4LK extends BroadcastReceiver {
    public final /* synthetic */ HomeActivity A00;
    public final /* synthetic */ Runnable A01;

    public AnonymousClass4LK(HomeActivity homeActivity, Runnable runnable) {
        this.A00 = homeActivity;
        this.A01 = runnable;
    }

    public void onReceive(Context context, Intent intent) {
        Log.i("home/resume/unlocked received ACTION_USER_PRESENT");
        try {
            HomeActivity homeActivity = this.A00;
            homeActivity.unregisterReceiver(this);
            C69263Wi r0 = homeActivity.A05;
            Runnable runnable = this.A01;
            r0.A0R(runnable);
            homeActivity.A05.A0T(runnable, 500);
            homeActivity.A0C = null;
        } catch (Exception e) {
            Log.e("home/resume/unlocked received ACTION_USER_PRESENT ", e);
        }
    }
}
