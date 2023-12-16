package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.1Qd  reason: invalid class name and case insensitive filesystem */
public class C22801Qd extends C22831Qg {
    public final /* synthetic */ C56732sT A00;

    public C22801Qd(C56732sT r1) {
        this.A00 = r1;
    }

    public void A00(Context context, Intent intent) {
        if (!"com.whatsapp.alarm.CLIENT_PING_PERIODIC".equals(intent.getAction())) {
            C18260x0.A1S(AnonymousClass001.A0o(), "ClientPingManager/periodic/receiver; unexpected intent: ", intent);
            return;
        }
        Log.i("ClientPingManager/periodic/receiver");
        this.A00.A05();
    }
}
