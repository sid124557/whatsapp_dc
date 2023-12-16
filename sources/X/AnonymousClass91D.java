package X;

import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.91D  reason: invalid class name */
public class AnonymousClass91D implements C185958uW {
    public Object A00;
    public final int A01;

    public AnonymousClass91D(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public /* synthetic */ void BO1(AnonymousClass3ZF r3) {
        if (2 - this.A01 == 0) {
            Log.i("voip/VoipActivityV2/onCallEnded");
            VoipActivityV2 voipActivityV2 = (VoipActivityV2) this.A00;
            if (!voipActivityV2.A0e.A00) {
                Log.i("voip/VoipActivityV2/finishActivity Finishing");
                voipActivityV2.finish();
            }
        }
    }

    public /* synthetic */ void BO8(AnonymousClass3ZF r3, boolean z) {
        if (2 - this.A01 == 0) {
            Log.i("voip/VoipActivityV2/onCallMissed");
            VoipActivityV2 voipActivityV2 = (VoipActivityV2) this.A00;
            if (!voipActivityV2.A0e.A00) {
                Log.i("voip/VoipActivityV2/finishActivity Finishing");
                voipActivityV2.finish();
            }
        }
    }

    public /* synthetic */ void BOB(AnonymousClass3ZF r1) {
    }

    public void Bbe() {
        switch (this.A01) {
            case 0:
                Log.i("CameraUi/onShowingIncomingCallUI");
                AnonymousClass5ZS r1 = (AnonymousClass5ZS) this.A00;
                if (r1.A0Q()) {
                    r1.A0W = false;
                    r1.A0O(r1.A0I.A02());
                    return;
                }
                return;
            case 1:
                Log.i("ptvcameraui/onShowingIncomingCallUI");
                C106735a4 r12 = (C106735a4) this.A00;
                if (r12.A0D()) {
                    r12.A0B(false, false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void BOC(C95814uZ r1, CallState callState, String str) {
    }

    public /* synthetic */ void BO9(long j, boolean z, boolean z2, boolean z3, boolean z4) {
    }
}
