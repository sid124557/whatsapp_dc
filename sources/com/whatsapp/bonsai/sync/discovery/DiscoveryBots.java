package com.whatsapp.bonsai.sync.discovery;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.C162457s7;
import X.C18270x1;
import X.C18300x5;
import X.C52822m6;
import java.util.List;

public final class DiscoveryBots {
    public final long A00;
    public final C52822m6 A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DiscoveryBots) {
                DiscoveryBots discoveryBots = (DiscoveryBots) obj;
                if (!C162457s7.A0P(this.A01, discoveryBots.A01) || !C162457s7.A0P(this.A02, discoveryBots.A02) || this.A00 != discoveryBots.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A00(AnonymousClass000.A08(this.A02, C18300x5.A04(this.A01)), this.A00);
    }

    public DiscoveryBots(C52822m6 r1, List list, long j) {
        this.A01 = r1;
        this.A02 = list;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DiscoveryBots(defaultBot=");
        A0o.append(this.A01);
        A0o.append(", sections=");
        A0o.append(this.A02);
        A0o.append(", timestampMs=");
        return C18270x1.A0U(A0o, this.A00);
    }
}
