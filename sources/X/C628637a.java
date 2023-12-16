package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;

/* renamed from: X.37a  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C628637a implements Handler.Callback {
    public final /* synthetic */ C55602qc A00;
    public final /* synthetic */ C29321id A01;

    public final boolean handleMessage(Message message) {
        C55602qc r3 = this.A00;
        C29321id r0 = this.A01;
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            C48202eW r2 = r3.A09;
            if (r2.A00 == 1) {
                Log.d("presencestatemanager/timeout/still-foreground");
            } else {
                Log.d("presencestatemanager/timeout/set-unavailable");
                r3.A01();
                r3.A0A.A01();
                r3.A03.A00.clear();
            }
            C18260x0.A1R(AnonymousClass001.A0o(), "presencestatemanager/timeout/foreground ", r2);
            return true;
        } else if (r0.A09()) {
            return true;
        } else {
            r3.A04(false);
            return true;
        }
    }

    public /* synthetic */ C628637a(C55602qc r1, C29321id r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
