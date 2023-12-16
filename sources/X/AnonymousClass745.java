package X;

import com.whatsapp.voipcalling.CallState;

/* renamed from: X.745  reason: invalid class name */
public class AnonymousClass745 {
    public static boolean A00(AnonymousClass5XK r2) {
        CallState callState = r2.A07;
        if (callState == CallState.PRE_ACCEPT_RECEIVED || callState == CallState.CALLING || callState == CallState.RECEIVED_CALL || callState == CallState.REJOINING || callState == CallState.ACCEPT_SENT || callState == CallState.PRECALLING) {
            return true;
        }
        return false;
    }
}
