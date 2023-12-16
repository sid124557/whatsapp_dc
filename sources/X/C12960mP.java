package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;

/* renamed from: X.0mP  reason: invalid class name and case insensitive filesystem */
public class C12960mP implements Runnable {
    public final /* synthetic */ BroadcastReceiver.PendingResult A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Intent A02;
    public final /* synthetic */ ConstraintProxyUpdateReceiver A03;

    public C12960mP(BroadcastReceiver.PendingResult pendingResult, Context context, Intent intent, ConstraintProxyUpdateReceiver constraintProxyUpdateReceiver) {
        this.A03 = constraintProxyUpdateReceiver;
        this.A02 = intent;
        this.A01 = context;
        this.A00 = pendingResult;
    }

    public void run() {
        try {
            Intent intent = this.A02;
            boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
            boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
            boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
            boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Updating proxies: (BatteryNotLowProxy (");
            A0o.append(booleanExtra);
            A0o.append("), BatteryChargingProxy (");
            A0o.append(booleanExtra2);
            A0o.append("), StorageNotLowProxy (");
            A0o.append(booleanExtra3);
            A0o.append("), NetworkStateProxy (");
            A0o.append(booleanExtra4);
            C06240Wu.A00().A04(ConstraintProxyUpdateReceiver.A00, AnonymousClass000.A0X("), ", A0o));
            Context context = this.A01;
            AnonymousClass0SG.A00(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
            AnonymousClass0SG.A00(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
            AnonymousClass0SG.A00(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
            AnonymousClass0SG.A00(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
        } finally {
            this.A00.finish();
        }
    }
}
