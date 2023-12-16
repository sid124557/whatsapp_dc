package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.registration.profilecheckpoint.ProfileCheckpointRegisterName;

/* renamed from: X.4MU  reason: invalid class name */
public class AnonymousClass4MU extends Handler {
    public final /* synthetic */ ProfileCheckpointRegisterName A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MU(Looper looper, ProfileCheckpointRegisterName profileCheckpointRegisterName) {
        super(looper);
        this.A00 = profileCheckpointRegisterName;
    }

    public void handleMessage(Message message) {
        this.A00.A7B();
    }
}
