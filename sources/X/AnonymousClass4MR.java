package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.registration.RegisterName;

/* renamed from: X.4MR  reason: invalid class name */
public class AnonymousClass4MR extends Handler {
    public final /* synthetic */ RegisterName A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MR(Looper looper, RegisterName registerName) {
        super(looper);
        this.A00 = registerName;
    }

    public void handleMessage(Message message) {
        C71223bl r1 = RegisterName.A1m;
        if (r1 != null && r1.A03) {
            boolean z = r1.A04;
            int i = 1;
            RegisterName registerName = this.A00;
            if (z) {
                C89024bM r0 = registerName.A1D;
                if (r0 != null) {
                    r0.A00(1);
                    return;
                }
                return;
            }
            C621433s.A00(registerName, 0);
            int i2 = RegisterName.A1m.A00;
            if (i2 != 1) {
                if (i2 == 3) {
                    i = 109;
                } else {
                    return;
                }
            }
            C621433s.A01(registerName, i);
        }
    }
}
