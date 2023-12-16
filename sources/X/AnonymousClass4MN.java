package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.util.Log;

/* renamed from: X.4MN  reason: invalid class name */
public class AnonymousClass4MN extends Handler {
    public final /* synthetic */ C113245l7 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MN(C113245l7 r2) {
        super(Looper.getMainLooper());
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        C113245l7 r2 = this.A00;
        if (r2.A2z.BH0() && !r2.A2z.getScreenLockStateProvider().A09()) {
            r2.A4U.A07();
            Log.d("conversation/statusbarrefresher/refresh");
            if (r2.A6d) {
                r2.A4U.A0D(false);
                Log.d("conversation/statusbarrefresher/statusbar/cancel");
            }
            r2.A6k = false;
            r2.A6d = true;
        }
    }
}
