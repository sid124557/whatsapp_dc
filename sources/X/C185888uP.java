package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;

/* renamed from: X.8uP  reason: invalid class name and case insensitive filesystem */
public interface C185888uP {
    void BZ7(boolean z);

    void Bra(CallInfo callInfo, int i, boolean z);

    void BsG(CallInfo callInfo);

    void callStateChanged(CallState callState, CallInfo callInfo);

    void finish();

    void videoRenderStarted(UserJid userJid);
}
