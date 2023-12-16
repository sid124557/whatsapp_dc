package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.Executor;

/* renamed from: X.6Dn  reason: invalid class name and case insensitive filesystem */
public final class C124696Dn extends Handler {
    public final /* synthetic */ C158987ku A00;

    public void handleMessage(Message message) {
        C162457s7.A0J(message, 0);
        int i = message.what;
        if (i == 99) {
            this.A00.A00();
        } else if (i == 100) {
            this.A00.A02((C146727Bj) null, (Executor) null);
        } else {
            throw AnonymousClass002.A0E(AnonymousClass000.A0Y("Unknown message: ", AnonymousClass001.A0o(), i));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C124696Dn(Looper looper, C158987ku r2) {
        super(looper);
        this.A00 = r2;
    }
}
