package X;

import java.util.Collection;
import java.util.EnumSet;

/* renamed from: X.7TU  reason: invalid class name */
public class AnonymousClass7TU {
    public C187038wL A00;
    public C157247hz A01;
    public Collection A02 = AnonymousClass001.A0s();
    public EnumSet A03 = EnumSet.noneOf(C141926wM.class);

    public AnonymousClass7TV A00() {
        C157247hz r3;
        C187038wL r4 = this.A00;
        if (r4 == null || (r3 = this.A01) == null) {
            C155917fj r0 = C155917fj.A01;
            if (r4 == null) {
                r4 = new C170598Du();
                this.A00 = r4;
            }
            r3 = this.A01;
            if (r3 == null) {
                r3 = r0.A00;
                this.A01 = r3;
            }
        }
        return new AnonymousClass7TV(r4, r3, this.A02, this.A03);
    }
}
