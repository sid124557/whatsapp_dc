package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.1OQ  reason: invalid class name */
public final class AnonymousClass1OQ extends C30871nL {
    public List A00 = C72023d3.A00;

    public AnonymousClass1OQ(AnonymousClass2z0 r2, String str, long j) {
        super(r2, (byte) 84, j);
        this.A00 = str;
    }

    public final void A1v(List list) {
        AnonymousClass8U9 r4 = new AnonymousClass8U9();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C51432jo r1 = (C51432jo) it.next();
            C207419d r2 = (C207419d) C21611Cm.DEFAULT_INSTANCE.A0G();
            r2.A09(r1.A01);
            AnonymousClass1AT r0 = r1.A00;
            if (r0 != null) {
                C21611Cm r12 = (C21611Cm) C18320x8.A0C(r2);
                r12.placeholderMessageResendResponse_ = r0;
                r12.bitField0_ |= 8;
            }
            C18320x8.A1B(r2, r4);
        }
        this.A00 = C159507lx.A0h(r4);
    }
}
