package X;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.6VW  reason: invalid class name */
public class AnonymousClass6VW extends C124806Dy {
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                throw AnonymousClass001.A0g("onResult");
            } catch (RuntimeException e) {
                throw e;
            }
        } else if (i != 2) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Don't know how to handle message: ");
            A0o.append(i);
            Log.wtf("BasePendingResult", A0o.toString(), new Exception());
        } else {
            ((BasePendingResult) message.obj).A07(Status.A0B);
        }
    }

    public AnonymousClass6VW(Looper looper) {
        super(looper);
    }

    public AnonymousClass6VW() {
        super(Looper.getMainLooper());
    }
}
