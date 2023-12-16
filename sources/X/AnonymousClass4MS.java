package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.registration.RegisterName;

/* renamed from: X.4MS  reason: invalid class name */
public class AnonymousClass4MS extends Handler {
    public final /* synthetic */ RegisterName A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MS(Looper looper, RegisterName registerName) {
        super(looper);
        this.A00 = registerName;
    }

    public void handleMessage(Message message) {
        this.A00.A7C();
    }
}
