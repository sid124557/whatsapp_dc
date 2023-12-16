package androidx.work.impl.background.systemalarm;

import X.AnonymousClass001;
import X.C06240Wu;
import X.C06310Xb;
import X.C12960mP;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final String A00 = C06240Wu.A01("ConstrntProxyUpdtRecvr");

    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            C06240Wu A002 = C06240Wu.A00();
            String str2 = A00;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Ignoring unknown action ");
            C06240Wu.A03(A002, str, str2, A0o);
            return;
        }
        C06310Xb.A01(context).A06.B2t(new C12960mP(goAsync(), context, intent, this));
    }
}
