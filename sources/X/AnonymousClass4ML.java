package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.4ML  reason: invalid class name */
public final class AnonymousClass4ML extends Handler {
    public final /* synthetic */ AnonymousClass5OV A00;

    public void handleMessage(Message message) {
        C162457s7.A0J(message, 0);
        Object obj = message.obj;
        C162457s7.A0K(obj, "null cannot be cast to non-null type kotlin.Pair<kotlin.Int, kotlin.Int>");
        this.A00.A00(AnonymousClass001.A0K(((AnonymousClass3Z6) obj).second));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4ML(Looper looper, AnonymousClass5OV r2) {
        super(looper);
        this.A00 = r2;
    }
}
