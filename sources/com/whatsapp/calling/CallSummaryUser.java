package com.whatsapp.calling;

import X.AnonymousClass001;
import X.AnonymousClass4CY;
import com.whatsapp.jid.UserJid;

public class CallSummaryUser implements AnonymousClass4CY {
    public final UserJid jid;
    public final int state;

    public boolean isCallConnected() {
        return AnonymousClass001.A1T(this.state);
    }

    public CallSummaryUser(UserJid userJid, int i) {
        this.jid = userJid;
        this.state = i;
    }

    public UserJid getCallUserJid() {
        return this.jid;
    }
}
