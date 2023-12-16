package X;

import com.whatsapp.jid.UserJid;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.7SV  reason: invalid class name */
public final class AnonymousClass7SV {
    public final C54712pA A00;
    public final ConcurrentHashMap A01 = AnonymousClass0x9.A1D();

    public final void A00(UserJid userJid, int i) {
        Number number = (Number) C18290x4.A0j(this.A01, i);
        if (number != null) {
            this.A00.A01(new AnonymousClass2QO(userJid, (String) null, false, false), number.intValue(), i);
        }
    }

    public AnonymousClass7SV(C54712pA r2) {
        this.A00 = r2;
    }
}
