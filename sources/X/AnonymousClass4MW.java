package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.4MW  reason: invalid class name */
public class AnonymousClass4MW extends Handler {
    public final /* synthetic */ C60312yL A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MW(Looper looper, C60312yL r2) {
        super(looper);
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        this.A00.A00();
    }
}
