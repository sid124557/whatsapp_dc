package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.020  reason: invalid class name */
public final class AnonymousClass020 extends Handler {
    public final Handler.Callback A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass020(Looper looper, Handler.Callback callback) {
        super(looper, new AnonymousClass0ZE(callback));
        C162457s7.A0J(looper, 1);
        this.A00 = callback;
    }

    public final void A00(Message message) {
        C162457s7.A0J(message, 0);
        if (C162457s7.A0P(Looper.myLooper(), getLooper())) {
            this.A00.handleMessage(message);
        } else {
            sendMessageAtFrontOfQueue(message);
        }
    }
}
