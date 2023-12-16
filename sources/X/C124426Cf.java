package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6Cf  reason: invalid class name and case insensitive filesystem */
public class C124426Cf extends BroadcastReceiver {
    public static AtomicReference A01 = new AtomicReference();
    public final Context A00;

    public static /* synthetic */ void A00(Context context) {
        AtomicReference atomicReference = A01;
        if (atomicReference.get() == null) {
            C124426Cf r2 = new C124426Cf(context);
            if (AnonymousClass0IR.A00((Object) null, r2, atomicReference)) {
                context.registerReceiver(r2, new IntentFilter("android.intent.action.USER_UNLOCKED"));
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        synchronized (C161757qO.A09) {
            Iterator A0v = AnonymousClass001.A0v(C161757qO.A0A);
            while (A0v.hasNext()) {
                ((C161757qO) A0v.next()).A03();
            }
        }
        this.A00.unregisterReceiver(this);
    }

    public C124426Cf(Context context) {
        this.A00 = context;
    }
}
