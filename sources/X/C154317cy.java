package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* renamed from: X.7cy  reason: invalid class name and case insensitive filesystem */
public final class C154317cy {
    public static final Intent A00(BroadcastReceiver broadcastReceiver, Context context, IntentFilter intentFilter, Handler handler, String str, boolean z) {
        Context context2 = context;
        C162457s7.A0J(context, 0);
        IntentFilter intentFilter2 = intentFilter;
        String str2 = str;
        if (!C107385bE.A0B()) {
            return context2.registerReceiver(broadcastReceiver, intentFilter2, str, handler);
        }
        int i = 4;
        if (z) {
            i = 2;
        }
        return context2.registerReceiver(broadcastReceiver, intentFilter2, str2, handler, i);
    }

    public static final Intent A01(BroadcastReceiver broadcastReceiver, Context context, IntentFilter intentFilter, boolean z) {
        C162457s7.A0J(context, 0);
        if (!C107385bE.A0B()) {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        }
        int i = 4;
        if (z) {
            i = 2;
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, i);
    }
}
