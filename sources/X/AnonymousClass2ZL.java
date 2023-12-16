package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2ZL  reason: invalid class name */
public final class AnonymousClass2ZL {
    public final C56612sH A00;
    public final C183538qC A01;
    public final AnonymousClass66R A02 = C154517dI.A01(new C76803sN(this));

    public final void A00() {
        AnonymousClass5HE r5 = (AnonymousClass5HE) this.A01.get();
        Map A10 = AnonymousClass0x7.A10(this.A02);
        LinkedHashMap A0r = C18320x8.A0r();
        Iterator A0q = AnonymousClass000.A0q(A10);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            if (C18310x6.A1X((Collection) A0w.getValue())) {
                C18270x1.A1N(A0r, A0w);
            }
        }
        ArrayList A0I = AnonymousClass002.A0I(A0r.size());
        Iterator A0q2 = AnonymousClass000.A0q(A0r);
        while (A0q2.hasNext()) {
            Map.Entry A0w2 = AnonymousClass001.A0w(A0q2);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(C18310x6.A0q(A0w2));
            A0o.append(',');
            C18270x1.A1D(C73723fy.A09(",", (Iterable) A0w2.getValue()), A0o, A0I);
        }
        Set A0P = C73723fy.A0P(A0I);
        C162457s7.A0J(A0P, 0);
        C18300x5.A15(C18270x1.A04(r5.A01), "battery:wake_ups_time", A0P);
    }

    public AnonymousClass2ZL(C56612sH r2, C183538qC r3) {
        C18260x0.A0Q(r2, r3);
        this.A00 = r2;
        this.A01 = r3;
    }
}
