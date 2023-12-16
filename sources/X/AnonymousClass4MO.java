package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.deeplink.DeepLinkActivity;

/* renamed from: X.4MO  reason: invalid class name */
public final class AnonymousClass4MO extends Handler {
    public final /* synthetic */ DeepLinkActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MO(Looper looper, DeepLinkActivity deepLinkActivity) {
        super(looper);
        this.A00 = deepLinkActivity;
        C626936e.A06(looper);
    }

    public void handleMessage(Message message) {
        int i = message.arg1;
        if (i != 0) {
            this.A00.BpA(0, i);
        }
    }
}
