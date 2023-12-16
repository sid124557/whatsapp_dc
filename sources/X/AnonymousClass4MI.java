package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.4MI  reason: invalid class name */
public class AnonymousClass4MI extends Handler {
    public final /* synthetic */ AnonymousClass5ZF A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MI(Looper looper, AnonymousClass5ZF r2) {
        super(looper);
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        AnonymousClass4CE r0 = this.A00.A02;
        if (r0 != null) {
            r0.BNH();
            sendEmptyMessageDelayed(0, (long) AnonymousClass5ZF.A0Y);
        }
    }
}
