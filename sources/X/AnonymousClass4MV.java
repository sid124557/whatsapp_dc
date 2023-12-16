package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.4MV  reason: invalid class name */
public class AnonymousClass4MV extends Handler {
    public final /* synthetic */ C29011i8 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MV(Looper looper, C29011i8 r2) {
        super(looper);
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        super.handleMessage(message);
        if (message.what == 0) {
            this.A00.A0E();
        }
    }
}
