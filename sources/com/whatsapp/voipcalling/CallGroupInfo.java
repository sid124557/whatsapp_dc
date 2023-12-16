package com.whatsapp.voipcalling;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C18320x8;

public final class CallGroupInfo {
    public final CallParticipant[] participants;
    public final int transactionId;

    public CallGroupInfo(int i, CallParticipant[] callParticipantArr) {
        this.transactionId = i;
        this.participants = callParticipantArr;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CallGroupInfo{transactionId=");
        A0o.append(this.transactionId);
        A0o.append(", participants=");
        C18320x8.A1P(A0o, this.participants);
        return AnonymousClass000.A0d(A0o);
    }
}
