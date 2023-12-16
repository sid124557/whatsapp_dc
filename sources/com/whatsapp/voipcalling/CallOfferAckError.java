package com.whatsapp.voipcalling;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass32Y;
import X.C626936e;
import com.whatsapp.jid.UserJid;

public class CallOfferAckError {
    public final int errorCode;
    public final UserJid errorJid;

    public CallOfferAckError(String str, int i) {
        UserJid A08 = AnonymousClass32Y.A08(str);
        C626936e.A06(A08);
        this.errorJid = A08;
        this.errorCode = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CallOfferAckError {errorJid=");
        A0o.append(this.errorJid);
        A0o.append(", errorCode=");
        A0o.append(this.errorCode);
        return AnonymousClass000.A0d(A0o);
    }
}
