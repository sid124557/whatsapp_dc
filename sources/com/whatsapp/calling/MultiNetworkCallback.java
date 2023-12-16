package com.whatsapp.calling;

import X.AnonymousClass35O;
import X.C71393c2;
import X.C71703cX;

public class MultiNetworkCallback {
    public final AnonymousClass35O provider;

    public void closeAlternativeSocket(boolean z) {
        AnonymousClass35O r3 = this.provider;
        r3.A07.execute(new C71703cX(r3, 10, z));
    }

    public void createAlternativeSocket(boolean z, boolean z2) {
        AnonymousClass35O r3 = this.provider;
        r3.A07.execute(new C71393c2(r3, 1, z2, z));
    }

    public MultiNetworkCallback(AnonymousClass35O r1) {
        this.provider = r1;
    }
}
