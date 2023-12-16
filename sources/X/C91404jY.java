package X;

import android.telecom.CallAudioState;
import android.text.TextUtils;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.4jY  reason: invalid class name and case insensitive filesystem */
public class C91404jY extends C153457bL {
    public final /* synthetic */ C116085pi A00;
    public final /* synthetic */ C187958y5 A01;

    public C91404jY(C116085pi r1, C187958y5 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void A00(CallAudioState callAudioState, String str) {
        StringBuilder A0o = C86654Ky.A0o();
        A0o.append("voip/audio_route/selfManagedConnectionListener/onCallAudioStateChanged ");
        A0o.append(str);
        AnonymousClass001.A1M(A0o);
        C116085pi r3 = this.A00;
        A0o.append(Voip.A05(r3.A00));
        C18260x0.A1R(A0o, " -> ", callAudioState);
        CallInfo callInfo = Voip.getCallInfo();
        if (C627436k.A0O(callInfo) && TextUtils.equals(str, callInfo.callId)) {
            C626936e.A06(callInfo);
            C116085pi.A00(new C70183a5(this, 4, callInfo), r3);
        }
    }
}
