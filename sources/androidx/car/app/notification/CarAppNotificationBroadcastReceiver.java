package androidx.car.app.notification;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0WP;
import X.C07740ck;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.car.app.IStartCarApp;
import java.util.Objects;

public class CarAppNotificationBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        intent.removeExtra("androidx.car.app.notification.COMPONENT_EXTRA_KEY");
        intent.setComponent((ComponentName) intent.getParcelableExtra("androidx.car.app.notification.COMPONENT_EXTRA_KEY"));
        Bundle extras = intent.getExtras();
        if (extras != null) {
            IBinder binder = extras.getBinder("androidx.car.app.extra.START_CAR_APP_BINDER_KEY");
            extras.remove("androidx.car.app.extra.START_CAR_APP_BINDER_KEY");
            if (binder != null) {
                IStartCarApp asInterface = IStartCarApp.Stub.asInterface(binder);
                Objects.requireNonNull(asInterface);
                AnonymousClass0WP.A03(new C07740ck(intent, asInterface), "startCarApp from notification");
                return;
            }
        }
        Log.e("CarApp.NBR", AnonymousClass000.A0P(intent, "Notification intent missing expected extra: ", AnonymousClass001.A0o()));
    }
}
