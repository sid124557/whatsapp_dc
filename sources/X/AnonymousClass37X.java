package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.37X  reason: invalid class name */
public class AnonymousClass37X implements Handler.Callback {
    public final /* synthetic */ C56732sT A00;

    public AnonymousClass37X(C56732sT r1) {
        this.A00 = r1;
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.A00.A05();
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.A00.A04();
            return true;
        }
    }
}
