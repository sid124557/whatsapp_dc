package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* renamed from: X.0y9  reason: invalid class name and case insensitive filesystem */
public class C18720y9 extends Handler {
    public final /* synthetic */ C52852m9 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18720y9(Looper looper, C52852m9 r2) {
        super(looper);
        this.A00 = r2;
    }

    public void dispatchMessage(Message message) {
        long uptimeMillis = SystemClock.uptimeMillis();
        super.dispatchMessage(message);
        long A0A = C18310x6.A0A(uptimeMillis);
        if (A0A > 1000) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("AsyncCommitManager/dispatching id: ");
            A0o.append(message.arg1);
            A0o.append(" msg:");
            A0o.append(message.getCallback());
            C18260x0.A12(" took:", A0o, A0A);
        }
    }
}
