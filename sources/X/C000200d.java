package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.00d  reason: invalid class name and case insensitive filesystem */
public class C000200d extends BroadcastReceiver {
    public final /* synthetic */ AnonymousClass08H A00;

    public C000200d(AnonymousClass08H r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        this.A00.A00.startQuery(42, (Object) null, AnonymousClass08H.A03, new String[]{"CarConnectionState"}, (String) null, (String[]) null, (String) null);
    }
}
