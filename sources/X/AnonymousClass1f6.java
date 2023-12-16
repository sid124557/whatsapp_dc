package X;

import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import org.json.JSONException;

/* renamed from: X.1f6  reason: invalid class name */
public class AnonymousClass1f6 extends AnonymousClass27S {
    public final C56972sr A00;
    public final C64773Ex A01;
    public final AnonymousClass5ZU A02;
    public final C40512Gr A03;
    public final C48672fH A04;
    public final AnonymousClass332 A05;

    public AnonymousClass2LB A00(C54742pD r14, CallInfo callInfo) {
        CallInfo callInfo2 = callInfo;
        if (callInfo != null) {
            try {
                CallState callState = callInfo.callState;
                return new AnonymousClass2LB("call_state_changed", C95794uX.A01(this.A00, this.A01, this.A02, this.A03, this.A04, this.A05, r14, callInfo2, callState));
            } catch (JSONException e) {
                Log.e("CallStateChangedEventFactory/createEvent", e);
            }
        }
        return null;
    }

    public AnonymousClass1f6(C56972sr r1, C64773Ex r2, AnonymousClass5ZU r3, C40512Gr r4, C48672fH r5, AnonymousClass332 r6) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
    }
}
