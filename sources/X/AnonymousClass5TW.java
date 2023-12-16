package X;

import com.whatsapp.R;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.5TW  reason: invalid class name */
public class AnonymousClass5TW {
    public boolean A01() {
        try {
            CallState currentCallState = Voip.getCurrentCallState();
            return (currentCallState == null || currentCallState == CallState.NONE || currentCallState == CallState.LINK || currentCallState == CallState.PRECALLING) ? false : true;
        } catch (UnsatisfiedLinkError e) {
            Log.e("unable to query for current call state", e);
            return false;
        }
    }

    public boolean A02() {
        try {
            return Voip.getCurrentCallState() == CallState.LINK;
        } catch (UnsatisfiedLinkError e) {
            Log.e("unable to query for current call state", e);
            return false;
        }
    }

    public boolean A03() {
        try {
            return Voip.getCurrentCallState() == CallState.NONE;
        } catch (UnsatisfiedLinkError e) {
            Log.e("unable to query for current call state", e);
            return true;
        }
    }

    public static void A00(C08310eF r1, AnonymousClass5TW r2) {
        if (!r2.A01()) {
            C107405bG.A08(r1.A0R(), R.color.f5nameremoved);
        }
    }

    public boolean A04() {
        CallInfo callInfo;
        if (!A01() || (callInfo = Voip.getCallInfo()) == null || !callInfo.videoEnabled) {
            return false;
        }
        return true;
    }
}
