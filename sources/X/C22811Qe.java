package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.1Qe  reason: invalid class name and case insensitive filesystem */
public class C22811Qe extends C22831Qg {
    public final /* synthetic */ C56732sT A00;

    public C22811Qe(C56732sT r1) {
        this.A00 = r1;
    }

    public void A00(Context context, Intent intent) {
        if (!"com.whatsapp.alarm.CLIENT_PING_TIMEOUT".equals(intent.getAction())) {
            C18260x0.A1S(AnonymousClass001.A0o(), "ClientPingManager/timeout/receiver; unexpected intent: ", intent);
            return;
        }
        Log.i("ClientPingManager/timeout/receiver");
        this.A00.A04();
    }
}
