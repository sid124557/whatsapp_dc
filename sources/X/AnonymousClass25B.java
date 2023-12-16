package X;

import com.whatsapp.bonsai.sync.discovery.DiscoveryBots;
import java.util.Collection;
import java.util.List;

/* renamed from: X.25B  reason: invalid class name */
public final class AnonymousClass25B {
    public static final Collection A00(DiscoveryBots discoveryBots) {
        if (discoveryBots == null) {
            return C72023d3.A00;
        }
        List<AnonymousClass2l5> list = discoveryBots.A02;
        List A0p = AnonymousClass8UF.A0p(discoveryBots.A01);
        for (AnonymousClass2l5 r0 : list) {
            C73743g0.A0W(r0.A02, A0p);
        }
        return A0p;
    }
}
