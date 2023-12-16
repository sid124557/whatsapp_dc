package X;

import java.util.Iterator;

/* renamed from: X.4xg  reason: invalid class name and case insensitive filesystem */
public final class C97134xg extends C29451iq {
    public final void A08(C1000759i r8, Integer num, Integer num2, boolean z) {
        String str;
        Iterator A03 = C61102zi.A03(this);
        while (A03.hasNext()) {
            AnonymousClass5H6 r0 = (AnonymousClass5H6) A03.next();
            if (r0 != null) {
                C102765Ke r2 = r0.A00;
                if (z) {
                    C111135hb r1 = r2.A06;
                    r1.A06("is_account_linked", Boolean.TRUE);
                    r1.A05("SEE_LINKING_SUCCESS");
                    r1.A01();
                    AnonymousClass66O r02 = r2.A00;
                    if (r02 != null) {
                        r02.onSuccess();
                    }
                } else {
                    C111135hb r4 = r2.A06;
                    r4.A06("is_account_linked", Boolean.FALSE);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Error code: ");
                    A0o.append(num);
                    A0o.append(", error subcode: ");
                    A0o.append(num2);
                    A0o.append(", exception: ");
                    if (r8 != null) {
                        str = r8.getClass().getCanonicalName();
                    } else {
                        str = null;
                    }
                    r4.A07("SEE_LINKING_ERROR", AnonymousClass000.A0X(str, A0o));
                    AnonymousClass66O r03 = r2.A00;
                    if (r03 != null) {
                        r03.BSw(r8, num, num2);
                    }
                }
                r2.A00 = null;
            }
        }
    }
}
