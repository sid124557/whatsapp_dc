package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.4MY  reason: invalid class name */
public class AnonymousClass4MY extends Handler {
    public final /* synthetic */ C112455jl A00;
    public final /* synthetic */ C56612sH A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MY(Looper looper, C112455jl r2, C56612sH r3) {
        super(looper);
        this.A00 = r2;
        this.A01 = r3;
    }

    public void handleMessage(Message message) {
        AnonymousClass4FS r1;
        int i;
        boolean z = true;
        if (message.what == 1) {
            C112455jl r4 = this.A00;
            C105825Wo r3 = r4.A0Z;
            C18260x0.A1R(AnonymousClass001.A0o(), "app/startOutgoingCall/WHAT_START_PENDING_INTENT ", r3);
            if (r3 != null) {
                long j = r4.A00;
                if (j > 0) {
                    r3.A01 = AnonymousClass0x7.A0E(j);
                }
                Boolean bool = (Boolean) message.obj;
                if (bool == null) {
                    z = false;
                }
                C626936e.A0D(z, "isRejoin is null");
                if (bool == null || !bool.booleanValue()) {
                    r1 = r4.A0X;
                    i = 24;
                } else {
                    if (r3.A07 != null) {
                        r1 = r4.A0X;
                        i = 23;
                    }
                    r4.A0Z = null;
                }
                C86644Kx.A1R(r1, r4, r3, i);
                r4.A0Z = null;
            }
        }
    }
}
