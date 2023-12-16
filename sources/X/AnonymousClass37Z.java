package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;

/* renamed from: X.37Z  reason: invalid class name */
public class AnonymousClass37Z implements Handler.Callback {
    public final /* synthetic */ C61032zb A00;

    public AnonymousClass37Z(C61032zb r1) {
        this.A00 = r1;
    }

    public boolean handleMessage(Message message) {
        String str = (String) message.obj;
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                C61032zb r1 = this.A00;
                if (!r1.A03(str)) {
                    r1.A02(str);
                    return true;
                }
            } else if (i == 3) {
                C61032zb.A01(this.A00, str);
            } else if (i != 4) {
                return false;
            } else {
                C61032zb r12 = this.A00;
                Log.i("xmpp/handler/logout-timer/reset");
                if (!r12.A03(str)) {
                    return false;
                }
                r12.A02(str);
                return false;
            }
            return true;
        }
        this.A00.A02(str);
        return true;
    }
}
