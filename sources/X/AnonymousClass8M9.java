package X;

import com.facebook.msys.mci.Execution;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.8M9  reason: invalid class name */
public class AnonymousClass8M9 implements Runnable {
    public int A00;
    public final int A01;

    public AnonymousClass8M9(int i, int i2) {
        this.A01 = i2;
        if (i2 != 0) {
            this.A00 = i;
        } else {
            this.A00 = i;
        }
    }

    public void run() {
        int i = this.A01;
        int i2 = this.A00;
        switch (i) {
            case 0:
                Execution.nativeStartExecutor(i2);
                return;
            case 1:
                Voip.cancelVideoUpgrade(i2);
                return;
            case 2:
                Voip.notifyAudioRouteChange(i2);
                return;
            default:
                Voip.rejectVideoUpgrade(i2);
                return;
        }
    }
}
