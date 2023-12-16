package X;

import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.5TY  reason: invalid class name */
public abstract class AnonymousClass5TY {
    public AnonymousClass7D1 A00;
    public boolean A01;

    public abstract void A01();

    public abstract void A02();

    public abstract boolean A03();

    public final void A00() {
        boolean A03 = A03();
        if (this.A01 != A03) {
            this.A01 = A03;
            C116085pi r3 = this.A00.A00;
            C18260x0.A1R(AnonymousClass001.A0o(), "voip/audio_route/HeadsetMonitor ", r3);
            CallInfo callInfo = Voip.getCallInfo();
            if (callInfo == null || callInfo.callState == CallState.NONE) {
                Log.e("voip/audio_route/headsetPlugReceiver ignored, not in any call");
                return;
            }
            r3.A09(callInfo, (Boolean) null);
            if (A03) {
                r3.A04 = true;
                Log.i("voip/audio_route/headset Plugged");
                if (r3.A00 == 1) {
                    r3.A07(callInfo);
                    r3.A0C(callInfo, false);
                    return;
                }
                return;
            }
            Log.i("voip/audio_route/headset Unplugged");
            r3.A08(callInfo, (Boolean) null);
        }
    }
}
