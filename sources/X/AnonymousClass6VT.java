package X;

import android.os.Looper;
import android.os.Message;
import java.util.concurrent.locks.Lock;

/* renamed from: X.6VT  reason: invalid class name */
public final class AnonymousClass6VT extends C124806Dy {
    public final /* synthetic */ C127086Qo A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6VT(Looper looper, C127086Qo r2) {
        super(looper);
        this.A00 = r2;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C127086Qo r2 = this.A00;
            Lock lock = r2.A0J;
            lock.lock();
            try {
                if (r2.A08()) {
                    r2.A07();
                }
            } finally {
                lock.unlock();
            }
        } else if (i != 2) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Unknown message id: ");
            A0o.append(i);
            AnonymousClass6C7.A1A(A0o, "GoogleApiClientImpl");
        } else {
            C127086Qo.A00(this.A00);
        }
    }
}
