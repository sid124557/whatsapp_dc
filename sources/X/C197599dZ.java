package X;

import java.util.Map;

/* renamed from: X.9dZ  reason: invalid class name and case insensitive filesystem */
public final class C197599dZ implements AnonymousClass4DR {
    public /* bridge */ /* synthetic */ Object Bk2(Enum enumR, Object obj, Map map) {
        C133676hl r6 = (C133676hl) obj;
        AnonymousClass9K9 r5 = (AnonymousClass9K9) enumR;
        boolean A1Y = AnonymousClass0x2.A1Y(r6, r5);
        if (!(r6 instanceof AnonymousClass99D)) {
            return null;
        }
        int ordinal = r5.ordinal();
        if (ordinal == 0) {
            C166557yt r0 = ((AnonymousClass99D) r6).A02;
            if (r0 != null) {
                return r0.A00;
            }
            return null;
        } else if (ordinal == A1Y) {
            return ((AnonymousClass99D) r6).A03;
        } else {
            throw new C73153f1();
        }
    }

    public Class B3E() {
        return AnonymousClass9K9.class;
    }
}
