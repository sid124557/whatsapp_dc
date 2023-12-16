package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.021  reason: invalid class name */
public class AnonymousClass021 extends Handler {
    public final /* synthetic */ C01940Cu A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass021(Looper looper, C01940Cu r2) {
        super(looper);
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        C01940Cu r0 = this.A00;
        AnonymousClass84O A01 = r0.A00;
        C152057Xj r2 = new C152057Xj();
        C153427bI A002 = r0.A02;
        r2.A05(A002, 0);
        C159377lj.A01(A002, A01, r2.A03(), (C835248t) message.obj);
    }
}
