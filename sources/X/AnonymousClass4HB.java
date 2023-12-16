package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.4HB  reason: invalid class name */
public class AnonymousClass4HB extends C22831Qg {
    public Object A00;
    public final int A01;

    public AnonymousClass4HB(C66523Lt r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public void A00(Context context, Intent intent) {
        if (this.A01 != 0) {
            if ("com.whatsapp.MessageHandler.RECONNECT_ACTION".equals(intent.getAction())) {
                Log.i("MessageHandler/reconnect");
                ((C66523Lt) this.A00).A08(C18320x8.A01(intent, "connect_reason"));
                return;
            }
            C18260x0.A1S(AnonymousClass001.A0o(), "MessageHandler/unknown intent received in reconnect receiver ", intent);
        } else if (C18280x3.A1V(intent, "com.whatsapp.MessageHandler.CONNECTIVITY_RETRY_ACTION")) {
            ((C66523Lt) this.A00).A0g.Bjm();
        }
    }
}
