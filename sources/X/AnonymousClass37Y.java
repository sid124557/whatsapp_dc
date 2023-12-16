package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;

/* renamed from: X.37Y  reason: invalid class name */
public final class AnonymousClass37Y implements Handler.Callback {
    public final /* synthetic */ C66523Lt A00;

    public AnonymousClass37Y(C66523Lt r1) {
        this.A00 = r1;
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            Log.i("MessageHandler/reconnect");
            this.A00.A08(message.arg1);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.A00.A0g.Bjm();
            return true;
        }
    }
}
