package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.25X  reason: invalid class name */
public final class AnonymousClass25X {
    public static final void A00(AnonymousClass1VX r3, C61132zl r4, AnonymousClass1kA r5, UserJid userJid, String str) {
        C162457s7.A0J(str, 0);
        C18260x0.A0c(r4, r5, userJid, r3);
        if (r3.A0Y(C58422vE.A02, 4725)) {
            List A02 = r5.A02();
            ArrayList A0s = AnonymousClass001.A0s();
            for (Object next : A02) {
                C18280x3.A17(((C53212mj) next).A02, userJid, next, A0s);
            }
            if (C73723fy.A04(A0s) != null) {
                r4.A03(str);
            }
        }
    }
}
