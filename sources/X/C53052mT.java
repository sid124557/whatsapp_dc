package X;

import java.util.Map;

/* renamed from: X.2mT  reason: invalid class name and case insensitive filesystem */
public final class C53052mT {
    public final C42802Po A00;
    public final C60592yo A01;
    public final Map A02;
    public final Map A03;

    public C53052mT(C42802Po r2, C60592yo r3, Map map, Map map2) {
        C162457s7.A0J(map2, 4);
        this.A01 = r3;
        this.A03 = map;
        this.A00 = r2;
        this.A02 = map2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53052mT) {
                C53052mT r5 = (C53052mT) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A02, AnonymousClass000.A08(this.A00, AnonymousClass000.A08(this.A03, C18300x5.A04(this.A01))));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("StanzaConfig(connectionThreadRequests=");
        A0o.append(this.A01);
        A0o.append(", pendingServerRequests=");
        A0o.append(this.A03);
        A0o.append(", companionXmppReadInterceptor=");
        A0o.append(this.A00);
        A0o.append(", ackKickSeenIds=");
        return C18260x0.A04(this.A02, A0o);
    }
}
