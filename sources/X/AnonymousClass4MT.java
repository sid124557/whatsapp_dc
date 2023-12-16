package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.registration.profilecheckpoint.ProfileCheckpointRegisterName;

/* renamed from: X.4MT  reason: invalid class name */
public class AnonymousClass4MT extends Handler {
    public final /* synthetic */ ProfileCheckpointRegisterName A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MT(Looper looper, ProfileCheckpointRegisterName profileCheckpointRegisterName) {
        super(looper);
        this.A00 = profileCheckpointRegisterName;
    }

    public void handleMessage(Message message) {
        C71223bl r1 = ProfileCheckpointRegisterName.A1K;
        if (r1 != null && r1.A03) {
            boolean z = r1.A04;
            int i = 1;
            ProfileCheckpointRegisterName profileCheckpointRegisterName = this.A00;
            if (z) {
                C89034bN r0 = profileCheckpointRegisterName.A16;
                if (r0 != null) {
                    r0.A00(1);
                    return;
                }
                return;
            }
            C621433s.A00(profileCheckpointRegisterName, 0);
            int i2 = ProfileCheckpointRegisterName.A1K.A00;
            if (i2 != 1) {
                if (i2 == 3) {
                    i = 109;
                } else {
                    return;
                }
            }
            C621433s.A01(profileCheckpointRegisterName, i);
        }
    }
}
