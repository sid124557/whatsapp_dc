package com.whatsapp.voipcalling;

import X.AnonymousClass000;
import X.AnonymousClass001;

public class CallFatalError {
    public final int reasonCode;

    public CallFatalError(int i) {
        this.reasonCode = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CallFatalError {reasonCode=");
        A0o.append(this.reasonCode);
        return AnonymousClass000.A0d(A0o);
    }
}
