package X;

import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.5jh  reason: invalid class name and case insensitive filesystem */
public class C112415jh implements AnonymousClass49P {
    public final C57162tC A00;

    public C112415jh(C57162tC r1) {
        this.A00 = r1;
    }

    public int BrE() {
        CallState currentCallState = Voip.getCurrentCallState();
        if (currentCallState != null && currentCallState != CallState.NONE) {
            return Voip.turnScreenShareOff();
        }
        Log.w("turnScreenSharingOff ignored as no call active");
        return 670007;
    }
}
